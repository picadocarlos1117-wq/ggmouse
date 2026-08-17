package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hn1 extends fi0 implements z41 {
    private static final hn1 DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    static {
        hn1 hn1Var = new hn1();
        DEFAULT_INSTANCE = hn1Var;
        fi0.registerDefaultInstance(hn1.class, hn1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m3182f(hn1 hn1Var, String str) {
        hn1Var.getClass();
        str.getClass();
        hn1Var.parent_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m3183g(hn1 hn1Var, qw1 qw1Var) {
        hn1Var.getClass();
        qw1Var.getClass();
        hn1Var.queryType_ = qw1Var;
        hn1Var.queryTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: h */
    public static hn1 m3184h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static gn1 m3185i() {
        return (gn1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", qw1.class, o22.class, x02.class});
            case 3:
                return new hn1();
            case 4:
                return new gn1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (hn1.class) {
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
