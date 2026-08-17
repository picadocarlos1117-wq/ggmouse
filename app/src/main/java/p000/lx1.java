package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lx1 extends fi0 implements z41 {
    private static final lx1 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;

    static {
        lx1 lx1Var = new lx1();
        DEFAULT_INSTANCE = lx1Var;
        fi0.registerDefaultInstance(lx1.class, lx1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m4320f(lx1 lx1Var, kx1 kx1Var) {
        lx1Var.getClass();
        lx1Var.op_ = kx1Var.getNumber();
    }

    /* JADX INFO: renamed from: g */
    public static void m4321g(lx1 lx1Var, cx1 cx1Var) {
        lx1Var.getClass();
        cx1Var.getClass();
        lx1Var.operandType_ = cx1Var;
        lx1Var.operandTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: h */
    public static lx1 m4322h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static jx1 m4323k() {
        return (jx1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", cx1.class});
            case 3:
                return new lx1();
            case 4:
                return new jx1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (lx1.class) {
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
    public final cx1 m4324i() {
        return this.operandTypeCase_ == 2 ? (cx1) this.operandType_ : cx1.m2133g();
    }

    /* JADX INFO: renamed from: j */
    public final kx1 m4325j() {
        kx1 kx1Var;
        int i = this.op_;
        if (i == 0) {
            kx1Var = kx1.OPERATOR_UNSPECIFIED;
        } else if (i == 2) {
            kx1Var = kx1.IS_NAN;
        } else if (i == 3) {
            kx1Var = kx1.IS_NULL;
        } else if (i != 4) {
            kx1Var = i != 5 ? null : kx1.IS_NOT_NULL;
        } else {
            kx1Var = kx1.IS_NOT_NAN;
        }
        return kx1Var == null ? kx1.UNRECOGNIZED : kx1Var;
    }
}
