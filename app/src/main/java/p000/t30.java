package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t30 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10734a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6222a(double d) {
        if (ki0.m3841H(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(ki0.m3839B(d)) <= Math.getExponent(d);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6223b(double d) {
        if (d > 0.0d && ki0.m3841H(d)) {
            long jM3839B = ki0.m3839B(d);
            if ((jM3839B & (jM3839B - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m6224c(double d) {
        boolean zM6223b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z = false;
        p32.m5177l(d > 0.0d && ki0.m3841H(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return m6224c(d * 4.503599627370496E15d) - 52;
        }
        switch (s30.f10213a[roundingMode.ordinal()]) {
            case 1:
                p32.m5191v(m6223b(d));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !m6223b(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zM6223b = m6223b(d);
                z &= !zM6223b;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zM6223b = m6223b(d);
                z &= !zM6223b;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }
}
