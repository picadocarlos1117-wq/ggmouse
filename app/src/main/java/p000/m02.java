package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m02 implements j21, i21 {

    /* JADX INFO: renamed from: a */
    public final j21 f6584a;

    /* JADX INFO: renamed from: b */
    public final long f6585b;

    /* JADX INFO: renamed from: c */
    public i21 f6586c;

    public m02(j21 j21Var, long j) {
        this.f6584a = j21Var;
        this.f6585b = j;
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: a */
    public final void mo3331a(j21 j21Var) {
        i21 i21Var = this.f6586c;
        i21Var.getClass();
        i21Var.mo3331a(this);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: b */
    public final long mo3529b(n80[] n80VarArr, boolean[] zArr, yo1[] yo1VarArr, boolean[] zArr2, long j) {
        yo1[] yo1VarArr2 = new yo1[yo1VarArr.length];
        int i = 0;
        while (true) {
            yo1 yo1Var = null;
            if (i >= yo1VarArr.length) {
                break;
            }
            l02 l02Var = (l02) yo1VarArr[i];
            if (l02Var != null) {
                yo1Var = l02Var.f6135a;
            }
            yo1VarArr2[i] = yo1Var;
            i++;
        }
        j21 j21Var = this.f6584a;
        long j2 = this.f6585b;
        long jMo3529b = j21Var.mo3529b(n80VarArr, zArr, yo1VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < yo1VarArr.length; i2++) {
            yo1 yo1Var2 = yo1VarArr2[i2];
            if (yo1Var2 == null) {
                yo1VarArr[i2] = null;
            } else {
                yo1 yo1Var3 = yo1VarArr[i2];
                if (yo1Var3 == null || ((l02) yo1Var3).f6135a != yo1Var2) {
                    yo1VarArr[i2] = new l02(yo1Var2, j2);
                }
            }
        }
        return jMo3529b + j2;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: c */
    public final long mo4342c() {
        long jMo4342c = this.f6584a.mo4342c();
        if (jMo4342c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo4342c + this.f6585b;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: d */
    public final long mo3530d(long j, lq1 lq1Var) {
        long j2 = this.f6585b;
        return this.f6584a.mo3530d(j - j2, lq1Var) + j2;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: e */
    public final void mo3531e() {
        this.f6584a.mo3531e();
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: f */
    public final long mo3532f(long j) {
        long j2 = this.f6585b;
        return this.f6584a.mo3532f(j - j2) + j2;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: g */
    public final void mo3533g(long j) {
        this.f6584a.mo3533g(j - this.f6585b);
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: h */
    public final boolean mo4343h() {
        return this.f6584a.mo4343h();
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: i */
    public final void mo3332i(yq1 yq1Var) {
        i21 i21Var = this.f6586c;
        i21Var.getClass();
        i21Var.mo3332i(this);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: j */
    public final long mo3534j() {
        long jMo3534j = this.f6584a.mo3534j();
        if (jMo3534j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo3534j + this.f6585b;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: l */
    public final void mo3535l(i21 i21Var, long j) {
        this.f6586c = i21Var;
        this.f6584a.mo3535l(this, j - this.f6585b);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: m */
    public final z12 mo3536m() {
        return this.f6584a.mo3536m();
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: o */
    public final boolean mo4344o(fv0 fv0Var) {
        ev0 ev0Var = new ev0();
        long j = fv0Var.f3901a;
        ev0Var.f3445b = fv0Var.f3902b;
        ev0Var.f3446c = fv0Var.f3903c;
        ev0Var.f3444a = j - this.f6585b;
        return this.f6584a.mo4344o(new fv0(ev0Var));
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: p */
    public final long mo4345p() {
        long jMo4345p = this.f6584a.mo4345p();
        if (jMo4345p == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo4345p + this.f6585b;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: r */
    public final void mo4346r(long j) {
        this.f6584a.mo4346r(j - this.f6585b);
    }
}
