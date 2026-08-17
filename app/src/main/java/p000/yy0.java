package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.sousasantoslogic.sspro.R;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yy0 extends C1506v6 {

    /* JADX INFO: renamed from: e */
    public final ot0 f13161e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f13162f;

    /* JADX INFO: renamed from: g */
    public final Rect f13163g;

    /* JADX INFO: renamed from: m */
    public final int f13164m;

    /* JADX INFO: renamed from: n */
    public final float f13165n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f13166o;

    /* JADX INFO: renamed from: p */
    public int f13167p;

    /* JADX INFO: renamed from: q */
    public ColorStateList f13168q;

    public yy0(Context context, AttributeSet attributeSet) {
        super(ua0.m6452h0(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f13163g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM5156W = p32.m5156W(context2, attributeSet, ji1.f5400h, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM5156W.hasValue(0) && typedArrayM5156W.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f13164m = typedArrayM5156W.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.f13165n = typedArrayM5156W.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM5156W.hasValue(2)) {
            this.f13166o = ColorStateList.valueOf(typedArrayM5156W.getColor(2, 0));
        }
        this.f13167p = typedArrayM5156W.getColor(4, 0);
        this.f13168q = o21.m4639H(context2, typedArrayM5156W, 5);
        this.f13162f = (AccessibilityManager) context2.getSystemService("accessibility");
        ot0 ot0Var = new ot0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f13161e = ot0Var;
        ot0Var.f8469D = true;
        C0126c8 c0126c8 = ot0Var.f8470E;
        c0126c8.setFocusable(true);
        ot0Var.f8485t = this;
        c0126c8.setInputMethodMode(2);
        ot0Var.mo4730q(getAdapter());
        ot0Var.f8486u = new C1323q8(this, i);
        if (typedArrayM5156W.hasValue(6)) {
            setSimpleItems(typedArrayM5156W.getResourceId(6, 0));
        }
        typedArrayM5156W.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static void m7161a(yy0 yy0Var, Object obj) {
        yy0Var.setText(yy0Var.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m7162b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f13162f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f13161e.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f13166o;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM7162b = m7162b();
        return (textInputLayoutM7162b == null || !textInputLayoutM7162b.f2132J) ? super.getHint() : textInputLayoutM7162b.getHint();
    }

    public float getPopupElevation() {
        return this.f13165n;
    }

    public int getSimpleItemSelectedColor() {
        return this.f13167p;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f13168q;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM7162b = m7162b();
        if (textInputLayoutM7162b != null && textInputLayoutM7162b.f2132J && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13161e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM7162b = m7162b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM7162b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ot0 ot0Var = this.f13161e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !ot0Var.f8470E.isShowing() ? -1 : ot0Var.f8473c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM7162b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = ot0Var.f8470E.getBackground();
                if (background != null) {
                    Rect rect = this.f13163g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM7162b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.f13162f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f13161e.mo4730q(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ot0 ot0Var = this.f13161e;
        if (ot0Var != null) {
            ot0Var.m5060k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f13166o = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof zz0) {
            ((zz0) dropDownBackground).m7399j(this.f13166o);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f13161e.f8487v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM7162b = m7162b();
        if (textInputLayoutM7162b != null) {
            textInputLayoutM7162b.m1718s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f13167p = i;
        if (getAdapter() instanceof xy0) {
            ((xy0) getAdapter()).m6980a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f13168q = colorStateList;
        if (getAdapter() instanceof xy0) {
            ((xy0) getAdapter()).m6980a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new xy0(this, getContext(), this.f13164m, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f13162f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f13161e.mo3059g();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
