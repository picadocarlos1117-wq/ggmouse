package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.widget.ImageView;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.Serializable;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0082b0 implements InterfaceC0604ei {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1102a;

    /* JADX INFO: renamed from: b */
    public int f1103b;

    /* JADX INFO: renamed from: c */
    public Object f1104c;

    /* JADX INFO: renamed from: d */
    public Object f1105d;

    public C0082b0(ch1 ch1Var) {
        this.f1102a = 6;
        this.f1104c = new short[256];
        ch1Var.getClass();
        this.f1103b = ch1Var.f1808c;
        this.f1105d = (C0599ed) ch1Var.f1813h;
    }

    /* JADX INFO: renamed from: b */
    public static void m798b(C0082b0 c0082b0, C0082b0 c0082b1, C0082b0 c0082b2) {
        for (int i = 0; i < 64; i++) {
            int i2 = i * 4;
            short[] sArr = (short[]) c0082b1.f1104c;
            short s = sArr[i2];
            int i3 = i2 + 1;
            short s2 = sArr[i3];
            short[] sArr2 = (short[]) c0082b2.f1104c;
            short s3 = sArr2[i2];
            short s4 = sArr2[i3];
            short[] sArr3 = hr1.f4689h;
            int i4 = i + 64;
            hr1.m3267c(c0082b0, i2, s, s2, s3, s4, sArr3[i4]);
            int i5 = i2 + 2;
            short[] sArr4 = (short[]) c0082b1.f1104c;
            short s5 = sArr4[i5];
            int i6 = i2 + 3;
            short s6 = sArr4[i6];
            short[] sArr5 = (short[]) c0082b2.f1104c;
            hr1.m3267c(c0082b0, i5, s5, s6, sArr5[i5], sArr5[i6], (short) (sArr3[i4] * (-1)));
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0082b0 m799e(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM1040b = AbstractC0108bq.m1040b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0082b0(null, colorStateListM1040b, colorStateListM1040b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM3844K = ki0.m3844K(resources, theme, attributeSetAsAttributeSet, fi1.f3822d);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM3844K.getFloat(8, TouchPipeline.SIZE) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM3844K.getFloat(9, TouchPipeline.SIZE) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM3844K.getFloat(10, TouchPipeline.SIZE) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM3844K.getFloat(11, TouchPipeline.SIZE) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM3844K.getFloat(3, TouchPipeline.SIZE) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM3844K.getFloat(4, TouchPipeline.SIZE) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM3844K.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM3844K.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM3844K.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM3844K.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM3844K.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM3844K.getFloat(5, TouchPipeline.SIZE) : TouchPipeline.SIZE;
        typedArrayM3844K.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM3844K2 = ki0.m3844K(resources, theme, attributeSetAsAttributeSet, fi1.f3823e);
                boolean zHasValue = typedArrayM3844K2.hasValue(0);
                boolean zHasValue2 = typedArrayM3844K2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM3844K2.getColor(0, 0);
                float f11 = typedArrayM3844K2.getFloat(1, TouchPipeline.SIZE);
                typedArrayM3844K2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        C0558d8 c0558d8 = arrayList2.size() > 0 ? new C0558d8(arrayList2, arrayList) : null;
        if (c0558d8 == null) {
            c0558d8 = z ? new C0558d8(color, color2, color3) : new C0558d8(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) c0558d8.f2821b;
                float[] fArr = (float[]) c0558d8.f2822c;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) c0558d8.f2821b, (float[]) c0558d8.f2822c);
            }
        } else {
            if (f10 <= TouchPipeline.SIZE) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) c0558d8.f2821b;
            float[] fArr2 = (float[]) c0558d8.f2822c;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new C0082b0(radialGradient, null, 0);
    }

    /* JADX INFO: renamed from: m */
    public static C0082b0 m800m(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        int i2 = 8;
        ph1 ph1Var = ph1.HTTP_1_0;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                ph1Var = ph1.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i3 = i + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i4 = Integer.parseInt(str.substring(i, i3));
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C0082b0(ph1Var, i4, strSubstring, i2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m801a() {
        C0577ds c0577ds;
        ImageView imageView = (ImageView) this.f1104c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            x30.m6864a(drawable);
        }
        if (drawable == null || (c0577ds = (C0577ds) this.f1105d) == null) {
            return;
        }
        C1507v7.m6595e(drawable, c0577ds, imageView.getDrawableState());
    }

    @Override // p000.InterfaceC0604ei
    /* JADX INFO: renamed from: c */
    public C0568di mo802c(y80 y80Var, long j) {
        long j2;
        long position = y80Var.getPosition();
        int iMin = (int) Math.min(112800L, y80Var.mo2420i() - position);
        dc1 dc1Var = (dc1) this.f1105d;
        dc1Var.m2313C(iMin);
        y80Var.mo2413a(0, iMin, dc1Var.f2882a);
        int i = dc1Var.f2884c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (dc1Var.m2318a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = dc1Var.f2882a;
            int i2 = dc1Var.f2883b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jM5521V = AbstractC1337qm.m5521V(dc1Var, i2, this.f1103b);
            if (jM5521V != j2) {
                long jM6984b = ((y02) this.f1104c).m6984b(jM5521V);
                if (jM6984b > j) {
                    return j5 == j2 ? new C0568di(jM6984b, position, -1) : new C0568di(-9223372036854775807L, position + j4, 0);
                }
                j5 = jM6984b;
                if (100000 + j5 > j) {
                    return new C0568di(-9223372036854775807L, position + ((long) i2), 0);
                }
                j4 = i2;
            }
            dc1Var.m2316F(i3);
            j3 = i3;
        }
        return j5 != j2 ? new C0568di(j5, position + j3, -2) : C0568di.f2932d;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: d */
    public pk1 m803d() {
        int i;
        boolean z;
        char c;
        Object r4;
        char c2;
        short[] sArr;
        int i2;
        boolean z2;
        Object r17;
        boolean z3;
        Object r5;
        pk1 pk1Var;
        boolean z4;
        rm0 rm0Var = (rm0) this.f1105d;
        if (rm0Var != null) {
            throw rm0Var.m5861a();
        }
        int i3 = this.f1103b;
        Object[] objArrCopyOf = (Object[]) this.f1104c;
        if (i3 == 0) {
            pk1Var = pk1.f8924g;
        } else {
            int i4 = 1;
            rm0 rm0Var2 = null;
            Object r6 = 0;
            rm0 rm0Var3 = null;
            rm0 rm0Var4 = null;
            boolean z5 = false;
            if (i3 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                pk1Var = new pk1(null, objArrCopyOf, 1);
            } else {
                p32.m5189t(i3, objArrCopyOf.length >> 1);
                int iM6290k = tm0.m6290k(i3);
                char c3 = 2;
                if (i3 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    i = 1;
                    z4 = false;
                } else {
                    int i5 = iM6290k - 1;
                    if (iM6290k <= 128) {
                        byte[] bArr = new byte[iM6290k];
                        Arrays.fill(bArr, (byte) -1);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i3) {
                            int i8 = i6 * 2;
                            int i9 = i7 * 2;
                            Object obj = objArrCopyOf[i8];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i8 ^ i4];
                            Objects.requireNonNull(obj2);
                            int iM5533d0 = AbstractC1337qm.m5533d0(obj.hashCode());
                            while (true) {
                                int i10 = iM5533d0 & i5;
                                i2 = i4;
                                z2 = z5;
                                int i11 = bArr[i10] & 255;
                                if (i11 == 255) {
                                    bArr[i10] = (byte) i9;
                                    if (i7 < i6) {
                                        objArrCopyOf[i9] = obj;
                                        objArrCopyOf[i9 ^ 1] = obj2;
                                    }
                                    i7++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i11 == true ? 1 : 0])) {
                                    int i12 = ~i11;
                                    Object obj3 = objArrCopyOf[i12 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    rm0Var3 = new rm0(obj, obj2, obj3);
                                    objArrCopyOf[i12 == true ? 1 : 0] = obj2;
                                    break;
                                }
                                iM5533d0 = i10 + 1;
                                i4 = i2;
                                z5 = z2;
                            }
                            i6++;
                            i4 = i2;
                            z5 = z2;
                        }
                        i = i4;
                        z = z5;
                        if (i7 == i3) {
                            r6 = bArr;
                            z4 = z;
                        } else {
                            sArr = new Object[3];
                            sArr[z ? 1 : 0] = bArr;
                            sArr[i] = Integer.valueOf(i7);
                            sArr[2] = rm0Var3;
                            r6 = sArr;
                            z4 = z;
                        }
                    } else {
                        i = 1;
                        z = false;
                        if (iM6290k <= 32768) {
                            sArr = new short[iM6290k];
                            Arrays.fill(sArr, (short) -1);
                            int i13 = 0;
                            for (int i14 = 0; i14 < i3; i14++) {
                                int i15 = i14 * 2;
                                int i16 = i13 * 2;
                                Object obj4 = objArrCopyOf[i15];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i15 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iM5533d1 = AbstractC1337qm.m5533d0(obj4.hashCode());
                                while (true) {
                                    int i17 = iM5533d1 & i5;
                                    int i18 = sArr[i17] & 65535;
                                    if (i18 == 65535) {
                                        sArr[i17] = (short) i16;
                                        if (i13 < i14) {
                                            objArrCopyOf[i16] = obj4;
                                            objArrCopyOf[i16 ^ 1] = obj5;
                                        }
                                        i13++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                                        int i19 = ~i18;
                                        Object obj6 = objArrCopyOf[i19 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        rm0Var4 = new rm0(obj4, obj5, obj6);
                                        objArrCopyOf[i19 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iM5533d1 = i17 + 1;
                                }
                            }
                            if (i13 == i3) {
                                r6 = sArr;
                                z4 = z;
                            } else {
                                r6 = new Object[]{sArr, Integer.valueOf(i13), rm0Var4};
                                z4 = z;
                            }
                        } else {
                            int[] iArr = new int[iM6290k];
                            Arrays.fill(iArr, -1);
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < i3) {
                                int i22 = i20 * 2;
                                int i23 = i21 * 2;
                                Object obj7 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i22 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iM5533d2 = AbstractC1337qm.m5533d0(obj7.hashCode());
                                while (true) {
                                    int i24 = iM5533d2 & i5;
                                    int i25 = iArr[i24];
                                    if (i25 == -1) {
                                        iArr[i24] = i23;
                                        if (i21 < i20) {
                                            objArrCopyOf[i23] = obj7;
                                            objArrCopyOf[i23 ^ 1] = obj8;
                                        }
                                        i21++;
                                        c2 = c3;
                                        break;
                                    }
                                    c2 = c3;
                                    if (obj7.equals(objArrCopyOf[i25])) {
                                        int i26 = i25 ^ 1;
                                        Object obj9 = objArrCopyOf[i26];
                                        Objects.requireNonNull(obj9);
                                        rm0Var2 = new rm0(obj7, obj8, obj9);
                                        objArrCopyOf[i26] = obj8;
                                        break;
                                    }
                                    iM5533d2 = i24 + 1;
                                    c3 = c2;
                                }
                                i20++;
                                c3 = c2;
                            }
                            c = c3;
                            if (i21 == i3) {
                                r4 = iArr;
                                r17 = z;
                            } else {
                                Object[] objArr = new Object[3];
                                objArr[0] = iArr;
                                objArr[1] = Integer.valueOf(i21);
                                objArr[c] = rm0Var2;
                                r4 = objArr;
                                r17 = z;
                            }
                        }
                    }
                    z3 = r4 instanceof Object[];
                    r5 = r4;
                    if (z3) {
                        Object[] objArr2 = (Object[]) r4;
                        this.f1105d = (rm0) objArr2[c];
                        Object obj10 = objArr2[r17];
                        int iIntValue = ((Integer) objArr2[i]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r5 = obj10;
                        i3 = iIntValue;
                    }
                    pk1Var = new pk1(r5, objArrCopyOf, i3);
                }
                c = 2;
                r4 = r6;
                r17 = z4;
                z3 = r4 instanceof Object[];
                r5 = r4;
                if (z3) {
                    Object[] objArr3 = (Object[]) r4;
                    this.f1105d = (rm0) objArr3[c];
                    Object obj11 = objArr3[r17];
                    int iIntValue2 = ((Integer) objArr3[i]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r5 = obj11;
                    i3 = iIntValue2;
                }
                pk1Var = new pk1(r5, objArrCopyOf, i3);
            }
        }
        rm0 rm0Var5 = (rm0) this.f1105d;
        if (rm0Var5 == null) {
            return pk1Var;
        }
        throw rm0Var5.m5861a();
    }

    /* JADX INFO: renamed from: f */
    public Object m804f(int i) {
        SparseArray sparseArray = (SparseArray) this.f1104c;
        if (this.f1103b == -1) {
            this.f1103b = 0;
        }
        while (true) {
            int i2 = this.f1103b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f1103b--;
        }
        while (this.f1103b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f1103b + 1)) {
            this.f1103b++;
        }
        return sparseArray.valueAt(this.f1103b);
    }

    /* JADX INFO: renamed from: g */
    public void m805g(byte b, byte[] bArr) {
        int i = this.f1103b;
        int i2 = (i * 256) / 4;
        byte[] bArr2 = new byte[i2];
        C0599ed c0599ed = (C0599ed) this.f1105d;
        c0599ed.getClass();
        int length = bArr.length + 1;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        bArr3[bArr.length] = b;
        rn1 rn1Var = (rn1) c0599ed.f3316d;
        rn1Var.mo729e(0, length, bArr3);
        rn1Var.m5864m(0, i2, bArr2);
        if (i != 3) {
            for (int i3 = 0; i3 < 32; i3++) {
                int i4 = i3 * 4;
                long j = ((long) (bArr2[i4] & 255)) | (((long) (bArr2[i4 + 1] & 255)) << 8) | (((long) (bArr2[i4 + 2] & 255)) << 16) | (((long) (bArr2[i4 + 3] & 255)) << 24);
                long j2 = (j & 1431655765) + ((j >> 1) & 1431655765);
                for (int i5 = 0; i5 < 8; i5++) {
                    int i6 = i5 * 4;
                    ((short[]) this.f1104c)[(i3 * 8) + i5] = (short) (((short) ((j2 >> i6) & 3)) - ((short) ((j2 >> (i6 + i)) & 3)));
                }
            }
            return;
        }
        for (int i7 = 0; i7 < 64; i7++) {
            int i8 = i7 * 3;
            long j3 = ((long) (bArr2[i8] & 255)) | (((long) (bArr2[i8 + 1] & 255)) << 8) | (((long) (bArr2[i8 + 2] & 255)) << 16);
            long j4 = (j3 & 2396745) + ((j3 >> 1) & 2396745) + ((j3 >> 2) & 2396745);
            for (int i9 = 0; i9 < 4; i9++) {
                int i10 = i9 * 6;
                ((short[]) this.f1104c)[(i7 * 4) + i9] = (short) (((short) ((j4 >> i10) & 7)) - ((short) ((j4 >> (i10 + 3)) & 7)));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public int m806h() {
        int i = this.f1103b;
        if (i == 2) {
            return 2048;
        }
        if (i != 3) {
            return 0;
        }
        return UserVerificationMethods.USER_VERIFY_NONE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[][], java.io.Serializable] */
    /* JADX INFO: renamed from: i */
    public InterfaceC0696h m807i(int i) throws IOException {
        Object r0 = (byte[][]) this.f1105d;
        int i2 = this.f1103b;
        qs0 qs0Var = (qs0) this.f1104c;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        if (qs0Var instanceof xm0) {
            xm0 xm0Var = (xm0) qs0Var;
            xm0Var.f12644f = false;
            xm0Var.m6935d();
        }
        int iM4337o = C1090m.m4337o(i, qs0Var);
        int i3 = 1;
        int i4 = 4;
        int i5 = 3;
        int iM4336j = C1090m.m4336j(qs0Var, i2, iM4337o == 3 || iM4337o == 4 || iM4337o == 16 || iM4337o == 17 || iM4337o == 8);
        if (iM4336j < 0) {
            if ((i & 32) == 0) {
                ca0.m1178j("indefinite-length primitive encoding encountered");
                return null;
            }
            C0082b0 c0082b0 = new C0082b0(new xm0(qs0Var, i2), i2, (Serializable) r0, b3 == true ? 1 : 0);
            int i6 = i & 192;
            if (i6 != 0) {
                return new C1070lg(i6, iM4337o, c0082b0);
            }
            if (iM4337o == 3) {
                return new C0566dg(c0082b0);
            }
            if (iM4337o == 4) {
                return new C0676gg(c0082b0);
            }
            if (iM4337o == 8) {
                return new C0749ig(c0082b0);
            }
            if (iM4337o == 16) {
                C0749ig c0749ig = new C0749ig(b2 == true ? 1 : 0);
                c0749ig.f5013b = c0082b0;
                return c0749ig;
            }
            if (iM4337o != 17) {
                f40.m2712h(Integer.toHexString(iM4337o), "unknown BER object encountered: 0x");
                return null;
            }
            C0749ig c0749ig2 = new C0749ig(i3);
            c0749ig2.f5013b = c0082b0;
            return c0749ig2;
        }
        h10 h10Var = new h10(qs0Var, iM4336j, i2);
        if ((i & 224) == 0) {
            if (iM4337o == 3) {
                return new C1606xw(h10Var);
            }
            if (iM4337o == 4) {
                C0676gg c0676gg = new C0676gg();
                c0676gg.f4185b = h10Var;
                return c0676gg;
            }
            if (iM4337o == 8) {
                throw new C0810k("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iM4337o == 16) {
                throw new C0810k("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iM4337o == 17) {
                throw new C0810k("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return C1090m.m4333d(iM4337o, h10Var, r0);
            } catch (IllegalArgumentException e) {
                throw new C0810k(e, "corrupted stream detected");
            }
        }
        C0082b0 c0082b1 = new C0082b0(h10Var, h10Var.f9571b, (Serializable) r0, b == true ? 1 : 0);
        int i7 = i & 192;
        if (i7 != 0) {
            return new C0078ax(i7, iM4337o, (i & 32) != 0, c0082b1);
        }
        if (iM4337o == 3) {
            return new C0566dg(c0082b1);
        }
        if (iM4337o == 4) {
            return new C0676gg(c0082b1);
        }
        if (iM4337o == 8) {
            return new C0749ig(c0082b1);
        }
        if (iM4337o == 16) {
            C0749ig c0749ig3 = new C0749ig(i5);
            c0749ig3.f5013b = c0082b1;
            return c0749ig3;
        }
        if (iM4337o != 17) {
            f40.m2712h(Integer.toHexString(iM4337o), "unknown DL object encountered: 0x");
            return null;
        }
        C0749ig c0749ig4 = new C0749ig(i4);
        c0749ig4.f5013b = c0082b1;
        return c0749ig4;
    }

    /* JADX INFO: renamed from: j */
    public boolean m808j() {
        ColorStateList colorStateList;
        return ((Shader) this.f1104c) == null && (colorStateList = (ColorStateList) this.f1105d) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: k */
    public void m809k(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1104c;
        Context context = imageView.getContext();
        int[] iArr = ki1.f5851f;
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        i72.m3377i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c1174o9M4734Q.f7699b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = hr1.m3282r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                x30.m6864a(drawable);
            }
            if (typedArray.hasValue(2)) {
                jm0.m3671c(imageView, c1174o9M4734Q.m4774w(2));
            }
            if (typedArray.hasValue(3)) {
                jm0.m3672d(imageView, x30.m6865b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c1174o9M4734Q.m4753T();
        }
    }

    /* JADX INFO: renamed from: l */
    public C0827kg m810l(int i, int i2) throws IOException {
        C0733i c0733iM812o = m812o();
        int i3 = c0733iM812o.f4753c;
        if (i3 == 1) {
            return new C0827kg(3, i, i2, c0733iM812o.m3325c(0), 0);
        }
        C0713hg c0713hg = AbstractC0602eg.f3330a;
        return new C0827kg(4, i, i2, i3 < 1 ? AbstractC0602eg.f3330a : new C0713hg(c0733iM812o), 0);
    }

    /* JADX INFO: renamed from: n */
    public void m811n(Object obj, Object obj2) {
        int i = (this.f1103b + 1) * 2;
        Object[] objArr = (Object[]) this.f1104c;
        if (i > objArr.length) {
            this.f1104c = Arrays.copyOf(objArr, km0.m3900f(objArr.length, i));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.f1104c;
        int i2 = this.f1103b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f1103b = i2 + 1;
    }

    /* JADX INFO: renamed from: o */
    public C0733i m812o() throws IOException {
        qs0 qs0Var = (qs0) this.f1104c;
        int i = qs0Var.read();
        if (i < 0) {
            return new C0733i(0);
        }
        C0733i c0733i = new C0733i();
        do {
            InterfaceC0696h interfaceC0696hM807i = m807i(i);
            c0733i.m3324b(interfaceC0696hM807i instanceof wm0 ? ((wm0) interfaceC0696hM807i).mo735h() : interfaceC0696hM807i.mo696b());
            i = qs0Var.read();
        } while (i >= 0);
        return c0733i;
    }

    /* JADX INFO: renamed from: p */
    public void m813p() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.f1104c;
            short s = sArr[i];
            sArr[i] = (short) (s - ((short) (((short) ((20159 * s) >> 26)) * 3329)));
        }
    }

    public String toString() {
        switch (this.f1102a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.f1104c);
                sb.append("://");
                int i = -1;
                if (((String) this.f1105d).indexOf(58) != -1) {
                    sb.append('[');
                    sb.append((String) this.f1105d);
                    sb.append(']');
                } else {
                    sb.append((String) this.f1105d);
                }
                int i2 = this.f1103b;
                if (i2 == -1) {
                    String str = (String) this.f1104c;
                    if (str.equals("http")) {
                        i2 = 80;
                    } else {
                        i2 = str.equals("https") ? 443 : -1;
                    }
                }
                String str2 = (String) this.f1104c;
                if (str2.equals("http")) {
                    i = 80;
                } else if (str2.equals("https")) {
                    i = 443;
                }
                if (i2 != i) {
                    sb.append(':');
                    sb.append(i2);
                }
                return sb.toString();
            case 6:
                StringBuffer stringBuffer = new StringBuffer("[");
                int i3 = 0;
                while (true) {
                    short[] sArr = (short[]) this.f1104c;
                    if (i3 >= sArr.length) {
                        stringBuffer.append("]");
                        return stringBuffer.toString();
                    }
                    stringBuffer.append((int) sArr[i3]);
                    if (i3 != ((short[]) this.f1104c).length - 1) {
                        stringBuffer.append(", ");
                    }
                    i3++;
                }
                break;
            case 8:
                String str3 = (String) this.f1105d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((ph1) this.f1104c) == ph1.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb2.append(' ');
                sb2.append(this.f1103b);
                sb2.append(' ');
                sb2.append(str3);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0604ei
    /* JADX INFO: renamed from: y */
    public void mo814y() {
        dc1 dc1Var = (dc1) this.f1105d;
        byte[] bArr = z42.f13279f;
        dc1Var.getClass();
        dc1Var.m2314D(bArr.length, bArr);
    }

    public /* synthetic */ C0082b0(Object obj, int i, Serializable serializable, int i2) {
        this.f1102a = i2;
        this.f1104c = obj;
        this.f1103b = i;
        this.f1105d = serializable;
    }

    public C0082b0(ImageView imageView) {
        this.f1102a = 1;
        this.f1103b = 0;
        this.f1104c = imageView;
    }

    public C0082b0(l41 l41Var) {
        this.f1102a = 7;
        this.f1104c = new SparseArray();
        this.f1105d = l41Var;
        this.f1103b = -1;
    }

    public C0082b0(Shader shader, ColorStateList colorStateList, int i) {
        this.f1102a = 2;
        this.f1104c = shader;
        this.f1105d = colorStateList;
        this.f1103b = i;
    }

    public C0082b0(int i, y02 y02Var) {
        this.f1102a = 9;
        this.f1103b = i;
        this.f1104c = y02Var;
        this.f1105d = new dc1();
    }

    public C0082b0(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f1102a = 10;
        this.f1103b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f1104c = listUnmodifiableList;
        this.f1105d = bArr;
    }

    public C0082b0(int i) {
        this.f1102a = 4;
        this.f1104c = new Object[i * 2];
        this.f1103b = 0;
    }

    public C0082b0(p11 p11Var, z01 z01Var, int i, long j) {
        this.f1102a = 5;
        this.f1105d = p11Var;
        this.f1104c = z01Var;
        this.f1103b = i;
    }
}
