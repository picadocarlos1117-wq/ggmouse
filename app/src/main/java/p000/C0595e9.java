package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: e9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0595e9 extends TextView {

    /* JADX INFO: renamed from: a */
    public final C1652z4 f3289a;

    /* JADX INFO: renamed from: b */
    public final C0127c9 f3290b;

    /* JADX INFO: renamed from: c */
    public C1618y7 f3291c;

    /* JADX INFO: renamed from: d */
    public boolean f3292d;

    /* JADX INFO: renamed from: e */
    public C0558d8 f3293e;

    /* JADX INFO: renamed from: f */
    public Future f3294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0595e9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z02.m7175a(context);
        this.f3292d = false;
        this.f3293e = null;
        h02.m3085a(this, getContext());
        C1652z4 c1652z4 = new C1652z4(this);
        this.f3289a = c1652z4;
        c1652z4.m7202m(attributeSet, i);
        C0127c9 c0127c9 = new C0127c9(this);
        this.f3290b = c0127c9;
        c0127c9.m1166f(attributeSet, i);
        c0127c9.m1163b();
        getEmojiTextViewHelper().m7026a(attributeSet, i);
    }

    private C1618y7 getEmojiTextViewHelper() {
        if (this.f3291c == null) {
            this.f3291c = new C1618y7(this);
        }
        return this.f3291c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f3289a;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0127c9 c0127c9 = this.f3290b;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0559d9 getSuperCaller() {
        if (this.f3293e == null) {
            this.f3293e = new C0558d8(this);
        }
        return this.f3293e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f3289a;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f3289a;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3290b.m1164d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3290b.m1165e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f3294f;
        if (future != null) {
            try {
                this.f3294f = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PrecomputedText.Params paramsM2444b = e02.m2444b(this);
                paramsM2444b.getTextPaint();
                paramsM2444b.getTextDirection();
                paramsM2444b.getBreakStrategy();
                paramsM2444b.getHyphenationFrequency();
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public of1 getTextMetricsParamsCompat() {
        return new of1(e02.m2444b(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3290b.getClass();
        C0127c9.m1161h(editorInfo, inputConnectionOnCreateInputConnection, this);
        o21.m4655a0(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0127c9 c0127c9 = this.f3290b;
        if (c0127c9 != null) {
            c0127c9.getClass();
            Method method = h82.f4474a;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f3294f;
        if (future != null) {
            try {
                this.f3294f = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PrecomputedText.Params paramsM2444b = e02.m2444b(this);
                paramsM2444b.getTextPaint();
                paramsM2444b.getTextDirection();
                paramsM2444b.getBreakStrategy();
                paramsM2444b.getHyphenationFrequency();
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f3290b != null) {
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
        C1652z4 c1652z4 = this.f3289a;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f3289a;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f3290b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f3290b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? hr1.m3282r(context, i) : null, i2 != 0 ? hr1.m3282r(context, i2) : null, i3 != 0 ? hr1.m3282r(context, i3) : null, i4 != 0 ? hr1.m3282r(context, i4) : null);
        C0127c9 c0127c9 = this.f3290b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? hr1.m3282r(context, i) : null, i2 != 0 ? hr1.m3282r(context, i2) : null, i3 != 0 ? hr1.m3282r(context, i3) : null, i4 != 0 ? hr1.m3282r(context, i4) : null);
        C0127c9 c0127c9 = this.f3290b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((rc2) getEmojiTextViewHelper().f12856b.f1096b).mo2530I(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        rc2.m5785h(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(pf1 pf1Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        PrecomputedText.Params paramsM2444b = e02.m2444b(this);
        paramsM2444b.getTextPaint();
        paramsM2444b.getTextDirection();
        paramsM2444b.getBreakStrategy();
        paramsM2444b.getHyphenationFrequency();
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f3289a;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f3289a;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0127c9 c0127c9 = this.f3290b;
        c0127c9.m1168i(colorStateList);
        c0127c9.m1163b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0127c9 c0127c9 = this.f3290b;
        c0127c9.m1169j(mode);
        c0127c9.m1163b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0127c9 c0127c9 = this.f3290b;
        if (c0127c9 != null) {
            c0127c9.m1167g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<pf1> future) {
        this.f3294f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(of1 of1Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = of1Var.f7782b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        c02.m1103h(this, i);
        getPaint().set(of1Var.f7781a);
        d02.m2163e(this, of1Var.f7783c);
        d02.m2166h(this, of1Var.f7784d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        Method method = h82.f4474a;
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f3292d) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            hp0 hp0Var = q32.f9322a;
            if (context == null) {
                f40.m2713i("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f3292d = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f3292d = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f3290b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f3290b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    public C0595e9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
