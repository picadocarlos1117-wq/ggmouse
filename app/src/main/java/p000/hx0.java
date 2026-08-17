package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 extends AbstractC1337qm {

    /* JADX INFO: renamed from: h */
    public final gx0 f4740h;

    /* JADX INFO: renamed from: i */
    public final ua0 f4741i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ox0 f4742j;

    public hx0(ox0 ox0Var, gx0 gx0Var, sm1 sm1Var) {
        this.f4742j = ox0Var;
        this.f4740h = gx0Var;
        p32.m5188s(sm1Var, "resolver");
        this.f4741i = sm1Var;
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: L */
    public final void mo3310L(nv1 nv1Var) {
        p32.m5177l(!nv1Var.m4612e(), "the error status must not be OK");
        this.f4742j.f8565u.execute(new RunnableC1466u3(23, this, nv1Var));
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: O */
    public final void mo3311O(w71 w71Var) {
        this.f4742j.f8565u.execute(new RunnableC1466u3(24, this, w71Var));
    }
}
