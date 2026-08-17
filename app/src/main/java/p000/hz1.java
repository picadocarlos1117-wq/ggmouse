package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends fi0 implements z41 {
    private static final hz1 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        hz1 hz1Var = new hz1();
        DEFAULT_INSTANCE = hz1Var;
        fi0.registerDefaultInstance(hz1.class, hz1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m3317f(hz1 hz1Var, mx1 mx1Var) {
        hz1Var.getClass();
        mx1Var.getClass();
        hz1Var.queryType_ = mx1Var;
        hz1Var.queryTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static void m3318g(hz1 hz1Var, String str) {
        hz1Var.getClass();
        str.getClass();
        hz1Var.parent_ = str;
    }

    /* JADX INFO: renamed from: h */
    public static hz1 m3319h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static gz1 m3320k() {
        return (gz1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: l */
    public static gz1 m3321l(hz1 hz1Var) {
        return (gz1) DEFAULT_INSTANCE.createBuilder(hz1Var);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", mx1.class});
            case 3:
                return new hz1();
            case 4:
                return new gz1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (hz1.class) {
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
    public final String m3322i() {
        return this.parent_;
    }

    /* JADX INFO: renamed from: j */
    public final mx1 m3323j() {
        return this.queryTypeCase_ == 2 ? (mx1) this.queryType_ : mx1.m4470l();
    }
}
