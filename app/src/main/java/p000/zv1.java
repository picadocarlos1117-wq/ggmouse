package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zv1 extends hw1 {
    /* JADX INFO: renamed from: E0 */
    public static boolean m7365E0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (m7369I0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m7368H0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: G0 */
    public static final int m7367G0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m7368H0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: H0 */
    public static final int m7368H0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ao0 ao0Var;
        boolean z3;
        boolean zRegionMatches;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            ao0Var = new ao0(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            ao0Var = new co0(i, i2, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i3 = ao0Var.f1010c;
        int i4 = ao0Var.f1009b;
        int i5 = ao0Var.f1008a;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str = (String) charSequence2;
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    if (z) {
                        z3 = z;
                        zRegionMatches = str.regionMatches(z3, 0, str2, i6, length3);
                    } else {
                        zRegionMatches = str.regionMatches(0, str2, i6, length3);
                        z3 = z;
                    }
                    if (!zRegionMatches) {
                        if (i6 == i4) {
                            break;
                        }
                        i6 += i3;
                        z = z3;
                    } else {
                        return i6;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!m7375O0(charSequence2, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ int m7369I0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m7367G0(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: J0 */
    public static final int m7370J0(CharSequence charSequence, char[] cArr, int i) {
        charSequence.getClass();
        if (cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1064la.m4159t0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (hr1.m3276l(c, cCharAt, false)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static boolean m7371K0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public static int m7372L0(String str, char c) {
        return str.lastIndexOf(c, str.length() - 1);
    }

    /* JADX INFO: renamed from: M0 */
    public static List m7373M0(String str) {
        ys0 ys0Var = new ys0(str);
        if (!ys0Var.hasNext()) {
            return n60.f7259a;
        }
        Object next = ys0Var.next();
        if (!ys0Var.hasNext()) {
            return AbstractC1337qm.m5511F(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (ys0Var.hasNext()) {
            arrayList.add(ys0Var.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public static String m7374N0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            f40.m2713i(jd0.m3610h(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public static final boolean m7375O0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i >= 0 && charSequence.length() - i2 >= 0 && i <= charSequence2.length() - i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (hr1.m3276l(charSequence.charAt(i3), charSequence2.charAt(i + i3), z)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public static String m7376P0(String str, String str2) {
        str.getClass();
        return hw1.m3309D0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final List m7377Q0(CharSequence charSequence, String str) {
        int iM7367G0 = m7367G0(charSequence, str, 0, false);
        if (iM7367G0 == -1) {
            return AbstractC1337qm.m5511F(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM7367G0).toString());
            length = str.length() + iM7367G0;
            iM7367G0 = m7367G0(charSequence, str, length, false);
        } while (iM7367G0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: R0 */
    public static List m7378R0(String str, char[] cArr) {
        str.getClass();
        int i = 1;
        if (cArr.length == 1) {
            return m7377Q0(str, String.valueOf(cArr[0]));
        }
        C1101ma c1101ma = new C1101ma(new x10(str, new kc0(cArr, 4)), i);
        ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(c1101ma));
        Iterator it = c1101ma.iterator();
        while (true) {
            w10 w10Var = (w10) it;
            if (!w10Var.hasNext()) {
                return arrayList;
            }
            co0 co0Var = (co0) w10Var.next();
            co0Var.getClass();
            arrayList.add(str.subSequence(co0Var.f1008a, co0Var.f1009b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static String m7379S0(String str, String str2, String str3) {
        int iM7369I0 = m7369I0(str, str2, 0, false, 6);
        return iM7369I0 == -1 ? str3 : str.substring(str2.length() + iM7369I0, str.length());
    }

    /* JADX INFO: renamed from: T0 */
    public static String m7380T0(String str, char c) {
        str.getClass();
        str.getClass();
        int iIndexOf = str.indexOf(c, 0);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: U0 */
    public static String m7381U0(String str, String str2) {
        int iM7369I0 = m7369I0(str, str2, 0, false, 6);
        return iM7369I0 == -1 ? str : str.substring(0, iM7369I0);
    }

    /* JADX INFO: renamed from: V0 */
    public static String m7382V0(int i, String str) {
        str.getClass();
        if (i < 0) {
            f40.m2716l(jd0.m3610h(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: W0 */
    public static CharSequence m7383W0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = charSequence.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
