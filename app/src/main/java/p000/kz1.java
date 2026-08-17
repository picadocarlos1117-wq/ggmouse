package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends fi0 implements z41 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final kz1 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ov1 cause_;
    private x02 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private ko0 targetIds_ = fi0.emptyIntList();
    private AbstractC0753ik resumeToken_ = AbstractC0753ik.f5042b;

    static {
        kz1 kz1Var = new kz1();
        DEFAULT_INSTANCE = kz1Var;
        fi0.registerDefaultInstance(kz1.class, kz1Var);
    }

    /* JADX INFO: renamed from: g */
    public static kz1 m4011g() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new kz1();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (kz1.class) {
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
    public final ov1 m4012f() {
        ov1 ov1Var = this.cause_;
        return ov1Var == null ? ov1.m5067g() : ov1Var;
    }

    public final x02 getReadTime() {
        x02 x02Var = this.readTime_;
        return x02Var == null ? x02.m6857h() : x02Var;
    }

    public final AbstractC0753ik getResumeToken() {
        return this.resumeToken_;
    }

    /* JADX INFO: renamed from: h */
    public final jz1 m4013h() {
        jz1 jz1Var;
        int i = this.targetChangeType_;
        if (i == 0) {
            jz1Var = jz1.NO_CHANGE;
        } else if (i == 1) {
            jz1Var = jz1.ADD;
        } else if (i == 2) {
            jz1Var = jz1.REMOVE;
        } else if (i != 3) {
            jz1Var = i != 4 ? null : jz1.RESET;
        } else {
            jz1Var = jz1.CURRENT;
        }
        return jz1Var == null ? jz1.UNRECOGNIZED : jz1Var;
    }

    /* JADX INFO: renamed from: i */
    public final int m4014i() {
        return this.targetIds_.size();
    }

    /* JADX INFO: renamed from: j */
    public final ko0 m4015j() {
        return this.targetIds_;
    }
}
