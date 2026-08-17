package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 extends fi0 implements z41 {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final tw1 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER;
    private boolean allDescendants_;
    private String collectionId_ = "";

    static {
        tw1 tw1Var = new tw1();
        DEFAULT_INSTANCE = tw1Var;
        fi0.registerDefaultInstance(tw1.class, tw1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m6347f(tw1 tw1Var, String str) {
        tw1Var.getClass();
        str.getClass();
        tw1Var.collectionId_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m6348g(tw1 tw1Var) {
        tw1Var.allDescendants_ = true;
    }

    /* JADX INFO: renamed from: j */
    public static sw1 m6349j() {
        return (sw1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
            case 3:
                return new tw1();
            case 4:
                return new sw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (tw1.class) {
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
    public final boolean m6350h() {
        return this.allDescendants_;
    }

    /* JADX INFO: renamed from: i */
    public final String m6351i() {
        return this.collectionId_;
    }
}
