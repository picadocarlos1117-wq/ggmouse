package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import p000.C0558d8;
import p000.ci1;
import p000.ua0;
import p000.ym1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f551f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: a */
    public boolean f552a;

    /* JADX INFO: renamed from: b */
    public boolean f553b;

    /* JADX INFO: renamed from: c */
    public final Rect f554c;

    /* JADX INFO: renamed from: d */
    public final Rect f555d;

    /* JADX INFO: renamed from: e */
    public final C0558d8 f556e;

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.sousasantoslogic.sspro.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f554c = rect;
        this.f555d = new Rect();
        C0558d8 c0558d8 = new C0558d8(this);
        this.f556e = c0558d8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ci1.f1817a, com.sousasantoslogic.sspro.R.attr.cardViewStyle, com.sousasantoslogic.sspro.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f551f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.sousasantoslogic.sspro.R.color.cardview_light_background) : getResources().getColor(com.sousasantoslogic.sspro.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, TouchPipeline.SIZE);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, TouchPipeline.SIZE);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, TouchPipeline.SIZE);
        this.f552a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f553b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ym1 ym1Var = new ym1(colorStateListValueOf, dimension);
        c0558d8.f2821b = ym1Var;
        setBackgroundDrawable(ym1Var);
        setClipToOutline(true);
        setElevation(dimension2);
        ua0.m6432O(c0558d8, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((ym1) this.f556e.f2821b).f13025h;
    }

    public float getCardElevation() {
        return ((CardView) this.f556e.f2822c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f554c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f554c.left;
    }

    public int getContentPaddingRight() {
        return this.f554c.right;
    }

    public int getContentPaddingTop() {
        return this.f554c.top;
    }

    public float getMaxCardElevation() {
        return ((ym1) this.f556e.f2821b).f13022e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f553b;
    }

    public float getRadius() {
        return ((ym1) this.f556e.f2821b).f13018a;
    }

    public boolean getUseCompatPadding() {
        return this.f552a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ym1 ym1Var = (ym1) this.f556e.f2821b;
        if (colorStateListValueOf == null) {
            ym1Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        ym1Var.f13025h = colorStateListValueOf;
        ym1Var.f13019b.setColor(colorStateListValueOf.getColorForState(ym1Var.getState(), ym1Var.f13025h.getDefaultColor()));
        ym1Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f556e.f2822c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ua0.m6432O(this.f556e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f553b) {
            this.f553b = z;
            C0558d8 c0558d8 = this.f556e;
            ua0.m6432O(c0558d8, ((ym1) c0558d8.f2821b).f13022e);
        }
    }

    public void setRadius(float f) {
        ym1 ym1Var = (ym1) this.f556e.f2821b;
        if (f == ym1Var.f13018a) {
            return;
        }
        ym1Var.f13018a = f;
        ym1Var.m7098b(null);
        ym1Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f552a != z) {
            this.f552a = z;
            C0558d8 c0558d8 = this.f556e;
            ua0.m6432O(c0558d8, ((ym1) c0558d8.f2821b).f13022e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ym1 ym1Var = (ym1) this.f556e.f2821b;
        if (colorStateList == null) {
            ym1Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        ym1Var.f13025h = colorStateList;
        ym1Var.f13019b.setColor(colorStateList.getColorForState(ym1Var.getState(), ym1Var.f13025h.getDefaultColor()));
        ym1Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
