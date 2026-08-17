package p000;

/* JADX INFO: renamed from: th */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1443th extends fi0 implements z41 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C1443th DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile ec1 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private e30 mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private mo0 documents_ = fi0.emptyProtobufList();

    static {
        C1443th c1443th = new C1443th();
        DEFAULT_INSTANCE = c1443th;
        fi0.registerDefaultInstance(C1443th.class, c1443th);
    }

    /* JADX INFO: renamed from: f */
    public static void m6273f(C1443th c1443th, String str) {
        c1443th.getClass();
        str.getClass();
        c1443th.database_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m6274g(C1443th c1443th, String str) {
        c1443th.getClass();
        str.getClass();
        mo0 mo0Var = c1443th.documents_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            c1443th.documents_ = fi0.mutableCopy(mo0Var);
        }
        c1443th.documents_.add(str);
    }

    /* JADX INFO: renamed from: h */
    public static C1443th m6275h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C1406sh m6276i() {
        return (C1406sh) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", o22.class, x02.class});
            case 3:
                return new C1443th();
            case 4:
                return new C1406sh(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C1443th.class) {
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
