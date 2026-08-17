package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: pp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1303pp {

    /* JADX INFO: renamed from: A */
    public CharSequence f8981A;

    /* JADX INFO: renamed from: B */
    public CharSequence f8982B;

    /* JADX INFO: renamed from: C */
    public boolean f8983C;

    /* JADX INFO: renamed from: E */
    public Bitmap f8985E;

    /* JADX INFO: renamed from: F */
    public float f8986F;

    /* JADX INFO: renamed from: G */
    public float f8987G;

    /* JADX INFO: renamed from: H */
    public float f8988H;

    /* JADX INFO: renamed from: I */
    public float f8989I;

    /* JADX INFO: renamed from: J */
    public float f8990J;

    /* JADX INFO: renamed from: K */
    public int f8991K;

    /* JADX INFO: renamed from: L */
    public int[] f8992L;

    /* JADX INFO: renamed from: M */
    public boolean f8993M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f8994N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f8995O;

    /* JADX INFO: renamed from: P */
    public TimeInterpolator f8996P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f8997Q;

    /* JADX INFO: renamed from: R */
    public float f8998R;

    /* JADX INFO: renamed from: S */
    public float f8999S;

    /* JADX INFO: renamed from: T */
    public float f9000T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f9001U;

    /* JADX INFO: renamed from: V */
    public float f9002V;

    /* JADX INFO: renamed from: W */
    public float f9003W;

    /* JADX INFO: renamed from: X */
    public float f9004X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f9005Y;

    /* JADX INFO: renamed from: Z */
    public float f9006Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f9007a;

    /* JADX INFO: renamed from: a0 */
    public float f9008a0;

    /* JADX INFO: renamed from: b */
    public float f9009b;

    /* JADX INFO: renamed from: b0 */
    public float f9010b0;

    /* JADX INFO: renamed from: c */
    public final Rect f9011c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f9012c0;

    /* JADX INFO: renamed from: d */
    public final Rect f9013d;

    /* JADX INFO: renamed from: e */
    public final RectF f9015e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f9022j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f9023k;

    /* JADX INFO: renamed from: l */
    public float f9024l;

    /* JADX INFO: renamed from: m */
    public float f9025m;

    /* JADX INFO: renamed from: n */
    public float f9026n;

    /* JADX INFO: renamed from: o */
    public float f9027o;

    /* JADX INFO: renamed from: p */
    public float f9028p;

    /* JADX INFO: renamed from: q */
    public float f9029q;

    /* JADX INFO: renamed from: r */
    public Typeface f9030r;

    /* JADX INFO: renamed from: s */
    public Typeface f9031s;

    /* JADX INFO: renamed from: t */
    public Typeface f9032t;

    /* JADX INFO: renamed from: u */
    public Typeface f9033u;

    /* JADX INFO: renamed from: v */
    public Typeface f9034v;

    /* JADX INFO: renamed from: w */
    public Typeface f9035w;

    /* JADX INFO: renamed from: x */
    public Typeface f9036x;

    /* JADX INFO: renamed from: y */
    public C0795jl f9037y;

    /* JADX INFO: renamed from: f */
    public int f9017f = 16;

    /* JADX INFO: renamed from: g */
    public int f9019g = 16;

    /* JADX INFO: renamed from: h */
    public float f9020h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f9021i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f9038z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f8984D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f9014d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f9016e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f9018f0 = 1;

    public C1303pp(TextInputLayout textInputLayout) {
        this.f9007a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f8994N = textPaint;
        this.f8995O = new TextPaint(textPaint);
        this.f9013d = new Rect();
        this.f9011c = new Rect();
        this.f9015e = new RectF();
        m5302g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m5296a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: f */
    public static float m5297f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0779j6.m3568a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5298b(CharSequence charSequence) {
        WeakHashMap weakHashMap = i72.f4849a;
        boolean z = t62.m6240d(this.f9007a) == 1;
        if (this.f8984D) {
            return (z ? pz1.f9244d : pz1.f9243c).m4553e(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m5299c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f8981A == null) {
            return;
        }
        float fWidth = this.f9013d.width();
        float fWidth2 = this.f9011c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f9021i;
            f3 = this.f9002V;
            this.f8986F = 1.0f;
            typeface = this.f9030r;
        } else {
            float f4 = this.f9020h;
            float f5 = this.f9003W;
            Typeface typeface2 = this.f9033u;
            if (Math.abs(f - TouchPipeline.SIZE) < 1.0E-5f) {
                this.f8986F = 1.0f;
            } else {
                this.f8986F = m5297f(this.f9020h, this.f9021i, f, this.f8997Q) / this.f9020h;
            }
            float f6 = this.f9021i / this.f9020h;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f8994N;
        if (fWidth > TouchPipeline.SIZE) {
            boolean z3 = this.f8987G != f2;
            boolean z4 = this.f9004X != f3;
            boolean z5 = this.f9036x != typeface;
            StaticLayout staticLayout = this.f9005Y;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f8993M;
            this.f8987G = f2;
            this.f9004X = f3;
            this.f9036x = typeface;
            this.f8993M = false;
            textPaint.setLinearText(this.f8986F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f8982B == null || z2) {
            textPaint.setTextSize(this.f8987G);
            textPaint.setTypeface(this.f9036x);
            textPaint.setLetterSpacing(this.f9004X);
            boolean zM5298b = m5298b(this.f8981A);
            this.f8983C = zM5298b;
            int i = this.f9014d0;
            if (i <= 1 || zM5298b) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f9017f, zM5298b ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z7 = this.f8983C;
                    if (absoluteGravity != 5) {
                        alignment = z7 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = z7 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            CharSequence charSequenceEllipsize = this.f8981A;
            int i2 = (int) fWidth;
            int length = charSequenceEllipsize.length();
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            if (charSequenceEllipsize == null) {
                charSequenceEllipsize = "";
            }
            int iMax = Math.max(0, i2);
            TextUtils.TruncateAt truncateAt = this.f9038z;
            if (i == 1) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, truncateAt);
            }
            int iMin = Math.min(charSequenceEllipsize.length(), length);
            if (zM5298b && i == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(alignment);
            builderObtain.setIncludePad(false);
            builderObtain.setTextDirection(zM5298b ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(i);
            float f7 = this.f9016e0;
            if (f7 != 1.0f) {
                builderObtain.setLineSpacing(TouchPipeline.SIZE, f7);
            }
            if (i > 1) {
                builderObtain.setHyphenationFrequency(this.f9018f0);
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            staticLayoutBuild.getClass();
            this.f9005Y = staticLayoutBuild;
            this.f8982B = staticLayoutBuild.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m5300d() {
        float f = this.f9021i;
        TextPaint textPaint = this.f8995O;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f9030r);
        textPaint.setLetterSpacing(this.f9002V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m5301e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f8992L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m5302g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f9032t;
            if (typeface != null) {
                this.f9031s = hr1.m3252C(configuration, typeface);
            }
            Typeface typeface2 = this.f9035w;
            if (typeface2 != null) {
                this.f9034v = hr1.m3252C(configuration, typeface2);
            }
            Typeface typeface3 = this.f9031s;
            if (typeface3 == null) {
                typeface3 = this.f9032t;
            }
            this.f9030r = typeface3;
            Typeface typeface4 = this.f9034v;
            if (typeface4 == null) {
                typeface4 = this.f9035w;
            }
            this.f9033u = typeface4;
            m5303h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5303h(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f9007a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m5299c(1.0f, z);
        CharSequence charSequence = this.f8982B;
        TextPaint textPaint = this.f8994N;
        if (charSequence != null && (staticLayout = this.f9005Y) != null) {
            this.f9012c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f9038z);
        }
        CharSequence charSequence2 = this.f9012c0;
        if (charSequence2 != null) {
            this.f9006Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f9006Z = TouchPipeline.SIZE;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f9019g, this.f8983C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f9013d;
        if (i == 48) {
            this.f9025m = rect.top;
        } else if (i != 80) {
            this.f9025m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f9025m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f9027o = rect.centerX() - (this.f9006Z / 2.0f);
        } else if (i2 != 5) {
            this.f9027o = rect.left;
        } else {
            this.f9027o = rect.right - this.f9006Z;
        }
        m5299c(TouchPipeline.SIZE, z);
        StaticLayout staticLayout2 = this.f9005Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f9005Y;
        if (staticLayout3 == null || this.f9014d0 <= 1) {
            CharSequence charSequence3 = this.f8982B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f9005Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f9017f, this.f8983C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f9011c;
        if (i3 == 48) {
            this.f9024l = rect2.top;
        } else if (i3 != 80) {
            this.f9024l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f9024l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f9026n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f9026n = rect2.left;
        } else {
            this.f9026n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f8985E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f8985E = null;
        }
        m5307l(this.f9009b);
        float f = this.f9009b;
        float fM5297f = m5297f(rect2.left, rect.left, f, this.f8996P);
        RectF rectF = this.f9015e;
        rectF.left = fM5297f;
        rectF.top = m5297f(this.f9024l, this.f9025m, f, this.f8996P);
        rectF.right = m5297f(rect2.right, rect.right, f, this.f8996P);
        rectF.bottom = m5297f(rect2.bottom, rect.bottom, f, this.f8996P);
        this.f9028p = m5297f(this.f9026n, this.f9027o, f, this.f8996P);
        this.f9029q = m5297f(this.f9024l, this.f9025m, f, this.f8996P);
        m5307l(f);
        p90 p90Var = AbstractC0779j6.f5285b;
        this.f9008a0 = 1.0f - m5297f(TouchPipeline.SIZE, 1.0f, 1.0f - f, p90Var);
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5990k(textInputLayout);
        this.f9010b0 = m5297f(1.0f, TouchPipeline.SIZE, f, p90Var);
        s62.m5990k(textInputLayout);
        ColorStateList colorStateList = this.f9023k;
        ColorStateList colorStateList2 = this.f9022j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m5296a(f, m5301e(colorStateList2), m5301e(this.f9023k)));
        } else {
            textPaint.setColor(m5301e(colorStateList));
        }
        float f2 = this.f9002V;
        float f3 = this.f9003W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m5297f(f3, f2, f, p90Var));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f8988H = AbstractC0779j6.m3568a(TouchPipeline.SIZE, this.f8998R, f);
        this.f8989I = AbstractC0779j6.m3568a(TouchPipeline.SIZE, this.f8999S, f);
        this.f8990J = AbstractC0779j6.m3568a(TouchPipeline.SIZE, this.f9000T, f);
        int iM5296a = m5296a(f, 0, m5301e(this.f9001U));
        this.f8991K = iM5296a;
        textPaint.setShadowLayer(this.f8988H, this.f8989I, this.f8990J, iM5296a);
        s62.m5990k(textInputLayout);
    }

    /* JADX INFO: renamed from: i */
    public final void m5304i(ColorStateList colorStateList) {
        if (this.f9023k == colorStateList && this.f9022j == colorStateList) {
            return;
        }
        this.f9023k = colorStateList;
        this.f9022j = colorStateList;
        m5303h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5305j(Typeface typeface) {
        C0795jl c0795jl = this.f9037y;
        if (c0795jl != null) {
            c0795jl.f5442k = true;
        }
        if (this.f9032t == typeface) {
            return false;
        }
        this.f9032t = typeface;
        Typeface typefaceM3252C = hr1.m3252C(this.f9007a.getContext().getResources().getConfiguration(), typeface);
        this.f9031s = typefaceM3252C;
        if (typefaceM3252C == null) {
            typefaceM3252C = this.f9032t;
        }
        this.f9030r = typefaceM3252C;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m5306k(float f) {
        if (f < TouchPipeline.SIZE) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f9009b) {
            this.f9009b = f;
            Rect rect = this.f9011c;
            float f2 = rect.left;
            Rect rect2 = this.f9013d;
            float fM5297f = m5297f(f2, rect2.left, f, this.f8996P);
            RectF rectF = this.f9015e;
            rectF.left = fM5297f;
            rectF.top = m5297f(this.f9024l, this.f9025m, f, this.f8996P);
            rectF.right = m5297f(rect.right, rect2.right, f, this.f8996P);
            rectF.bottom = m5297f(rect.bottom, rect2.bottom, f, this.f8996P);
            this.f9028p = m5297f(this.f9026n, this.f9027o, f, this.f8996P);
            this.f9029q = m5297f(this.f9024l, this.f9025m, f, this.f8996P);
            m5307l(f);
            p90 p90Var = AbstractC0779j6.f5285b;
            this.f9008a0 = 1.0f - m5297f(TouchPipeline.SIZE, 1.0f, 1.0f - f, p90Var);
            WeakHashMap weakHashMap = i72.f4849a;
            TextInputLayout textInputLayout = this.f9007a;
            s62.m5990k(textInputLayout);
            this.f9010b0 = m5297f(1.0f, TouchPipeline.SIZE, f, p90Var);
            s62.m5990k(textInputLayout);
            ColorStateList colorStateList = this.f9023k;
            ColorStateList colorStateList2 = this.f9022j;
            TextPaint textPaint = this.f8994N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m5296a(f, m5301e(colorStateList2), m5301e(this.f9023k)));
            } else {
                textPaint.setColor(m5301e(colorStateList));
            }
            float f3 = this.f9002V;
            float f4 = this.f9003W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m5297f(f4, f3, f, p90Var));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f8988H = AbstractC0779j6.m3568a(TouchPipeline.SIZE, this.f8998R, f);
            this.f8989I = AbstractC0779j6.m3568a(TouchPipeline.SIZE, this.f8999S, f);
            this.f8990J = AbstractC0779j6.m3568a(TouchPipeline.SIZE, this.f9000T, f);
            int iM5296a = m5296a(f, 0, m5301e(this.f9001U));
            this.f8991K = iM5296a;
            textPaint.setShadowLayer(this.f8988H, this.f8989I, this.f8990J, iM5296a);
            s62.m5990k(textInputLayout);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5307l(float f) {
        m5299c(f, false);
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5990k(this.f9007a);
    }

    /* JADX INFO: renamed from: m */
    public final void m5308m(Typeface typeface) {
        boolean z;
        boolean zM5305j = m5305j(typeface);
        if (this.f9035w != typeface) {
            this.f9035w = typeface;
            Typeface typefaceM3252C = hr1.m3252C(this.f9007a.getContext().getResources().getConfiguration(), typeface);
            this.f9034v = typefaceM3252C;
            if (typefaceM3252C == null) {
                typefaceM3252C = this.f9035w;
            }
            this.f9033u = typefaceM3252C;
            z = true;
        } else {
            z = false;
        }
        if (zM5305j || z) {
            m5303h(false);
        }
    }
}
