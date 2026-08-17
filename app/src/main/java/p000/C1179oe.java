package p000;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1179oe implements x80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7765a;

    /* JADX INFO: renamed from: b */
    public final dc1 f7766b;

    /* JADX INFO: renamed from: c */
    public final ct1 f7767c;

    public C1179oe(int i) {
        this.f7765a = i;
        switch (i) {
            case 1:
                this.f7766b = new dc1(4);
                this.f7767c = new ct1(-1, -1, "image/heif");
                break;
            case 2:
                this.f7766b = new dc1(4);
                this.f7767c = new ct1(-1, -1, "image/webp");
                break;
            default:
                this.f7766b = new dc1(4);
                this.f7767c = new ct1(-1, -1, "image/avif");
                break;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        switch (this.f7765a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7767c.mo124b(y80Var, bb0Var);
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        int i = this.f7765a;
        dc1 dc1Var = this.f7766b;
        switch (i) {
            case 0:
                C0584dz c0584dz = (C0584dz) y80Var;
                c0584dz.m2421k(4, false);
                dc1Var.m2313C(4);
                c0584dz.mo2416e(dc1Var.f2882a, 0, 4, false);
                if (dc1Var.m2339v() == 1718909296) {
                    dc1Var.m2313C(4);
                    c0584dz.mo2416e(dc1Var.f2882a, 0, 4, false);
                    if (dc1Var.m2339v() == 1635150182) {
                        return true;
                    }
                }
                return false;
            case 1:
                C0584dz c0584dz2 = (C0584dz) y80Var;
                c0584dz2.m2421k(4, false);
                dc1Var.m2313C(4);
                c0584dz2.mo2416e(dc1Var.f2882a, 0, 4, false);
                if (dc1Var.m2339v() == 1718909296) {
                    dc1Var.m2313C(4);
                    c0584dz2.mo2416e(dc1Var.f2882a, 0, 4, false);
                    if (dc1Var.m2339v() == 1751476579) {
                        return true;
                    }
                }
                return false;
            default:
                dc1Var.m2313C(4);
                C0584dz c0584dz3 = (C0584dz) y80Var;
                c0584dz3.mo2416e(dc1Var.f2882a, 0, 4, false);
                if (dc1Var.m2339v() == 1380533830) {
                    c0584dz3.m2421k(4, false);
                    dc1Var.m2313C(4);
                    c0584dz3.mo2416e(dc1Var.f2882a, 0, 4, false);
                    if (dc1Var.m2339v() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        switch (this.f7765a) {
            case 0:
                this.f7767c.mo126f(j, j2);
                break;
            case 1:
                this.f7767c.mo126f(j, j2);
                break;
            default:
                this.f7767c.mo126f(j, j2);
                break;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        int i = this.f7765a;
        ct1 ct1Var = this.f7767c;
        switch (i) {
            case 0:
                ct1Var.mo127k(z80Var);
                break;
            case 1:
                ct1Var.mo127k(z80Var);
                break;
            default:
                ct1Var.mo127k(z80Var);
                break;
        }
    }

    @Override // p000.x80
    public final void release() {
        int i = this.f7765a;
    }

    /* JADX INFO: renamed from: a */
    private final void m4798a() {
    }

    /* JADX INFO: renamed from: c */
    private final void m4799c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m4800d() {
    }
}
