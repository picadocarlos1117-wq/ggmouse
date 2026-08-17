package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hc2 {

    /* JADX INFO: renamed from: h */
    public static final Map f4525h;

    /* JADX INFO: renamed from: a */
    public final g10 f4526a;

    /* JADX INFO: renamed from: b */
    public final int f4527b;

    /* JADX INFO: renamed from: c */
    public final int f4528c;

    /* JADX INFO: renamed from: d */
    public final int f4529d;

    /* JADX INFO: renamed from: e */
    public final String f4530e;

    /* JADX INFO: renamed from: f */
    public final int f4531f;

    /* JADX INFO: renamed from: g */
    public final C0799jp f4532g;

    static {
        HashMap map = new HashMap();
        C1351r c1351r = e71.f3252a;
        map.put(1, new hc2(10, c1351r));
        map.put(2, new hc2(16, c1351r));
        map.put(3, new hc2(20, c1351r));
        C1351r c1351r2 = e71.f3254c;
        map.put(4, new hc2(10, c1351r2));
        map.put(5, new hc2(16, c1351r2));
        map.put(6, new hc2(20, c1351r2));
        C1351r c1351r3 = e71.f3258g;
        map.put(7, new hc2(10, c1351r3));
        map.put(8, new hc2(16, c1351r3));
        map.put(9, new hc2(20, c1351r3));
        C1351r c1351r4 = e71.f3259h;
        map.put(10, new hc2(10, c1351r4));
        map.put(11, new hc2(16, c1351r4));
        map.put(12, new hc2(20, c1351r4));
        f4525h = Collections.unmodifiableMap(map);
    }

    public hc2(int i, C1351r c1351r) {
        if (i < 2) {
            f40.m2713i("height must be >= 2");
            throw null;
        }
        if (c1351r == null) {
            l41.m4051t("digest == null");
            throw null;
        }
        this.f4527b = i;
        int i2 = 2;
        while (true) {
            int i3 = this.f4527b;
            if (i2 > i3) {
                f40.m2719o("should never happen...");
                throw null;
            }
            if ((i3 - i2) % 2 == 0) {
                this.f4528c = i2;
                String str = (String) l20.f6146b.get(c1351r);
                if (str == null) {
                    l41.m4038g(c1351r, "unrecognized digest oid: ");
                    throw null;
                }
                this.f4530e = str;
                C0799jp c0799jp = new C0799jp(c1351r);
                this.f4532g = c0799jp;
                int i4 = c0799jp.f5482a;
                this.f4531f = i4;
                int i5 = c0799jp.f5483b;
                this.f4529d = i5;
                this.f4526a = (g10) g10.f3945c.get(g10.m2884a(str, i4, i5, c0799jp.f5484c, i));
                return;
            }
            i2++;
        }
    }

    public hc2(int i, r80 r80Var) {
        this(i, l20.m4020b(r80Var.mo3527f()));
    }
}
