package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 extends fi0 implements z41 {
    private static final nw1 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER;
    private int bitField0_;
    private cx1 field_;

    static {
        nw1 nw1Var = new nw1();
        DEFAULT_INSTANCE = nw1Var;
        fi0.registerDefaultInstance(nw1.class, nw1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m4620f(nw1 nw1Var, cx1 cx1Var) {
        nw1Var.getClass();
        cx1Var.getClass();
        nw1Var.field_ = cx1Var;
        nw1Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: g */
    public static mw1 m4621g() {
        return (mw1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
            case 3:
                return new nw1();
            case 4:
                return new mw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (nw1.class) {
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
}
