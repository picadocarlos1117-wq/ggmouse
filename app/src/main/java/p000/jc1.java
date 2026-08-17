package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jc1 {

    /* JADX INFO: renamed from: a */
    public static final vm0 f5363a;

    static {
        Object obj;
        Class<?> cls;
        vm0 vm0Var;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                vm0Var = (vm0) cls.asSubclass(vm0.class).getConstructor(bz1.class).newInstance(vm0.f11713a);
            } catch (Throwable th2) {
                obj = th2;
                vm0Var = null;
            }
        } else {
            vm0Var = null;
        }
        if (vm0Var != null) {
            f5363a = vm0Var;
        } else {
            f5363a = new vm0();
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, jc1.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3597a() {
        f5363a.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m3598b() {
        f5363a.getClass();
    }

    /* JADX INFO: renamed from: c */
    public static void m3599c() {
        f5363a.getClass();
    }
}
