package com.example.ssmousepro.injection;

import android.os.IBinder;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import p000.AbstractC1308pu;
import p000.AbstractC1414sp;
import p000.C1348qx;
import p000.ur0;
import p000.uy1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class MouseCursorWarper {
    private static final int MARGEM_FORA_TELA = 8000;
    private static final String TAG = "MouseCursorWarper";
    public static final MouseCursorWarper INSTANCE = new MouseCursorWarper();
    private static final ur0 inputManager$delegate = new uy1(new C1348qx(9));

    private MouseCursorWarper() {
    }

    private final boolean definirPonteiroViaSistema(float f, float f2) {
        if (definirViaInputManagerReflection(f, f2)) {
            return true;
        }
        return definirViaIInputManagerBinder(f, f2);
    }

    private final boolean definirViaIInputManagerBinder(float f, float f2) {
        Object objInvoke;
        try {
            Object objInvoke2 = Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "input");
            IBinder iBinder = objInvoke2 instanceof IBinder ? (IBinder) objInvoke2 : null;
            if (iBinder == null || (objInvoke = Class.forName("android.hardware.input.IInputManager$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)) == null) {
                return false;
            }
            String[] strArr = {"setMouseCursorPosition", "setMousePointerPosition"};
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                try {
                    Class<?> cls = objInvoke.getClass();
                    Class cls2 = Float.TYPE;
                    cls.getMethod(str, cls2, cls2).invoke(objInvoke, Float.valueOf(f), Float.valueOf(f2));
                    return true;
                } catch (Exception unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    private final boolean definirViaInputManagerReflection(float f, float f2) {
        Object inputManager = getInputManager();
        if (inputManager == null) {
            return false;
        }
        String[] strArr = {"setMouseCursorPosition", "setMousePointerPosition", "setPointerPosition"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            try {
                Class<?> cls = inputManager.getClass();
                Class cls2 = Float.TYPE;
                cls.getMethod(str, cls2, cls2).invoke(inputManager, Float.valueOf(f), Float.valueOf(f2));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private final boolean executarShell(String[] strArr) {
        try {
            return new ProcessBuilder((String[]) Arrays.copyOf(strArr, strArr.length)).redirectErrorStream(true).start().waitFor() == 0;
        } catch (Exception unused) {
        }
    }

    private final Object getInputManager() {
        return ((uy1) inputManager$delegate).m6544a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object inputManager_delegate$lambda$0() {
        try {
            return Class.forName("android.hardware.input.InputManager").getMethod("getInstance", null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void moverPonteiroSemJogo(String str, int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (definirPonteiroViaSistema(i3, i4)) {
            InjectionDiag.INSTANCE.warper(str, i3, i4, "reflection", false);
            return;
        }
        if (shellMouseMoveSync(i3, i4)) {
            InjectionDiag.INSTANCE.warper(str, i3, i4, "shell", false);
            return;
        }
        InjectionDiag.INSTANCE.warper(str, i3, i4, "falhou", false);
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("Não foi possível mover ponteiro (", i3, ",", i4, ") modo=");
        sbM5345l.append(str);
        Log.w(TAG, sbM5345l.toString());
    }

    private final boolean shellMouseMoveSync(int i, int i2) {
        String[] strArr = {"cmd", "input", "mouse", "move", String.valueOf(i), String.valueOf(i2)};
        String[] strArr2 = {"input", "mouse", "move", String.valueOf(i), String.valueOf(i2)};
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("cmd input mouse move ", i, " ", i2, " 2>/dev/null || input mouse move ");
        sbM5345l.append(i);
        sbM5345l.append(" ");
        sbM5345l.append(i2);
        Iterator it = AbstractC1414sp.m6124n0(strArr, strArr2, new String[]{"sh", "-c", sbM5345l.toString()}).iterator();
        while (it.hasNext()) {
            if (executarShell((String[]) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void congelarModoFps(int i, int i2) {
        moverPonteiroSemJogo("fps", i, i2, -8000, i2 + MARGEM_FORA_TELA);
    }

    public final void esconder(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        congelarModoFps(i, i2);
    }

    public final void restaurarCentro(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        moverPonteiroSemJogo("restore", i, i2, i / 2, i2 / 2);
    }

    public final void teleportarModoMao(int i, int i2) {
        moverPonteiroSemJogo("mao", i, i2, -8000, i2 + MARGEM_FORA_TELA);
    }

    public final void esconder() {
    }
}
