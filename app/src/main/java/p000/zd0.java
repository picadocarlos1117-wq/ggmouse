package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zd0 extends ss0 {

    /* JADX INFO: renamed from: u */
    public Drawable f13356u;

    /* JADX INFO: renamed from: v */
    public final Rect f13357v;

    /* JADX INFO: renamed from: w */
    public final Rect f13358w;

    /* JADX INFO: renamed from: x */
    public int f13359x;

    /* JADX INFO: renamed from: y */
    public final boolean f13360y;

    /* JADX INFO: renamed from: z */
    public boolean f13361z;

    public zd0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13357v = new Rect();
        this.f13358w = new Rect();
        this.f13359x = 119;
        this.f13360y = true;
        this.f13361z = false;
        p32.m5181n(context, attributeSet, 0, 0);
        int[] iArr = ji1.f5399g;
        p32.m5195z(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f13359x = typedArrayObtainStyledAttributes.getInt(1, this.f13359x);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f13360y = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f13356u;
        if (drawable != null) {
            if (this.f13361z) {
                this.f13361z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f13360y;
                Rect rect = this.f13357v;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f13359x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f13358w;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f13356u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13356u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f13356u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f13356u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f13359x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13356u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000.ss0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f13361z = z | this.f13361z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13361z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f13356u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f13356u);
            }
            this.f13356u = drawable;
            this.f13361z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f13359x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f13359x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f13359x = i;
            if (i == 119 && this.f13356u != null) {
                this.f13356u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13356u;
    }
}
