package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l20 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f6145a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f6146b;

    static {
        HashMap map = new HashMap();
        f6145a = map;
        HashMap map2 = new HashMap();
        f6146b = map2;
        C1351r c1351r = e71.f3252a;
        map.put("SHA-256", c1351r);
        C1351r c1351r2 = e71.f3254c;
        map.put("SHA-512", c1351r2);
        C1351r c1351r3 = e71.f3258g;
        map.put("SHAKE128", c1351r3);
        C1351r c1351r4 = e71.f3259h;
        map.put("SHAKE256", c1351r4);
        map2.put(c1351r, "SHA-256");
        map2.put(c1351r2, "SHA-512");
        map2.put(c1351r3, "SHAKE128");
        map2.put(c1351r4, "SHAKE256");
    }

    /* JADX INFO: renamed from: a */
    public static r80 m4019a(C1351r c1351r) {
        if (c1351r.m6676p(e71.f3252a)) {
            return new nn1();
        }
        if (c1351r.m6676p(e71.f3254c)) {
            return new qn1();
        }
        if (c1351r.m6676p(e71.f3258g)) {
            return new rn1(128);
        }
        if (c1351r.m6676p(e71.f3259h)) {
            return new rn1(256);
        }
        l41.m4038g(c1351r, "unrecognized digest OID: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C1351r m4020b(String str) {
        C1351r c1351r = (C1351r) f6145a.get(str);
        if (c1351r != null) {
            return c1351r;
        }
        f40.m2713i(AbstractC1308pu.m5339f("unrecognized digest name: ", str));
        return null;
    }
}
