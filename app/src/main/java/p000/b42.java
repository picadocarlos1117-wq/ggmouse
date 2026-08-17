package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b42 {
    /* JADX INFO: renamed from: a */
    public static a42 m849a(Object obj) {
        fi0 fi0Var = (fi0) obj;
        a42 a42Var = fi0Var.unknownFields;
        if (a42Var != a42.f44f) {
            return a42Var;
        }
        a42 a42Var2 = new a42();
        fi0Var.unknownFields = a42Var2;
        return a42Var2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m850b(Object obj, C0799jp c0799jp) throws rp0 {
        int i = c0799jp.f5482a;
        AbstractC0762ip abstractC0762ip = (AbstractC0762ip) c0799jp.f5485d;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            c0799jp.m3704x(0);
            ((a42) obj).m80f(i2 << 3, Long.valueOf(abstractC0762ip.mo2628r()));
            return true;
        }
        if (i3 == 1) {
            c0799jp.m3704x(1);
            ((a42) obj).m80f((i2 << 3) | 1, Long.valueOf(abstractC0762ip.mo2625o()));
            return true;
        }
        if (i3 == 2) {
            ((a42) obj).m80f((i2 << 3) | 2, c0799jp.m3685e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw rp0.m5883d();
            }
            c0799jp.m3704x(5);
            ((a42) obj).m80f((i2 << 3) | 5, Integer.valueOf(abstractC0762ip.mo2624n()));
            return true;
        }
        a42 a42Var = new a42();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (c0799jp.m3681a() != Integer.MAX_VALUE && m850b(a42Var, c0799jp)) {
        }
        if (i5 != c0799jp.f5482a) {
            throw rp0.m5880a();
        }
        if (a42Var.f49e) {
            a42Var.f49e = false;
        }
        ((a42) obj).m80f(i4 | 3, a42Var);
        return true;
    }
}
