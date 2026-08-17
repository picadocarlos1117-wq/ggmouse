package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wb2 extends fi0 implements z41 {
    private static final wb2 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private mo0 transformResults_ = fi0.emptyProtobufList();
    private x02 updateTime_;

    static {
        wb2 wb2Var = new wb2();
        DEFAULT_INSTANCE = wb2Var;
        fi0.registerDefaultInstance(wb2.class, wb2Var);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", e52.class});
            case 3:
                return new wb2();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (wb2.class) {
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
    public final e52 m6745f(int i) {
        return (e52) this.transformResults_.get(i);
    }

    /* JADX INFO: renamed from: g */
    public final int m6746g() {
        return this.transformResults_.size();
    }

    /* JADX INFO: renamed from: h */
    public final x02 m6747h() {
        x02 x02Var = this.updateTime_;
        return x02Var == null ? x02.m6857h() : x02Var;
    }
}
