package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tz0 extends C1617y6 {

    /* JADX INFO: renamed from: D */
    public static final int[] f11052D = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: E */
    public static final int[] f11053E = {R.attr.state_error};

    /* JADX INFO: renamed from: F */
    public static final int[][] f11054F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: G */
    public static final int f11055G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: A */
    public CompoundButton.OnCheckedChangeListener f11056A;

    /* JADX INFO: renamed from: B */
    public final C0740i6 f11057B;

    /* JADX INFO: renamed from: C */
    public final rz0 f11058C;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f11059e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f11060f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f11061g;

    /* JADX INFO: renamed from: m */
    public boolean f11062m;

    /* JADX INFO: renamed from: n */
    public boolean f11063n;

    /* JADX INFO: renamed from: o */
    public boolean f11064o;

    /* JADX INFO: renamed from: p */
    public CharSequence f11065p;

    /* JADX INFO: renamed from: q */
    public Drawable f11066q;

    /* JADX INFO: renamed from: r */
    public Drawable f11067r;

    /* JADX INFO: renamed from: s */
    public boolean f11068s;

    /* JADX INFO: renamed from: t */
    public ColorStateList f11069t;

    /* JADX INFO: renamed from: u */
    public ColorStateList f11070u;

    /* JADX INFO: renamed from: v */
    public PorterDuff.Mode f11071v;

    /* JADX INFO: renamed from: w */
    public int f11072w;

    /* JADX INFO: renamed from: x */
    public int[] f11073x;

    /* JADX INFO: renamed from: y */
    public boolean f11074y;

    /* JADX INFO: renamed from: z */
    public CharSequence f11075z;

    public tz0(Context context, AttributeSet attributeSet) {
        super(ua0.m6452h0(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f11059e = new LinkedHashSet();
        this.f11060f = new LinkedHashSet();
        Context context2 = getContext();
        C0740i6 c0740i6 = new C0740i6(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = pl1.f8932a;
        Drawable drawableM3898a = kl1.m3898a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0740i6.f4069a = drawableM3898a;
        drawableM3898a.setCallback(c0740i6.f4833f);
        new C0703h6(c0740i6.f4069a.getConstantState());
        this.f11057B = c0740i6;
        this.f11058C = new rz0(this);
        Context context3 = getContext();
        this.f11066q = AbstractC1527vr.m6653a(this);
        this.f11069t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        p32.m5181n(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = ji1.f5405m;
        p32.m5195z(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C1174o9 c1174o9 = new C1174o9(context3, typedArrayObtainStyledAttributes);
        this.f11067r = c1174o9.m4777z(2);
        if (this.f11066q != null && ki0.m3850U(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f11055G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f11066q = hr1.m3282r(context3, R.drawable.mtrl_checkbox_button);
                this.f11068s = true;
                if (this.f11067r == null) {
                    this.f11067r = hr1.m3282r(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f11070u = o21.m4638G(context3, c1174o9, 3);
        this.f11071v = hr1.m3259J(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f11062m = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f11063n = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f11064o = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f11065p = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c1174o9.m4753T();
        m6355a();
    }

    private String getButtonStateDescription() {
        int i = this.f11072w;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f11061g == null) {
            int iM3226v = hp0.m3226v(this, R.attr.colorControlActivated);
            int iM3226v2 = hp0.m3226v(this, R.attr.colorError);
            int iM3226v3 = hp0.m3226v(this, R.attr.colorSurface);
            int iM3226v4 = hp0.m3226v(this, R.attr.colorOnSurface);
            this.f11061g = new ColorStateList(f11054F, new int[]{hp0.m3195D(1.0f, iM3226v3, iM3226v2), hp0.m3195D(1.0f, iM3226v3, iM3226v), hp0.m3195D(0.54f, iM3226v3, iM3226v4), hp0.m3195D(0.38f, iM3226v3, iM3226v4), hp0.m3195D(0.38f, iM3226v3, iM3226v4)});
        }
        return this.f11061g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f11069t;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m6355a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1057l3 c1057l3;
        Drawable drawableMutate = this.f11066q;
        ColorStateList colorStateList3 = this.f11069t;
        PorterDuff.Mode modeM6524b = AbstractC1490ur.m6524b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeM6524b != null) {
                v30.m6561i(drawableMutate, modeM6524b);
            }
        }
        this.f11066q = drawableMutate;
        Drawable drawableMutate2 = this.f11067r;
        ColorStateList colorStateList4 = this.f11070u;
        PorterDuff.Mode mode = this.f11071v;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                v30.m6561i(drawableMutate2, mode);
            }
        }
        this.f11067r = drawableMutate2;
        if (this.f11068s) {
            C0740i6 c0740i6 = this.f11057B;
            if (c0740i6 != null) {
                C0666g6 c0666g6 = c0740i6.f4829b;
                Drawable drawable = c0740i6.f4069a;
                rz0 rz0Var = this.f11058C;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (rz0Var.f10162a == null) {
                        rz0Var.f10162a = new C0592e6(rz0Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(rz0Var.f10162a);
                }
                ArrayList arrayList = c0740i6.f4832e;
                if (arrayList != null && rz0Var != null) {
                    arrayList.remove(rz0Var);
                    if (c0740i6.f4832e.size() == 0 && (c1057l3 = c0740i6.f4831d) != null) {
                        c0666g6.f4071b.removeListener(c1057l3);
                        c0740i6.f4831d = null;
                    }
                }
                Drawable drawable2 = c0740i6.f4069a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (rz0Var.f10162a == null) {
                        rz0Var.f10162a = new C0592e6(rz0Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(rz0Var.f10162a);
                } else if (rz0Var != null) {
                    if (c0740i6.f4832e == null) {
                        c0740i6.f4832e = new ArrayList();
                    }
                    if (!c0740i6.f4832e.contains(rz0Var)) {
                        c0740i6.f4832e.add(rz0Var);
                        if (c0740i6.f4831d == null) {
                            c0740i6.f4831d = new C1057l3(c0740i6, 1);
                        }
                        c0666g6.f4071b.addListener(c0740i6.f4831d);
                    }
                }
            }
            Drawable drawable3 = this.f11066q;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c0740i6 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c0740i6, false);
                ((AnimatedStateListDrawable) this.f11066q).addTransition(R.id.indeterminate, R.id.unchecked, c0740i6, false);
            }
        }
        Drawable drawable4 = this.f11066q;
        if (drawable4 != null && (colorStateList2 = this.f11069t) != null) {
            v30.m6560h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f11067r;
        if (drawable5 != null && (colorStateList = this.f11070u) != null) {
            v30.m6560h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f11066q;
        Drawable drawable7 = this.f11067r;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f11066q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f11067r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f11070u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f11071v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f11069t;
    }

    public int getCheckedState() {
        return this.f11072w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f11065p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f11072w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11062m && this.f11069t == null && this.f11070u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11052D);
        }
        if (this.f11064o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11053E);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.f11073x = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f11073x = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM6653a;
        if (!this.f11063n || !TextUtils.isEmpty(getText()) || (drawableM6653a = AbstractC1527vr.m6653a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM6653a.getIntrinsicWidth()) / 2) * (hr1.m3288z(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, TouchPipeline.SIZE);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM6653a.getBounds();
            v30.m6558f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f11064o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f11065p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sz0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sz0 sz0Var = (sz0) parcelable;
        super.onRestoreInstanceState(sz0Var.getSuperState());
        setCheckedState(sz0Var.f10656a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        sz0 sz0Var = new sz0(super.onSaveInstanceState());
        sz0Var.f10656a = getCheckedState();
        return sz0Var;
    }

    @Override // p000.C1617y6, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(hr1.m3282r(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f11067r = drawable;
        m6355a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(hr1.m3282r(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f11070u == colorStateList) {
            return;
        }
        this.f11070u = colorStateList;
        m6355a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f11071v == mode) {
            return;
        }
        this.f11071v = mode;
        m6355a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f11069t == colorStateList) {
            return;
        }
        this.f11069t = colorStateList;
        m6355a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m6355a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f11063n = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f11072w != i) {
            this.f11072w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f11075z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f11074y) {
                return;
            }
            this.f11074y = true;
            LinkedHashSet linkedHashSet = this.f11060f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    l41.m4035b();
                    return;
                }
            }
            if (this.f11072w != 2 && (onCheckedChangeListener = this.f11056A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f11074y = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f11065p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f11064o == z) {
            return;
        }
        this.f11064o = z;
        refreshDrawableState();
        Iterator it = this.f11059e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            l41.m4035b();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11056A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f11075z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f11062m = z;
        if (z) {
            AbstractC1490ur.m6525c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC1490ur.m6525c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p000.C1617y6, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f11066q = drawable;
        this.f11068s = false;
        m6355a();
    }
}
