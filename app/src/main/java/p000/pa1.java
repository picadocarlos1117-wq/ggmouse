package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 implements InterfaceC0832kl {

    /* JADX INFO: renamed from: a */
    public final ia1 f8822a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ra1 f8823b;

    public pa1(ra1 ra1Var, ia1 ia1Var) {
        ia1Var.getClass();
        this.f8823b = ra1Var;
        this.f8822a = ia1Var;
    }

    @Override // p000.InterfaceC0832kl
    public final void cancel() {
        ra1 ra1Var = this.f8823b;
        C1620y9 c1620y9 = ra1Var.f9858b;
        ia1 ia1Var = this.f8822a;
        c1620y9.remove(ia1Var);
        if (hp0.m3214e(ra1Var.f9859c, ia1Var)) {
            ia1Var.handleOnBackCancelled();
            ra1Var.f9859c = null;
        }
        ia1Var.removeCancellable(this);
        mg0 enabledChangedCallback$activity_release = ia1Var.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        ia1Var.setEnabledChangedCallback$activity_release(null);
    }
}
