package p000;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.sun.security.util.DerValue;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.Window;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: qm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1337qm {

    /* JADX INFO: renamed from: a */
    public static final char[] f9533a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final int[] f9534b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f9535c = new Object[0];

    /* JADX INFO: renamed from: d */
    public static final Object f9536d = new Object();

    /* JADX INFO: renamed from: e */
    public static final byte[] f9537e = {112, 114, 111, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f9538f = {112, 114, 109, 0};

    /* JADX INFO: renamed from: g */
    public static Boolean f9539g;

    /* JADX INFO: renamed from: A */
    public static String m5506A(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    /* JADX INFO: renamed from: B */
    public static Long m5507B(String str, Map map) {
        String strM5506A = m5506A(str, map);
        if (strM5506A == null) {
            return null;
        }
        try {
            return Long.valueOf(m5516Q(strM5506A));
        } catch (ParseException e) {
            ca0.m1184p(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m5508C(String str) {
        synchronized (f9536d) {
            m5528b(str, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m5509D(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static LinkedHashSet m5510E(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(qy0.m5619i0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: F */
    public static List m5511F(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: I */
    public static int m5512I(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: J */
    public static int m5513J(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: K */
    public static ArrayList m5514K(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static byte[] m5515P(hf1 hf1Var, ch1 ch1Var) {
        byte[] bArr = new byte[ch1Var.f1811f - 32];
        for (int i = 0; i < ch1Var.f1807b; i++) {
            C1174o9 c1174o9 = hf1Var.f4558b[i];
            byte[] bArr2 = new byte[320];
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = i2 * 5;
                int[] iArr = (int[]) c1174o9.f7699b;
                int i4 = i2 * 4;
                int i5 = iArr[i4];
                bArr2[i3] = (byte) i5;
                int i6 = iArr[i4 + 1];
                bArr2[i3 + 1] = (byte) ((i5 >> 8) | (i6 << 2));
                int i7 = i6 >> 6;
                int i8 = iArr[i4 + 2];
                bArr2[i3 + 2] = (byte) (i7 | (i8 << 4));
                int i9 = iArr[i4 + 3];
                bArr2[i3 + 3] = (byte) ((i9 << 6) | (i8 >> 4));
                bArr2[i3 + 4] = (byte) (i9 >> 2);
            }
            c1174o9.getClass();
            System.arraycopy(bArr2, 0, bArr, i * 320, 320);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: Q */
    public static long m5516Q(String str) throws ParseException {
        boolean z;
        String strSubstring;
        int iCharAt;
        String strSubstring2 = str;
        if (strSubstring2.isEmpty() || strSubstring2.charAt(strSubstring2.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(strSubstring2), 0);
        }
        if (strSubstring2.charAt(0) == '-') {
            strSubstring2 = strSubstring2.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strSubstring3 = strSubstring2.substring(0, strSubstring2.length() - 1);
        int iIndexOf = strSubstring3.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring3.substring(iIndexOf + 1);
            strSubstring3 = strSubstring3.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long jM5791k = Long.parseLong(strSubstring3);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (jM5791k < 0) {
            throw new ParseException("Invalid duration string: ".concat(strSubstring2), 0);
        }
        if (z) {
            jM5791k = -jM5791k;
            iCharAt = -iCharAt;
        }
        long j = iCharAt;
        if (j <= -1000000000 || j >= 1000000000) {
            try {
                jM5791k = rc2.m5791k(jM5791k, j / 1000000000);
                iCharAt = (int) (j % 1000000000);
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Duration value is out of range.", 0);
            }
        }
        if (jM5791k > 0 && iCharAt < 0) {
            iCharAt = (int) (((long) iCharAt) + 1000000000);
            jM5791k--;
        }
        if (jM5791k < 0 && iCharAt > 0) {
            iCharAt = (int) (((long) iCharAt) - 1000000000);
            jM5791k++;
        }
        long j2 = jM5791k;
        if (j2 >= -315576000000L && j2 <= 315576000000L) {
            long j3 = iCharAt;
            if (j3 >= -999999999 && j3 < 1000000000 && ((j2 >= 0 && iCharAt >= 0) || (j2 <= 0 && iCharAt <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j2);
                long j4 = iCharAt;
                long j5 = nanos + j4;
                return (((j4 ^ nanos) > 0L ? 1 : ((j4 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j5) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        ca0.m1179k("Duration is not valid. See proto definition for valid values. Seconds (", j2, ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (", iCharAt, ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
        return 0L;
    }

    /* JADX INFO: renamed from: R */
    public static int[] m5517R(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM6046P = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM6046P += (int) sc2.m6046P(2, byteArrayInputStream);
            iArr[i2] = iM6046P;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: S */
    public static f20[] m5518S(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, f20[] f20VarArr) throws IOException {
        byte[] bArr3 = ua0.f11242n;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ua0.f11243o)) {
                f40.m2719o("Unsupported meta version");
                return null;
            }
            int iM6046P = (int) sc2.m6046P(2, fileInputStream);
            byte[] bArrM6043M = sc2.m6043M(fileInputStream, (int) sc2.m6046P(4, fileInputStream), (int) sc2.m6046P(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                f40.m2719o("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM6043M);
            try {
                f20[] f20VarArrM5520U = m5520U(byteArrayInputStream, bArr2, iM6046P, f20VarArr);
                byteArrayInputStream.close();
                return f20VarArrM5520U;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ua0.f11237i, bArr2)) {
            f40.m2719o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            f40.m2719o("Unsupported meta version");
            return null;
        }
        int iM6046P2 = (int) sc2.m6046P(1, fileInputStream);
        byte[] bArrM6043M2 = sc2.m6043M(fileInputStream, (int) sc2.m6046P(4, fileInputStream), (int) sc2.m6046P(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            f40.m2719o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM6043M2);
        try {
            f20[] f20VarArrM5519T = m5519T(byteArrayInputStream2, iM6046P2, f20VarArr);
            byteArrayInputStream2.close();
            return f20VarArrM5519T;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: T */
    public static f20[] m5519T(ByteArrayInputStream byteArrayInputStream, int i, f20[] f20VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new f20[0];
        }
        if (i != f20VarArr.length) {
            f40.m2719o("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM6046P = (int) sc2.m6046P(2, byteArrayInputStream);
            iArr[i2] = (int) sc2.m6046P(2, byteArrayInputStream);
            strArr[i2] = new String(sc2.m6041K(iM6046P, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            f20 f20Var = f20VarArr[i3];
            if (!f20Var.f3587b.equals(strArr[i3])) {
                f40.m2719o("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            f20Var.f3590e = i4;
            f20Var.f3593h = m5517R(byteArrayInputStream, i4);
        }
        return f20VarArr;
    }

    /* JADX INFO: renamed from: U */
    public static f20[] m5520U(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, f20[] f20VarArr) {
        f20 f20Var;
        if (byteArrayInputStream.available() == 0) {
            return new f20[0];
        }
        if (i != f20VarArr.length) {
            f40.m2719o("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            sc2.m6046P(2, byteArrayInputStream);
            String str = new String(sc2.m6041K((int) sc2.m6046P(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jM6046P = sc2.m6046P(4, byteArrayInputStream);
            int iM6046P = (int) sc2.m6046P(2, byteArrayInputStream);
            if (f20VarArr.length <= 0) {
                f20Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= f20VarArr.length) {
                    f20Var = null;
                    break;
                }
                if (f20VarArr[i3].f3587b.equals(strSubstring)) {
                    f20Var = f20VarArr[i3];
                    break;
                }
                i3++;
            }
            if (f20Var == null) {
                f40.m2719o("Missing profile key: ".concat(str));
                return null;
            }
            f20Var.f3589d = jM6046P;
            int[] iArrM5517R = m5517R(byteArrayInputStream, iM6046P);
            if (Arrays.equals(bArr, ua0.f11241m)) {
                f20Var.f3590e = iM6046P;
                f20Var.f3593h = iArrM5517R;
            }
        }
        return f20VarArr;
    }

    /* JADX INFO: renamed from: V */
    public static long m5521V(dc1 dc1Var, int i, int i2) {
        dc1Var.m2316F(i);
        if (dc1Var.m2318a() < 5) {
            return -9223372036854775807L;
        }
        int iM2324g = dc1Var.m2324g();
        if ((8388608 & iM2324g) != 0 || ((2096896 & iM2324g) >> 8) != i2 || (iM2324g & 32) == 0 || dc1Var.m2337t() < 7 || dc1Var.m2318a() < 7 || (dc1Var.m2337t() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        dc1Var.m2322e(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX INFO: renamed from: W */
    public static f20[] m5522W(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ua0.f11238j)) {
            f40.m2719o("Unsupported version");
            return null;
        }
        int iM6046P = (int) sc2.m6046P(1, fileInputStream);
        byte[] bArrM6043M = sc2.m6043M(fileInputStream, (int) sc2.m6046P(4, fileInputStream), (int) sc2.m6046P(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            f40.m2719o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM6043M);
        try {
            f20[] f20VarArrM5523X = m5523X(byteArrayInputStream, str, iM6046P);
            byteArrayInputStream.close();
            return f20VarArrM5523X;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: X */
    public static f20[] m5523X(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new f20[0];
        }
        f20[] f20VarArr = new f20[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM6046P = (int) sc2.m6046P(2, byteArrayInputStream);
            int iM6046P2 = (int) sc2.m6046P(2, byteArrayInputStream);
            f20VarArr[i3] = new f20(str, new String(sc2.m6041K(iM6046P, byteArrayInputStream), StandardCharsets.UTF_8), sc2.m6046P(4, byteArrayInputStream), iM6046P2, (int) sc2.m6046P(4, byteArrayInputStream), (int) sc2.m6046P(4, byteArrayInputStream), new int[iM6046P2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            f20 f20Var = f20VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = f20Var.f3591f;
            int i6 = f20Var.f3592g;
            TreeMap treeMap = f20Var.f3594i;
            int i7 = iAvailable - i5;
            int iM6046P3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM6046P3 += (int) sc2.m6046P(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iM6046P3), 1);
                int iM6046P4 = (int) sc2.m6046P(2, byteArrayInputStream);
                while (iM6046P4 > 0) {
                    sc2.m6046P(2, byteArrayInputStream);
                    int iM6046P5 = (int) sc2.m6046P(1, byteArrayInputStream);
                    if (iM6046P5 != 6 && iM6046P5 != 7) {
                        while (iM6046P5 > 0) {
                            sc2.m6046P(1, byteArrayInputStream);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM6046P6 = (int) sc2.m6046P(1, byteArrayInputStream); iM6046P6 > 0; iM6046P6--) {
                                sc2.m6046P(2, byteArrayInputStream);
                            }
                            iM6046P5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM6046P4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                f40.m2719o("Read too much data during profile line parse");
                return null;
            }
            f20Var.f3593h = m5517R(byteArrayInputStream, f20Var.f3590e);
            BitSet bitSetValueOf = BitSet.valueOf(sc2.m6041K((((i6 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return f20VarArr;
    }

    /* JADX INFO: renamed from: Y */
    public static void m5524Y(C0767iv c0767iv) {
        c0767iv.f5174k = -3.4028235E38f;
        c0767iv.f5173j = Integer.MIN_VALUE;
        CharSequence charSequence = c0767iv.f5164a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c0767iv.f5164a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c0767iv.f5164a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public static float m5525Z(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    /* JADX INFO: renamed from: a */
    public static final int m5526a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX INFO: renamed from: a0 */
    public static final int m5527a0(tq1 tq1Var, int i) {
        int i2;
        int[] iArr = tq1Var.f10927f;
        int i3 = i + 1;
        int length = tq1Var.f10926e.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: b */
    public static String m5528b(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f9536d) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbM5346m = AbstractC1308pu.m5346m(str, "\n  ");
        sbM5346m.append(strReplace.replace("\n", "\n  "));
        sbM5346m.append('\n');
        return sbM5346m.toString();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m5529b0(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            z92.m7267a(window, z);
        } else {
            y92.m7069a(window, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX INFO: renamed from: c */
    public static boolean m5530c(int i, Rect rect, Rect rect2, Rect rect3) {
        int iM5512I;
        int i2;
        int i3;
        boolean zM5532d = m5532d(i, rect, rect2);
        if (!m5532d(i, rect, rect3) && zM5532d) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iM5512I = m5512I(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else {
                                    if (i == 130) {
                                        f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                }
                                if (iM5512I < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i != 17) {
                            iM5512I = m5512I(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iM5512I < Math.max(1, i2 - i3)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i != 17) {
                        iM5512I = m5512I(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iM5512I < Math.max(1, i2 - i3)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i != 17) {
                    iM5512I = m5512I(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iM5512I < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public static Set m5531c0(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return q60.f9397a;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            setSingleton.getClass();
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(qy0.m5619i0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    /* JADX INFO: renamed from: d */
    public static boolean m5532d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        f40.m2713i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static int m5533d0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: e */
    public static int m5534e(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m5535e0(Object obj) {
        return m5533d0(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: f */
    public static int m5536f(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m5537f0(byte[] bArr, long j, int i) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m5538g0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, f20[] f20VarArr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = ua0.f11241m;
        byte[] bArr3 = ua0.f11240l;
        byte[] bArr4 = ua0.f11237i;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = ua0.f11238j;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM5543j = m5543j(f20VarArr, bArr5);
                sc2.m6055Z(byteArrayOutputStream, f20VarArr.length, 1);
                sc2.m6055Z(byteArrayOutputStream, bArrM5543j.length, 4);
                byte[] bArrM6063g = sc2.m6063g(bArrM5543j);
                sc2.m6055Z(byteArrayOutputStream, bArrM6063g.length, 4);
                byteArrayOutputStream.write(bArrM6063g);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                sc2.m6055Z(byteArrayOutputStream, f20VarArr.length, 1);
                for (f20 f20Var : f20VarArr) {
                    int size = f20Var.f3594i.size() * 4;
                    String strM5555r = m5555r(f20Var.f3586a, f20Var.f3587b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    sc2.m6057a0(byteArrayOutputStream, strM5555r.getBytes(charset).length);
                    sc2.m6057a0(byteArrayOutputStream, f20Var.f3593h.length);
                    sc2.m6055Z(byteArrayOutputStream, size, 4);
                    sc2.m6055Z(byteArrayOutputStream, f20Var.f3588c, 4);
                    byteArrayOutputStream.write(strM5555r.getBytes(charset));
                    Iterator it = f20Var.f3594i.keySet().iterator();
                    while (it.hasNext()) {
                        sc2.m6057a0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        sc2.m6057a0(byteArrayOutputStream, 0);
                    }
                    for (int i3 : f20Var.f3593h) {
                        sc2.m6057a0(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = ua0.f11239k;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM5543j2 = m5543j(f20VarArr, bArr6);
                sc2.m6055Z(byteArrayOutputStream, f20VarArr.length, 1);
                sc2.m6055Z(byteArrayOutputStream, bArrM5543j2.length, 4);
                byte[] bArrM6063g2 = sc2.m6063g(bArrM5543j2);
                sc2.m6055Z(byteArrayOutputStream, bArrM6063g2.length, 4);
                byteArrayOutputStream.write(bArrM6063g2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            sc2.m6057a0(byteArrayOutputStream, f20VarArr.length);
            for (f20 f20Var2 : f20VarArr) {
                String str = f20Var2.f3586a;
                TreeMap treeMap = f20Var2.f3594i;
                String strM5555r2 = m5555r(str, f20Var2.f3587b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                sc2.m6057a0(byteArrayOutputStream, strM5555r2.getBytes(charset2).length);
                sc2.m6057a0(byteArrayOutputStream, treeMap.size());
                sc2.m6057a0(byteArrayOutputStream, f20Var2.f3593h.length);
                sc2.m6055Z(byteArrayOutputStream, f20Var2.f3588c, 4);
                byteArrayOutputStream.write(strM5555r2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    sc2.m6057a0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : f20Var2.f3593h) {
                    sc2.m6057a0(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            sc2.m6057a0(byteArrayOutputStream2, f20VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (f20 f20Var3 : f20VarArr) {
                sc2.m6055Z(byteArrayOutputStream2, f20Var3.f3588c, 4);
                sc2.m6055Z(byteArrayOutputStream2, f20Var3.f3589d, 4);
                sc2.m6055Z(byteArrayOutputStream2, f20Var3.f3592g, 4);
                String strM5555r3 = m5555r(f20Var3.f3586a, f20Var3.f3587b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM5555r3.getBytes(charset3).length;
                sc2.m6057a0(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM5555r3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            nb2 nb2Var = new nb2(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList.add(nb2Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < f20VarArr.length) {
                try {
                    f20 f20Var4 = f20VarArr[i7];
                    sc2.m6057a0(byteArrayOutputStream3, i7);
                    sc2.m6057a0(byteArrayOutputStream3, f20Var4.f3590e);
                    i8 = i8 + 4 + (f20Var4.f3590e * i5);
                    int[] iArr = f20Var4.f3593h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        sc2.m6057a0(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            nb2 nb2Var2 = new nb2(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList.add(nb2Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < f20VarArr.length; i13++) {
                try {
                    f20 f20Var5 = f20VarArr[i13];
                    Iterator it3 = f20Var5.f3594i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m5548l0(byteArrayOutputStream5, f20Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m5550m0(byteArrayOutputStream6, f20Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            sc2.m6057a0(byteArrayOutputStream4, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            sc2.m6055Z(byteArrayOutputStream4, length4, 4);
                            sc2.m6057a0(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i14 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            nb2 nb2Var3 = new nb2(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList.add(nb2Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            sc2.m6055Z(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                nb2 nb2Var4 = (nb2) arrayList.get(i15);
                int i16 = nb2Var4.f7351a;
                byte[] bArr7 = nb2Var4.f7352b;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                sc2.m6055Z(byteArrayOutputStream, j, 4);
                sc2.m6055Z(byteArrayOutputStream, size2, 4);
                if (nb2Var4.f7353c) {
                    long length5 = bArr7.length;
                    byte[] bArrM6063g3 = sc2.m6063g(bArr7);
                    arrayList2.add(bArrM6063g3);
                    sc2.m6055Z(byteArrayOutputStream, bArrM6063g3.length, 4);
                    sc2.m6055Z(byteArrayOutputStream, length5, 4);
                    length = bArrM6063g3.length;
                } else {
                    arrayList2.add(bArr7);
                    sc2.m6055Z(byteArrayOutputStream, bArr7.length, 4);
                    sc2.m6055Z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5539h(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static AbstractList m5540h0(List list, yg0 yg0Var) {
        return list != null ? new cu0(list, yg0Var) : new du0(list, yg0Var);
    }

    /* JADX INFO: renamed from: i */
    public static final void m5541i(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX INFO: renamed from: i0 */
    public static void m5542i0(String str, String str2) {
        synchronized (f9536d) {
            Log.w(str, m5528b(str2, null));
        }
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m5543j(f20[] f20VarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (f20 f20Var : f20VarArr) {
            length += ((((f20Var.f3592g * 2) + 7) & (-8)) / 8) + (f20Var.f3590e * 2) + m5555r(f20Var.f3586a, f20Var.f3587b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + f20Var.f3591f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ua0.f11239k)) {
            for (f20 f20Var2 : f20VarArr) {
                m5546k0(byteArrayOutputStream, f20Var2, m5555r(f20Var2.f3586a, f20Var2.f3587b, bArr));
                m5550m0(byteArrayOutputStream, f20Var2);
                int[] iArr = f20Var2.f3593h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    sc2.m6057a0(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m5548l0(byteArrayOutputStream, f20Var2);
            }
        } else {
            for (f20 f20Var3 : f20VarArr) {
                m5546k0(byteArrayOutputStream, f20Var3, m5555r(f20Var3.f3586a, f20Var3.f3587b, bArr));
            }
            for (f20 f20Var4 : f20VarArr) {
                m5550m0(byteArrayOutputStream, f20Var4);
                int[] iArr2 = f20Var4.f3593h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    sc2.m6057a0(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m5548l0(byteArrayOutputStream, f20Var4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m5544j0(String str, String str2, Throwable th) {
        synchronized (f9536d) {
            Log.w(str, m5528b(str2, th));
        }
    }

    /* JADX INFO: renamed from: k */
    public static hg1 m5545k(AbstractC1399sa abstractC1399sa, AbstractC0001a0 abstractC0001a0) throws IOException {
        int i;
        int i2;
        byte[][] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        long jM6033C;
        byte[] bArr2;
        int i7;
        short[] sArr;
        int i8;
        ir0 ir0VarM3249f;
        if (abstractC1399sa instanceof yh1) {
            yh1 yh1Var = (yh1) abstractC1399sa;
            return new hg1(b52.m928f(yh1Var.f12983b), new C1123mw(sc2.m6061e(yh1Var.f12984c)), abstractC0001a0, (byte[]) null);
        }
        if (abstractC1399sa instanceof eo1) {
            eo1 eo1Var = (eo1) abstractC1399sa;
            return new hg1(new C1431t5(vb1.f11608b, new yn1(b52.m929g(eo1Var.f5628b))), new C1123mw(sc2.m6061e(eo1Var.f3400c)), (AbstractC0001a0) null, (byte[]) null);
        }
        if (abstractC1399sa instanceof c71) {
            C1431t5 c1431t5 = new C1431t5(vb1.f11609c);
            short[] sArrM6062f = sc2.m6062f(((c71) abstractC1399sa).f1698b);
            byte[] bArr3 = new byte[sArrM6062f.length * 2];
            for (int i9 = 0; i9 != sArrM6062f.length; i9++) {
                short s = sArrM6062f[i9];
                int i10 = i9 * 2;
                bArr3[i10] = (byte) s;
                bArr3[i10 + 1] = (byte) (s >>> 8);
            }
            return new hg1(c1431t5, new C1123mw(bArr3), (AbstractC0001a0) null, (byte[]) null);
        }
        if (abstractC1399sa instanceof hr0) {
            hr0 hr0Var = (hr0) abstractC1399sa;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            try {
                byteArrayOutputStream.write(hr0Var.getEncoded());
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(1);
                try {
                    byteArrayOutputStream2.write(hr0Var.m3249f().m3479b());
                    return new hg1(new C1431t5(ub1.f11250a), new C1123mw(byteArray), abstractC0001a0, byteArrayOutputStream2.toByteArray());
                } catch (Exception e) {
                    l41.m4043l(e.getMessage(), e);
                    return null;
                }
            } catch (Exception e2) {
                l41.m4043l(e2.getMessage(), e2);
                return null;
            }
        }
        if (abstractC1399sa instanceof rj0) {
            rj0 rj0Var = (rj0) abstractC1399sa;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = rj0Var.f10059b;
            byteArrayOutputStream3.write((byte) (i11 >>> 24));
            byteArrayOutputStream3.write((byte) (i11 >>> 16));
            byteArrayOutputStream3.write((byte) (i11 >>> 8));
            byteArrayOutputStream3.write((byte) i11);
            try {
                byteArrayOutputStream3.write(rj0Var.getEncoded());
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i12 = rj0Var.f10059b;
                byteArrayOutputStream4.write((byte) (i12 >>> 24));
                byteArrayOutputStream4.write((byte) (i12 >>> 16));
                byteArrayOutputStream4.write((byte) (i12 >>> 8));
                byteArrayOutputStream4.write((byte) i12);
                synchronized (rj0Var) {
                    ir0VarM3249f = ((hr0) rj0Var.f10061d.get(0)).m3249f();
                    if (ir0VarM3249f == null) {
                        throw new NullPointerException("lmsPublicKey");
                    }
                }
                try {
                    byteArrayOutputStream4.write(ir0VarM3249f.m3479b());
                    return new hg1(new C1431t5(ub1.f11250a), new C1123mw(byteArray2), abstractC0001a0, byteArrayOutputStream4.toByteArray());
                } catch (Exception e3) {
                    l41.m4043l(e3.getMessage(), e3);
                    return null;
                }
            } catch (Exception e4) {
                l41.m4043l(e4.getMessage(), e4);
                return null;
            }
        }
        if (abstractC1399sa instanceof co1) {
            co1 co1Var = (co1) abstractC1399sa;
            C1431t5 c1431t6 = new C1431t5((C1351r) b52.f1210r.get((bo1) co1Var.f7397b));
            C1123mw c1123mw = new C1123mw(co1Var.getEncoded());
            kk0 kk0Var = co1Var.f1879d;
            return new hg1(c1431t6, c1123mw, abstractC0001a0, sc2.m6064h(kk0Var.f5894a, kk0Var.f5895b));
        }
        if (abstractC1399sa instanceof tn1) {
            tn1 tn1Var = (tn1) abstractC1399sa;
            C1431t5 c1431t7 = new C1431t5((C1351r) b52.f1187N.get((sn1) tn1Var.f7397b));
            kk0 kk0Var2 = tn1Var.f10908c;
            byte[] bArr4 = kk0Var2.f5894a;
            byte[] bArr5 = kk0Var2.f5895b;
            kk0 kk0Var3 = tn1Var.f10909d;
            return new hg1(c1431t7, sc2.m6065i(new byte[][]{bArr4, bArr5, kk0Var3.f5894a, kk0Var3.f5895b}), abstractC0001a0, (byte[]) null);
        }
        if (abstractC1399sa instanceof bd1) {
            bd1 bd1Var = (bd1) abstractC1399sa;
            return new hg1(new C1431t5((C1351r) b52.f1202j.get((ad1) bd1Var.f7397b)), new C1123mw(sc2.m6061e(bd1Var.f1313c)), abstractC0001a0, (byte[]) null);
        }
        if (!(abstractC1399sa instanceof C1185ok)) {
            if (abstractC1399sa instanceof kc2) {
                kc2 kc2Var = (kc2) abstractC1399sa;
                C1431t5 c1431t8 = new C1431t5(vb1.f11610d, new yb2(kc2Var.f5749c.f4527b, b52.m931i(kc2Var.f5628b)));
                byte[] encoded = kc2Var.getEncoded();
                hc2 hc2Var = kc2Var.f5749c;
                int i13 = hc2Var.f4531f;
                int i14 = hc2Var.f4527b;
                int iM4661i = (int) o21.m4661i(4, encoded);
                if (!o21.m4649T(i14, iM4661i)) {
                    f40.m2713i("index out of bounds");
                    return null;
                }
                byte[] bArrM4690y = o21.m4690y(4, i13, encoded);
                int i15 = 4 + i13;
                byte[] bArrM4690y2 = o21.m4690y(i15, i13, encoded);
                int i16 = i15 + i13;
                byte[] bArrM4690y3 = o21.m4690y(i16, i13, encoded);
                int i17 = i16 + i13;
                byte[] bArrM4690y4 = o21.m4690y(i17, i13, encoded);
                int i18 = i17 + i13;
                byte[] bArrM4690y5 = o21.m4690y(i18, encoded.length - i18, encoded);
                try {
                    int i19 = ((C1663zf) o21.m4686w(bArrM4690y5, C1663zf.class)).f13392p;
                    return new hg1(c1431t8, i19 != (1 << i14) + (-1) ? new ic2(iM4661i, bArrM4690y, bArrM4690y2, bArrM4690y3, bArrM4690y4, bArrM4690y5, i19) : new ic2(iM4661i, bArrM4690y, bArrM4690y2, bArrM4690y3, bArrM4690y4, bArrM4690y5), abstractC0001a0, (byte[]) null);
                } catch (ClassNotFoundException e5) {
                    lv1.m4305q(e5.getMessage(), "cannot parse BDS: ");
                    return null;
                }
            }
            if (abstractC1399sa instanceof dc2) {
                dc2 dc2Var = (dc2) abstractC1399sa;
                C1351r c1351r = vb1.f11611e;
                ac2 ac2Var = dc2Var.f2885c;
                C1431t5 c1431t9 = new C1431t5(c1351r, new zb2(ac2Var.f144c, ac2Var.f145d, b52.m931i(dc2Var.f5628b)));
                byte[] encoded2 = dc2Var.getEncoded();
                ac2 ac2Var2 = dc2Var.f2885c;
                int i20 = ac2Var2.f143b.f4531f;
                int i21 = ac2Var2.f144c;
                int i22 = (i21 + 7) / 8;
                long jM4661i = (int) o21.m4661i(i22, encoded2);
                if (!o21.m4649T(i21, jM4661i)) {
                    f40.m2713i("index out of bounds");
                    return null;
                }
                byte[] bArrM4690y6 = o21.m4690y(i22, i20, encoded2);
                int i23 = i22 + i20;
                byte[] bArrM4690y7 = o21.m4690y(i23, i20, encoded2);
                int i24 = i23 + i20;
                byte[] bArrM4690y8 = o21.m4690y(i24, i20, encoded2);
                int i25 = i24 + i20;
                byte[] bArrM4690y9 = o21.m4690y(i25, i20, encoded2);
                int i26 = i25 + i20;
                byte[] bArrM4690y10 = o21.m4690y(i26, encoded2.length - i26, encoded2);
                try {
                    long j = ((C0017ag) o21.m4686w(bArrM4690y10, C0017ag.class)).f226b;
                    return new hg1(c1431t9, j != (1 << i21) - 1 ? new bc2(jM4661i, bArrM4690y6, bArrM4690y7, bArrM4690y8, bArrM4690y9, bArrM4690y10, j) : new bc2(jM4661i, bArrM4690y6, bArrM4690y7, bArrM4690y8, bArrM4690y9, bArrM4690y10), abstractC0001a0, (byte[]) null);
                } catch (ClassNotFoundException e6) {
                    lv1.m4305q(e6.getMessage(), "cannot parse BDSStateMap: ");
                    return null;
                }
            }
            if (abstractC1399sa instanceof m01) {
                m01 m01Var = (m01) abstractC1399sa;
                return new hg1(new C1431t5(vb1.f11607a), new l01(m01Var.f6579c, m01Var.f6580d, m01Var.f6581e, m01Var.f6582f, m01Var.f6583g, b52.m923a(m01Var.f5628b)), (AbstractC0001a0) null, (byte[]) null);
            }
            if (abstractC1399sa instanceof jg0) {
                jg0 jg0Var = (jg0) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1204l.get((ig0) jg0Var.f7397b)), new C1123mw(sc2.m6061e(jg0Var.f5381c)), abstractC0001a0, (byte[]) null);
            }
            if (abstractC1399sa instanceof ln1) {
                ln1 ln1Var = (ln1) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1206n.get((kn1) ln1Var.f7397b)), new C1123mw(sc2.m6061e(ln1Var.f6480c)), abstractC0001a0, (byte[]) null);
            }
            if (abstractC1399sa instanceof j71) {
                j71 j71Var = (j71) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1212t.get((i71) j71Var.f7397b)), new C1123mw(sc2.m6061e(j71Var.f5314c)), abstractC0001a0, (byte[]) null);
            }
            if (abstractC1399sa instanceof k90) {
                k90 k90Var = (k90) abstractC1399sa;
                C1431t5 c1431t10 = new C1431t5((C1351r) b52.f1214v.get((i90) k90Var.f7397b));
                l90 l90Var = new l90(sc2.m6061e(k90Var.f5714c));
                byte[] bArrM6061e = sc2.m6061e(k90Var.f5715d);
                byte[] bArrM6061e2 = sc2.m6061e(k90Var.f5716e);
                byte[] bArrM6061e3 = sc2.m6061e(k90Var.f5717f);
                j90 j90Var = new j90();
                j90Var.f5326a = 0;
                j90Var.f5327b = bArrM6061e;
                j90Var.f5328c = bArrM6061e2;
                j90Var.f5329d = bArrM6061e3;
                j90Var.f5330e = l90Var;
                return new hg1(c1431t10, j90Var, abstractC0001a0, (byte[]) null);
            }
            if (abstractC1399sa instanceof pw0) {
                pw0 pw0Var = (pw0) abstractC1399sa;
                C1431t5 c1431t11 = new C1431t5((C1351r) b52.f1183J.get((ow0) pw0Var.f7397b));
                int i27 = pw0Var.f9189n;
                if (i27 == 1) {
                    return new hg1(c1431t11, new C0827kg(false, 0, (InterfaceC0696h) new C1123mw(sc2.m6061e(pw0Var.f9188m)), 1), abstractC0001a0, (byte[]) null);
                }
                return i27 == 2 ? new hg1(c1431t11, new C1123mw(pw0Var.getEncoded()), abstractC0001a0, (byte[]) null) : new hg1(c1431t11, m5556s(sc2.m6061e(pw0Var.f9188m), pw0Var.getEncoded()), abstractC0001a0, (byte[]) null);
            }
            if (abstractC1399sa instanceof g71) {
                g71 g71Var = (g71) abstractC1399sa;
                C0733i c0733i = new C0733i();
                c0733i.m3324b(new C1123mw(sc2.m6061e(g71Var.f4094c)));
                c0733i.m3324b(new C1123mw(sc2.m6061e(g71Var.f4095d)));
                c0733i.m3324b(new C1123mw(sc2.m6061e(g71Var.f4096e)));
                c0733i.m3324b(new C1123mw(sc2.m6061e(g71Var.f4097f)));
                return new hg1(new C1431t5((C1351r) b52.f1216x.get((f71) g71Var.f7397b)), new C1310pw(c0733i, 0), abstractC0001a0);
            }
            if (abstractC1399sa instanceof wn1) {
                wn1 wn1Var = (wn1) abstractC1399sa;
                C0733i c0733i2 = new C0733i();
                c0733i2.m3324b(new C1123mw(sc2.m6061e(wn1Var.f12236c)));
                c0733i2.m3324b(new C1123mw(sc2.m6061e(wn1Var.f12237d)));
                c0733i2.m3324b(new C1123mw(sc2.m6061e(wn1Var.f12238e)));
                c0733i2.m3324b(new C1123mw(sc2.m6061e(wn1Var.f12239f)));
                c0733i2.m3324b(new C1123mw(sc2.m6061e(wn1Var.f12240g)));
                return new hg1(new C1431t5((C1351r) b52.f1218z.get((vn1) wn1Var.f7397b)), new C1310pw(c0733i2, 0), abstractC0001a0);
            }
            if (abstractC1399sa instanceof jw0) {
                jw0 jw0Var = (jw0) abstractC1399sa;
                C1431t5 c1431t12 = new C1431t5((C1351r) b52.f1185L.get((iw0) jw0Var.f7397b));
                int i28 = jw0Var.f5585p;
                if (i28 == 1) {
                    return new hg1(c1431t12, new C0827kg(new C1123mw(sc2.m6061e(jw0Var.f5584o))), abstractC0001a0);
                }
                return i28 == 2 ? new hg1(c1431t12, new C1123mw(jw0Var.getEncoded()), abstractC0001a0) : new hg1(c1431t12, m5556s(sc2.m6061e(jw0Var.f5584o), jw0Var.getEncoded()), abstractC0001a0);
            }
            if (abstractC1399sa instanceof o20) {
                o20 o20Var = (o20) abstractC1399sa;
                C1431t5 c1431t13 = new C1431t5((C1351r) b52.f1175B.get((n20) o20Var.f7397b));
                p20 p20Var = new p20((n20) o20Var.f7397b, o20Var.f7619c, o20Var.f7625n);
                return new hg1(c1431t13, new C1123mw(sc2.m6065i(new byte[][]{o20Var.f7619c, o20Var.f7620d, o20Var.f7621e, o20Var.f7622f, o20Var.f7623g, o20Var.f7624m})), abstractC0001a0, sc2.m6064h(p20Var.f8668c, p20Var.f8669d));
            }
            if (abstractC1399sa instanceof C1294pg) {
                C1294pg c1294pg = (C1294pg) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1177D.get((C1181og) c1294pg.f7397b)), new C1123mw(c1294pg.getEncoded()), abstractC0001a0);
            }
            if (abstractC1399sa instanceof pj0) {
                pj0 pj0Var = (pj0) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1179F.get((oj0) pj0Var.f7397b)), new C1123mw(pj0Var.getEncoded()), abstractC0001a0);
            }
            if (abstractC1399sa instanceof oi1) {
                oi1 oi1Var = (oi1) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1181H.get(oi1Var.m4547b())), new C1123mw(oi1Var.getEncoded()), abstractC0001a0);
            }
            if (abstractC1399sa instanceof i01) {
                i01 i01Var = (i01) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1189P.get(i01Var.m4546a())), new C1123mw(i01Var.getEncoded()), abstractC0001a0);
            }
            if (abstractC1399sa instanceof xt1) {
                xt1 xt1Var = (xt1) abstractC1399sa;
                return new hg1(new C1431t5((C1351r) b52.f1191R.get(xt1Var.m6976a())), new C1123mw(xt1Var.getEncoded()), abstractC0001a0);
            }
            ca0.m1178j("key parameters not recognized");
            return null;
        }
        C1185ok c1185ok = (C1185ok) abstractC1399sa;
        C1431t5 c1431t14 = new C1431t5((C1351r) b52.f1208p.get((C1111mk) c1185ok.f7397b));
        C1074lk c1074lk = ((C1111mk) c1185ok.f7397b).f7026c;
        byte[] bArr6 = new byte[c1074lk.m4223a()];
        byte[] bArr7 = c1185ok.f7827c;
        byte[] bArr8 = new byte[c1074lk.m4223a()];
        int i29 = c1074lk.f6373c;
        int i30 = 1 << i29;
        short[] sArr2 = new short[i30];
        int[] iArr = new int[i30];
        int i31 = 1;
        int i32 = c1074lk.f6371a;
        int i33 = 8;
        int i34 = i32 / 8;
        int i35 = i30 * 4;
        int i36 = i35 + i34;
        byte[] bArr9 = new byte[i36];
        int i37 = ((i36 - 32) - c1074lk.f6374d) - i35;
        rn1 rn1Var = new rn1(256);
        rn1Var.mo728c(DerValue.TAG_APPLICATION);
        rn1Var.mo729e(0, 32, bArr7);
        rn1Var.m5864m(0, i36, bArr9);
        for (int i38 = 0; i38 < i30; i38++) {
            iArr[i38] = sc2.m6032B((i38 * 4) + i37, bArr9);
        }
        boolean z = c1074lk.f6379i;
        int i39 = c1074lk.f6377g;
        hr1 hr1Var = c1074lk.f6378h;
        int i40 = c1074lk.f6375e;
        int i41 = c1074lk.f6372b;
        short[] sArr3 = new short[i41 + 1];
        sArr3[i41] = 1;
        int i42 = 0;
        while (i42 < i41) {
            int i43 = i42 * 2;
            int i44 = i42;
            sArr3[i44] = (short) (((short) ((bArr7[i43 + 40] & 255) | ((bArr7[i43 + 41] & 255) << 8))) & i39);
            i42 = i44 + 1;
        }
        long[] jArr = new long[i30];
        int i45 = 0;
        while (i45 < i30) {
            long[] jArr2 = jArr;
            long j2 = iArr[i45];
            jArr2[i45] = j2;
            long j3 = j2 << 31;
            jArr2[i45] = j3;
            long j4 = j3 | ((long) i45);
            jArr2[i45] = j4;
            jArr2[i45] = j4 & Long.MAX_VALUE;
            i45++;
            jArr = jArr2;
            c1431t14 = c1431t14;
        }
        long[] jArr3 = jArr;
        C1431t5 c1431t15 = c1431t14;
        if (i30 >= 2) {
            int i46 = 1;
            while (i46 < i30 - i46) {
                i46 += i46;
            }
            int i47 = i46;
            while (i47 > 0) {
                int i48 = i46;
                int i49 = 0;
                while (i49 < i30 - i47) {
                    if ((i49 & i47) == 0) {
                        int i50 = i49 + i47;
                        long j5 = jArr3[i50];
                        long j6 = jArr3[i49];
                        i2 = i49;
                        long j7 = (-((j5 - j6) >>> 63)) & (j6 ^ j5);
                        jArr3[i2] = j6 ^ j7;
                        jArr3[i50] = jArr3[i50] ^ j7;
                    } else {
                        i2 = i49;
                    }
                    i49 = i2 + 1;
                }
                int i51 = i48;
                int i52 = 0;
                while (i51 > i47) {
                    int i53 = i51;
                    while (i52 < i30 - i53) {
                        if ((i52 & i47) == 0) {
                            int i54 = i52 + i47;
                            long j8 = jArr3[i54];
                            i = i52;
                            int i55 = i53;
                            while (i55 > i47) {
                                int i56 = i + i55;
                                long j9 = jArr3[i56];
                                int i57 = i55;
                                long j10 = (-((j9 - j8) >>> 63)) & (j8 ^ j9);
                                j8 ^= j10;
                                jArr3[i56] = j9 ^ j10;
                                i55 = i57 >>> 1;
                                i54 = i54;
                            }
                            jArr3[i54] = j8;
                        } else {
                            i = i52;
                        }
                        i52 = i + 1;
                    }
                    i51 = i53 >>> 1;
                }
                i47 >>>= 1;
                i46 = i48;
            }
        }
        for (int i58 = 1; i58 < i30; i58++) {
            if ((jArr3[i58 - 1] >> 31) == (jArr3[i58] >> 31)) {
                C1298pk c1298pk = new C1298pk(bArr6);
                byte[] bArrM6067k = sc2.m6067k(0, 32, c1185ok.f7827c);
                byte[] bArrM6067k2 = sc2.m6067k(32, 40, c1185ok.f7827c);
                byte[] bArrM6067k3 = sc2.m6067k(40, (((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, c1185ok.f7827c);
                byte[] bArr10 = c1185ok.f7827c;
                byte[] bArrM6067k4 = sc2.m6067k((((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, bArr10.length - 32, bArr10);
                byte[] bArr11 = c1185ok.f7827c;
                byte[] bArrM6067k5 = sc2.m6067k(bArr11.length - 32, bArr11.length, bArr11);
                C1148nk c1148nk = new C1148nk();
                c1148nk.f7431a = 0;
                c1148nk.f7432b = sc2.m6061e(bArrM6067k);
                c1148nk.f7433c = sc2.m6061e(bArrM6067k2);
                c1148nk.f7434d = sc2.m6061e(bArrM6067k3);
                c1148nk.f7435e = sc2.m6061e(bArrM6067k4);
                c1148nk.f7436f = sc2.m6061e(bArrM6067k5);
                c1148nk.f7437g = c1298pk;
                return new hg1(c1431t15, c1148nk, abstractC0001a0, (byte[]) null);
            }
        }
        short[] sArr4 = new short[i32];
        int i59 = 0;
        while (i59 < i30) {
            int i60 = i59;
            sArr2[i60] = (short) (jArr3[i59] & ((long) i39));
            i59 = i60 + 1;
            sArr4 = sArr4;
        }
        short[] sArr5 = sArr4;
        for (int i61 = 0; i61 < i32; i61++) {
            short s2 = sArr2[i61];
            short s3 = (short) (((s2 & 65280) >> 8) | ((s2 & 255) << 8));
            short s4 = (short) (((s3 & 61680) >> 4) | ((s3 & 3855) << 4));
            short s5 = (short) (((s4 & 52428) >> 2) | ((s4 & 13107) << 2));
            short s6 = (short) (((s5 & 43690) >> 1) | ((s5 & 21845) << 1));
            sArr5[i61] = (short) (i29 == 12 ? s6 >> 4 : s6 >> 3);
        }
        short[] sArr6 = new short[i32];
        for (int i62 = 0; i62 < i32; i62++) {
            short s7 = sArr5[i62];
            short sMo3290v = sArr3[i41];
            for (int i63 = i41 - 1; i63 >= 0; i63--) {
                sMo3290v = (short) (hr1Var.mo3290v(sMo3290v, s7) ^ sArr3[i63]);
            }
            sArr6[i62] = sMo3290v;
        }
        for (int i64 = 0; i64 < i32; i64++) {
            sArr6[i64] = hr1Var.mo3289u(sArr6[i64]);
        }
        byte b = 0;
        byte[][] bArr12 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i40, i34);
        int i65 = 0;
        while (i65 < i40) {
            int i66 = b;
            while (i66 < i34) {
                bArr12[i65][i66] = b;
                i66++;
                b = 0;
            }
            i65++;
            b = 0;
        }
        int i67 = 0;
        while (i67 < i41) {
            int i68 = 0;
            while (true) {
                sArr = sArr6;
                i8 = 0;
                if (i68 >= i32) {
                    break;
                }
                while (i8 < i29) {
                    int i69 = i8;
                    bArr12[(i67 * i29) + i69][i68 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr[i68 + 7] >>> i8) & 1)) << 1)) | ((sArr[i68 + 6] >>> i69) & 1))) << 1)) | ((sArr[i68 + 5] >>> i69) & 1))) << 1)) | ((sArr[i68 + 4] >>> i69) & 1))) << 1)) | ((sArr[i68 + 3] >>> i69) & 1))) << 1)) | ((sArr[i68 + 2] >>> i69) & 1))) << 1)) | ((sArr[i68 + 1] >>> i69) & 1))) << 1)) | ((sArr[i68] >>> i69) & 1));
                    i8 = i69 + 1;
                }
                i68 += 8;
                sArr6 = sArr;
            }
            while (i8 < i32) {
                int i70 = i8;
                sArr[i70] = hr1Var.mo3290v(sArr[i8], sArr5[i70]);
                i8 = i70 + 1;
            }
            i67++;
            sArr6 = sArr;
        }
        int i71 = 0;
        while (i71 < i40) {
            int i72 = i71 >>> 3;
            int i73 = i71 & 7;
            if (c1074lk.f6380j && i71 == (i6 = i40 - 32)) {
                long[] jArr4 = new long[64];
                long[] jArr5 = new long[32];
                bArr = bArr12;
                byte[] bArr13 = new byte[9];
                int i74 = i6 / 8;
                int i75 = i6 % 8;
                if (z) {
                    int i76 = 0;
                    while (i76 < 32) {
                        int i77 = i76;
                        for (int i78 = 0; i78 < 9; i78++) {
                            bArr13[i78] = bArr[i6 + i77][i74 + i78];
                        }
                        int i79 = 0;
                        for (int i80 = i33; i79 < i80; i80 = 8) {
                            int i81 = i79 + 1;
                            bArr13[i79] = (byte) (((bArr13[i79] & 255) >> i75) | (bArr13[i81] << (8 - i75)));
                            i79 = i81;
                        }
                        jArr4[i77] = sc2.m6033C(0, bArr13);
                        i76 = i77 + 1;
                        i33 = 8;
                    }
                } else {
                    for (int i82 = 0; i82 < 32; i82++) {
                        jArr4[i82] = sc2.m6033C(i74, bArr[i6 + i82]);
                    }
                }
                int i83 = 0;
                int i84 = 32;
                while (i83 < i84) {
                    int i85 = i83 + 1;
                    int i86 = i73;
                    int i87 = i6;
                    long j11 = jArr4[i83];
                    int i88 = i83;
                    int i89 = i85;
                    while (i89 < i84) {
                        j11 |= jArr4[i89];
                        i89++;
                        i84 = 32;
                    }
                    long j12 = 0;
                    if (j11 == 0) {
                        C1298pk c1298pk2 = new C1298pk(bArr6);
                        byte[] bArrM6067k6 = sc2.m6067k(0, 32, c1185ok.f7827c);
                        byte[] bArrM6067k7 = sc2.m6067k(32, 40, c1185ok.f7827c);
                        byte[] bArrM6067k8 = sc2.m6067k(40, (((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, c1185ok.f7827c);
                        byte[] bArr14 = c1185ok.f7827c;
                        byte[] bArrM6067k9 = sc2.m6067k((((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, bArr14.length - 32, bArr14);
                        byte[] bArr15 = c1185ok.f7827c;
                        byte[] bArrM6067k10 = sc2.m6067k(bArr15.length - 32, bArr15.length, bArr15);
                        C1148nk c1148nk2 = new C1148nk();
                        c1148nk2.f7431a = 0;
                        c1148nk2.f7432b = sc2.m6061e(bArrM6067k6);
                        c1148nk2.f7433c = sc2.m6061e(bArrM6067k7);
                        c1148nk2.f7434d = sc2.m6061e(bArrM6067k8);
                        c1148nk2.f7435e = sc2.m6061e(bArrM6067k9);
                        c1148nk2.f7436f = sc2.m6061e(bArrM6067k10);
                        c1148nk2.f7437g = c1298pk2;
                        return new hg1(c1431t15, c1148nk2, abstractC0001a0, (byte[]) null);
                    }
                    long j13 = ~j11;
                    long j14 = 72340172838076673L;
                    for (int i90 = 0; i90 < 8; i90++) {
                        j14 &= j13 >>> i90;
                        j12 += j14;
                    }
                    long j15 = j12 & 578721382704613384L;
                    long j16 = j15 | (j15 >>> i31);
                    long j17 = j16 | (j16 >>> 2);
                    long j18 = j12 >>> 8;
                    long j19 = j12 + (j18 & j17);
                    long j20 = j17;
                    long j21 = j19;
                    int i91 = 2;
                    for (int i92 = 8; i91 < i92; i92 = 8) {
                        j20 &= j20 >>> i92;
                        j18 >>>= i92;
                        j21 += j18 & j20;
                        i91++;
                    }
                    int i93 = ((int) j21) & 255;
                    jArr5[i88] = i93;
                    int i94 = i85;
                    while (true) {
                        i7 = 32;
                        if (i94 >= 32) {
                            break;
                        }
                        long j22 = jArr4[i88];
                        jArr4[i88] = j22 ^ (jArr4[i94] & (((j22 >> i93) & 1) - 1));
                        i94++;
                    }
                    int i95 = i85;
                    while (i95 < i7) {
                        long j23 = jArr4[i95];
                        int i96 = i95;
                        jArr4[i96] = (jArr4[i88] & (-((j23 >> i93) & 1))) ^ j23;
                        i95 = i96 + 1;
                        i32 = i32;
                        i7 = 32;
                    }
                    i84 = i7;
                    i83 = i85;
                    i73 = i86;
                    i6 = i87;
                }
                i3 = i32;
                i5 = i73;
                int i97 = i6;
                int i98 = 0;
                while (i98 < i84) {
                    int i99 = i98 + 1;
                    int i100 = i99;
                    while (i100 < 64) {
                        int i101 = i97 + i98;
                        short s8 = sArr2[i101];
                        int i102 = i97 + i100;
                        int i103 = i98;
                        int i104 = i99;
                        long j24 = (-((((long) (((short) i100) ^ ((short) jArr5[i103]))) - 1) >>> 63)) & ((long) (s8 ^ sArr2[i102]));
                        sArr2[i101] = (short) (((long) s8) ^ j24);
                        sArr2[i102] = (short) (j24 ^ ((long) sArr2[i102]));
                        i100++;
                        i98 = i103;
                        i99 = i104;
                    }
                    i98 = i99;
                    i84 = 32;
                }
                int i105 = 0;
                while (i105 < i40) {
                    if (z) {
                        for (int i106 = 0; i106 < 9; i106++) {
                            bArr13[i106] = bArr[i105][i74 + i106];
                        }
                        int i107 = 0;
                        while (i107 < 8) {
                            int i108 = i107 + 1;
                            bArr13[i107] = (byte) (((bArr13[i107] & 255) >> i75) | (bArr13[i108] << (8 - i75)));
                            i107 = i108;
                        }
                        jM6033C = sc2.m6033C(0, bArr13);
                    } else {
                        jM6033C = sc2.m6033C(i74, bArr[i105]);
                    }
                    int i109 = 0;
                    while (i109 < 32) {
                        int i110 = (int) jArr5[i109];
                        long j25 = ((jM6033C >> i109) ^ (jM6033C >> i110)) & 1;
                        jM6033C = (j25 << i109) ^ ((j25 << i110) ^ jM6033C);
                        i109++;
                        i40 = i40;
                    }
                    int i111 = i40;
                    if (z) {
                        m5537f0(bArr13, jM6033C, 0);
                        byte[] bArr16 = bArr[i105];
                        int i112 = i74 + 8;
                        int i113 = 8 - i75;
                        bArr16[i112] = (byte) ((((bArr16[i112] & 255) >>> i75) << i75) | ((bArr13[7] & 255) >>> i113));
                        bArr16[i74] = (byte) (((bArr13[0] & 255) << i75) | (((bArr16[i74] & 255) << i113) >>> i113));
                        int i114 = 7;
                        for (int i115 = i31; i114 >= i115; i115 = 1) {
                            byte[] bArr17 = bArr13;
                            bArr[i105][i74 + i114] = (byte) (((bArr17[i114 - 1] & 255) >>> i113) | ((bArr13[i114] & 255) << i75));
                            i114--;
                            bArr13 = bArr17;
                        }
                        bArr2 = bArr13;
                    } else {
                        bArr2 = bArr13;
                        m5537f0(bArr[i105], jM6033C, i74);
                    }
                    i105++;
                    i40 = i111;
                    bArr13 = bArr2;
                    i31 = 1;
                }
                i4 = i40;
            } else {
                bArr = bArr12;
                i72 = i72;
                i3 = i32;
                i4 = i40;
                i5 = i73;
            }
            int i116 = i71 + 1;
            for (int i117 = i116; i117 < i4; i117++) {
                byte b2 = (byte) (-((byte) (((byte) (((byte) (bArr[i71][i72] ^ bArr[i117][i72])) >> i5)) & 1)));
                for (int i118 = 0; i118 < i34; i118++) {
                    byte[] bArr18 = bArr[i71];
                    bArr18[i118] = (byte) (bArr18[i118] ^ (bArr[i117][i118] & b2));
                }
            }
            if (((bArr[i71][i72] >> i5) & 1) == 0) {
                C1298pk c1298pk3 = new C1298pk(bArr6);
                byte[] bArrM6067k11 = sc2.m6067k(0, 32, c1185ok.f7827c);
                byte[] bArrM6067k12 = sc2.m6067k(32, 40, c1185ok.f7827c);
                byte[] bArrM6067k13 = sc2.m6067k(40, (((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, c1185ok.f7827c);
                byte[] bArr19 = c1185ok.f7827c;
                byte[] bArrM6067k14 = sc2.m6067k((((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, bArr19.length - 32, bArr19);
                byte[] bArr110 = c1185ok.f7827c;
                byte[] bArrM6067k15 = sc2.m6067k(bArr110.length - 32, bArr110.length, bArr110);
                C1148nk c1148nk3 = new C1148nk();
                c1148nk3.f7431a = 0;
                c1148nk3.f7432b = sc2.m6061e(bArrM6067k11);
                c1148nk3.f7433c = sc2.m6061e(bArrM6067k12);
                c1148nk3.f7434d = sc2.m6061e(bArrM6067k13);
                c1148nk3.f7435e = sc2.m6061e(bArrM6067k14);
                c1148nk3.f7436f = sc2.m6061e(bArrM6067k15);
                c1148nk3.f7437g = c1298pk3;
                return new hg1(c1431t15, c1148nk3, abstractC0001a0, (byte[]) null);
            }
            for (int i119 = 0; i119 < i4; i119++) {
                if (i119 != i71) {
                    byte b3 = (byte) (-((byte) (((byte) (bArr[i119][i72] >> i5)) & 1)));
                    for (int i120 = 0; i120 < i34; i120++) {
                        byte[] bArr20 = bArr[i119];
                        bArr20[i120] = (byte) (bArr20[i120] ^ (bArr[i71][i120] & b3));
                    }
                }
            }
            i71 = i116;
            i40 = i4;
            bArr12 = bArr;
            i67 = i72;
            i32 = i3;
            i31 = 1;
            i33 = 8;
        }
        byte[][] bArr21 = bArr12;
        int i121 = i32;
        int i122 = i40;
        if (z) {
            int i123 = i122 % 8;
            if (i123 == 0) {
                System.arraycopy(bArr21[i67], (i122 - 1) / 8, bArr8, 0, i34);
            } else {
                int i124 = 0;
                int i125 = 0;
                while (i124 < i122) {
                    int i126 = (i122 - 1) / 8;
                    while (i126 < i34 - 1) {
                        byte[] bArr22 = bArr21[i124];
                        int i127 = (bArr22[i126] & 255) >>> i123;
                        i126++;
                        bArr8[i125] = (byte) ((bArr22[i126] << (8 - i123)) | i127);
                        i125++;
                    }
                    bArr8[i125] = (byte) ((bArr21[i124][i126] & 255) >>> i123);
                    i124++;
                    i125++;
                }
            }
        } else {
            int i128 = ((i121 - i122) + 7) / 8;
            for (int i129 = 0; i129 < i122; i129++) {
                System.arraycopy(bArr21[i129], i122 / 8, bArr8, i128 * i129, i128);
            }
        }
        C1298pk c1298pk4 = new C1298pk(bArr6);
        byte[] bArrM6067k16 = sc2.m6067k(0, 32, c1185ok.f7827c);
        byte[] bArrM6067k17 = sc2.m6067k(32, 40, c1185ok.f7827c);
        byte[] bArrM6067k18 = sc2.m6067k(40, (((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, c1185ok.f7827c);
        byte[] bArr111 = c1185ok.f7827c;
        byte[] bArrM6067k19 = sc2.m6067k((((C1111mk) c1185ok.f7397b).f7025b * 2) + 40, bArr111.length - 32, bArr111);
        byte[] bArr112 = c1185ok.f7827c;
        byte[] bArrM6067k110 = sc2.m6067k(bArr112.length - 32, bArr112.length, bArr112);
        C1148nk c1148nk4 = new C1148nk();
        c1148nk4.f7431a = 0;
        c1148nk4.f7432b = sc2.m6061e(bArrM6067k16);
        c1148nk4.f7433c = sc2.m6061e(bArrM6067k17);
        c1148nk4.f7434d = sc2.m6061e(bArrM6067k18);
        c1148nk4.f7435e = sc2.m6061e(bArrM6067k19);
        c1148nk4.f7436f = sc2.m6061e(bArrM6067k110);
        c1148nk4.f7437g = c1298pk4;
        return new hg1(c1431t15, c1148nk4, abstractC0001a0, (byte[]) null);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m5546k0(ByteArrayOutputStream byteArrayOutputStream, f20 f20Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        sc2.m6057a0(byteArrayOutputStream, str.getBytes(charset).length);
        sc2.m6057a0(byteArrayOutputStream, f20Var.f3590e);
        sc2.m6055Z(byteArrayOutputStream, f20Var.f3591f, 4);
        sc2.m6055Z(byteArrayOutputStream, f20Var.f3588c, 4);
        sc2.m6055Z(byteArrayOutputStream, f20Var.f3592g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: l */
    public static void m5547l(String str) {
        synchronized (f9536d) {
            m5528b(str, null);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m5548l0(ByteArrayOutputStream byteArrayOutputStream, f20 f20Var) throws IOException {
        byte[] bArr = new byte[(((f20Var.f3592g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : f20Var.f3594i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + f20Var.f3592g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: m */
    public static void m5549m(String str, String str2) {
        synchronized (f9536d) {
            Log.e(str, m5528b(str2, null));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m5550m0(ByteArrayOutputStream byteArrayOutputStream, f20 f20Var) {
        int i = 0;
        for (Map.Entry entry : f20Var.f3594i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                sc2.m6057a0(byteArrayOutputStream, iIntValue - i);
                sc2.m6057a0(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m5551n(String str, String str2, Throwable th) {
        synchronized (f9536d) {
            Log.e(str, m5528b(str2, th));
        }
    }

    /* JADX INFO: renamed from: o */
    public static C0717hk m5552o(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(AbstractC0609en.f3387a);
        bytes.getClass();
        C0717hk c0717hk = new C0717hk(bytes);
        c0717hk.f4610c = str;
        return c0717hk;
    }

    /* JADX INFO: renamed from: p */
    public static final z60 m5553p(Enum[] enumArr) {
        enumArr.getClass();
        return new z60(enumArr);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m5554q(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static String m5555r(String str, String str2, byte[] bArr) {
        byte[] bArr2 = ua0.f11240l;
        byte[] bArr3 = ua0.f11241m;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC1308pu.m5342i(AbstractC1308pu.m5344k(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: s */
    public static C1310pw m5556s(byte[] bArr, byte[] bArr2) {
        C0733i c0733i = new C0733i(2);
        c0733i.m3324b(new C1123mw(bArr));
        c0733i.m3324b(new C1123mw(bArr2));
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m5557t(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    /* JADX INFO: renamed from: u */
    public static C1351r m5558u(String str) {
        if (str.equals("SHA-256")) {
            return e71.f3252a;
        }
        if (str.equals("SHA-512")) {
            return e71.f3254c;
        }
        if (str.equals("SHAKE128")) {
            return e71.f3258g;
        }
        if (str.equals("SHAKE256")) {
            return e71.f3259h;
        }
        f40.m2713i("unrecognized digest: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static List m5559v(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    /* JADX INFO: renamed from: w */
    public static List m5560w(String str, Map map) {
        List listM5559v = m5559v(str, map);
        if (listM5559v == null) {
            return null;
        }
        for (int i = 0; i < listM5559v.size(); i++) {
            if (!(listM5559v.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listM5559v.get(i), Integer.valueOf(i), listM5559v));
            }
        }
        return listM5559v;
    }

    /* JADX INFO: renamed from: x */
    public static Double m5561x(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            ca0.m1183o("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            ca0.m1183o("value '%s' for key '%s' is not a double", new Object[]{obj, str});
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static Integer m5562y(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                ca0.m1183o("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                ca0.m1183o("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d);
    }

    /* JADX INFO: renamed from: z */
    public static Map m5563z(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo2841G(int i, String str);

    /* JADX INFO: renamed from: H */
    public abstract void mo2842H(int i, String str, Object... objArr);

    /* JADX INFO: renamed from: L */
    public abstract void mo3310L(nv1 nv1Var);

    /* JADX INFO: renamed from: M */
    public abstract void mo4487M(int i);

    /* JADX INFO: renamed from: N */
    public abstract void mo4488N(Typeface typeface);

    /* JADX INFO: renamed from: O */
    public abstract void mo3311O(w71 w71Var);

    /* JADX INFO: renamed from: g */
    public void m5564g(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0598ec(i, 3, this));
    }
}
