package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.example.ssmousepro.injection.TouchPipeline;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class px1 implements yx1 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f9221d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e */
    public static final Pattern f9222e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a */
    public final StringBuilder f9223a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final ArrayList f9224b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final dc1 f9225c = new dc1();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX INFO: renamed from: a */
    public static C0805jv m5377a(Spanned spanned, String str) {
        int i;
        int i2;
        if (str == null) {
            return new C0805jv(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                i = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            default:
                i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                i2 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i2 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i2 = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            default:
                i2 = 1;
                break;
        }
        float f = 0.5f;
        float f2 = 0.92f;
        if (i == 0) {
            f2 = 0.08f;
        } else if (i == 1) {
            f2 = 0.5f;
        } else if (i != 2) {
            l41.m4049r();
            return null;
        }
        if (i2 == 0) {
            f = 0.08f;
        } else if (i2 != 1) {
            if (i2 != 2) {
                l41.m4049r();
                return null;
            }
            f = 0.92f;
        }
        return new C0805jv(spanned, null, null, null, f, 0, i2, f2, i, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE);
    }

    /* JADX INFO: renamed from: b */
    public static long m5378b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // p000.yx1
    /* JADX INFO: renamed from: r */
    public final void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        String str;
        px1 px1Var = this;
        long j = xx1Var.f12765b;
        dc1 dc1Var = px1Var.f9225c;
        dc1Var.m2314D(i + i2, bArr);
        dc1Var.m2316F(i);
        Charset charsetM2312B = dc1Var.m2312B();
        if (charsetM2312B == null) {
            charsetM2312B = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !xx1Var.f12764a) ? null : new ArrayList();
        while (true) {
            String strM2325h = dc1Var.m2325h(charsetM2312B);
            int i3 = 0;
            if (strM2325h == null) {
                break;
            }
            if (strM2325h.length() != 0) {
                try {
                    Integer.parseInt(strM2325h);
                    String strM2325h2 = dc1Var.m2325h(charsetM2312B);
                    if (strM2325h2 == null) {
                        AbstractC1337qm.m5542i0("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f9221d.matcher(strM2325h2);
                    if (matcher.matches()) {
                        long jM5378b = m5378b(matcher, 1);
                        long jM5378b2 = m5378b(matcher, 6);
                        StringBuilder sb = px1Var.f9223a;
                        sb.setLength(0);
                        ArrayList arrayList2 = px1Var.f9224b;
                        arrayList2.clear();
                        String strM2325h3 = dc1Var.m2325h(charsetM2312B);
                        while (!TextUtils.isEmpty(strM2325h3)) {
                            long j3 = j2;
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM2325h3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f9222e.matcher(strTrim);
                            int i4 = i3;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i4;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i4 += length;
                                j = j;
                            }
                            sb.append(sb2.toString());
                            strM2325h3 = dc1Var.m2325h(charsetM2312B);
                            j2 = j3;
                            i3 = 0;
                        }
                        long j4 = j;
                        long j5 = j2;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (j4 == j5 || jM5378b >= j4) {
                            interfaceC0578dt.accept(new C1122mv(qm0.m5570t(m5377a(spannedFromHtml, str)), jM5378b, jM5378b2 - jM5378b));
                        } else if (arrayList != null) {
                            arrayList.add(new C1122mv(qm0.m5570t(m5377a(spannedFromHtml, str)), jM5378b, jM5378b2 - jM5378b));
                        }
                        px1Var = this;
                        j2 = j5;
                        j = j4;
                    } else {
                        AbstractC1337qm.m5542i0("SubripParser", "Skipping invalid timing: ".concat(strM2325h2));
                        px1Var = this;
                    }
                } catch (NumberFormatException unused) {
                    AbstractC1337qm.m5542i0("SubripParser", "Skipping invalid index: ".concat(strM2325h));
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                interfaceC0578dt.accept((C1122mv) obj);
            }
        }
    }
}
