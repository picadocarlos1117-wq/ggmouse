package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f8589a;

    /* JADX INFO: renamed from: b */
    public final String f8590b;

    /* JADX INFO: renamed from: c */
    public final int f8591c;

    /* JADX INFO: renamed from: d */
    public final int f8592d;

    /* JADX INFO: renamed from: e */
    public final float f8593e;

    /* JADX INFO: renamed from: f */
    public final float f8594f;

    /* JADX INFO: renamed from: g */
    public final float f8595g;

    /* JADX INFO: renamed from: h */
    public final boolean f8596h;

    /* JADX INFO: renamed from: i */
    public final float f8597i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f8598j;

    /* JADX INFO: renamed from: k */
    public float f8599k;

    /* JADX INFO: renamed from: l */
    public final int f8600l;

    /* JADX INFO: renamed from: m */
    public boolean f8601m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f8602n;

    public oz1(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ji1.f5416x);
        this.f8599k = typedArrayObtainStyledAttributes.getDimension(0, TouchPipeline.SIZE);
        this.f8598j = o21.m4639H(context, typedArrayObtainStyledAttributes, 3);
        o21.m4639H(context, typedArrayObtainStyledAttributes, 4);
        o21.m4639H(context, typedArrayObtainStyledAttributes, 5);
        this.f8591c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f8592d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f8600l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f8590b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f8589a = o21.m4639H(context, typedArrayObtainStyledAttributes, 6);
        this.f8593e = typedArrayObtainStyledAttributes.getFloat(7, TouchPipeline.SIZE);
        this.f8594f = typedArrayObtainStyledAttributes.getFloat(8, TouchPipeline.SIZE);
        this.f8595g = typedArrayObtainStyledAttributes.getFloat(9, TouchPipeline.SIZE);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, ji1.f5408p);
        this.f8596h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f8597i = typedArrayObtainStyledAttributes2.getFloat(0, TouchPipeline.SIZE);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m5088a() {
        String str;
        Typeface typeface = this.f8602n;
        int i = this.f8591c;
        if (typeface == null && (str = this.f8590b) != null) {
            this.f8602n = Typeface.create(str, i);
        }
        if (this.f8602n == null) {
            int i2 = this.f8592d;
            if (i2 == 1) {
                this.f8602n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f8602n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f8602n = Typeface.DEFAULT;
            } else {
                this.f8602n = Typeface.MONOSPACE;
            }
            this.f8602n = Typeface.create(this.f8602n, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m5089b(Context context) {
        if (this.f8601m) {
            return this.f8602n;
        }
        if (!context.isRestricted()) {
            try {
                int i = this.f8600l;
                ThreadLocal threadLocal = pl1.f8932a;
                Typeface typefaceM5280a = context.isRestricted() ? null : pl1.m5280a(context, i, new TypedValue(), 0, null, false, false);
                this.f8602n = typefaceM5280a;
                if (typefaceM5280a != null) {
                    this.f8602n = Typeface.create(typefaceM5280a, this.f8591c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        m5088a();
        this.f8601m = true;
        return this.f8602n;
    }

    /* JADX INFO: renamed from: c */
    public final void m5090c(Context context, o21 o21Var) {
        if (m5091d(context)) {
            m5089b(context);
        } else {
            m5088a();
        }
        int i = this.f8600l;
        if (i == 0) {
            this.f8601m = true;
        }
        if (this.f8601m) {
            o21Var.mo3457c0(this.f8602n, true);
            return;
        }
        try {
            mz1 mz1Var = new mz1(this, o21Var);
            ThreadLocal threadLocal = pl1.f8932a;
            if (context.isRestricted()) {
                mz1Var.m5564g(-4);
            } else {
                pl1.m5280a(context, i, new TypedValue(), 0, mz1Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f8601m = true;
            o21Var.mo3456b0(1);
        } catch (Exception unused2) {
            this.f8601m = true;
            o21Var.mo3456b0(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5091d(Context context) {
        Typeface typefaceM5280a = null;
        int i = this.f8600l;
        if (i != 0) {
            ThreadLocal threadLocal = pl1.f8932a;
            if (!context.isRestricted()) {
                typefaceM5280a = pl1.m5280a(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM5280a != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5092e(Context context, TextPaint textPaint, o21 o21Var) {
        m5093f(context, textPaint, o21Var);
        ColorStateList colorStateList = this.f8598j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f8589a;
        textPaint.setShadowLayer(this.f8595g, this.f8593e, this.f8594f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m5093f(Context context, TextPaint textPaint, o21 o21Var) {
        if (m5091d(context)) {
            m5094g(context, textPaint, m5089b(context));
            return;
        }
        m5088a();
        m5094g(context, textPaint, this.f8602n);
        m5090c(context, new nz1(this, context, textPaint, o21Var));
    }

    /* JADX INFO: renamed from: g */
    public final void m5094g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM3252C = hr1.m3252C(context.getResources().getConfiguration(), typeface);
        if (typefaceM3252C != null) {
            typeface = typefaceM3252C;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f8591c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : TouchPipeline.SIZE);
        textPaint.setTextSize(this.f8599k);
        if (this.f8596h) {
            textPaint.setLetterSpacing(this.f8597i);
        }
    }
}
