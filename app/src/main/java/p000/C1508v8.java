package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1508v8 extends Spinner {

    /* JADX INFO: renamed from: n */
    public static final int[] f11576n = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C1652z4 f11577a;

    /* JADX INFO: renamed from: b */
    public final Context f11578b;

    /* JADX INFO: renamed from: c */
    public final C0781j8 f11579c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f11580d;

    /* JADX INFO: renamed from: e */
    public final boolean f11581e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1471u8 f11582f;

    /* JADX INFO: renamed from: g */
    public int f11583g;

    /* JADX INFO: renamed from: m */
    public final Rect f11584m;

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    public C1508v8(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.sousasantoslogic.sspro.R.attr.spinnerStyle);
        this.f11584m = new Rect();
        h02.m3085a(this, getContext());
        int[] iArr = ki1.f5867v;
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(context, attributeSet, iArr, com.sousasantoslogic.sspro.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        this.f11577a = new C1652z4(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f11578b = new C0543cu(context, resourceId);
        } else {
            this.f11578b = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11576n, com.sousasantoslogic.sspro.R.attr.spinnerStyle, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i != 0) {
                    DialogInterfaceOnClickListenerC1173o8 dialogInterfaceOnClickListenerC1173o8 = new DialogInterfaceOnClickListenerC1173o8(this);
                    this.f11582f = dialogInterfaceOnClickListenerC1173o8;
                    dialogInterfaceOnClickListenerC1173o8.f7683c = typedArray.getString(2);
                } else if (i == 1) {
                    C1397s8 c1397s8 = new C1397s8(this, this.f11578b, attributeSet);
                    C1174o9 c1174o9M4734Q2 = C1174o9.m4734Q(this.f11578b, attributeSet, iArr, com.sousasantoslogic.sspro.R.attr.spinnerStyle);
                    this.f11583g = ((TypedArray) c1174o9M4734Q2.f7699b).getLayoutDimension(3, -2);
                    c1397s8.m5060k(c1174o9M4734Q2.m4777z(1));
                    c1397s8.f10278H = typedArray.getString(2);
                    c1174o9M4734Q2.m4753T();
                    this.f11582f = c1397s8;
                    this.f11579c = new C0781j8(this, this, c1397s8);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.sousasantoslogic.sspro.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c1174o9M4734Q.m4753T();
                this.f11581e = true;
                spinnerAdapter = this.f11580d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f11580d = null;
                }
                this.f11577a.m7202m(attributeSet, com.sousasantoslogic.sspro.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC1173o8 dialogInterfaceOnClickListenerC1173o9 = new DialogInterfaceOnClickListenerC1173o8(this);
            this.f11582f = dialogInterfaceOnClickListenerC1173o9;
            dialogInterfaceOnClickListenerC1173o9.f7683c = typedArray.getString(2);
        } else if (i == 1) {
            C1397s8 c1397s9 = new C1397s8(this, this.f11578b, attributeSet);
            C1174o9 c1174o9M4734Q3 = C1174o9.m4734Q(this.f11578b, attributeSet, iArr, com.sousasantoslogic.sspro.R.attr.spinnerStyle);
            this.f11583g = ((TypedArray) c1174o9M4734Q3.f7699b).getLayoutDimension(3, -2);
            c1397s9.m5060k(c1174o9M4734Q3.m4777z(1));
            c1397s9.f10278H = typedArray.getString(2);
            c1174o9M4734Q3.m4753T();
            this.f11582f = c1397s9;
            this.f11579c = new C0781j8(this, this, c1397s9);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.sousasantoslogic.sspro.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c1174o9M4734Q.m4753T();
        this.f11581e = true;
        spinnerAdapter = this.f11580d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f11580d = null;
        }
        this.f11577a.m7202m(attributeSet, com.sousasantoslogic.sspro.R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    public final int m6598a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f11584m;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f11577a;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        return interfaceC1471u8 != null ? interfaceC1471u8.mo4720c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        return interfaceC1471u8 != null ? interfaceC1471u8.mo4729p() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f11582f != null ? this.f11583g : super.getDropDownWidth();
    }

    public final InterfaceC1471u8 getInternalPopup() {
        return this.f11582f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        return interfaceC1471u8 != null ? interfaceC1471u8.mo4723h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f11578b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        return interfaceC1471u8 != null ? interfaceC1471u8.mo4722f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f11577a;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f11577a;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        if (interfaceC1471u8 == null || !interfaceC1471u8.mo4719b()) {
            return;
        }
        interfaceC1471u8.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11582f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m6598a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1434t8 c1434t8 = (C1434t8) parcelable;
        super.onRestoreInstanceState(c1434t8.getSuperState());
        if (!c1434t8.f10800a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0819k8(this, 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1434t8 c1434t8 = new C1434t8(super.onSaveInstanceState());
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        c1434t8.f10800a = interfaceC1471u8 != null && interfaceC1471u8.mo4719b();
        return c1434t8;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0781j8 c0781j8 = this.f11579c;
        if (c0781j8 == null || !c0781j8.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        if (interfaceC1471u8 == null) {
            return super.performClick();
        }
        if (interfaceC1471u8.mo4719b()) {
            return true;
        }
        interfaceC1471u8.mo4728o(AbstractC1099m8.m4407b(this), AbstractC1099m8.m4406a(this));
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f11581e) {
            this.f11580d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        if (interfaceC1471u8 != null) {
            Context context = this.f11578b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1286p8 c1286p8 = new C1286p8();
            c1286p8.f8791a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1286p8.f8792b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1136n8.m4506a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1471u8.mo4730q(c1286p8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f11577a;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f11577a;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        if (interfaceC1471u8 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1471u8.mo4727n(i);
            interfaceC1471u8.mo4721d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        if (interfaceC1471u8 != null) {
            interfaceC1471u8.mo4726m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f11582f != null) {
            this.f11583g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        if (interfaceC1471u8 != null) {
            interfaceC1471u8.mo4725k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(hr1.m3282r(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1471u8 interfaceC1471u8 = this.f11582f;
        if (interfaceC1471u8 != null) {
            interfaceC1471u8.mo4724i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f11577a;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f11577a;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }
}
