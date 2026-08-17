package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ym1 extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f13018a;

    /* JADX INFO: renamed from: b */
    public final Paint f13019b;

    /* JADX INFO: renamed from: c */
    public final RectF f13020c;

    /* JADX INFO: renamed from: d */
    public final Rect f13021d;

    /* JADX INFO: renamed from: e */
    public float f13022e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f13025h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f13026i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f13027j;

    /* JADX INFO: renamed from: f */
    public boolean f13023f = false;

    /* JADX INFO: renamed from: g */
    public boolean f13024g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f13028k = PorterDuff.Mode.SRC_IN;

    public ym1(ColorStateList colorStateList, float f) {
        this.f13018a = f;
        Paint paint = new Paint(5);
        this.f13019b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f13025h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f13025h.getDefaultColor()));
        this.f13020c = new RectF();
        this.f13021d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m7097a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m7098b(Rect rect) {
        float f;
        if (rect == null) {
            rect = getBounds();
        }
        float f2 = rect.left;
        float f3 = rect.top;
        float f4 = rect.right;
        float f5 = rect.bottom;
        RectF rectF = this.f13020c;
        rectF.set(f2, f3, f4, f5);
        Rect rect2 = this.f13021d;
        rect2.set(rect);
        if (this.f13023f) {
            float f6 = this.f13022e;
            float f7 = this.f13018a;
            boolean z = this.f13024g;
            if (z) {
                f = (float) (((1.0d - zm1.f13491a) * ((double) f7)) + ((double) (1.5f * f6)));
            } else {
                int i = zm1.f13492b;
                f = 1.5f * f6;
            }
            if (z) {
                f6 = (float) (((1.0d - zm1.f13491a) * ((double) f7)) + ((double) f6));
            }
            rect2.inset((int) Math.ceil(f6), (int) Math.ceil(f));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f13026i;
        Paint paint = this.f13019b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f13026i);
            z = true;
        }
        RectF rectF = this.f13020c;
        float f = this.f13018a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f13021d, this.f13018a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f13027j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f13025h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m7098b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f13025h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f13019b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f13027j;
        if (colorStateList2 == null || (mode = this.f13028k) == null) {
            return z;
        }
        this.f13026i = m7097a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f13019b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13019b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f13027j = colorStateList;
        this.f13026i = m7097a(colorStateList, this.f13028k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f13028k = mode;
        this.f13026i = m7097a(this.f13027j, mode);
        invalidateSelf();
    }
}
