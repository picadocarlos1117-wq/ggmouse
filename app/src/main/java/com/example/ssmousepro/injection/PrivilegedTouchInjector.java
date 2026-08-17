package com.example.ssmousepro.injection;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.InputDevice;
import android.view.InputEvent;
import android.view.MotionEvent;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import p000.AbstractC0609en;
import p000.AbstractC1064la;
import p000.AbstractC1279p1;
import p000.AbstractC1377rp;
import p000.AbstractC1599xp;
import p000.C1348qx;
import p000.RunnableC1059l5;
import p000.bc1;
import p000.gw1;
import p000.hp0;
import p000.p32;
import p000.q60;
import p000.rc2;
import p000.ri1;
import p000.ur0;
import p000.uy1;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PrivilegedTouchInjector {
    private static final int MAX_ACTIVE = 10;
    private static final int MAX_SLOTS = 20;
    private static final String TAG = "PrivilegedTouchInjector";
    private static final MotionEvent.PointerCoords[] coordsPool;
    private static final ur0 deviceId$delegate;
    private static volatile int displayIdAtivo;
    private static volatile boolean forcarWaitEmTodoInject;
    private static long gestureDownTime;
    private static final ur0 injectMethod$delegate;
    private static final ur0 inputManager$delegate;
    private static volatile int modoDiag;
    private static final TreeSet<Integer> pointerIdsLivres;
    private static final MotionEvent.PointerProperties[] propsPool;
    private static final ur0 setDisplayIdMethod$delegate;
    public static final PrivilegedTouchInjector INSTANCE = new PrivilegedTouchInjector();
    private static final Object lock = new Object();
    private static final TreeSet<Integer> activeIds = new TreeSet<>();
    private static final SparseArray<Finger> fingers = new SparseArray<>(20);
    private static final SparseArray<Integer> pointerIdPorPapel = new SparseArray<>(20);

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Finger {

        /* JADX INFO: renamed from: x */
        private float f1919x;

        /* JADX INFO: renamed from: y */
        private float f1920y;

        public Finger(float f, float f2) {
            this.f1919x = f;
            this.f1920y = f2;
        }

        public static /* synthetic */ Finger copy$default(Finger finger, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = finger.f1919x;
            }
            if ((i & 2) != 0) {
                f2 = finger.f1920y;
            }
            return finger.copy(f, f2);
        }

        public final float component1() {
            return this.f1919x;
        }

        public final float component2() {
            return this.f1920y;
        }

        public final Finger copy(float f, float f2) {
            return new Finger(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finger)) {
                return false;
            }
            Finger finger = (Finger) obj;
            return Float.compare(this.f1919x, finger.f1919x) == 0 && Float.compare(this.f1920y, finger.f1920y) == 0;
        }

        public final float getX() {
            return this.f1919x;
        }

        public final float getY() {
            return this.f1920y;
        }

        public int hashCode() {
            return Float.hashCode(this.f1920y) + (Float.hashCode(this.f1919x) * 31);
        }

        public final void setX(float f) {
            this.f1919x = f;
        }

        public final void setY(float f) {
            this.f1920y = f;
        }

        public String toString() {
            return "Finger(x=" + this.f1919x + ", y=" + this.f1920y + ")";
        }
    }

    static {
        TreeSet<Integer> treeSet = new TreeSet<>();
        AbstractC1599xp.m6946p0(p32.m5178l0(0, 10), treeSet);
        pointerIdsLivres = treeSet;
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[10];
        for (int i = 0; i < 10; i++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.toolType = 1;
            pointerPropertiesArr[i] = pointerProperties;
        }
        propsPool = pointerPropertiesArr;
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[10];
        for (int i2 = 0; i2 < 10; i2++) {
            pointerCoordsArr[i2] = new MotionEvent.PointerCoords();
        }
        coordsPool = pointerCoordsArr;
        inputManager$delegate = new uy1(new C1348qx(10));
        injectMethod$delegate = new uy1(new C1348qx(11));
        setDisplayIdMethod$delegate = new uy1(new C1348qx(12));
        deviceId$delegate = new uy1(new C1348qx(13));
        INSTANCE.iniciarPollDiagnostico();
    }

    private PrivilegedTouchInjector() {
    }

    private final void aplicarDisplay(MotionEvent motionEvent) {
        if (displayIdAtivo <= 0) {
            return;
        }
        try {
            Method setDisplayIdMethod = getSetDisplayIdMethod();
            if (setDisplayIdMethod != null) {
                setDisplayIdMethod.invoke(motionEvent, Integer.valueOf(displayIdAtivo));
            }
        } catch (Exception unused) {
        }
    }

    private final void cancelarProbe(Object obj, Method method, MotionEvent.PointerProperties[] pointerPropertiesArr, MotionEvent.PointerCoords[] pointerCoordsArr, long j) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j + 2, 3, 1, pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, deviceIdAtual(), 0, TouchPipeline.SOURCE_TOUCHSCREEN, 0);
        motionEventObtain.getClass();
        aplicarDisplay(motionEventObtain);
        try {
            Log.w(TAG, "Probe sem UP — cancelando: " + injetar(obj, method, motionEventObtain));
        } finally {
            motionEventObtain.recycle();
        }
    }

    private final int deviceIdAtual() {
        if (modoDiag == 4) {
            return 0;
        }
        return getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int deviceId_delegate$lambda$5() {
        return INSTANCE.escolherDeviceId();
    }

    private final boolean emitirLocked(int i) {
        Method injectMethod;
        TreeSet<Integer> treeSet;
        int size;
        Object inputManager = getInputManager();
        if (inputManager == null || (injectMethod = getInjectMethod()) == null || 1 > (size = (treeSet = activeIds).size()) || size >= 11) {
            return false;
        }
        Iterator<Integer> it = treeSet.iterator();
        it.getClass();
        int i2 = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Finger finger = fingers.get(iIntValue);
            if (finger == null) {
                return false;
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr = propsPool;
            MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr[i2];
            Integer num = pointerIdPorPapel.get(iIntValue);
            if (num == null) {
                return false;
            }
            pointerProperties.id = num.intValue();
            pointerPropertiesArr[i2].toolType = 1;
            MotionEvent.PointerCoords[] pointerCoordsArr = coordsPool;
            pointerCoordsArr[i2].clear();
            pointerCoordsArr[i2].x = finger.getX();
            pointerCoordsArr[i2].y = finger.getY();
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i2];
            pointerCoords.pressure = 1.0f;
            pointerCoords.size = TouchPipeline.SIZE;
            pointerCoords.touchMajor = 5.0f;
            pointerCoords.touchMinor = 5.0f;
            pointerCoords.toolMajor = 5.0f;
            pointerCoords.toolMinor = 5.0f;
            i2++;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Long lValueOf = Long.valueOf(gestureDownTime);
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(lValueOf != null ? lValueOf.longValue() : jUptimeMillis, jUptimeMillis, i, size, propsPool, coordsPool, 0, 0, 1.0f, 1.0f, deviceIdAtual(), 0, TouchPipeline.SOURCE_TOUCHSCREEN, 0);
        motionEventObtain.getClass();
        aplicarDisplay(motionEventObtain);
        try {
            boolean zInjetar = injetar(inputManager, injectMethod, motionEventObtain);
            motionEventObtain.recycle();
            return zInjetar;
        } catch (Throwable th) {
            try {
                Log.e(TAG, "Falha ao injetar action=" + i, th);
                return false;
            } finally {
                motionEventObtain.recycle();
            }
        }
    }

    private final int escolherDeviceId() {
        List listAsList;
        try {
            int[] deviceIds = InputDevice.getDeviceIds();
            deviceIds.getClass();
            Set setM4162w0 = AbstractC1064la.m4162w0(deviceIds);
            int i = 100;
            while (setM4162w0.contains(Integer.valueOf(i))) {
                i++;
            }
            if (setM4162w0.size() <= 1) {
                listAsList = AbstractC1377rp.m5879z0(setM4162w0);
            } else {
                Object[] array = setM4162w0.toArray(new Comparable[0]);
                Comparable[] comparableArr = (Comparable[]) array;
                comparableArr.getClass();
                if (comparableArr.length > 1) {
                    Arrays.sort(comparableArr);
                }
                array.getClass();
                listAsList = Arrays.asList(array);
                listAsList.getClass();
            }
            listAsList.toString();
            return i;
        } catch (Throwable th) {
            Log.w(TAG, "Sem lista de dispositivos, usando id padrão", th);
            return 6;
        }
    }

    private final int getDeviceId() {
        return ((Number) ((uy1) deviceId$delegate).m6544a()).intValue();
    }

    private final Method getInjectMethod() {
        return (Method) ((uy1) injectMethod$delegate).m6544a();
    }

    private final Object getInputManager() {
        return ((uy1) inputManager$delegate).m6544a();
    }

    private final Method getSetDisplayIdMethod() {
        return (Method) ((uy1) setDisplayIdMethod$delegate).m6544a();
    }

    private final void iniciarPollDiagnostico() {
        Thread thread = new Thread(new RunnableC1059l5(8));
        thread.setDaemon(true);
        thread.setName("sspro-diag");
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniciarPollDiagnostico$lambda$6() {
        while (true) {
            int iLerModoDiag = INSTANCE.lerModoDiag();
            if (iLerModoDiag != modoDiag) {
                modoDiag = iLerModoDiag;
                Log.w(TAG, "MODO DIAGNÓSTICO de injeção = " + iLerModoDiag);
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method injectMethod_delegate$lambda$3() {
        try {
            return Class.forName("android.hardware.input.InputManager").getMethod("injectInputEvent", InputEvent.class, Integer.TYPE);
        } catch (Throwable th) {
            Log.e(TAG, "injectInputEvent indisponível", th);
            return null;
        }
    }

    private final boolean injetar(Object obj, Method method, MotionEvent motionEvent) {
        boolean zM3214e = false;
        int i = 1;
        boolean z = motionEvent.getActionMasked() == 2;
        int i2 = modoDiag;
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            if (i2 == 3 && !z) {
                return true;
            }
        } else if (z) {
            return true;
        }
        if (!forcarWaitEmTodoInject && motionEvent.getActionMasked() == 2) {
            i = 0;
        }
        long jNanoTime = System.nanoTime();
        try {
            Object objInvoke = method.invoke(obj, motionEvent, Integer.valueOf(i));
            zM3214e = hp0.m3214e(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        InjectionMetrics.INSTANCE.onInject(motionEvent.getActionMasked(), zM3214e, System.nanoTime() - jNanoTime);
        return zM3214e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object inputManager_delegate$lambda$2() {
        try {
            return Class.forName("android.hardware.input.InputManager").getMethod("getInstance", null).invoke(null, null);
        } catch (Throwable th) {
            Log.e(TAG, "InputManager indisponível", th);
            return null;
        }
    }

    private final int lerModoDiag() {
        String strLerSettingGlobal = lerSettingGlobal("sspro_inject_modo");
        Integer numM3069z0 = strLerSettingGlobal != null ? gw1.m3069z0(strLerSettingGlobal) : null;
        return numM3069z0 != null ? numM3069z0.intValue() : hp0.m3214e(lerSettingGlobal("sspro_sem_inject"), "1") ? 1 : 0;
    }

    private final String lerSettingGlobal(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"settings", "get", "global", str});
            InputStream inputStream = processExec.getInputStream();
            inputStream.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, AbstractC0609en.f3387a), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
            try {
                String strM5163c0 = p32.m5163c0(bufferedReader);
                bufferedReader.close();
                String string = zv1.m7383W0(strM5163c0).toString();
                processExec.waitFor();
                if (string.length() <= 0 || hp0.m3214e(string, "null")) {
                    return null;
                }
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rc2.m5797n(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Log.w(TAG, "Falha ao ler " + str, th3);
            return null;
        }
    }

    private final void liberarExcetoLocked(Set<Integer> set) {
        Iterator it = new TreeSet((SortedSet) activeIds).descendingSet().iterator();
        it.getClass();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (!set.contains(num)) {
                TreeSet<Integer> treeSet = activeIds;
                emitirLocked(treeSet.size() != 1 ? (treeSet.headSet(num, false).size() << 8) | 6 : 1);
                num.getClass();
                soltarSlotLocked(num.intValue());
            }
        }
        if (activeIds.isEmpty()) {
            gestureDownTime = 0L;
        }
    }

    private final boolean moverLocked(int i, float f, float f2) {
        Finger finger;
        if (!activeIds.contains(Integer.valueOf(i)) || (finger = fingers.get(i)) == null) {
            return false;
        }
        finger.setX(f);
        finger.setY(f2);
        return emitirLocked(2);
    }

    private final boolean probeInjectComDeviceId(int i, int i2, int i3) throws Throwable {
        Method injectMethod;
        MotionEvent motionEvent;
        Object inputManager = getInputManager();
        boolean z = false;
        if (inputManager == null || (injectMethod = getInjectMethod()) == null) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = 0;
        pointerProperties.toolType = 1;
        MotionEvent.PointerProperties[] pointerPropertiesArr = {pointerProperties};
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = i;
        pointerCoords.y = i2;
        pointerCoords.pressure = 1.0f;
        pointerCoords.size = TouchPipeline.SIZE;
        pointerCoords.touchMajor = 5.0f;
        pointerCoords.touchMinor = 5.0f;
        pointerCoords.toolMajor = 5.0f;
        pointerCoords.toolMinor = 5.0f;
        MotionEvent.PointerCoords[] pointerCoordsArr = {pointerCoords};
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 1, pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, i3, 0, TouchPipeline.SOURCE_TOUCHSCREEN, 0);
        MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis, jUptimeMillis + 1, 1, 1, pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, i3, 0, TouchPipeline.SOURCE_TOUCHSCREEN, 0);
        motionEventObtain.getClass();
        aplicarDisplay(motionEventObtain);
        motionEventObtain2.getClass();
        aplicarDisplay(motionEventObtain2);
        try {
            boolean zInjetar = injetar(inputManager, injectMethod, motionEventObtain);
            boolean zInjetar2 = injetar(inputManager, injectMethod, motionEventObtain2);
            Process.myUid();
            if (!zInjetar || zInjetar2) {
                motionEvent = motionEventObtain;
            } else {
                motionEvent = motionEventObtain;
                try {
                    cancelarProbe(inputManager, injectMethod, pointerPropertiesArr, pointerCoordsArr, jUptimeMillis);
                } catch (Throwable th) {
                    th = th;
                    motionEvent.recycle();
                    motionEventObtain2.recycle();
                    throw th;
                }
            }
            if (zInjetar && zInjetar2) {
                z = true;
            }
            motionEvent.recycle();
            motionEventObtain2.recycle();
            return z;
        } catch (Throwable th2) {
            th = th2;
            motionEvent = motionEventObtain;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method setDisplayIdMethod_delegate$lambda$4() {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        try {
            return MotionEvent.class.getMethod("setDisplayId", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void soltarSlotLocked(int i) {
        activeIds.remove(Integer.valueOf(i));
        fingers.remove(i);
        SparseArray<Integer> sparseArray = pointerIdPorPapel;
        Integer num = sparseArray.get(i);
        if (num != null) {
            pointerIdsLivres.add(Integer.valueOf(num.intValue()));
        }
        sparseArray.remove(i);
    }

    public final void definirDisplayId(int i) {
        if (i < 0) {
            i = 0;
        }
        displayIdAtivo = i;
    }

    public final int displayIdAtual() {
        return displayIdAtivo;
    }

    public final boolean disponivel() {
        return (getInputManager() == null || getInjectMethod() == null) ? false : true;
    }

    public final boolean down(int i, float f, float f2) {
        boolean zEmitirLocked;
        synchronized (lock) {
            try {
                TreeSet<Integer> treeSet = activeIds;
                if (treeSet.contains(Integer.valueOf(i))) {
                    zEmitirLocked = INSTANCE.moverLocked(i, f, f2);
                } else {
                    int i2 = 0;
                    if (treeSet.size() >= 10) {
                        InjectionMetrics.INSTANCE.onMaxActiveReject();
                    } else {
                        Integer numPollFirst = pointerIdsLivres.pollFirst();
                        if (numPollFirst != null) {
                            boolean zIsEmpty = treeSet.isEmpty();
                            if (zIsEmpty) {
                                gestureDownTime = SystemClock.uptimeMillis();
                            }
                            treeSet.add(Integer.valueOf(i));
                            fingers.put(i, new Finger(f, f2));
                            pointerIdPorPapel.put(i, numPollFirst);
                            int size = treeSet.headSet(Integer.valueOf(i), false).size();
                            if (!zIsEmpty) {
                                i2 = (size << 8) | 5;
                            }
                            zEmitirLocked = INSTANCE.emitirLocked(i2);
                        }
                    }
                    zEmitirLocked = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zEmitirLocked;
    }

    public final boolean estaAtivo(int i) {
        boolean zContains;
        synchronized (lock) {
            zContains = activeIds.contains(Integer.valueOf(i));
        }
        return zContains;
    }

    public final boolean getForcarWaitEmTodoInject() {
        return forcarWaitEmTodoInject;
    }

    public final bc1 jitterDown(float f, float f2, int i) {
        if (i <= 0) {
            return new bc1(Float.valueOf(f), Float.valueOf(f2));
        }
        int i2 = -i;
        int i3 = i + 1;
        AbstractC1279p1 abstractC1279p1 = ri1.f10057b;
        return new bc1(Float.valueOf(f + abstractC1279p1.mo5485f(i2, i3)), Float.valueOf(f2 + abstractC1279p1.mo5485f(i2, i3)));
    }

    public final void liberarExceto(int... iArr) {
        iArr.getClass();
        synchronized (lock) {
            INSTANCE.liberarExcetoLocked(AbstractC1064la.m4162w0(iArr));
        }
    }

    public final void liberarTudo() {
        synchronized (lock) {
            INSTANCE.liberarExcetoLocked(q60.f9397a);
        }
    }

    public final boolean mover(int i, float f, float f2) {
        boolean zMoverLocked;
        synchronized (lock) {
            zMoverLocked = INSTANCE.moverLocked(i, f, f2);
        }
        return zMoverLocked;
    }

    public final boolean probeInject(int i, int i2) {
        if (probeInjectComDeviceId(i, i2, deviceIdAtual())) {
            return true;
        }
        if (deviceIdAtual() != 0) {
            return probeInjectComDeviceId(i, i2, 0);
        }
        return false;
    }

    public final void setForcarWaitEmTodoInject(boolean z) {
        forcarWaitEmTodoInject = z;
    }

    public final int toquesAtivos() {
        int size;
        synchronized (lock) {
            size = activeIds.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m1592up(int i) {
        boolean zEmitirLocked;
        synchronized (lock) {
            TreeSet<Integer> treeSet = activeIds;
            zEmitirLocked = false;
            if (treeSet.contains(Integer.valueOf(i))) {
                int size = treeSet.headSet(Integer.valueOf(i), false).size();
                int i2 = 1;
                if (treeSet.size() != 1) {
                    i2 = (size << 8) | 6;
                }
                PrivilegedTouchInjector privilegedTouchInjector = INSTANCE;
                zEmitirLocked = privilegedTouchInjector.emitirLocked(i2);
                privilegedTouchInjector.soltarSlotLocked(i);
                if (treeSet.isEmpty()) {
                    gestureDownTime = 0L;
                }
            }
        }
        return zEmitirLocked;
    }
}
