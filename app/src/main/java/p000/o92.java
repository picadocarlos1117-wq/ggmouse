package p000;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o92 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f7703a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f7704b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f7705c;

    /* JADX INFO: renamed from: d */
    public static final Map f7706d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f7705c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f7706d = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m4779a(String str, l92 l92Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int i2;
        int i3;
        int i4 = l92Var.f6282b;
        int length = spannableStringBuilder.length();
        String str2 = l92Var.f6281a;
        str2.getClass();
        int i5 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case "c":
                for (String str3 : l92Var.f6284d) {
                    Map map = f7705c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = f7706d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new q82(l92Var.f6283c), i4, length, 33);
                break;
            case "ruby":
                int iM4781c = m4781c(list2, str, l92Var);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, k92.f5721c);
                int i6 = l92Var.f6282b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((k92) arrayList.get(i7)).f5722a.f6281a)) {
                        k92 k92Var = (k92) arrayList.get(i7);
                        int iM4781c2 = m4781c(list2, str, k92Var.f5722a);
                        if (iM4781c2 == i5) {
                            iM4781c2 = iM4781c != i5 ? iM4781c : 1;
                        }
                        int i8 = k92Var.f5722a.f6282b - length2;
                        int i9 = k92Var.f5723b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new fn1(charSequenceSubSequence.toString(), iM4781c2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM4780b = m4780b(list2, str, l92Var);
        for (int i10 = 0; i10 < arrayListM4780b.size(); i10++) {
            i92 i92Var = ((m92) arrayListM4780b.get(i10)).f6723b;
            int i11 = i92Var.f4896l;
            if (i11 == -1 && i92Var.f4897m == -1) {
                i = -1;
            } else {
                i = (i92Var.f4897m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i12 = i92Var.f4896l;
                if (i12 == -1 && i92Var.f4897m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i12 == 1 ? 1 : 0) | (i92Var.f4897m == 1 ? 2 : 0);
                }
                hp0.m3212c(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (i92Var.f4894j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (i92Var.f4895k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (i92Var.f4891g) {
                if (!i92Var.f4891g) {
                    f40.m2719o("Font color not defined");
                    return;
                }
                hp0.m3212c(spannableStringBuilder, new ForegroundColorSpan(i92Var.f4890f), i4, length);
            }
            if (i92Var.f4893i) {
                if (!i92Var.f4893i) {
                    f40.m2719o("Background color not defined.");
                    return;
                }
                hp0.m3212c(spannableStringBuilder, new BackgroundColorSpan(i92Var.f4892h), i4, length);
            }
            if (i92Var.f4889e != null) {
                hp0.m3212c(spannableStringBuilder, new TypefaceSpan(i92Var.f4889e), i4, length);
            }
            int i13 = i92Var.f4898n;
            if (i13 == 1) {
                hp0.m3212c(spannableStringBuilder, new AbsoluteSizeSpan((int) i92Var.f4899o, true), i4, length);
            } else if (i13 == 2) {
                hp0.m3212c(spannableStringBuilder, new RelativeSizeSpan(i92Var.f4899o), i4, length);
            } else if (i13 == 3) {
                hp0.m3212c(spannableStringBuilder, new RelativeSizeSpan(i92Var.f4899o / 100.0f), i4, length);
            }
            if (i92Var.f4901q) {
                spannableStringBuilder.setSpan(new nk0(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m4780b(List list, String str, l92 l92Var) {
        Object r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            i92 i92Var = (i92) list.get(i);
            String str2 = l92Var.f6281a;
            Set set = l92Var.f6284d;
            String str3 = l92Var.f6283c;
            if (i92Var.f4885a.isEmpty() && i92Var.f4886b.isEmpty() && i92Var.f4887c.isEmpty() && i92Var.f4888d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM3397a = i92.m3397a(i92Var.f4888d, i92.m3397a(i92Var.f4886b, i92.m3397a(i92Var.f4885a, 0, 1073741824, str), 2, str2), 4, str3);
                if (iM3397a == -1 || !set.containsAll(i92Var.f4887c)) {
                    r4 = 0;
                } else {
                    size = iM3397a + (i92Var.f4887c.size() * 4);
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new m92(r4, i92Var));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m4781c(List list, String str, l92 l92Var) {
        ArrayList arrayListM4780b = m4780b(list, str, l92Var);
        for (int i = 0; i < arrayListM4780b.size(); i++) {
            int i2 = ((m92) arrayListM4780b.get(i)).f6723b.f4900p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static j92 m4782d(String str, Matcher matcher, dc1 dc1Var, ArrayList arrayList) {
        n92 n92Var = new n92();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            n92Var.f7318a = p92.m5236b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            n92Var.f7319b = p92.m5236b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m4783e(strGroup3, n92Var);
            StringBuilder sb = new StringBuilder();
            dc1Var.getClass();
            String strM2325h = dc1Var.m2325h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strM2325h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM2325h.trim());
                strM2325h = dc1Var.m2325h(StandardCharsets.UTF_8);
            }
            n92Var.f7320c = m4784f(str, sb.toString(), arrayList);
            return new j92(n92Var.m4511a().m3495a(), n92Var.f7318a, n92Var.f7319b);
        } catch (NumberFormatException unused) {
            AbstractC1337qm.m5542i0("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m4783e(String str, n92 n92Var) {
        int i;
        int i2;
        int i3;
        Matcher matcher = f7704b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m4785g(strGroup2, n92Var);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                AbstractC1337qm.m5542i0("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        n92Var.f7321d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    AbstractC1337qm.m5542i0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            n92Var.f7326i = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        n92Var.f7325h = p92.m5235a(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        n92Var.f7327j = p92.m5235a(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            AbstractC1337qm.m5542i0("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        n92Var.f7328k = i3;
                    } else {
                        AbstractC1337qm.m5542i0("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                AbstractC1337qm.m5542i0("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static SpannedString m4784f(String str, String str2, List list) {
        char c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m4779a(str, (l92) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m4779a(str, new l92("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC1337qm.m5542i0("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        ki0.m3857c(!strTrim2.isEmpty());
                        int i4 = z42.f13274a;
                        String str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        ki0.m3857c(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c];
                                        HashSet hashSet = new HashSet();
                                        for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                                            hashSet.add(strArrSplit[i5]);
                                        }
                                        arrayDeque.push(new l92(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        l92 l92Var = (l92) arrayDeque.pop();
                                        m4779a(str, l92Var, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new k92(l92Var, spannableStringBuilder.length()));
                                        }
                                        if (l92Var.f6281a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4785g(String str, n92 n92Var) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    AbstractC1337qm.m5542i0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            n92Var.f7324g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            n92Var.f7322e = p92.m5235a(str);
            n92Var.f7323f = 0;
        } else {
            n92Var.f7322e = Integer.parseInt(str);
            n92Var.f7323f = 1;
        }
    }
}
