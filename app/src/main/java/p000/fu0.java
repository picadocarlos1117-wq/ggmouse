package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 extends gu0 implements ks0 {

    /* JADX INFO: renamed from: e */
    public final ms0 f3896e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hu0 f3897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(hu0 hu0Var, ms0 ms0Var, j91 j91Var) {
        super(hu0Var, j91Var);
        this.f3897f = hu0Var;
        this.f3896e = ms0Var;
    }

    @Override // p000.gu0
    /* JADX INFO: renamed from: b */
    public final void mo2850b() {
        this.f3896e.getLifecycle().mo2849b(this);
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        ms0 ms0Var2 = this.f3896e;
        es0 es0Var = ((os0) ms0Var2.getLifecycle()).f8452d;
        if (es0Var == es0.f3433a) {
            this.f3897f.mo1070g(this.f4322a);
            return;
        }
        es0 es0Var2 = null;
        while (es0Var2 != es0Var) {
            m3057a(mo2644e());
            es0Var2 = es0Var;
            es0Var = ((os0) ms0Var2.getLifecycle()).f8452d;
        }
    }

    @Override // p000.gu0
    /* JADX INFO: renamed from: d */
    public final boolean mo2851d(ms0 ms0Var) {
        return this.f3896e == ms0Var;
    }

    @Override // p000.gu0
    /* JADX INFO: renamed from: e */
    public final boolean mo2644e() {
        return ((os0) this.f3896e.getLifecycle()).f8452d.compareTo(es0.f3436d) >= 0;
    }
}
