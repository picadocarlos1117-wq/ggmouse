package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fx1 extends fi0 implements z41 {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final fx1 DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER = null;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;

    static {
        fx1 fx1Var = new fx1();
        DEFAULT_INSTANCE = fx1Var;
        fi0.registerDefaultInstance(fx1.class, fx1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m2863f(fx1 fx1Var, ax1 ax1Var) {
        fx1Var.getClass();
        ax1Var.getClass();
        fx1Var.filterType_ = ax1Var;
        fx1Var.filterTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static void m2864g(fx1 fx1Var, lx1 lx1Var) {
        fx1Var.getClass();
        lx1Var.getClass();
        fx1Var.filterType_ = lx1Var;
        fx1Var.filterTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: h */
    public static void m2865h(fx1 fx1Var, ww1 ww1Var) {
        fx1Var.getClass();
        ww1Var.getClass();
        fx1Var.filterType_ = ww1Var;
        fx1Var.filterTypeCase_ = 1;
    }

    /* JADX INFO: renamed from: j */
    public static fx1 m2866j() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static dx1 m2867n() {
        return (dx1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", ww1.class, ax1.class, lx1.class});
            case 3:
                return new fx1();
            case 4:
                return new dx1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (fx1.class) {
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
    public final ww1 m2868i() {
        return this.filterTypeCase_ == 1 ? (ww1) this.filterType_ : ww1.m6840h();
    }

    /* JADX INFO: renamed from: k */
    public final ax1 m2869k() {
        return this.filterTypeCase_ == 2 ? (ax1) this.filterType_ : ax1.m757i();
    }

    /* JADX INFO: renamed from: l */
    public final ex1 m2870l() {
        int i = this.filterTypeCase_;
        if (i == 0) {
            return ex1.f3476d;
        }
        if (i == 1) {
            return ex1.f3473a;
        }
        if (i == 2) {
            return ex1.f3474b;
        }
        if (i != 3) {
            return null;
        }
        return ex1.f3475c;
    }

    /* JADX INFO: renamed from: m */
    public final lx1 m2871m() {
        return this.filterTypeCase_ == 3 ? (lx1) this.filterType_ : lx1.m4322h();
    }
}
