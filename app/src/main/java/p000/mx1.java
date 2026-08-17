package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 extends fi0 implements z41 {
    private static final mx1 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile ec1 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C1309pv endAt_;
    private wn0 limit_;
    private int offset_;
    private ix1 select_;
    private C1309pv startAt_;
    private fx1 where_;
    private mo0 from_ = fi0.emptyProtobufList();
    private mo0 orderBy_ = fi0.emptyProtobufList();

    static {
        mx1 mx1Var = new mx1();
        DEFAULT_INSTANCE = mx1Var;
        fi0.registerDefaultInstance(mx1.class, mx1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m4464f(mx1 mx1Var, tw1 tw1Var) {
        mx1Var.getClass();
        tw1Var.getClass();
        mo0 mo0Var = mx1Var.from_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            mx1Var.from_ = fi0.mutableCopy(mo0Var);
        }
        mx1Var.from_.add(tw1Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m4465g(mx1 mx1Var, fx1 fx1Var) {
        mx1Var.getClass();
        fx1Var.getClass();
        mx1Var.where_ = fx1Var;
        mx1Var.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: h */
    public static void m4466h(mx1 mx1Var, hx1 hx1Var) {
        mx1Var.getClass();
        hx1Var.getClass();
        mo0 mo0Var = mx1Var.orderBy_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            mx1Var.orderBy_ = fi0.mutableCopy(mo0Var);
        }
        mx1Var.orderBy_.add(hx1Var);
    }

    /* JADX INFO: renamed from: i */
    public static void m4467i(mx1 mx1Var, C1309pv c1309pv) {
        mx1Var.getClass();
        c1309pv.getClass();
        mx1Var.startAt_ = c1309pv;
        mx1Var.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: j */
    public static void m4468j(mx1 mx1Var, C1309pv c1309pv) {
        mx1Var.getClass();
        c1309pv.getClass();
        mx1Var.endAt_ = c1309pv;
        mx1Var.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: k */
    public static void m4469k(mx1 mx1Var, wn0 wn0Var) {
        mx1Var.getClass();
        wn0Var.getClass();
        mx1Var.limit_ = wn0Var;
        mx1Var.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: l */
    public static mx1 m4470l() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static rw1 m4471y() {
        return (rw1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", tw1.class, "where_", "orderBy_", hx1.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 3:
                return new mx1();
            case 4:
                return new rw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (mx1.class) {
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

    /* JADX INFO: renamed from: m */
    public final C1309pv m4472m() {
        C1309pv c1309pv = this.endAt_;
        return c1309pv == null ? C1309pv.m5364i() : c1309pv;
    }

    /* JADX INFO: renamed from: n */
    public final tw1 m4473n() {
        return (tw1) this.from_.get(0);
    }

    /* JADX INFO: renamed from: o */
    public final int m4474o() {
        return this.from_.size();
    }

    /* JADX INFO: renamed from: p */
    public final wn0 m4475p() {
        wn0 wn0Var = this.limit_;
        return wn0Var == null ? wn0.m6812g() : wn0Var;
    }

    /* JADX INFO: renamed from: q */
    public final hx1 m4476q(int i) {
        return (hx1) this.orderBy_.get(i);
    }

    /* JADX INFO: renamed from: r */
    public final int m4477r() {
        return this.orderBy_.size();
    }

    /* JADX INFO: renamed from: s */
    public final C1309pv m4478s() {
        C1309pv c1309pv = this.startAt_;
        return c1309pv == null ? C1309pv.m5364i() : c1309pv;
    }

    /* JADX INFO: renamed from: t */
    public final fx1 m4479t() {
        fx1 fx1Var = this.where_;
        return fx1Var == null ? fx1.m2866j() : fx1Var;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4480u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4481v() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4482w() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4483x() {
        return (this.bitField0_ & 2) != 0;
    }
}
