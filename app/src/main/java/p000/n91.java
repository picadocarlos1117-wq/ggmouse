package p000;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 {

    /* JADX INFO: renamed from: a */
    public int f7311a;

    /* JADX INFO: renamed from: b */
    public long f7312b;

    /* JADX INFO: renamed from: c */
    public int f7313c;

    /* JADX INFO: renamed from: d */
    public int f7314d;

    /* JADX INFO: renamed from: e */
    public int f7315e;

    /* JADX INFO: renamed from: f */
    public final int[] f7316f = new int[255];

    /* JADX INFO: renamed from: g */
    public final dc1 f7317g = new dc1(255);

    /* JADX INFO: renamed from: a */
    public final boolean m4509a(y80 y80Var, boolean z) throws fc1, EOFException {
        boolean zMo2416e;
        boolean zMo2416e2;
        this.f7311a = 0;
        this.f7312b = 0L;
        this.f7313c = 0;
        this.f7314d = 0;
        this.f7315e = 0;
        dc1 dc1Var = this.f7317g;
        dc1Var.m2313C(27);
        try {
            zMo2416e = y80Var.mo2416e(dc1Var.f2882a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo2416e = false;
        }
        if (zMo2416e && dc1Var.m2339v() == 1332176723) {
            if (dc1Var.m2337t() == 0) {
                this.f7311a = dc1Var.m2337t();
                this.f7312b = dc1Var.m2327j();
                dc1Var.m2328k();
                dc1Var.m2328k();
                dc1Var.m2328k();
                int iM2337t = dc1Var.m2337t();
                this.f7313c = iM2337t;
                this.f7314d = iM2337t + 27;
                dc1Var.m2313C(iM2337t);
                try {
                    zMo2416e2 = y80Var.mo2416e(dc1Var.f2882a, 0, this.f7313c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zMo2416e2 = false;
                }
                if (zMo2416e2) {
                    for (int i = 0; i < this.f7313c; i++) {
                        int iM2337t2 = dc1Var.m2337t();
                        this.f7316f[i] = iM2337t2;
                        this.f7315e += iM2337t2;
                    }
                    return true;
                }
            } else if (!z) {
                throw fc1.m2800b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4510b(y80 y80Var, long j) {
        boolean zMo2416e;
        ki0.m3857c(y80Var.getPosition() == y80Var.mo2417f());
        dc1 dc1Var = this.f7317g;
        dc1Var.m2313C(4);
        while (true) {
            if (j != -1 && y80Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                zMo2416e = y80Var.mo2416e(dc1Var.f2882a, 0, 4, true);
            } catch (EOFException unused) {
                zMo2416e = false;
            }
            if (!zMo2416e) {
                break;
            }
            dc1Var.m2316F(0);
            if (dc1Var.m2339v() == 1332176723) {
                y80Var.mo2422l();
                return true;
            }
            y80Var.mo2423m(1);
        }
        do {
            if (j != -1 && y80Var.getPosition() >= j) {
                break;
            }
        } while (y80Var.mo2419h(1) != -1);
        return false;
    }
}
