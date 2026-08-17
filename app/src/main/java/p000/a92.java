package p000;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a92 implements x80 {

    /* JADX INFO: renamed from: a */
    public z80 f89a;

    /* JADX INFO: renamed from: b */
    public c22 f90b;

    /* JADX INFO: renamed from: e */
    public y82 f93e;

    /* JADX INFO: renamed from: c */
    public int f91c = 0;

    /* JADX INFO: renamed from: d */
    public long f92d = -1;

    /* JADX INFO: renamed from: f */
    public int f94f = -1;

    /* JADX INFO: renamed from: g */
    public long f95g = -1;

    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        byte[] bArr;
        int i;
        ki0.m3866j(this.f90b);
        int i2 = z42.f13274a;
        int i3 = this.f91c;
        int iM7244r = 4;
        if (i3 == 0) {
            ki0.m3864h(y80Var.getPosition() == 0);
            int i4 = this.f94f;
            if (i4 != -1) {
                y80Var.mo2423m(i4);
                this.f91c = 4;
                return 0;
            }
            if (!sc2.m6059c(y80Var)) {
                throw fc1.m2799a(null, "Unsupported or unrecognized wav file type.");
            }
            y80Var.mo2423m((int) (y80Var.mo2417f() - y80Var.getPosition()));
            this.f91c = 1;
            return 0;
        }
        long jM2327j = -1;
        if (i3 == 1) {
            dc1 dc1Var = new dc1(8);
            tu0 tu0VarM6345a = tu0.m6345a(y80Var, dc1Var);
            if (tu0VarM6345a.f11017a != 1685272116) {
                y80Var.mo2422l();
            } else {
                y80Var.mo2418g(8);
                dc1Var.m2316F(0);
                y80Var.mo2413a(0, 8, dc1Var.f2882a);
                jM2327j = dc1Var.m2327j();
                y80Var.mo2423m(((int) tu0VarM6345a.f11018b) + 8);
            }
            this.f92d = jM2327j;
            this.f91c = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    l41.m4046o();
                    return 0;
                }
                ki0.m3864h(this.f95g != -1);
                long position = this.f95g - y80Var.getPosition();
                y82 y82Var = this.f93e;
                y82Var.getClass();
                return y82Var.mo6873b(y80Var, position) ? -1 : 0;
            }
            y80Var.mo2422l();
            tu0 tu0VarM6050U = sc2.m6050U(1684108385, y80Var, new dc1(8));
            y80Var.mo2423m(8);
            Pair pairCreate = Pair.create(Long.valueOf(y80Var.getPosition()), Long.valueOf(tu0VarM6050U.f11018b));
            this.f94f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.f92d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.f95g = ((long) this.f94f) + jLongValue;
            long jMo2420i = y80Var.mo2420i();
            if (jMo2420i != -1 && this.f95g > jMo2420i) {
                AbstractC1337qm.m5542i0("WavExtractor", "Data exceeds input length: " + this.f95g + ", " + jMo2420i);
                this.f95g = jMo2420i;
            }
            y82 y82Var2 = this.f93e;
            y82Var2.getClass();
            y82Var2.mo6874c(this.f94f, this.f95g);
            this.f91c = 4;
            return 0;
        }
        dc1 dc1Var2 = new dc1(16);
        long j2 = sc2.m6050U(1718449184, y80Var, dc1Var2).f11018b;
        ki0.m3864h(j2 >= 16);
        y80Var.mo2413a(0, 16, dc1Var2.f2882a);
        dc1Var2.m2316F(0);
        int iM2330m = dc1Var2.m2330m();
        int iM2330m2 = dc1Var2.m2330m();
        int iM2329l = dc1Var2.m2329l();
        dc1Var2.m2329l();
        int iM2330m3 = dc1Var2.m2330m();
        int iM2330m4 = dc1Var2.m2330m();
        int i5 = ((int) j2) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            y80Var.mo2413a(0, i5, bArr);
        } else {
            bArr = z42.f13279f;
        }
        byte[] bArr2 = bArr;
        y80Var.mo2423m((int) (y80Var.mo2417f() - y80Var.getPosition()));
        C0752ij c0752ij = new C0752ij(iM2330m, iM2330m2, iM2329l, bArr2, iM2330m3, iM2330m4);
        if (iM2330m == 17) {
            this.f93e = new x82(this.f89a, this.f90b, c0752ij);
        } else if (iM2330m == 6) {
            this.f93e = new z82(this.f89a, this.f90b, c0752ij, "audio/g711-alaw", -1);
        } else if (iM2330m == 7) {
            this.f93e = new z82(this.f89a, this.f90b, c0752ij, "audio/g711-mlaw", -1);
        } else {
            if (iM2330m == 1) {
                iM7244r = z42.m7244r(iM2330m4);
                i = iM7244r;
            } else {
                if (iM2330m != 3) {
                    if (iM2330m == 65534) {
                        iM7244r = z42.m7244r(iM2330m4);
                        i = iM7244r;
                    }
                } else if (iM2330m4 == 32) {
                    i = iM7244r;
                }
                i = 0;
            }
            if (i == 0) {
                throw fc1.m2800b("Unsupported WAV format type: " + iM2330m);
            }
            this.f93e = new z82(this.f89a, this.f90b, c0752ij, "audio/raw", i);
        }
        this.f91c = 3;
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        return sc2.m6059c(y80Var);
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f91c = j == 0 ? 0 : 4;
        y82 y82Var = this.f93e;
        if (y82Var != null) {
            y82Var.mo6872a(j2);
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f89a = z80Var;
        this.f90b = z80Var.mo750n(0, 1);
        z80Var.mo748k();
    }

    @Override // p000.x80
    public final void release() {
    }
}
