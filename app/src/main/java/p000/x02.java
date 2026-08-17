package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x02 extends fi0 implements z41 {
    private static final x02 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        x02 x02Var = new x02();
        DEFAULT_INSTANCE = x02Var;
        fi0.registerDefaultInstance(x02.class, x02Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m6855f(x02 x02Var, long j) {
        x02Var.seconds_ = j;
    }

    /* JADX INFO: renamed from: g */
    public static void m6856g(x02 x02Var, int i) {
        x02Var.nanos_ = i;
    }

    /* JADX INFO: renamed from: h */
    public static x02 m6857h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static w02 m6858k() {
        return (w02) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: l */
    public static w02 m6859l(x02 x02Var) {
        return (w02) DEFAULT_INSTANCE.createBuilder(x02Var);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new x02();
            case 4:
                return new w02(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (x02.class) {
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

    /* JADX INFO: renamed from: i */
    public final int m6860i() {
        return this.nanos_;
    }

    /* JADX INFO: renamed from: j */
    public final long m6861j() {
        return this.seconds_;
    }
}
