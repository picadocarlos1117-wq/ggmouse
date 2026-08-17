package p000;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g92 extends FrameLayout implements ay1 {

    /* JADX INFO: renamed from: a */
    public final C1149nl f4106a;

    /* JADX INFO: renamed from: b */
    public final e92 f4107b;

    /* JADX INFO: renamed from: c */
    public List f4108c;

    /* JADX INFO: renamed from: d */
    public C1228ol f4109d;

    /* JADX INFO: renamed from: e */
    public float f4110e;

    /* JADX INFO: renamed from: f */
    public float f4111f;

    public g92(Context context) {
        super(context, null);
        this.f4108c = Collections.EMPTY_LIST;
        this.f4109d = C1228ol.f8386g;
        this.f4110e = 0.0533f;
        this.f4111f = 0.08f;
        C1149nl c1149nl = new C1149nl(context, 0);
        this.f4106a = c1149nl;
        e92 e92Var = new e92(context, null);
        this.f4107b = e92Var;
        e92Var.setBackgroundColor(0);
        addView(c1149nl);
        addView(e92Var);
    }

    @Override // p000.ay1
    /* JADX INFO: renamed from: a */
    public final void mo791a(List list, C1228ol c1228ol, float f, float f2) {
        this.f4109d = c1228ol;
        this.f4110e = f;
        this.f4111f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C0805jv c0805jv = (C0805jv) list.get(i);
            if (c0805jv.f5557d != null) {
                arrayList.add(c0805jv);
            } else {
                arrayList2.add(c0805jv);
            }
        }
        if (!this.f4108c.isEmpty() || !arrayList2.isEmpty()) {
            this.f4108c = arrayList2;
            m2944c();
        }
        this.f4106a.mo791a(arrayList, c1228ol, f, f2);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final String m2943b(int i, float f) {
        float fM5525Z = AbstractC1337qm.m5525Z(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fM5525Z == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM5525Z / getContext().getResources().getDisplayMetrics().density)};
        int i2 = z42.f13274a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0244  */
    /* JADX WARN: Code duplicated, block: B:104:0x0252  */
    /* JADX WARN: Code duplicated, block: B:106:0x0270 A[LOOP:2: B:105:0x026e->B:106:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0293 A[LOOP:3: B:108:0x028d->B:110:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x0304  */
    /* JADX WARN: Code duplicated, block: B:120:0x030a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0322  */
    /* JADX WARN: Code duplicated, block: B:123:0x0328  */
    /* JADX WARN: Code duplicated, block: B:124:0x033e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0344  */
    /* JADX WARN: Code duplicated, block: B:127:0x0347  */
    /* JADX WARN: Code duplicated, block: B:129:0x034b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0354  */
    /* JADX WARN: Code duplicated, block: B:132:0x035a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0374  */
    /* JADX WARN: Code duplicated, block: B:136:0x0378  */
    /* JADX WARN: Code duplicated, block: B:137:0x0395  */
    /* JADX WARN: Code duplicated, block: B:139:0x0399  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:174:0x0417  */
    /* JADX WARN: Code duplicated, block: B:177:0x041b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0421  */
    /* JADX WARN: Code duplicated, block: B:180:0x0429  */
    /* JADX WARN: Code duplicated, block: B:182:0x042c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x042e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0431  */
    /* JADX WARN: Code duplicated, block: B:186:0x0435  */
    /* JADX WARN: Code duplicated, block: B:187:0x043b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0441  */
    /* JADX WARN: Code duplicated, block: B:189:0x0447  */
    /* JADX WARN: Code duplicated, block: B:192:0x0455  */
    /* JADX WARN: Code duplicated, block: B:193:0x0458  */
    /* JADX WARN: Code duplicated, block: B:196:0x046a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0482  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:240:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:243:0x0512  */
    /* JADX WARN: Code duplicated, block: B:249:0x0541  */
    /* JADX WARN: Code duplicated, block: B:251:0x056a A[LOOP:6: B:250:0x0568->B:251:0x056a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:254:0x058a A[LOOP:7: B:253:0x0588->B:254:0x058a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:262:0x05da  */
    /* JADX WARN: Code duplicated, block: B:266:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:270:0x0602  */
    /* JADX WARN: Code duplicated, block: B:272:0x0605  */
    /* JADX WARN: Code duplicated, block: B:276:0x060c  */
    /* JADX WARN: Code duplicated, block: B:279:0x0627  */
    /* JADX WARN: Code duplicated, block: B:282:0x0644  */
    /* JADX WARN: Code duplicated, block: B:284:0x064f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0652  */
    /* JADX WARN: Code duplicated, block: B:287:0x0655  */
    /* JADX WARN: Code duplicated, block: B:288:0x0658  */
    /* JADX WARN: Code duplicated, block: B:290:0x0676  */
    /* JADX WARN: Code duplicated, block: B:308:0x051f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0182  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0194  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0203  */
    /* JADX WARN: Code duplicated, block: B:99:0x022a  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x0293, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m2944c() {
        String strConcat;
        String str;
        String str2;
        int i;
        float f;
        String str3;
        Layout.Alignment alignment;
        int i2;
        int i3;
        Object obj;
        int i4;
        String str4;
        int i5;
        String str5;
        String str6;
        Object obj2;
        String str7;
        CharSequence charSequence;
        float f2;
        String str8;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i6;
        HashMap map;
        Iterator it;
        float f3;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i7;
        String str9;
        StringBuilder sb;
        int i8;
        int i9;
        C0101bj c0101bj;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i10;
        int size2;
        int i11;
        Object obj3;
        boolean z;
        boolean z2;
        Object[] objArr;
        sz1 sz1Var;
        int i12;
        int i13;
        StringBuilder sb2;
        int i14;
        String str10;
        String strM3615m;
        int i15;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size3;
        String str11;
        int spanStart;
        int spanEnd;
        hu1 hu1Var;
        hu1 hu1Var2;
        float f4;
        String str12;
        Layout.Alignment alignment2;
        String str13;
        int i16;
        String str14;
        String str15;
        String str16;
        boolean z3;
        StringBuilder sb3 = new StringBuilder();
        String strM6442a0 = ua0.m6442a0(this.f4109d.f8387a);
        int i17 = 0;
        String strM2943b = m2943b(0, this.f4110e);
        float f5 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        C1228ol c1228ol = this.f4109d;
        int i18 = c1228ol.f8390d;
        int i19 = c1228ol.f8391e;
        int i20 = 2;
        int i21 = 1;
        if (i18 == 1) {
            Object[] objArr2 = {ua0.m6442a0(i19)};
            int i22 = z42.f13274a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i18 == 2) {
            String strM6442a1 = ua0.m6442a0(i19);
            int i23 = z42.f13274a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM6442a1);
        } else if (i18 == 3) {
            String strM6442a2 = ua0.m6442a0(i19);
            int i24 = z42.f13274a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM6442a2);
        } else if (i18 != 4) {
            strConcat = "unset";
        } else {
            String strM6442a3 = ua0.m6442a0(i19);
            int i25 = z42.f13274a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM6442a3);
        }
        Object[] objArr3 = {strM6442a0, strM2943b, fValueOf, strConcat};
        int i26 = z42.f13274a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map2 = new HashMap();
        String strM6442a4 = ua0.m6442a0(this.f4109d.f8388b);
        String str17 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strM6442a4);
        String str18 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i27 = 0;
        while (i27 < this.f4108c.size()) {
            C0805jv c0805jv = (C0805jv) this.f4108c.get(i27);
            float f6 = c0805jv.f5561h;
            int i28 = c0805jv.f5569p;
            float f7 = f6 != -3.4028235E38f ? f6 * 100.0f : 50.0f;
            float f8 = f5;
            int i29 = c0805jv.f5562i;
            int i30 = -100;
            int i31 = i29 != i21 ? i29 != i20 ? i17 : -100 : -50;
            float f9 = c0805jv.f5558e;
            if (f9 != -3.4028235E38f) {
                if (c0805jv.f5559f != i21) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * 100.0f));
                    int i32 = c0805jv.f5560g;
                    if (i28 == i21) {
                        i30 = -(i32 != i21 ? i32 != i20 ? 0 : -100 : -50);
                    } else {
                        i30 = i32 != i21 ? i32 != i20 ? 0 : -100 : -50;
                    }
                } else {
                    if (f9 >= TouchPipeline.SIZE) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f9 * f8));
                        i = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f9) - 1.0f) * f8));
                        i = i21;
                    }
                    i30 = 0;
                }
                f = c0805jv.f5563j;
                if (f != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str19 = str3;
                alignment = c0805jv.f5555b;
                if (alignment == null) {
                    i4 = i21;
                    obj = "center";
                    i3 = 2;
                } else {
                    i2 = f92.f3727a[alignment.ordinal()];
                    if (i2 != i21) {
                        i3 = 2;
                        if (i2 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i3 = 2;
                        obj = "start";
                    }
                    i4 = 1;
                }
                if (i28 != i4) {
                    str4 = "vertical-rl";
                } else if (i28 != i3) {
                    str4 = "horizontal-tb";
                } else {
                    str4 = "vertical-lr";
                }
                String str20 = str4;
                String strM2943b2 = m2943b(c0805jv.f5567n, c0805jv.f5568o);
                if (c0805jv.f5565l) {
                    i5 = c0805jv.f5566m;
                } else {
                    i5 = this.f4109d.f8389c;
                }
                String strM6442a5 = ua0.m6442a0(i5);
                if (i28 != 1) {
                    if (i != 0) {
                        str5 = "left";
                    } else {
                        str5 = "right";
                    }
                    str6 = str5;
                    obj2 = "top";
                } else if (i28 != 2) {
                    obj2 = "left";
                    str6 = i != 0 ? "bottom" : "top";
                } else {
                    if (i != 0) {
                        str5 = "right";
                    } else {
                        str5 = "left";
                    }
                    str6 = str5;
                    obj2 = "top";
                }
                if (i28 != 2 || i28 == 1) {
                    str7 = "height";
                    int i33 = i30;
                    i30 = i31;
                    i31 = i33;
                } else {
                    str7 = "width";
                }
                String str21 = str7;
                charSequence = c0805jv.f5554a;
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = iu1.f5163a;
                int i34 = i31;
                int i35 = i27;
                if (charSequence == null) {
                    c0101bj = new C0101bj("", 4);
                    str8 = "";
                } else {
                    str8 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i6 = 0;
                        while (i6 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                            i6++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM3609g = jd0.m3609g(iIntValue, "bg_");
                            Iterator it2 = it;
                            String strM3617o = jd0.m3617o(".", strM3609g, ",.", strM3609g, " *");
                            String strM6442a6 = ua0.m6442a0(iIntValue);
                            int i36 = z42.f13274a;
                            Locale locale4 = Locale.US;
                            map.put(strM3617o, str17 + strM6442a6 + str18);
                            it = it2;
                            f7 = f7;
                        }
                        f3 = f7;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i7 = 0;
                        for (length2 = spans.length; i7 < length2; length2 = length2) {
                            obj3 = spans[i7];
                            String str22 = str18;
                            z = obj3 instanceof StrikethroughSpan;
                            String str23 = null;
                            if (z) {
                                z2 = z;
                                strM3615m = "<span style='text-decoration:line-through;'>";
                            } else {
                                z2 = z;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strM6442a7 = ua0.m6442a0(((ForegroundColorSpan) obj3).getForegroundColor());
                                    int i37 = z42.f13274a;
                                    Locale locale5 = Locale.US;
                                    strM3615m = jd0.m3615m("<span style='color:", strM6442a7, ";'>");
                                } else {
                                    str17 = str17;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        int i38 = z42.f13274a;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        strM3615m = jd0.m3610h(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj3 instanceof nk0) {
                                            strM3615m = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size3 = absoluteSizeSpan.getSize();
                                            } else {
                                                size3 = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size3)};
                                            int i39 = z42.f13274a;
                                            strM3615m = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            int i40 = z42.f13274a;
                                            strM3615m = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                int i41 = z42.f13274a;
                                                Locale locale7 = Locale.US;
                                                strM3615m = jd0.m3615m("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strM3615m = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strM3615m = "<b>";
                                            } else if (style != 2) {
                                                strM3615m = "<i>";
                                            } else if (style != 3) {
                                                strM3615m = null;
                                            } else {
                                                strM3615m = "<b><i>";
                                            }
                                        } else if (obj3 instanceof fn1) {
                                            i15 = ((fn1) obj3).f3862b;
                                            if (i15 != -1) {
                                                strM3615m = "<ruby style='ruby-position:unset;'>";
                                            } else if (i15 != 1) {
                                                strM3615m = "<ruby style='ruby-position:over;'>";
                                            } else if (i15 != 2) {
                                                strM3615m = null;
                                            } else {
                                                strM3615m = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strM3615m = "<u>";
                                        } else if (obj3 instanceof sz1) {
                                            sz1Var = (sz1) obj3;
                                            i12 = sz1Var.f10660a;
                                            i13 = sz1Var.f10661b;
                                            sb2 = new StringBuilder();
                                            if (i13 != 1) {
                                                i14 = 2;
                                                if (i13 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i14 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i12 != 0) {
                                                sb2.append(DevicePublicKeyStringDef.NONE);
                                            } else if (i12 != 1) {
                                                sb2.append("circle");
                                            } else if (i12 != i14) {
                                                sb2.append("dot");
                                            } else if (i12 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (sz1Var.f10662c != 2) {
                                                str10 = "over right";
                                            } else {
                                                str10 = "under left";
                                            }
                                            Object[] objArr6 = {string, str10};
                                            int i42 = z42.f13274a;
                                            strM3615m = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strM3615m = null;
                                        }
                                    }
                                }
                                if (z2 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof nk0) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof sz1)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str11 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str23 = "</b>";
                                            } else if (style2 == 2) {
                                                str23 = "</i>";
                                            } else if (style2 == 3) {
                                                str23 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof fn1) {
                                            str23 = "<rt>" + iu1.m3494a(((fn1) obj3).f3861a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str23 = "</u>";
                                        }
                                        str11 = str23;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strM3615m != null) {
                                    str11.getClass();
                                    gu1 gu1Var = new gu1(strM3615m, spanStart, spanEnd, str11);
                                    hu1Var = (hu1) sparseArray.get(spanStart);
                                    if (hu1Var == null) {
                                        hu1Var = new hu1();
                                        sparseArray.put(spanStart, hu1Var);
                                    }
                                    hu1Var.f4715a.add(gu1Var);
                                    hu1Var2 = (hu1) sparseArray.get(spanEnd);
                                    if (hu1Var2 == null) {
                                        hu1Var2 = new hu1();
                                        sparseArray.put(spanEnd, hu1Var2);
                                    }
                                    hu1Var2.f4716b.add(gu1Var);
                                }
                                i7++;
                                str18 = str22;
                                str17 = str17;
                                spans = objArr;
                            }
                            objArr = spans;
                            str11 = z2 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM3615m != null) {
                                str11.getClass();
                                gu1 gu1Var2 = new gu1(strM3615m, spanStart, spanEnd, str11);
                                hu1Var = (hu1) sparseArray.get(spanStart);
                                if (hu1Var == null) {
                                    hu1Var = new hu1();
                                    sparseArray.put(spanStart, hu1Var);
                                }
                                hu1Var.f4715a.add(gu1Var2);
                                hu1Var2 = (hu1) sparseArray.get(spanEnd);
                                if (hu1Var2 == null) {
                                    hu1Var2 = new hu1();
                                    sparseArray.put(spanEnd, hu1Var2);
                                }
                                hu1Var2.f4716b.add(gu1Var2);
                            }
                            i7++;
                            str18 = str22;
                            str17 = str17;
                            spans = objArr;
                        }
                        str18 = str18;
                        str9 = str17;
                        sb = new StringBuilder(spanned.length());
                        i8 = 0;
                        i9 = 0;
                        while (i9 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i9);
                            sb.append(iu1.m3494a(spanned.subSequence(i8, iKeyAt)));
                            hu1 hu1Var3 = (hu1) sparseArray.get(iKeyAt);
                            ArrayList arrayList3 = hu1Var3.f4716b;
                            arrayList = hu1Var3.f4715a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList3, gu1.f4327f);
                            arrayList2 = hu1Var3.f4716b;
                            size = arrayList2.size();
                            i10 = 0;
                            while (i10 < size) {
                                Object obj4 = arrayList2.get(i10);
                                i10++;
                                sb.append(((gu1) obj4).f4331d);
                                arrayList2 = arrayList2;
                            }
                            Collections.sort(arrayList, gu1.f4326e);
                            size2 = arrayList.size();
                            i11 = 0;
                            while (i11 < size2) {
                                Object obj5 = arrayList.get(i11);
                                i11++;
                                sb.append(((gu1) obj5).f4330c);
                            }
                            i9++;
                            i8 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb.append(iu1.m3494a(spanned.subSequence(i8, spanned.length())));
                        c0101bj = new C0101bj(sb.toString(), 4);
                    } else {
                        c0101bj = new C0101bj(iu1.m3494a(charSequence), 4);
                    }
                    for (String str24 : map2.keySet()) {
                        str16 = (String) map2.put(str24, (String) map2.get(str24));
                        if (str16 != null || str16.equals(map2.get(str24))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ki0.m3864h(z3);
                    }
                    Integer numValueOf = Integer.valueOf(i35);
                    Float fValueOf2 = Float.valueOf(f3);
                    Integer numValueOf2 = Integer.valueOf(i34);
                    Integer numValueOf3 = Integer.valueOf(i30);
                    f4 = c0805jv.f5570q;
                    if (f4 != TouchPipeline.SIZE) {
                        if (i28 != 2 || i28 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        Object[] objArr7 = {str15, Float.valueOf(f4)};
                        int i43 = z42.f13274a;
                        str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str12 = str8;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str6, str2, str21, str19, obj, str20, strM2943b2, strM6442a5, numValueOf2, numValueOf3, str12));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = c0805jv.f5556c;
                    str13 = c0101bj.f1383b;
                    if (alignment2 != null) {
                        i16 = f92.f3727a[alignment2.ordinal()];
                        if (i16 != 1) {
                            i20 = 2;
                            if (i16 != 2) {
                                str14 = "center";
                            } else {
                                str14 = "end";
                            }
                        } else {
                            i20 = 2;
                            str14 = "start";
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                        sb3.append(str13);
                        sb3.append("</span>");
                    } else {
                        i20 = 2;
                        sb3.append(str13);
                    }
                    sb3.append("</span></div>");
                    i27 = i35 + 1;
                    f5 = f8;
                    str18 = str18;
                    str17 = str9;
                    i17 = 0;
                    i21 = 1;
                }
                str9 = str17;
                f3 = f7;
                while (r3.hasNext()) {
                    str16 = (String) map2.put(str24, (String) map2.get(str24));
                    if (str16 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    ki0.m3864h(z3);
                }
                Integer numValueOf4 = Integer.valueOf(i35);
                Float fValueOf3 = Float.valueOf(f3);
                Integer numValueOf5 = Integer.valueOf(i34);
                Integer numValueOf6 = Integer.valueOf(i30);
                f4 = c0805jv.f5570q;
                if (f4 != TouchPipeline.SIZE) {
                    if (i28 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr8 = {str15, Float.valueOf(f4)};
                    int i44 = z42.f13274a;
                    str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str12 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str6, str2, str21, str19, obj, str20, strM2943b2, strM6442a5, numValueOf5, numValueOf6, str12));
                sb3.append("<span class='default_bg'>");
                alignment2 = c0805jv.f5556c;
                str13 = c0101bj.f1383b;
                if (alignment2 != null) {
                    i16 = f92.f3727a[alignment2.ordinal()];
                    if (i16 != 1) {
                        i20 = 2;
                        if (i16 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i20 = 2;
                        str14 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    i20 = 2;
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i27 = i35 + 1;
                f5 = f8;
                str18 = str18;
                str17 = str9;
                i17 = 0;
                i21 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f4111f) * 100.0f));
            }
            str2 = str;
            i = 0;
            f = c0805jv.f5563j;
            if (f != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str110 = str3;
            alignment = c0805jv.f5555b;
            if (alignment == null) {
                i4 = i21;
                obj = "center";
                i3 = 2;
            } else {
                i2 = f92.f3727a[alignment.ordinal()];
                if (i2 != i21) {
                    i3 = 2;
                    if (i2 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i3 = 2;
                    obj = "start";
                }
                i4 = 1;
            }
            if (i28 != i4) {
                str4 = "vertical-rl";
            } else if (i28 != i3) {
                str4 = "horizontal-tb";
            } else {
                str4 = "vertical-lr";
            }
            String str25 = str4;
            String strM2943b3 = m2943b(c0805jv.f5567n, c0805jv.f5568o);
            if (c0805jv.f5565l) {
                i5 = c0805jv.f5566m;
            } else {
                i5 = this.f4109d.f8389c;
            }
            String strM6442a8 = ua0.m6442a0(i5);
            if (i28 != 1) {
                if (i != 0) {
                    str5 = "left";
                } else {
                    str5 = "right";
                }
                str6 = str5;
                obj2 = "top";
            } else if (i28 != 2) {
                obj2 = "left";
                str6 = i != 0 ? "bottom" : "top";
            } else {
                if (i != 0) {
                    str5 = "right";
                } else {
                    str5 = "left";
                }
                str6 = str5;
                obj2 = "top";
            }
            if (i28 != 2) {
                str7 = "height";
                int i310 = i30;
                i30 = i31;
                i31 = i310;
            } else {
                str7 = "height";
                int i311 = i30;
                i30 = i31;
                i31 = i311;
            }
            String str26 = str7;
            charSequence = c0805jv.f5554a;
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = iu1.f5163a;
            int i312 = i31;
            int i313 = i27;
            if (charSequence == null) {
                c0101bj = new C0101bj("", 4);
                str8 = "";
            } else {
                str8 = "";
                if (charSequence instanceof Spanned) {
                    c0101bj = new C0101bj(iu1.m3494a(charSequence), 4);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i6 = 0;
                    while (i6 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                        i6++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strM3609g2 = jd0.m3609g(iIntValue2, "bg_");
                        Iterator it3 = it;
                        String strM3617o2 = jd0.m3617o(".", strM3609g2, ",.", strM3609g2, " *");
                        String strM6442a9 = ua0.m6442a0(iIntValue2);
                        int i314 = z42.f13274a;
                        Locale locale8 = Locale.US;
                        map.put(strM3617o2, str17 + strM6442a9 + str18);
                        it = it3;
                        f7 = f7;
                    }
                    f3 = f7;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i7 = 0;
                    while (i7 < length2) {
                        obj3 = spans[i7];
                        String str27 = str18;
                        z = obj3 instanceof StrikethroughSpan;
                        String str28 = null;
                        if (z) {
                            z2 = z;
                            strM3615m = "<span style='text-decoration:line-through;'>";
                        } else {
                            z2 = z;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strM6442a10 = ua0.m6442a0(((ForegroundColorSpan) obj3).getForegroundColor());
                                int i315 = z42.f13274a;
                                Locale locale9 = Locale.US;
                                strM3615m = jd0.m3615m("<span style='color:", strM6442a10, ";'>");
                            } else {
                                str17 = str17;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    int i316 = z42.f13274a;
                                    Locale locale10 = Locale.US;
                                    objArr = spans;
                                    strM3615m = jd0.m3610h(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof nk0) {
                                        strM3615m = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size3 = absoluteSizeSpan.getSize();
                                        } else {
                                            size3 = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr9 = {Float.valueOf(size3)};
                                        int i317 = z42.f13274a;
                                        strM3615m = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr9);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr10 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        int i45 = z42.f13274a;
                                        strM3615m = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr10);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            int i46 = z42.f13274a;
                                            Locale locale11 = Locale.US;
                                            strM3615m = jd0.m3615m("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strM3615m = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strM3615m = "<b>";
                                        } else if (style != 2) {
                                            strM3615m = "<i>";
                                        } else if (style != 3) {
                                            strM3615m = null;
                                        } else {
                                            strM3615m = "<b><i>";
                                        }
                                    } else if (obj3 instanceof fn1) {
                                        i15 = ((fn1) obj3).f3862b;
                                        if (i15 != -1) {
                                            strM3615m = "<ruby style='ruby-position:unset;'>";
                                        } else if (i15 != 1) {
                                            strM3615m = "<ruby style='ruby-position:over;'>";
                                        } else if (i15 != 2) {
                                            strM3615m = null;
                                        } else {
                                            strM3615m = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strM3615m = "<u>";
                                    } else if (obj3 instanceof sz1) {
                                        sz1Var = (sz1) obj3;
                                        i12 = sz1Var.f10660a;
                                        i13 = sz1Var.f10661b;
                                        sb2 = new StringBuilder();
                                        if (i13 != 1) {
                                            i14 = 2;
                                            if (i13 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i14 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i12 != 0) {
                                            sb2.append(DevicePublicKeyStringDef.NONE);
                                        } else if (i12 != 1) {
                                            sb2.append("circle");
                                        } else if (i12 != i14) {
                                            sb2.append("dot");
                                        } else if (i12 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (sz1Var.f10662c != 2) {
                                            str10 = "over right";
                                        } else {
                                            str10 = "under left";
                                        }
                                        Object[] objArr11 = {string2, str10};
                                        int i47 = z42.f13274a;
                                        strM3615m = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr11);
                                    } else {
                                        strM3615m = null;
                                    }
                                }
                            }
                            if (z2) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM3615m != null) {
                                str11.getClass();
                                gu1 gu1Var3 = new gu1(strM3615m, spanStart, spanEnd, str11);
                                hu1Var = (hu1) sparseArray.get(spanStart);
                                if (hu1Var == null) {
                                    hu1Var = new hu1();
                                    sparseArray.put(spanStart, hu1Var);
                                }
                                hu1Var.f4715a.add(gu1Var3);
                                hu1Var2 = (hu1) sparseArray.get(spanEnd);
                                if (hu1Var2 == null) {
                                    hu1Var2 = new hu1();
                                    sparseArray.put(spanEnd, hu1Var2);
                                }
                                hu1Var2.f4716b.add(gu1Var3);
                            }
                            i7++;
                            str18 = str27;
                            str17 = str17;
                            spans = objArr;
                        }
                        objArr = spans;
                        if (z2) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strM3615m != null) {
                            str11.getClass();
                            gu1 gu1Var4 = new gu1(strM3615m, spanStart, spanEnd, str11);
                            hu1Var = (hu1) sparseArray.get(spanStart);
                            if (hu1Var == null) {
                                hu1Var = new hu1();
                                sparseArray.put(spanStart, hu1Var);
                            }
                            hu1Var.f4715a.add(gu1Var4);
                            hu1Var2 = (hu1) sparseArray.get(spanEnd);
                            if (hu1Var2 == null) {
                                hu1Var2 = new hu1();
                                sparseArray.put(spanEnd, hu1Var2);
                            }
                            hu1Var2.f4716b.add(gu1Var4);
                        }
                        i7++;
                        str18 = str27;
                        str17 = str17;
                        spans = objArr;
                    }
                    str18 = str18;
                    str9 = str17;
                    sb = new StringBuilder(spanned.length());
                    i8 = 0;
                    i9 = 0;
                    while (i9 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i9);
                        sb.append(iu1.m3494a(spanned.subSequence(i8, iKeyAt2)));
                        hu1 hu1Var4 = (hu1) sparseArray.get(iKeyAt2);
                        ArrayList arrayList4 = hu1Var4.f4716b;
                        arrayList = hu1Var4.f4715a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList4, gu1.f4327f);
                        arrayList2 = hu1Var4.f4716b;
                        size = arrayList2.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList2.get(i10);
                            i10++;
                            sb.append(((gu1) obj6).f4331d);
                            arrayList2 = arrayList2;
                        }
                        Collections.sort(arrayList, gu1.f4326e);
                        size2 = arrayList.size();
                        i11 = 0;
                        while (i11 < size2) {
                            Object obj7 = arrayList.get(i11);
                            i11++;
                            sb.append(((gu1) obj7).f4330c);
                        }
                        i9++;
                        i8 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb.append(iu1.m3494a(spanned.subSequence(i8, spanned.length())));
                    c0101bj = new C0101bj(sb.toString(), 4);
                }
                while (r3.hasNext()) {
                    str16 = (String) map2.put(str24, (String) map2.get(str24));
                    if (str16 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    ki0.m3864h(z3);
                }
                Integer numValueOf7 = Integer.valueOf(i313);
                Float fValueOf4 = Float.valueOf(f3);
                Integer numValueOf8 = Integer.valueOf(i312);
                Integer numValueOf9 = Integer.valueOf(i30);
                f4 = c0805jv.f5570q;
                if (f4 != TouchPipeline.SIZE) {
                    if (i28 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr12 = {str15, Float.valueOf(f4)};
                    int i48 = z42.f13274a;
                    str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str12 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str6, str2, str26, str110, obj, str25, strM2943b3, strM6442a8, numValueOf8, numValueOf9, str12));
                sb3.append("<span class='default_bg'>");
                alignment2 = c0805jv.f5556c;
                str13 = c0101bj.f1383b;
                if (alignment2 != null) {
                    i16 = f92.f3727a[alignment2.ordinal()];
                    if (i16 != 1) {
                        i20 = 2;
                        if (i16 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i20 = 2;
                        str14 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    i20 = 2;
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i27 = i313 + 1;
                f5 = f8;
                str18 = str18;
                str17 = str9;
                i17 = 0;
                i21 = 1;
            }
            str9 = str17;
            f3 = f7;
            while (r3.hasNext()) {
                str16 = (String) map2.put(str24, (String) map2.get(str24));
                if (str16 != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                ki0.m3864h(z3);
            }
            Integer numValueOf10 = Integer.valueOf(i313);
            Float fValueOf5 = Float.valueOf(f3);
            Integer numValueOf11 = Integer.valueOf(i312);
            Integer numValueOf12 = Integer.valueOf(i30);
            f4 = c0805jv.f5570q;
            if (f4 != TouchPipeline.SIZE) {
                if (i28 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                Object[] objArr13 = {str15, Float.valueOf(f4)};
                int i49 = z42.f13274a;
                str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
            } else {
                str12 = str8;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str6, str2, str26, str110, obj, str25, strM2943b3, strM6442a8, numValueOf11, numValueOf12, str12));
            sb3.append("<span class='default_bg'>");
            alignment2 = c0805jv.f5556c;
            str13 = c0101bj.f1383b;
            if (alignment2 != null) {
                i16 = f92.f3727a[alignment2.ordinal()];
                if (i16 != 1) {
                    i20 = 2;
                    if (i16 != 2) {
                        str14 = "center";
                    } else {
                        str14 = "end";
                    }
                } else {
                    i20 = 2;
                    str14 = "start";
                }
                sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                sb3.append(str13);
                sb3.append("</span>");
            } else {
                i20 = 2;
                sb3.append(str13);
            }
            sb3.append("</span></div>");
            i27 = i313 + 1;
            f5 = f8;
            str18 = str18;
            str17 = str9;
            i17 = 0;
            i21 = 1;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder("<html><head><style>");
        for (String str29 : map2.keySet()) {
            sb5.append(str29);
            sb5.append("{");
            sb5.append((String) map2.get(str29));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, sb5.toString());
        this.f4107b.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f4108c.isEmpty()) {
            return;
        }
        m2944c();
    }
}
