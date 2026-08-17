package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0742i8 extends C0558d8 {

    /* JADX INFO: renamed from: f */
    public final C0705h8 f4855f;

    /* JADX INFO: renamed from: g */
    public Drawable f4856g;

    /* JADX INFO: renamed from: m */
    public ColorStateList f4857m;

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode f4858n;

    /* JADX INFO: renamed from: o */
    public boolean f4859o;

    /* JADX INFO: renamed from: p */
    public boolean f4860p;

    public C0742i8(C0705h8 c0705h8) {
        super(c0705h8, 0);
        this.f4857m = null;
        this.f4858n = null;
        this.f4859o = false;
        this.f4860p = false;
        this.f4855f = c0705h8;
    }

    @Override // p000.C0558d8
    /* JADX INFO: renamed from: F */
    public final void mo2257F(AttributeSet attributeSet, int i) {
        super.mo2257F(attributeSet, R.attr.seekBarStyle);
        C0705h8 c0705h8 = this.f4855f;
        Context context = c0705h8.getContext();
        int[] iArr = ki1.f5852g;
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        i72.m3377i(c0705h8, c0705h8.getContext(), iArr, attributeSet, (TypedArray) c1174o9M4734Q.f7699b, R.attr.seekBarStyle);
        Drawable drawableM4737A = c1174o9M4734Q.m4737A(0);
        if (drawableM4737A != null) {
            c0705h8.setThumb(drawableM4737A);
        }
        Drawable drawableM4777z = c1174o9M4734Q.m4777z(1);
        Drawable drawable = this.f4856g;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f4856g = drawableM4777z;
        if (drawableM4777z != null) {
            drawableM4777z.setCallback(c0705h8);
            w30.m6699b(drawableM4777z, t62.m6240d(c0705h8));
            if (drawableM4777z.isStateful()) {
                drawableM4777z.setState(c0705h8.getDrawableState());
            }
            m3380N();
        }
        c0705h8.invalidate();
        if (typedArray.hasValue(3)) {
            this.f4858n = x30.m6865b(typedArray.getInt(3, -1), this.f4858n);
            this.f4860p = true;
        }
        if (typedArray.hasValue(2)) {
            this.f4857m = c1174o9M4734Q.m4774w(2);
            this.f4859o = true;
        }
        c1174o9M4734Q.m4753T();
        m3380N();
    }

    /* JADX INFO: renamed from: N */
    public final void m3380N() {
        Drawable drawable = this.f4856g;
        if (drawable != null) {
            if (this.f4859o || this.f4860p) {
                Drawable drawableMutate = drawable.mutate();
                this.f4856g = drawableMutate;
                if (this.f4859o) {
                    v30.m6560h(drawableMutate, this.f4857m);
                }
                if (this.f4860p) {
                    v30.m6561i(this.f4856g, this.f4858n);
                }
                if (this.f4856g.isStateful()) {
                    this.f4856g.setState(this.f4855f.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m3381O(Canvas canvas) {
        if (this.f4856g != null) {
            C0705h8 c0705h8 = this.f4855f;
            int max = c0705h8.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f4856g.getIntrinsicWidth();
                int intrinsicHeight = this.f4856g.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f4856g.setBounds(-i, -i2, i, i2);
                float width = ((c0705h8.getWidth() - c0705h8.getPaddingLeft()) - c0705h8.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c0705h8.getPaddingLeft(), c0705h8.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f4856g.draw(canvas);
                    canvas.translate(width, TouchPipeline.SIZE);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
