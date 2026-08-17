package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 {

    /* JADX INFO: renamed from: A */
    public boolean f12091A;

    /* JADX INFO: renamed from: B */
    public boolean f12092B;

    /* JADX INFO: renamed from: a */
    public final re1 f12094a;

    /* JADX INFO: renamed from: b */
    public final View f12095b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f12096c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f12097d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f12098e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f12099f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f12100g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f12101h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f12102i;

    /* JADX INFO: renamed from: j */
    public final View f12103j;

    /* JADX INFO: renamed from: k */
    public final View f12104k;

    /* JADX INFO: renamed from: l */
    public final AnimatorSet f12105l;

    /* JADX INFO: renamed from: m */
    public final AnimatorSet f12106m;

    /* JADX INFO: renamed from: n */
    public final AnimatorSet f12107n;

    /* JADX INFO: renamed from: o */
    public final AnimatorSet f12108o;

    /* JADX INFO: renamed from: p */
    public final AnimatorSet f12109p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f12110q;

    /* JADX INFO: renamed from: r */
    public final ValueAnimator f12111r;

    /* JADX INFO: renamed from: s */
    public final se1 f12112s = new se1(this, 0);

    /* JADX INFO: renamed from: t */
    public final se1 f12113t = new se1(this, 3);

    /* JADX INFO: renamed from: u */
    public final se1 f12114u = new se1(this, 4);

    /* JADX INFO: renamed from: v */
    public final se1 f12115v = new se1(this, 5);

    /* JADX INFO: renamed from: w */
    public final se1 f12116w = new se1(this, 6);

    /* JADX INFO: renamed from: x */
    public final fe1 f12117x = new fe1(this, 1);

    /* JADX INFO: renamed from: C */
    public boolean f12093C = true;

    /* JADX INFO: renamed from: z */
    public int f12119z = 0;

    /* JADX INFO: renamed from: y */
    public final ArrayList f12118y = new ArrayList();

    public we1(re1 re1Var) {
        this.f12094a = re1Var;
        final int i = 0;
        final int i2 = 3;
        final int i3 = 1;
        this.f12095b = re1Var.findViewById(R.id.exo_controls_background);
        this.f12096c = (ViewGroup) re1Var.findViewById(R.id.exo_center_controls);
        this.f12098e = (ViewGroup) re1Var.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) re1Var.findViewById(R.id.exo_bottom_bar);
        this.f12097d = viewGroup;
        this.f12102i = (ViewGroup) re1Var.findViewById(R.id.exo_time);
        View viewFindViewById = re1Var.findViewById(R.id.exo_progress);
        this.f12103j = viewFindViewById;
        this.f12099f = (ViewGroup) re1Var.findViewById(R.id.exo_basic_controls);
        this.f12100g = (ViewGroup) re1Var.findViewById(R.id.exo_extra_controls);
        this.f12101h = (ViewGroup) re1Var.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = re1Var.findViewById(R.id.exo_overflow_show);
        this.f12104k = viewFindViewById2;
        View viewFindViewById3 = re1Var.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int i4 = 8;
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC1597xn(this, i4));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC1597xn(this, i4));
        }
        final int i5 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, TouchPipeline.SIZE);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: te1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ we1 f10853b;

            {
                this.f10853b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i2;
                we1 we1Var = this.f10853b;
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = we1Var.f12095b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = we1Var.f12096c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = we1Var.f12098e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = we1Var.f12095b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = we1Var.f12096c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = we1Var.f12098e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ue1(this, i));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(TouchPipeline.SIZE, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: te1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ we1 f10853b;

            {
                this.f10853b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i;
                we1 we1Var = this.f10853b;
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = we1Var.f12095b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = we1Var.f12096c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = we1Var.f12098e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = we1Var.f12095b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = we1Var.f12096c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = we1Var.f12098e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new ue1(this, i3));
        Resources resources = re1Var.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12105l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ve1(this, re1Var, i));
        animatorSet.play(valueAnimatorOfFloat).with(m6763d(viewFindViewById, TouchPipeline.SIZE, dimension)).with(m6763d(viewGroup, TouchPipeline.SIZE, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f12106m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new ve1(this, re1Var, i3));
        animatorSet2.play(m6763d(viewFindViewById, dimension, dimension2)).with(m6763d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f12107n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new ve1(this, re1Var, i5));
        animatorSet3.play(valueAnimatorOfFloat).with(m6763d(viewFindViewById, TouchPipeline.SIZE, dimension2)).with(m6763d(viewGroup, TouchPipeline.SIZE, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f12108o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new ue1(this, i5));
        animatorSet4.play(valueAnimatorOfFloat2).with(m6763d(viewFindViewById, dimension, TouchPipeline.SIZE)).with(m6763d(viewGroup, dimension, TouchPipeline.SIZE));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f12109p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new ue1(this, i2));
        animatorSet5.play(valueAnimatorOfFloat2).with(m6763d(viewFindViewById, dimension2, TouchPipeline.SIZE)).with(m6763d(viewGroup, dimension2, TouchPipeline.SIZE));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(TouchPipeline.SIZE, 1.0f);
        this.f12110q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: te1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ we1 f10853b;

            {
                this.f10853b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i3;
                we1 we1Var = this.f10853b;
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = we1Var.f12095b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = we1Var.f12096c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = we1Var.f12098e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = we1Var.f12095b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = we1Var.f12096c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = we1Var.f12098e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new ue1(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, TouchPipeline.SIZE);
        this.f12111r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: te1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ we1 f10853b;

            {
                this.f10853b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i5;
                we1 we1Var = this.f10853b;
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = we1Var.f12095b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = we1Var.f12096c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = we1Var.f12098e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        we1Var.m6765a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = we1Var.f12095b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = we1Var.f12096c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = we1Var.f12098e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new ue1(this, 5));
    }

    /* JADX INFO: renamed from: c */
    public static int m6762c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* JADX INFO: renamed from: d */
    public static ObjectAnimator m6763d(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6764j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: renamed from: a */
    public final void m6765a(float f) {
        ViewGroup viewGroup = this.f12101h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f12102i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f12099f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6766b(View view) {
        return view != null && this.f12118y.contains(view);
    }

    /* JADX INFO: renamed from: e */
    public final void m6767e(Runnable runnable, long j) {
        if (j >= 0) {
            this.f12094a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6768f() {
        se1 se1Var = this.f12116w;
        re1 re1Var = this.f12094a;
        re1Var.removeCallbacks(se1Var);
        re1Var.removeCallbacks(this.f12113t);
        re1Var.removeCallbacks(this.f12115v);
        re1Var.removeCallbacks(this.f12114u);
    }

    /* JADX INFO: renamed from: g */
    public final void m6769g() {
        if (this.f12119z == 3) {
            return;
        }
        m6768f();
        int showTimeoutMs = this.f12094a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f12093C) {
                m6767e(this.f12116w, showTimeoutMs);
            } else if (this.f12119z == 1) {
                m6767e(this.f12114u, 2000L);
            } else {
                m6767e(this.f12115v, showTimeoutMs);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6770h(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f12118y;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f12091A && m6764j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: i */
    public final void m6771i(int i) {
        int i2 = this.f12119z;
        this.f12119z = i;
        re1 re1Var = this.f12094a;
        if (i == 2) {
            re1Var.setVisibility(8);
        } else if (i2 == 2) {
            re1Var.setVisibility(0);
        }
        if (i2 != i) {
            for (qe1 qe1Var : re1Var.f9968d) {
                re1Var.getVisibility();
                ((cf1) qe1Var).f1784c.m456l();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6772k() {
        if (!this.f12093C) {
            m6771i(0);
            m6769g();
            return;
        }
        int i = this.f12119z;
        if (i == 1) {
            this.f12108o.start();
        } else if (i == 2) {
            this.f12109p.start();
        } else if (i == 3) {
            this.f12092B = true;
        } else if (i == 4) {
            return;
        }
        m6769g();
    }
}
