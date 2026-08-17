package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ab0 implements x80 {

    /* JADX INFO: renamed from: e */
    public z80 f128e;

    /* JADX INFO: renamed from: f */
    public c22 f129f;

    /* JADX INFO: renamed from: h */
    public k51 f131h;

    /* JADX INFO: renamed from: i */
    public db0 f132i;

    /* JADX INFO: renamed from: j */
    public int f133j;

    /* JADX INFO: renamed from: k */
    public int f134k;

    /* JADX INFO: renamed from: l */
    public za0 f135l;

    /* JADX INFO: renamed from: m */
    public int f136m;

    /* JADX INFO: renamed from: n */
    public long f137n;

    /* JADX INFO: renamed from: a */
    public final byte[] f124a = new byte[42];

    /* JADX INFO: renamed from: b */
    public final dc1 f125b = new dc1(new byte[32768], 0);

    /* JADX INFO: renamed from: c */
    public final boolean f126c = false;

    /* JADX INFO: renamed from: d */
    public final bb0 f127d = new bb0();

    /* JADX INFO: renamed from: g */
    public int f130g = 0;

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        db0 db0Var;
        kq1 c0825ke;
        long j;
        long j2;
        boolean zM5782f;
        int i = this.f130g;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            boolean z2 = !this.f126c;
            y80Var.mo2422l();
            long jMo2417f = y80Var.mo2417f();
            k51 k51VarM6040J = sc2.m6040J(y80Var, z2);
            y80Var.mo2423m((int) (y80Var.mo2417f() - jMo2417f));
            this.f131h = k51VarM6040J;
            this.f130g = 1;
            return 0;
        }
        byte[] bArr = this.f124a;
        if (i == 1) {
            y80Var.mo2413a(0, bArr.length, bArr);
            y80Var.mo2422l();
            this.f130g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i == 2) {
            dc1 dc1Var = new dc1(4);
            y80Var.readFully(dc1Var.f2882a, 0, 4);
            if (dc1Var.m2339v() != 1716281667) {
                throw fc1.m2799a(null, "Failed to read FLAC stream marker.");
            }
            this.f130g = 3;
            return 0;
        }
        int i5 = 7;
        int i6 = 6;
        if (i == 3) {
            int i7 = 0;
            db0 db0Var2 = this.f132i;
            boolean z3 = false;
            while (!z3) {
                y80Var.mo2422l();
                byte[] bArr2 = new byte[i3];
                C0141cm c0141cm = new C0141cm(bArr2, i3);
                int i8 = i7;
                y80Var.mo2413a(i8, i3, bArr2);
                boolean zM1237h = c0141cm.m1237h();
                int iM1238i = c0141cm.m1238i(i5);
                int iM1238i2 = c0141cm.m1238i(24) + i3;
                if (iM1238i == 0) {
                    byte[] bArr3 = new byte[38];
                    y80Var.readFully(bArr3, i8, 38);
                    db0Var2 = new db0(bArr3, i3);
                } else {
                    if (db0Var2 == null) {
                        l41.m4049r();
                        return 0;
                    }
                    k51 k51Var = db0Var2.f2870l;
                    if (iM1238i == i4) {
                        dc1 dc1Var2 = new dc1(iM1238i2);
                        y80Var.readFully(dc1Var2.f2882a, i8, iM1238i2);
                        db0Var2 = new db0(db0Var2.f2859a, db0Var2.f2860b, db0Var2.f2861c, db0Var2.f2862d, db0Var2.f2863e, db0Var2.f2865g, db0Var2.f2866h, db0Var2.f2868j, sc2.m6045O(dc1Var2), db0Var2.f2870l);
                    } else {
                        if (iM1238i == i3) {
                            dc1 dc1Var3 = new dc1(iM1238i2);
                            y80Var.readFully(dc1Var3.f2882a, 0, iM1238i2);
                            dc1Var3.m2317G(i3);
                            k51 k51VarM5783f0 = rc2.m5783f0(Arrays.asList(rc2.m5788i0(dc1Var3, false, false).f254b));
                            if (k51Var != null) {
                                k51VarM5783f0 = k51Var.m3803b(k51VarM5783f0);
                            }
                            db0Var = new db0(db0Var2.f2859a, db0Var2.f2860b, db0Var2.f2861c, db0Var2.f2862d, db0Var2.f2863e, db0Var2.f2865g, db0Var2.f2866h, db0Var2.f2868j, db0Var2.f2869k, k51VarM5783f0);
                        } else if (iM1238i == i6) {
                            dc1 dc1Var4 = new dc1(iM1238i2);
                            y80Var.readFully(dc1Var4.f2882a, 0, iM1238i2);
                            dc1Var4.m2317G(4);
                            k51 k51Var2 = new k51(qm0.m5570t(dd1.m2345a(dc1Var4)));
                            if (k51Var != null) {
                                k51Var2 = k51Var.m3803b(k51Var2);
                            }
                            db0Var = new db0(db0Var2.f2859a, db0Var2.f2860b, db0Var2.f2861c, db0Var2.f2862d, db0Var2.f2863e, db0Var2.f2865g, db0Var2.f2866h, db0Var2.f2868j, db0Var2.f2869k, k51Var2);
                        } else {
                            y80Var.mo2423m(iM1238i2);
                        }
                        db0Var2 = db0Var;
                    }
                }
                int i9 = z42.f13274a;
                this.f132i = db0Var2;
                z3 = zM1237h;
                i3 = 4;
                i4 = 3;
                i5 = 7;
                i6 = 6;
                i7 = 0;
            }
            this.f132i.getClass();
            this.f133j = Math.max(this.f132i.f2861c, 6);
            c22 c22Var = this.f129f;
            int i10 = z42.f13274a;
            c22Var.mo1117d(this.f132i.m2309c(bArr, this.f131h));
            this.f130g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            y80Var.mo2422l();
            dc1 dc1Var5 = new dc1(2);
            y80Var.mo2413a(0, 2, dc1Var5.f2882a);
            int iM2343z = dc1Var5.m2343z();
            if ((iM2343z >> 2) != 16382) {
                y80Var.mo2422l();
                throw fc1.m2799a(null, "First frame does not start with sync code.");
            }
            y80Var.mo2422l();
            this.f134k = iM2343z;
            z80 z80Var = this.f128e;
            int i11 = z42.f13274a;
            long position = y80Var.getPosition();
            long jMo2420i = y80Var.mo2420i();
            this.f132i.getClass();
            db0 db0Var3 = this.f132i;
            if (db0Var3.f2869k != null) {
                c0825ke = new C0825ke(db0Var3, 1, position);
                i2 = 0;
            } else if (jMo2420i == -1 || db0Var3.f2868j <= 0) {
                i2 = 0;
                c0825ke = new C0825ke(db0Var3.m2308b());
            } else {
                int i12 = this.f134k;
                int i13 = db0Var3.f2861c;
                C1521vl c1521vl = new C1521vl(db0Var3, 17);
                ya0 ya0Var = new ya0(db0Var3, i12);
                long jM2308b = db0Var3.m2308b();
                long j4 = db0Var3.f2868j;
                int i14 = db0Var3.f2862d;
                if (i14 > 0) {
                    j = ((((long) i14) + ((long) i13)) / 2) + 1;
                } else {
                    int i15 = db0Var3.f2859a;
                    j = 64 + (((((i15 != db0Var3.f2860b || i15 <= 0) ? 4096L : i15) * ((long) db0Var3.f2865g)) * ((long) db0Var3.f2866h)) / 8);
                }
                za0 za0Var = new za0(c1521vl, ya0Var, jM2308b, j4, position, jMo2420i, j, Math.max(6, i13));
                this.f135l = za0Var;
                c0825ke = za0Var.f13323a;
            }
            z80Var.mo752q(c0825ke);
            this.f130g = 5;
            return i2;
        }
        if (i != 5) {
            l41.m4046o();
            return 0;
        }
        this.f129f.getClass();
        this.f132i.getClass();
        za0 za0Var2 = this.f135l;
        if (za0Var2 != null && za0Var2.f13325c != null) {
            return za0Var2.m7277b(y80Var, bb0Var);
        }
        if (this.f137n == -1) {
            db0 db0Var4 = this.f132i;
            y80Var.mo2422l();
            y80Var.mo2418g(1);
            byte[] bArr4 = new byte[1];
            y80Var.mo2413a(0, 1, bArr4);
            boolean z4 = (bArr4[0] & 1) == 1;
            y80Var.mo2418g(2);
            i5 = z4 ? 7 : 6;
            dc1 dc1Var6 = new dc1(i5);
            byte[] bArr5 = dc1Var6.f2882a;
            int i16 = 0;
            while (i16 < i5) {
                int iMo2415d = y80Var.mo2415d(i16, i5 - i16, bArr5);
                if (iMo2415d == -1) {
                    break;
                }
                i16 += iMo2415d;
            }
            dc1Var6.m2315E(i16);
            y80Var.mo2422l();
            try {
                long jM2311A = dc1Var6.m2311A();
                if (!z4) {
                    jM2311A *= (long) db0Var4.f2860b;
                }
                j3 = jM2311A;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw fc1.m2799a(null, null);
            }
            this.f137n = j3;
        } else {
            dc1 dc1Var7 = this.f125b;
            int i17 = dc1Var7.f2884c;
            if (i17 < 32768) {
                int i18 = y80Var.read(dc1Var7.f2882a, i17, 32768 - i17);
                z = i18 == -1;
                if (!z) {
                    dc1Var7.m2315E(i17 + i18);
                } else if (dc1Var7.m2318a() == 0) {
                    long j5 = this.f137n * 1000000;
                    db0 db0Var5 = this.f132i;
                    int i19 = z42.f13274a;
                    this.f129f.mo1114a(j5 / ((long) db0Var5.f2863e), 1, this.f136m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i20 = dc1Var7.f2883b;
            int i21 = this.f136m;
            int i22 = this.f133j;
            if (i21 < i22) {
                dc1Var7.m2317G(Math.min(i22 - i21, dc1Var7.m2318a()));
            }
            this.f132i.getClass();
            int i23 = dc1Var7.f2883b;
            while (true) {
                int i24 = dc1Var7.f2884c - 16;
                bb0 bb0Var2 = this.f127d;
                if (i23 > i24) {
                    if (z) {
                        while (true) {
                            int i25 = dc1Var7.f2884c;
                            if (i23 <= i25 - this.f133j) {
                                dc1Var7.m2316F(i23);
                                try {
                                    zM5782f = rc2.m5782f(dc1Var7, this.f132i, this.f134k, bb0Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM5782f = false;
                                }
                                if (dc1Var7.f2883b > dc1Var7.f2884c) {
                                    zM5782f = false;
                                }
                                if (zM5782f) {
                                    dc1Var7.m2316F(i23);
                                    j2 = bb0Var2.f1280a;
                                    break;
                                }
                                i23++;
                            } else {
                                dc1Var7.m2316F(i25);
                            }
                        }
                    } else {
                        dc1Var7.m2316F(i23);
                    }
                    j2 = -1;
                    break;
                }
                dc1Var7.m2316F(i23);
                if (rc2.m5782f(dc1Var7, this.f132i, this.f134k, bb0Var2)) {
                    dc1Var7.m2316F(i23);
                    j2 = bb0Var2.f1280a;
                    break;
                }
                i23++;
            }
            int i26 = dc1Var7.f2883b - i20;
            dc1Var7.m2316F(i20);
            this.f129f.mo1115b(dc1Var7, i26, 0);
            int i27 = this.f136m + i26;
            this.f136m = i27;
            if (j2 != -1) {
                long j6 = this.f137n * 1000000;
                db0 db0Var6 = this.f132i;
                int i28 = z42.f13274a;
                this.f129f.mo1114a(j6 / ((long) db0Var6.f2863e), 1, i27, 0, null);
                this.f136m = 0;
                this.f137n = j2;
            }
            if (dc1Var7.m2318a() < 16) {
                int iM2318a = dc1Var7.m2318a();
                byte[] bArr6 = dc1Var7.f2882a;
                System.arraycopy(bArr6, dc1Var7.f2883b, bArr6, 0, iM2318a);
                dc1Var7.m2316F(0);
                dc1Var7.m2315E(iM2318a);
            }
        }
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        sc2.m6040J(y80Var, false);
        dc1 dc1Var = new dc1(4);
        ((C0584dz) y80Var).mo2416e(dc1Var.f2882a, 0, 4, false);
        return dc1Var.m2339v() == 1716281667;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        if (j == 0) {
            this.f130g = 0;
        } else {
            za0 za0Var = this.f135l;
            if (za0Var != null) {
                za0Var.m7278d(j2);
            }
        }
        this.f137n = j2 != 0 ? -1L : 0L;
        this.f136m = 0;
        this.f125b.m2313C(0);
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f128e = z80Var;
        this.f129f = z80Var.mo750n(0, 1);
        z80Var.mo748k();
    }

    @Override // p000.x80
    public final void release() {
    }
}
