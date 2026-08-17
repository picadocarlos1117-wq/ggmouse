package p000;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h92 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f4479c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f4480d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final dc1 f4481a = new dc1();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f4482b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m3114a(dc1 dc1Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = dc1Var.f2883b;
        int i2 = dc1Var.f2884c;
        while (i < i2 && !z) {
            char c = (char) dc1Var.f2882a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        dc1Var.m2317G(i - dc1Var.f2883b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m3115b(dc1 dc1Var, StringBuilder sb) {
        m3116c(dc1Var);
        if (dc1Var.m2318a() == 0) {
            return null;
        }
        String strM3114a = m3114a(dc1Var, sb);
        if (!"".equals(strM3114a)) {
            return strM3114a;
        }
        return "" + ((char) dc1Var.m2337t());
    }

    /* JADX INFO: renamed from: c */
    public static void m3116c(dc1 dc1Var) {
        while (true) {
            for (boolean z = true; dc1Var.m2318a() > 0 && z; z = false) {
                int i = dc1Var.f2883b;
                byte[] bArr = dc1Var.f2882a;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    dc1Var.m2317G(1);
                } else {
                    int i2 = dc1Var.f2884c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            dc1Var.m2317G(i2 - dc1Var.f2883b);
                        }
                    }
                }
            }
            return;
        }
    }
}
