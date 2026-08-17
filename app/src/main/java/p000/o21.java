package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.sun.security.util.DerValue;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0066e;
import com.example.ssmousepro.injection.TouchPipeline;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o21 implements d82 {

    /* JADX INFO: renamed from: a */
    public static final int[] f7626a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: b */
    public static final h70 f7627b = new h70(0);

    /* JADX INFO: renamed from: c */
    public static final byte[] f7628c = {0, 0, 0, 1};

    /* JADX INFO: renamed from: d */
    public static final float[] f7629d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: e */
    public static final Object f7630e = new Object();

    /* JADX INFO: renamed from: f */
    public static int[] f7631f = new int[10];

    /* JADX INFO: renamed from: g */
    public static final nt1 f7632g = new nt1();

    /* JADX INFO: renamed from: h */
    public static final ot1 f7633h = new ot1();

    /* JADX INFO: renamed from: A */
    public static short[][][] m4633A(mi1 mi1Var, int i, int i2, int i3, boolean z) {
        byte[] bArr = new byte[z ? (((i2 + 1) * i2) / 2) * i : i * i2 * i3];
        mi1Var.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i3);
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                for (int i7 = 0; i7 < i; i7++) {
                    if (!z || i5 <= i6) {
                        sArr[i7][i5][i6] = (short) (bArr[i4] & 255);
                        i4++;
                    }
                }
            }
        }
        return sArr;
    }

    /* JADX INFO: renamed from: A0 */
    public static void m4634A0(int i, byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i2 + 2;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i2 + 3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 += 4;
        } while (i2 < 16);
    }

    /* JADX INFO: renamed from: B */
    public static short[][] m4635B(mi1 mi1Var, int i, int i2) {
        byte[] bArr = new byte[i * i2];
        mi1Var.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sArr[i4][i3] = (short) (bArr[(i3 * i) + i4] & 255);
            }
        }
        return sArr;
    }

    /* JADX INFO: renamed from: B0 */
    public static void m4636B0(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    /* JADX INFO: renamed from: C */
    public static void m4637C(int i, dc1 dc1Var) {
        dc1Var.m2313C(7);
        byte[] bArr = dc1Var.f2882a;
        bArr[0] = -84;
        bArr[1] = DerValue.TAG_APPLICATION;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: G */
    public static ColorStateList m4638G(Context context, C1174o9 c1174o9, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) c1174o9.f7699b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = AbstractC0075au.getColorStateList(context, resourceId)) == null) ? c1174o9.m4774w(i) : colorStateList;
    }

    /* JADX INFO: renamed from: H */
    public static ColorStateList m4639H(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = AbstractC0075au.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    /* JADX INFO: renamed from: J */
    public static float m4640J(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? f50.m2722b(edgeEffect) : TouchPipeline.SIZE;
    }

    /* JADX INFO: renamed from: K */
    public static Drawable m4641K(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM3282r;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM3282r = hr1.m3282r(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM3282r;
    }

    /* JADX INFO: renamed from: L */
    public static byte[] m4642L(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i = 0; i < length2; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                bArr[(i * length) + i2] = (byte) sArr[i2][i];
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: M */
    public static byte[] m4643M(short[][][] sArr, boolean z) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length3; i3++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i2 <= i3) {
                        bArr[i] = (byte) sArr3[i2][i3];
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: N */
    public static String m4644N(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                nm0 nm0VarM5566m = qm0.m5566m();
                int i2 = 0;
                while (i2 < bArr.length) {
                    int iM4692z = m4692z(bArr, i2, bArr.length, zArr);
                    if (iM4692z != bArr.length) {
                        nm0VarM5566m.m3901a(Integer.valueOf(iM4692z));
                    }
                    i2 = iM4692z + 3;
                }
                kk1 kk1VarM4561g = nm0VarM5566m.m4561g();
                for (int i3 = 0; i3 < kk1VarM4561g.f5898d; i3++) {
                    if (((Integer) kk1VarM4561g.get(i3)).intValue() + 3 < length) {
                        C0141cm c0141cm = new C0141cm(bArr, ((Integer) kk1VarM4561g.get(i3)).intValue() + 3, length);
                        g21 g21VarM4660h0 = m4660h0(c0141cm);
                        if (g21VarM4660h0.f4020a == 33 && g21VarM4660h0.f4021b == 0) {
                            c0141cm.m1249t(4);
                            int iM1238i = c0141cm.m1238i(3);
                            c0141cm.m1248s();
                            m71 m71VarM4662i0 = m4662i0(c0141cm, true, iM1238i, null);
                            return AbstractC0574dp.m2374a(m71VarM4662i0.f6682a, m71VarM4662i0.f6683b, m71VarM4662i0.f6684c, m71VarM4662i0.f6685d, m71VarM4662i0.f6686e, m71VarM4662i0.f6687f);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    public static File m4645P(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static long m4646Q(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        long j11 = (((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8);
        long j12 = (((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9);
        long j13 = (((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10);
        return (j11 & 1229782938247303441L) | (j12 & 2459565876494606882L) | (j13 & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    /* JADX INFO: renamed from: R */
    public static boolean m4647R(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m4648S(byte b) {
        if (((b & 96) >> 5) != 0) {
            return true;
        }
        int i = b & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m4649T(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        f40.m2719o("index must not be negative");
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static uy1 m4650U(mg0 mg0Var) {
        mg0Var.getClass();
        return new uy1(mg0Var);
    }

    /* JADX INFO: renamed from: V */
    public static int m4651V(short[][] sArr, byte[] bArr, int i) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                sArr[i3][i2] = (short) (bArr[(i2 * length) + i + i3] & 255);
            }
        }
        return length * length2;
    }

    /* JADX INFO: renamed from: W */
    public static int m4652W(short[][][] sArr, byte[] bArr, int i, boolean z) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        sArr3[i3][i4] = (short) (bArr[i2 + i] & 255);
                        i2++;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: X */
    public static MappedByteBuffer m4653X(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorM6225a = t32.m6225a(context.getContentResolver(), uri, "r", null);
            if (parcelFileDescriptorM6225a == null) {
                if (parcelFileDescriptorM6225a != null) {
                    parcelFileDescriptorM6225a.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorM6225a.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorM6225a.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorM6225a.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m4654Y(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long jReverse = Long.reverse(j);
        long jReverse2 = Long.reverse(j2);
        long jReverse3 = Long.reverse(j3);
        long jReverse4 = Long.reverse(j4);
        long jReverse5 = Long.reverse(m4646Q(jReverse, jReverse3));
        long jM4646Q = m4646Q(j, j3) << 1;
        long jReverse6 = Long.reverse(m4646Q(jReverse2, jReverse4));
        long jM4646Q2 = m4646Q(j2, j4);
        long j5 = jM4646Q2 << 1;
        long jReverse7 = Long.reverse(m4646Q(jReverse ^ jReverse2, jReverse3 ^ jReverse4));
        long jM4646Q3 = ((m4646Q(j ^ j2, j3 ^ j4) << 1) ^ ((jReverse6 ^ jM4646Q) ^ j5)) ^ ((jM4646Q2 << 63) ^ (jM4646Q2 << 58));
        jArr[0] = jReverse5 ^ ((jM4646Q3 >>> 7) ^ (((jM4646Q3 >>> 1) ^ jM4646Q3) ^ (jM4646Q3 >>> 2)));
        jArr[1] = ((jM4646Q3 << 57) ^ ((jM4646Q3 << 63) ^ (jM4646Q3 << 62))) ^ ((jReverse7 ^ ((jM4646Q ^ jReverse5) ^ jReverse6)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7)));
    }

    /* JADX INFO: renamed from: a0 */
    public static void m4655a0(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static float m4656d0(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f50.m2723c(edgeEffect, f, f2);
        }
        e50.m2503a(edgeEffect, f, f2);
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX INFO: renamed from: e0 */
    public static C0699h2 m4657e0(C0141cm c0141cm) {
        int i;
        int i2;
        int iM1238i = c0141cm.m1238i(16);
        int iM1238i2 = c0141cm.m1238i(16);
        if (iM1238i2 == 65535) {
            iM1238i2 = c0141cm.m1238i(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM1238i2 + i;
        if (iM1238i == 44097) {
            i3 += 2;
        }
        if (c0141cm.m1238i(2) == 3) {
            do {
                c0141cm.m1238i(2);
            } while (c0141cm.m1237h());
        }
        int iM1238i3 = c0141cm.m1238i(10);
        if (c0141cm.m1237h() && c0141cm.m1238i(3) > 0) {
            c0141cm.m1249t(2);
        }
        int i4 = c0141cm.m1237h() ? 48000 : 44100;
        int iM1238i4 = c0141cm.m1238i(4);
        int[] iArr = f7626a;
        if (i4 == 44100 && iM1238i4 == 13) {
            i2 = iArr[iM1238i4];
        } else if (i4 != 48000 || iM1238i4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iM1238i4];
            int i6 = iM1238i3 % 5;
            if (i6 == 1) {
                if (iM1238i4 != 3 || iM1238i4 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iM1238i4 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iM1238i4 == 3 || iM1238i4 == 8 || iM1238i4 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iM1238i4 == 8 || iM1238i4 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new C0699h2(i4, i3, i2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m4658f0(C0141cm c0141cm, C0662g2 c0662g2) throws fc1 {
        int iM1238i = c0141cm.m1238i(5);
        c0141cm.m1249t(2);
        if (c0141cm.m1237h()) {
            c0141cm.m1249t(5);
        }
        if (iM1238i >= 7 && iM1238i <= 10) {
            c0141cm.m1248s();
        }
        if (c0141cm.m1237h()) {
            int iM1238i2 = c0141cm.m1238i(3);
            if (c0662g2.f4013a == -1 && iM1238i >= 0 && iM1238i <= 15 && (iM1238i2 == 0 || iM1238i2 == 1)) {
                c0662g2.f4013a = iM1238i;
            }
            if (c0141cm.m1237h()) {
                m4680s0(c0141cm);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m4659g0(C0141cm c0141cm, C0662g2 c0662g2) throws fc1 {
        c0141cm.m1249t(2);
        boolean zM1237h = c0141cm.m1237h();
        int iM1238i = c0141cm.m1238i(8);
        for (int i = 0; i < iM1238i; i++) {
            c0141cm.m1249t(2);
            if (c0141cm.m1237h()) {
                c0141cm.m1249t(5);
            }
            if (zM1237h) {
                c0141cm.m1249t(24);
            } else {
                if (c0141cm.m1237h()) {
                    if (!c0141cm.m1237h()) {
                        c0141cm.m1249t(4);
                    }
                    c0662g2.f4014b = c0141cm.m1238i(6) + 1;
                }
                c0141cm.m1249t(4);
            }
        }
        if (c0141cm.m1237h()) {
            c0141cm.m1249t(3);
            if (c0141cm.m1237h()) {
                m4680s0(c0141cm);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static g21 m4660h0(C0141cm c0141cm) {
        c0141cm.m1248s();
        int iM1238i = c0141cm.m1238i(6);
        int iM1238i2 = c0141cm.m1238i(6);
        c0141cm.m1238i(3);
        return new g21(iM1238i, iM1238i2);
    }

    /* JADX INFO: renamed from: i */
    public static long m4661i(int i, byte[] bArr) {
        long j = 0;
        if (bArr == null) {
            l41.m4051t("in == null");
            return 0L;
        }
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    /* JADX INFO: renamed from: i0 */
    public static m71 m4662i0(C0141cm c0141cm, boolean z, int i, m71 m71Var) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zM1237h;
        int iM1238i;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (m71Var != null) {
                int i7 = m71Var.f6682a;
                zM1237h = m71Var.f6683b;
                iM1238i = m71Var.f6684c;
                i5 = m71Var.f6685d;
                iArr2 = m71Var.f6686e;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iM1238i2 = c0141cm.m1238i(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (c0141cm.m1237h()) {
                    i6 += 88;
                }
                if (c0141cm.m1237h()) {
                    i6 += 8;
                }
            }
            c0141cm.m1249t(i6);
            if (i > 0) {
                c0141cm.m1249t((8 - i) * 2);
            }
            return new m71(i2, z2, i3, i4, iArr, iM1238i2);
        }
        int iM1238i3 = c0141cm.m1238i(2);
        zM1237h = c0141cm.m1237h();
        iM1238i = c0141cm.m1238i(5);
        i5 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (c0141cm.m1237h()) {
                i5 |= 1 << i9;
            }
        }
        for (int i10 = 0; i10 < 6; i10++) {
            iArr2[i10] = c0141cm.m1238i(8);
        }
        i2 = iM1238i3;
        iArr = iArr2;
        z2 = zM1237h;
        i3 = iM1238i;
        i4 = i5;
        int iM1238i4 = c0141cm.m1238i(8);
        i6 = 0;
        while (i8 < i) {
            if (c0141cm.m1237h()) {
                i6 += 88;
            }
            if (c0141cm.m1237h()) {
                i6 += 8;
            }
        }
        c0141cm.m1249t(i6);
        if (i > 0) {
            c0141cm.m1249t((8 - i) * 2);
        }
        return new m71(i2, z2, i3, i4, iArr, iM1238i4);
    }

    /* JADX INFO: renamed from: j */
    public static void m4663j(String str, boolean z) throws fc1 {
        if (!z) {
            throw fc1.m2799a(null, str);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static p71 m4664j0(int i, int i2, byte[] bArr) {
        byte b;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b == 0 || i2 <= i3) {
            return null;
        }
        C0141cm c0141cm = new C0141cm(bArr, i3, i2 + 1);
        while (c0141cm.m1233d(16)) {
            int iM1238i = c0141cm.m1238i(8);
            int i4 = 0;
            while (iM1238i == 255) {
                i4 += 255;
                iM1238i = c0141cm.m1238i(8);
            }
            int i5 = i4 + iM1238i;
            int iM1238i2 = c0141cm.m1238i(8);
            int i6 = 0;
            while (iM1238i2 == 255) {
                i6 += 255;
                iM1238i2 = c0141cm.m1238i(8);
            }
            int i7 = i6 + iM1238i2;
            if (i7 == 0 || !c0141cm.m1233d(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iM1242m = c0141cm.m1242m();
                boolean zM1237h = c0141cm.m1237h();
                int iM1242m2 = zM1237h ? c0141cm.m1242m() : 0;
                int iM1242m3 = c0141cm.m1242m();
                int iM1242m4 = -1;
                for (int i8 = 0; i8 <= iM1242m3; i8++) {
                    iM1242m4 = c0141cm.m1242m();
                    c0141cm.m1242m();
                    int iM1238i3 = c0141cm.m1238i(6);
                    if (iM1238i3 == 63) {
                        return null;
                    }
                    c0141cm.m1238i(iM1238i3 == 0 ? Math.max(0, iM1242m - 30) : Math.max(0, (iM1238i3 + iM1242m) - 31));
                    if (zM1237h) {
                        int iM1238i4 = c0141cm.m1238i(6);
                        if (iM1238i4 == 63) {
                            return null;
                        }
                        c0141cm.m1238i(iM1238i4 == 0 ? Math.max(0, iM1242m2 - 30) : Math.max(0, (iM1238i4 + iM1242m2) - 31));
                    }
                    if (c0141cm.m1237h()) {
                        c0141cm.m1249t(10);
                    }
                }
                return new p71(iM1242m4, 0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static void m4665k(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                l41.m4051t(jd0.m3609g(i2, "at index "));
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0286  */
    /* JADX WARN: Code duplicated, block: B:154:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x029b  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ec A[LOOP:12: B:169:0x02ea->B:170:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0300  */
    /* JADX WARN: Code duplicated, block: B:175:0x0306  */
    /* JADX WARN: Code duplicated, block: B:177:0x0310  */
    /* JADX WARN: Code duplicated, block: B:179:0x031c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0322  */
    /* JADX WARN: Code duplicated, block: B:183:0x0326  */
    /* JADX WARN: Code duplicated, block: B:184:0x032b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0338  */
    /* JADX WARN: Code duplicated, block: B:190:0x0341  */
    /* JADX WARN: Code duplicated, block: B:192:0x034b  */
    /* JADX WARN: Code duplicated, block: B:193:0x034e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0355  */
    /* JADX WARN: Code duplicated, block: B:197:0x036b  */
    /* JADX WARN: Code duplicated, block: B:198:0x036e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0370  */
    /* JADX WARN: Code duplicated, block: B:204:0x0393  */
    /* JADX WARN: Code duplicated, block: B:207:0x039c  */
    /* JADX WARN: Code duplicated, block: B:210:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b A[LOOP:0: B:63:0x0119->B:64:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160  */
    /* JADX WARN: Code duplicated, block: B:80:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x0166  */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:87:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0183 A[LOOP:3: B:89:0x0181->B:90:0x0183, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x018b  */
    /* JADX WARN: Code duplicated, block: B:93:0x018d  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: k0 */
    public static q71 m4666k0(byte[] bArr, int i, int i2, C0599ed c0599ed) {
        int i3;
        int i4;
        int i5;
        int iM1242m;
        int iM1242m2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM1242m3;
        int i10;
        int iM1242m4;
        int[] iArr;
        int[] iArrCopyOf;
        int i11;
        int i12;
        int i13;
        boolean z;
        float f;
        float f2;
        int i14;
        int i15;
        Object r20;
        int i16;
        int iM7329f;
        int iM7330g;
        Object r5;
        n71 n71Var;
        Object r6;
        int iM1238i;
        int iM1238i2;
        int iM1238i3;
        int iM1242m5;
        int i17;
        boolean z2;
        int iM1242m6;
        int iM1242m7;
        int[] iArr2;
        int i18;
        int[] iArr3;
        int i19;
        int i20;
        int i21;
        boolean zM1237h;
        int i22;
        int i23;
        int iMin;
        int i24;
        int i25;
        int i26;
        int i27;
        int iMax;
        n71 n71Var2;
        g21 g21VarM4660h0 = m4660h0(new C0141cm(bArr, i, i2));
        C0141cm c0141cm = new C0141cm(bArr, i + 2, i2);
        c0141cm.m1249t(4);
        int iM1238i4 = c0141cm.m1238i(3);
        int i28 = g21VarM4660h0.f4021b;
        boolean z3 = true;
        boolean z4 = i28 != 0 && iM1238i4 == 7;
        if (c0599ed != null) {
            qm0 qm0Var = (qm0) c0599ed.f3313a;
            if (qm0Var.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((l71) qm0Var.get(Math.min(i28, qm0Var.size() - 1))).f6206a;
            }
        } else {
            i3 = 0;
        }
        m71 m71VarM4662i0 = null;
        if (!z4) {
            c0141cm.m1248s();
            m71VarM4662i0 = m4662i0(c0141cm, true, iM1238i4, null);
        } else if (c0599ed != null) {
            n71 n71Var3 = (n71) c0599ed.f3314b;
            int[] iArr4 = n71Var3.f7303b;
            qm0 qm0Var2 = n71Var3.f7302a;
            int i29 = iArr4[i3];
            if (qm0Var2.size() > i29) {
                m71VarM4662i0 = (m71) qm0Var2.get(i29);
            }
        }
        m71 m71Var = m71VarM4662i0;
        c0141cm.m1242m();
        if (z4) {
            int iM1238i5 = c0141cm.m1237h() ? c0141cm.m1238i(8) : -1;
            if (c0599ed != null && (n71Var2 = (n71) c0599ed.f3315c) != null) {
                qm0 qm0Var3 = n71Var2.f7302a;
                if (iM1238i5 == -1) {
                    iM1238i5 = n71Var2.f7303b[i3];
                }
                if (iM1238i5 != -1 && qm0Var3.size() > iM1238i5) {
                    o71 o71Var = (o71) qm0Var3.get(iM1238i5);
                    int i30 = o71Var.f7674a;
                    i5 = o71Var.f7677d;
                    i4 = o71Var.f7678e;
                    iM1242m = o71Var.f7675b;
                    iM1242m2 = o71Var.f7676c;
                }
                iM1242m3 = c0141cm.m1242m();
                if (z4) {
                    i10 = -1;
                } else {
                    if (c0141cm.m1237h()) {
                        i26 = 0;
                    } else {
                        i26 = iM1238i4;
                    }
                    iMax = -1;
                    for (i27 = i26; i27 <= iM1238i4; i27++) {
                        c0141cm.m1242m();
                        iMax = Math.max(c0141cm.m1242m(), iMax);
                        c0141cm.m1242m();
                    }
                    i10 = iMax;
                }
                c0141cm.m1242m();
                c0141cm.m1242m();
                c0141cm.m1242m();
                c0141cm.m1242m();
                c0141cm.m1242m();
                c0141cm.m1242m();
                if (c0141cm.m1237h()) {
                    if (z4) {
                        zM1237h = c0141cm.m1237h();
                    } else {
                        zM1237h = false;
                    }
                    if (zM1237h) {
                        c0141cm.m1249t(6);
                    } else if (c0141cm.m1237h()) {
                        for (i22 = 0; i22 < 4; i22++) {
                            i23 = 0;
                            while (i23 < 6) {
                                if (c0141cm.m1237h()) {
                                    iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                                    if (i22 > 1) {
                                        c0141cm.m1243n();
                                    }
                                    for (i24 = 0; i24 < iMin; i24++) {
                                        c0141cm.m1243n();
                                    }
                                } else {
                                    c0141cm.m1242m();
                                }
                                if (i22 == 3) {
                                    i25 = 3;
                                } else {
                                    i25 = 1;
                                }
                                i23 += i25;
                            }
                        }
                    }
                }
                c0141cm.m1249t(2);
                if (c0141cm.m1237h()) {
                    c0141cm.m1249t(8);
                    c0141cm.m1242m();
                    c0141cm.m1242m();
                    c0141cm.m1248s();
                }
                iM1242m4 = c0141cm.m1242m();
                iArr = new int[0];
                iArrCopyOf = new int[0];
                i11 = 0;
                i12 = -1;
                i13 = -1;
                while (i11 < iM1242m4) {
                    if (i11 == 0 && c0141cm.m1237h()) {
                        z2 = z3;
                        int i31 = i13 + i12;
                        int iM1242m8 = (1 - ((c0141cm.m1237h() ? 1 : 0) * 2)) * (c0141cm.m1242m() + 1);
                        int i32 = i31 + 1;
                        boolean[] zArr = new boolean[i32];
                        for (int i33 = 0; i33 <= i31; i33++) {
                            if (c0141cm.m1237h()) {
                                zArr[i33] = z2;
                            } else {
                                zArr[i33] = c0141cm.m1237h();
                            }
                        }
                        int[] iArr5 = new int[i32];
                        int[] iArr6 = new int[i32];
                        int i34 = 0;
                        for (int i35 = i12 - 1; i35 >= 0; i35--) {
                            int i36 = iArrCopyOf[i35] + iM1242m8;
                            if (i36 < 0 && zArr[i13 + i35]) {
                                iArr5[i34] = i36;
                                i34++;
                            }
                        }
                        if (iM1242m8 < 0 && zArr[i31]) {
                            iArr5[i34] = iM1242m8;
                            i34++;
                        }
                        int i37 = i34;
                        int[] iArr7 = iArr;
                        for (int i38 = 0; i38 < i13; i38++) {
                            int i39 = iArr7[i38] + iM1242m8;
                            if (i39 < 0 && zArr[i38]) {
                                iArr5[i37] = i39;
                                i37++;
                            }
                        }
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i37);
                        int i40 = 0;
                        for (int i41 = i13 - 1; i41 >= 0; i41--) {
                            int i42 = iArr7[i41] + iM1242m8;
                            if (i42 > 0 && zArr[i41]) {
                                iArr6[i40] = i42;
                                i40++;
                            }
                        }
                        if (iM1242m8 > 0 && zArr[i31]) {
                            iArr6[i40] = iM1242m8;
                            i40++;
                        }
                        int i43 = i40;
                        for (int i44 = 0; i44 < i12; i44++) {
                            int i45 = iArrCopyOf[i44] + iM1242m8;
                            if (i45 > 0 && zArr[i13 + i44]) {
                                iArr6[i43] = i45;
                                i43++;
                            }
                        }
                        iArrCopyOf = Arrays.copyOf(iArr6, i43);
                        i13 = i37;
                        i12 = i43;
                        iArr = iArrCopyOf2;
                    } else {
                        z2 = z3;
                        iM1242m6 = c0141cm.m1242m();
                        iM1242m7 = c0141cm.m1242m();
                        iArr2 = new int[iM1242m6];
                        for (i18 = 0; i18 < iM1242m6; i18++) {
                            if (i18 > 0) {
                                i21 = iArr2[i18 - 1];
                            } else {
                                i21 = 0;
                            }
                            iArr2[i18] = i21 - (c0141cm.m1242m() + 1);
                            c0141cm.m1248s();
                        }
                        iArr3 = new int[iM1242m7];
                        for (i19 = 0; i19 < iM1242m7; i19++) {
                            if (i19 > 0) {
                                i20 = iArr3[i19 - 1];
                            } else {
                                i20 = 0;
                            }
                            iArr3[i19] = c0141cm.m1242m() + 1 + i20;
                            c0141cm.m1248s();
                        }
                        i13 = iM1242m6;
                        iArr = iArr2;
                        iArrCopyOf = iArr3;
                        i12 = iM1242m7;
                    }
                    i11++;
                    z3 = z2;
                    iM1242m4 = iM1242m4;
                    i3 = i3;
                }
                int i46 = i3;
                z = z3;
                if (c0141cm.m1237h()) {
                    iM1242m5 = c0141cm.m1242m();
                    for (i17 = 0; i17 < iM1242m5; i17++) {
                        c0141cm.m1249t(iM1242m3 + 5);
                    }
                }
                c0141cm.m1249t(2);
                f = 1.0f;
                if (c0141cm.m1237h()) {
                    if (c0141cm.m1237h()) {
                        iM1238i = c0141cm.m1238i(8);
                        if (iM1238i == 255) {
                            iM1238i2 = c0141cm.m1238i(16);
                            iM1238i3 = c0141cm.m1238i(16);
                            if (iM1238i2 != 0 && iM1238i3 != 0) {
                                f = iM1238i2 / iM1238i3;
                            }
                        } else if (iM1238i < 17) {
                            f = f7629d[iM1238i];
                        } else {
                            jd0.m3621s(iM1238i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (c0141cm.m1237h()) {
                        c0141cm.m1248s();
                    }
                    if (c0141cm.m1237h()) {
                        c0141cm.m1249t(3);
                        if (c0141cm.m1237h()) {
                            r6 = z;
                        } else {
                            r6 = 2;
                        }
                        if (c0141cm.m1237h()) {
                            int iM1238i6 = c0141cm.m1238i(8);
                            int iM1238i7 = c0141cm.m1238i(8);
                            c0141cm.m1249t(8);
                            iM7329f = C1673zp.m7329f(iM1238i6);
                            iM7330g = C1673zp.m7330g(iM1238i7);
                            r5 = r6;
                        } else {
                            iM7329f = -1;
                            iM7330g = -1;
                            r5 = r6;
                        }
                    } else if (c0599ed != null || (n71Var = (n71) c0599ed.f3316d) == null) {
                        iM7329f = -1;
                        iM7330g = -1;
                        r5 = -1;
                    } else {
                        qm0 qm0Var4 = n71Var.f7302a;
                        int i47 = n71Var.f7303b[i46];
                        if (qm0Var4.size() > i47) {
                            r71 r71Var = (r71) qm0Var4.get(i47);
                            int i48 = r71Var.f9803a;
                            int i49 = r71Var.f9804b;
                            iM7330g = r71Var.f9805c;
                            iM7329f = i48;
                            r5 = i49;
                        } else {
                            iM7329f = -1;
                            iM7330g = -1;
                            r5 = -1;
                        }
                    }
                    if (c0141cm.m1237h()) {
                        c0141cm.m1242m();
                        c0141cm.m1242m();
                    }
                    c0141cm.m1248s();
                    if (c0141cm.m1237h()) {
                        i9 *= 2;
                    }
                    i15 = iM7329f;
                    i16 = iM7330g;
                    f2 = f;
                    r20 = r5;
                    i14 = i9;
                } else {
                    f2 = 1.0f;
                    i14 = i9;
                    i15 = -1;
                    r20 = -1;
                    i16 = -1;
                }
                return new q71(m71Var, i8, i7, i6, i14, f2, i10, i15, r20, i16);
            }
            i9 = 0;
            i8 = 0;
            i7 = 0;
            i6 = 0;
            iM1242m3 = c0141cm.m1242m();
            if (z4) {
                if (c0141cm.m1237h()) {
                    i26 = 0;
                } else {
                    i26 = iM1238i4;
                }
                iMax = -1;
                while (i27 <= iM1238i4) {
                    c0141cm.m1242m();
                    iMax = Math.max(c0141cm.m1242m(), iMax);
                    c0141cm.m1242m();
                }
                i10 = iMax;
            } else {
                i10 = -1;
            }
            c0141cm.m1242m();
            c0141cm.m1242m();
            c0141cm.m1242m();
            c0141cm.m1242m();
            c0141cm.m1242m();
            c0141cm.m1242m();
            if (c0141cm.m1237h()) {
                if (z4) {
                    zM1237h = c0141cm.m1237h();
                } else {
                    zM1237h = false;
                }
                if (zM1237h) {
                    c0141cm.m1249t(6);
                } else if (c0141cm.m1237h()) {
                    while (i22 < 4) {
                        i23 = 0;
                        while (i23 < 6) {
                            if (c0141cm.m1237h()) {
                                c0141cm.m1242m();
                            } else {
                                iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                                if (i22 > 1) {
                                    c0141cm.m1243n();
                                }
                                while (i24 < iMin) {
                                    c0141cm.m1243n();
                                }
                            }
                            if (i22 == 3) {
                                i25 = 3;
                            } else {
                                i25 = 1;
                            }
                            i23 += i25;
                        }
                    }
                }
            }
            c0141cm.m1249t(2);
            if (c0141cm.m1237h()) {
                c0141cm.m1249t(8);
                c0141cm.m1242m();
                c0141cm.m1242m();
                c0141cm.m1248s();
            }
            iM1242m4 = c0141cm.m1242m();
            iArr = new int[0];
            iArrCopyOf = new int[0];
            i11 = 0;
            i12 = -1;
            i13 = -1;
            while (i11 < iM1242m4) {
                if (i11 == 0) {
                    z2 = z3;
                    iM1242m6 = c0141cm.m1242m();
                    iM1242m7 = c0141cm.m1242m();
                    iArr2 = new int[iM1242m6];
                    while (i18 < iM1242m6) {
                        if (i18 > 0) {
                            i21 = iArr2[i18 - 1];
                        } else {
                            i21 = 0;
                        }
                        iArr2[i18] = i21 - (c0141cm.m1242m() + 1);
                        c0141cm.m1248s();
                    }
                    iArr3 = new int[iM1242m7];
                    while (i19 < iM1242m7) {
                        if (i19 > 0) {
                            i20 = iArr3[i19 - 1];
                        } else {
                            i20 = 0;
                        }
                        iArr3[i19] = c0141cm.m1242m() + 1 + i20;
                        c0141cm.m1248s();
                    }
                    i13 = iM1242m6;
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i12 = iM1242m7;
                } else {
                    z2 = z3;
                    iM1242m6 = c0141cm.m1242m();
                    iM1242m7 = c0141cm.m1242m();
                    iArr2 = new int[iM1242m6];
                    while (i18 < iM1242m6) {
                        if (i18 > 0) {
                            i21 = iArr2[i18 - 1];
                        } else {
                            i21 = 0;
                        }
                        iArr2[i18] = i21 - (c0141cm.m1242m() + 1);
                        c0141cm.m1248s();
                    }
                    iArr3 = new int[iM1242m7];
                    while (i19 < iM1242m7) {
                        if (i19 > 0) {
                            i20 = iArr3[i19 - 1];
                        } else {
                            i20 = 0;
                        }
                        iArr3[i19] = c0141cm.m1242m() + 1 + i20;
                        c0141cm.m1248s();
                    }
                    i13 = iM1242m6;
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                    i12 = iM1242m7;
                }
                i11++;
                z3 = z2;
                iM1242m4 = iM1242m4;
                i3 = i3;
            }
            int i410 = i3;
            z = z3;
            if (c0141cm.m1237h()) {
                iM1242m5 = c0141cm.m1242m();
                while (i17 < iM1242m5) {
                    c0141cm.m1249t(iM1242m3 + 5);
                }
            }
            c0141cm.m1249t(2);
            f = 1.0f;
            if (c0141cm.m1237h()) {
                if (c0141cm.m1237h()) {
                    iM1238i = c0141cm.m1238i(8);
                    if (iM1238i == 255) {
                        iM1238i2 = c0141cm.m1238i(16);
                        iM1238i3 = c0141cm.m1238i(16);
                        if (iM1238i2 != 0) {
                            f = iM1238i2 / iM1238i3;
                        }
                    } else if (iM1238i < 17) {
                        f = f7629d[iM1238i];
                    } else {
                        jd0.m3621s(iM1238i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (c0141cm.m1237h()) {
                    c0141cm.m1248s();
                }
                if (c0141cm.m1237h()) {
                    c0141cm.m1249t(3);
                    if (c0141cm.m1237h()) {
                        r6 = z;
                    } else {
                        r6 = 2;
                    }
                    if (c0141cm.m1237h()) {
                        int iM1238i8 = c0141cm.m1238i(8);
                        int iM1238i9 = c0141cm.m1238i(8);
                        c0141cm.m1249t(8);
                        iM7329f = C1673zp.m7329f(iM1238i8);
                        iM7330g = C1673zp.m7330g(iM1238i9);
                        r5 = r6;
                    } else {
                        iM7329f = -1;
                        iM7330g = -1;
                        r5 = r6;
                    }
                } else if (c0599ed != null) {
                    iM7329f = -1;
                    iM7330g = -1;
                    r5 = -1;
                } else {
                    iM7329f = -1;
                    iM7330g = -1;
                    r5 = -1;
                }
                if (c0141cm.m1237h()) {
                    c0141cm.m1242m();
                    c0141cm.m1242m();
                }
                c0141cm.m1248s();
                if (c0141cm.m1237h()) {
                    i9 *= 2;
                }
                i15 = iM7329f;
                i16 = iM7330g;
                f2 = f;
                r20 = r5;
                i14 = i9;
            } else {
                f2 = 1.0f;
                i14 = i9;
                i15 = -1;
                r20 = -1;
                i16 = -1;
            }
            return new q71(m71Var, i8, i7, i6, i14, f2, i10, i15, r20, i16);
        }
        int iM1242m9 = c0141cm.m1242m();
        if (iM1242m9 == 3) {
            c0141cm.m1248s();
        }
        int iM1242m10 = c0141cm.m1242m();
        int iM1242m11 = c0141cm.m1242m();
        if (c0141cm.m1237h()) {
            int iM1242m12 = c0141cm.m1242m();
            int iM1242m13 = c0141cm.m1242m();
            int iM1242m14 = c0141cm.m1242m();
            int iM1242m15 = c0141cm.m1242m();
            iM1242m10 -= (iM1242m12 + iM1242m13) * ((iM1242m9 == 1 || iM1242m9 == 2) ? 2 : 1);
            iM1242m11 -= (iM1242m14 + iM1242m15) * (iM1242m9 == 1 ? 2 : 1);
        }
        i4 = iM1242m11;
        i5 = iM1242m10;
        iM1242m = c0141cm.m1242m();
        iM1242m2 = c0141cm.m1242m();
        int i50 = iM1242m2;
        i8 = iM1242m;
        i9 = i4;
        i6 = i5;
        i7 = i50;
        iM1242m3 = c0141cm.m1242m();
        if (z4) {
            if (c0141cm.m1237h()) {
                i26 = 0;
            } else {
                i26 = iM1238i4;
            }
            iMax = -1;
            while (i27 <= iM1238i4) {
                c0141cm.m1242m();
                iMax = Math.max(c0141cm.m1242m(), iMax);
                c0141cm.m1242m();
            }
            i10 = iMax;
        } else {
            i10 = -1;
        }
        c0141cm.m1242m();
        c0141cm.m1242m();
        c0141cm.m1242m();
        c0141cm.m1242m();
        c0141cm.m1242m();
        c0141cm.m1242m();
        if (c0141cm.m1237h()) {
            if (z4) {
                zM1237h = c0141cm.m1237h();
            } else {
                zM1237h = false;
            }
            if (zM1237h) {
                c0141cm.m1249t(6);
            } else if (c0141cm.m1237h()) {
                while (i22 < 4) {
                    i23 = 0;
                    while (i23 < 6) {
                        if (c0141cm.m1237h()) {
                            c0141cm.m1242m();
                        } else {
                            iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                            if (i22 > 1) {
                                c0141cm.m1243n();
                            }
                            while (i24 < iMin) {
                                c0141cm.m1243n();
                            }
                        }
                        if (i22 == 3) {
                            i25 = 3;
                        } else {
                            i25 = 1;
                        }
                        i23 += i25;
                    }
                }
            }
        }
        c0141cm.m1249t(2);
        if (c0141cm.m1237h()) {
            c0141cm.m1249t(8);
            c0141cm.m1242m();
            c0141cm.m1242m();
            c0141cm.m1248s();
        }
        iM1242m4 = c0141cm.m1242m();
        iArr = new int[0];
        iArrCopyOf = new int[0];
        i11 = 0;
        i12 = -1;
        i13 = -1;
        while (i11 < iM1242m4) {
            if (i11 == 0) {
                z2 = z3;
                iM1242m6 = c0141cm.m1242m();
                iM1242m7 = c0141cm.m1242m();
                iArr2 = new int[iM1242m6];
                while (i18 < iM1242m6) {
                    if (i18 > 0) {
                        i21 = iArr2[i18 - 1];
                    } else {
                        i21 = 0;
                    }
                    iArr2[i18] = i21 - (c0141cm.m1242m() + 1);
                    c0141cm.m1248s();
                }
                iArr3 = new int[iM1242m7];
                while (i19 < iM1242m7) {
                    if (i19 > 0) {
                        i20 = iArr3[i19 - 1];
                    } else {
                        i20 = 0;
                    }
                    iArr3[i19] = c0141cm.m1242m() + 1 + i20;
                    c0141cm.m1248s();
                }
                i13 = iM1242m6;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i12 = iM1242m7;
            } else {
                z2 = z3;
                iM1242m6 = c0141cm.m1242m();
                iM1242m7 = c0141cm.m1242m();
                iArr2 = new int[iM1242m6];
                while (i18 < iM1242m6) {
                    if (i18 > 0) {
                        i21 = iArr2[i18 - 1];
                    } else {
                        i21 = 0;
                    }
                    iArr2[i18] = i21 - (c0141cm.m1242m() + 1);
                    c0141cm.m1248s();
                }
                iArr3 = new int[iM1242m7];
                while (i19 < iM1242m7) {
                    if (i19 > 0) {
                        i20 = iArr3[i19 - 1];
                    } else {
                        i20 = 0;
                    }
                    iArr3[i19] = c0141cm.m1242m() + 1 + i20;
                    c0141cm.m1248s();
                }
                i13 = iM1242m6;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i12 = iM1242m7;
            }
            i11++;
            z3 = z2;
            iM1242m4 = iM1242m4;
            i3 = i3;
        }
        int i411 = i3;
        z = z3;
        if (c0141cm.m1237h()) {
            iM1242m5 = c0141cm.m1242m();
            while (i17 < iM1242m5) {
                c0141cm.m1249t(iM1242m3 + 5);
            }
        }
        c0141cm.m1249t(2);
        f = 1.0f;
        if (c0141cm.m1237h()) {
            if (c0141cm.m1237h()) {
                iM1238i = c0141cm.m1238i(8);
                if (iM1238i == 255) {
                    iM1238i2 = c0141cm.m1238i(16);
                    iM1238i3 = c0141cm.m1238i(16);
                    if (iM1238i2 != 0) {
                        f = iM1238i2 / iM1238i3;
                    }
                } else if (iM1238i < 17) {
                    f = f7629d[iM1238i];
                } else {
                    jd0.m3621s(iM1238i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1248s();
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1249t(3);
                if (c0141cm.m1237h()) {
                    r6 = z;
                } else {
                    r6 = 2;
                }
                if (c0141cm.m1237h()) {
                    int iM1238i10 = c0141cm.m1238i(8);
                    int iM1238i11 = c0141cm.m1238i(8);
                    c0141cm.m1249t(8);
                    iM7329f = C1673zp.m7329f(iM1238i10);
                    iM7330g = C1673zp.m7330g(iM1238i11);
                    r5 = r6;
                } else {
                    iM7329f = -1;
                    iM7330g = -1;
                    r5 = r6;
                }
            } else if (c0599ed != null) {
                iM7329f = -1;
                iM7330g = -1;
                r5 = -1;
            } else {
                iM7329f = -1;
                iM7330g = -1;
                r5 = -1;
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1242m();
                c0141cm.m1242m();
            }
            c0141cm.m1248s();
            if (c0141cm.m1237h()) {
                i9 *= 2;
            }
            i15 = iM7329f;
            i16 = iM7330g;
            f2 = f;
            r20 = r5;
            i14 = i9;
        } else {
            f2 = 1.0f;
            i14 = i9;
            i15 = -1;
            r20 = -1;
            i16 = -1;
        }
        return new q71(m71Var, i8, i7, i6, i14, f2, i10, i15, r20, i16);
    }

    /* JADX INFO: renamed from: l */
    public static void m4667l(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:481:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public static C0599ed m4668l0(int i, int i2, byte[] bArr) {
        int[] iArr;
        n71 n71Var;
        int iM1238i;
        int iM1238i2;
        int iM1238i3;
        kk1 kk1Var;
        boolean[][] zArr;
        int i3;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i4;
        boolean zM1237h;
        int i5;
        int i6;
        int i7;
        boolean zM1237h2;
        boolean zM1237h3;
        int iM1242m;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        C0141cm c0141cm = new C0141cm(bArr, i, i2);
        m4660h0(c0141cm);
        c0141cm.m1249t(4);
        boolean zM1237h4 = c0141cm.m1237h();
        boolean zM1237h5 = c0141cm.m1237h();
        int iM1238i4 = c0141cm.m1238i(6);
        int i11 = iM1238i4 + 1;
        int iM1238i5 = c0141cm.m1238i(3);
        c0141cm.m1249t(17);
        m71 m71VarM4662i0 = m4662i0(c0141cm, true, iM1238i5, null);
        for (int i12 = c0141cm.m1237h() ? 0 : iM1238i5; i12 <= iM1238i5; i12++) {
            c0141cm.m1242m();
            c0141cm.m1242m();
            c0141cm.m1242m();
        }
        int iM1238i6 = c0141cm.m1238i(6);
        int iM1242m2 = c0141cm.m1242m() + 1;
        int i13 = 6;
        n71 n71Var2 = new n71(qm0.m5570t(m71VarM4662i0), new int[1], 0);
        boolean z3 = i11 >= 2 && iM1242m2 >= 2;
        boolean z4 = zM1237h4 && zM1237h5;
        int i14 = iM1238i6 + 1;
        boolean z5 = i14 >= i11;
        if (!z3 || !z4 || !z5) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM1242m2, i14);
        int i15 = 1;
        int[] iArr5 = new int[iM1242m2];
        int[] iArr6 = new int[iM1242m2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i16 = 1; i16 < iM1242m2; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 <= iM1238i6; i18++) {
                if (c0141cm.m1237h()) {
                    iArr4[i16][i17] = i18;
                    iArr6[i16] = i18;
                    i17++;
                }
                iArr5[i16] = i17;
            }
        }
        if (c0141cm.m1237h()) {
            c0141cm.m1249t(64);
            if (c0141cm.m1237h()) {
                c0141cm.m1242m();
            }
            int iM1242m3 = c0141cm.m1242m();
            int i19 = 0;
            while (i19 < iM1242m3) {
                c0141cm.m1242m();
                if (i19 == 0 || c0141cm.m1237h()) {
                    boolean zM1237h6 = c0141cm.m1237h();
                    boolean zM1237h7 = c0141cm.m1237h();
                    z2 = zM1237h6;
                    z = zM1237h7;
                    if (zM1237h6 || zM1237h7) {
                        zM1237h = c0141cm.m1237h();
                        if (zM1237h) {
                            c0141cm.m1249t(19);
                        }
                        c0141cm.m1249t(8);
                        if (zM1237h) {
                            c0141cm.m1249t(4);
                        }
                        c0141cm.m1249t(15);
                        i6 = zM1237h6;
                        i5 = zM1237h7;
                    }
                    i7 = 0;
                    while (i7 <= iM1238i5) {
                        zM1237h2 = c0141cm.m1237h();
                        if (!zM1237h2) {
                            zM1237h2 = c0141cm.m1237h();
                        }
                        if (zM1237h2) {
                            c0141cm.m1242m();
                            zM1237h3 = false;
                        } else {
                            zM1237h3 = c0141cm.m1237h();
                        }
                        if (zM1237h3) {
                            iM1242m = 0;
                        } else {
                            iM1242m = c0141cm.m1242m();
                        }
                        int[][] iArr7 = iArr4;
                        i8 = i6 + i5;
                        int[] iArr8 = iArr6;
                        i9 = 0;
                        while (i9 < i8) {
                            int i20 = i8;
                            for (i10 = 0; i10 <= iM1242m; i10++) {
                                c0141cm.m1242m();
                                c0141cm.m1242m();
                                if (zM1237h) {
                                    c0141cm.m1242m();
                                    c0141cm.m1242m();
                                }
                                c0141cm.m1248s();
                            }
                            i9++;
                            i8 = i20;
                        }
                        i7++;
                        i19 = i19;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i19++;
                } else {
                    z2 = false;
                    z = false;
                }
                zM1237h = false;
                i6 = z2;
                i5 = z;
                i7 = 0;
                while (i7 <= iM1238i5) {
                    zM1237h2 = c0141cm.m1237h();
                    if (!zM1237h2) {
                        zM1237h2 = c0141cm.m1237h();
                    }
                    if (zM1237h2) {
                        c0141cm.m1242m();
                        zM1237h3 = false;
                    } else {
                        zM1237h3 = c0141cm.m1237h();
                    }
                    if (zM1237h3) {
                        iM1242m = c0141cm.m1242m();
                    } else {
                        iM1242m = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i8 = i6 + i5;
                    int[] iArr10 = iArr6;
                    i9 = 0;
                    while (i9 < i8) {
                        int i21 = i8;
                        while (i10 <= iM1242m) {
                            c0141cm.m1242m();
                            c0141cm.m1242m();
                            if (zM1237h) {
                                c0141cm.m1242m();
                                c0141cm.m1242m();
                            }
                            c0141cm.m1248s();
                        }
                        i9++;
                        i8 = i21;
                    }
                    i7++;
                    i19 = i19;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i19++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!c0141cm.m1237h()) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        int i22 = c0141cm.f1861e;
        if (i22 > 0) {
            c0141cm.m1249t(8 - i22);
        }
        m71 m71VarM4662i1 = m4662i0(c0141cm, false, iM1238i5, m71VarM4662i0);
        boolean zM1237h8 = c0141cm.m1237h();
        boolean[] zArr3 = new boolean[16];
        int i23 = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            boolean zM1237h9 = c0141cm.m1237h();
            zArr3[i24] = zM1237h9;
            if (zM1237h9) {
                i23++;
            }
        }
        if (i23 == 0 || !zArr3[1]) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        int[] iArr13 = new int[i23];
        for (int i25 = 0; i25 < i23 - (zM1237h8 ? 1 : 0); i25++) {
            iArr13[i25] = c0141cm.m1238i(3);
        }
        int[] iArr14 = new int[i23 + 1];
        if (zM1237h8) {
            int i26 = 1;
            while (i26 < i23) {
                int[] iArr15 = iArr14;
                for (int i27 = 0; i27 < i26; i27++) {
                    iArr15[i26] = iArr13[i27] + 1 + iArr15[i26];
                }
                i26++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i23] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i11, i23);
        int[] iArr17 = new int[i11];
        iArr17[0] = 0;
        boolean zM1237h10 = c0141cm.m1237h();
        int i28 = 1;
        while (i28 < i11) {
            if (zM1237h10) {
                i4 = i28;
                iArr17[i4] = c0141cm.m1238i(i13);
            } else {
                i4 = i28;
                iArr17[i4] = i4;
            }
            if (zM1237h8) {
                int i29 = 0;
                while (i29 < i23) {
                    int i30 = i29 + 1;
                    iArr16[i4][i29] = (iArr17[i4] & ((1 << iArr[i30]) - 1)) >> iArr[i29];
                    i29 = i30;
                }
            } else {
                int i31 = 0;
                while (i31 < i23) {
                    int i32 = i31;
                    iArr16[i4][i32] = c0141cm.m1238i(iArr13[i31] + 1);
                    i31 = i32 + 1;
                }
            }
            i28 = i4 + 1;
            i13 = 6;
        }
        int[] iArr18 = new int[i14];
        int i33 = 1;
        int i34 = 0;
        while (i34 < i11) {
            iArr18[iArr17[i34]] = -1;
            int[] iArr19 = iArr18;
            int i35 = 0;
            int i36 = 0;
            while (i35 < 16) {
                if (zArr3[i35]) {
                    if (i35 == i15) {
                        iArr19[iArr17[i34]] = iArr16[i34][i36];
                    }
                    i36++;
                }
                i35++;
                i15 = 1;
            }
            if (i34 > 0) {
                int i37 = 0;
                while (true) {
                    if (i37 >= i34) {
                        i33++;
                        break;
                    }
                    int i38 = i37;
                    if (iArr19[iArr17[i34]] == iArr19[iArr17[i37]]) {
                        break;
                    }
                    i37 = i38 + 1;
                }
            }
            i34++;
            iArr18 = iArr19;
            i15 = 1;
        }
        int[] iArr20 = iArr18;
        int iM1238i7 = c0141cm.m1238i(4);
        if (i33 < 2 || iM1238i7 == 0) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        int[] iArr21 = new int[i33];
        for (int i39 = 0; i39 < i33; i39++) {
            iArr21[i39] = c0141cm.m1238i(iM1238i7);
        }
        int[] iArr22 = new int[i14];
        for (int i40 = 0; i40 < i11; i40++) {
            iArr22[Math.min(iArr17[i40], iM1238i6)] = i40;
        }
        nm0 nm0VarM5566m = qm0.m5566m();
        int i41 = 0;
        while (i41 <= iM1238i6) {
            int[] iArr23 = iArr22;
            int i42 = i33;
            int iMin = Math.min(iArr20[i41], i42 - 1);
            nm0VarM5566m.m3901a(new l71(iArr23[i41], iMin >= 0 ? iArr21[iMin] : -1));
            i41++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i33 = i42;
        }
        int[] iArr24 = iArr17;
        kk1 kk1VarM4561g = nm0VarM5566m.m4561g();
        if (((l71) kk1VarM4561g.get(0)).f6207b == -1) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        int i43 = 1;
        while (true) {
            if (i43 > iM1238i6) {
                i43 = -1;
                break;
            }
            if (((l71) kk1VarM4561g.get(i43)).f6207b != -1) {
                break;
            }
            i43++;
        }
        if (i43 == -1) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i11, i11);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i11, i11);
        for (int i44 = 1; i44 < i11; i44++) {
            for (int i45 = 0; i45 < i44; i45++) {
                boolean[] zArr6 = zArr4[i44];
                boolean[] zArr7 = zArr5[i44];
                boolean zM1237h11 = c0141cm.m1237h();
                zArr7[i45] = zM1237h11;
                zArr6[i45] = zM1237h11;
            }
        }
        for (int i46 = 1; i46 < i11; i46++) {
            int i47 = 0;
            while (i47 < iM1238i4) {
                boolean[][] zArr8 = zArr4;
                for (int i48 = 0; i48 < i46; i48++) {
                    boolean[] zArr9 = zArr5[i46];
                    if (zArr9[i48] && zArr5[i48][i47]) {
                        zArr9[i47] = true;
                        break;
                    }
                }
                i47++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i14];
        for (int i49 = 0; i49 < i11; i49++) {
            int i50 = 0;
            for (int i51 = 0; i51 < i49; i51++) {
                i50 += zArr10[i49][i51] ? 1 : 0;
            }
            iArr25[iArr24[i49]] = i50;
        }
        int i52 = 0;
        for (int i53 = 0; i53 < i11; i53++) {
            if (iArr25[iArr24[i53]] == 0) {
                i52++;
            }
        }
        if (i52 > 1) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        int[] iArr26 = new int[i11];
        int[] iArr27 = new int[iM1242m2];
        if (c0141cm.m1237h()) {
            int i54 = 0;
            while (i54 < i11) {
                int i55 = i54;
                iArr26[i55] = c0141cm.m1238i(3);
                i54 = i55 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i11, iM1238i5);
        }
        int i56 = 0;
        while (i56 < iM1242m2) {
            int i57 = i56;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i58 = 0; i58 < iArr5[i57]; i58++) {
                iMax = Math.max(iMax, iArr28[((l71) kk1VarM4561g.get(iArr11[i57][i58])).f6206a]);
            }
            iArr27[i57] = iMax + 1;
            i56 = i57 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (c0141cm.m1237h()) {
            int i59 = 0;
            while (i59 < iM1238i4) {
                int i60 = i59 + 1;
                int i61 = i60;
                while (i61 < i11) {
                    if (zArr10[i61][i59]) {
                        c0141cm.m1249t(3);
                    }
                    i61++;
                    iM1238i4 = iM1238i4;
                }
                i59 = i60;
            }
        }
        c0141cm.m1248s();
        int iM1242m4 = c0141cm.m1242m() + 1;
        nm0 nm0VarM5566m2 = qm0.m5566m();
        nm0VarM5566m2.m3901a(m71VarM4662i0);
        if (iM1242m4 > 1) {
            nm0VarM5566m2.m3901a(m71VarM4662i1);
            for (int i62 = 2; i62 < iM1242m4; i62++) {
                m71VarM4662i1 = m4662i0(c0141cm, c0141cm.m1237h(), iM1238i5, m71VarM4662i1);
                nm0VarM5566m2.m3901a(m71VarM4662i1);
            }
        }
        kk1 kk1VarM4561g2 = nm0VarM5566m2.m4561g();
        int iM1242m5 = c0141cm.m1242m() + iM1242m2;
        if (iM1242m5 > iM1242m2) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        int iM1238i8 = c0141cm.m1238i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM1242m5, i14);
        int[] iArr29 = new int[iM1242m5];
        int i63 = 0;
        int[] iArr30 = new int[iM1242m5];
        int i64 = 0;
        while (i64 < iM1242m2) {
            iArr29[i64] = i63;
            iArr30[i64] = iArr12[i64];
            if (iM1238i8 == 0) {
                i3 = i64;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i3], i63, iArr5[i3], true);
                iArr2[i3] = iArr5[i3];
            } else {
                i3 = i64;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iM1238i8 == 1) {
                    int i65 = iArr12[i3];
                    for (int i66 = 0; i66 < iArr5[i3]; i66++) {
                        zArr2[i3][i66] = iArr11[i3][i66] == i65;
                    }
                    iArr2[i3] = 1;
                } else {
                    i63 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i64 = i3 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i63 = 0;
            i64 = i3 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i14];
        int i67 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i14;
        iArr34[i63] = iM1242m5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i68 = 1;
        int i69 = 0;
        while (i68 < iM1242m5) {
            if (iM1238i8 == i67) {
                for (int i70 = 0; i70 < iArr5[i68]; i70++) {
                    zArr14[i68][i70] = c0141cm.m1237h();
                    int i71 = iArr31[i68];
                    boolean z6 = zArr14[i68][i70];
                    iArr31[i68] = i71 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr30[i68] = iArr11[i68][i70];
                    }
                }
            }
            if (i69 == 0 && iArr11[i68][0] == 0 && zArr14[i68][0]) {
                for (int i72 = 1; i72 < iArr5[i68]; i72++) {
                    if (iArr11[i68][i72] == i43 && zArr14[i68][i43]) {
                        i69 = i68;
                    }
                }
            }
            int i73 = 0;
            while (i73 < iArr5[i68]) {
                if (iM1242m4 > 1) {
                    zArr15[i68][i73] = zArr14[i68][i73];
                    kk1Var = kk1VarM4561g2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM6224c = t30.m6224c(iM1242m4);
                    if (!zArr[i68][i73]) {
                        int i74 = ((l71) kk1VarM4561g.get(iArr11[i68][i73])).f6206a;
                        int i75 = 0;
                        while (i75 < i73) {
                            int i76 = i75;
                            if (zArr12[i74][((l71) kk1VarM4561g.get(iArr11[i68][i76])).f6206a]) {
                                zArr[i68][i73] = true;
                                break;
                            }
                            i75 = i76 + 1;
                        }
                    }
                    if (zArr[i68][i73]) {
                        if (i69 <= 0 || i68 != i69) {
                            c0141cm.m1249t(iM6224c);
                        } else {
                            iArr33[i73] = c0141cm.m1238i(iM6224c);
                        }
                    }
                } else {
                    kk1Var = kk1VarM4561g2;
                    zArr = zArr15;
                }
                i73++;
                kk1VarM4561g2 = kk1Var;
                zArr15 = zArr;
            }
            kk1 kk1Var2 = kk1VarM4561g2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i68] == 1 && iArr25[iArr30[i68]] > 0) {
                c0141cm.m1248s();
            }
            i68++;
            kk1VarM4561g2 = kk1Var2;
            zArr15 = zArr16;
            i67 = 2;
        }
        kk1 kk1Var3 = kk1VarM4561g2;
        boolean[][] zArr17 = zArr15;
        if (i69 == 0) {
            return new C0599ed((kk1) null, n71Var2, (n71) null, (n71) null);
        }
        int iM1242m6 = c0141cm.m1242m();
        int i77 = iM1242m6 + 1;
        sc2.m6060d(i77, "expectedSize");
        sc2.m6060d(i77, "initialCapacity");
        int[] iArr35 = new int[i11];
        Object[] objArrCopyOf = new Object[i77];
        int i78 = 0;
        int i79 = 0;
        boolean z7 = false;
        while (i78 < i77) {
            int i80 = i78;
            int iM1238i9 = c0141cm.m1238i(16);
            int iM1238i10 = c0141cm.m1238i(16);
            boolean z8 = z7;
            if (c0141cm.m1237h()) {
                iM1238i = c0141cm.m1238i(2);
                if (iM1238i == 3) {
                    c0141cm.m1248s();
                }
                iM1238i2 = c0141cm.m1238i(4);
                iM1238i3 = c0141cm.m1238i(4);
            } else {
                iM1238i = 0;
                iM1238i2 = 0;
                iM1238i3 = 0;
            }
            if (c0141cm.m1237h()) {
                int iM1242m7 = c0141cm.m1242m();
                int iM1242m8 = c0141cm.m1242m();
                int iM1242m9 = c0141cm.m1242m();
                int iM1242m10 = c0141cm.m1242m();
                iM1238i9 -= (iM1242m7 + iM1242m8) * ((iM1238i == 1 || iM1238i == 2) ? 2 : 1);
                iM1238i10 -= (iM1242m9 + iM1242m10) * (iM1238i == 1 ? 2 : 1);
            }
            o71 o71Var = new o71(iM1238i, iM1238i2, iM1238i3, iM1238i9, iM1238i10);
            int iM3900f = km0.m3900f(objArrCopyOf.length, i79 + 1);
            if (iM3900f > objArrCopyOf.length || z8) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM3900f);
                z7 = false;
            } else {
                z7 = z8;
            }
            objArrCopyOf[i79] = o71Var;
            i79++;
            i78 = i80 + 1;
        }
        if (i77 <= 1 || !c0141cm.m1237h()) {
            for (int i81 = 1; i81 < i11; i81++) {
                iArr35[i81] = Math.min(i81, iM1242m6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM6224c2 = t30.m6224c(i77);
            for (int i82 = 1; i82 < i11; i82++) {
                iArr35[i82] = c0141cm.m1238i(iM6224c2);
            }
        }
        n71 n71Var3 = new n71(qm0.m5565k(i79, objArrCopyOf), iArr35, 1);
        c0141cm.m1249t(2);
        for (int i83 = 1; i83 < i11; i83++) {
            if (iArr25[iArr24[i83]] == 0) {
                c0141cm.m1248s();
            }
        }
        for (int i84 = 1; i84 < iM1242m5; i84++) {
            boolean zM1237h12 = c0141cm.m1237h();
            int i85 = 0;
            while (i85 < iArr32[i84]) {
                if ((i85 <= 0 || !zM1237h12) ? i85 == 0 : c0141cm.m1237h()) {
                    for (int i86 = 0; i86 < iArr5[i84]; i86++) {
                        if (zArr17[i84][i86]) {
                            c0141cm.m1242m();
                        }
                    }
                    c0141cm.m1242m();
                    c0141cm.m1242m();
                }
                i85++;
            }
        }
        int iM1242m11 = c0141cm.m1242m() + 2;
        if (c0141cm.m1237h()) {
            c0141cm.m1249t(iM1242m11);
        } else {
            for (int i87 = 1; i87 < i11; i87++) {
                for (int i88 = 0; i88 < i87; i88++) {
                    if (zArr10[i87][i88]) {
                        c0141cm.m1249t(iM1242m11);
                    }
                }
            }
        }
        int iM1242m12 = c0141cm.m1242m();
        for (int i89 = 1; i89 <= iM1242m12; i89++) {
            c0141cm.m1249t(8);
        }
        if (c0141cm.m1237h()) {
            int i90 = c0141cm.f1861e;
            if (i90 > 0) {
                c0141cm.m1249t(8 - i90);
            }
            if (!c0141cm.m1237h() ? c0141cm.m1237h() : true) {
                c0141cm.m1248s();
            }
            boolean zM1237h13 = c0141cm.m1237h();
            boolean zM1237h14 = c0141cm.m1237h();
            if (zM1237h13 || zM1237h14) {
                for (int i91 = 0; i91 < iM1242m2; i91++) {
                    for (int i92 = 0; i92 < iArr32[i91]; i92++) {
                        boolean zM1237h15 = zM1237h13 ? c0141cm.m1237h() : false;
                        boolean zM1237h16 = zM1237h14 ? c0141cm.m1237h() : false;
                        if (zM1237h15) {
                            c0141cm.m1249t(32);
                        }
                        if (zM1237h16) {
                            c0141cm.m1249t(18);
                        }
                    }
                }
            }
            boolean zM1237h17 = c0141cm.m1237h();
            int iM1238i11 = zM1237h17 ? c0141cm.m1238i(4) + 1 : i11;
            sc2.m6060d(iM1238i11, "expectedSize");
            sc2.m6060d(iM1238i11, "initialCapacity");
            int[] iArr36 = new int[i11];
            Object[] objArrCopyOf2 = new Object[iM1238i11];
            int i93 = 0;
            int i94 = 0;
            boolean z9 = false;
            while (i93 < iM1238i11) {
                c0141cm.m1249t(3);
                int i95 = c0141cm.m1237h() ? 1 : 2;
                int iM7329f = C1673zp.m7329f(c0141cm.m1238i(8));
                boolean z10 = zM1237h17;
                int iM7330g = C1673zp.m7330g(c0141cm.m1238i(8));
                c0141cm.m1249t(8);
                r71 r71Var = new r71(iM7329f, i95, iM7330g);
                int iM3900f2 = km0.m3900f(objArrCopyOf2.length, i94 + 1);
                if (iM3900f2 > objArrCopyOf2.length || z9) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iM3900f2);
                    z9 = false;
                }
                objArrCopyOf2[i94] = r71Var;
                i93++;
                i94++;
                zM1237h17 = z10;
            }
            if (zM1237h17 && iM1238i11 > 1) {
                for (int i96 = 0; i96 < i11; i96++) {
                    iArr36[i96] = c0141cm.m1238i(4);
                }
            }
            n71Var = new n71(qm0.m5565k(i94, objArrCopyOf2), iArr36, 2);
        } else {
            n71Var = null;
        }
        return new C0599ed(kk1VarM4561g, new n71(kk1Var3, iArr33, 0), n71Var3, n71Var);
    }

    /* JADX INFO: renamed from: m */
    public static byte[] m4669m(byte[] bArr) {
        if (bArr == null) {
            l41.m4051t("in == null");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
  0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX INFO: renamed from: m0 */
    public static t71 m4670m0(int i, int i2, byte[] bArr) {
        int iM1242m;
        int iM1242m2;
        int i3;
        boolean z;
        int i4;
        int iM1242m3;
        boolean z2;
        boolean zM1237h;
        int i5;
        int i6;
        int i7;
        int iM1242m4;
        int iM7329f;
        float f;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int iM7330g;
        boolean zM1237h2;
        boolean zM1237h3;
        int iM1238i;
        int iM1238i2;
        int iM1238i3;
        int i13;
        int i14;
        C0141cm c0141cm = new C0141cm(bArr, i + 1, i2);
        int iM1238i4 = c0141cm.m1238i(8);
        int iM1238i5 = c0141cm.m1238i(8);
        int iM1238i6 = c0141cm.m1238i(8);
        int iM1242m5 = c0141cm.m1242m();
        if (iM1238i4 == 100 || iM1238i4 == 110 || iM1238i4 == 122 || iM1238i4 == 244 || iM1238i4 == 44 || iM1238i4 == 83 || iM1238i4 == 86 || iM1238i4 == 118 || iM1238i4 == 128 || iM1238i4 == 138) {
            iM1242m = c0141cm.m1242m();
            boolean zM1237h4 = iM1242m == 3 ? c0141cm.m1237h() : false;
            int iM1242m6 = c0141cm.m1242m();
            iM1242m2 = c0141cm.m1242m();
            c0141cm.m1248s();
            if (c0141cm.m1237h()) {
                int i15 = iM1242m != 3 ? 8 : 12;
                i3 = 16;
                int i16 = 0;
                while (i16 < i15) {
                    if (c0141cm.m1237h()) {
                        int i17 = i16 < 6 ? 16 : 64;
                        int iM1243n = 8;
                        int i18 = 8;
                        for (int i19 = 0; i19 < i17; i19++) {
                            if (iM1243n != 0) {
                                iM1243n = ((c0141cm.m1243n() + i18) + 256) % 256;
                            }
                            if (iM1243n != 0) {
                                i18 = iM1243n;
                            }
                        }
                    }
                    i16++;
                }
            } else {
                i3 = 16;
            }
            z = zM1237h4;
            i4 = iM1242m6;
        } else {
            iM1242m = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iM1242m2 = 0;
        }
        int iM1242m7 = c0141cm.m1242m() + 4;
        int iM1242m8 = c0141cm.m1242m();
        if (iM1242m8 != 0) {
            if (iM1242m8 == 1) {
                boolean zM1237h5 = c0141cm.m1237h();
                c0141cm.m1243n();
                c0141cm.m1243n();
                iM1238i4 = iM1238i4;
                long jM1242m = c0141cm.m1242m();
                iM1242m8 = iM1242m8;
                for (int i20 = 0; i20 < jM1242m; i20++) {
                    c0141cm.m1242m();
                }
                iM1242m2 = iM1242m2;
                z2 = zM1237h5;
                iM1242m3 = 0;
            } else {
                iM1242m3 = 0;
            }
            c0141cm.m1242m();
            c0141cm.m1248s();
            int iM1242m9 = c0141cm.m1242m() + 1;
            int iM1242m10 = c0141cm.m1242m() + 1;
            zM1237h = c0141cm.m1237h();
            i5 = 2 - (zM1237h ? 1 : 0);
            int i21 = iM1242m10 * i5;
            if (!zM1237h) {
                c0141cm.m1248s();
            }
            c0141cm.m1248s();
            i6 = iM1242m9 * 16;
            i7 = i21 * 16;
            if (c0141cm.m1237h()) {
                int iM1242m11 = c0141cm.m1242m();
                int iM1242m12 = c0141cm.m1242m();
                int iM1242m13 = c0141cm.m1242m();
                int iM1242m14 = c0141cm.m1242m();
                if (iM1242m == 0) {
                    i13 = 1;
                } else {
                    if (iM1242m == 3) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (iM1242m == 1) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    i5 *= i14;
                }
                i6 -= (iM1242m11 + iM1242m12) * i13;
                i7 -= (iM1242m13 + iM1242m14) * i5;
            }
            int i22 = i7;
            int i23 = i6;
            int i24 = iM1238i4;
            iM1242m4 = ((i24 != 44 || i24 == 86 || i24 == 100 || i24 == 110 || i24 == 122 || i24 == 244) && (iM1238i5 & 16) != 0) ? 0 : i3;
            iM7329f = -1;
            f = 1.0f;
            if (c0141cm.m1237h()) {
                if (!c0141cm.m1237h()) {
                    iM1238i = c0141cm.m1238i(8);
                    if (iM1238i == 255) {
                        int i25 = i3;
                        iM1238i2 = c0141cm.m1238i(i25);
                        iM1238i3 = c0141cm.m1238i(i25);
                        if (iM1238i2 != 0 && iM1238i3 != 0) {
                            f = iM1238i2 / iM1238i3;
                        }
                    } else if (iM1238i < 17) {
                        f = f7629d[iM1238i];
                    } else {
                        jd0.m3621s(iM1238i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (c0141cm.m1237h()) {
                    c0141cm.m1248s();
                }
                if (c0141cm.m1237h()) {
                    c0141cm.m1249t(3);
                    if (c0141cm.m1237h()) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                    if (c0141cm.m1237h()) {
                        int iM1238i7 = c0141cm.m1238i(8);
                        int iM1238i8 = c0141cm.m1238i(8);
                        c0141cm.m1249t(8);
                        iM7329f = C1673zp.m7329f(iM1238i7);
                        iM7330g = C1673zp.m7330g(iM1238i8);
                    } else {
                        iM7330g = -1;
                    }
                } else {
                    i12 = -1;
                    iM7330g = -1;
                }
                if (c0141cm.m1237h()) {
                    c0141cm.m1242m();
                    c0141cm.m1242m();
                }
                if (c0141cm.m1237h()) {
                    c0141cm.m1249t(65);
                }
                zM1237h2 = c0141cm.m1237h();
                if (zM1237h2) {
                    m4682t0(c0141cm);
                }
                zM1237h3 = c0141cm.m1237h();
                if (zM1237h3) {
                    m4682t0(c0141cm);
                }
                if (zM1237h2 || zM1237h3) {
                    c0141cm.m1248s();
                }
                c0141cm.m1248s();
                if (c0141cm.m1237h()) {
                    c0141cm.m1248s();
                    c0141cm.m1242m();
                    c0141cm.m1242m();
                    c0141cm.m1242m();
                    c0141cm.m1242m();
                    iM1242m4 = c0141cm.m1242m();
                    c0141cm.m1242m();
                }
                f2 = f;
                i11 = iM7329f;
                i9 = i12;
                i10 = iM7330g;
                i8 = iM1242m4;
            } else {
                iM1242m7 = iM1242m7;
                i8 = iM1242m4;
                i9 = -1;
                i10 = -1;
                f2 = 1.0f;
                i11 = -1;
            }
            return new t71(i24, iM1238i5, iM1238i6, iM1242m5, i23, i22, f2, i4, iM1242m2, z, zM1237h, iM1242m7, iM1242m8, iM1242m3, z2, i11, i9, i10, i8);
        }
        iM1242m3 = c0141cm.m1242m() + 4;
        z2 = false;
        c0141cm.m1242m();
        c0141cm.m1248s();
        int iM1242m15 = c0141cm.m1242m() + 1;
        int iM1242m16 = c0141cm.m1242m() + 1;
        zM1237h = c0141cm.m1237h();
        i5 = 2 - (zM1237h ? 1 : 0);
        int i26 = iM1242m16 * i5;
        if (!zM1237h) {
            c0141cm.m1248s();
        }
        c0141cm.m1248s();
        i6 = iM1242m15 * 16;
        i7 = i26 * 16;
        if (c0141cm.m1237h()) {
            int iM1242m17 = c0141cm.m1242m();
            int iM1242m18 = c0141cm.m1242m();
            int iM1242m19 = c0141cm.m1242m();
            int iM1242m110 = c0141cm.m1242m();
            if (iM1242m == 0) {
                i13 = 1;
            } else {
                if (iM1242m == 3) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (iM1242m == 1) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                i5 *= i14;
            }
            i6 -= (iM1242m17 + iM1242m18) * i13;
            i7 -= (iM1242m19 + iM1242m110) * i5;
        }
        int i27 = i7;
        int i28 = i6;
        int i29 = iM1238i4;
        if (i29 != 44) {
        }
        iM7329f = -1;
        f = 1.0f;
        if (c0141cm.m1237h()) {
            if (!c0141cm.m1237h()) {
                iM1238i = c0141cm.m1238i(8);
                if (iM1238i == 255) {
                    int i210 = i3;
                    iM1238i2 = c0141cm.m1238i(i210);
                    iM1238i3 = c0141cm.m1238i(i210);
                    if (iM1238i2 != 0) {
                        f = iM1238i2 / iM1238i3;
                    }
                } else if (iM1238i < 17) {
                    f = f7629d[iM1238i];
                } else {
                    jd0.m3621s(iM1238i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1248s();
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1249t(3);
                if (c0141cm.m1237h()) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                if (c0141cm.m1237h()) {
                    int iM1238i9 = c0141cm.m1238i(8);
                    int iM1238i10 = c0141cm.m1238i(8);
                    c0141cm.m1249t(8);
                    iM7329f = C1673zp.m7329f(iM1238i9);
                    iM7330g = C1673zp.m7330g(iM1238i10);
                } else {
                    iM7330g = -1;
                }
            } else {
                i12 = -1;
                iM7330g = -1;
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1242m();
                c0141cm.m1242m();
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1249t(65);
            }
            zM1237h2 = c0141cm.m1237h();
            if (zM1237h2) {
                m4682t0(c0141cm);
            }
            zM1237h3 = c0141cm.m1237h();
            if (zM1237h3) {
                m4682t0(c0141cm);
            }
            if (zM1237h2) {
                c0141cm.m1248s();
            } else {
                c0141cm.m1248s();
            }
            c0141cm.m1248s();
            if (c0141cm.m1237h()) {
                c0141cm.m1248s();
                c0141cm.m1242m();
                c0141cm.m1242m();
                c0141cm.m1242m();
                c0141cm.m1242m();
                iM1242m4 = c0141cm.m1242m();
                c0141cm.m1242m();
            }
            f2 = f;
            i11 = iM7329f;
            i9 = i12;
            i10 = iM7330g;
            i8 = iM1242m4;
        } else {
            iM1242m7 = iM1242m7;
            i8 = iM1242m4;
            i9 = -1;
            i10 = -1;
            f2 = 1.0f;
            i11 = -1;
        }
        return new t71(i29, iM1238i5, iM1238i6, iM1242m5, i28, i27, f2, i4, iM1242m2, z, zM1237h, iM1242m7, iM1242m8, iM1242m3, z2, i11, i9, i10, i8);
    }

    /* JADX INFO: renamed from: n */
    public static byte[][] m4671n(byte[][] bArr) {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                }
            }
            byte[][] bArr3 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr4 = new byte[bArr[i].length];
                bArr3[i] = bArr4;
                byte[] bArr5 = bArr[i];
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            }
            return bArr3;
        }
        l41.m4051t("in has null pointers");
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public static q51 m4672n0(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            ca0.m1178j("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    q51 q51Var = new q51();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    q51Var.f3076d = byteBufferDuplicate;
                    q51Var.f3073a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    q51Var.f3074b = i6;
                    q51Var.f3075c = ((ByteBuffer) q51Var.f3076d).getShort(i6);
                    return q51Var;
                }
            }
        }
        ca0.m1178j("Cannot read metadata.");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static short[][] m4673o(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = sc2.m6062f(sArr[i]);
        }
        return sArr2;
    }

    /* JADX INFO: renamed from: o0 */
    public static byte[] m4674o0(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr, 0, 4096);
            if (i < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: p */
    public static short[][][] m4675p(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = sc2.m6062f(sArr[i][i2]);
            }
        }
        return sArr2;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m4676p0(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public static int m4677q(wj1 wj1Var, q50 q50Var, View view, View view2, AbstractC0066e abstractC0066e, boolean z) {
        if (abstractC0066e.m678v() == 0 || wj1Var.m6801b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC0066e.m651F(view) - AbstractC0066e.m651F(view2)) + 1;
        }
        return Math.min(q50Var.mo2795l(), q50Var.mo2785b(view2) - q50Var.mo2788e(view));
    }

    /* JADX INFO: renamed from: r */
    public static int m4678r(wj1 wj1Var, q50 q50Var, View view, View view2, AbstractC0066e abstractC0066e, boolean z, boolean z2) {
        if (abstractC0066e.m678v() == 0 || wj1Var.m6801b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (wj1Var.m6801b() - Math.max(AbstractC0066e.m651F(view), AbstractC0066e.m651F(view2))) - 1) : Math.max(0, Math.min(AbstractC0066e.m651F(view), AbstractC0066e.m651F(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(q50Var.mo2785b(view2) - q50Var.mo2788e(view)) / (Math.abs(AbstractC0066e.m651F(view) - AbstractC0066e.m651F(view2)) + 1))) + (q50Var.mo2794k() - q50Var.mo2788e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: s */
    public static int m4679s(wj1 wj1Var, q50 q50Var, View view, View view2, AbstractC0066e abstractC0066e, boolean z) {
        if (abstractC0066e.m678v() == 0 || wj1Var.m6801b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return wj1Var.m6801b();
        }
        return (int) (((q50Var.mo2785b(view2) - q50Var.mo2788e(view)) / (Math.abs(AbstractC0066e.m651F(view) - AbstractC0066e.m651F(view2)) + 1)) * wj1Var.m6801b());
    }

    /* JADX INFO: renamed from: s0 */
    public static void m4680s0(C0141cm c0141cm) throws fc1 {
        int iM1238i = c0141cm.m1238i(6);
        if (iM1238i < 2 || iM1238i > 42) {
            throw fc1.m2800b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM1238i)));
        }
        c0141cm.m1249t(iM1238i * 8);
    }

    /* JADX INFO: renamed from: t */
    public static void m4681t(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            l41.m4051t("src == null");
            return;
        }
        if (i < 0) {
            f40.m2713i("offset hast to be >= 0");
            return;
        }
        if (bArr2.length + i > bArr.length) {
            f40.m2713i("src length + offset must not be greater than size of destination");
            return;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static void m4682t0(C0141cm c0141cm) {
        int iM1242m = c0141cm.m1242m() + 1;
        c0141cm.m1249t(8);
        for (int i = 0; i < iM1242m; i++) {
            c0141cm.m1242m();
            c0141cm.m1242m();
            c0141cm.m1248s();
        }
        c0141cm.m1249t(20);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m4683u(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m4684v(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m4684v(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: v0 */
    public static void m4685v0(if1[] if1VarArr, int i, int i2) {
        if1 if1Var = if1VarArr[i];
        if1VarArr[i] = if1VarArr[i2];
        if1VarArr[i2] = if1Var;
    }

    /* JADX INFO: renamed from: w */
    public static Object m4686w(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        String str;
        nc2 nc2Var = new nc2(cls, new ByteArrayInputStream(bArr));
        Object object = nc2Var.readObject();
        if (nc2Var.available() != 0) {
            str = "unexpected data found at end of ObjectInputStream";
        } else {
            if (cls.isInstance(object)) {
                return object;
            }
            str = "unexpected class found in ObjectInputStream";
        }
        ca0.m1178j(str);
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public static byte[] m4687w0(int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m4688x(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m4689x0(int i, byte[] bArr) {
        int i2;
        synchronized (f7630e) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f7631f;
                    if (iArr.length <= i4) {
                        f7631f = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f7631f[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f7631f[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m4690y(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            l41.m4051t("src == null");
            return null;
        }
        if (i < 0) {
            f40.m2713i("offset hast to be >= 0");
            return null;
        }
        if (i2 < 0) {
            f40.m2713i("length hast to be >= 0");
            return null;
        }
        if (i + i2 > bArr.length) {
            f40.m2713i("offset + length must not be greater then size of source array");
            return null;
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: y0 */
    public static Bundle m4691y0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(o21.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m4692z(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        ki0.m3864h(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m4667l(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m4667l(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m4667l(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m4667l(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: D */
    public a70 m4693D() {
        boolean z;
        List listMo4183E = mo4183E();
        if (listMo4183E != null) {
            z = listMo4183E.size() == 1;
        }
        p32.m5194y(z, "%s does not have exactly one group", listMo4183E);
        return (a70) listMo4183E.get(0);
    }

    /* JADX INFO: renamed from: E */
    public abstract List mo4183E();

    /* JADX INFO: renamed from: F */
    public abstract AbstractC1337qm mo4184F();

    /* JADX INFO: renamed from: I */
    public abstract void mo723I(yr1 yr1Var, float f, float f2);

    /* JADX INFO: renamed from: O */
    public abstract Object mo4185O();

    /* JADX INFO: renamed from: Z */
    public abstract AbstractC0610eo mo92Z(u51 u51Var, C0022al c0022al);

    /* JADX INFO: renamed from: b0 */
    public abstract void mo3456b0(int i);

    /* JADX INFO: renamed from: c0 */
    public abstract void mo3457c0(Typeface typeface, boolean z);

    public abstract C1437tb getAttributes();

    /* JADX INFO: renamed from: q0 */
    public abstract void mo4186q0();

    /* JADX INFO: renamed from: r0 */
    public abstract void mo4187r0();

    /* JADX INFO: renamed from: u0 */
    public abstract void mo2366u0(mu0 mu0Var);

    /* JADX INFO: renamed from: z0 */
    public abstract void mo4188z0(List list);

    @Override // p000.d82
    /* JADX INFO: renamed from: a */
    public void mo2288a() {
    }

    @Override // p000.d82
    /* JADX INFO: renamed from: e */
    public void mo2289e() {
    }
}
