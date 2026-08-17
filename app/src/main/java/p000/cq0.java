package p000;

import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 implements x80 {

    /* JADX INFO: renamed from: b */
    public z80 f2592b;

    /* JADX INFO: renamed from: c */
    public int f2593c;

    /* JADX INFO: renamed from: d */
    public int f2594d;

    /* JADX INFO: renamed from: e */
    public int f2595e;

    /* JADX INFO: renamed from: g */
    public g61 f2597g;

    /* JADX INFO: renamed from: h */
    public y80 f2598h;

    /* JADX INFO: renamed from: i */
    public C1289pb f2599i;

    /* JADX INFO: renamed from: j */
    public n61 f2600j;

    /* JADX INFO: renamed from: a */
    public final dc1 f2591a = new dc1(6);

    /* JADX INFO: renamed from: f */
    public long f2596f = -1;

    /* JADX INFO: renamed from: a */
    public final void m2116a() {
        z80 z80Var = this.f2592b;
        z80Var.getClass();
        z80Var.mo748k();
        this.f2592b.mo752q(new C0825ke(-9223372036854775807L));
        this.f2593c = 6;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        String strM2332o;
        C1289pb c1289pbM6038H;
        kk1 kk1Var;
        int i;
        g61 g61Var;
        long j;
        int i2 = this.f2593c;
        dc1 dc1Var = this.f2591a;
        if (i2 == 0) {
            dc1Var.m2313C(2);
            y80Var.readFully(dc1Var.f2882a, 0, 2);
            int iM2343z = dc1Var.m2343z();
            this.f2594d = iM2343z;
            if (iM2343z == 65498) {
                if (this.f2596f != -1) {
                    this.f2593c = 4;
                    return 0;
                }
                m2116a();
                return 0;
            }
            if ((iM2343z < 65488 || iM2343z > 65497) && iM2343z != 65281) {
                this.f2593c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            dc1Var.m2313C(2);
            y80Var.readFully(dc1Var.f2882a, 0, 2);
            this.f2595e = dc1Var.m2343z() - 2;
            this.f2593c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    l41.m4046o();
                    return 0;
                }
                if (this.f2599i == null || y80Var != this.f2598h) {
                    this.f2598h = y80Var;
                    this.f2599i = new C1289pb(y80Var, this.f2596f);
                }
                n61 n61Var = this.f2600j;
                n61Var.getClass();
                int iMo124b = n61Var.mo124b(this.f2599i, bb0Var);
                if (iMo124b == 1) {
                    bb0Var.f1280a += this.f2596f;
                }
                return iMo124b;
            }
            long position = y80Var.getPosition();
            long j2 = this.f2596f;
            if (position != j2) {
                bb0Var.f1280a = j2;
                return 1;
            }
            if (!y80Var.mo2416e(dc1Var.f2882a, 0, 1, true)) {
                m2116a();
                return 0;
            }
            y80Var.mo2422l();
            if (this.f2600j == null) {
                this.f2600j = new n61(wx1.f12357k, 8);
            }
            C1289pb c1289pb = new C1289pb(y80Var, this.f2596f);
            this.f2599i = c1289pb;
            if (!this.f2600j.mo125e(c1289pb)) {
                m2116a();
                return 0;
            }
            n61 n61Var2 = this.f2600j;
            long j3 = this.f2596f;
            z80 z80Var = this.f2592b;
            z80Var.getClass();
            n61Var2.mo127k(new C1289pb(z80Var, 4, j3));
            g61 g61Var2 = this.f2597g;
            g61Var2.getClass();
            z80 z80Var2 = this.f2592b;
            z80Var2.getClass();
            c22 c22VarMo750n = z80Var2.mo750n(1024, 4);
            ae0 ae0Var = new ae0();
            ae0Var.f196l = v51.m6582l("image/jpeg");
            ae0Var.f195k = new k51(g61Var2);
            c22VarMo750n.mo1117d(new be0(ae0Var));
            this.f2593c = 5;
            return 0;
        }
        if (this.f2594d == 65505) {
            dc1 dc1Var2 = new dc1(this.f2595e);
            y80Var.readFully(dc1Var2.f2882a, 0, this.f2595e);
            if (this.f2597g == null && "http://ns.adobe.com/xap/1.0/".equals(dc1Var2.m2332o()) && (strM2332o = dc1Var2.m2332o()) != null) {
                long jMo2420i = y80Var.mo2420i();
                if (jMo2420i == -1) {
                    g61Var = null;
                } else {
                    try {
                        c1289pbM6038H = sc2.m6038H(strM2332o);
                    } catch (fc1 | NumberFormatException | XmlPullParserException unused) {
                        AbstractC1337qm.m5542i0("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c1289pbM6038H = null;
                    }
                    if (c1289pbM6038H != null && (i = (kk1Var = (kk1) c1289pbM6038H.f8827c).f5898d) >= 2) {
                        int i3 = i - 1;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        boolean z = false;
                        while (i3 >= 0) {
                            f61 f61Var = (f61) kk1Var.get(i3);
                            boolean zEquals = "video/mp4".equals(f61Var.f3624a) | z;
                            if (i3 == 0) {
                                jMo2420i -= f61Var.f3626c;
                                j = 0;
                            } else {
                                j = jMo2420i - f61Var.f3625b;
                            }
                            long j8 = j;
                            long j9 = jMo2420i;
                            jMo2420i = j8;
                            if (zEquals && jMo2420i != j9) {
                                j7 = j9 - jMo2420i;
                                j6 = jMo2420i;
                                zEquals = false;
                            }
                            if (i3 == 0) {
                                j4 = jMo2420i;
                                j5 = j9;
                            }
                            i3--;
                            z = zEquals;
                        }
                        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                            g61Var = null;
                        } else {
                            g61Var = new g61(j4, j5, c1289pbM6038H.f8826b, j6, j7);
                        }
                    } else {
                        g61Var = null;
                    }
                }
                this.f2597g = g61Var;
                if (g61Var != null) {
                    this.f2596f = g61Var.f4078d;
                }
            }
        } else {
            y80Var.mo2423m(this.f2595e);
        }
        this.f2593c = 0;
        return 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        C0584dz c0584dz = (C0584dz) y80Var;
        dc1 dc1Var = this.f2591a;
        dc1Var.m2313C(2);
        c0584dz.mo2416e(dc1Var.f2882a, 0, 2, false);
        if (dc1Var.m2343z() == 65496) {
            dc1Var.m2313C(2);
            c0584dz.mo2416e(dc1Var.f2882a, 0, 2, false);
            int iM2343z = dc1Var.m2343z();
            this.f2594d = iM2343z;
            if (iM2343z == 65504) {
                dc1Var.m2313C(2);
                c0584dz.mo2416e(dc1Var.f2882a, 0, 2, false);
                c0584dz.m2421k(dc1Var.m2343z() - 2, false);
                dc1Var.m2313C(2);
                c0584dz.mo2416e(dc1Var.f2882a, 0, 2, false);
                this.f2594d = dc1Var.m2343z();
            }
            if (this.f2594d == 65505) {
                c0584dz.m2421k(2, false);
                dc1Var.m2313C(6);
                c0584dz.mo2416e(dc1Var.f2882a, 0, 6, false);
                if (dc1Var.m2339v() == 1165519206 && dc1Var.m2343z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        if (j == 0) {
            this.f2593c = 0;
            this.f2600j = null;
        } else if (this.f2593c == 5) {
            n61 n61Var = this.f2600j;
            n61Var.getClass();
            n61Var.mo126f(j, j2);
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f2592b = z80Var;
    }

    @Override // p000.x80
    public final void release() {
        n61 n61Var = this.f2600j;
        if (n61Var != null) {
            n61Var.getClass();
        }
    }
}
