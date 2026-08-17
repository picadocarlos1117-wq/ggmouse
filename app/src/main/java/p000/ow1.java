package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ow1 extends fi0 implements z41 {
    public static final int ALIAS_FIELD_NUMBER = 7;
    public static final int AVG_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final ow1 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private Object operator_;
    private int operatorCase_ = 0;
    private String alias_ = "";

    static {
        ow1 ow1Var = new ow1();
        DEFAULT_INSTANCE = ow1Var;
        fi0.registerDefaultInstance(ow1.class, ow1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m5070f(ow1 ow1Var, lw1 lw1Var) {
        ow1Var.getClass();
        lw1Var.getClass();
        ow1Var.operator_ = lw1Var;
        ow1Var.operatorCase_ = 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m5071g(ow1 ow1Var, nw1 nw1Var) {
        ow1Var.getClass();
        nw1Var.getClass();
        ow1Var.operator_ = nw1Var;
        ow1Var.operatorCase_ = 2;
    }

    /* JADX INFO: renamed from: h */
    public static void m5072h(ow1 ow1Var, jw1 jw1Var) {
        ow1Var.getClass();
        jw1Var.getClass();
        ow1Var.operator_ = jw1Var;
        ow1Var.operatorCase_ = 3;
    }

    /* JADX INFO: renamed from: i */
    public static void m5073i(ow1 ow1Var, String str) {
        ow1Var.getClass();
        ow1Var.alias_ = str;
    }

    /* JADX INFO: renamed from: j */
    public static kw1 m5074j() {
        return (kw1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", lw1.class, nw1.class, jw1.class, "alias_"});
            case 3:
                return new ow1();
            case 4:
                return new kw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (ow1.class) {
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
