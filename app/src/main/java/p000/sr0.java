package p000;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 implements m50 {

    /* JADX INFO: renamed from: a */
    public final String f10494a;

    /* JADX INFO: renamed from: b */
    public final int f10495b;

    /* JADX INFO: renamed from: c */
    public final dc1 f10496c;

    /* JADX INFO: renamed from: d */
    public final C0141cm f10497d;

    /* JADX INFO: renamed from: e */
    public c22 f10498e;

    /* JADX INFO: renamed from: f */
    public String f10499f;

    /* JADX INFO: renamed from: g */
    public be0 f10500g;

    /* JADX INFO: renamed from: h */
    public int f10501h;

    /* JADX INFO: renamed from: i */
    public int f10502i;

    /* JADX INFO: renamed from: j */
    public int f10503j;

    /* JADX INFO: renamed from: k */
    public int f10504k;

    /* JADX INFO: renamed from: l */
    public long f10505l;

    /* JADX INFO: renamed from: m */
    public boolean f10506m;

    /* JADX INFO: renamed from: n */
    public int f10507n;

    /* JADX INFO: renamed from: o */
    public int f10508o;

    /* JADX INFO: renamed from: p */
    public int f10509p;

    /* JADX INFO: renamed from: q */
    public boolean f10510q;

    /* JADX INFO: renamed from: r */
    public long f10511r;

    /* JADX INFO: renamed from: s */
    public int f10512s;

    /* JADX INFO: renamed from: t */
    public long f10513t;

    /* JADX INFO: renamed from: u */
    public int f10514u;

    /* JADX INFO: renamed from: v */
    public String f10515v;

    public sr0(String str, int i) {
        this.f10494a = str;
        this.f10495b = i;
        dc1 dc1Var = new dc1(1024);
        this.f10496c = dc1Var;
        byte[] bArr = dc1Var.f2882a;
        this.f10497d = new C0141cm(bArr, bArr.length);
        this.f10505l = -9223372036854775807L;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) throws fc1 {
        int iM1238i;
        int i;
        boolean zM1237h;
        ki0.m3866j(this.f10498e);
        while (dc1Var.m2318a() > 0) {
            int i2 = this.f10501h;
            if (i2 != 0) {
                if (i2 != 1) {
                    dc1 dc1Var2 = this.f10496c;
                    C0141cm c0141cm = this.f10497d;
                    if (i2 == 2) {
                        int iM2337t = ((this.f10504k & (-225)) << 8) | dc1Var.m2337t();
                        this.f10503j = iM2337t;
                        if (iM2337t > dc1Var2.f2882a.length) {
                            dc1Var2.m2313C(iM2337t);
                            byte[] bArr = dc1Var2.f2882a;
                            c0141cm.getClass();
                            c0141cm.m1244o(bArr.length, bArr);
                        }
                        this.f10502i = 0;
                        this.f10501h = 3;
                    } else {
                        if (i2 != 3) {
                            l41.m4046o();
                            return;
                        }
                        int iMin = Math.min(dc1Var.m2318a(), this.f10503j - this.f10502i);
                        dc1Var.m2322e(this.f10502i, iMin, c0141cm.f1858b);
                        int i3 = this.f10502i + iMin;
                        this.f10502i = i3;
                        if (i3 == this.f10503j) {
                            c0141cm.m1246q(0);
                            if (c0141cm.m1237h()) {
                                if (this.f10506m) {
                                }
                                this.f10501h = 0;
                            } else {
                                this.f10506m = true;
                                int iM1238i2 = c0141cm.m1238i(1);
                                int iM1238i3 = iM1238i2 == 1 ? c0141cm.m1238i(1) : 0;
                                this.f10507n = iM1238i3;
                                if (iM1238i3 != 0) {
                                    throw fc1.m2799a(null, null);
                                }
                                if (iM1238i2 == 1) {
                                    c0141cm.m1238i((c0141cm.m1238i(2) + 1) * 8);
                                }
                                if (!c0141cm.m1237h()) {
                                    throw fc1.m2799a(null, null);
                                }
                                this.f10508o = c0141cm.m1238i(6);
                                int iM1238i4 = c0141cm.m1238i(4);
                                int iM1238i5 = c0141cm.m1238i(3);
                                if (iM1238i4 != 0 || iM1238i5 != 0) {
                                    throw fc1.m2799a(null, null);
                                }
                                if (iM1238i2 == 0) {
                                    int iM1236g = c0141cm.m1236g();
                                    int iM1231b = c0141cm.m1231b();
                                    C0586e0 c0586e0M3845P = ki0.m3845P(c0141cm, true);
                                    this.f10515v = c0586e0M3845P.f3087a;
                                    this.f10512s = c0586e0M3845P.f3088b;
                                    this.f10514u = c0586e0M3845P.f3089c;
                                    int iM1231b2 = iM1231b - c0141cm.m1231b();
                                    c0141cm.m1246q(iM1236g);
                                    byte[] bArr2 = new byte[(iM1231b2 + 7) / 8];
                                    c0141cm.m1239j(iM1231b2, bArr2);
                                    ae0 ae0Var = new ae0();
                                    ae0Var.f185a = this.f10499f;
                                    ae0Var.f197m = v51.m6582l("audio/mp4a-latm");
                                    ae0Var.f194j = this.f10515v;
                                    ae0Var.f175B = this.f10514u;
                                    ae0Var.f176C = this.f10512s;
                                    ae0Var.f200p = Collections.singletonList(bArr2);
                                    ae0Var.f188d = this.f10494a;
                                    ae0Var.f190f = this.f10495b;
                                    be0 be0Var = new be0(ae0Var);
                                    if (!be0Var.equals(this.f10500g)) {
                                        this.f10500g = be0Var;
                                        this.f10513t = 1024000000 / ((long) be0Var.f1318D);
                                        this.f10498e.mo1117d(be0Var);
                                    }
                                } else {
                                    int iM1238i6 = c0141cm.m1238i((c0141cm.m1238i(2) + 1) * 8);
                                    int iM1231b3 = c0141cm.m1231b();
                                    C0586e0 c0586e0M3845P2 = ki0.m3845P(c0141cm, true);
                                    this.f10515v = c0586e0M3845P2.f3087a;
                                    this.f10512s = c0586e0M3845P2.f3088b;
                                    this.f10514u = c0586e0M3845P2.f3089c;
                                    c0141cm.m1249t(iM1238i6 - (iM1231b3 - c0141cm.m1231b()));
                                }
                                int iM1238i7 = c0141cm.m1238i(3);
                                this.f10509p = iM1238i7;
                                if (iM1238i7 == 0) {
                                    c0141cm.m1249t(8);
                                } else if (iM1238i7 == 1) {
                                    c0141cm.m1249t(9);
                                } else if (iM1238i7 == 3 || iM1238i7 == 4 || iM1238i7 == 5) {
                                    c0141cm.m1249t(6);
                                } else {
                                    if (iM1238i7 != 6 && iM1238i7 != 7) {
                                        l41.m4046o();
                                        return;
                                    }
                                    c0141cm.m1249t(1);
                                }
                                boolean zM1237h2 = c0141cm.m1237h();
                                this.f10510q = zM1237h2;
                                this.f10511r = 0L;
                                if (zM1237h2) {
                                    if (iM1238i2 == 1) {
                                        this.f10511r = c0141cm.m1238i((c0141cm.m1238i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM1237h = c0141cm.m1237h();
                                            this.f10511r = (this.f10511r << 8) + ((long) c0141cm.m1238i(8));
                                        } while (zM1237h);
                                    }
                                }
                                if (c0141cm.m1237h()) {
                                    c0141cm.m1249t(8);
                                }
                            }
                            if (this.f10507n != 0) {
                                throw fc1.m2799a(null, null);
                            }
                            if (this.f10508o != 0) {
                                throw fc1.m2799a(null, null);
                            }
                            if (this.f10509p != 0) {
                                throw fc1.m2799a(null, null);
                            }
                            int i4 = 0;
                            do {
                                iM1238i = c0141cm.m1238i(8);
                                i4 += iM1238i;
                            } while (iM1238i == 255);
                            int iM1236g2 = c0141cm.m1236g();
                            if ((iM1236g2 & 7) == 0) {
                                dc1Var2.m2316F(iM1236g2 >> 3);
                                i = 0;
                            } else {
                                c0141cm.m1239j(i4 * 8, dc1Var2.f2882a);
                                i = 0;
                                dc1Var2.m2316F(0);
                            }
                            this.f10498e.mo1115b(dc1Var2, i4, i);
                            ki0.m3864h(this.f10505l != -9223372036854775807L);
                            this.f10498e.mo1114a(this.f10505l, 1, i4, 0, null);
                            this.f10505l += this.f10513t;
                            if (this.f10510q) {
                                c0141cm.m1249t((int) this.f10511r);
                            }
                            this.f10501h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM2337t2 = dc1Var.m2337t();
                    if ((iM2337t2 & 224) == 224) {
                        this.f10504k = iM2337t2;
                        this.f10501h = 2;
                    } else if (iM2337t2 != 86) {
                        this.f10501h = 0;
                    }
                }
            } else if (dc1Var.m2337t() == 86) {
                this.f10501h = 1;
            }
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        this.f10501h = 0;
        this.f10505l = -9223372036854775807L;
        this.f10506m = false;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f10505l = j;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f10498e = z80Var.mo750n(qk0Var.f9521c, 1);
        qk0Var.m5500c();
        this.f10499f = (String) qk0Var.f9523e;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
    }
}
