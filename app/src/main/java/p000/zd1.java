package p000;

import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zd1 {

    /* JADX INFO: renamed from: o */
    public static final q01 f13362o = new q01(1);

    /* JADX INFO: renamed from: a */
    public final wd1 f13363a;

    /* JADX INFO: renamed from: b */
    public final c62 f13364b;

    /* JADX INFO: renamed from: c */
    public final g62 f13365c;

    /* JADX INFO: renamed from: d */
    public final yd1 f13366d;

    /* JADX INFO: renamed from: e */
    public final kk1 f13367e;

    /* JADX INFO: renamed from: f */
    public final C0558d8 f13368f;

    /* JADX INFO: renamed from: g */
    public final xy1 f13369g;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArraySet f13370h;

    /* JADX INFO: renamed from: i */
    public be0 f13371i;

    /* JADX INFO: renamed from: j */
    public z52 f13372j;

    /* JADX INFO: renamed from: k */
    public zy1 f13373k;

    /* JADX INFO: renamed from: l */
    public Pair f13374l;

    /* JADX INFO: renamed from: m */
    public int f13375m;

    /* JADX INFO: renamed from: n */
    public int f13376n;

    public zd1(ud1 ud1Var) {
        wd1 wd1Var = new wd1(this, ud1Var.f11263a);
        this.f13363a = wd1Var;
        xy1 xy1Var = ud1Var.f11268f;
        this.f13369g = xy1Var;
        c62 c62Var = ud1Var.f11264b;
        this.f13364b = c62Var;
        c62Var.f1697k = xy1Var;
        g62 g62Var = new g62(new pn0(this), c62Var);
        this.f13365c = g62Var;
        yd1 yd1Var = ud1Var.f11266d;
        ki0.m3866j(yd1Var);
        this.f13366d = yd1Var;
        this.f13367e = ud1Var.f11267e;
        this.f13368f = new C0558d8(c62Var, g62Var);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f13370h = copyOnWriteArraySet;
        this.f13376n = 0;
        copyOnWriteArraySet.add(wd1Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m7303a(zd1 zd1Var, long j, long j2) {
        g62 g62Var = zd1Var.f13365c;
        zd1 zd1Var2 = (zd1) g62Var.f4080a.f8968a;
        c62 c62Var = g62Var.f4081b;
        C0799jp c0799jp = g62Var.f4085f;
        int i = c0799jp.f5483b;
        if (i == 0) {
            return;
        }
        if (i == 0) {
            ca0.m1185q();
            return;
        }
        long j3 = ((long[]) c0799jp.f5485d)[c0799jp.f5482a];
        Long l = (Long) g62Var.f4084e.m3156f(j3);
        int i2 = 2;
        if (l != null && l.longValue() != g62Var.f4088i) {
            g62Var.f4088i = l.longValue();
            c62Var.m1143d(2);
        }
        int iM1140a = g62Var.f4081b.m1140a(j3, j, j2, g62Var.f4088i, false, g62Var.f4082c);
        int i3 = 1;
        if (iM1140a != 0 && iM1140a != 1) {
            if (iM1140a != 2 && iM1140a != 3 && iM1140a != 4) {
                if (iM1140a == 5) {
                    return;
                }
                f40.m2719o(String.valueOf(iM1140a));
                return;
            }
            g62Var.f4089j = j3;
            c0799jp.m3702v();
            for (wd1 wd1Var : zd1Var2.f13370h) {
                wd1Var.f12085m.execute(new vd1(wd1Var, wd1Var.f12084l, i2));
            }
            ki0.m3866j(null);
            throw null;
        }
        g62Var.f4089j = j3;
        long jM3702v = c0799jp.m3702v();
        m62 m62Var = (m62) g62Var.f4083d.m3156f(jM3702v);
        if (m62Var != null && !m62Var.equals(m62.f6671d) && !m62Var.equals(g62Var.f4087h)) {
            g62Var.f4087h = m62Var;
            ae0 ae0Var = new ae0();
            ae0Var.f204t = m62Var.f6672a;
            ae0Var.f205u = m62Var.f6673b;
            ae0Var.f197m = v51.m6582l("video/raw");
            zd1Var2.f13371i = new be0(ae0Var);
            for (wd1 wd1Var2 : zd1Var2.f13370h) {
                wd1Var2.f12085m.execute(new vd1(wd1Var2, wd1Var2.f12084l, m62Var));
            }
        }
        boolean z = c62Var.f1690d != 3;
        c62Var.f1690d = 3;
        c62Var.f1697k.getClass();
        c62Var.f1692f = z42.m7216D(SystemClock.elapsedRealtime());
        if (z && zd1Var2.f13374l != null) {
            for (wd1 wd1Var3 : zd1Var2.f13370h) {
                wd1Var3.f12085m.execute(new vd1(wd1Var3, wd1Var3.f12084l, i3));
            }
        }
        if (zd1Var2.f13372j != null) {
            be0 be0Var = zd1Var2.f13371i;
            be0 be0Var2 = be0Var == null ? new be0(new ae0()) : be0Var;
            z52 z52Var = zd1Var2.f13372j;
            zd1Var2.f13369g.getClass();
            z52Var.mo2287c(jM3702v, System.nanoTime(), be0Var2, null);
        }
        ki0.m3866j(null);
        throw null;
    }
}
