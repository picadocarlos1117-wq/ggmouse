package p000;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.sun.security.util.DerValue;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import com.example.ssmousepro.injection.TouchPipeline;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.Deferred;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hr1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f4682a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f4683b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f4684c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f4685d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f4686e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f4687f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final char[] f4688g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: h */
    public static final short[] f4689h = {2285, 2571, 2970, 1812, 1493, 1422, 287, 202, 3158, 622, 1577, 182, 962, 2127, 1855, 1468, 573, 2004, 264, 383, 2500, 1458, 1727, 3199, 2648, 1017, 732, 608, 1787, 411, 3124, 1758, 1223, 652, 2777, 1015, 2036, 1491, 3047, 1785, 516, 3321, 3009, 2663, 1711, 2167, 126, 1469, 2476, 3239, 3058, 830, 107, 1908, 3082, 2378, 2931, 961, 1821, 2604, 448, 2264, 677, 2054, 2226, 430, 555, 843, 2078, 871, 1550, 105, 422, 587, 177, 3094, 3038, 2869, 1574, 1653, 3083, 778, 1159, 3182, 2552, 1483, 2727, 1119, 1739, 644, 2457, 349, 418, 329, 3173, 3254, 817, 1097, 603, 610, 1322, 2044, 1864, 384, 2114, 3193, 1218, 1994, 2455, 220, 2142, 1670, 2144, 1799, 2051, 794, 1819, 2475, 2459, 478, 3221, 3021, 996, 991, 958, 1869, 1522, 1628};

    /* JADX INFO: renamed from: i */
    public static final int[] f4690i = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: A */
    public static boolean m3250A(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: B */
    public static wq1 m3251B(ch0 ch0Var) {
        wq1 wq1Var = new wq1();
        wq1Var.f12253d = p32.m5144J(ch0Var, wq1Var, wq1Var);
        return wq1Var;
    }

    /* JADX INFO: renamed from: C */
    public static Typeface m3252C(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, rc2.m5795m(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: D */
    public static String m3253D(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            f40.m2713i("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public static C1097m6 m3254E(dc1 dc1Var) {
        String str;
        int iM2324g = dc1Var.m2324g();
        if (dc1Var.m2324g() != 1684108385) {
            AbstractC1337qm.m5542i0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2324g2 = dc1Var.m2324g();
        byte[] bArr = AbstractC0793jj.f5419a;
        int i = iM2324g2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            jd0.m3621s(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        dc1Var.m2317G(4);
        int i2 = iM2324g - 16;
        byte[] bArr2 = new byte[i2];
        dc1Var.m2322e(0, i2, bArr2);
        return new C1097m6(3, str, bArr2, null);
    }

    /* JADX INFO: renamed from: F */
    public static tz1 m3255F(int i, dc1 dc1Var, String str) {
        int iM2324g = dc1Var.m2324g();
        if (dc1Var.m2324g() == 1684108385 && iM2324g >= 22) {
            dc1Var.m2317G(10);
            int iM2343z = dc1Var.m2343z();
            if (iM2343z > 0) {
                String strM3609g = jd0.m3609g(iM2343z, "");
                int iM2343z2 = dc1Var.m2343z();
                if (iM2343z2 > 0) {
                    strM3609g = strM3609g + "/" + iM2343z2;
                }
                return new tz1(str, null, qm0.m5570t(strM3609g));
            }
        }
        AbstractC1337qm.m5542i0("MetadataUtil", "Failed to parse index/count attribute: ".concat(nu0.m4596h(i)));
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static int m3256G(dc1 dc1Var) {
        int iM2324g = dc1Var.m2324g();
        if (dc1Var.m2324g() == 1684108385) {
            dc1Var.m2317G(8);
            int i = iM2324g - 16;
            if (i == 1) {
                return dc1Var.m2337t();
            }
            if (i == 2) {
                return dc1Var.m2343z();
            }
            if (i == 3) {
                return dc1Var.m2340w();
            }
            if (i == 4 && (dc1Var.f2882a[dc1Var.f2883b] & DerValue.TAG_CONTEXT) == 0) {
                return dc1Var.m2341x();
            }
        }
        AbstractC1337qm.m5542i0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public static bm0 m3257H(int i, String str, dc1 dc1Var, boolean z, boolean z2) {
        int iM3256G = m3256G(dc1Var);
        if (z2) {
            iM3256G = Math.min(1, iM3256G);
        }
        if (iM3256G >= 0) {
            return z ? new tz1(str, null, qm0.m5570t(Integer.toString(iM3256G))) : new C0649fq("und", str, Integer.toString(iM3256G));
        }
        AbstractC1337qm.m5542i0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(nu0.m4596h(i)));
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static tz1 m3258I(int i, dc1 dc1Var, String str) {
        int iM2324g = dc1Var.m2324g();
        if (dc1Var.m2324g() == 1684108385) {
            dc1Var.m2317G(8);
            return new tz1(str, null, qm0.m5570t(dc1Var.m2333p(iM2324g - 16)));
        }
        AbstractC1337qm.m5542i0("MetadataUtil", "Failed to parse text attribute: ".concat(nu0.m4596h(i)));
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static PorterDuff.Mode m3259J(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: K */
    public static v71 m3260K(List list, qu0 qu0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fr1 fr1Var = (fr1) it.next();
            String str = fr1Var.f3883a;
            ou0 ou0VarM5611b = qu0Var.m5611b(str);
            if (ou0VarM5611b != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(hr1.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                v71 v71VarMo2846c = ou0VarM5611b.mo2846c(fr1Var.f3884b);
                return v71VarMo2846c.f11573a != null ? v71VarMo2846c : new v71(new gr1(ou0VarM5611b, v71VarMo2846c.f11574b));
            }
            arrayList.add(str);
        }
        return new v71(nv1.f7552g.m4614g("None of " + arrayList + " specified by Service Config are available."));
    }

    /* JADX INFO: renamed from: L */
    public static void m3261L(View view, zz0 zz0Var) {
        n50 n50Var = zz0Var.f13626a.f13173b;
        if (n50Var == null || !n50Var.f7236a) {
            return;
        }
        float fM7008i = TouchPipeline.SIZE;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = i72.f4849a;
            fM7008i += y62.m7008i((View) parent);
        }
        yz0 yz0Var = zz0Var.f13626a;
        if (yz0Var.f13183l != fM7008i) {
            yz0Var.f13183l = fM7008i;
            zz0Var.m7402m();
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m3262M(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0151 A[RETURN] */
    /* JADX INFO: renamed from: N */
    public static ut1 m3263N(y80 y80Var, boolean z, boolean z2) {
        ut1 ut1Var;
        int i;
        long jM2331n;
        int i2;
        int i3;
        boolean z3;
        int[] iArr;
        long jMo2420i = y80Var.mo2420i();
        long j = -1;
        int i4 = (jMo2420i > (-1L) ? 1 : (jMo2420i == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i4 != 0 && jMo2420i <= 4096) {
            j2 = jMo2420i;
        }
        int i5 = (int) j2;
        dc1 dc1Var = new dc1(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (true) {
            if (i7 < i5) {
                dc1Var.m2313C(8);
                if (y80Var.mo2416e(dc1Var.f2882a, i6, 8, true)) {
                    long jM2339v = dc1Var.m2339v();
                    int iM2324g = dc1Var.m2324g();
                    if (jM2339v == 1) {
                        j = j;
                        y80Var.mo2413a(8, 8, dc1Var.f2882a);
                        i2 = 16;
                        dc1Var.m2315E(16);
                        jM2331n = dc1Var.m2331n();
                    } else {
                        j = j;
                        if (jM2339v == 0) {
                            long jMo2420i2 = y80Var.mo2420i();
                            if (jMo2420i2 != j) {
                                jM2339v = (jMo2420i2 - y80Var.mo2417f()) + 8;
                            }
                        }
                        jM2331n = jM2339v;
                        i2 = 8;
                    }
                    long j3 = i2;
                    ut1Var = null;
                    int i8 = 9;
                    if (jM2331n < j3) {
                        return new bz1(i8);
                    }
                    int i9 = i7 + i2;
                    if (iM2324g == 1836019574) {
                        i5 += (int) jM2331n;
                        if (i4 != 0 && i5 > jMo2420i) {
                            i5 = (int) jMo2420i;
                        }
                        i7 = i9;
                        i6 = 0;
                    } else if (iM2324g == 1836019558 || iM2324g == 1836475768) {
                        i = 1;
                    } else {
                        if (iM2324g == 1835295092) {
                            z4 = true;
                        }
                        long j4 = jMo2420i;
                        if ((((long) i9) + jM2331n) - j3 >= i5) {
                            i = 0;
                        } else {
                            int i10 = (int) (jM2331n - j3);
                            i7 = i9 + i10;
                            if (iM2324g != 1718909296) {
                                i3 = 0;
                                if (i10 != 0) {
                                    y80Var.mo2418g(i10);
                                }
                            } else {
                                if (i10 < 8) {
                                    return new bz1(9);
                                }
                                dc1Var.m2313C(i10);
                                i3 = 0;
                                y80Var.mo2413a(0, i10, dc1Var.f2882a);
                                if (m3286x(dc1Var.m2324g(), z2)) {
                                    z4 = true;
                                }
                                dc1Var.m2317G(4);
                                int iM2318a = dc1Var.m2318a() / 4;
                                if (!z4 && iM2318a > 0) {
                                    iArr = new int[iM2318a];
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= iM2318a) {
                                            z3 = z4;
                                            break;
                                        }
                                        int iM2324g2 = dc1Var.m2324g();
                                        iArr[i11] = iM2324g2;
                                        if (m3286x(iM2324g2, z2)) {
                                            z3 = true;
                                            break;
                                        }
                                        i11++;
                                    }
                                } else {
                                    z3 = z4;
                                    iArr = null;
                                }
                                if (!z3) {
                                    pu0 pu0Var = new pu0(14);
                                    if (iArr == null || iArr.length == 0) {
                                        return pu0Var;
                                    }
                                    Arrays.copyOf(iArr, iArr.length);
                                    return pu0Var;
                                }
                                z4 = z3;
                            }
                            i6 = i3;
                            jMo2420i = j4;
                        }
                    }
                }
                if (!z4) {
                    return k50.f5675g;
                }
                if (z != i) {
                    return i != 0 ? k50.f5673e : k50.f5674f;
                }
                return ut1Var;
            }
            ut1Var = null;
            i = i6;
            if (!z4) {
                return k50.f5675g;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return ut1Var;
        }
    }

    /* JADX INFO: renamed from: O */
    public static List m3264O(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new fr1(str, AbstractC1337qm.m5563z(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static C0644fl m3265a(Deferred deferred) {
        deferred.getClass();
        C0571dl c0571dl = new C0571dl();
        c0571dl.f2961c = new hl1();
        C0644fl c0644fl = new C0644fl(c0571dl);
        c0571dl.f2960b = c0644fl;
        c0571dl.f2959a = AbstractC1308pu.class;
        try {
            deferred.invokeOnCompletion(new C1345qu(c0571dl, deferred));
            c0571dl.f2959a = "Deferred.asListenableFuture";
            return c0644fl;
        } catch (Exception e) {
            c0644fl.f3845b.setException(e);
            return c0644fl;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3266b(r72 r72Var, hp1 hp1Var, fs0 fs0Var) {
        AutoCloseable autoCloseable;
        hp1Var.getClass();
        fs0Var.getClass();
        s72 s72Var = r72Var.f9806a;
        if (s72Var != null) {
            synchronized (s72Var.f10274a) {
                autoCloseable = (AutoCloseable) s72Var.f10275b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        ap1 ap1Var = (ap1) autoCloseable;
        if (ap1Var == null || ap1Var.f1018c) {
            return;
        }
        ap1Var.m697d(hp1Var, fs0Var);
        es0 es0Var = ((os0) fs0Var).f8452d;
        if (es0Var == es0.f3434b || es0Var.compareTo(es0.f3436d) >= 0) {
            hp1Var.m3236d();
        } else {
            fs0Var.mo2848a(new C1424sz(1, fs0Var, hp1Var));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3267c(C0082b0 c0082b0, int i, short s, short s2, short s3, short s4, short s5) {
        ((short[]) c0082b0.f1104c)[i] = (short) (rc2.m5776Z(s * s3) + rc2.m5776Z(rc2.m5776Z(s2 * s4) * s5));
        short sM5776Z = (short) (rc2.m5776Z(s2 * s3) + rc2.m5776Z(s * s4));
        ((short[]) c0082b0.f1104c)[i + 1] = sM5776Z;
    }

    /* JADX INFO: renamed from: d */
    public static final String m3268d(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* JADX INFO: renamed from: e */
    public static final void m3269e(View view) {
        view.getClass();
        wq1 wq1VarM3251B = m3251B(new q72(view, null));
        while (wq1VarM3251B.hasNext()) {
            View view2 = (View) wq1VarM3251B.next();
            jf1 jf1Var = (jf1) view2.getTag(com.sousasantoslogic.sspro.R.id.pooling_container_listener_holder_tag);
            if (jf1Var == null) {
                jf1Var = new jf1();
                view2.setTag(com.sousasantoslogic.sspro.R.id.pooling_container_listener_holder_tag, jf1Var);
            }
            ArrayList arrayList = jf1Var.f5380a;
            arrayList.getClass();
            int size = arrayList.size() - 1;
            if (-1 < size) {
                arrayList.get(size).getClass();
                l41.m4035b();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3270f(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM5343j = AbstractC1308pu.m5343j(i, "radix ", " was not in valid range ");
            sbM5343j.append(new co0(2, 36, 1));
            throw new IllegalArgumentException(sbM5343j.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public static o21 m3271g(int i) {
        if (i != 0) {
            return i != 1 ? new dn1() : new C0077aw();
        }
        return new dn1();
    }

    /* JADX INFO: renamed from: h */
    public static void m3272h(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap m3273i(int i, byte[] bArr) throws IOException {
        int iM4072e;
        int i2 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, null);
        if (bitmapDecodeByteArray == null) {
            throw fc1.m2799a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            p70 p70Var = new p70(byteArrayInputStream);
            byteArrayInputStream.close();
            l70 l70VarM5207c = p70Var.m5207c("Orientation");
            if (l70VarM5207c == null) {
                iM4072e = 1;
            } else {
                try {
                    iM4072e = l70VarM5207c.m4072e(p70Var.f8779e);
                } catch (NumberFormatException unused) {
                    iM4072e = 1;
                }
            }
            switch (iM4072e) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
            }
            if (i2 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i2);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3274j(Exception exc, String str, String str2) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3275k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m3276l(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: m */
    public static String m3277m(AbstractC0753ik abstractC0753ik) {
        StringBuilder sb = new StringBuilder(abstractC0753ik.size());
        for (int i = 0; i < abstractC0753ik.size(); i++) {
            byte bMo2592e = abstractC0753ik.mo2592e(i);
            if (bMo2592e == 34) {
                sb.append("\\\"");
            } else if (bMo2592e == 39) {
                sb.append("\\'");
            } else if (bMo2592e != 92) {
                switch (bMo2592e) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo2592e < 32 || bMo2592e > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo2592e >>> 6) & 3) + 48));
                            sb.append((char) (((bMo2592e >>> 3) & 7) + 48));
                            sb.append((char) ((bMo2592e & 7) + 48));
                        } else {
                            sb.append((char) bMo2592e);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static int m3278n(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    /* JADX INFO: renamed from: o */
    public static void m3279o(int i, long j, long[] jArr) {
        long jM5169h = p32.m5169h(p32.m5169h(p32.m5169h(p32.m5169h(p32.m5169h(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = jM5169h & (-6148914691236517206L);
        jArr[i + 1] = (jM5169h << 1) & (-6148914691236517206L);
    }

    /* JADX INFO: renamed from: p */
    public static p01 m3280p(k51 k51Var, String str) {
        int i = 0;
        while (true) {
            f51[] f51VarArr = k51Var.f5679a;
            if (i >= f51VarArr.length) {
                return null;
            }
            f51 f51Var = f51VarArr[i];
            if (f51Var instanceof p01) {
                p01 p01Var = (p01) f51Var;
                if (p01Var.f8606a.equals(str)) {
                    return p01Var;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m3281q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static Drawable m3282r(Context context, int i) {
        return jl1.m3659b().m3662c(context, i);
    }

    /* JADX INFO: renamed from: s */
    public static Set m3283s(String str, Map map) {
        mv1 mv1VarValueOf;
        List listM5559v = AbstractC1337qm.m5559v(str, map);
        if (listM5559v == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(mv1.class);
        for (Object obj : listM5559v) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                ua0.m6448f0(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                mv1VarValueOf = nv1.m4609c(iIntValue).f7562a;
                ua0.m6448f0(mv1VarValueOf.f7126a == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    StringBuilder sb = new StringBuilder("Can not convert status code ");
                    sb.append(obj);
                    Class<?> cls = obj.getClass();
                    sb.append(" to Status.Code, because its type is ");
                    sb.append(cls);
                    throw new C0656fx(sb.toString());
                }
                try {
                    mv1VarValueOf = mv1.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new C0656fx("Status code " + obj + " is not valid", e);
                }
            }
            enumSetNoneOf.add(mv1VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    /* JADX INFO: renamed from: t */
    public static List m3284t(Map map) {
        String strM5506A;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listM5559v = AbstractC1337qm.m5559v("loadBalancingConfig", map);
            if (listM5559v == null) {
                listM5559v = null;
            } else {
                AbstractC1337qm.m5539h(listM5559v);
            }
            arrayList.addAll(listM5559v);
        }
        if (arrayList.isEmpty() && (strM5506A = AbstractC1337qm.m5506A("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strM5506A.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: w */
    public static int m3285w(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m3286x(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (f4690i[i2] == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m3287y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m3288z(View view) {
        WeakHashMap weakHashMap = i72.f4849a;
        return t62.m6240d(view) == 1;
    }

    /* JADX INFO: renamed from: u */
    public abstract short mo3289u(short s);

    /* JADX INFO: renamed from: v */
    public abstract short mo3290v(short s, short s2);
}
