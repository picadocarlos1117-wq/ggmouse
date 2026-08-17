package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: nh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145nh extends FrameLayout {

    /* JADX INFO: renamed from: n */
    public static final ViewOnTouchListenerC1108mh f7398n = new ViewOnTouchListenerC1108mh(0);

    /* JADX INFO: renamed from: a */
    public final pr1 f7399a;

    /* JADX INFO: renamed from: b */
    public int f7400b;

    /* JADX INFO: renamed from: c */
    public final float f7401c;

    /* JADX INFO: renamed from: d */
    public final float f7402d;

    /* JADX INFO: renamed from: e */
    public final int f7403e;

    /* JADX INFO: renamed from: f */
    public final int f7404f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f7405g;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f7406m;

    public AbstractC1145nh(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(ua0.m6452h0(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ji1.f5415w);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = i72.f4849a;
            y62.m7018s(this, dimensionPixelSize);
        }
        this.f7400b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f7399a = pr1.m5310b(context2, attributeSet, 0, 0).m5050a();
        }
        this.f7401c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(o21.m4639H(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(hr1.m3259J(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f7402d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f7403e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f7404f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f7398n);
        setFocusable(true);
        if (getBackground() == null) {
            int iM3195D = hp0.m3195D(getBackgroundOverlayColorAlpha(), hp0.m3226v(this, R.attr.colorSurface), hp0.m3226v(this, R.attr.colorOnSurface));
            pr1 pr1Var = this.f7399a;
            if (pr1Var != null) {
                int i = AbstractC1182oh.f7790a;
                zz0 zz0Var = new zz0(pr1Var);
                zz0Var.m7399j(ColorStateList.valueOf(iM3195D));
                drawable = zz0Var;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC1182oh.f7790a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM3195D);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f7405g;
            if (colorStateList != null) {
                v30.m6560h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = i72.f4849a;
            s62.m5996q(this, drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f7402d;
    }

    public int getAnimationMode() {
        return this.f7400b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f7401c;
    }

    public int getMaxInlineActionWidth() {
        return this.f7404f;
    }

    public int getMaxWidth() {
        return this.f7403e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = i72.f4849a;
        w62.m6726c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f7403e;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f7400b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f7405g != null) {
            drawable = drawable.mutate();
            v30.m6560h(drawable, this.f7405g);
            v30.m6561i(drawable, this.f7406m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f7405g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            v30.m6560h(drawableMutate, colorStateList);
            v30.m6561i(drawableMutate, this.f7406m);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f7406m = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            v30.m6561i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f7398n);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC1182oh abstractC1182oh) {
    }
}
