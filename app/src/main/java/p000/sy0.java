package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sy0 implements j21, i21 {

    /* JADX INFO: renamed from: a */
    public final q21 f10646a;

    /* JADX INFO: renamed from: b */
    public final long f10647b;

    /* JADX INFO: renamed from: c */
    public final C0547cy f10648c;

    /* JADX INFO: renamed from: d */
    public AbstractC0791jh f10649d;

    /* JADX INFO: renamed from: e */
    public j21 f10650e;

    /* JADX INFO: renamed from: f */
    public i21 f10651f;

    /* JADX INFO: renamed from: g */
    public long f10652g = -9223372036854775807L;

    public sy0(q21 q21Var, C0547cy c0547cy, long j) {
        this.f10646a = q21Var;
        this.f10648c = c0547cy;
        this.f10647b = j;
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: a */
    public final void mo3331a(j21 j21Var) {
        i21 i21Var = this.f10651f;
        int i = z42.f13274a;
        i21Var.mo3331a(this);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: b */
    public final long mo3529b(n80[] n80VarArr, boolean[] zArr, yo1[] yo1VarArr, boolean[] zArr2, long j) {
        long j2 = this.f10652g;
        if (j2 != -9223372036854775807L && j == this.f10647b) {
            j = j2;
        }
        this.f10652g = -9223372036854775807L;
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        return j21Var.mo3529b(n80VarArr, zArr, yo1VarArr, zArr2, j);
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: c */
    public final long mo4342c() {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        return j21Var.mo4342c();
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: d */
    public final long mo3530d(long j, lq1 lq1Var) {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        return j21Var.mo3530d(j, lq1Var);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: e */
    public final void mo3531e() {
        j21 j21Var = this.f10650e;
        if (j21Var != null) {
            j21Var.mo3531e();
            return;
        }
        AbstractC0791jh abstractC0791jh = this.f10649d;
        if (abstractC0791jh != null) {
            abstractC0791jh.mo1021i();
        }
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: f */
    public final long mo3532f(long j) {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        return j21Var.mo3532f(j);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: g */
    public final void mo3533g(long j) {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        j21Var.mo3533g(j);
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: h */
    public final boolean mo4343h() {
        j21 j21Var = this.f10650e;
        return j21Var != null && j21Var.mo4343h();
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: i */
    public final void mo3332i(yq1 yq1Var) {
        i21 i21Var = this.f10651f;
        int i = z42.f13274a;
        i21Var.mo3332i(this);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: j */
    public final long mo3534j() {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        return j21Var.mo3534j();
    }

    /* JADX INFO: renamed from: k */
    public final void m6169k(q21 q21Var) {
        long j = this.f10652g;
        if (j == -9223372036854775807L) {
            j = this.f10647b;
        }
        AbstractC0791jh abstractC0791jh = this.f10649d;
        abstractC0791jh.getClass();
        j21 j21VarMo1020a = abstractC0791jh.mo1020a(q21Var, this.f10648c, j);
        this.f10650e = j21VarMo1020a;
        if (this.f10651f != null) {
            j21VarMo1020a.mo3535l(this, j);
        }
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: l */
    public final void mo3535l(i21 i21Var, long j) {
        this.f10651f = i21Var;
        j21 j21Var = this.f10650e;
        if (j21Var != null) {
            long j2 = this.f10652g;
            if (j2 == -9223372036854775807L) {
                j2 = this.f10647b;
            }
            j21Var.mo3535l(this, j2);
        }
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: m */
    public final z12 mo3536m() {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        return j21Var.mo3536m();
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: o */
    public final boolean mo4344o(fv0 fv0Var) {
        j21 j21Var = this.f10650e;
        return j21Var != null && j21Var.mo4344o(fv0Var);
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: p */
    public final long mo4345p() {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        return j21Var.mo4345p();
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: r */
    public final void mo4346r(long j) {
        j21 j21Var = this.f10650e;
        int i = z42.f13274a;
        j21Var.mo4346r(j);
    }
}
