package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 extends ua0 {

    /* JADX INFO: renamed from: t */
    public static final C1400sb f10437t = new C1400sb("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: q */
    public final ua0 f10438q;

    /* JADX INFO: renamed from: r */
    public final C1442tg f10439r;

    /* JADX INFO: renamed from: s */
    public final ry1 f10440s;

    public sm1(w20 w20Var, C1442tg c1442tg, ry1 ry1Var) {
        this.f10438q = w20Var;
        this.f10439r = c1442tg;
        this.f10440s = ry1Var;
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: A */
    public String mo6117A() {
        return this.f10438q.mo6117A();
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: L */
    public final void mo6118L() {
        this.f10438q.mo6118L();
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: Q */
    public final void mo6119Q() {
        this.f10438q.mo6119Q();
        C1442tg c1442tg = this.f10439r;
        ry1 ry1Var = c1442tg.f10865b;
        ry1Var.m5930d();
        ry1Var.execute(new RunnableC1430t4(c1442tg, 5));
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: W */
    public final void mo6120W(AbstractC1337qm abstractC1337qm) {
        this.f10438q.mo6120W(new rm1(this, abstractC1337qm));
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f10438q, "delegate");
        return c1679zvM5176k0.toString();
    }
}
