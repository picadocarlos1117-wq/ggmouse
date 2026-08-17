package p000;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;

/* JADX INFO: renamed from: jv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0805jv {

    /* JADX INFO: renamed from: A */
    public static final String f5535A;

    /* JADX INFO: renamed from: B */
    public static final String f5536B;

    /* JADX INFO: renamed from: C */
    public static final String f5537C;

    /* JADX INFO: renamed from: D */
    public static final String f5538D;

    /* JADX INFO: renamed from: E */
    public static final String f5539E;

    /* JADX INFO: renamed from: F */
    public static final String f5540F;

    /* JADX INFO: renamed from: G */
    public static final String f5541G;

    /* JADX INFO: renamed from: H */
    public static final String f5542H;

    /* JADX INFO: renamed from: I */
    public static final String f5543I;

    /* JADX INFO: renamed from: J */
    public static final String f5544J;

    /* JADX INFO: renamed from: r */
    public static final String f5545r;

    /* JADX INFO: renamed from: s */
    public static final String f5546s;

    /* JADX INFO: renamed from: t */
    public static final String f5547t;

    /* JADX INFO: renamed from: u */
    public static final String f5548u;

    /* JADX INFO: renamed from: v */
    public static final String f5549v;

    /* JADX INFO: renamed from: w */
    public static final String f5550w;

    /* JADX INFO: renamed from: x */
    public static final String f5551x;

    /* JADX INFO: renamed from: y */
    public static final String f5552y;

    /* JADX INFO: renamed from: z */
    public static final String f5553z;

    /* JADX INFO: renamed from: a */
    public final CharSequence f5554a;

    /* JADX INFO: renamed from: b */
    public final Layout.Alignment f5555b;

    /* JADX INFO: renamed from: c */
    public final Layout.Alignment f5556c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f5557d;

    /* JADX INFO: renamed from: e */
    public final float f5558e;

    /* JADX INFO: renamed from: f */
    public final int f5559f;

    /* JADX INFO: renamed from: g */
    public final int f5560g;

    /* JADX INFO: renamed from: h */
    public final float f5561h;

    /* JADX INFO: renamed from: i */
    public final int f5562i;

    /* JADX INFO: renamed from: j */
    public final float f5563j;

    /* JADX INFO: renamed from: k */
    public final float f5564k;

    /* JADX INFO: renamed from: l */
    public final boolean f5565l;

    /* JADX INFO: renamed from: m */
    public final int f5566m;

    /* JADX INFO: renamed from: n */
    public final int f5567n;

    /* JADX INFO: renamed from: o */
    public final float f5568o;

    /* JADX INFO: renamed from: p */
    public final int f5569p;

    /* JADX INFO: renamed from: q */
    public final float f5570q;

    static {
        new C0805jv("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE);
        int i = z42.f13274a;
        f5545r = Integer.toString(0, 36);
        f5546s = Integer.toString(17, 36);
        f5547t = Integer.toString(1, 36);
        f5548u = Integer.toString(2, 36);
        f5549v = Integer.toString(3, 36);
        f5550w = Integer.toString(18, 36);
        f5551x = Integer.toString(4, 36);
        f5552y = Integer.toString(5, 36);
        f5553z = Integer.toString(6, 36);
        f5535A = Integer.toString(7, 36);
        f5536B = Integer.toString(8, 36);
        f5537C = Integer.toString(9, 36);
        f5538D = Integer.toString(10, 36);
        f5539E = Integer.toString(11, 36);
        f5540F = Integer.toString(12, 36);
        f5541G = Integer.toString(13, 36);
        f5542H = Integer.toString(14, 36);
        f5543I = Integer.toString(15, 36);
        f5544J = Integer.toString(16, 36);
    }

    public C0805jv(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            ki0.m3857c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f5554a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f5554a = charSequence.toString();
        } else {
            this.f5554a = null;
        }
        this.f5555b = alignment;
        this.f5556c = alignment2;
        this.f5557d = bitmap;
        this.f5558e = f;
        this.f5559f = i;
        this.f5560g = i2;
        this.f5561h = f2;
        this.f5562i = i3;
        this.f5563j = f4;
        this.f5564k = f5;
        this.f5565l = z;
        this.f5566m = i5;
        this.f5567n = i4;
        this.f5568o = f3;
        this.f5569p = i6;
        this.f5570q = f6;
    }

    /* JADX INFO: renamed from: a */
    public final C0767iv m3713a() {
        C0767iv c0767iv = new C0767iv();
        c0767iv.f5164a = this.f5554a;
        c0767iv.f5165b = this.f5557d;
        c0767iv.f5166c = this.f5555b;
        c0767iv.f5167d = this.f5556c;
        c0767iv.f5168e = this.f5558e;
        c0767iv.f5169f = this.f5559f;
        c0767iv.f5170g = this.f5560g;
        c0767iv.f5171h = this.f5561h;
        c0767iv.f5172i = this.f5562i;
        c0767iv.f5173j = this.f5567n;
        c0767iv.f5174k = this.f5568o;
        c0767iv.f5175l = this.f5563j;
        c0767iv.f5176m = this.f5564k;
        c0767iv.f5177n = this.f5565l;
        c0767iv.f5178o = this.f5566m;
        c0767iv.f5179p = this.f5569p;
        c0767iv.f5180q = this.f5570q;
        return c0767iv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0805jv.class == obj.getClass()) {
            C0805jv c0805jv = (C0805jv) obj;
            if (TextUtils.equals(this.f5554a, c0805jv.f5554a) && this.f5555b == c0805jv.f5555b && this.f5556c == c0805jv.f5556c) {
                Bitmap bitmap = c0805jv.f5557d;
                Bitmap bitmap2 = this.f5557d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f5558e == c0805jv.f5558e && this.f5559f == c0805jv.f5559f && this.f5560g == c0805jv.f5560g && this.f5561h == c0805jv.f5561h && this.f5562i == c0805jv.f5562i && this.f5563j == c0805jv.f5563j && this.f5564k == c0805jv.f5564k && this.f5565l == c0805jv.f5565l && this.f5566m == c0805jv.f5566m && this.f5567n == c0805jv.f5567n && this.f5568o == c0805jv.f5568o && this.f5569p == c0805jv.f5569p && this.f5570q == c0805jv.f5570q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5554a, this.f5555b, this.f5556c, this.f5557d, Float.valueOf(this.f5558e), Integer.valueOf(this.f5559f), Integer.valueOf(this.f5560g), Float.valueOf(this.f5561h), Integer.valueOf(this.f5562i), Float.valueOf(this.f5563j), Float.valueOf(this.f5564k), Boolean.valueOf(this.f5565l), Integer.valueOf(this.f5566m), Integer.valueOf(this.f5567n), Float.valueOf(this.f5568o), Integer.valueOf(this.f5569p), Float.valueOf(this.f5570q)});
    }
}
