package p000;

import java.util.List;

/* JADX INFO: renamed from: pv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1309pv extends fi0 implements z41 {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C1309pv DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private mo0 values_ = fi0.emptyProtobufList();

    static {
        C1309pv c1309pv = new C1309pv();
        DEFAULT_INSTANCE = c1309pv;
        fi0.registerDefaultInstance(C1309pv.class, c1309pv);
    }

    /* JADX INFO: renamed from: f */
    public static void m5362f(C1309pv c1309pv, Iterable iterable) {
        mo0 mo0Var = c1309pv.values_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            c1309pv.values_ = fi0.mutableCopy(mo0Var);
        }
        AbstractC0812k1.addAll(iterable, (List) c1309pv.values_);
    }

    /* JADX INFO: renamed from: g */
    public static void m5363g(C1309pv c1309pv, boolean z) {
        c1309pv.before_ = z;
    }

    /* JADX INFO: renamed from: i */
    public static C1309pv m5364i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C1272ov m5365j() {
        return (C1272ov) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: a */
    public final List m5366a() {
        return this.values_;
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", e52.class, "before_"});
            case 3:
                return new C1309pv();
            case 4:
                return new C1272ov(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C1309pv.class) {
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
    public final boolean m5367h() {
        return this.before_;
    }
}
