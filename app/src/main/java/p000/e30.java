package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e30 extends fi0 implements z41 {
    private static final e30 DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER;
    private mo0 fieldPaths_ = fi0.emptyProtobufList();

    static {
        e30 e30Var = new e30();
        DEFAULT_INSTANCE = e30Var;
        fi0.registerDefaultInstance(e30.class, e30Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m2482f(e30 e30Var, String str) {
        e30Var.getClass();
        str.getClass();
        mo0 mo0Var = e30Var.fieldPaths_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            e30Var.fieldPaths_ = fi0.mutableCopy(mo0Var);
        }
        e30Var.fieldPaths_.add(str);
    }

    /* JADX INFO: renamed from: g */
    public static e30 m2483g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static d30 m2484j() {
        return (d30) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new e30();
            case 4:
                return new d30(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (e30.class) {
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
    public final String m2485h(int i) {
        return (String) this.fieldPaths_.get(i);
    }

    /* JADX INFO: renamed from: i */
    public final int m2486i() {
        return this.fieldPaths_.size();
    }
}
