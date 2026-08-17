package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 extends fi0 implements z41 {
    private static final fz1 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER;
    private mo0 documents_ = fi0.emptyProtobufList();

    static {
        fz1 fz1Var = new fz1();
        DEFAULT_INSTANCE = fz1Var;
        fi0.registerDefaultInstance(fz1.class, fz1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m2874f(fz1 fz1Var, String str) {
        fz1Var.getClass();
        str.getClass();
        mo0 mo0Var = fz1Var.documents_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            fz1Var.documents_ = fi0.mutableCopy(mo0Var);
        }
        fz1Var.documents_.add(str);
    }

    /* JADX INFO: renamed from: g */
    public static fz1 m2875g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static ez1 m2876j() {
        return (ez1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: k */
    public static ez1 m2877k(fz1 fz1Var) {
        return (ez1) DEFAULT_INSTANCE.createBuilder(fz1Var);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
            case 3:
                return new fz1();
            case 4:
                return new ez1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (fz1.class) {
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
    public final String m2878h() {
        return (String) this.documents_.get(0);
    }

    /* JADX INFO: renamed from: i */
    public final int m2879i() {
        return this.documents_.size();
    }
}
