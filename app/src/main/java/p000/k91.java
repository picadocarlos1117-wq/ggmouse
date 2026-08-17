package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k91 implements x80 {

    /* JADX INFO: renamed from: a */
    public z80 f5718a;

    /* JADX INFO: renamed from: b */
    public xv1 f5719b;

    /* JADX INFO: renamed from: c */
    public boolean f5720c;

    /* JADX INFO: renamed from: a */
    public final boolean m3812a(y80 y80Var) {
        boolean zM5808v0;
        n91 n91Var = new n91();
        if (n91Var.m4509a(y80Var, true) && (n91Var.f7311a & 2) == 2) {
            int iMin = Math.min(n91Var.f7315e, 8);
            dc1 dc1Var = new dc1(iMin);
            y80Var.mo2413a(0, iMin, dc1Var.f2882a);
            dc1Var.m2316F(0);
            if (dc1Var.m2318a() >= 5 && dc1Var.m2337t() == 127 && dc1Var.m2339v() == 1179402563) {
                this.f5719b = new cb0();
                return true;
            }
            dc1Var.m2316F(0);
            try {
                zM5808v0 = rc2.m5808v0(1, dc1Var, true);
            } catch (fc1 unused) {
                zM5808v0 = false;
            }
            if (zM5808v0) {
                this.f5719b = new u82();
            } else {
                dc1Var.m2316F(0);
                if (db1.m2310e(dc1Var, db1.f2871o)) {
                    this.f5719b = new db1();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x016a  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        byte[] bArr;
        ki0.m3866j(this.f5718a);
        if (this.f5719b == null) {
            if (!m3812a(y80Var)) {
                throw fc1.m2799a(null, "Failed to determine bitstream type");
            }
            y80Var.mo2422l();
        }
        if (!this.f5720c) {
            c22 c22VarMo750n = this.f5718a.mo750n(0, 1);
            this.f5718a.mo748k();
            xv1 xv1Var = this.f5719b;
            xv1Var.f12739c = this.f5718a;
            xv1Var.f12738b = c22VarMo750n;
            xv1Var.mo1201d(true);
            this.f5720c = true;
        }
        xv1 xv1Var2 = this.f5719b;
        m91 m91Var = xv1Var2.f12737a;
        ki0.m3866j(xv1Var2.f12738b);
        int i = z42.f13274a;
        int i2 = xv1Var2.f12744h;
        if (i2 != 0) {
            if (i2 == 1) {
                y80Var.mo2423m((int) xv1Var2.f12742f);
                xv1Var2.f12744h = 2;
                return 0;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return -1;
                }
                l41.m4046o();
                return 0;
            }
            long jMo815a = xv1Var2.f12740d.mo815a(y80Var);
            if (jMo815a >= 0) {
                bb0Var.f1280a = jMo815a;
                return 1;
            }
            if (jMo815a < -1) {
                xv1Var2.mo6406a(-(jMo815a + 2));
            }
            if (!xv1Var2.f12748l) {
                kq1 kq1VarMo816g = xv1Var2.f12740d.mo816g();
                ki0.m3866j(kq1VarMo816g);
                xv1Var2.f12739c.mo752q(kq1VarMo816g);
                xv1Var2.f12748l = true;
            }
            if (xv1Var2.f12747k <= 0 && !m91Var.m4412b(y80Var)) {
                xv1Var2.f12744h = 3;
                return -1;
            }
            xv1Var2.f12747k = 0L;
            dc1 dc1Var = m91Var.f6718b;
            long jMo1199b = xv1Var2.mo1199b(dc1Var);
            if (jMo1199b >= 0) {
                long j = xv1Var2.f12743g;
                if (j + jMo1199b >= xv1Var2.f12741e) {
                    long j2 = (j * 1000000) / ((long) xv1Var2.f12745i);
                    xv1Var2.f12738b.mo1115b(dc1Var, dc1Var.f2884c, 0);
                    xv1Var2.f12738b.mo1114a(j2, 1, dc1Var.f2884c, 0, null);
                    xv1Var2.f12741e = -1L;
                }
            }
            xv1Var2.f12743g += jMo1199b;
            return 0;
        }
        while (true) {
            boolean zM4412b = m91Var.m4412b(y80Var);
            dc1 dc1Var2 = m91Var.f6718b;
            if (!zM4412b) {
                xv1Var2.f12744h = 3;
                return -1;
            }
            long position = y80Var.getPosition();
            long j3 = xv1Var2.f12742f;
            xv1Var2.f12747k = position - j3;
            if (!xv1Var2.mo1200c(dc1Var2, j3, xv1Var2.f12746j)) {
                be0 be0Var = (be0) xv1Var2.f12746j.f9548b;
                xv1Var2.f12745i = be0Var.f1318D;
                if (!xv1Var2.f12749m) {
                    xv1Var2.f12738b.mo1117d(be0Var);
                    xv1Var2.f12749m = true;
                }
                C0642fj c0642fj = (C0642fj) xv1Var2.f12746j.f9549c;
                if (c0642fj == null) {
                    if (y80Var.mo2420i() == -1) {
                        xv1Var2.f12740d = new pu0(11);
                    } else {
                        n91 n91Var = m91Var.f6717a;
                        xv1Var2.f12740d = new b00(xv1Var2, xv1Var2.f12742f, y80Var.mo2420i(), n91Var.f7314d + n91Var.f7315e, n91Var.f7312b, (n91Var.f7311a & 4) != 0);
                    }
                    xv1Var2.f12744h = 2;
                    bArr = dc1Var2.f2882a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    dc1Var2.m2314D(dc1Var2.f2884c, Arrays.copyOf(bArr, Math.max(65025, dc1Var2.f2884c)));
                    return 0;
                }
                xv1Var2.f12740d = c0642fj;
                xv1Var2.f12744h = 2;
                bArr = dc1Var2.f2882a;
                if (bArr.length == 65025) {
                    return 0;
                }
                dc1Var2.m2314D(dc1Var2.f2884c, Arrays.copyOf(bArr, Math.max(65025, dc1Var2.f2884c)));
                return 0;
            }
            xv1Var2.f12742f = y80Var.getPosition();
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        try {
            return m3812a(y80Var);
        } catch (fc1 unused) {
            return false;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        xv1 xv1Var = this.f5719b;
        if (xv1Var != null) {
            m91 m91Var = xv1Var.f12737a;
            n91 n91Var = m91Var.f6717a;
            n91Var.f7311a = 0;
            n91Var.f7312b = 0L;
            n91Var.f7313c = 0;
            n91Var.f7314d = 0;
            n91Var.f7315e = 0;
            m91Var.f6718b.m2313C(0);
            m91Var.f6719c = -1;
            m91Var.f6721e = false;
            if (j == 0) {
                xv1Var.mo1201d(!xv1Var.f12748l);
                return;
            }
            if (xv1Var.f12744h != 0) {
                long j3 = (((long) xv1Var.f12745i) * j2) / 1000000;
                xv1Var.f12741e = j3;
                o91 o91Var = xv1Var.f12740d;
                int i = z42.f13274a;
                o91Var.mo817k(j3);
                xv1Var.f12744h = 2;
            }
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f5718a = z80Var;
    }

    @Override // p000.x80
    public final void release() {
    }
}
