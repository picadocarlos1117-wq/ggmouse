package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rr0 extends fi0 implements z41 {
    private static final rr0 DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER;
    private double latitude_;
    private double longitude_;

    static {
        rr0 rr0Var = new rr0();
        DEFAULT_INSTANCE = rr0Var;
        fi0.registerDefaultInstance(rr0.class, rr0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m5896f(rr0 rr0Var, double d) {
        rr0Var.latitude_ = d;
    }

    /* JADX INFO: renamed from: g */
    public static void m5897g(rr0 rr0Var, double d) {
        rr0Var.longitude_ = d;
    }

    /* JADX INFO: renamed from: h */
    public static rr0 m5898h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static qr0 m5899k() {
        return (qr0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // p000.fi0
    public final Object dynamicMethod(ei0 ei0Var, Object obj, Object obj2) {
        ec1 bi0Var;
        switch (ei0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 3:
                return new rr0();
            case 4:
                return new qr0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (rr0.class) {
                    try {
                        bi0Var = PARSER;
                        if (bi0Var == null) {
                            bi0Var = new bi0(DEFAULT_INSTANCE);
                            PARSER = bi0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bi0Var;
            default:
                lv1.m4291b();
                return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final double m5900i() {
        return this.latitude_;
    }

    /* JADX INFO: renamed from: j */
    public final double m5901j() {
        return this.longitude_;
    }
}
