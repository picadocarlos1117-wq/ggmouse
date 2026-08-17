package p000;

/* JADX INFO: renamed from: yj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1630yj extends fi0 implements z41 {
    private static final C1630yj DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        C1630yj c1630yj = new C1630yj();
        DEFAULT_INSTANCE = c1630yj;
        fi0.registerDefaultInstance(C1630yj.class, c1630yj);
    }

    /* JADX INFO: renamed from: f */
    public static void m7082f(C1630yj c1630yj, String str) {
        c1630yj.getClass();
        str.getClass();
        c1630yj.parent_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m7083g(C1630yj c1630yj, mx1 mx1Var) {
        c1630yj.getClass();
        mx1Var.getClass();
        c1630yj.queryType_ = mx1Var;
        c1630yj.queryTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: h */
    public static void m7084h(C1630yj c1630yj, EnumC1593xj enumC1593xj) {
        c1630yj.getClass();
        c1630yj.limitType_ = enumC1593xj.getNumber();
    }

    /* JADX INFO: renamed from: l */
    public static C1556wj m7085l() {
        return (C1556wj) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: m */
    public static C1630yj m7086m(byte[] bArr) {
        return (C1630yj) fi0.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", mx1.class, "limitType_"});
            case 3:
                return new C1630yj();
            case 4:
                return new C1556wj(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C1630yj.class) {
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
    public final EnumC1593xj m7087i() {
        EnumC1593xj enumC1593xj;
        int i = this.limitType_;
        if (i != 0) {
            enumC1593xj = i != 1 ? null : EnumC1593xj.LAST;
        } else {
            enumC1593xj = EnumC1593xj.FIRST;
        }
        return enumC1593xj == null ? EnumC1593xj.UNRECOGNIZED : enumC1593xj;
    }

    /* JADX INFO: renamed from: j */
    public final String m7088j() {
        return this.parent_;
    }

    /* JADX INFO: renamed from: k */
    public final mx1 m7089k() {
        return this.queryTypeCase_ == 2 ? (mx1) this.queryType_ : mx1.m4470l();
    }
}
