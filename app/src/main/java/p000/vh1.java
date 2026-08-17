package p000;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vh1 implements x80 {

    /* JADX INFO: renamed from: e */
    public boolean f11663e;

    /* JADX INFO: renamed from: f */
    public boolean f11664f;

    /* JADX INFO: renamed from: g */
    public boolean f11665g;

    /* JADX INFO: renamed from: h */
    public long f11666h;

    /* JADX INFO: renamed from: i */
    public za0 f11667i;

    /* JADX INFO: renamed from: j */
    public z80 f11668j;

    /* JADX INFO: renamed from: k */
    public boolean f11669k;

    /* JADX INFO: renamed from: a */
    public final y02 f11659a = new y02(0);

    /* JADX INFO: renamed from: c */
    public final dc1 f11661c = new dc1(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f11660b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final th1 f11662d = new th1(0);

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        char c;
        int i;
        long j;
        m50 cj0Var;
        long j2;
        ki0.m3866j(this.f11668j);
        long jMo2420i = y80Var.mo2420i();
        long j3 = -9223372036854775807L;
        th1 th1Var = this.f11662d;
        byte b = 0;
        if (jMo2420i != -1) {
            c = 3;
            if (!th1Var.f10886d) {
                y02 y02Var = th1Var.f10884b;
                dc1 dc1Var = th1Var.f10885c;
                if (!th1Var.f10888f) {
                    long jMo2420i2 = y80Var.mo2420i();
                    int iMin = (int) Math.min(20000L, jMo2420i2);
                    long j4 = jMo2420i2 - ((long) iMin);
                    if (y80Var.getPosition() != j4) {
                        bb0Var.f1280a = j4;
                        return 1;
                    }
                    dc1Var.m2313C(iMin);
                    y80Var.mo2422l();
                    y80Var.mo2413a(0, iMin, dc1Var.f2882a);
                    int i2 = dc1Var.f2883b;
                    for (int i3 = dc1Var.f2884c - 4; i3 >= i2; i3--) {
                        if (th1.m6280b(i3, dc1Var.f2882a) == 442) {
                            dc1Var.m2316F(i3 + 4);
                            long jM6281c = th1.m6281c(dc1Var);
                            if (jM6281c != -9223372036854775807L) {
                                j3 = jM6281c;
                                break;
                            }
                        }
                    }
                    th1Var.f10890h = j3;
                    th1Var.f10888f = true;
                    return 0;
                }
                if (th1Var.f10890h == -9223372036854775807L) {
                    th1Var.m6282a(y80Var);
                    return 0;
                }
                if (th1Var.f10887e) {
                    long j5 = th1Var.f10889g;
                    if (j5 == -9223372036854775807L) {
                        th1Var.m6282a(y80Var);
                        return 0;
                    }
                    th1Var.f10891i = y02Var.m6985c(th1Var.f10890h) - y02Var.m6984b(j5);
                    th1Var.m6282a(y80Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, y80Var.mo2420i());
                if (y80Var.getPosition() != 0) {
                    bb0Var.f1280a = 0L;
                    return 1;
                }
                dc1Var.m2313C(iMin2);
                y80Var.mo2422l();
                y80Var.mo2413a(0, iMin2, dc1Var.f2882a);
                int i4 = dc1Var.f2884c;
                for (int i5 = dc1Var.f2883b; i5 < i4 - 3; i5++) {
                    if (th1.m6280b(i5, dc1Var.f2882a) == 442) {
                        dc1Var.m2316F(i5 + 4);
                        long jM6281c2 = th1.m6281c(dc1Var);
                        if (jM6281c2 != -9223372036854775807L) {
                            j2 = jM6281c2;
                            th1Var.f10889g = j2;
                            th1Var.f10887e = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                th1Var.f10889g = j2;
                th1Var.f10887e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.f11669k) {
            i = 4;
        } else {
            this.f11669k = true;
            long j6 = th1Var.f10891i;
            if (j6 != -9223372036854775807L) {
                i = 4;
                za0 za0Var = new za0(new k50(b, 11), new qo0(th1Var.f10884b), j6, j6 + 1, 0L, jMo2420i, 188L, 1000);
                this.f11667i = za0Var;
                this.f11668j.mo752q(za0Var.f13323a);
            } else {
                i = 4;
                this.f11668j.mo752q(new C0825ke(j6));
            }
        }
        za0 za0Var2 = this.f11667i;
        if (za0Var2 != null && za0Var2.f13325c != null) {
            return za0Var2.m7277b(y80Var, bb0Var);
        }
        y80Var.mo2422l();
        long jMo2417f = jMo2420i != -1 ? jMo2420i - y80Var.mo2417f() : -1L;
        if (jMo2417f != -1 && jMo2417f < 4) {
            return -1;
        }
        dc1 dc1Var2 = this.f11661c;
        if (!y80Var.mo2416e(dc1Var2.f2882a, 0, i, true)) {
            return -1;
        }
        dc1Var2.m2316F(0);
        int iM2324g = dc1Var2.m2324g();
        if (iM2324g == 441) {
            return -1;
        }
        if (iM2324g == 442) {
            y80Var.mo2413a(0, 10, dc1Var2.f2882a);
            dc1Var2.m2316F(9);
            y80Var.mo2423m((dc1Var2.m2337t() & 7) + 14);
            return 0;
        }
        if (iM2324g == 443) {
            y80Var.mo2413a(0, 2, dc1Var2.f2882a);
            dc1Var2.m2316F(0);
            y80Var.mo2423m(dc1Var2.m2343z() + 6);
            return 0;
        }
        if (((iM2324g & (-256)) >> 8) != 1) {
            y80Var.mo2423m(1);
            return 0;
        }
        int i6 = iM2324g & 255;
        SparseArray sparseArray = this.f11660b;
        uh1 uh1Var = (uh1) sparseArray.get(i6);
        if (!this.f11663e) {
            if (uh1Var == null) {
                if (i6 == 189) {
                    cj0Var = new C0588e2();
                    this.f11664f = true;
                    this.f11666h = y80Var.getPosition();
                } else if ((iM2324g & 224) == 192) {
                    cj0Var = new q61(null, 0);
                    this.f11664f = true;
                    this.f11666h = y80Var.getPosition();
                } else if ((iM2324g & 240) == 224) {
                    cj0Var = new cj0(null);
                    this.f11665g = true;
                    this.f11666h = y80Var.getPosition();
                } else {
                    cj0Var = null;
                }
                if (cj0Var != null) {
                    cj0Var.mo1133f(this.f11668j, new qk0(i6, 256));
                    uh1Var = new uh1(cj0Var, this.f11659a);
                    sparseArray.put(i6, uh1Var);
                }
            }
            if (y80Var.getPosition() > ((this.f11664f && this.f11665g) ? this.f11666h + 8192 : 1048576L)) {
                this.f11663e = true;
                this.f11668j.mo748k();
            }
        }
        y80Var.mo2413a(0, 2, dc1Var2.f2882a);
        dc1Var2.m2316F(0);
        int iM2343z = dc1Var2.m2343z() + 6;
        if (uh1Var == null) {
            y80Var.mo2423m(iM2343z);
            return 0;
        }
        dc1Var2.m2313C(iM2343z);
        y80Var.readFully(dc1Var2.f2882a, 0, iM2343z);
        dc1Var2.m2316F(6);
        m50 m50Var = uh1Var.f11295a;
        C0141cm c0141cm = uh1Var.f11297c;
        dc1Var2.m2322e(0, 3, c0141cm.f1858b);
        c0141cm.m1246q(0);
        c0141cm.m1249t(8);
        uh1Var.f11298d = c0141cm.m1237h();
        uh1Var.f11299e = c0141cm.m1237h();
        c0141cm.m1249t(6);
        dc1Var2.m2322e(0, c0141cm.m1238i(8), c0141cm.f1858b);
        c0141cm.m1246q(0);
        y02 y02Var2 = uh1Var.f11296b;
        uh1Var.f11301g = 0L;
        if (uh1Var.f11298d) {
            c0141cm.m1249t(i);
            long jM1238i = ((long) c0141cm.m1238i(3)) << 30;
            c0141cm.m1249t(1);
            long jM1238i2 = jM1238i | ((long) (c0141cm.m1238i(15) << 15));
            c0141cm.m1249t(1);
            long jM1238i3 = jM1238i2 | ((long) c0141cm.m1238i(15));
            c0141cm.m1249t(1);
            if (uh1Var.f11300f || !uh1Var.f11299e) {
                j = jM1238i3;
            } else {
                c0141cm.m1249t(i);
                long jM1238i4 = ((long) c0141cm.m1238i(3)) << 30;
                c0141cm.m1249t(1);
                long jM1238i5 = ((long) (c0141cm.m1238i(15) << 15)) | jM1238i4;
                c0141cm.m1249t(1);
                long jM1238i6 = jM1238i5 | ((long) c0141cm.m1238i(15));
                c0141cm.m1249t(1);
                y02Var2.m6984b(jM1238i6);
                uh1Var.f11300f = true;
                j = jM1238i3;
            }
            uh1Var.f11301g = y02Var2.m6984b(j);
        }
        m50Var.mo1132e(i, uh1Var.f11301g);
        m50Var.mo1129a(dc1Var2);
        m50Var.mo1131d(false);
        dc1Var2.m2315E(dc1Var2.f2882a.length);
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        byte[] bArr = new byte[14];
        C0584dz c0584dz = (C0584dz) y80Var;
        c0584dz.mo2416e(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c0584dz.m2421k(bArr[13] & 7, false);
            c0584dz.mo2416e(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.f11660b;
        y02 y02Var = this.f11659a;
        synchronized (y02Var) {
            j3 = y02Var.f12797b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jM6986d = y02Var.m6986d();
            z = (jM6986d == -9223372036854775807L || jM6986d == 0 || jM6986d == j2) ? false : true;
        }
        if (z) {
            y02Var.m6987e(j2);
        }
        za0 za0Var = this.f11667i;
        if (za0Var != null) {
            za0Var.m7278d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            uh1 uh1Var = (uh1) sparseArray.valueAt(i);
            uh1Var.f11300f = false;
            uh1Var.f11295a.mo1130c();
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f11668j = z80Var;
    }

    @Override // p000.x80
    public final void release() {
    }
}
