package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hv1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f4726a;

    /* JADX INFO: renamed from: b */
    public final C0595e9 f4727b;

    /* JADX INFO: renamed from: c */
    public CharSequence f4728c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f4729d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f4730e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f4731f;

    /* JADX INFO: renamed from: g */
    public int f4732g;

    /* JADX INFO: renamed from: m */
    public ImageView.ScaleType f4733m;

    /* JADX INFO: renamed from: n */
    public View.OnLongClickListener f4734n;

    /* JADX INFO: renamed from: o */
    public boolean f4735o;

    public hv1(TextInputLayout textInputLayout, C1174o9 c1174o9) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f4726a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f4729d = checkableImageButton;
        C0595e9 c0595e9 = new C0595e9(getContext(), null);
        this.f4727b = c0595e9;
        if (o21.m4647R(getContext())) {
            ry0.m5925g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f4734n;
        checkableImageButton.setOnClickListener(null);
        ki0.m3853Z(checkableImageButton, onLongClickListener);
        this.f4734n = null;
        checkableImageButton.setOnLongClickListener(null);
        ki0.m3853Z(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c1174o9.f7699b;
        if (typedArray.hasValue(69)) {
            this.f4730e = o21.m4638G(getContext(), c1174o9, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f4731f = hr1.m3259J(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m3300b(c1174o9.m4777z(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            f40.m2713i("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f4732g) {
            this.f4732g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM3871q = ki0.m3871q(typedArray.getInt(68, -1));
            this.f4733m = scaleTypeM3871q;
            checkableImageButton.setScaleType(scaleTypeM3871q);
        }
        c0595e9.setVisibility(8);
        c0595e9.setId(R.id.textinput_prefix_text);
        c0595e9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = i72.f4849a;
        v62.m6590f(c0595e9, 1);
        c0595e9.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0595e9.setTextColor(c1174o9.m4774w(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f4728c = TextUtils.isEmpty(text2) ? null : text2;
        c0595e9.setText(text2);
        m3303e();
        addView(checkableImageButton);
        addView(c0595e9);
    }

    /* JADX INFO: renamed from: a */
    public final int m3299a() {
        int iM5920b;
        CheckableImageButton checkableImageButton = this.f4729d;
        if (checkableImageButton.getVisibility() == 0) {
            iM5920b = ry0.m5920b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iM5920b = 0;
        }
        WeakHashMap weakHashMap = i72.f4849a;
        return t62.m6242f(this.f4727b) + t62.m6242f(this) + iM5920b;
    }

    /* JADX INFO: renamed from: b */
    public final void m3300b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4729d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f4730e;
            PorterDuff.Mode mode = this.f4731f;
            TextInputLayout textInputLayout = this.f4726a;
            ki0.m3854a(textInputLayout, checkableImageButton, colorStateList, mode);
            m3301c(true);
            ki0.m3848S(textInputLayout, checkableImageButton, this.f4730e);
            return;
        }
        m3301c(false);
        View.OnLongClickListener onLongClickListener = this.f4734n;
        checkableImageButton.setOnClickListener(null);
        ki0.m3853Z(checkableImageButton, onLongClickListener);
        this.f4734n = null;
        checkableImageButton.setOnLongClickListener(null);
        ki0.m3853Z(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3301c(boolean z) {
        CheckableImageButton checkableImageButton = this.f4729d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m3302d();
            m3303e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3302d() {
        int iM6242f;
        EditText editText = this.f4726a.f2152d;
        if (editText == null) {
            return;
        }
        if (this.f4729d.getVisibility() == 0) {
            iM6242f = 0;
        } else {
            WeakHashMap weakHashMap = i72.f4849a;
            iM6242f = t62.m6242f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = i72.f4849a;
        t62.m6247k(this.f4727b, iM6242f, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m3303e() {
        int i = (this.f4728c == null || this.f4735o) ? 8 : 0;
        setVisibility((this.f4729d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f4727b.setVisibility(i);
        this.f4726a.m1716q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m3302d();
    }
}
