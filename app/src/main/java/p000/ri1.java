package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ri1 {

    /* JADX INFO: renamed from: a */
    public static final qi1 f10056a = new qi1();

    /* JADX INFO: renamed from: b */
    public static final AbstractC1279p1 f10057b;

    static {
        Integer num = zp0.f13520a;
        f10057b = (num == null || num.intValue() >= 34) ? new qd1() : new o90();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo5097a(int i);

    /* JADX INFO: renamed from: b */
    public abstract double mo5098b();

    /* JADX INFO: renamed from: c */
    public double mo5496c() {
        double dMo5098b;
        if (!Double.isInfinite(100.0d) || Math.abs(0.0d) > Double.MAX_VALUE || Math.abs(100.0d) > Double.MAX_VALUE) {
            dMo5098b = 0.0d + (mo5098b() * 100.0d);
        } else {
            double dMo5098b2 = mo5098b() * 50.0d;
            dMo5098b = 0.0d + dMo5098b2 + dMo5098b2;
        }
        return dMo5098b >= 100.0d ? Math.nextAfter(100.0d, Double.NEGATIVE_INFINITY) : dMo5098b;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo5099d();

    /* JADX INFO: renamed from: e */
    public abstract int mo5100e(int i);

    /* JADX INFO: renamed from: f */
    public int mo5485f(int i, int i2) {
        int iMo5099d;
        int i3;
        int iMo5097a;
        if (i2 <= i) {
            f40.m2716l(hr1.m3268d(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo5097a = mo5097a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iMo5099d = mo5099d() >>> 1;
                    i3 = iMo5099d % i4;
                } while ((i4 - 1) + (iMo5099d - i3) < 0);
                iMo5097a = i3;
            }
            return i + iMo5097a;
        }
        while (true) {
            int iMo5099d2 = mo5099d();
            if (i <= iMo5099d2 && iMo5099d2 < i2) {
                return iMo5099d2;
            }
        }
    }
}
