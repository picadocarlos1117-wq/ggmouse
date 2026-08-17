package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p30 extends fi0 implements z41 {
    private static final p30 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER;
    private String document_ = "";
    private mo0 fieldTransforms_ = fi0.emptyProtobufList();

    static {
        p30 p30Var = new p30();
        DEFAULT_INSTANCE = p30Var;
        fi0.registerDefaultInstance(p30.class, p30Var);
    }

    /* JADX INFO: renamed from: f */
    public static p30 m5120f() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", o30.class});
            case 3:
                return new p30();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (p30.class) {
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
    public final mo0 m5121g() {
        return this.fieldTransforms_;
    }
}
