package p000;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j32 {

    /* JADX INFO: renamed from: a */
    public final String f5254a;

    /* JADX INFO: renamed from: b */
    public final String f5255b;

    /* JADX INFO: renamed from: c */
    public final boolean f5256c;

    /* JADX INFO: renamed from: d */
    public final long f5257d;

    /* JADX INFO: renamed from: e */
    public final long f5258e;

    /* JADX INFO: renamed from: f */
    public final n32 f5259f;

    /* JADX INFO: renamed from: g */
    public final String[] f5260g;

    /* JADX INFO: renamed from: h */
    public final String f5261h;

    /* JADX INFO: renamed from: i */
    public final String f5262i;

    /* JADX INFO: renamed from: j */
    public final j32 f5263j;

    /* JADX INFO: renamed from: k */
    public final HashMap f5264k;

    /* JADX INFO: renamed from: l */
    public final HashMap f5265l;

    /* JADX INFO: renamed from: m */
    public ArrayList f5266m;

    public j32(String str, String str2, long j, long j2, n32 n32Var, String[] strArr, String str3, String str4, j32 j32Var) {
        this.f5254a = str;
        this.f5255b = str2;
        this.f5262i = str4;
        this.f5259f = n32Var;
        this.f5260g = strArr;
        this.f5256c = str2 != null;
        this.f5257d = j;
        this.f5258e = j2;
        str3.getClass();
        this.f5261h = str3;
        this.f5263j = j32Var;
        this.f5264k = new HashMap();
        this.f5265l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static j32 m3541a(String str) {
        return new j32(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m3542e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C0767iv c0767iv = new C0767iv();
            c0767iv.f5164a = new SpannableStringBuilder();
            treeMap.put(str, c0767iv);
        }
        CharSequence charSequence = ((C0767iv) treeMap.get(str)).f5164a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final j32 m3543b(int i) {
        ArrayList arrayList = this.f5266m;
        if (arrayList != null) {
            return (j32) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public final int m3544c() {
        ArrayList arrayList = this.f5266m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m3545d(TreeSet treeSet, boolean z) {
        String str = this.f5254a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f5262i != null)) {
            long j = this.f5257d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f5258e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f5266m == null) {
            return;
        }
        for (int i = 0; i < this.f5266m.size(); i++) {
            ((j32) this.f5266m.get(i)).m3545d(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3546f(long j) {
        long j2 = this.f5257d;
        long j3 = this.f5258e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m3547g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f5261h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m3546f(j) && "div".equals(this.f5254a) && (str2 = this.f5262i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m3544c(); i++) {
            m3543b(i).m3547g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0205  */
    /* JADX WARN: Code duplicated, block: B:146:0x0213  */
    /* JADX WARN: Code duplicated, block: B:148:0x0216  */
    /* JADX WARN: Code duplicated, block: B:150:0x0219  */
    /* JADX WARN: Code duplicated, block: B:151:0x021f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0232  */
    /* JADX WARN: Code duplicated, block: B:165:0x0264  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:169:0x028b  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX INFO: renamed from: h */
    public final void m3548h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        j32 j32Var;
        int i2;
        n32 n32VarM6431N;
        int i3;
        float f;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i4;
        RelativeSizeSpan relativeSizeSpan;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        if (m3546f(j)) {
            String str2 = this.f5261h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f5265l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f5264k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C0767iv c0767iv = (C0767iv) treeMap.get(str4);
                    c0767iv.getClass();
                    m32 m32Var = (m32) map2.get(str3);
                    m32Var.getClass();
                    int i10 = m32Var.f6623j;
                    n32 n32VarM6431N2 = ua0.m6431N(this.f5259f, this.f5260g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0767iv.f5164a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c0767iv.f5164a = spannableStringBuilder;
                    }
                    if (n32VarM6431N2 != null) {
                        int i11 = n32VarM6431N2.f7193h;
                        int i12 = 1;
                        if (((i11 == -1 && n32VarM6431N2.f7194i == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (n32VarM6431N2.f7194i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = n32VarM6431N2.f7193h;
                            if (i13 != -1) {
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (n32VarM6431N2.f7194i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (n32VarM6431N2.f7194i == -1) {
                                i9 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (n32VarM6431N2.f7194i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (n32VarM6431N2.f7191f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (n32VarM6431N2.f7192g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (n32VarM6431N2.f7188c) {
                            if (!n32VarM6431N2.f7188c) {
                                f40.m2719o("Font color has not been defined.");
                                return;
                            }
                            hp0.m3212c(spannableStringBuilder, new ForegroundColorSpan(n32VarM6431N2.f7187b), iIntValue, iIntValue2);
                        }
                        if (n32VarM6431N2.f7190e) {
                            if (!n32VarM6431N2.f7190e) {
                                f40.m2719o("Background color has not been defined.");
                                return;
                            }
                            hp0.m3212c(spannableStringBuilder, new BackgroundColorSpan(n32VarM6431N2.f7189d), iIntValue, iIntValue2);
                        }
                        if (n32VarM6431N2.f7186a != null) {
                            hp0.m3212c(spannableStringBuilder, new TypefaceSpan(n32VarM6431N2.f7186a), iIntValue, iIntValue2);
                        }
                        rz1 rz1Var = n32VarM6431N2.f7203r;
                        if (rz1Var != null) {
                            int i14 = rz1Var.f10169a;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = rz1Var.f10170b;
                            }
                            int i15 = rz1Var.f10171c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            hp0.m3212c(spannableStringBuilder, new sz1(i14, i6, i15), iIntValue, iIntValue2);
                        }
                        int i16 = n32VarM6431N2.f7198m;
                        if (i16 == 2) {
                            j32 j32Var2 = this.f5263j;
                            while (true) {
                                if (j32Var2 == null) {
                                    j32Var2 = null;
                                    break;
                                }
                                n32 n32VarM6431N3 = ua0.m6431N(j32Var2.f5259f, j32Var2.f5260g, map3);
                                if (n32VarM6431N3 != null && n32VarM6431N3.f7198m == 1) {
                                    break;
                                } else {
                                    j32Var2 = j32Var2.f5263j;
                                }
                            }
                            if (j32Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(j32Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        j32Var = null;
                                        break;
                                    }
                                    j32 j32Var3 = (j32) arrayDeque.pop();
                                    n32 n32VarM6431N4 = ua0.m6431N(j32Var3.f5259f, j32Var3.f5260g, map3);
                                    if (n32VarM6431N4 != null && n32VarM6431N4.f7198m == 3) {
                                        j32Var = j32Var3;
                                        break;
                                    }
                                    for (int iM3544c = j32Var3.m3544c() - 1; iM3544c >= 0; iM3544c--) {
                                        arrayDeque.push(j32Var3.m3543b(iM3544c));
                                    }
                                }
                                if (j32Var != null) {
                                    if (j32Var.m3544c() == 1) {
                                        i2 = 0;
                                        if (j32Var.m3543b(0).f5255b != null) {
                                            String str5 = j32Var.m3543b(0).f5255b;
                                            int i17 = z42.f13274a;
                                            n32 n32VarM6431N5 = ua0.m6431N(j32Var.f5259f, j32Var.f5260g, map3);
                                            int i18 = n32VarM6431N5 != null ? n32VarM6431N5.f7199n : -1;
                                            if (i18 == -1 && (n32VarM6431N = ua0.m6431N(j32Var2.f5259f, j32Var2.f5260g, map3)) != null) {
                                                i18 = n32VarM6431N.f7199n;
                                            }
                                            spannableStringBuilder.setSpan(new fn1(str5, i18), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    AbstractC1337qm.m5508C("Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (n32VarM6431N2.f7202q == 1) {
                                hp0.m3212c(spannableStringBuilder, new nk0(), iIntValue, iIntValue2);
                            }
                            i3 = n32VarM6431N2.f7195j;
                            f = 100.0f;
                            if (i3 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                hp0.m3212c(spannableStringBuilder, new AbsoluteSizeSpan((int) n32VarM6431N2.f7196k, true), iIntValue, iIntValue2);
                            } else if (i3 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                hp0.m3212c(spannableStringBuilder, new RelativeSizeSpan(n32VarM6431N2.f7196k), iIntValue, iIntValue2);
                            } else if (i3 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float f4 = n32VarM6431N2.f7196k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i19 = i2;
                                sizeChange = f4;
                                i4 = i19;
                                while (i4 < length) {
                                    float f5 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i4];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i5 = i4;
                                    } else {
                                        i5 = i4;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i4 = i5 + 1;
                                    f = f5;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f5254a)) {
                                f3 = n32VarM6431N2.f7204s;
                                if (f3 != Float.MAX_VALUE) {
                                    c0767iv.f5180q = (f3 * (-90.0f)) / f2;
                                }
                                alignment = n32VarM6431N2.f7200o;
                                if (alignment != null) {
                                    c0767iv.f5166c = alignment;
                                }
                                alignment2 = n32VarM6431N2.f7201p;
                                if (alignment2 != null) {
                                    c0767iv.f5167d = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new u10(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (n32VarM6431N2.f7202q == 1) {
                            hp0.m3212c(spannableStringBuilder, new nk0(), iIntValue, iIntValue2);
                        }
                        i3 = n32VarM6431N2.f7195j;
                        f = 100.0f;
                        if (i3 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            hp0.m3212c(spannableStringBuilder, new AbsoluteSizeSpan((int) n32VarM6431N2.f7196k, true), iIntValue, iIntValue2);
                        } else if (i3 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            hp0.m3212c(spannableStringBuilder, new RelativeSizeSpan(n32VarM6431N2.f7196k), iIntValue, iIntValue2);
                        } else if (i3 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float f6 = n32VarM6431N2.f7196k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i110 = i2;
                            sizeChange = f6;
                            i4 = i110;
                            while (i4 < length) {
                                float f7 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i4];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                }
                                i4 = i5 + 1;
                                f = f7;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f5254a)) {
                            f3 = n32VarM6431N2.f7204s;
                            if (f3 != Float.MAX_VALUE) {
                                c0767iv.f5180q = (f3 * (-90.0f)) / f2;
                            }
                            alignment = n32VarM6431N2.f7200o;
                            if (alignment != null) {
                                c0767iv.f5166c = alignment;
                            }
                            alignment2 = n32VarM6431N2.f7201p;
                            if (alignment2 != null) {
                                c0767iv.f5167d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < m3544c()) {
                m3543b(i20).m3548h(j, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3549i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f5264k;
        map.clear();
        HashMap map2 = this.f5265l;
        map2.clear();
        String str2 = this.f5254a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f5261h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f5256c && z) {
            SpannableStringBuilder spannableStringBuilderM3542e = m3542e(str4, treeMap);
            String str5 = this.f5255b;
            str5.getClass();
            spannableStringBuilderM3542e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m3542e(str4, treeMap).append('\n');
            return;
        }
        if (m3546f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C0767iv) entry.getValue()).f5164a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < m3544c(); i++) {
                m3543b(i).m3549i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM3542e2 = m3542e(str4, treeMap);
                int length = spannableStringBuilderM3542e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM3542e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM3542e2.charAt(length) != '\n') {
                    spannableStringBuilderM3542e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C0767iv) entry2.getValue()).f5164a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
