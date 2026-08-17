package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ct1 implements x80 {

    /* JADX INFO: renamed from: a */
    public final int f2612a;

    /* JADX INFO: renamed from: b */
    public final int f2613b;

    /* JADX INFO: renamed from: c */
    public final String f2614c;

    /* JADX INFO: renamed from: d */
    public int f2615d;

    /* JADX INFO: renamed from: e */
    public int f2616e;

    /* JADX INFO: renamed from: f */
    public z80 f2617f;

    /* JADX INFO: renamed from: g */
    public c22 f2618g;

    public ct1(int i, int i2, String str) {
        this.f2612a = i;
        this.f2613b = i2;
        this.f2614c = str;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        int i = this.f2616e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            l41.m4046o();
            return 0;
        }
        c22 c22Var = this.f2618g;
        c22Var.getClass();
        int iMo1116c = c22Var.mo1116c(y80Var, 1024, true);
        if (iMo1116c != -1) {
            this.f2615d += iMo1116c;
            return 0;
        }
        this.f2616e = 2;
        this.f2618g.mo1114a(0L, 1, this.f2615d, 0, null);
        this.f2615d = 0;
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        int i = this.f2613b;
        int i2 = this.f2612a;
        ki0.m3864h((i2 == -1 || i == -1) ? false : true);
        dc1 dc1Var = new dc1(i);
        ((C0584dz) y80Var).mo2416e(dc1Var.f2882a, 0, i, false);
        return dc1Var.m2343z() == i2;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        if (j == 0 || this.f2616e == 1) {
            this.f2616e = 1;
            this.f2615d = 0;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f2617f = z80Var;
        c22 c22VarMo750n = z80Var.mo750n(1024, 4);
        this.f2618g = c22VarMo750n;
        ae0 ae0Var = new ae0();
        ae0Var.f197m = v51.m6582l(this.f2614c);
        c22VarMo750n.mo1117d(new be0(ae0Var));
        this.f2617f.mo748k();
        this.f2617f.mo752q(new dt1());
        this.f2616e = 1;
    }

    @Override // p000.x80
    public final void release() {
    }
}
