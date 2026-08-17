package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lb2 implements b90 {

    /* JADX INFO: renamed from: a */
    public final qh1 f6305a;

    /* JADX INFO: renamed from: b */
    public final qh1 f6306b;

    /* JADX INFO: renamed from: c */
    public final pp1 f6307c;

    /* JADX INFO: renamed from: d */
    public final qh1 f6308d;

    public lb2(qh1 qh1Var, qh1 qh1Var2, pp1 pp1Var, qh1 qh1Var3) {
        this.f6305a = qh1Var;
        this.f6306b = qh1Var2;
        this.f6307c = pp1Var;
        this.f6308d = qh1Var3;
    }

    @Override // p000.qh1
    public final Object get() {
        return new C0599ed((Executor) this.f6305a.get(), (no1) this.f6306b.get(), (C1174o9) this.f6307c.get(), (no1) this.f6308d.get());
    }
}
