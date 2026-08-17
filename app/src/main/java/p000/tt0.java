package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tt0 extends fi0 implements z41 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final tt0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile ec1 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private iy0 labels_ = iy0.f5198b;
    private String database_ = "";

    static {
        tt0 tt0Var = new tt0();
        DEFAULT_INSTANCE = tt0Var;
        fi0.registerDefaultInstance(tt0.class, tt0Var);
    }

    /* JADX INFO: renamed from: f */
    public static iy0 m6339f(tt0 tt0Var) {
        iy0 iy0Var = tt0Var.labels_;
        if (!iy0Var.f5199a) {
            tt0Var.labels_ = iy0Var.m3499c();
        }
        return tt0Var.labels_;
    }

    /* JADX INFO: renamed from: g */
    public static void m6340g(tt0 tt0Var, String str) {
        tt0Var.getClass();
        str.getClass();
        tt0Var.database_ = str;
    }

    /* JADX INFO: renamed from: h */
    public static void m6341h(tt0 tt0Var, iz1 iz1Var) {
        tt0Var.getClass();
        iz1Var.getClass();
        tt0Var.targetChange_ = iz1Var;
        tt0Var.targetChangeCase_ = 2;
    }

    /* JADX INFO: renamed from: i */
    public static void m6342i(tt0 tt0Var, int i) {
        tt0Var.targetChangeCase_ = 3;
        tt0Var.targetChange_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: j */
    public static tt0 m6343j() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static rt0 m6344k() {
        return (rt0) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", iz1.class, "labels_", st0.f10542a});
            case 3:
                return new tt0();
            case 4:
                return new rt0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (tt0.class) {
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
}
