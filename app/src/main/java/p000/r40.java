package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r40 implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final long f9716a;

    /* JADX INFO: renamed from: b */
    public static final long f9717b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f9718c = 0;

    static {
        int i = s40.f10216a;
        f9716a = hp0.m3221p(4611686018427387903L);
        f9717b = hp0.m3221p(-4611686018427387903L);
    }

    /* JADX INFO: renamed from: a */
    public static final long m5694a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return hp0.m3221p(p32.m5141G(j4));
        }
        long j5 = ((j4 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = s40.f10216a;
        return j5;
    }

    /* JADX INFO: renamed from: b */
    public static final void m5695b(StringBuilder sb, int i, int i2, int i3, String str) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            strValueOf.getClass();
            if (i3 < 0) {
                f40.m2713i(jd0.m3610h(i3, "Desired length ", " is less than zero."));
                return;
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (i7 < 3) {
                sb.append((CharSequence) string, 0, i7);
            } else {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static final long m5696c(long j) {
        return ((((int) j) & 1) != 1 || m5697d(j)) ? m5698e(j, t40.MILLISECONDS) : j >> 1;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m5697d(long j) {
        return j == f9716a || j == f9717b;
    }

    /* JADX INFO: renamed from: e */
    public static final long m5698e(long j, t40 t40Var) {
        if (j == f9716a) {
            return Long.MAX_VALUE;
        }
        if (j == f9717b) {
            return Long.MIN_VALUE;
        }
        return t40Var.f10745a.convert(j >> 1, ((((int) j) & 1) == 0 ? t40.NANOSECONDS : t40.MILLISECONDS).f10745a);
    }
}
