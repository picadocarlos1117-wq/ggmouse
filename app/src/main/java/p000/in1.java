package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class in1 extends fi0 implements z41 {
    private static final in1 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private x02 readTime_;
    private C0816k5 result_;
    private AbstractC0753ik transaction_ = AbstractC0753ik.f5042b;

    static {
        in1 in1Var = new in1();
        DEFAULT_INSTANCE = in1Var;
        fi0.registerDefaultInstance(in1.class, in1Var);
    }

    /* JADX INFO: renamed from: f */
    public static in1 m3458f() {
        return DEFAULT_INSTANCE;
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 3:
                return new in1();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (in1.class) {
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

    /* JADX INFO: renamed from: g */
    public final C0816k5 m3459g() {
        C0816k5 c0816k5 = this.result_;
        return c0816k5 == null ? C0816k5.m3792g() : c0816k5;
    }
}
