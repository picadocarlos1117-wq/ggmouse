package p000;

import android.R;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ki0 {

    /* JADX INFO: renamed from: m */
    public static a61 f5841m;

    /* JADX INFO: renamed from: o */
    public static Method f5843o;

    /* JADX INFO: renamed from: p */
    public static boolean f5844p;

    /* JADX INFO: renamed from: a */
    public static final int[] f5829a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f5830b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f5831c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: d */
    public static final int[] f5832d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: e */
    public static final int[] f5833e = {64, 112, 128, 192, 224, 256, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: f */
    public static final int[] f5834f = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: g */
    public static final int[] f5835g = {5, 8, 10, 12};

    /* JADX INFO: renamed from: h */
    public static final int[] f5836h = {6, 9, 12, 15};

    /* JADX INFO: renamed from: i */
    public static final int[] f5837i = {2, 4, 6, 8};

    /* JADX INFO: renamed from: j */
    public static final int[] f5838j = {9, 11, 13, 16};

    /* JADX INFO: renamed from: k */
    public static final int[] f5839k = {5, 8, 10, 12};

    /* JADX INFO: renamed from: l */
    public static final a61 f5840l = new a61(null, null, null);

    /* JADX INFO: renamed from: n */
    public static final Object f5842n = new Object();

    /* JADX INFO: renamed from: A */
    public static int m3838A(C0141cm c0141cm) throws fc1 {
        int iM1238i = c0141cm.m1238i(4);
        if (iM1238i == 15) {
            if (c0141cm.m1231b() >= 24) {
                return c0141cm.m1238i(24);
            }
            throw fc1.m2799a(null, "AAC header insufficient data");
        }
        if (iM1238i < 13) {
            return f5829a[iM1238i];
        }
        throw fc1.m2799a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX INFO: renamed from: B */
    public static long m3839B(double d) {
        p32.m5177l(m3841H(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m3840E(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m3841H(double d) {
        return Math.getExponent(d) <= 1023;
    }

    /* JADX INFO: renamed from: I */
    public static void m3842I(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: J */
    public static ey1 m3843J(ey1 ey1Var) {
        if ((ey1Var instanceof gy1) || (ey1Var instanceof fy1)) {
            return ey1Var;
        }
        return ey1Var instanceof Serializable ? new fy1(ey1Var) : new gy1(ey1Var);
    }

    /* JADX INFO: renamed from: K */
    public static TypedArray m3844K(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: P */
    public static C0586e0 m3845P(C0141cm c0141cm, boolean z) throws fc1 {
        int iM1238i = c0141cm.m1238i(5);
        if (iM1238i == 31) {
            iM1238i = c0141cm.m1238i(6) + 32;
        }
        int iM3838A = m3838A(c0141cm);
        int iM1238i2 = c0141cm.m1238i(4);
        String strM3609g = jd0.m3609g(iM1238i, "mp4a.40.");
        if (iM1238i == 5 || iM1238i == 29) {
            iM3838A = m3838A(c0141cm);
            int iM1238i3 = c0141cm.m1238i(5);
            if (iM1238i3 == 31) {
                iM1238i3 = c0141cm.m1238i(6) + 32;
            }
            iM1238i = iM1238i3;
            if (iM1238i == 22) {
                iM1238i2 = c0141cm.m1238i(4);
            }
        }
        if (z) {
            if (iM1238i != 1 && iM1238i != 2 && iM1238i != 3 && iM1238i != 4 && iM1238i != 6 && iM1238i != 7 && iM1238i != 17) {
                switch (iM1238i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw fc1.m2800b("Unsupported audio object type: " + iM1238i);
                }
            }
            if (c0141cm.m1237h()) {
                AbstractC1337qm.m5542i0("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c0141cm.m1237h()) {
                c0141cm.m1249t(14);
            }
            boolean zM1237h = c0141cm.m1237h();
            if (iM1238i2 == 0) {
                lv1.m4291b();
                return null;
            }
            if (iM1238i == 6 || iM1238i == 20) {
                c0141cm.m1249t(3);
            }
            if (zM1237h) {
                if (iM1238i == 22) {
                    c0141cm.m1249t(16);
                }
                if (iM1238i == 17 || iM1238i == 19 || iM1238i == 20 || iM1238i == 23) {
                    c0141cm.m1249t(3);
                }
                c0141cm.m1249t(1);
            }
            switch (iM1238i) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM1238i4 = c0141cm.m1238i(2);
                    if (iM1238i4 == 2 || iM1238i4 == 3) {
                        throw fc1.m2800b("Unsupported epConfig: " + iM1238i4);
                    }
                    break;
            }
        }
        int i = f5830b[iM1238i2];
        if (i != -1) {
            return new C0586e0(iM3838A, i, strM3609g);
        }
        throw fc1.m2799a(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX INFO: renamed from: Q */
    public static ArrayList m3846Q(dc1 dc1Var) {
        char c;
        ArrayList arrayList;
        boolean z;
        int i;
        Object ah1Var;
        dc1 dc1Var2 = dc1Var;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (dc1Var2.m2337t() == 0) {
            char c2 = 7;
            dc1Var2.m2317G(7);
            int iM2324g = dc1Var2.m2324g();
            boolean z2 = true;
            if (iM2324g == 1684433976) {
                dc1 dc1Var3 = new dc1();
                Inflater inflater = new Inflater(true);
                try {
                    if (!z42.m7251y(dc1Var2, dc1Var3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    dc1Var2 = dc1Var3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM2324g == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i2 = dc1Var2.f2883b;
            int i3 = dc1Var2.f2884c;
            while (i2 < i3) {
                int iM2324g2 = dc1Var2.m2324g() + i2;
                if (iM2324g2 > i2 && iM2324g2 <= i3) {
                    if (dc1Var2.m2324g() == 1835365224) {
                        int iM2324g3 = dc1Var2.m2324g();
                        if (iM2324g3 > 10000) {
                            c = c2;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z = z2;
                            i = i3;
                            ah1Var = arrayList4;
                        } else {
                            float[] fArr = new float[iM2324g3];
                            for (int i4 = 0; i4 < iM2324g3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(dc1Var2.m2324g());
                            }
                            int iM2324g4 = dc1Var2.m2324g();
                            if (iM2324g4 > 32000) {
                                c = c2;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z = z2;
                                i = i3;
                                ah1Var = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c = c2;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM2324g3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = dc1Var2.f2882a;
                                C0141cm c0141cm = new C0141cm(bArr, bArr.length);
                                c0141cm.m1246q(dc1Var2.f2883b * 8);
                                float[] fArr2 = new float[iM2324g4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < iM2324g4) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < i5) {
                                                int i9 = iArr[i8];
                                                int iM1238i = c0141cm.m1238i(iCeil);
                                                int i10 = ((iM1238i >> 1) ^ (-(iM1238i & 1))) + i9;
                                                if (i10 < iM2324g3 && i10 >= 0) {
                                                    fArr2[i7] = fArr[i10];
                                                    iArr[i8] = i10;
                                                    i8++;
                                                    i7++;
                                                    i5 = 5;
                                                }
                                            } else {
                                                i6++;
                                                i5 = 5;
                                            }
                                        }
                                    } else {
                                        c0141cm.m1246q((c0141cm.m1236g() + 7) & (-8));
                                        int i11 = 32;
                                        int iM1238i2 = c0141cm.m1238i(32);
                                        C0716hj[] c0716hjArr = new C0716hj[iM1238i2];
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < iM1238i2) {
                                                int iM1238i3 = c0141cm.m1238i(8);
                                                int iM1238i4 = c0141cm.m1238i(8);
                                                int iM1238i5 = c0141cm.m1238i(i11);
                                                if (iM1238i5 <= 128000) {
                                                    int i13 = iM1238i2;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM2324g4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iM1238i5 * 3];
                                                    float[] fArr5 = new float[iM1238i5 * 2];
                                                    i = i3;
                                                    int i14 = 0;
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i14 < iM1238i5) {
                                                            int iM1238i6 = c0141cm.m1238i(iCeil2);
                                                            C0141cm c0141cm2 = c0141cm;
                                                            int i16 = ((iM1238i6 >> 1) ^ (-(iM1238i6 & 1))) + i15;
                                                            if (i16 >= 0 && i16 < iM2324g4) {
                                                                int i17 = i14 * 3;
                                                                int i18 = i16 * 5;
                                                                fArr4[i17] = fArr3[i18];
                                                                fArr4[i17 + 1] = fArr3[i18 + 1];
                                                                fArr4[i17 + 2] = fArr3[i18 + 2];
                                                                int i19 = i14 * 2;
                                                                fArr5[i19] = fArr3[i18 + 3];
                                                                fArr5[i19 + 1] = fArr3[i18 + 4];
                                                                i14++;
                                                                i15 = i16;
                                                                c0141cm = c0141cm2;
                                                            }
                                                        } else {
                                                            c0716hjArr[i12] = new C0716hj(iM1238i3, fArr4, fArr5, iM1238i4);
                                                            i12++;
                                                            iM1238i2 = i13;
                                                            fArr2 = fArr3;
                                                            i3 = i;
                                                            c0141cm = c0141cm;
                                                            i11 = 32;
                                                        }
                                                    }
                                                }
                                                ah1Var = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i = i3;
                                                ah1Var = new ah1(c0716hjArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i = i3;
                                    ah1Var = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (ah1Var == null) {
                            return arrayList;
                        }
                        arrayList3.add(ah1Var);
                    } else {
                        c = c2;
                        arrayList = arrayList2;
                        z = z2;
                        i = i3;
                    }
                    dc1Var2.m2316F(iM2324g2);
                    i2 = iM2324g2;
                    c2 = c;
                    z2 = z;
                    arrayList2 = arrayList;
                    i3 = i;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: R */
    public static int m3847R(C0141cm c0141cm, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c0141cm.m1237h(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c0141cm.m1238i(iArr[i]) + i3;
    }

    /* JADX INFO: renamed from: S */
    public static void m3848S(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        v30.m6560h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: T */
    public static TypedValue m3849T(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m3850U(Context context, int i, boolean z) {
        TypedValue typedValueM3849T = m3849T(context, i);
        if (typedValueM3849T == null || typedValueM3849T.type != 18) {
            return z;
        }
        return typedValueM3849T.data != 0;
    }

    /* JADX INFO: renamed from: V */
    public static TypedValue m3851V(Context context, int i, String str) {
        TypedValue typedValueM3849T = m3849T(context, i);
        if (typedValueM3849T != null) {
            return typedValueM3849T;
        }
        ca0.m1183o("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    /* JADX INFO: renamed from: Y */
    public static void m3852Y(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(jd0.m3609g(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m3853Z(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = i72.f4849a;
        boolean zM5717a = r62.m5717a(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zM5717a || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zM5717a);
        checkableImageButton.setPressable(zM5717a);
        checkableImageButton.setLongClickable(z);
        s62.m5998s(checkableImageButton, z2 ? 1 : 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3854a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                v30.m6560h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                v30.m6560h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                v30.m6561i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3855b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m3856b0(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* JADX INFO: renamed from: c */
    public static void m3857c(boolean z) {
        if (z) {
            return;
        }
        l41.m4049r();
    }

    /* JADX INFO: renamed from: c0 */
    public static int m3858c0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: d */
    public static void m3859d(boolean z, String str) {
        if (z) {
            return;
        }
        f40.m2713i(str);
    }

    /* JADX INFO: renamed from: e */
    public static void m3860e(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m3861e0(int i, j20 j20Var) {
        j20Var.mo728c((byte) (i >>> 24));
        j20Var.mo728c((byte) (i >>> 16));
        j20Var.mo728c((byte) (i >>> 8));
        j20Var.mo728c((byte) i);
    }

    /* JADX INFO: renamed from: f */
    public static void m3862f(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ca0.m1175g(i3, AbstractC1308pu.m5345l("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            f40.m2713i(AbstractC1308pu.m5338e("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m3863g(Context context, String str) {
        int iM6252c;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM6253d = AbstractC1435t9.m6253d(str);
            if (strM6253d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && i91.m3395a(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerM6409c = AbstractC1472u9.m6409c(context);
                    iM6252c = AbstractC1472u9.m6407a(appOpsManagerM6409c, strM6253d, Binder.getCallingUid(), packageName);
                    if (iM6252c == 0) {
                        iM6252c = AbstractC1472u9.m6407a(appOpsManagerM6409c, strM6253d, iMyUid, AbstractC1472u9.m6408b(context));
                    }
                } else {
                    iM6252c = AbstractC1435t9.m6252c((AppOpsManager) AbstractC1435t9.m6250a(context, AppOpsManager.class), strM6253d, packageName);
                }
                if (iM6252c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static void m3864h(boolean z) {
        if (z) {
            return;
        }
        l41.m4046o();
    }

    /* JADX INFO: renamed from: i */
    public static void m3865i(boolean z, String str) {
        if (z) {
            return;
        }
        f40.m2719o(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m3866j(Object obj) {
        if (obj != null) {
            return;
        }
        l41.m4046o();
    }

    /* JADX INFO: renamed from: k */
    public static void m3867k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        f40.m2719o(str);
    }

    /* JADX INFO: renamed from: n */
    public static int m3868n(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: o */
    public static void m3869o(long j, dc1 dc1Var, c22[] c22VarArr) {
        int i;
        int iM2337t;
        while (true) {
            if (dc1Var.m2318a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (dc1Var.m2318a() == 0) {
                    i = -1;
                    break;
                }
                int iM2337t2 = dc1Var.m2337t();
                i2 += iM2337t2;
                if (iM2337t2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (dc1Var.m2318a() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iM2337t = dc1Var.m2337t();
                    i3 += iM2337t;
                }
            } while (iM2337t == 255);
            int i4 = dc1Var.f2883b + i3;
            if (i3 == -1 || i3 > dc1Var.m2318a()) {
                AbstractC1337qm.m5542i0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = dc1Var.f2884c;
            } else if (i == 4 && i3 >= 8) {
                int iM2337t3 = dc1Var.m2337t();
                int iM2343z = dc1Var.m2343z();
                int iM2324g = iM2343z == 49 ? dc1Var.m2324g() : 0;
                int iM2337t4 = dc1Var.m2337t();
                if (iM2343z == 47) {
                    dc1Var.m2317G(1);
                }
                boolean z = iM2337t3 == 181 && (iM2343z == 49 || iM2343z == 47) && iM2337t4 == 3;
                if (iM2343z == 49) {
                    z &= iM2324g == 1195456820;
                }
                if (z) {
                    m3870p(j, dc1Var, c22VarArr);
                }
            }
            dc1Var.m2316F(i4);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m3870p(long j, dc1 dc1Var, c22[] c22VarArr) {
        int iM2337t = dc1Var.m2337t();
        if ((iM2337t & 64) != 0) {
            dc1Var.m2317G(1);
            int i = (iM2337t & 31) * 3;
            int i2 = dc1Var.f2883b;
            for (c22 c22Var : c22VarArr) {
                dc1Var.m2316F(i2);
                c22Var.mo1115b(dc1Var, i, 0);
                m3864h(j != -9223372036854775807L);
                c22Var.mo1114a(j, 1, i, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static ImageView.ScaleType m3871q(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static long[] m3872r(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: u */
    public static byte[] m3873u(AbstractC1399sa abstractC1399sa) {
        if (abstractC1399sa.f10330a) {
            f40.m2713i("private key found");
            return null;
        }
        try {
            return sc2.m6071o(abstractC1399sa).m4629i();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static C0082b0 m3874v(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C0082b0 c0082b0M799e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0082b0(null, null, typedValue.data);
            }
            try {
                c0082b0M799e = C0082b0.m799e(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0082b0M799e = null;
            }
            if (c0082b0M799e != null) {
                return c0082b0M799e;
            }
        }
        return new C0082b0(null, null, 0);
    }

    /* JADX INFO: renamed from: w */
    public static C0141cm m3875w(byte[] bArr) {
        byte[] bArr2;
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new C0141cm(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        C0141cm c0141cm = new C0141cm(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C0141cm c0141cm2 = new C0141cm(bArrCopyOf, bArrCopyOf.length);
            while (c0141cm2.m1231b() >= 16) {
                c0141cm2.m1249t(2);
                int iM1238i = c0141cm2.m1238i(14) & 16383;
                int iMin = Math.min(8 - c0141cm.f1860d, 14);
                int i3 = c0141cm.f1860d;
                int i4 = (8 - i3) - iMin;
                byte[] bArr3 = c0141cm.f1858b;
                int i5 = c0141cm.f1859c;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr3[i5]);
                bArr3[i5] = b4;
                int i6 = 14 - iMin;
                bArr3[i5] = (byte) (b4 | ((iM1238i >>> i6) << i4));
                int i7 = i5 + 1;
                while (true) {
                    bArr2 = c0141cm.f1858b;
                    if (i6 > 8) {
                        bArr2[i7] = (byte) (iM1238i >>> (i6 - 8));
                        i6 -= 8;
                        i7++;
                    }
                }
                int i8 = 8 - i6;
                byte b5 = (byte) (bArr2[i7] & ((1 << i8) - 1));
                bArr2[i7] = b5;
                bArr2[i7] = (byte) (((iM1238i & ((1 << i6) - 1)) << i8) | b5);
                c0141cm.m1249t(14);
                c0141cm.m1230a();
            }
        }
        c0141cm.m1244o(bArrCopyOf.length, bArrCopyOf);
        return c0141cm;
    }

    /* JADX INFO: renamed from: x */
    public static Intent m3876x(AbstractActivityC1469u6 abstractActivityC1469u6) {
        Intent intentM112a = a81.m112a(abstractActivityC1469u6);
        if (intentM112a != null) {
            return intentM112a;
        }
        try {
            String strM3878z = m3878z(abstractActivityC1469u6, abstractActivityC1469u6.getComponentName());
            if (strM3878z == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC1469u6, strM3878z);
            try {
                return m3878z(abstractActivityC1469u6, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM3878z + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            l41.m4045n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static Intent m3877y(AbstractActivityC1469u6 abstractActivityC1469u6, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM3878z = m3878z(abstractActivityC1469u6, componentName);
        if (strM3878z == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM3878z);
        return m3878z(abstractActivityC1469u6, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: z */
    public static String m3878z(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: C */
    public int mo3879C(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public int mo3880D() {
        return 0;
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo1202F();

    /* JADX INFO: renamed from: G */
    public abstract boolean mo1203G();

    /* JADX INFO: renamed from: M */
    public abstract void mo3882M(int i);

    /* JADX INFO: renamed from: N */
    public abstract void mo3883N(View view, int i, int i2);

    /* JADX INFO: renamed from: O */
    public abstract void mo3884O(View view, float f, float f2);

    /* JADX INFO: renamed from: W */
    public abstract void mo1204W(boolean z);

    /* JADX INFO: renamed from: X */
    public abstract void mo1205X(boolean z);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo1206a0();

    /* JADX INFO: renamed from: d0 */
    public abstract boolean mo3885d0(View view, int i);

    /* JADX INFO: renamed from: l */
    public abstract int mo3886l(View view, int i);

    /* JADX INFO: renamed from: m */
    public abstract int mo3887m(View view, int i);

    /* JADX INFO: renamed from: s */
    public k51 m3888s(o51 o51Var) {
        ByteBuffer byteBuffer = o51Var.f11795n;
        byteBuffer.getClass();
        m3857c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo194t(o51Var, byteBuffer);
    }

    /* JADX INFO: renamed from: t */
    public abstract k51 mo194t(o51 o51Var, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: L */
    public void mo3881L(View view, int i) {
    }
}
