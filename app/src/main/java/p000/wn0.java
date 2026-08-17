package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wn0 extends fi0 implements z41 {
    private static final wn0 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        wn0 wn0Var = new wn0();
        DEFAULT_INSTANCE = wn0Var;
        fi0.registerDefaultInstance(wn0.class, wn0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m6811f(wn0 wn0Var, int i) {
        wn0Var.value_ = i;
    }

    /* JADX INFO: renamed from: g */
    public static wn0 m6812g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static vn0 m6813i() {
        return (vn0) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new wn0();
            case 4:
                return new vn0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (wn0.class) {
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
    public final int m6814h() {
        return this.value_;
    }
}
