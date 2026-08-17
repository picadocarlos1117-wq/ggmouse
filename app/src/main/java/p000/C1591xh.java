package p000;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: xh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1591xh {

    /* JADX INFO: renamed from: b */
    public static final String f12599b;

    /* JADX INFO: renamed from: c */
    public static final String f12600c;

    /* JADX INFO: renamed from: d */
    public static final C1591xh f12601d;

    /* JADX INFO: renamed from: e */
    public static final C1591xh f12602e;

    /* JADX INFO: renamed from: a */
    public final boolean f12603a;

    static {
        C1146ni c1146ni = pz1.f9243c;
        f12599b = Character.toString((char) 8206);
        f12600c = Character.toString((char) 8207);
        f12601d = new C1591xh(false);
        f12602e = new C1591xh(true);
    }

    public C1591xh(boolean z) {
        C1146ni c1146ni = pz1.f9241a;
        this.f12603a = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m6924a(CharSequence charSequence) {
        byte directionality;
        C1554wh c1554wh = new C1554wh(charSequence);
        c1554wh.f12178c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c1554wh.f12178c;
            if (i4 < c1554wh.f12177b && i == 0) {
                CharSequence charSequence2 = c1554wh.f12176a;
                char cCharAt = charSequence2.charAt(i4);
                c1554wh.f12179d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = c1554wh.f12178c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    c1554wh.f12178c = Character.charCount(iCodePointAt) + c1554wh.f12178c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c1554wh.f12178c = i5 + 1;
                    char c = c1554wh.f12179d;
                    directionality = c < 1792 ? C1554wh.f12175e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (c1554wh.f12178c > 0) {
                    switch (c1554wh.m6791a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m6925b(CharSequence charSequence) {
        C1554wh c1554wh = new C1554wh(charSequence);
        c1554wh.f12178c = c1554wh.f12177b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c1554wh.f12178c > 0) {
                byte bM6791a = c1554wh.m6791a();
                if (bM6791a == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM6791a == 1 || bM6791a == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM6791a != 9) {
                    switch (bM6791a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m6926c(CharSequence charSequence) {
        String str;
        C1146ni c1146ni = pz1.f9243c;
        if (charSequence == null) {
            return null;
        }
        boolean zM4553e = c1146ni.m4553e(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM4553e2 = (zM4553e ? pz1.f9242b : pz1.f9241a).m4553e(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f12600c;
        String str4 = f12599b;
        boolean z = this.f12603a;
        if (z || !(zM4553e2 || m6924a(charSequence) == 1)) {
            str = (!z || (zM4553e2 && m6924a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM4553e != z) {
            spannableStringBuilder.append(zM4553e ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM4553e3 = (zM4553e ? pz1.f9242b : pz1.f9241a).m4553e(charSequence, charSequence.length());
        if (!z && (zM4553e3 || m6925b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zM4553e3 || m6925b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
