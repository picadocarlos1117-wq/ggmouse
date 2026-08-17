package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: renamed from: v6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1506v6 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f11562d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C1652z4 f11563a;

    /* JADX INFO: renamed from: b */
    public final C0127c9 f11564b;

    /* JADX INFO: renamed from: c */
    public final C0558d8 f11565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506v6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sousasantoslogic.sspro.R.attr.autoCompleteTextViewStyle);
        z02.m7175a(context);
        h02.m3085a(this, getContext());
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(getContext(), attributeSet, f11562d, com.sousasantoslogic.sspro.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c1174o9M4734Q.f7699b).hasValue(0)) {
            setDropDownBackgroundDrawable(c1174o9M4734Q.m4777z(0));
        }
        c1174o9M4734Q.m4753T();
        C1652z4 c1652z4 = new C1652z4(this);
        this.f11563a = c1652z4;
        c1652z4.m7202m(attributeSet, com.sousasantoslogic.sspro.R.attr.autoCompleteTextViewStyle);
        C0127c9 c0127c9 = new C0127c9(this);
        this.f11564b = c0127c9;
        c0127c9.m1166f(attributeSet, com.sousasantoslogic.sspro.R.attr.autoCompleteTextViewStyle);
        c0127c9.m1163b();
        C0558d8 c0558d8 = new C0558d8((EditText) this, 3);
        this.f11565c = c0558d8;
        c0558d8.mo2257F(attributeSet, com.sousasantoslogic.sspro.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM2253A = c0558d8.m2253A(keyListener);
        if (keyListenerM2253A == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2253A);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f11563a;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0127c9 c0127c9 = this.f11564b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f11563a;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f11563a;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11564b.m1164d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11564b.m1165e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o21.m4655a0(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f11565c.m2258G(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f11563a;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f11563a;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f11564b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f11564b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(hr1.m3282r(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f11565c.m2262K(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11565c.m2253A(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f11563a;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f11563a;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0127c9 c0127c9 = this.f11564b;
        c0127c9.m1168i(colorStateList);
        c0127c9.m1163b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0127c9 c0127c9 = this.f11564b;
        c0127c9.m1169j(mode);
        c0127c9.m1163b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0127c9 c0127c9 = this.f11564b;
        if (c0127c9 != null) {
            c0127c9.m1167g(context, i);
        }
    }
}
