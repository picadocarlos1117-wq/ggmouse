package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vb2 extends fi0 implements z41 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final vb2 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private x02 commitTime_;
    private String streamId_ = "";
    private AbstractC0753ik streamToken_ = AbstractC0753ik.f5042b;
    private mo0 writeResults_ = fi0.emptyProtobufList();

    static {
        vb2 vb2Var = new vb2();
        DEFAULT_INSTANCE = vb2Var;
        fi0.registerDefaultInstance(vb2.class, vb2Var);
    }

    /* JADX INFO: renamed from: g */
    public static vb2 m6617g() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", wb2.class, "commitTime_"});
            case 3:
                return new vb2();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (vb2.class) {
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
    public final x02 m6618f() {
        x02 x02Var = this.commitTime_;
        return x02Var == null ? x02.m6857h() : x02Var;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0753ik m6619h() {
        return this.streamToken_;
    }

    /* JADX INFO: renamed from: i */
    public final wb2 m6620i(int i) {
        return (wb2) this.writeResults_.get(i);
    }

    /* JADX INFO: renamed from: j */
    public final int m6621j() {
        return this.writeResults_.size();
    }
}
