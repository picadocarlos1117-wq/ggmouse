package p000;

/* JADX INFO: renamed from: xo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1598xo implements yo1 {

    /* JADX INFO: renamed from: a */
    public final yo1 f12654a;

    /* JADX INFO: renamed from: b */
    public boolean f12655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1635yo f12656c;

    public C1598xo(C1635yo c1635yo, yo1 yo1Var) {
        this.f12656c = c1635yo;
        this.f12654a = yo1Var;
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: b */
    public final boolean mo3797b() {
        return !this.f12656c.m7102k() && this.f12654a.mo3797b();
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: h */
    public final void mo3798h() {
        this.f12654a.mo3798h();
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: i */
    public final int mo3799i(long j) {
        if (this.f12656c.m7102k()) {
            return -3;
        }
        return this.f12654a.mo3799i(j);
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: m */
    public final int mo3800m(C0558d8 c0558d8, C1533vx c1533vx, int i) {
        C1635yo c1635yo = this.f12656c;
        if (c1635yo.m7102k()) {
            return -3;
        }
        if (this.f12655b) {
            c1533vx.f7542b = 4;
            return -4;
        }
        long jMo4345p = c1635yo.mo4345p();
        int iMo3800m = this.f12654a.mo3800m(c0558d8, c1533vx, i);
        if (iMo3800m != -5) {
            long j = c1635yo.f13041f;
            if (j == Long.MIN_VALUE || ((iMo3800m != -4 || c1533vx.f11797p < j) && !(iMo3800m == -3 && jMo4345p == Long.MIN_VALUE && !c1533vx.f11796o))) {
                return iMo3800m;
            }
            c1533vx.mo5844r();
            c1533vx.f7542b = 4;
            this.f12655b = true;
            return -4;
        }
        be0 be0Var = (be0) c0558d8.f2822c;
        be0Var.getClass();
        int i2 = be0Var.f1321G;
        int i3 = be0Var.f1320F;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (c1635yo.f13040e != 0) {
            i3 = 0;
        }
        if (c1635yo.f13041f != Long.MIN_VALUE) {
            i2 = 0;
        }
        ae0 ae0VarM969a = be0Var.m969a();
        ae0VarM969a.f178E = i3;
        ae0VarM969a.f179F = i2;
        c0558d8.f2822c = new be0(ae0VarM969a);
        return -5;
    }
}
