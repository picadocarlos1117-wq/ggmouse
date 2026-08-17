package p000;

/* JADX INFO: renamed from: uh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1480uh extends fi0 implements z41 {
    private static final C1480uh DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private x02 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private AbstractC0753ik transaction_ = AbstractC0753ik.f5042b;

    static {
        C1480uh c1480uh = new C1480uh();
        DEFAULT_INSTANCE = c1480uh;
        fi0.registerDefaultInstance(C1480uh.class, c1480uh);
    }

    /* JADX INFO: renamed from: f */
    public static C1480uh m6489f() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", a30.class, "transaction_", "readTime_"});
            case 3:
                return new C1480uh();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C1480uh.class) {
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
    public final a30 m6490g() {
        return this.resultCase_ == 1 ? (a30) this.result_ : a30.m58i();
    }

    public final x02 getReadTime() {
        x02 x02Var = this.readTime_;
        return x02Var == null ? x02.m6857h() : x02Var;
    }

    /* JADX INFO: renamed from: h */
    public final String m6491h() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    /* JADX INFO: renamed from: i */
    public final int m6492i() {
        int i = this.resultCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }
}
