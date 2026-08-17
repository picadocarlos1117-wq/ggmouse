package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 extends fi0 implements z41 {
    private static final ax1 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private cx1 field_;
    private int op_;
    private e52 value_;

    static {
        ax1 ax1Var = new ax1();
        DEFAULT_INSTANCE = ax1Var;
        fi0.registerDefaultInstance(ax1.class, ax1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m754f(ax1 ax1Var, cx1 cx1Var) {
        ax1Var.getClass();
        cx1Var.getClass();
        ax1Var.field_ = cx1Var;
        ax1Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m755g(ax1 ax1Var, zw1 zw1Var) {
        ax1Var.getClass();
        ax1Var.op_ = zw1Var.getNumber();
    }

    /* JADX INFO: renamed from: h */
    public static void m756h(ax1 ax1Var, e52 e52Var) {
        ax1Var.getClass();
        e52Var.getClass();
        ax1Var.value_ = e52Var;
        ax1Var.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: i */
    public static ax1 m757i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static yw1 m758m() {
        return (yw1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
            case 3:
                return new ax1();
            case 4:
                return new yw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (ax1.class) {
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

    /* JADX INFO: renamed from: j */
    public final cx1 m759j() {
        cx1 cx1Var = this.field_;
        return cx1Var == null ? cx1.m2133g() : cx1Var;
    }

    /* JADX INFO: renamed from: k */
    public final zw1 m760k() {
        zw1 zw1Var;
        switch (this.op_) {
            case 0:
                zw1Var = zw1.OPERATOR_UNSPECIFIED;
                break;
            case 1:
                zw1Var = zw1.LESS_THAN;
                break;
            case 2:
                zw1Var = zw1.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                zw1Var = zw1.GREATER_THAN;
                break;
            case 4:
                zw1Var = zw1.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                zw1Var = zw1.EQUAL;
                break;
            case 6:
                zw1Var = zw1.NOT_EQUAL;
                break;
            case 7:
                zw1Var = zw1.ARRAY_CONTAINS;
                break;
            case 8:
                zw1Var = zw1.IN;
                break;
            case 9:
                zw1Var = zw1.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                zw1Var = zw1.NOT_IN;
                break;
            default:
                zw1Var = null;
                break;
        }
        return zw1Var == null ? zw1.UNRECOGNIZED : zw1Var;
    }

    /* JADX INFO: renamed from: l */
    public final e52 m761l() {
        e52 e52Var = this.value_;
        return e52Var == null ? e52.m2518t() : e52Var;
    }
}
