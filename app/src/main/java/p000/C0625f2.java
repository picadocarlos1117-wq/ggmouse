package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;

/* JADX INFO: renamed from: f2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0625f2 implements x80 {

    /* JADX INFO: renamed from: a */
    public final C0588e2 f3583a = new C0588e2(null, 0, 1);

    /* JADX INFO: renamed from: b */
    public final dc1 f3584b = new dc1(PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE);

    /* JADX INFO: renamed from: c */
    public boolean f3585c;

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        dc1 dc1Var = this.f3584b;
        int i = y80Var.read(dc1Var.f2882a, 0, PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE);
        if (i == -1) {
            return -1;
        }
        dc1Var.m2316F(0);
        dc1Var.m2315E(i);
        boolean z = this.f3585c;
        C0588e2 c0588e2 = this.f3583a;
        if (!z) {
            c0588e2.f3171n = 0L;
            this.f3585c = true;
        }
        c0588e2.mo1129a(dc1Var);
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        C0584dz c0584dz;
        int i;
        dc1 dc1Var = new dc1(10);
        int i2 = 0;
        while (true) {
            c0584dz = (C0584dz) y80Var;
            c0584dz.mo2416e(dc1Var.f2882a, 0, 10, false);
            dc1Var.m2316F(0);
            if (dc1Var.m2340w() != 4801587) {
                break;
            }
            dc1Var.m2317G(3);
            int iM2336s = dc1Var.m2336s();
            i2 += iM2336s + 10;
            c0584dz.m2421k(iM2336s, false);
        }
        c0584dz.f3082f = 0;
        c0584dz.m2421k(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            c0584dz.mo2416e(dc1Var.f2882a, 0, 7, false);
            dc1Var.m2316F(0);
            int iM2343z = dc1Var.m2343z();
            if (iM2343z == 44096 || iM2343z == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = dc1Var.f2882a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iM2343z == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                c0584dz.m2421k(i - 7, false);
            } else {
                c0584dz.f3082f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                c0584dz.m2421k(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f3585c = false;
        this.f3583a.mo1130c();
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f3583a.mo1133f(z80Var, new qk0(0, 1));
        z80Var.mo748k();
        z80Var.mo752q(new C0825ke(-9223372036854775807L));
    }

    @Override // p000.x80
    public final void release() {
    }
}
