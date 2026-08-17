package p000;

import java.util.List;

/* JADX INFO: renamed from: ja */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0783ja extends fi0 implements InterfaceC0821ka {
    private static final C0783ja DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private mo0 values_ = fi0.emptyProtobufList();

    static {
        C0783ja c0783ja = new C0783ja();
        DEFAULT_INSTANCE = c0783ja;
        fi0.registerDefaultInstance(C0783ja.class, c0783ja);
    }

    /* JADX INFO: renamed from: f */
    public static void m3579f(C0783ja c0783ja, e52 e52Var) {
        c0783ja.getClass();
        e52Var.getClass();
        mo0 mo0Var = c0783ja.values_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            c0783ja.values_ = fi0.mutableCopy(mo0Var);
        }
        c0783ja.values_.add(e52Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m3580g(C0783ja c0783ja, Iterable iterable) {
        mo0 mo0Var = c0783ja.values_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            c0783ja.values_ = fi0.mutableCopy(mo0Var);
        }
        AbstractC0812k1.addAll(iterable, (List) c0783ja.values_);
    }

    /* JADX INFO: renamed from: h */
    public static void m3581h(C0783ja c0783ja, int i) {
        mo0 mo0Var = c0783ja.values_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            c0783ja.values_ = fi0.mutableCopy(mo0Var);
        }
        c0783ja.values_.remove(i);
    }

    /* JADX INFO: renamed from: i */
    public static C0783ja m3582i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static C0744ia m3583l() {
        return (C0744ia) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // p000.InterfaceC0821ka
    /* JADX INFO: renamed from: a */
    public final List mo3398a() {
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", e52.class});
            case 3:
                return new C0783ja();
            case 4:
                return new C0744ia(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C0783ja.class) {
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

    /* JADX INFO: renamed from: j */
    public final e52 m3584j(int i) {
        return (e52) this.values_.get(i);
    }

    /* JADX INFO: renamed from: k */
    public final int m3585k() {
        return this.values_.size();
    }
}
