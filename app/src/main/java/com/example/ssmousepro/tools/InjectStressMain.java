package com.example.ssmousepro.tools;

import android.content.res.Resources;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.InputEvent;
import android.view.MotionEvent;
import com.example.ssmousepro.injection.InjectionProtocol;
import com.example.ssmousepro.injection.PrivilegedTouchInjector;
import com.example.ssmousepro.injection.TouchPipeline;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p000.AbstractC1308pu;
import p000.AbstractC1451tp;
import p000.C1101ma;
import p000.C1348qx;
import p000.co0;
import p000.gw1;
import p000.hp0;
import p000.hw1;
import p000.kc0;
import p000.ur0;
import p000.uy1;
import p000.w10;
import p000.x10;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class InjectStressMain {
    private static final int SOURCE_TOUCHSCREEN = 4098;
    private static final String TAG = "InjectStress";
    private static long downTime;
    private static boolean usarInjetorReal;
    public static final InjectStressMain INSTANCE = new InjectStressMain();
    private static final TreeSet<Integer> ativos = new TreeSet<>();
    private static final HashMap<Integer, Dedo> dedos = new HashMap<>();
    private static int devId = 100;
    private static final ur0 inputManager$delegate = new uy1(new C1348qx(1));
    private static final ur0 injectMethod$delegate = new uy1(new C1348qx(2));

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Dedo {

        /* JADX INFO: renamed from: x */
        private float f1921x;

        /* JADX INFO: renamed from: y */
        private float f1922y;

        public Dedo(float f, float f2) {
            this.f1921x = f;
            this.f1922y = f2;
        }

        public static /* synthetic */ Dedo copy$default(Dedo dedo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = dedo.f1921x;
            }
            if ((i & 2) != 0) {
                f2 = dedo.f1922y;
            }
            return dedo.copy(f, f2);
        }

        public final float component1() {
            return this.f1921x;
        }

        public final float component2() {
            return this.f1922y;
        }

        public final Dedo copy(float f, float f2) {
            return new Dedo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dedo)) {
                return false;
            }
            Dedo dedo = (Dedo) obj;
            return Float.compare(this.f1921x, dedo.f1921x) == 0 && Float.compare(this.f1922y, dedo.f1922y) == 0;
        }

        public final float getX() {
            return this.f1921x;
        }

        public final float getY() {
            return this.f1922y;
        }

        public int hashCode() {
            return Float.hashCode(this.f1922y) + (Float.hashCode(this.f1921x) * 31);
        }

        public final void setX(float f) {
            this.f1921x = f;
        }

        public final void setY(float f) {
            this.f1922y = f;
        }

        public String toString() {
            return "Dedo(x=" + this.f1921x + ", y=" + this.f1922y + ")";
        }
    }

    private InjectStressMain() {
    }

    private final void bootstrap() {
        try {
            Looper.prepareMainLooper();
        } catch (Throwable unused) {
        }
        try {
            Class.forName("android.app.ActivityThread").getDeclaredMethod("systemMain", null).invoke(null, null);
        } catch (Throwable th) {
            Log.w(TAG, "systemMain indisponível", th);
        }
    }

    private final void down(int i, float f, float f2) {
        if (usarInjetorReal) {
            PrivilegedTouchInjector.INSTANCE.down(i, f, f2);
            return;
        }
        TreeSet<Integer> treeSet = ativos;
        if (treeSet.contains(Integer.valueOf(i))) {
            return;
        }
        if (treeSet.isEmpty()) {
            downTime = SystemClock.uptimeMillis();
        }
        treeSet.add(Integer.valueOf(i));
        dedos.put(Integer.valueOf(i), new Dedo(f, f2));
        emitir(treeSet.size() != 1 ? (treeSet.headSet(Integer.valueOf(i), false).size() << 8) | 5 : 0);
    }

    private final void emitir(int i) {
        int size = ativos.size();
        if (size < 1) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[size];
        for (int i2 = 0; i2 < size; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[size];
        for (int i3 = 0; i3 < size; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        Iterator<Integer> it = ativos.iterator();
        it.getClass();
        int i4 = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Dedo dedo = dedos.get(Integer.valueOf(iIntValue));
            if (dedo == null) {
                return;
            }
            MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr[i4];
            pointerProperties.id = iIntValue;
            pointerProperties.toolType = 1;
            pointerCoordsArr[i4].x = dedo.getX();
            pointerCoordsArr[i4].y = dedo.getY();
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            pointerCoords.pressure = 1.0f;
            pointerCoords.size = TouchPipeline.SIZE;
            pointerCoords.touchMajor = 5.0f;
            pointerCoords.touchMinor = 5.0f;
            pointerCoords.toolMajor = 5.0f;
            pointerCoords.toolMinor = 5.0f;
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(downTime, SystemClock.uptimeMillis(), i, size, pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, devId, 0, 4098, 0);
        try {
            getInjectMethod().invoke(getInputManager(), motionEventObtain, Integer.valueOf(i == 2 ? 0 : 1));
            motionEventObtain.recycle();
        } catch (Throwable th) {
            try {
                Log.w(TAG, "inject falhou action=" + i, th);
            } finally {
                motionEventObtain.recycle();
            }
        }
    }

    private final Method getInjectMethod() {
        Object objM6544a = ((uy1) injectMethod$delegate).m6544a();
        objM6544a.getClass();
        return (Method) objM6544a;
    }

    private final Object getInputManager() {
        return ((uy1) inputManager$delegate).m6544a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method injectMethod_delegate$lambda$1() {
        return Class.forName("android.hardware.input.InputManager").getMethod("injectInputEvent", InputEvent.class, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object inputManager_delegate$lambda$0() throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Class.forName("android.hardware.input.InputManager").getMethod("getInstance", null).invoke(null, null);
        objInvoke.getClass();
        return objInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    public static final void main(String[] strArr) throws InterruptedException {
        Object M7377Q0;
        Integer numM3069z0;
        Integer numM3069z1;
        Integer numM3069z2;
        Integer numM3069z3;
        strArr.getClass();
        Map<String, String> map = INSTANCE.parse(strArr);
        String str = map.get("dev");
        devId = (str == null || (numM3069z3 = gw1.m3069z0(str)) == null) ? 100 : numM3069z3.intValue();
        String str2 = map.get("ids");
        if (str2 == null) {
            str2 = "2,19";
        }
        String[] strArr2 = {","};
        String str3 = strArr2[0];
        int i = 1;
        if (str3.length() == 0) {
            List listAsList = Arrays.asList(strArr2);
            listAsList.getClass();
            C1101ma c1101ma = new C1101ma(new x10(str2, new kc0(listAsList, 5)), i);
            M7377Q0 = new ArrayList(AbstractC1451tp.m6307o0(c1101ma));
            Iterator it = c1101ma.iterator();
            while (true) {
                w10 w10Var = (w10) it;
                if (!w10Var.hasNext()) {
                    break;
                }
                co0 co0Var = (co0) w10Var.next();
                co0Var.getClass();
                M7377Q0.add(str2.subSequence(co0Var.f1008a, co0Var.f1009b + 1).toString());
            }
        } else {
            M7377Q0 = zv1.m7377Q0(str2, str3);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((Iterable) M7377Q0).iterator();
        while (it2.hasNext()) {
            Integer numM3069z4 = gw1.m3069z0(zv1.m7383W0((String) it2.next()).toString());
            if (numM3069z4 != null) {
                arrayList.add(numM3069z4);
            }
        }
        String str4 = map.get("seg");
        int iIntValue = (str4 == null || (numM3069z2 = gw1.m3069z0(str4)) == null) ? 120 : numM3069z2.intValue();
        String str5 = map.get("hz");
        int iIntValue2 = (str5 == null || (numM3069z1 = gw1.m3069z0(str5)) == null) ? 60 : numM3069z1.intValue();
        String str6 = map.get("clique");
        int iIntValue3 = (str6 == null || (numM3069z0 = gw1.m3069z0(str6)) == null) ? InjectionProtocol.MOUSE_POLL_HZ_PADRAO : numM3069z0.intValue();
        usarInjetorReal = hp0.m3214e(map.get("real"), "1");
        InjectStressMain injectStressMain = INSTANCE;
        injectStressMain.bootstrap();
        int i2 = devId;
        StringBuilder sb = new StringBuilder("INICIO dev=");
        sb.append(i2);
        sb.append(" ids=");
        sb.append(arrayList);
        sb.append(" seg=");
        AbstractC1308pu.m5356w(sb, iIntValue, " hz=", iIntValue2, " clique=");
        sb.append(iIntValue3);
        sb.append("ms");
        Log.w(TAG, sb.toString());
        int i3 = devId;
        StringBuilder sb2 = new StringBuilder("INICIO dev=");
        sb2.append(i3);
        sb2.append(" ids=");
        sb2.append(arrayList);
        sb2.append(" seg=");
        AbstractC1308pu.m5356w(sb2, iIntValue, " hz=", iIntValue2, " clique=");
        System.out.println((Object) AbstractC1308pu.m5341h(sb2, iIntValue3, "ms"));
        int iIntValue4 = ((Number) (arrayList.size() > 0 ? arrayList.get(0) : 2)).intValue();
        int iIntValue5 = ((Number) (1 < arrayList.size() ? arrayList.get(1) : 19)).intValue();
        long j = 1000 / (iIntValue2 >= 1 ? iIntValue2 : 1);
        long jUptimeMillis = (((long) iIntValue) * 1000) + SystemClock.uptimeMillis();
        long j2 = iIntValue3;
        long jUptimeMillis2 = SystemClock.uptimeMillis() + j2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        float f = i4;
        float f2 = f * 0.5f;
        int i5 = displayMetrics.heightPixels;
        float f3 = i5;
        float f4 = f3 * 0.5f;
        float f5 = f * 0.2f;
        float f6 = f3 * 0.1f;
        System.out.println((Object) AbstractC1308pu.m5338e("tela=", i4, i5, "x"));
        injectStressMain.down(iIntValue4, f2, f4);
        double d = 0.0d;
        boolean z = false;
        int i6 = 0;
        while (SystemClock.uptimeMillis() < jUptimeMillis) {
            double d2 = d + 0.05d;
            InjectStressMain injectStressMain2 = INSTANCE;
            long j3 = jUptimeMillis2;
            injectStressMain2.mover(iIntValue4, (float) ((Math.sin(d2) * ((double) f5)) + ((double) f2)), (float) ((Math.cos(d2) * ((double) f6)) + ((double) f4)));
            int i7 = i6 + 1;
            long jUptimeMillis3 = SystemClock.uptimeMillis();
            if (jUptimeMillis3 >= j3) {
                if (z) {
                    injectStressMain2.m1595up(iIntValue5);
                } else {
                    injectStressMain2.down(iIntValue5, f2 * 1.2f, 1.2f * f4);
                }
                z = !z;
                i6 += 2;
                jUptimeMillis2 = jUptimeMillis3 + j2;
            } else {
                i6 = i7;
                jUptimeMillis2 = j3;
            }
            Thread.sleep(j);
            d = d2;
        }
        if (z) {
            INSTANCE.m1595up(iIntValue5);
        }
        INSTANCE.m1595up(iIntValue4);
        Log.w(TAG, "FIM eventos=" + i6);
        System.out.println((Object) ("FIM eventos=" + i6));
        System.exit(0);
    }

    private final void mover(int i, float f, float f2) {
        if (usarInjetorReal) {
            PrivilegedTouchInjector.INSTANCE.mover(i, f, f2);
            return;
        }
        Dedo dedo = dedos.get(Integer.valueOf(i));
        if (dedo == null) {
            return;
        }
        dedo.setX(f);
        dedo.setY(f2);
        emitir(2);
    }

    private final Map<String, String> parse(String[] strArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < strArr.length - 1; i += 2) {
            if (hw1.m3309D0(strArr[i], "--", false)) {
                map.put(zv1.m7376P0(strArr[i], "--"), strArr[i + 1]);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: up */
    private final void m1595up(int i) {
        if (usarInjetorReal) {
            PrivilegedTouchInjector.INSTANCE.m1592up(i);
            return;
        }
        TreeSet<Integer> treeSet = ativos;
        if (treeSet.contains(Integer.valueOf(i))) {
            emitir(treeSet.size() != 1 ? (treeSet.headSet(Integer.valueOf(i), false).size() << 8) | 6 : 1);
            treeSet.remove(Integer.valueOf(i));
            dedos.remove(Integer.valueOf(i));
        }
    }
}
