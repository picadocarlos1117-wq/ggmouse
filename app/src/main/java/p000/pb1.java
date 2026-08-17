package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 extends AbstractC1450to {

    /* JADX INFO: renamed from: a */
    public final jb1 f8831a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1450to f8832b;

    public pb1(jb1 jb1Var, AbstractC1450to abstractC1450to) {
        this.f8831a = jb1Var;
        this.f8832b = abstractC1450to;
    }

    @Override // p000.AbstractC1450to
    /* JADX INFO: renamed from: a */
    public final rc2 mo2828a(C0733i c0733i, j51 j51Var) {
        AbstractC1450to abstractC1450to = this.f8832b;
        return abstractC1450to != null ? new nb1(this, abstractC1450to.mo2828a(c0733i, j51Var)) : new ob1(this);
    }
}
