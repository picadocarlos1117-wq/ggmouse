package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k30 extends fi0 implements z41 {
    private static final k30 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private x02 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private ko0 removedTargetIds_ = fi0.emptyIntList();

    static {
        k30 k30Var = new k30();
        DEFAULT_INSTANCE = k30Var;
        fi0.registerDefaultInstance(k30.class, k30Var);
    }

    /* JADX INFO: renamed from: f */
    public static k30 m3766f() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0004ဉ\u0000", new Object[]{"bitField0_", "document_", "removedTargetIds_", "readTime_"});
            case 3:
                return new k30();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (k30.class) {
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

    /* JADX INFO: renamed from: g */
    public final String m3767g() {
        return this.document_;
    }

    /* JADX INFO: renamed from: h */
    public final ko0 m3768h() {
        return this.removedTargetIds_;
    }
}
