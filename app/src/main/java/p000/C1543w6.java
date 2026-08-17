package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1543w6 extends Button {

    /* JADX INFO: renamed from: a */
    public final C1652z4 f11987a;

    /* JADX INFO: renamed from: b */
    public final C0127c9 f11988b;

    /* JADX INFO: renamed from: c */
    public C1618y7 f11989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1543w6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z02.m7175a(context);
        h02.m3085a(this, getContext());
        C1652z4 c1652z4 = new C1652z4(this);
        this.f11987a = c1652z4;
        c1652z4.m7202m(attributeSet, i);
        C0127c9 c0127c9 = new C0127c9(this);
        this.f11988b = c0127c9;
        c0127c9.m1166f(attributeSet, i);
        c0127c9.m1163b();
        getEmojiTextViewHelper().m7026a(attributeSet, i);
    }

    private C1618y7 getEmojiTextViewHelper() {
        if (this.f11989c == null) {
            this.f11989c = new C1618y7(this);
        }
        return this.f11989c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f11987a;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0127c9 c0127c9 = this.f11988b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        Method method = h82.f4474a;
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        Method method = h82.f4474a;
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        Method method = h82.f4474a;
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        Method method = h82.f4474a;
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        Method method = h82.f4474a;
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f11987a;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f11987a;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11988b.m1164d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11988b.m1165e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0127c9 c0127c9 = this.f11988b;
        if (c0127c9 != null) {
            c0127c9.getClass();
            Method method = h82.f4474a;
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f11988b != null) {
            Method method = h82.f4474a;
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m7027b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        Method method = h82.f4474a;
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        Method method = h82.f4474a;
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        Method method = h82.f4474a;
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f11987a;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f11987a;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m7028c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((rc2) getEmojiTextViewHelper().f12856b.f1096b).mo2530I(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0127c9 c0127c9 = this.f11988b;
        if (c0127c9 != null) {
            c0127c9.f1706a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f11987a;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f11987a;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0127c9 c0127c9 = this.f11988b;
        c0127c9.m1168i(colorStateList);
        c0127c9.m1163b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0127c9 c0127c9 = this.f11988b;
        c0127c9.m1169j(mode);
        c0127c9.m1163b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0127c9 c0127c9 = this.f11988b;
        if (c0127c9 != null) {
            c0127c9.m1167g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        Method method = h82.f4474a;
        super.setTextSize(i, f);
    }
}
