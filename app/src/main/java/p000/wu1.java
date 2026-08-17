package p000;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 implements yx1 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f12337g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a */
    public final boolean f12338a;

    /* JADX INFO: renamed from: b */
    public final vu1 f12339b;

    /* JADX INFO: renamed from: d */
    public LinkedHashMap f12341d;

    /* JADX INFO: renamed from: e */
    public float f12342e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public float f12343f = -3.4028235E38f;

    /* JADX INFO: renamed from: c */
    public final dc1 f12340c = new dc1();

    public wu1(List list) {
        if (list == null || list.isEmpty()) {
            this.f12338a = false;
            this.f12339b = null;
            return;
        }
        this.f12338a = true;
        String strM7237k = z42.m7237k((byte[]) list.get(0));
        ki0.m3857c(strM7237k.startsWith("Format:"));
        vu1 vu1VarM6660b = vu1.m6660b(strM7237k);
        vu1VarM6660b.getClass();
        this.f12339b = vu1VarM6660b;
        m6835b(new dc1((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static int m6833a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static long m6834c(String str) {
        Matcher matcher = f12337g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = z42.f13274a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m6835b(dc1 dc1Var, Charset charset) {
        int i;
        zu1 zu1Var;
        while (true) {
            String strM2325h = dc1Var.m2325h(charset);
            if (strM2325h == null) {
                return;
            }
            int i2 = 2;
            int i3 = 0;
            char c = '[';
            if ("[Script Info]".equalsIgnoreCase(strM2325h)) {
                while (true) {
                    String strM2325h2 = dc1Var.m2325h(charset);
                    if (strM2325h2 == null || (dc1Var.m2318a() != 0 && dc1Var.m2320c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strM2325h2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM6444b0 = ua0.m6444b0(strArrSplit[0].trim());
                        strM6444b0.getClass();
                        if (strM6444b0.equals("playresx")) {
                            this.f12342e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM6444b0.equals("playresy")) {
                            try {
                                this.f12343f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM2325h)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    xu1 xu1Var = null;
                    while (true) {
                        String strM2325h3 = dc1Var.m2325h(charset);
                        if (strM2325h3 != null && (dc1Var.m2318a() == 0 || dc1Var.m2320c(charset) != c)) {
                            int i4 = -1;
                            if (strM2325h3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM2325h3.substring(7), ",");
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i3; i15 < strArrSplit2.length; i15++) {
                                    String strM6444b1 = ua0.m6444b0(strArrSplit2[i15].trim());
                                    strM6444b1.getClass();
                                    switch (strM6444b1.hashCode()) {
                                        case -1178781136:
                                            i = strM6444b1.equals("italic") ? i3 : -1;
                                            break;
                                        case -1026963764:
                                            i = strM6444b1.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i = strM6444b1.equals("strikeout") ? i2 : -1;
                                            break;
                                        case -70925746:
                                            i = strM6444b1.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i = strM6444b1.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i = strM6444b1.equals(AppMeasurementSdk.ConditionalUserProperty.NAME) ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i = strM6444b1.equals("fontsize") ? 6 : -1;
                                            break;
                                        case 767321349:
                                            i = strM6444b1.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i = strM6444b1.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i = strM6444b1.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case 5:
                                            i5 = i15;
                                            break;
                                        case 6:
                                            i9 = i15;
                                            break;
                                        case 7:
                                            i14 = i15;
                                            break;
                                        case 8:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    xu1Var = new xu1(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length);
                                }
                            } else {
                                if (strM2325h3.startsWith("Style:")) {
                                    if (xu1Var == null) {
                                        AbstractC1337qm.m5542i0("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM2325h3));
                                    } else {
                                        ki0.m3857c(strM2325h3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM2325h3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i16 = xu1Var.f12734k;
                                        if (length != i16) {
                                            int length2 = strArrSplit3.length;
                                            int i17 = z42.f13274a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbM5345l = AbstractC1308pu.m5345l("Skipping malformed 'Style:' line (expected ", i16, " values, found ", length2, "): '");
                                            sbM5345l.append(strM2325h3);
                                            sbM5345l.append("'");
                                            AbstractC1337qm.m5542i0("SsaStyle", sbM5345l.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[xu1Var.f12724a].trim();
                                                int i18 = xu1Var.f12725b;
                                                int iM7355a = i18 != -1 ? zu1.m7355a(strArrSplit3[i18].trim()) : -1;
                                                int i19 = xu1Var.f12726c;
                                                Integer numM7357c = i19 != -1 ? zu1.m7357c(strArrSplit3[i19].trim()) : null;
                                                int i20 = xu1Var.f12727d;
                                                Integer numM7357c2 = i20 != -1 ? zu1.m7357c(strArrSplit3[i20].trim()) : null;
                                                int i21 = xu1Var.f12728e;
                                                float f = -3.4028235E38f;
                                                if (i21 != -1) {
                                                    String strTrim2 = strArrSplit3[i21].trim();
                                                    try {
                                                        f = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        AbstractC1337qm.m5544j0("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i22 = xu1Var.f12729f;
                                                boolean z = i22 != -1 && zu1.m7356b(strArrSplit3[i22].trim());
                                                int i23 = xu1Var.f12730g;
                                                boolean z2 = i23 != -1 && zu1.m7356b(strArrSplit3[i23].trim());
                                                int i24 = xu1Var.f12731h;
                                                boolean z3 = i24 != -1 && zu1.m7356b(strArrSplit3[i24].trim());
                                                int i25 = xu1Var.f12732i;
                                                boolean z4 = i25 != -1 && zu1.m7356b(strArrSplit3[i25].trim());
                                                int i26 = xu1Var.f12733j;
                                                if (i26 != -1) {
                                                    String strTrim3 = strArrSplit3[i26].trim();
                                                    try {
                                                        int i27 = Integer.parseInt(strTrim3.trim());
                                                        if (i27 == 1 || i27 == 3) {
                                                            i4 = i27;
                                                        } else {
                                                            AbstractC1337qm.m5542i0("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                }
                                                zu1Var = new zu1(strTrim, iM7355a, numM7357c, numM7357c2, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                AbstractC1337qm.m5544j0("SsaStyle", "Skipping malformed 'Style:' line: '" + strM2325h3 + "'", e2);
                                                zu1Var = null;
                                            }
                                            if (zu1Var != null) {
                                                linkedHashMap.put(zu1Var.f13564a, zu1Var);
                                            }
                                        }
                                        zu1Var = null;
                                        if (zu1Var != null) {
                                            linkedHashMap.put(zu1Var.f13564a, zu1Var);
                                        }
                                    }
                                }
                                i2 = 2;
                                i3 = 0;
                                c = '[';
                            }
                        }
                    }
                }
                this.f12341d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM2325h)) {
                AbstractC1337qm.m5508C("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM2325h)) {
                return;
            }
        }
    }

    @Override // p000.yx1
    /* JADX INFO: renamed from: r */
    public final void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        Charset charset;
        vu1 vu1Var;
        long j;
        int i3;
        float f;
        int i4;
        Layout.Alignment alignment;
        int i5;
        int i6;
        float f2;
        float f3;
        float f4;
        int i7;
        int i8;
        float f5;
        int i9;
        float f6;
        int i10;
        int i11;
        int iM7355a;
        int i12;
        wu1 wu1Var = this;
        long j2 = xx1Var.f12765b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        dc1 dc1Var = wu1Var.f12340c;
        dc1Var.m2314D(i + i2, bArr);
        dc1Var.m2316F(i);
        Charset charsetM2312B = dc1Var.m2312B();
        if (charsetM2312B == null) {
            charsetM2312B = StandardCharsets.UTF_8;
        }
        boolean z = wu1Var.f12338a;
        if (!z) {
            wu1Var.m6835b(dc1Var, charsetM2312B);
        }
        vu1 vu1VarM6660b = z ? wu1Var.f12339b : null;
        while (true) {
            String strM2325h = dc1Var.m2325h(charsetM2312B);
            if (strM2325h == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !xx1Var.f12764a) ? null : new ArrayList();
                int i13 = 0;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    List list = (List) arrayList.get(i14);
                    if (!list.isEmpty() || i14 == 0) {
                        if (i14 == arrayList.size() - 1) {
                            l41.m4046o();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i14)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i14 + 1)).longValue() - ((Long) arrayList2.get(i14)).longValue();
                        if (j3 == -9223372036854775807L || jLongValue >= j3) {
                            interfaceC0578dt.accept(new C1122mv(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C1122mv(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i13 < size) {
                        Object obj = arrayList3.get(i13);
                        i13++;
                        interfaceC0578dt.accept((C1122mv) obj);
                    }
                    return;
                }
                return;
            }
            if (strM2325h.startsWith("Format:")) {
                vu1VarM6660b = vu1.m6660b(strM2325h);
            } else {
                if (strM2325h.startsWith("Dialogue:")) {
                    if (vu1VarM6660b == null) {
                        AbstractC1337qm.m5542i0("SsaParser", "Skipping dialogue line before complete format: ".concat(strM2325h));
                    } else {
                        int i15 = vu1VarM6660b.f11774e;
                        ki0.m3857c(strM2325h.startsWith("Dialogue:"));
                        String[] strArrSplit = strM2325h.substring(9).split(",", i15);
                        if (strArrSplit.length != i15) {
                            AbstractC1337qm.m5542i0("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM2325h));
                        } else {
                            long jM6834c = m6834c(strArrSplit[vu1VarM6660b.f11770a]);
                            charset = charsetM2312B;
                            if (jM6834c == -9223372036854775807L) {
                                AbstractC1337qm.m5542i0("SsaParser", "Skipping invalid timing: ".concat(strM2325h));
                                j = j2;
                                vu1Var = vu1VarM6660b;
                                dc1Var = dc1Var;
                            } else {
                                j = j2;
                                long jM6834c2 = m6834c(strArrSplit[vu1VarM6660b.f11771b]);
                                if (jM6834c2 == -9223372036854775807L) {
                                    AbstractC1337qm.m5542i0("SsaParser", "Skipping invalid timing: ".concat(strM2325h));
                                    vu1Var = vu1VarM6660b;
                                    dc1Var = dc1Var;
                                } else {
                                    LinkedHashMap linkedHashMap = wu1Var.f12341d;
                                    zu1 zu1Var = (linkedHashMap == null || (i12 = vu1VarM6660b.f11772c) == -1) ? null : (zu1) linkedHashMap.get(strArrSplit[i12].trim());
                                    String str = strArrSplit[vu1VarM6660b.f11773d];
                                    Matcher matcher = yu1.f13149a.matcher(str);
                                    int i16 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        vu1 vu1Var2 = vu1VarM6660b;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFM7149a = yu1.m7149a(strGroup);
                                            if (pointFM7149a != null) {
                                                pointF = pointFM7149a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = yu1.f13152d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iM7355a = zu1.m7355a(strGroup2);
                                            } else {
                                                iM7355a = -1;
                                            }
                                            if (iM7355a != -1) {
                                                i16 = iM7355a;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        vu1VarM6660b = vu1Var2;
                                    }
                                    vu1Var = vu1VarM6660b;
                                    String strReplace = yu1.f13149a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = wu1Var.f12342e;
                                    float f8 = wu1Var.f12343f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (zu1Var != null) {
                                        boolean z2 = zu1Var.f13570g;
                                        Integer num = zu1Var.f13567d;
                                        Integer num2 = zu1Var.f13566c;
                                        if (num2 != null) {
                                            i7 = 33;
                                            i8 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i7 = 33;
                                            i8 = 0;
                                        }
                                        if (zu1Var.f13573j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i8, spannableString.length(), i7);
                                        }
                                        float f9 = zu1Var.f13568e;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i9 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i9 = 1;
                                        }
                                        boolean z3 = zu1Var.f13569f;
                                        if (z3 && z2) {
                                            f6 = f5;
                                            i10 = i9;
                                            i11 = 33;
                                            i3 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f6 = f5;
                                            i10 = i9;
                                            i11 = 33;
                                            i3 = 0;
                                            if (z3) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (zu1Var.f13571h) {
                                            spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i11);
                                        }
                                        if (zu1Var.f13572i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i11);
                                        }
                                        f = f6;
                                        i4 = i10;
                                    } else {
                                        dc1Var = dc1Var;
                                        f7 = f7;
                                        i3 = 0;
                                        f = -3.4028235E38f;
                                        i4 = Integer.MIN_VALUE;
                                    }
                                    if (i16 == -1) {
                                        i16 = zu1Var != null ? zu1Var.f13565b : -1;
                                    }
                                    switch (i16) {
                                        case 0:
                                        default:
                                            jd0.m3621s(i16, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    int i17 = Integer.MIN_VALUE;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            jd0.m3621s(i16, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i3 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i3 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i3 = 2;
                                            break;
                                    }
                                    switch (i16) {
                                        case 0:
                                        default:
                                            jd0.m3621s(i16, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i17 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i17 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i17 = 0;
                                            break;
                                    }
                                    if (pointF == 0 || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        float f10 = 0.5f;
                                        if (i3 != 0) {
                                            i6 = 1;
                                            if (i3 != 1) {
                                                i5 = 2;
                                                f2 = i3 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i5 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i5 = 2;
                                            i6 = 1;
                                            f2 = 0.05f;
                                        }
                                        if (i17 == 0) {
                                            f10 = 0.05f;
                                        } else if (i17 != i6) {
                                            f10 = i17 != i5 ? -3.4028235E38f : 0.95f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        float f11 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                        f4 = f11;
                                    }
                                    C0805jv c0805jv = new C0805jv(spannableString, alignment, null, null, f3, 0, i17, f4, i3, i4, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE);
                                    int iM6833a = m6833a(jM6834c2, arrayList2, arrayList);
                                    for (int iM6833a2 = m6833a(jM6834c, arrayList2, arrayList); iM6833a2 < iM6833a; iM6833a2++) {
                                        ((List) arrayList.get(iM6833a2)).add(c0805jv);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM2312B;
                    j = j2;
                    vu1Var = vu1VarM6660b;
                    dc1Var = dc1Var;
                } else {
                    charset = charsetM2312B;
                    j = j2;
                    vu1Var = vu1VarM6660b;
                    dc1Var = dc1Var;
                }
                wu1Var = this;
                charsetM2312B = charset;
                j2 = j;
                vu1VarM6660b = vu1Var;
                dc1Var = dc1Var;
            }
        }
    }
}
