package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qb2 extends fi0 implements rb2 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final qb2 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile ec1 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private rf1 currentDocument_;
    private Object operation_;
    private e30 updateMask_;
    private int operationCase_ = 0;
    private mo0 updateTransforms_ = fi0.emptyProtobufList();

    static {
        qb2 qb2Var = new qb2();
        DEFAULT_INSTANCE = qb2Var;
        fi0.registerDefaultInstance(qb2.class, qb2Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m5464f(qb2 qb2Var, e30 e30Var) {
        qb2Var.getClass();
        e30Var.getClass();
        qb2Var.updateMask_ = e30Var;
        qb2Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m5465g(qb2 qb2Var, o30 o30Var) {
        qb2Var.getClass();
        o30Var.getClass();
        mo0 mo0Var = qb2Var.updateTransforms_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            qb2Var.updateTransforms_ = fi0.mutableCopy(mo0Var);
        }
        qb2Var.updateTransforms_.add(o30Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m5466h(qb2 qb2Var, a30 a30Var) {
        qb2Var.getClass();
        a30Var.getClass();
        qb2Var.operation_ = a30Var;
        qb2Var.operationCase_ = 1;
    }

    /* JADX INFO: renamed from: i */
    public static void m5467i(qb2 qb2Var, rf1 rf1Var) {
        qb2Var.getClass();
        rf1Var.getClass();
        qb2Var.currentDocument_ = rf1Var;
        qb2Var.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: j */
    public static void m5468j(qb2 qb2Var, String str) {
        qb2Var.getClass();
        str.getClass();
        qb2Var.operationCase_ = 2;
        qb2Var.operation_ = str;
    }

    /* JADX INFO: renamed from: k */
    public static void m5469k(qb2 qb2Var, String str) {
        qb2Var.getClass();
        str.getClass();
        qb2Var.operationCase_ = 5;
        qb2Var.operation_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static ob2 m5470x() {
        return (ob2) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: y */
    public static ob2 m5471y(qb2 qb2Var) {
        return (ob2) DEFAULT_INSTANCE.createBuilder(qb2Var);
    }

    /* JADX INFO: renamed from: z */
    public static qb2 m5472z(byte[] bArr) {
        return (qb2) fi0.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", a30.class, "updateMask_", "currentDocument_", p30.class, "updateTransforms_", o30.class});
            case 3:
                return new qb2();
            case 4:
                return new ob2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (qb2.class) {
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

    /* JADX INFO: renamed from: l */
    public final rf1 m5473l() {
        rf1 rf1Var = this.currentDocument_;
        return rf1Var == null ? rf1.m5839i() : rf1Var;
    }

    /* JADX INFO: renamed from: m */
    public final String m5474m() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    /* JADX INFO: renamed from: n */
    public final pb2 m5475n() {
        int i = this.operationCase_;
        if (i == 0) {
            return pb2.f8837e;
        }
        if (i == 1) {
            return pb2.f8833a;
        }
        if (i == 2) {
            return pb2.f8834b;
        }
        if (i == 5) {
            return pb2.f8835c;
        }
        if (i != 6) {
            return null;
        }
        return pb2.f8836d;
    }

    /* JADX INFO: renamed from: o */
    public final p30 m5476o() {
        return this.operationCase_ == 6 ? (p30) this.operation_ : p30.m5120f();
    }

    /* JADX INFO: renamed from: p */
    public final a30 m5477p() {
        return this.operationCase_ == 1 ? (a30) this.operation_ : a30.m58i();
    }

    /* JADX INFO: renamed from: q */
    public final e30 m5478q() {
        e30 e30Var = this.updateMask_;
        return e30Var == null ? e30.m2483g() : e30Var;
    }

    /* JADX INFO: renamed from: r */
    public final mo0 m5479r() {
        return this.updateTransforms_;
    }

    /* JADX INFO: renamed from: s */
    public final String m5480s() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5481t() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5482u() {
        return this.operationCase_ == 6;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5483v() {
        return this.operationCase_ == 1;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5484w() {
        return (this.bitField0_ & 1) != 0;
    }
}
