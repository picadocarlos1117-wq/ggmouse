package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 extends fi0 implements z41 {
    private static final iz1 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile ec1 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private wn0 expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static {
        iz1 iz1Var = new iz1();
        DEFAULT_INSTANCE = iz1Var;
        fi0.registerDefaultInstance(iz1.class, iz1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m3517f(iz1 iz1Var, hz1 hz1Var) {
        iz1Var.getClass();
        hz1Var.getClass();
        iz1Var.targetType_ = hz1Var;
        iz1Var.targetTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static void m3518g(iz1 iz1Var, fz1 fz1Var) {
        iz1Var.getClass();
        fz1Var.getClass();
        iz1Var.targetType_ = fz1Var;
        iz1Var.targetTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: h */
    public static void m3519h(iz1 iz1Var, AbstractC0753ik abstractC0753ik) {
        iz1Var.getClass();
        abstractC0753ik.getClass();
        iz1Var.resumeTypeCase_ = 4;
        iz1Var.resumeType_ = abstractC0753ik;
    }

    /* JADX INFO: renamed from: i */
    public static void m3520i(iz1 iz1Var, x02 x02Var) {
        iz1Var.getClass();
        x02Var.getClass();
        iz1Var.resumeType_ = x02Var;
        iz1Var.resumeTypeCase_ = 11;
    }

    /* JADX INFO: renamed from: j */
    public static void m3521j(iz1 iz1Var, int i) {
        iz1Var.targetId_ = i;
    }

    /* JADX INFO: renamed from: k */
    public static void m3522k(iz1 iz1Var, wn0 wn0Var) {
        iz1Var.getClass();
        wn0Var.getClass();
        iz1Var.expectedCount_ = wn0Var;
        iz1Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: l */
    public static dz1 m3523l() {
        return (dz1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", hz1.class, fz1.class, "targetId_", "once_", x02.class, "expectedCount_"});
            case 3:
                return new iz1();
            case 4:
                return new dz1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (iz1.class) {
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
