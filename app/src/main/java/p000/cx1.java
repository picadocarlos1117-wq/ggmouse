package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends fi0 implements z41 {
    private static final cx1 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER;
    private String fieldPath_ = "";

    static {
        cx1 cx1Var = new cx1();
        DEFAULT_INSTANCE = cx1Var;
        fi0.registerDefaultInstance(cx1.class, cx1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m2132f(cx1 cx1Var, String str) {
        cx1Var.getClass();
        str.getClass();
        cx1Var.fieldPath_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static cx1 m2133g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static bx1 m2134i() {
        return (bx1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
            case 3:
                return new cx1();
            case 4:
                return new bx1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (cx1.class) {
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
    public final String m2135h() {
        return this.fieldPath_;
    }
}
