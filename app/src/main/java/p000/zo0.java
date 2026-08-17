package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gp0 f13505b;

    public /* synthetic */ zo0(gp0 gp0Var, int i) {
        this.f13504a = i;
        this.f13505b = gp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13504a) {
            case 0:
                gp0 gp0Var = this.f13505b;
                gp0Var.f4276p = null;
                gp0Var.f4269i.mo2841G(2, "CONNECTING after backoff");
                gp0.m3031a(gp0Var, EnumC0651fs.f3885a);
                gp0.m3032e(gp0Var);
                break;
            case 1:
                if (this.f13505b.f4283w.f4304a == EnumC0651fs.f3888d) {
                    this.f13505b.f4269i.mo2841G(2, "CONNECTING as requested");
                    gp0.m3031a(this.f13505b, EnumC0651fs.f3885a);
                    gp0.m3032e(this.f13505b);
                }
                break;
            default:
                gp0 gp0Var2 = this.f13505b;
                gp0Var2.f4269i.mo2841G(2, "Terminated");
                ox0 ox0Var = ((nx0) gp0Var2.f4264d.f9549c).f7579r;
                ox0Var.f8524I.remove(gp0Var2);
                ox0.m5079K0(ox0Var);
                break;
        }
    }
}
