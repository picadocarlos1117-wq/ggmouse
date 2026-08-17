package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ac2 {

    /* JADX INFO: renamed from: e */
    public static final Map f141e;

    /* JADX INFO: renamed from: a */
    public final f10 f142a;

    /* JADX INFO: renamed from: b */
    public final hc2 f143b;

    /* JADX INFO: renamed from: c */
    public final int f144c;

    /* JADX INFO: renamed from: d */
    public final int f145d;

    static {
        HashMap map = new HashMap();
        C1351r c1351r = e71.f3252a;
        map.put(1, new ac2(20, 2, c1351r));
        jd0.m3620r(20, 4, c1351r, map, 2);
        jd0.m3620r(40, 2, c1351r, map, 3);
        jd0.m3620r(40, 4, c1351r, map, 4);
        jd0.m3620r(40, 8, c1351r, map, 5);
        jd0.m3620r(60, 3, c1351r, map, 6);
        jd0.m3620r(60, 6, c1351r, map, 7);
        jd0.m3620r(60, 12, c1351r, map, 8);
        C1351r c1351r2 = e71.f3254c;
        map.put(9, new ac2(20, 2, c1351r2));
        jd0.m3620r(20, 4, c1351r2, map, 10);
        jd0.m3620r(40, 2, c1351r2, map, 11);
        jd0.m3620r(40, 4, c1351r2, map, 12);
        jd0.m3620r(40, 8, c1351r2, map, 13);
        jd0.m3620r(60, 3, c1351r2, map, 14);
        jd0.m3620r(60, 6, c1351r2, map, 15);
        jd0.m3620r(60, 12, c1351r2, map, 16);
        C1351r c1351r3 = e71.f3258g;
        map.put(17, new ac2(20, 2, c1351r3));
        jd0.m3620r(20, 4, c1351r3, map, 18);
        jd0.m3620r(40, 2, c1351r3, map, 19);
        jd0.m3620r(40, 4, c1351r3, map, 20);
        jd0.m3620r(40, 8, c1351r3, map, 21);
        jd0.m3620r(60, 3, c1351r3, map, 22);
        jd0.m3620r(60, 6, c1351r3, map, 23);
        jd0.m3620r(60, 12, c1351r3, map, 24);
        C1351r c1351r4 = e71.f3259h;
        map.put(25, new ac2(20, 2, c1351r4));
        jd0.m3620r(20, 4, c1351r4, map, 26);
        jd0.m3620r(40, 2, c1351r4, map, 27);
        jd0.m3620r(40, 4, c1351r4, map, 28);
        jd0.m3620r(40, 8, c1351r4, map, 29);
        jd0.m3620r(60, 3, c1351r4, map, 30);
        jd0.m3620r(60, 6, c1351r4, map, 31);
        jd0.m3620r(60, 12, c1351r4, map, 32);
        f141e = Collections.unmodifiableMap(map);
    }

    public ac2(int i, int i2, C1351r c1351r) {
        this.f144c = i;
        this.f145d = i2;
        if (i < 2) {
            f40.m2713i("totalHeight must be > 1");
            throw null;
        }
        if (i % i2 != 0) {
            f40.m2713i("layers must divide totalHeight without remainder");
            throw null;
        }
        int i3 = i / i2;
        if (i3 == 1) {
            f40.m2713i("height / layers must be greater than 1");
            throw null;
        }
        hc2 hc2Var = new hc2(i3, c1351r);
        this.f143b = hc2Var;
        int i4 = hc2Var.f4532g.f5484c;
        String str = hc2Var.f4530e;
        if (str != null) {
            this.f142a = (f10) f10.f3575c.get(f10.m2674a(str, hc2Var.f4531f, hc2Var.f4529d, i4, i, i2));
        } else {
            Map map = f10.f3575c;
            l41.m4051t("algorithmName == null");
            throw null;
        }
    }

    public ac2(int i, int i2, r80 r80Var) {
        this(i, i2, l20.m4020b(r80Var.mo3527f()));
    }
}
