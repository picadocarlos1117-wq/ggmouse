package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class en0 extends fi0 implements z41 {
    private static final en0 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private mo0 fields_ = fi0.emptyProtobufList();

    static {
        en0 en0Var = new en0();
        DEFAULT_INSTANCE = en0Var;
        fi0.registerDefaultInstance(en0.class, en0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m2599f(en0 en0Var) {
        en0Var.getClass();
        en0Var.queryScope_ = dn0.COLLECTION_GROUP.getNumber();
    }

    /* JADX INFO: renamed from: g */
    public static void m2600g(en0 en0Var, cn0 cn0Var) {
        en0Var.getClass();
        cn0Var.getClass();
        mo0 mo0Var = en0Var.fields_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            en0Var.fields_ = fi0.mutableCopy(mo0Var);
        }
        en0Var.fields_.add(cn0Var);
    }

    /* JADX INFO: renamed from: i */
    public static ym0 m2601i() {
        return (ym0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: j */
    public static en0 m2602j(byte[] bArr) {
        return (en0) fi0.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", cn0.class, "state_"});
            case 3:
                return new en0();
            case 4:
                return new ym0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (en0.class) {
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
    public final mo0 m2603h() {
        return this.fields_;
    }
}
