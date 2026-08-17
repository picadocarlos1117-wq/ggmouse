package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hw1 extends gw1 {
    /* JADX INFO: renamed from: A0 */
    public static boolean m3306A0(String str, String str2) {
        str.getClass();
        return str.endsWith(str2);
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m3307B0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: C0 */
    public static String m3308C0(String str, String str2, String str3) {
        str.getClass();
        int iM7367G0 = zv1.m7367G0(str, str2, 0, false);
        if (iM7367G0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            ca0.m1173e();
            return null;
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM7367G0);
            sb.append(str3);
            i2 = iM7367G0 + length;
            if (iM7367G0 >= str.length()) {
                break;
            }
            iM7367G0 = zv1.m7367G0(str, str2, iM7367G0 + i, false);
        } while (iM7367G0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m3309D0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }
}
