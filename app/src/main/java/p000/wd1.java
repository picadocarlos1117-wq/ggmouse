package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f12073a;

    /* JADX INFO: renamed from: b */
    public final b62 f12074b;

    /* JADX INFO: renamed from: c */
    public be0 f12075c;

    /* JADX INFO: renamed from: d */
    public long f12076d;

    /* JADX INFO: renamed from: e */
    public long f12077e;

    /* JADX INFO: renamed from: f */
    public long f12078f;

    /* JADX INFO: renamed from: g */
    public long f12079g;

    /* JADX INFO: renamed from: h */
    public long f12080h;

    /* JADX INFO: renamed from: i */
    public boolean f12081i;

    /* JADX INFO: renamed from: j */
    public boolean f12082j;

    /* JADX INFO: renamed from: k */
    public long f12083k;

    /* JADX INFO: renamed from: l */
    public k62 f12084l;

    /* JADX INFO: renamed from: m */
    public Executor f12085m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ zd1 f12086n;

    public wd1(zd1 zd1Var, Context context) {
        this.f12086n = zd1Var;
        z42.m7214B(context);
        this.f12073a = new ArrayList();
        this.f12074b = new b62();
        this.f12080h = -9223372036854775807L;
        this.f12084l = k62.f5685l;
        this.f12085m = zd1.f13362o;
    }

    /* JADX INFO: renamed from: a */
    public final void m6750a(boolean z) {
        this.f12081i = false;
        this.f12080h = -9223372036854775807L;
        zd1 zd1Var = this.f12086n;
        if (zd1Var.f13376n == 1) {
            zd1Var.f13375m++;
            C0558d8 c0558d8 = zd1Var.f13368f;
            if (z) {
                c62 c62Var = (c62) c0558d8.f2821b;
                f62 f62Var = c62Var.f1688b;
                f62Var.f3639m = 0L;
                f62Var.f3642p = -1L;
                f62Var.f3640n = -1L;
                c62Var.f1693g = -9223372036854775807L;
                c62Var.f1691e = -9223372036854775807L;
                c62Var.m1143d(1);
                c62Var.f1694h = -9223372036854775807L;
            }
            g62 g62Var = (g62) c0558d8.f2822c;
            C0716hj c0716hj = g62Var.f4083d;
            C0799jp c0799jp = g62Var.f4085f;
            c0799jp.f5482a = 0;
            c0799jp.f5483b = 0;
            g62Var.f4089j = -9223372036854775807L;
            C0716hj c0716hj2 = g62Var.f4084e;
            if (c0716hj2.m3158h() > 0) {
                ki0.m3857c(c0716hj2.m3158h() > 0);
                while (c0716hj2.m3158h() > 1) {
                    c0716hj2.m3155e();
                }
                Object objM3155e = c0716hj2.m3155e();
                objM3155e.getClass();
                c0716hj2.m3151a(0L, (Long) objM3155e);
            }
            if (g62Var.f4086g != null) {
                c0716hj.m3152b();
            } else if (c0716hj.m3158h() > 0) {
                ki0.m3857c(c0716hj.m3158h() > 0);
                while (c0716hj.m3158h() > 1) {
                    c0716hj.m3155e();
                }
                Object objM3155e2 = c0716hj.m3155e();
                objM3155e2.getClass();
                g62Var.f4086g = (m62) objM3155e2;
            }
            zy1 zy1Var = zd1Var.f13373k;
            ki0.m3866j(zy1Var);
            zy1Var.m7387c(new RunnableC1430t4(zd1Var, 23));
        }
        this.f12083k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r8 >= r4) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6751b(long r18, boolean r20, long r21, long r23, p000.C0082b0 r25) throws p000.l62 {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            zd1 r2 = r1.f12086n
            r3 = 0
            p000.ki0.m3864h(r3)
            long r4 = r1.f12078f
            long r7 = r18 - r4
            c62 r6 = r2.f13364b     // Catch: p000.t70 -> L6e
            long r13 = r1.f12076d     // Catch: p000.t70 -> L6e
            b62 r4 = r1.f12074b     // Catch: p000.t70 -> L6e
            r15 = r20
            r9 = r21
            r11 = r23
            r16 = r4
            int r4 = r6.m1140a(r7, r9, r11, r13, r15, r16)     // Catch: p000.t70 -> L6e
            r5 = 4
            if (r4 != r5) goto L24
            return r3
        L24:
            long r4 = r1.f12079g
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 >= 0) goto L3b
            if (r20 != 0) goto L3b
            java.lang.Object r1 = r0.f1105d
            p11 r1 = (p000.p11) r1
            java.lang.Object r2 = r0.f1104c
            z01 r2 = (p000.z01) r2
            int r0 = r0.f1103b
            r1.m5113G0(r2, r0)
            r0 = 1
            return r0
        L3b:
            r9 = r21
            r11 = r23
            r1.m6755f(r9, r11)
            boolean r0 = r1.f12082j
            if (r0 == 0) goto L69
            long r4 = r1.f12083k
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L62
            int r0 = r2.f13375m
            if (r0 != 0) goto L61
            g62 r0 = r2.f13365c
            long r8 = r0.f4089j
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L61
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L62
        L61:
            return r3
        L62:
            r1.m6754e()
            r1.f12082j = r3
            r1.f12083k = r6
        L69:
            r0 = 0
            p000.ki0.m3866j(r0)
            throw r0
        L6e:
            r0 = move-exception
            l62 r2 = new l62
            be0 r1 = r1.f12075c
            p000.ki0.m3866j(r1)
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wd1.m6751b(long, boolean, long, long, b0):boolean");
    }

    /* JADX INFO: renamed from: c */
    public final void m6752c(be0 be0Var) {
        zd1 zd1Var = this.f12086n;
        ki0.m3864h(zd1Var.f13376n == 0);
        C1673zp c1673zp = be0Var.f1316B;
        if (c1673zp == null || !c1673zp.m7331d()) {
            c1673zp = C1673zp.f13512h;
        }
        if (c1673zp.f13515c != 7 || z42.f13274a < 34) {
        }
        xy1 xy1Var = zd1Var.f13369g;
        Looper looperMyLooper = Looper.myLooper();
        ki0.m3866j(looperMyLooper);
        zd1Var.f13373k = xy1Var.m6981a(looperMyLooper, null);
        try {
            yd1 yd1Var = zd1Var.f13366d;
            kk1 kk1Var = kk1.f5896e;
            yd1Var.m7078a();
            Pair pair = zd1Var.f13374l;
            if (pair == null) {
                throw null;
            }
            int i = ((gt1) pair.second).f4319a;
            throw null;
        } catch (a62 e) {
            throw new l62(e, be0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6753d(boolean z) {
        ((c62) this.f12086n.f13368f.f2821b).m1142c(z);
    }

    /* JADX INFO: renamed from: e */
    public final void m6754e() {
        if (this.f12075c == null) {
            return;
        }
        new ArrayList(this.f12073a);
        be0 be0Var = this.f12075c;
        be0Var.getClass();
        ki0.m3866j(null);
        C1673zp c1673zp = be0Var.f1316B;
        if (c1673zp == null || !c1673zp.m7331d()) {
            C1673zp c1673zp2 = C1673zp.f13512h;
        }
        int i = be0Var.f1348u;
        int i2 = be0Var.f1349v;
        ki0.m3859d(i > 0, "width must be positive, but is: " + i);
        ki0.m3859d(i2 > 0, "height must be positive, but is: " + i2);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final void m6755f(long j, long j2) {
        try {
            zd1.m7303a(this.f12086n, j, j2);
        } catch (t70 e) {
            be0 be0Var = this.f12075c;
            if (be0Var == null) {
                be0Var = new be0(new ae0());
            }
            throw new l62(e, be0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6756g(int i) {
        f62 f62Var = ((c62) this.f12086n.f13368f.f2821b).f1688b;
        if (f62Var.f3636j == i) {
            return;
        }
        f62Var.f3636j = i;
        f62Var.m2730d(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m6757h(Surface surface, gt1 gt1Var) {
        zd1 zd1Var = this.f12086n;
        Pair pair = zd1Var.f13374l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((gt1) zd1Var.f13374l.second).equals(gt1Var)) {
            return;
        }
        zd1Var.f13374l = Pair.create(surface, gt1Var);
        int i = gt1Var.f4319a;
    }

    /* JADX INFO: renamed from: i */
    public final void m6758i(float f) {
        ((c62) this.f12086n.f13368f.f2821b).m1147h(f);
    }

    /* JADX INFO: renamed from: j */
    public final void m6759j(long j, long j2, long j3, long j4) {
        if (this.f12077e == j2) {
            int i = (this.f12078f > j3 ? 1 : (this.f12078f == j3 ? 0 : -1));
        }
        this.f12076d = j;
        this.f12077e = j2;
        this.f12078f = j3;
        this.f12079g = j4;
    }

    /* JADX INFO: renamed from: k */
    public final void m6760k(List list) {
        ArrayList arrayList = this.f12073a;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f12086n.f13367e);
        m6754e();
    }
}
