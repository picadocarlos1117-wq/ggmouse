package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.internal.CheckableImageButton;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: bo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0106bo extends x60 {

    /* JADX INFO: renamed from: e */
    public final int f1445e;

    /* JADX INFO: renamed from: f */
    public final int f1446f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f1447g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f1448h;

    /* JADX INFO: renamed from: i */
    public EditText f1449i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC1597xn f1450j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC1634yn f1451k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f1452l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f1453m;

    public C0106bo(w60 w60Var) {
        super(w60Var);
        this.f1450j = new ViewOnClickListenerC1597xn(this, 0);
        this.f1451k = new ViewOnFocusChangeListenerC1634yn(this, 0);
        this.f1445e = rc2.m5790j0(w60Var.getContext(), R.attr.motionDurationShort3, 100);
        this.f1446f = rc2.m5790j0(w60Var.getContext(), R.attr.motionDurationShort3, 150);
        this.f1447g = rc2.m5792k0(w60Var.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0779j6.f5284a);
        this.f1448h = rc2.m5792k0(w60Var.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0779j6.f5287d);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: a */
    public final void mo1007a() {
        if (this.f12461b.f12006u != null) {
            return;
        }
        m1017s(m1018t());
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: c */
    public final int mo1008c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: d */
    public final int mo1009d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo1010e() {
        return this.f1451k;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo1011f() {
        return this.f1450j;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo1012g() {
        return this.f1451k;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: l */
    public final void mo1013l(EditText editText) {
        this.f1449i = editText;
        this.f12460a.setEndIconVisible(m1018t());
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: o */
    public final void mo1014o(boolean z) {
        if (this.f12461b.f12006u == null) {
            return;
        }
        m1017s(z);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: q */
    public final void mo1015q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f1448h);
        valueAnimatorOfFloat.setDuration(this.f1446f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zn

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0106bo f13494b;

            {
                this.f13494b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                C0106bo c0106bo = this.f13494b;
                switch (i2) {
                    case 0:
                        c0106bo.f12463d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0106bo.f12463d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(TouchPipeline.SIZE, 1.0f);
        TimeInterpolator timeInterpolator = this.f1447g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f1445e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zn

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0106bo f13494b;

            {
                this.f13494b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                C0106bo c0106bo = this.f13494b;
                switch (i4) {
                    case 0:
                        c0106bo.f12463d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0106bo.f12463d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1452l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f1452l.addListener(new C0069ao(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, TouchPipeline.SIZE);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zn

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0106bo f13494b;

            {
                this.f13494b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                C0106bo c0106bo = this.f13494b;
                switch (i4) {
                    case 0:
                        c0106bo.f12463d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0106bo.f12463d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f1453m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0069ao(this, i));
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: r */
    public final void mo1016r() {
        EditText editText = this.f1449i;
        if (editText != null) {
            editText.post(new RunnableC1430t4(this, 6));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1017s(boolean z) {
        boolean z2 = this.f12461b.m6713d() == z;
        if (z && !this.f1452l.isRunning()) {
            this.f1453m.cancel();
            this.f1452l.start();
            if (z2) {
                this.f1452l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f1452l.cancel();
        this.f1453m.start();
        if (z2) {
            this.f1453m.end();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1018t() {
        EditText editText = this.f1449i;
        if (editText != null) {
            return (editText.hasFocus() || this.f12463d.hasFocus()) && this.f1449i.getText().length() > 0;
        }
        return false;
    }
}
