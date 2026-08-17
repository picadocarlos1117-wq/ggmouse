package p000;

/* JADX INFO: renamed from: fi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0641fi extends fi0 implements z41 {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final C0641fi DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER;
    private AbstractC0753ik bitmap_ = AbstractC0753ik.f5042b;
    private int padding_;

    static {
        C0641fi c0641fi = new C0641fi();
        DEFAULT_INSTANCE = c0641fi;
        fi0.registerDefaultInstance(C0641fi.class, c0641fi);
    }

    /* JADX INFO: renamed from: g */
    public static C0641fi m2809g() {
        return DEFAULT_INSTANCE;
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 3:
                return new C0641fi();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C0641fi.class) {
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

    /* JADX INFO: renamed from: f */
    public final AbstractC0753ik m2810f() {
        return this.bitmap_;
    }

    /* JADX INFO: renamed from: h */
    public final int m2811h() {
        return this.padding_;
    }
}
