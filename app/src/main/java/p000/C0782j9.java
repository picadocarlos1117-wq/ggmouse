package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0782j9 extends ToggleButton {

    /* JADX INFO: renamed from: a */
    public final C1652z4 f5323a;

    /* JADX INFO: renamed from: b */
    public final C0127c9 f5324b;

    /* JADX INFO: renamed from: c */
    public C1618y7 f5325c;

    public C0782j9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        h02.m3085a(this, getContext());
        C1652z4 c1652z4 = new C1652z4(this);
        this.f5323a = c1652z4;
        c1652z4.m7202m(attributeSet, R.attr.buttonStyleToggle);
        C0127c9 c0127c9 = new C0127c9(this);
        this.f5324b = c0127c9;
        c0127c9.m1166f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m7026a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1618y7 getEmojiTextViewHelper() {
        if (this.f5325c == null) {
            this.f5325c = new C1618y7(this);
        }
        return this.f5325c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f5323a;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0127c9 c0127c9 = this.f5324b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f5323a;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f5323a;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5324b.m1164d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5324b.m1165e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7027b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f5323a;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f5323a;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f5324b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f5324b;
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
        C1652z4 c1652z4 = this.f5323a;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f5323a;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0127c9 c0127c9 = this.f5324b;
        c0127c9.m1168i(colorStateList);
        c0127c9.m1163b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0127c9 c0127c9 = this.f5324b;
        c0127c9.m1169j(mode);
        c0127c9.m1163b();
    }
}
