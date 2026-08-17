package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ub2 extends fi0 implements z41 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ub2 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile ec1 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private iy0 labels_ = iy0.f5198b;
    private String database_ = "";
    private String streamId_ = "";
    private mo0 writes_ = fi0.emptyProtobufList();
    private AbstractC0753ik streamToken_ = AbstractC0753ik.f5042b;

    static {
        ub2 ub2Var = new ub2();
        DEFAULT_INSTANCE = ub2Var;
        fi0.registerDefaultInstance(ub2.class, ub2Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m6483f(ub2 ub2Var, String str) {
        ub2Var.getClass();
        str.getClass();
        ub2Var.database_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m6484g(ub2 ub2Var, AbstractC0753ik abstractC0753ik) {
        ub2Var.getClass();
        abstractC0753ik.getClass();
        ub2Var.streamToken_ = abstractC0753ik;
    }

    /* JADX INFO: renamed from: h */
    public static void m6485h(ub2 ub2Var, qb2 qb2Var) {
        ub2Var.getClass();
        qb2Var.getClass();
        mo0 mo0Var = ub2Var.writes_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            ub2Var.writes_ = fi0.mutableCopy(mo0Var);
        }
        ub2Var.writes_.add(qb2Var);
    }

    /* JADX INFO: renamed from: i */
    public static ub2 m6486i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static sb2 m6487j() {
        return (sb2) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", qb2.class, "streamToken_", "labels_", tb2.f10822a});
            case 3:
                return new ub2();
            case 4:
                return new sb2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (ub2.class) {
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
}
