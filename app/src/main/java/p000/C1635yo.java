package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: yo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1635yo implements j21, i21 {

    /* JADX INFO: renamed from: a */
    public final j21 f13036a;

    /* JADX INFO: renamed from: b */
    public i21 f13037b;

    /* JADX INFO: renamed from: c */
    public C1598xo[] f13038c = new C1598xo[0];

    /* JADX INFO: renamed from: d */
    public long f13039d;

    /* JADX INFO: renamed from: e */
    public long f13040e;

    /* JADX INFO: renamed from: f */
    public long f13041f;

    /* JADX INFO: renamed from: g */
    public C0070ap f13042g;

    public C1635yo(j21 j21Var, boolean z, long j, long j2) {
        this.f13036a = j21Var;
        this.f13039d = z ? j : -9223372036854775807L;
        this.f13040e = j;
        this.f13041f = j2;
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: a */
    public final void mo3331a(j21 j21Var) {
        if (this.f13042g != null) {
            return;
        }
        i21 i21Var = this.f13037b;
        i21Var.getClass();
        i21Var.mo3331a(this);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    @Override // p000.j21
    /* JADX INFO: renamed from: b */
    public final long mo3529b(n80[] n80VarArr, boolean[] zArr, yo1[] yo1VarArr, boolean[] zArr2, long j) {
        long j2;
        g21 g21VarM6575e;
        int iM2920a;
        this.f13038c = new C1598xo[yo1VarArr.length];
        yo1[] yo1VarArr2 = new yo1[yo1VarArr.length];
        int i = 0;
        while (true) {
            yo1 yo1Var = null;
            if (i >= yo1VarArr.length) {
                break;
            }
            C1598xo[] c1598xoArr = this.f13038c;
            C1598xo c1598xo = (C1598xo) yo1VarArr[i];
            c1598xoArr[i] = c1598xo;
            if (c1598xo != null) {
                yo1Var = c1598xo.f12654a;
            }
            yo1VarArr2[i] = yo1Var;
            i++;
        }
        long jMo3529b = this.f13036a.mo3529b(n80VarArr, zArr, yo1VarArr2, zArr2, j);
        boolean z = true;
        if (m7102k()) {
            long j3 = this.f13040e;
            if (j != j3 || j3 == 0) {
                j2 = -9223372036854775807L;
            } else {
                int length = n80VarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        j2 = -9223372036854775807L;
                    } else {
                        n80 n80Var = n80VarArr[i2];
                        if (n80Var != null) {
                            be0 be0VarMo862h = n80Var.mo862h();
                            String str = be0VarMo862h.f1341n;
                            String str2 = be0VarMo862h.f1338k;
                            ArrayList arrayList = v51.f11551a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        continue;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null && (g21VarM6575e = v51.m6575e(str2)) != null && (iM2920a = g21VarM6575e.m2920a()) != 0 && iM2920a != 16) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
                            j2 = jMo3529b;
                        }
                        i2++;
                    }
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.f13039d = j2;
        if (jMo3529b != j) {
            if (jMo3529b >= this.f13040e) {
                long j4 = this.f13041f;
                if (j4 != Long.MIN_VALUE && jMo3529b > j4) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        ki0.m3864h(z);
        for (int i3 = 0; i3 < yo1VarArr.length; i3++) {
            yo1 yo1Var2 = yo1VarArr2[i3];
            C1598xo[] c1598xoArr2 = this.f13038c;
            if (yo1Var2 == null) {
                c1598xoArr2[i3] = null;
            } else {
                C1598xo c1598xo2 = c1598xoArr2[i3];
                if (c1598xo2 == null || c1598xo2.f12654a != yo1Var2) {
                    c1598xoArr2[i3] = new C1598xo(this, yo1Var2);
                }
            }
            yo1VarArr[i3] = c1598xoArr2[i3];
        }
        return jMo3529b;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: c */
    public final long mo4342c() {
        long jMo4342c = this.f13036a.mo4342c();
        if (jMo4342c != Long.MIN_VALUE) {
            long j = this.f13041f;
            if (j == Long.MIN_VALUE || jMo4342c < j) {
                return jMo4342c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: d */
    public final long mo3530d(long j, lq1 lq1Var) {
        long j2 = this.f13040e;
        if (j == j2) {
            return j2;
        }
        long jM7234h = z42.m7234h(lq1Var.f6491a, 0L, j - j2);
        long j3 = lq1Var.f6492b;
        long j4 = this.f13041f;
        long jM7234h2 = z42.m7234h(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jM7234h != lq1Var.f6491a || jM7234h2 != lq1Var.f6492b) {
            lq1Var = new lq1(jM7234h, jM7234h2);
        }
        return this.f13036a.mo3530d(j, lq1Var);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: e */
    public final void mo3531e() throws C0070ap {
        C0070ap c0070ap = this.f13042g;
        if (c0070ap != null) {
            throw c0070ap;
        }
        this.f13036a.mo3531e();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // p000.j21
    /* JADX INFO: renamed from: f */
    public final long mo3532f(long j) {
        this.f13039d = -9223372036854775807L;
        boolean z = false;
        for (C1598xo c1598xo : this.f13038c) {
            if (c1598xo != null) {
                c1598xo.f12655b = false;
            }
        }
        long jMo3532f = this.f13036a.mo3532f(j);
        if (jMo3532f == j) {
            z = true;
        } else if (jMo3532f >= this.f13040e) {
            long j2 = this.f13041f;
            if (j2 == Long.MIN_VALUE || jMo3532f <= j2) {
                z = true;
            }
        }
        ki0.m3864h(z);
        return jMo3532f;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: g */
    public final void mo3533g(long j) {
        this.f13036a.mo3533g(j);
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: h */
    public final boolean mo4343h() {
        return this.f13036a.mo4343h();
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: i */
    public final void mo3332i(yq1 yq1Var) {
        i21 i21Var = this.f13037b;
        i21Var.getClass();
        i21Var.mo3332i(this);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: j */
    public final long mo3534j() {
        if (m7102k()) {
            long j = this.f13039d;
            this.f13039d = -9223372036854775807L;
            long jMo3534j = mo3534j();
            return jMo3534j != -9223372036854775807L ? jMo3534j : j;
        }
        long jMo3534j2 = this.f13036a.mo3534j();
        if (jMo3534j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        ki0.m3864h(jMo3534j2 >= this.f13040e);
        long j2 = this.f13041f;
        ki0.m3864h(j2 == Long.MIN_VALUE || jMo3534j2 <= j2);
        return jMo3534j2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7102k() {
        return this.f13039d != -9223372036854775807L;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: l */
    public final void mo3535l(i21 i21Var, long j) {
        this.f13037b = i21Var;
        this.f13036a.mo3535l(this, j);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: m */
    public final z12 mo3536m() {
        return this.f13036a.mo3536m();
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: o */
    public final boolean mo4344o(fv0 fv0Var) {
        return this.f13036a.mo4344o(fv0Var);
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: p */
    public final long mo4345p() {
        long jMo4345p = this.f13036a.mo4345p();
        if (jMo4345p != Long.MIN_VALUE) {
            long j = this.f13041f;
            if (j == Long.MIN_VALUE || jMo4345p < j) {
                return jMo4345p;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: r */
    public final void mo4346r(long j) {
        this.f13036a.mo4346r(j);
    }
}
