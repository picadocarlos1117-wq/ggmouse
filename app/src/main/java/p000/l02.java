package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l02 implements yo1 {

    /* JADX INFO: renamed from: a */
    public final yo1 f6135a;

    /* JADX INFO: renamed from: b */
    public final long f6136b;

    public l02(yo1 yo1Var, long j) {
        this.f6135a = yo1Var;
        this.f6136b = j;
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: b */
    public final boolean mo3797b() {
        return this.f6135a.mo3797b();
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: h */
    public final void mo3798h() {
        this.f6135a.mo3798h();
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: i */
    public final int mo3799i(long j) {
        return this.f6135a.mo3799i(j - this.f6136b);
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: m */
    public final int mo3800m(C0558d8 c0558d8, C1533vx c1533vx, int i) {
        int iMo3800m = this.f6135a.mo3800m(c0558d8, c1533vx, i);
        if (iMo3800m == -4) {
            c1533vx.f11797p += this.f6136b;
        }
        return iMo3800m;
    }
}
