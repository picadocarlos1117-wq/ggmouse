package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cn0 extends fi0 implements z41 {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final cn0 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER;
    private Object valueMode_;
    private int valueModeCase_ = 0;
    private String fieldPath_ = "";

    static {
        cn0 cn0Var = new cn0();
        DEFAULT_INSTANCE = cn0Var;
        fi0.registerDefaultInstance(cn0.class, cn0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m1251f(cn0 cn0Var, String str) {
        cn0Var.getClass();
        str.getClass();
        cn0Var.fieldPath_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m1252g(cn0 cn0Var, bn0 bn0Var) {
        cn0Var.getClass();
        cn0Var.valueMode_ = Integer.valueOf(bn0Var.getNumber());
        cn0Var.valueModeCase_ = 2;
    }

    /* JADX INFO: renamed from: h */
    public static void m1253h(cn0 cn0Var) {
        cn0Var.getClass();
        cn0Var.valueMode_ = Integer.valueOf(zm0.CONTAINS.getNumber());
        cn0Var.valueModeCase_ = 3;
    }

    /* JADX INFO: renamed from: l */
    public static an0 m1254l() {
        return (an0) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
            case 3:
                return new cn0();
            case 4:
                return new an0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (cn0.class) {
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
    public final String m1255i() {
        return this.fieldPath_;
    }

    /* JADX INFO: renamed from: j */
    public final bn0 m1256j() {
        int i = this.valueModeCase_;
        bn0 bn0Var = bn0.ORDER_UNSPECIFIED;
        if (i == 2) {
            int iIntValue = ((Integer) this.valueMode_).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    bn0Var = iIntValue != 2 ? null : bn0.DESCENDING;
                } else {
                    bn0Var = bn0.ASCENDING;
                }
            }
            if (bn0Var == null) {
                return bn0.UNRECOGNIZED;
            }
        }
        return bn0Var;
    }

    /* JADX INFO: renamed from: k */
    public final int m1257k() {
        int i = this.valueModeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }
}
