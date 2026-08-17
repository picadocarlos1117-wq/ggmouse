package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 extends fi0 implements z41 {
    private static final b30 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private a30 document_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private ko0 targetIds_ = fi0.emptyIntList();
    private ko0 removedTargetIds_ = fi0.emptyIntList();

    static {
        b30 b30Var = new b30();
        DEFAULT_INSTANCE = b30Var;
        fi0.registerDefaultInstance(b30.class, b30Var);
    }

    /* JADX INFO: renamed from: f */
    public static b30 m831f() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 3:
                return new b30();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (b30.class) {
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
    public final ko0 m832g() {
        return this.removedTargetIds_;
    }

    public final a30 getDocument() {
        a30 a30Var = this.document_;
        return a30Var == null ? a30.m58i() : a30Var;
    }

    /* JADX INFO: renamed from: h */
    public final ko0 m833h() {
        return this.targetIds_;
    }
}
