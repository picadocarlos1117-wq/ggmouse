package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0594e8 extends RadioButton implements b12 {

    /* JADX INFO: renamed from: a */
    public final C0008a7 f3278a;

    /* JADX INFO: renamed from: b */
    public final C1652z4 f3279b;

    /* JADX INFO: renamed from: c */
    public final C0127c9 f3280c;

    /* JADX INFO: renamed from: d */
    public C1618y7 f3281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594e8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        z02.m7175a(context);
        h02.m3085a(this, getContext());
        C0008a7 c0008a7 = new C0008a7(this);
        this.f3278a = c0008a7;
        c0008a7.m96c(attributeSet, R.attr.radioButtonStyle);
        C1652z4 c1652z4 = new C1652z4(this);
        this.f3279b = c1652z4;
        c1652z4.m7202m(attributeSet, R.attr.radioButtonStyle);
        C0127c9 c0127c9 = new C0127c9(this);
        this.f3280c = c0127c9;
        c0127c9.m1166f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m7026a(attributeSet, R.attr.radioButtonStyle);
    }

    private C1618y7 getEmojiTextViewHelper() {
        if (this.f3281d == null) {
            this.f3281d = new C1618y7(this);
        }
        return this.f3281d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f3279b;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0127c9 c0127c9 = this.f3280c;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0008a7 c0008a7 = this.f3278a;
        if (c0008a7 != null) {
            c0008a7.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f3279b;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f3279b;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    @Override // p000.b12
    public ColorStateList getSupportButtonTintList() {
        C0008a7 c0008a7 = this.f3278a;
        if (c0008a7 != null) {
            return c0008a7.f74a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0008a7 c0008a7 = this.f3278a;
        if (c0008a7 != null) {
            return c0008a7.f75b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3280c.m1164d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3280c.m1165e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7027b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f3279b;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f3279b;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0008a7 c0008a7 = this.f3278a;
        if (c0008a7 != null) {
            if (c0008a7.f78e) {
                c0008a7.f78e = false;
            } else {
                c0008a7.f78e = true;
                c0008a7.m94a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f3280c;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f3280c;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7028c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((rc2) getEmojiTextViewHelper().f12856b.f1096b).mo2530I(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f3279b;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f3279b;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    @Override // p000.b12
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0008a7 c0008a7 = this.f3278a;
        if (c0008a7 != null) {
            c0008a7.f74a = colorStateList;
            c0008a7.f76c = true;
            c0008a7.m94a();
        }
    }

    @Override // p000.b12
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0008a7 c0008a7 = this.f3278a;
        if (c0008a7 != null) {
            c0008a7.f75b = mode;
            c0008a7.f77d = true;
            c0008a7.m94a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0127c9 c0127c9 = this.f3280c;
        c0127c9.m1168i(colorStateList);
        c0127c9.m1163b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0127c9 c0127c9 = this.f3280c;
        c0127c9.m1169j(mode);
        c0127c9.m1163b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(hr1.m3282r(getContext(), i));
    }
}
