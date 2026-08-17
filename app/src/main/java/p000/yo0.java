package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 extends AbstractC0550d0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f13043c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uo0 f13044d;

    public /* synthetic */ yo0(uo0 uo0Var, int i) {
        this.f13043c = i;
        this.f13044d = uo0Var;
    }

    @Override // p000.AbstractC0550d0
    /* JADX INFO: renamed from: f */
    public final void mo2153f() {
        int i = this.f13043c;
        uo0 uo0Var = this.f13044d;
        switch (i) {
            case 0:
                gp0 gp0Var = (gp0) uo0Var;
                ((nx0) gp0Var.f4264d.f9549c).f7579r.f8549h0.m2155h(gp0Var, true);
                break;
            case 1:
                ((ox0) uo0Var).m5082M0();
                break;
            default:
                ((y91) uo0Var).f12896h.m6742c(true);
                break;
        }
    }

    @Override // p000.AbstractC0550d0
    /* JADX INFO: renamed from: g */
    public final void mo2154g() {
        int i = this.f13043c;
        uo0 uo0Var = this.f13044d;
        switch (i) {
            case 0:
                gp0 gp0Var = (gp0) uo0Var;
                ((nx0) gp0Var.f4264d.f9549c).f7579r.f8549h0.m2155h(gp0Var, false);
                break;
            case 1:
                ox0 ox0Var = (ox0) uo0Var;
                if (!ox0Var.f8530O.get()) {
                    ox0Var.m5083O0();
                    break;
                }
                break;
            default:
                ((y91) uo0Var).f12896h.m6742c(false);
                break;
        }
    }
}
