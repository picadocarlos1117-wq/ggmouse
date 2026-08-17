package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.textfield.TextInputLayout;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 {

    /* JADX INFO: renamed from: A */
    public ColorStateList f6452A;

    /* JADX INFO: renamed from: B */
    public Typeface f6453B;

    /* JADX INFO: renamed from: a */
    public final int f6454a;

    /* JADX INFO: renamed from: b */
    public final int f6455b;

    /* JADX INFO: renamed from: c */
    public final int f6456c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f6457d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f6458e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f6459f;

    /* JADX INFO: renamed from: g */
    public final Context f6460g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f6461h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f6462i;

    /* JADX INFO: renamed from: j */
    public int f6463j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f6464k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f6465l;

    /* JADX INFO: renamed from: m */
    public final float f6466m;

    /* JADX INFO: renamed from: n */
    public int f6467n;

    /* JADX INFO: renamed from: o */
    public int f6468o;

    /* JADX INFO: renamed from: p */
    public CharSequence f6469p;

    /* JADX INFO: renamed from: q */
    public boolean f6470q;

    /* JADX INFO: renamed from: r */
    public C0595e9 f6471r;

    /* JADX INFO: renamed from: s */
    public CharSequence f6472s;

    /* JADX INFO: renamed from: t */
    public int f6473t;

    /* JADX INFO: renamed from: u */
    public int f6474u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f6475v;

    /* JADX INFO: renamed from: w */
    public CharSequence f6476w;

    /* JADX INFO: renamed from: x */
    public boolean f6477x;

    /* JADX INFO: renamed from: y */
    public C0595e9 f6478y;

    /* JADX INFO: renamed from: z */
    public int f6479z;

    public ln0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6460g = context;
        this.f6461h = textInputLayout;
        this.f6466m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f6454a = rc2.m5790j0(context, R.attr.motionDurationShort4, 217);
        this.f6455b = rc2.m5790j0(context, R.attr.motionDurationMedium4, 167);
        this.f6456c = rc2.m5790j0(context, R.attr.motionDurationShort4, 167);
        this.f6457d = rc2.m5792k0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0779j6.f5287d);
        LinearInterpolator linearInterpolator = AbstractC0779j6.f5284a;
        this.f6458e = rc2.m5792k0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f6459f = rc2.m5792k0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m4260a(C0595e9 c0595e9, int i) {
        if (this.f6462i == null && this.f6464k == null) {
            Context context = this.f6460g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f6462i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f6462i;
            TextInputLayout textInputLayout = this.f6461h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f6464k = new FrameLayout(context);
            this.f6462i.addView(this.f6464k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m4261b();
            }
        }
        if (i == 0 || i == 1) {
            this.f6464k.setVisibility(0);
            this.f6464k.addView(c0595e9);
        } else {
            this.f6462i.addView(c0595e9, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6462i.setVisibility(0);
        this.f6463j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m4261b() {
        if (this.f6462i != null) {
            TextInputLayout textInputLayout = this.f6461h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f6460g;
                boolean zM4647R = o21.m4647R(context);
                LinearLayout linearLayout = this.f6462i;
                WeakHashMap weakHashMap = i72.f4849a;
                int iM6242f = t62.m6242f(editText);
                if (zM4647R) {
                    iM6242f = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM4647R) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int iM6241e = t62.m6241e(editText);
                if (zM4647R) {
                    iM6241e = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                t62.m6247k(linearLayout, iM6242f, dimensionPixelSize, iM6241e, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4262c() {
        AnimatorSet animatorSet = this.f6465l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4263d(ArrayList arrayList, boolean z, C0595e9 c0595e9, int i, int i2, int i3) {
        if (c0595e9 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0595e9, (Property<C0595e9, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f6456c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f6455b : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f6458e : this.f6459f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0595e9, (Property<C0595e9, Float>) View.TRANSLATION_Y, -this.f6466m, TouchPipeline.SIZE);
            objectAnimatorOfFloat2.setDuration(this.f6454a);
            objectAnimatorOfFloat2.setInterpolator(this.f6457d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m4264e(int i) {
        if (i == 1) {
            return this.f6471r;
        }
        if (i != 2) {
            return null;
        }
        return this.f6478y;
    }

    /* JADX INFO: renamed from: f */
    public final void m4265f() {
        this.f6469p = null;
        m4262c();
        if (this.f6467n == 1) {
            if (!this.f6477x || TextUtils.isEmpty(this.f6476w)) {
                this.f6468o = 0;
            } else {
                this.f6468o = 2;
            }
        }
        m4268i(this.f6467n, this.f6468o, m4267h(this.f6471r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m4266g(C0595e9 c0595e9, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6462i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f6464k) != null) {
            frameLayout.removeView(c0595e9);
        } else {
            linearLayout.removeView(c0595e9);
        }
        int i2 = this.f6463j - 1;
        this.f6463j = i2;
        LinearLayout linearLayout2 = this.f6462i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4267h(C0595e9 c0595e9, CharSequence charSequence) {
        WeakHashMap weakHashMap = i72.f4849a;
        TextInputLayout textInputLayout = this.f6461h;
        if (v62.m6587c(textInputLayout) && textInputLayout.isEnabled()) {
            return (this.f6468o == this.f6467n && c0595e9 != null && TextUtils.equals(c0595e9.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m4268i(int i, int i2, boolean z) {
        TextView textViewM4264e;
        TextView textViewM4264e2;
        ln0 ln0Var = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            ln0Var.f6465l = animatorSet;
            ArrayList arrayList = new ArrayList();
            ln0Var.m4263d(arrayList, ln0Var.f6477x, ln0Var.f6478y, 2, i, i2);
            ln0Var.m4263d(arrayList, ln0Var.f6470q, ln0Var.f6471r, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            jn0 jn0Var = new jn0(this, i2, m4264e(i), i, ln0Var.m4264e(i2));
            ln0Var = this;
            animatorSet.addListener(jn0Var);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM4264e2 = ln0Var.m4264e(i2)) != null) {
                textViewM4264e2.setVisibility(0);
                textViewM4264e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM4264e = m4264e(i)) != null) {
                textViewM4264e.setVisibility(4);
                if (i == 1) {
                    textViewM4264e.setText((CharSequence) null);
                }
            }
            ln0Var.f6467n = i2;
        }
        TextInputLayout textInputLayout = ln0Var.f6461h;
        textInputLayout.m1717r();
        textInputLayout.m1720u(z, false);
        textInputLayout.m1723x();
    }
}
