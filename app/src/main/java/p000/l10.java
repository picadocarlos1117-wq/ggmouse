package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l10 extends AbstractRunnableC0012ab {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6139c = 1;

    /* JADX INFO: renamed from: d */
    public final AbstractC0143co f6140d;

    /* JADX INFO: renamed from: e */
    public final nv1 f6141e;

    public l10(kx0 kx0Var, AbstractC0143co abstractC0143co, nv1 nv1Var) {
        super(kx0Var.f6053c, 1);
        this.f6140d = abstractC0143co;
        this.f6141e = nv1Var;
    }

    @Override // p000.AbstractRunnableC0012ab
    /* JADX INFO: renamed from: b */
    public final void mo141b() {
        int i = this.f6139c;
        nv1 nv1Var = this.f6141e;
        AbstractC0143co abstractC0143co = this.f6140d;
        switch (i) {
            case 0:
                abstractC0143co.onClose(nv1Var, new j51());
                break;
            default:
                abstractC0143co.onClose(nv1Var, new j51());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(ex0 ex0Var, AbstractC0143co abstractC0143co, nv1 nv1Var) {
        super(ex0Var.f3470e, 1);
        this.f6140d = abstractC0143co;
        this.f6141e = nv1Var;
    }
}
