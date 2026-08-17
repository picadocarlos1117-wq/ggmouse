package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 extends fi0 implements z41 {
    private static final ut0 DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile ec1 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        ut0 ut0Var = new ut0();
        DEFAULT_INSTANCE = ut0Var;
        fi0.registerDefaultInstance(ut0.class, ut0Var);
    }

    /* JADX INFO: renamed from: f */
    public static ut0 m6534f() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", kz1.class, b30.class, c30.class, s70.class, k30.class});
            case 3:
                return new ut0();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (ut0.class) {
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
    public final b30 m6535g() {
        return this.responseTypeCase_ == 3 ? (b30) this.responseType_ : b30.m831f();
    }

    /* JADX INFO: renamed from: h */
    public final c30 m6536h() {
        return this.responseTypeCase_ == 4 ? (c30) this.responseType_ : c30.m1118f();
    }

    /* JADX INFO: renamed from: i */
    public final k30 m6537i() {
        return this.responseTypeCase_ == 6 ? (k30) this.responseType_ : k30.m3766f();
    }

    /* JADX INFO: renamed from: j */
    public final s70 m6538j() {
        return this.responseTypeCase_ == 5 ? (s70) this.responseType_ : s70.m5999g();
    }

    /* JADX INFO: renamed from: k */
    public final int m6539k() {
        int i = this.responseTypeCase_;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        int i2 = 3;
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                return i != 6 ? 0 : 4;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public final kz1 m6540l() {
        return this.responseTypeCase_ == 2 ? (kz1) this.responseType_ : kz1.m4011g();
    }
}
