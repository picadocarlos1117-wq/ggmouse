package p000;

/* JADX INFO: renamed from: iq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0763iq extends fi0 implements z41 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final C0763iq DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private x02 commitTime_;
    private mo0 writeResults_ = fi0.emptyProtobufList();

    static {
        C0763iq c0763iq = new C0763iq();
        DEFAULT_INSTANCE = c0763iq;
        fi0.registerDefaultInstance(C0763iq.class, c0763iq);
    }

    /* JADX INFO: renamed from: g */
    public static C0763iq m3474g() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", wb2.class, "commitTime_"});
            case 3:
                return new C0763iq();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C0763iq.class) {
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
    public final x02 m3475f() {
        x02 x02Var = this.commitTime_;
        return x02Var == null ? x02.m6857h() : x02Var;
    }

    /* JADX INFO: renamed from: h */
    public final wb2 m3476h(int i) {
        return (wb2) this.writeResults_.get(i);
    }

    /* JADX INFO: renamed from: i */
    public final int m3477i() {
        return this.writeResults_.size();
    }
}
