package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: z6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1654z6 extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C0008a7 f13292a;

    /* JADX INFO: renamed from: b */
    public final C1652z4 f13293b;

    /* JADX INFO: renamed from: c */
    public final C0127c9 f13294c;

    /* JADX INFO: renamed from: d */
    public C1618y7 f13295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1654z6(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        z02.m7175a(context);
        h02.m3085a(this, getContext());
        C0127c9 c0127c9 = new C0127c9(this);
        this.f13294c = c0127c9;
        c0127c9.m1166f(attributeSet, R.attr.checkedTextViewStyle);
        c0127c9.m1163b();
        C1652z4 c1652z4 = new C1652z4(this);
        this.f13293b = c1652z4;
        c1652z4.m7202m(attributeSet, R.attr.checkedTextViewStyle);
        this.f13292a = new C0008a7(this);
        Context context2 = getContext();
        int[] iArr = ki1.f5857l;
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        i72.m3377i(this, getContext(), iArr, attributeSet, (TypedArray) c1174o9M4734Q.f7699b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(hr1.m3282r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(hr1.m3282r(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(hr1.m3282r(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c1174o9M4734Q.m4774w(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(x30.m6865b(typedArray.getInt(3, -1), null));
            }
            c1174o9M4734Q.m4753T();
            getEmojiTextViewHelper().m7026a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c1174o9M4734Q.m4753T();
            throw th;
        }
    }

    private C1618y7 getEmojiTextViewHelper() {
        if (this.f13295d == null) {
            this.f13295d = new C1618y7(this);
        }
        return this.f13295d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0127c9 c0127c9 = this.f13294c;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
        C1652z4 c1652z4 = this.f13293b;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0008a7 c0008a7 = this.f13292a;
        if (c0008a7 != null) {
            c0008a7.m95b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f13293b;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f13293b;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0008a7 c0008a7 = this.f13292a;
        if (c0008a7 != null) {
            return c0008a7.f74a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0008a7 c0008a7 = this.f13292a;
        if (c0008a7 != null) {
            return c0008a7.f75b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13294c.m1164d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13294c.m1165e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o21.m4655a0(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7027b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f13293b;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f13293b;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0008a7 c0008a7 = this.f13292a;
        if (c0008a7 != null) {
            if (c0008a7.f78e) {
                c0008a7.f78e = false;
            } else {
                c0008a7.f78e = true;
                c0008a7.m95b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f13294c;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f13294c;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7028c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f13293b;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f13293b;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0008a7 c0008a7 = this.f13292a;
        if (c0008a7 != null) {
            c0008a7.f74a = colorStateList;
            c0008a7.f76c = true;
            c0008a7.m95b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0008a7 c0008a7 = this.f13292a;
        if (c0008a7 != null) {
            c0008a7.f75b = mode;
            c0008a7.f77d = true;
            c0008a7.m95b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0127c9 c0127c9 = this.f13294c;
        c0127c9.m1168i(colorStateList);
        c0127c9.m1163b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0127c9 c0127c9 = this.f13294c;
        c0127c9.m1169j(mode);
        c0127c9.m1163b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0127c9 c0127c9 = this.f13294c;
        if (c0127c9 != null) {
            c0127c9.m1167g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(hr1.m3282r(getContext(), i));
    }
}
