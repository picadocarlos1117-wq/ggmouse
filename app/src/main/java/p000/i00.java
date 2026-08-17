package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 implements b90 {

    /* JADX INFO: renamed from: a */
    public final qh1 f4757a;

    /* JADX INFO: renamed from: b */
    public final qh1 f4758b;

    /* JADX INFO: renamed from: c */
    public final pp1 f4759c;

    /* JADX INFO: renamed from: d */
    public final qh1 f4760d;

    /* JADX INFO: renamed from: e */
    public final qh1 f4761e;

    public i00(qh1 qh1Var, qh1 qh1Var2, pp1 pp1Var, qh1 qh1Var3, qh1 qh1Var4) {
        this.f4757a = qh1Var;
        this.f4758b = qh1Var2;
        this.f4759c = pp1Var;
        this.f4760d = qh1Var3;
        this.f4761e = qh1Var4;
    }

    @Override // p000.qh1
    public final Object get() {
        return new h00((Executor) this.f4757a.get(), (m51) this.f4758b.get(), (C1174o9) this.f4759c.get(), (no1) this.f4760d.get(), (no1) this.f4761e.get());
    }
}
