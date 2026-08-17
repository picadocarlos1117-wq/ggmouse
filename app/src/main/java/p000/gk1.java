package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gk1 {

    /* JADX INFO: renamed from: a */
    public static final hk1 f4217a;

    static {
        hk1 hk1Var = null;
        try {
            hk1Var = (hk1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (hk1Var == null) {
            hk1Var = new hk1();
        }
        f4217a = hk1Var;
    }

    /* JADX INFO: renamed from: a */
    public static C1412sn m3006a(Class cls) {
        f4217a.getClass();
        return new C1412sn(cls);
    }
}
