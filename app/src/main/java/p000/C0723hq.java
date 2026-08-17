package p000;

/* JADX INFO: renamed from: hq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0723hq extends fi0 implements z41 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0723hq DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private mo0 writes_ = fi0.emptyProtobufList();
    private AbstractC0753ik transaction_ = AbstractC0753ik.f5042b;

    static {
        C0723hq c0723hq = new C0723hq();
        DEFAULT_INSTANCE = c0723hq;
        fi0.registerDefaultInstance(C0723hq.class, c0723hq);
    }

    /* JADX INFO: renamed from: f */
    public static void m3237f(C0723hq c0723hq, String str) {
        c0723hq.getClass();
        str.getClass();
        c0723hq.database_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m3238g(C0723hq c0723hq, qb2 qb2Var) {
        c0723hq.getClass();
        qb2Var.getClass();
        mo0 mo0Var = c0723hq.writes_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            c0723hq.writes_ = fi0.mutableCopy(mo0Var);
        }
        c0723hq.writes_.add(qb2Var);
    }

    /* JADX INFO: renamed from: h */
    public static C0723hq m3239h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C0686gq m3240i() {
        return (C0686gq) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", qb2.class, "transaction_"});
            case 3:
                return new C0723hq();
            case 4:
                return new C0686gq(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C0723hq.class) {
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
