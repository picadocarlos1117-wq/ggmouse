package p000;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0555d5 implements x80 {

    /* JADX INFO: renamed from: c */
    public final dc1 f2786c;

    /* JADX INFO: renamed from: d */
    public final C0141cm f2787d;

    /* JADX INFO: renamed from: e */
    public z80 f2788e;

    /* JADX INFO: renamed from: f */
    public long f2789f;

    /* JADX INFO: renamed from: h */
    public boolean f2791h;

    /* JADX INFO: renamed from: i */
    public boolean f2792i;

    /* JADX INFO: renamed from: a */
    public final C0591e5 f2784a = new C0591e5(null, 0, true);

    /* JADX INFO: renamed from: b */
    public final dc1 f2785b = new dc1(2048);

    /* JADX INFO: renamed from: g */
    public long f2790g = -1;

    public C0555d5() {
        dc1 dc1Var = new dc1(10);
        this.f2786c = dc1Var;
        byte[] bArr = dc1Var.f2882a;
        this.f2787d = new C0141cm(bArr, bArr.length);
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        ki0.m3866j(this.f2788e);
        y80Var.mo2420i();
        dc1 dc1Var = this.f2785b;
        int i = y80Var.read(dc1Var.f2882a, 0, 2048);
        boolean z = i == -1;
        if (!this.f2792i) {
            this.f2788e.mo752q(new C0825ke(-9223372036854775807L));
            this.f2792i = true;
        }
        if (z) {
            return -1;
        }
        dc1Var.m2316F(0);
        dc1Var.m2315E(i);
        boolean z2 = this.f2791h;
        C0591e5 c0591e5 = this.f2784a;
        if (!z2) {
            c0591e5.f3212t = this.f2789f;
            this.f2791h = true;
        }
        c0591e5.mo1129a(dc1Var);
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        dc1 dc1Var;
        int i = 0;
        while (true) {
            dc1Var = this.f2786c;
            y80Var.mo2413a(0, 10, dc1Var.f2882a);
            dc1Var.m2316F(0);
            if (dc1Var.m2340w() != 4801587) {
                break;
            }
            dc1Var.m2317G(3);
            int iM2336s = dc1Var.m2336s();
            i += iM2336s + 10;
            y80Var.mo2418g(iM2336s);
        }
        y80Var.mo2422l();
        y80Var.mo2418g(i);
        if (this.f2790g == -1) {
            this.f2790g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            C0584dz c0584dz = (C0584dz) y80Var;
            c0584dz.mo2416e(dc1Var.f2882a, 0, 2, false);
            dc1Var.m2316F(0);
            if ((dc1Var.m2343z() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c0584dz.mo2416e(dc1Var.f2882a, 0, 4, false);
                C0141cm c0141cm = this.f2787d;
                c0141cm.m1246q(14);
                int iM1238i = c0141cm.m1238i(13);
                if (iM1238i <= 6) {
                    i4++;
                    c0584dz.f3082f = 0;
                    c0584dz.m2421k(i4, false);
                } else {
                    c0584dz.m2421k(iM1238i - 6, false);
                    i3 += iM1238i;
                }
            } else {
                i4++;
                c0584dz.f3082f = 0;
                c0584dz.m2421k(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f2791h = false;
        this.f2784a.mo1130c();
        this.f2789f = j2;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f2788e = z80Var;
        this.f2784a.mo1133f(z80Var, new qk0(0, 1));
        z80Var.mo748k();
    }

    @Override // p000.x80
    public final void release() {
    }
}
