package p000;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: vy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1534vy {

    /* JADX INFO: renamed from: n */
    public static final kk1 f11837n = qm0.m5569s(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: o */
    public static final kk1 f11838o = qm0.m5569s(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: p */
    public static final kk1 f11839p = qm0.m5569s(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: q */
    public static final kk1 f11840q = qm0.m5569s(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: r */
    public static final kk1 f11841r = qm0.m5569s(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: s */
    public static final kk1 f11842s = qm0.m5569s(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: t */
    public static C1534vy f11843t;

    /* JADX INFO: renamed from: a */
    public final pk1 f11844a;

    /* JADX INFO: renamed from: b */
    public final ay0 f11845b = new ay0(8);

    /* JADX INFO: renamed from: c */
    public final xy1 f11846c;

    /* JADX INFO: renamed from: d */
    public final boolean f11847d;

    /* JADX INFO: renamed from: e */
    public final it1 f11848e;

    /* JADX INFO: renamed from: f */
    public int f11849f;

    /* JADX INFO: renamed from: g */
    public long f11850g;

    /* JADX INFO: renamed from: h */
    public long f11851h;

    /* JADX INFO: renamed from: i */
    public long f11852i;

    /* JADX INFO: renamed from: j */
    public long f11853j;

    /* JADX INFO: renamed from: k */
    public long f11854k;

    /* JADX INFO: renamed from: l */
    public long f11855l;

    /* JADX INFO: renamed from: m */
    public int f11856m;

    public C1534vy(Context context, Map map, int i, xy1 xy1Var, boolean z) {
        this.f11844a = pk1.m5273a(map);
        this.f11848e = new it1(i);
        this.f11846c = xy1Var;
        this.f11847d = z;
        if (context == null) {
            this.f11856m = 0;
            this.f11854k = m6667a(0);
            return;
        }
        l81 l81VarM4141c = l81.m4141c(context);
        int iM4143d = l81VarM4141c.m4143d();
        this.f11856m = iM4143d;
        this.f11854k = m6667a(iM4143d);
        C1460ty c1460ty = new C1460ty(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) l81VarM4141c.f6262c;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c1460ty));
        ((Handler) l81VarM4141c.f6261b).post(new RunnableC1467u4(21, l81VarM4141c, c1460ty));
    }

    /* JADX INFO: renamed from: a */
    public final long m6667a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        pk1 pk1Var = this.f11844a;
        Long l = (Long) pk1Var.get(numValueOf);
        if (l == null) {
            l = (Long) pk1Var.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m6668b(long j, long j2, int i) {
        final long j3;
        final long j4;
        final int i2;
        if (i == 0 && j == 0 && j2 == this.f11855l) {
            return;
        }
        this.f11855l = j2;
        for (final C1516vg c1516vg : (CopyOnWriteArrayList) this.f11845b.f1096b) {
            if (c1516vg.f11654c) {
                j3 = j;
                j4 = j2;
                i2 = i;
            } else {
                j3 = j;
                j4 = j2;
                i2 = i;
                c1516vg.f11652a.post(new Runnable() { // from class: ug
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0808jy c0808jy = c1516vg.f11653b;
                        C1470u7 c1470u7 = c0808jy.f5591d;
                        C1542w5 c1542w5M3720g = c0808jy.m3720g(((qm0) c1470u7.f11142b).isEmpty() ? null : (q21) sc2.m6076t((qm0) c1470u7.f11142b));
                        c0808jy.m3724k(c1542w5M3720g, 1006, new C0770iy(c1542w5M3720g, i2, j3, j4));
                    }
                });
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }
}
