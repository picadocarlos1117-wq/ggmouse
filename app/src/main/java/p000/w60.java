package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.sousasantoslogic.sspro.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w60 extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public final u60 f11990A;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f11991a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f11992b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f11993c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f11994d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f11995e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f11996f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f11997g;

    /* JADX INFO: renamed from: m */
    public final C0716hj f11998m;

    /* JADX INFO: renamed from: n */
    public int f11999n;

    /* JADX INFO: renamed from: o */
    public final LinkedHashSet f12000o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f12001p;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f12002q;

    /* JADX INFO: renamed from: r */
    public int f12003r;

    /* JADX INFO: renamed from: s */
    public ImageView.ScaleType f12004s;

    /* JADX INFO: renamed from: t */
    public View.OnLongClickListener f12005t;

    /* JADX INFO: renamed from: u */
    public CharSequence f12006u;

    /* JADX INFO: renamed from: v */
    public final C0595e9 f12007v;

    /* JADX INFO: renamed from: w */
    public boolean f12008w;

    /* JADX INFO: renamed from: x */
    public EditText f12009x;

    /* JADX INFO: renamed from: y */
    public final AccessibilityManager f12010y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1167o2 f12011z;

    public w60(TextInputLayout textInputLayout, C1174o9 c1174o9) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f11999n = 0;
        this.f12000o = new LinkedHashSet();
        this.f11990A = new u60(this);
        v60 v60Var = new v60(this);
        this.f12010y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f11991a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11992b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM6710a = m6710a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f11993c = checkableImageButtonM6710a;
        CheckableImageButton checkableImageButtonM6710a2 = m6710a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f11997g = checkableImageButtonM6710a2;
        C0716hj c0716hj = new C0716hj();
        c0716hj.f4586c = new SparseArray();
        c0716hj.f4587d = this;
        TypedArray typedArray = (TypedArray) c1174o9.f7699b;
        c0716hj.f4584a = typedArray.getResourceId(28, 0);
        c0716hj.f4585b = typedArray.getResourceId(52, 0);
        this.f11998m = c0716hj;
        C0595e9 c0595e9 = new C0595e9(getContext(), null);
        this.f12007v = c0595e9;
        TypedArray typedArray2 = (TypedArray) c1174o9.f7699b;
        if (typedArray2.hasValue(38)) {
            this.f11994d = o21.m4638G(getContext(), c1174o9, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f11995e = hr1.m3259J(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            m6718i(c1174o9.m4777z(37));
        }
        checkableImageButtonM6710a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5998s(checkableImageButtonM6710a, 2);
        checkableImageButtonM6710a.setClickable(false);
        checkableImageButtonM6710a.setPressable(false);
        checkableImageButtonM6710a.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f12001p = o21.m4638G(getContext(), c1174o9, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f12002q = hr1.m3259J(typedArray2.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray2.hasValue(30)) {
            m6716g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonM6710a2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonM6710a2.setContentDescription(text);
            }
            checkableImageButtonM6710a2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f12001p = o21.m4638G(getContext(), c1174o9, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f12002q = hr1.m3259J(typedArray2.getInt(55, -1), null);
            }
            m6716g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonM6710a2.getContentDescription() != text2) {
                checkableImageButtonM6710a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            f40.m2713i("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f12003r) {
            this.f12003r = dimensionPixelSize;
            checkableImageButtonM6710a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM6710a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM6710a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM6710a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeM3871q = ki0.m3871q(typedArray2.getInt(31, -1));
            this.f12004s = scaleTypeM3871q;
            checkableImageButtonM6710a2.setScaleType(scaleTypeM3871q);
            checkableImageButtonM6710a.setScaleType(scaleTypeM3871q);
        }
        c0595e9.setVisibility(8);
        c0595e9.setId(R.id.textinput_suffix_text);
        c0595e9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        v62.m6590f(c0595e9, 1);
        c0595e9.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c0595e9.setTextColor(c1174o9.m4774w(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f12006u = TextUtils.isEmpty(text3) ? null : text3;
        c0595e9.setText(text3);
        m6723n();
        frameLayout.addView(checkableImageButtonM6710a2);
        addView(c0595e9);
        addView(frameLayout);
        addView(checkableImageButtonM6710a);
        textInputLayout.f2162j0.add(v60Var);
        if (textInputLayout.f2152d != null) {
            v60Var.m6584a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1410sl(this, i));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m6710a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (o21.m4647R(getContext())) {
            ry0.m5926h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final x60 m6711b() {
        x60 c1494uv;
        int i = this.f11999n;
        C0716hj c0716hj = this.f11998m;
        SparseArray sparseArray = (SparseArray) c0716hj.f4586c;
        x60 x60Var = (x60) sparseArray.get(i);
        if (x60Var != null) {
            return x60Var;
        }
        w60 w60Var = (w60) c0716hj.f4587d;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                c1494uv = new C1494uv(w60Var, i2);
            } else if (i == 1) {
                c1494uv = new gc1(w60Var, c0716hj.f4585b);
            } else if (i == 2) {
                c1494uv = new C0106bo(w60Var);
            } else {
                if (i != 3) {
                    f40.m2713i(jd0.m3609g(i, "Invalid end icon mode: "));
                    return null;
                }
                c1494uv = new p40(w60Var);
            }
        } else {
            c1494uv = new C1494uv(w60Var, 0);
        }
        sparseArray.append(i, c1494uv);
        return c1494uv;
    }

    /* JADX INFO: renamed from: c */
    public final int m6712c() {
        int iM5921c;
        if (m6713d() || m6714e()) {
            CheckableImageButton checkableImageButton = this.f11997g;
            iM5921c = ry0.m5921c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iM5921c = 0;
        }
        WeakHashMap weakHashMap = i72.f4849a;
        return t62.m6241e(this.f12007v) + t62.m6241e(this) + iM5921c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6713d() {
        return this.f11992b.getVisibility() == 0 && this.f11997g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6714e() {
        return this.f11993c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m6715f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        x60 x60VarM6711b = m6711b();
        boolean zMo2956j = x60VarM6711b.mo2956j();
        CheckableImageButton checkableImageButton = this.f11997g;
        boolean z4 = true;
        if (!zMo2956j || (z3 = checkableImageButton.f2072d) == x60VarM6711b.mo2957k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(x60VarM6711b instanceof p40) || (zIsActivated = checkableImageButton.isActivated()) == ((p40) x60VarM6711b).f8707l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ki0.m3848S(this.f11991a, checkableImageButton, this.f12001p);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6716g(int i) {
        if (this.f11999n == i) {
            return;
        }
        x60 x60VarM6711b = m6711b();
        InterfaceC1167o2 interfaceC1167o2 = this.f12011z;
        AccessibilityManager accessibilityManager = this.f12010y;
        if (interfaceC1167o2 != null && accessibilityManager != null) {
            AbstractC1130n2.m4498b(accessibilityManager, interfaceC1167o2);
        }
        this.f12011z = null;
        x60VarM6711b.mo1016r();
        this.f11999n = i;
        Iterator it = this.f12000o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            l41.m4035b();
            return;
        }
        m6717h(i != 0);
        x60 x60VarM6711b2 = m6711b();
        int iMo1009d = this.f11998m.f4584a;
        if (iMo1009d == 0) {
            iMo1009d = x60VarM6711b2.mo1009d();
        }
        Drawable drawableM3282r = iMo1009d != 0 ? hr1.m3282r(getContext(), iMo1009d) : null;
        CheckableImageButton checkableImageButton = this.f11997g;
        checkableImageButton.setImageDrawable(drawableM3282r);
        TextInputLayout textInputLayout = this.f11991a;
        if (drawableM3282r != null) {
            ki0.m3854a(textInputLayout, checkableImageButton, this.f12001p, this.f12002q);
            ki0.m3848S(textInputLayout, checkableImageButton, this.f12001p);
        }
        int iMo1008c = x60VarM6711b2.mo1008c();
        CharSequence text = iMo1008c != 0 ? getResources().getText(iMo1008c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(x60VarM6711b2.mo2956j());
        if (!x60VarM6711b2.mo5197i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        x60VarM6711b2.mo1015q();
        InterfaceC1167o2 interfaceC1167o2Mo5196h = x60VarM6711b2.mo5196h();
        this.f12011z = interfaceC1167o2Mo5196h;
        if (interfaceC1167o2Mo5196h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = i72.f4849a;
            if (v62.m6586b(this)) {
                AbstractC1130n2.m4497a(accessibilityManager, this.f12011z);
            }
        }
        View.OnClickListener onClickListenerMo1011f = x60VarM6711b2.mo1011f();
        View.OnLongClickListener onLongClickListener = this.f12005t;
        checkableImageButton.setOnClickListener(onClickListenerMo1011f);
        ki0.m3853Z(checkableImageButton, onLongClickListener);
        EditText editText = this.f12009x;
        if (editText != null) {
            x60VarM6711b2.mo1013l(editText);
            m6719j(x60VarM6711b2);
        }
        ki0.m3854a(textInputLayout, checkableImageButton, this.f12001p, this.f12002q);
        m6715f(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m6717h(boolean z) {
        if (m6713d() != z) {
            this.f11997g.setVisibility(z ? 0 : 8);
            m6720k();
            m6722m();
            this.f11991a.m1716q();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6718i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f11993c;
        checkableImageButton.setImageDrawable(drawable);
        m6721l();
        ki0.m3854a(this.f11991a, checkableImageButton, this.f11994d, this.f11995e);
    }

    /* JADX INFO: renamed from: j */
    public final void m6719j(x60 x60Var) {
        if (this.f12009x == null) {
            return;
        }
        if (x60Var.mo1010e() != null) {
            this.f12009x.setOnFocusChangeListener(x60Var.mo1010e());
        }
        if (x60Var.mo1012g() != null) {
            this.f11997g.setOnFocusChangeListener(x60Var.mo1012g());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6720k() {
        this.f11992b.setVisibility((this.f11997g.getVisibility() != 0 || m6714e()) ? 8 : 0);
        setVisibility((m6713d() || m6714e() || ((this.f12006u == null || this.f12008w) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: l */
    public final void m6721l() {
        CheckableImageButton checkableImageButton = this.f11993c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f11991a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2169o.f6470q && textInputLayout.m1712m()) ? 0 : 8);
        m6720k();
        m6722m();
        if (this.f11999n != 0) {
            return;
        }
        textInputLayout.m1716q();
    }

    /* JADX INFO: renamed from: m */
    public final void m6722m() {
        int iM6241e;
        TextInputLayout textInputLayout = this.f11991a;
        if (textInputLayout.f2152d == null) {
            return;
        }
        if (m6713d() || m6714e()) {
            iM6241e = 0;
        } else {
            EditText editText = textInputLayout.f2152d;
            WeakHashMap weakHashMap = i72.f4849a;
            iM6241e = t62.m6241e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2152d.getPaddingTop();
        int paddingBottom = textInputLayout.f2152d.getPaddingBottom();
        WeakHashMap weakHashMap2 = i72.f4849a;
        t62.m6247k(this.f12007v, dimensionPixelSize, paddingTop, iM6241e, paddingBottom);
    }

    /* JADX INFO: renamed from: n */
    public final void m6723n() {
        C0595e9 c0595e9 = this.f12007v;
        int visibility = c0595e9.getVisibility();
        int i = (this.f12006u == null || this.f12008w) ? 8 : 0;
        if (visibility != i) {
            m6711b().mo1014o(i == 0);
        }
        m6720k();
        c0595e9.setVisibility(i);
        this.f11991a.m1716q();
    }
}
