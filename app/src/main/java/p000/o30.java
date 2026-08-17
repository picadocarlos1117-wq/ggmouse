package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o30 extends fi0 implements z41 {
    public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
    private static final o30 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int INCREMENT_FIELD_NUMBER = 3;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 5;
    private static volatile ec1 PARSER = null;
    public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
    public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
    private Object transformType_;
    private int transformTypeCase_ = 0;
    private String fieldPath_ = "";

    static {
        o30 o30Var = new o30();
        DEFAULT_INSTANCE = o30Var;
        fi0.registerDefaultInstance(o30.class, o30Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m4694f(o30 o30Var, C0783ja c0783ja) {
        o30Var.getClass();
        c0783ja.getClass();
        o30Var.transformType_ = c0783ja;
        o30Var.transformTypeCase_ = 6;
    }

    /* JADX INFO: renamed from: g */
    public static void m4695g(o30 o30Var, String str) {
        o30Var.getClass();
        str.getClass();
        o30Var.fieldPath_ = str;
    }

    /* JADX INFO: renamed from: h */
    public static void m4696h(o30 o30Var, C0783ja c0783ja) {
        o30Var.getClass();
        c0783ja.getClass();
        o30Var.transformType_ = c0783ja;
        o30Var.transformTypeCase_ = 7;
    }

    /* JADX INFO: renamed from: i */
    public static void m4697i(o30 o30Var) {
        o30Var.getClass();
        o30Var.transformType_ = Integer.valueOf(n30.REQUEST_TIME.getNumber());
        o30Var.transformTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: j */
    public static void m4698j(o30 o30Var, e52 e52Var) {
        o30Var.getClass();
        e52Var.getClass();
        o30Var.transformType_ = e52Var;
        o30Var.transformTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: q */
    public static m30 m4699q() {
        return (m30) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", e52.class, e52.class, e52.class, C0783ja.class, C0783ja.class});
            case 3:
                return new o30();
            case 4:
                return new m30(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (o30.class) {
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

    /* JADX INFO: renamed from: k */
    public final C0783ja m4700k() {
        return this.transformTypeCase_ == 6 ? (C0783ja) this.transformType_ : C0783ja.m3582i();
    }

    /* JADX INFO: renamed from: l */
    public final String m4701l() {
        return this.fieldPath_;
    }

    /* JADX INFO: renamed from: m */
    public final e52 m4702m() {
        return this.transformTypeCase_ == 3 ? (e52) this.transformType_ : e52.m2518t();
    }

    /* JADX INFO: renamed from: n */
    public final C0783ja m4703n() {
        return this.transformTypeCase_ == 7 ? (C0783ja) this.transformType_ : C0783ja.m3582i();
    }

    /* JADX INFO: renamed from: o */
    public final n30 m4704o() {
        int i = this.transformTypeCase_;
        n30 n30Var = n30.SERVER_VALUE_UNSPECIFIED;
        if (i == 2) {
            int iIntValue = ((Integer) this.transformType_).intValue();
            if (iIntValue != 0) {
                n30Var = iIntValue != 1 ? null : n30.REQUEST_TIME;
            }
            if (n30Var == null) {
                return n30.UNRECOGNIZED;
            }
        }
        return n30Var;
    }

    /* JADX INFO: renamed from: p */
    public final int m4705p() {
        int i = this.transformTypeCase_;
        if (i == 0) {
            return 7;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }
}
