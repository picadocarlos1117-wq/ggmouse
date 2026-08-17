package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e52 extends fi0 implements z41 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final e52 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile ec1 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        e52 e52Var = new e52();
        DEFAULT_INSTANCE = e52Var;
        fi0.registerDefaultInstance(e52.class, e52Var);
    }

    /* JADX INFO: renamed from: C */
    public static d52 m2506C() {
        return (d52) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: f */
    public static void m2507f(e52 e52Var, x02 x02Var) {
        e52Var.getClass();
        x02Var.getClass();
        e52Var.valueType_ = x02Var;
        e52Var.valueTypeCase_ = 10;
    }

    /* JADX INFO: renamed from: g */
    public static void m2508g(e52 e52Var, String str) {
        e52Var.getClass();
        str.getClass();
        e52Var.valueTypeCase_ = 17;
        e52Var.valueType_ = str;
    }

    /* JADX INFO: renamed from: h */
    public static void m2509h(e52 e52Var, AbstractC0753ik abstractC0753ik) {
        e52Var.getClass();
        abstractC0753ik.getClass();
        e52Var.valueTypeCase_ = 18;
        e52Var.valueType_ = abstractC0753ik;
    }

    /* JADX INFO: renamed from: i */
    public static void m2510i(e52 e52Var, String str) {
        e52Var.getClass();
        str.getClass();
        e52Var.valueTypeCase_ = 5;
        e52Var.valueType_ = str;
    }

    /* JADX INFO: renamed from: j */
    public static void m2511j(e52 e52Var, rr0 rr0Var) {
        e52Var.getClass();
        rr0Var.getClass();
        e52Var.valueType_ = rr0Var;
        e52Var.valueTypeCase_ = 8;
    }

    /* JADX INFO: renamed from: k */
    public static void m2512k(C0783ja c0783ja, e52 e52Var) {
        e52Var.getClass();
        c0783ja.getClass();
        e52Var.valueType_ = c0783ja;
        e52Var.valueTypeCase_ = 9;
    }

    /* JADX INFO: renamed from: l */
    public static void m2513l(e52 e52Var, ny0 ny0Var) {
        e52Var.getClass();
        ny0Var.getClass();
        e52Var.valueType_ = ny0Var;
        e52Var.valueTypeCase_ = 6;
    }

    /* JADX INFO: renamed from: m */
    public static void m2514m(e52 e52Var) {
        e52Var.getClass();
        e52Var.valueType_ = Integer.valueOf(f91.NULL_VALUE.getNumber());
        e52Var.valueTypeCase_ = 11;
    }

    /* JADX INFO: renamed from: n */
    public static void m2515n(e52 e52Var, boolean z) {
        e52Var.valueTypeCase_ = 1;
        e52Var.valueType_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: o */
    public static void m2516o(e52 e52Var, long j) {
        e52Var.valueTypeCase_ = 2;
        e52Var.valueType_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: p */
    public static void m2517p(e52 e52Var, double d) {
        e52Var.valueTypeCase_ = 3;
        e52Var.valueType_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: t */
    public static e52 m2518t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final x02 m2519A() {
        return this.valueTypeCase_ == 10 ? (x02) this.valueType_ : x02.m6857h();
    }

    /* JADX INFO: renamed from: B */
    public final int m2520B() {
        int i = this.valueTypeCase_;
        if (i == 0) {
            return 12;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 6) {
            return 11;
        }
        if (i == 17) {
            return 6;
        }
        if (i == 18) {
            return 7;
        }
        switch (i) {
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 5;
            case 11:
                return 1;
            default:
                return 0;
        }
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", ny0.class, rr0.class, C0783ja.class, x02.class});
            case 3:
                return new e52();
            case 4:
                return new d52(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (e52.class) {
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

    /* JADX INFO: renamed from: q */
    public final C0783ja m2521q() {
        return this.valueTypeCase_ == 9 ? (C0783ja) this.valueType_ : C0783ja.m3582i();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2522r() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC0753ik m2523s() {
        return this.valueTypeCase_ == 18 ? (AbstractC0753ik) this.valueType_ : AbstractC0753ik.f5042b;
    }

    /* JADX INFO: renamed from: u */
    public final double m2524u() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: v */
    public final rr0 m2525v() {
        return this.valueTypeCase_ == 8 ? (rr0) this.valueType_ : rr0.m5898h();
    }

    /* JADX INFO: renamed from: w */
    public final long m2526w() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x */
    public final ny0 m2527x() {
        return this.valueTypeCase_ == 6 ? (ny0) this.valueType_ : ny0.m4623g();
    }

    /* JADX INFO: renamed from: y */
    public final String m2528y() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    /* JADX INFO: renamed from: z */
    public final String m2529z() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }
}
