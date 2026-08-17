package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rf1 extends fi0 implements z41 {
    private static final rf1 DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        rf1 rf1Var = new rf1();
        DEFAULT_INSTANCE = rf1Var;
        fi0.registerDefaultInstance(rf1.class, rf1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m5837f(rf1 rf1Var, boolean z) {
        rf1Var.conditionTypeCase_ = 1;
        rf1Var.conditionType_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g */
    public static void m5838g(rf1 rf1Var, x02 x02Var) {
        rf1Var.getClass();
        x02Var.getClass();
        rf1Var.conditionType_ = x02Var;
        rf1Var.conditionTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: i */
    public static rf1 m5839i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static qf1 m5840l() {
        return (qf1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", x02.class});
            case 3:
                return new rf1();
            case 4:
                return new qf1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (rf1.class) {
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
    public final int m5841h() {
        int i = this.conditionTypeCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5842j() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final x02 m5843k() {
        return this.conditionTypeCase_ == 2 ? (x02) this.conditionType_ : x02.m6857h();
    }
}
