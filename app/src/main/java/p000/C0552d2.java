package p000;

import android.sun.security.util.DerValue;

/* JADX INFO: renamed from: d2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0552d2 implements x80 {

    /* JADX INFO: renamed from: a */
    public final C0588e2 f2719a = new C0588e2();

    /* JADX INFO: renamed from: b */
    public final dc1 f2720b = new dc1(2786);

    /* JADX INFO: renamed from: c */
    public boolean f2721c;

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        dc1 dc1Var = this.f2720b;
        int i = y80Var.read(dc1Var.f2882a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        dc1Var.m2316F(0);
        dc1Var.m2315E(i);
        boolean z = this.f2721c;
        C0588e2 c0588e2 = this.f2719a;
        if (!z) {
            c0588e2.f3171n = 0L;
            this.f2721c = true;
        }
        c0588e2.mo1129a(dc1Var);
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        C0584dz c0584dz;
        int iM3225t;
        dc1 dc1Var = new dc1(10);
        int i = 0;
        while (true) {
            c0584dz = (C0584dz) y80Var;
            c0584dz.mo2416e(dc1Var.f2882a, 0, 10, false);
            dc1Var.m2316F(0);
            if (dc1Var.m2340w() != 4801587) {
                break;
            }
            dc1Var.m2317G(3);
            int iM2336s = dc1Var.m2336s();
            i += iM2336s + 10;
            c0584dz.m2421k(iM2336s, false);
        }
        c0584dz.f3082f = 0;
        c0584dz.m2421k(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            c0584dz.mo2416e(dc1Var.f2882a, 0, 6, false);
            dc1Var.m2316F(0);
            if (dc1Var.m2343z() != 2935) {
                c0584dz.f3082f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                c0584dz.m2421k(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = dc1Var.f2882a;
                if (bArr.length < 6) {
                    iM3225t = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iM3225t = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iM3225t = hp0.m3225t((b & DerValue.TAG_PRIVATE) >> 6, b & 63);
                }
                if (iM3225t == -1) {
                    break;
                }
                c0584dz.m2421k(iM3225t - 6, false);
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f2721c = false;
        this.f2719a.mo1130c();
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f2719a.mo1133f(z80Var, new qk0(0, 1));
        z80Var.mo748k();
        z80Var.mo752q(new C0825ke(-9223372036854775807L));
    }

    @Override // p000.x80
    public final void release() {
    }
}
