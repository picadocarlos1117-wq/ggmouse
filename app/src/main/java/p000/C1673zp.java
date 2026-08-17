package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: zp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1673zp {

    /* JADX INFO: renamed from: h */
    public static final C1673zp f13512h = new C1673zp(1, 2, 3, null, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f13513a;

    /* JADX INFO: renamed from: b */
    public final int f13514b;

    /* JADX INFO: renamed from: c */
    public final int f13515c;

    /* JADX INFO: renamed from: d */
    public final byte[] f13516d;

    /* JADX INFO: renamed from: e */
    public final int f13517e;

    /* JADX INFO: renamed from: f */
    public final int f13518f;

    /* JADX INFO: renamed from: g */
    public int f13519g;

    static {
        AbstractC1308pu.m5349p(0, 1, 2, 3, 4);
        z42.m7252z(5);
    }

    public C1673zp(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f13513a = i;
        this.f13514b = i2;
        this.f13515c = i3;
        this.f13516d = bArr;
        this.f13517e = i4;
        this.f13518f = i5;
    }

    /* JADX INFO: renamed from: a */
    public static String m7325a(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? jd0.m3609g(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: b */
    public static String m7326b(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? jd0.m3609g(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: c */
    public static String m7327c(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? jd0.m3609g(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7328e(C1673zp c1673zp) {
        if (c1673zp == null) {
            return true;
        }
        int i = c1673zp.f13513a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c1673zp.f13514b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c1673zp.f13515c;
        if ((i3 != -1 && i3 != 3) || c1673zp.f13516d != null) {
            return false;
        }
        int i4 = c1673zp.f13518f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c1673zp.f13517e;
        return i5 == -1 || i5 == 8;
    }

    /* JADX INFO: renamed from: f */
    public static int m7329f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m7330g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7331d() {
        return (this.f13513a == -1 || this.f13514b == -1 || this.f13515c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1673zp.class == obj.getClass()) {
            C1673zp c1673zp = (C1673zp) obj;
            if (this.f13513a == c1673zp.f13513a && this.f13514b == c1673zp.f13514b && this.f13515c == c1673zp.f13515c && Arrays.equals(this.f13516d, c1673zp.f13516d) && this.f13517e == c1673zp.f13517e && this.f13518f == c1673zp.f13518f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13519g == 0) {
            this.f13519g = ((((Arrays.hashCode(this.f13516d) + ((((((527 + this.f13513a) * 31) + this.f13514b) * 31) + this.f13515c) * 31)) * 31) + this.f13517e) * 31) + this.f13518f;
        }
        return this.f13519g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m7326b(this.f13513a));
        sb.append(", ");
        sb.append(m7325a(this.f13514b));
        sb.append(", ");
        sb.append(m7327c(this.f13515c));
        sb.append(", ");
        sb.append(this.f13516d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f13517e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f13518f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return AbstractC1308pu.m5342i(sb, str2, ")");
    }
}
