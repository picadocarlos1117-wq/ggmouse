package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 extends fi0 implements z41 {
    private static final hx1 DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER;
    private int bitField0_;
    private int direction_;
    private cx1 field_;

    static {
        hx1 hx1Var = new hx1();
        DEFAULT_INSTANCE = hx1Var;
        fi0.registerDefaultInstance(hx1.class, hx1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m3312f(hx1 hx1Var, cx1 cx1Var) {
        hx1Var.getClass();
        cx1Var.getClass();
        hx1Var.field_ = cx1Var;
        hx1Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m3313g(hx1 hx1Var, xw1 xw1Var) {
        hx1Var.getClass();
        hx1Var.direction_ = xw1Var.getNumber();
    }

    /* JADX INFO: renamed from: j */
    public static gx1 m3314j() {
        return (gx1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
            case 3:
                return new hx1();
            case 4:
                return new gx1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (hx1.class) {
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

    /* JADX INFO: renamed from: h */
    public final xw1 m3315h() {
        xw1 xw1Var;
        int i = this.direction_;
        if (i == 0) {
            xw1Var = xw1.DIRECTION_UNSPECIFIED;
        } else if (i != 1) {
            xw1Var = i != 2 ? null : xw1.DESCENDING;
        } else {
            xw1Var = xw1.ASCENDING;
        }
        return xw1Var == null ? xw1.UNRECOGNIZED : xw1Var;
    }

    /* JADX INFO: renamed from: i */
    public final cx1 m3316i() {
        cx1 cx1Var = this.field_;
        return cx1Var == null ? cx1.m2133g() : cx1Var;
    }
}
