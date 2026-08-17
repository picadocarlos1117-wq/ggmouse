package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: ln */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1077ln extends zz0 implements Drawable.Callback {

    /* JADX INFO: renamed from: K0 */
    public static final int[] f6390K0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: L0 */
    public static final ShapeDrawable f6391L0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    public PorterDuffColorFilter f6392A0;

    /* JADX INFO: renamed from: B0 */
    public ColorStateList f6393B0;

    /* JADX INFO: renamed from: C */
    public ColorStateList f6394C;

    /* JADX INFO: renamed from: C0 */
    public PorterDuff.Mode f6395C0;

    /* JADX INFO: renamed from: D */
    public ColorStateList f6396D;

    /* JADX INFO: renamed from: D0 */
    public int[] f6397D0;

    /* JADX INFO: renamed from: E */
    public float f6398E;

    /* JADX INFO: renamed from: E0 */
    public ColorStateList f6399E0;

    /* JADX INFO: renamed from: F */
    public float f6400F;

    /* JADX INFO: renamed from: F0 */
    public WeakReference f6401F0;

    /* JADX INFO: renamed from: G */
    public ColorStateList f6402G;

    /* JADX INFO: renamed from: G0 */
    public TextUtils.TruncateAt f6403G0;

    /* JADX INFO: renamed from: H */
    public float f6404H;

    /* JADX INFO: renamed from: H0 */
    public boolean f6405H0;

    /* JADX INFO: renamed from: I */
    public ColorStateList f6406I;

    /* JADX INFO: renamed from: I0 */
    public int f6407I0;

    /* JADX INFO: renamed from: J */
    public CharSequence f6408J;

    /* JADX INFO: renamed from: J0 */
    public boolean f6409J0;

    /* JADX INFO: renamed from: K */
    public boolean f6410K;

    /* JADX INFO: renamed from: L */
    public Drawable f6411L;

    /* JADX INFO: renamed from: M */
    public ColorStateList f6412M;

    /* JADX INFO: renamed from: N */
    public float f6413N;

    /* JADX INFO: renamed from: O */
    public boolean f6414O;

    /* JADX INFO: renamed from: P */
    public boolean f6415P;

    /* JADX INFO: renamed from: Q */
    public Drawable f6416Q;

    /* JADX INFO: renamed from: R */
    public RippleDrawable f6417R;

    /* JADX INFO: renamed from: S */
    public ColorStateList f6418S;

    /* JADX INFO: renamed from: T */
    public float f6419T;

    /* JADX INFO: renamed from: U */
    public SpannableStringBuilder f6420U;

    /* JADX INFO: renamed from: V */
    public boolean f6421V;

    /* JADX INFO: renamed from: W */
    public boolean f6422W;

    /* JADX INFO: renamed from: X */
    public Drawable f6423X;

    /* JADX INFO: renamed from: Y */
    public ColorStateList f6424Y;

    /* JADX INFO: renamed from: Z */
    public h61 f6425Z;

    /* JADX INFO: renamed from: a0 */
    public h61 f6426a0;

    /* JADX INFO: renamed from: b0 */
    public float f6427b0;

    /* JADX INFO: renamed from: c0 */
    public float f6428c0;

    /* JADX INFO: renamed from: d0 */
    public float f6429d0;

    /* JADX INFO: renamed from: e0 */
    public float f6430e0;

    /* JADX INFO: renamed from: f0 */
    public float f6431f0;

    /* JADX INFO: renamed from: g0 */
    public float f6432g0;

    /* JADX INFO: renamed from: h0 */
    public float f6433h0;

    /* JADX INFO: renamed from: i0 */
    public float f6434i0;

    /* JADX INFO: renamed from: j0 */
    public final Context f6435j0;

    /* JADX INFO: renamed from: k0 */
    public final Paint f6436k0;

    /* JADX INFO: renamed from: l0 */
    public final Paint.FontMetrics f6437l0;

    /* JADX INFO: renamed from: m0 */
    public final RectF f6438m0;

    /* JADX INFO: renamed from: n0 */
    public final PointF f6439n0;

    /* JADX INFO: renamed from: o0 */
    public final Path f6440o0;

    /* JADX INFO: renamed from: p0 */
    public final qz1 f6441p0;

    /* JADX INFO: renamed from: q0 */
    public int f6442q0;

    /* JADX INFO: renamed from: r0 */
    public int f6443r0;

    /* JADX INFO: renamed from: s0 */
    public int f6444s0;

    /* JADX INFO: renamed from: t0 */
    public int f6445t0;

    /* JADX INFO: renamed from: u0 */
    public int f6446u0;

    /* JADX INFO: renamed from: v0 */
    public int f6447v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f6448w0;

    /* JADX INFO: renamed from: x0 */
    public int f6449x0;

    /* JADX INFO: renamed from: y0 */
    public int f6450y0;

    /* JADX INFO: renamed from: z0 */
    public ColorFilter f6451z0;

    public C1077ln(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sousasantoslogic.sspro.R.attr.chipStyle, com.sousasantoslogic.sspro.R.style.Widget_MaterialComponents_Chip_Action);
        this.f6400F = -1.0f;
        this.f6436k0 = new Paint(1);
        this.f6437l0 = new Paint.FontMetrics();
        this.f6438m0 = new RectF();
        this.f6439n0 = new PointF();
        this.f6440o0 = new Path();
        this.f6450y0 = 255;
        this.f6395C0 = PorterDuff.Mode.SRC_IN;
        this.f6401F0 = new WeakReference(null);
        m7397h(context);
        this.f6435j0 = context;
        qz1 qz1Var = new qz1(this);
        this.f6441p0 = qz1Var;
        this.f6408J = "";
        qz1Var.f9633a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f6390K0;
        setState(iArr);
        if (!Arrays.equals(this.f6397D0, iArr)) {
            this.f6397D0 = iArr;
            if (m4248T()) {
                m4255v(getState(), iArr);
            }
        }
        this.f6405H0 = true;
        f6391L0.setTint(-1);
    }

    /* JADX INFO: renamed from: U */
    public static void m4226U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4227s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m4228t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m4229A(float f) {
        if (this.f6400F != f) {
            this.f6400F = f;
            or1 or1VarM5313e = this.f13626a.f13172a.m5313e();
            or1VarM5313e.f8429e = new C0811k0(f);
            or1VarM5313e.f8430f = new C0811k0(f);
            or1VarM5313e.f8431g = new C0811k0(f);
            or1VarM5313e.f8432h = new C0811k0(f);
            setShapeAppearanceModel(or1VarM5313e.m5050a());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m4230B(Drawable drawable) {
        Drawable drawable2 = this.f6411L;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM4251p = m4251p();
            this.f6411L = drawable != null ? drawable.mutate() : null;
            float fM4251p2 = m4251p();
            m4226U(drawable2);
            if (m4247S()) {
                m4249n(this.f6411L);
            }
            invalidateSelf();
            if (fM4251p != fM4251p2) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m4231C(float f) {
        if (this.f6413N != f) {
            float fM4251p = m4251p();
            this.f6413N = f;
            float fM4251p2 = m4251p();
            invalidateSelf();
            if (fM4251p != fM4251p2) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4232D(ColorStateList colorStateList) {
        this.f6414O = true;
        if (this.f6412M != colorStateList) {
            this.f6412M = colorStateList;
            if (m4247S()) {
                v30.m6560h(this.f6411L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4233E(boolean z) {
        if (this.f6410K != z) {
            boolean zM4247S = m4247S();
            this.f6410K = z;
            boolean zM4247S2 = m4247S();
            if (zM4247S != zM4247S2) {
                Drawable drawable = this.f6411L;
                if (zM4247S2) {
                    m4249n(drawable);
                } else {
                    m4226U(drawable);
                }
                invalidateSelf();
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m4234F(ColorStateList colorStateList) {
        if (this.f6402G != colorStateList) {
            this.f6402G = colorStateList;
            if (this.f6409J0) {
                yz0 yz0Var = this.f13626a;
                if (yz0Var.f13175d != colorStateList) {
                    yz0Var.f13175d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4235G(float f) {
        if (this.f6404H != f) {
            this.f6404H = f;
            this.f6436k0.setStrokeWidth(f);
            if (this.f6409J0) {
                this.f13626a.f13181j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4236H(Drawable drawable) {
        Drawable drawable2 = this.f6416Q;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM4252q = m4252q();
            this.f6416Q = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.f6406I;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.f6417R = new RippleDrawable(colorStateListValueOf, this.f6416Q, f6391L0);
            float fM4252q2 = m4252q();
            m4226U(drawable2);
            if (m4248T()) {
                m4249n(this.f6416Q);
            }
            invalidateSelf();
            if (fM4252q != fM4252q2) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m4237I(float f) {
        if (this.f6433h0 != f) {
            this.f6433h0 = f;
            invalidateSelf();
            if (m4248T()) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m4238J(float f) {
        if (this.f6419T != f) {
            this.f6419T = f;
            invalidateSelf();
            if (m4248T()) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4239K(float f) {
        if (this.f6432g0 != f) {
            this.f6432g0 = f;
            invalidateSelf();
            if (m4248T()) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m4240L(ColorStateList colorStateList) {
        if (this.f6418S != colorStateList) {
            this.f6418S = colorStateList;
            if (m4248T()) {
                v30.m6560h(this.f6416Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4241M(boolean z) {
        if (this.f6415P != z) {
            boolean zM4248T = m4248T();
            this.f6415P = z;
            boolean zM4248T2 = m4248T();
            if (zM4248T != zM4248T2) {
                Drawable drawable = this.f6416Q;
                if (zM4248T2) {
                    m4249n(drawable);
                } else {
                    m4226U(drawable);
                }
                invalidateSelf();
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m4242N(float f) {
        if (this.f6429d0 != f) {
            float fM4251p = m4251p();
            this.f6429d0 = f;
            float fM4251p2 = m4251p();
            invalidateSelf();
            if (fM4251p != fM4251p2) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m4243O(float f) {
        if (this.f6428c0 != f) {
            float fM4251p = m4251p();
            this.f6428c0 = f;
            float fM4251p2 = m4251p();
            invalidateSelf();
            if (fM4251p != fM4251p2) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m4244P(ColorStateList colorStateList) {
        if (this.f6406I != colorStateList) {
            this.f6406I = colorStateList;
            this.f6399E0 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m4245Q(oz1 oz1Var) {
        qz1 qz1Var = this.f6441p0;
        C0756in c0756in = qz1Var.f9634b;
        TextPaint textPaint = qz1Var.f9633a;
        if (qz1Var.f9638f != oz1Var) {
            qz1Var.f9638f = oz1Var;
            if (oz1Var != null) {
                Context context = this.f6435j0;
                oz1Var.m5093f(context, textPaint, c0756in);
                C1077ln c1077ln = (C1077ln) qz1Var.f9637e.get();
                if (c1077ln != null) {
                    textPaint.drawableState = c1077ln.getState();
                }
                oz1Var.m5092e(context, textPaint, c0756in);
                qz1Var.f9636d = true;
            }
            C1077ln c1077ln2 = (C1077ln) qz1Var.f9637e.get();
            if (c1077ln2 != null) {
                c1077ln2.m4254u();
                c1077ln2.invalidateSelf();
                c1077ln2.onStateChange(c1077ln2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4246R() {
        return this.f6422W && this.f6423X != null && this.f6448w0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m4247S() {
        return this.f6410K && this.f6411L != null;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4248T() {
        return this.f6415P && this.f6416Q != null;
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f6450y0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f6409J0;
        Paint paint = this.f6436k0;
        RectF rectF = this.f6438m0;
        if (!z) {
            paint.setColor(this.f6442q0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m4253r(), m4253r(), paint);
        }
        if (!this.f6409J0) {
            paint.setColor(this.f6443r0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f6451z0;
            if (colorFilter == null) {
                colorFilter = this.f6392A0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m4253r(), m4253r(), paint);
        }
        if (this.f6409J0) {
            super.draw(canvas);
        }
        if (this.f6404H > TouchPipeline.SIZE && !this.f6409J0) {
            paint.setColor(this.f6445t0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f6409J0) {
                ColorFilter colorFilter2 = this.f6451z0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f6392A0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f6404H / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f6400F - (this.f6404H / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f6446u0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f6409J0) {
            RectF rectF2 = new RectF(bounds);
            yz0 yz0Var = this.f13626a;
            pr1 pr1Var = yz0Var.f13172a;
            float f4 = yz0Var.f13180i;
            pn0 pn0Var = this.f13642v;
            d31 d31Var = this.f13643w;
            Path path = this.f6440o0;
            d31Var.m2208b(pr1Var, f4, rectF2, pn0Var, path);
            m7394d(canvas2, paint, path, this.f13626a.f13172a, m7395f());
        } else {
            canvas2.drawRoundRect(rectF, m4253r(), m4253r(), paint);
        }
        if (m4247S()) {
            m4250o(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.f6411L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f6411L.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (m4246R()) {
            m4250o(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f6423X.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f6423X.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.f6405H0 && this.f6408J != null) {
            PointF pointF = this.f6439n0;
            pointF.set(TouchPipeline.SIZE, TouchPipeline.SIZE);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f6408J;
            qz1 qz1Var = this.f6441p0;
            if (charSequence != null) {
                float fM4251p = m4251p() + this.f6427b0 + this.f6430e0;
                if (w30.m6698a(this) == 0) {
                    pointF.x = bounds.left + fM4251p;
                } else {
                    pointF.x = bounds.right - fM4251p;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = qz1Var.f9633a;
                Paint.FontMetrics fontMetrics = this.f6437l0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f6408J != null) {
                float fM4251p2 = m4251p() + this.f6427b0 + this.f6430e0;
                float fM4252q = m4252q() + this.f6434i0 + this.f6431f0;
                int iM6698a = w30.m6698a(this);
                int i3 = bounds.left;
                if (iM6698a == 0) {
                    rectF.left = i3 + fM4251p2;
                    rectF.right = bounds.right - fM4252q;
                } else {
                    rectF.left = i3 + fM4252q;
                    rectF.right = bounds.right - fM4251p2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            oz1 oz1Var = qz1Var.f9638f;
            TextPaint textPaint2 = qz1Var.f9633a;
            if (oz1Var != null) {
                textPaint2.drawableState = getState();
                qz1Var.f9638f.m5092e(this.f6435j0, textPaint2, qz1Var.f9634b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(qz1Var.m5630a(this.f6408J.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f6408J;
            if (z2 && this.f6403G0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f6403G0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m4248T()) {
            rectF.setEmpty();
            if (m4248T()) {
                float f9 = this.f6434i0 + this.f6433h0;
                if (w30.m6698a(this) == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.f6419T;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.f6419T;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.f6419T;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f6416Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f6417R.setBounds(this.f6416Q.getBounds());
            this.f6417R.jumpToCurrentState();
            this.f6417R.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f6450y0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f6450y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f6451z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f6398E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m4252q() + this.f6441p0.m5630a(this.f6408J.toString()) + m4251p() + this.f6427b0 + this.f6430e0 + this.f6431f0 + this.f6434i0), this.f6407I0);
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f6409J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f6398E, this.f6400F);
        } else {
            outline.setRoundRect(bounds, this.f6400F);
            outline2 = outline;
        }
        outline2.setAlpha(this.f6450y0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m4227s(this.f6394C) || m4227s(this.f6396D) || m4227s(this.f6402G)) {
            return true;
        }
        oz1 oz1Var = this.f6441p0.f9638f;
        if (oz1Var == null || (colorStateList = oz1Var.f8598j) == null || !colorStateList.isStateful()) {
            return (this.f6422W && this.f6423X != null && this.f6421V) || m4228t(this.f6411L) || m4228t(this.f6423X) || m4227s(this.f6393B0);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m4249n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        w30.m6699b(drawable, w30.m6698a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f6416Q) {
            if (drawable.isStateful()) {
                drawable.setState(this.f6397D0);
            }
            v30.m6560h(drawable, this.f6418S);
            return;
        }
        Drawable drawable2 = this.f6411L;
        if (drawable == drawable2 && this.f6414O) {
            v30.m6560h(drawable2, this.f6412M);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4250o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m4247S() || m4246R()) {
            float f = this.f6427b0 + this.f6428c0;
            Drawable drawable = this.f6448w0 ? this.f6423X : this.f6411L;
            float intrinsicWidth = this.f6413N;
            if (intrinsicWidth <= TouchPipeline.SIZE && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (w30.m6698a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f6448w0 ? this.f6423X : this.f6411L;
            float fCeil = this.f6413N;
            if (fCeil <= TouchPipeline.SIZE && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.f6435j0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m4247S()) {
            zOnLayoutDirectionChanged |= w30.m6699b(this.f6411L, i);
        }
        if (m4246R()) {
            zOnLayoutDirectionChanged |= w30.m6699b(this.f6423X, i);
        }
        if (m4248T()) {
            zOnLayoutDirectionChanged |= w30.m6699b(this.f6416Q, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m4247S()) {
            zOnLevelChange |= this.f6411L.setLevel(i);
        }
        if (m4246R()) {
            zOnLevelChange |= this.f6423X.setLevel(i);
        }
        if (m4248T()) {
            zOnLevelChange |= this.f6416Q.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f6409J0) {
            super.onStateChange(iArr);
        }
        return m4255v(iArr, this.f6397D0);
    }

    /* JADX INFO: renamed from: p */
    public final float m4251p() {
        if (!m4247S() && !m4246R()) {
            return TouchPipeline.SIZE;
        }
        float f = this.f6428c0;
        Drawable drawable = this.f6448w0 ? this.f6423X : this.f6411L;
        float intrinsicWidth = this.f6413N;
        if (intrinsicWidth <= TouchPipeline.SIZE && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f6429d0;
    }

    /* JADX INFO: renamed from: q */
    public final float m4252q() {
        return m4248T() ? this.f6432g0 + this.f6419T + this.f6433h0 : TouchPipeline.SIZE;
    }

    /* JADX INFO: renamed from: r */
    public final float m4253r() {
        return this.f6409J0 ? this.f13626a.f13172a.f9050e.mo1128a(m7395f()) : this.f6400F;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f6450y0 != i) {
            this.f6450y0 = i;
            invalidateSelf();
        }
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f6451z0 != colorFilter) {
            this.f6451z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f6393B0 != colorStateList) {
            this.f6393B0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f6395C0 != mode) {
            this.f6395C0 = mode;
            ColorStateList colorStateList = this.f6393B0;
            this.f6392A0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m4247S()) {
            visible |= this.f6411L.setVisible(z, z2);
        }
        if (m4246R()) {
            visible |= this.f6423X.setVisible(z, z2);
        }
        if (m4248T()) {
            visible |= this.f6416Q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: u */
    public final void m4254u() {
        Chip chip = (Chip) this.f6401F0.get();
        if (chip != null) {
            chip.m1686b(chip.f2056u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4255v(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f6394C;
        int iM7392b = m7392b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f6442q0) : 0);
        boolean state = true;
        if (this.f6442q0 != iM7392b) {
            this.f6442q0 = iM7392b;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f6396D;
        int iM7392b2 = m7392b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f6443r0) : 0);
        if (this.f6443r0 != iM7392b2) {
            this.f6443r0 = iM7392b2;
            zOnStateChange = true;
        }
        int iM2113b = AbstractC0539cq.m2113b(iM7392b2, iM7392b);
        if ((this.f6444s0 != iM2113b) | (this.f13626a.f13174c == null)) {
            this.f6444s0 = iM2113b;
            m7399j(ColorStateList.valueOf(iM2113b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f6402G;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f6445t0) : 0;
        if (this.f6445t0 != colorForState) {
            this.f6445t0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f6399E0 == null || !ki0.m3856b0(iArr)) ? 0 : this.f6399E0.getColorForState(iArr, this.f6446u0);
        if (this.f6446u0 != colorForState2) {
            this.f6446u0 = colorForState2;
        }
        oz1 oz1Var = this.f6441p0.f9638f;
        int colorForState3 = (oz1Var == null || (colorStateList = oz1Var.f8598j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f6447v0);
        if (this.f6447v0 != colorForState3) {
            this.f6447v0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.f6421V) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.f6448w0 == z || this.f6423X == null) {
            z2 = false;
        } else {
            float fM4251p = m4251p();
            this.f6448w0 = z;
            if (fM4251p != m4251p()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f6393B0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f6449x0) : 0;
        if (this.f6449x0 != colorForState4) {
            this.f6449x0 = colorForState4;
            ColorStateList colorStateList6 = this.f6393B0;
            PorterDuff.Mode mode = this.f6395C0;
            this.f6392A0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m4228t(this.f6411L)) {
            state |= this.f6411L.setState(iArr);
        }
        if (m4228t(this.f6423X)) {
            state |= this.f6423X.setState(iArr);
        }
        if (m4228t(this.f6416Q)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f6416Q.setState(iArr3);
        }
        if (m4228t(this.f6417R)) {
            state |= this.f6417R.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m4254u();
        }
        return state;
    }

    /* JADX INFO: renamed from: w */
    public final void m4256w(boolean z) {
        if (this.f6421V != z) {
            this.f6421V = z;
            float fM4251p = m4251p();
            if (!z && this.f6448w0) {
                this.f6448w0 = false;
            }
            float fM4251p2 = m4251p();
            invalidateSelf();
            if (fM4251p != fM4251p2) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m4257x(Drawable drawable) {
        if (this.f6423X != drawable) {
            float fM4251p = m4251p();
            this.f6423X = drawable;
            float fM4251p2 = m4251p();
            m4226U(this.f6423X);
            m4249n(this.f6423X);
            invalidateSelf();
            if (fM4251p != fM4251p2) {
                m4254u();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4258y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f6424Y != colorStateList) {
            this.f6424Y = colorStateList;
            if (this.f6422W && (drawable = this.f6423X) != null && this.f6421V) {
                v30.m6560h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m4259z(boolean z) {
        if (this.f6422W != z) {
            boolean zM4246R = m4246R();
            this.f6422W = z;
            boolean zM4246R2 = m4246R();
            if (zM4246R != zM4246R2) {
                Drawable drawable = this.f6423X;
                if (zM4246R2) {
                    m4249n(drawable);
                } else {
                    m4226U(drawable);
                }
                invalidateSelf();
                m4254u();
            }
        }
    }
}
