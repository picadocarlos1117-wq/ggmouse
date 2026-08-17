package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ox0 f13580b;

    public /* synthetic */ zw0(ox0 ox0Var, int i) {
        this.f13579a = i;
        this.f13580b = ox0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13579a) {
            case 0:
                this.f13580b.m5081L0(true);
                break;
            case 1:
                ox0 ox0Var = this.f13580b;
                if (!ox0Var.f8530O.get() && ox0Var.f8521F != null) {
                    ox0Var.m5081L0(false);
                    ox0.m5077I0(ox0Var);
                    break;
                }
                break;
            case 2:
                this.f13580b.m5082M0();
                if (this.f13580b.f8522G != null) {
                    this.f13580b.f8522G.getClass();
                }
                gx0 gx0Var = this.f13580b.f8521F;
                if (gx0Var != null) {
                    ((nu0) gx0Var.f4357s.f3314b).mo4604p();
                }
                break;
            case 3:
                ox0 ox0Var2 = this.f13580b;
                ox0Var2.f8538W.mo2841G(2, "Entering SHUTDOWN state");
                ox0Var2.f8570z.m3482b(EnumC0651fs.f3889e);
                break;
            case 4:
                ox0 ox0Var3 = this.f13580b;
                if (!ox0Var3.f8531P) {
                    ox0Var3.f8531P = true;
                    ox0.m5078J0(ox0Var3);
                    break;
                }
                break;
            default:
                ox0 ox0Var4 = this.f13580b;
                if (ox0Var4.f8521F != null) {
                    ox0.m5077I0(ox0Var4);
                    break;
                }
                break;
        }
    }
}
