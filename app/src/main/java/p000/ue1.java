package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11278a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ we1 f11279b;

    public /* synthetic */ ue1(we1 we1Var, int i) {
        this.f11278a = i;
        this.f11279b = we1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.f11278a;
        we1 we1Var = this.f11279b;
        switch (i) {
            case 0:
                View view = we1Var.f12095b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = we1Var.f12096c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = we1Var.f12098e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                we1Var.m6771i(0);
                break;
            case 3:
                we1Var.m6771i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = we1Var.f12099f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = we1Var.f12101h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f11278a;
        we1 we1Var = this.f11279b;
        switch (i) {
            case 0:
                View view = we1Var.f12103j;
                if ((view instanceof q00) && !we1Var.f12091A) {
                    q00 q00Var = (q00) view;
                    ValueAnimator valueAnimator = q00Var.f9256J;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(q00Var.f9257K, TouchPipeline.SIZE);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = we1Var.f12095b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = we1Var.f12096c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = we1Var.f12098e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(we1Var.f12091A ? 0 : 4);
                }
                View view3 = we1Var.f12103j;
                if ((view3 instanceof q00) && !we1Var.f12091A) {
                    q00 q00Var2 = (q00) view3;
                    ValueAnimator valueAnimator2 = q00Var2.f9256J;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    q00Var2.f9258L = false;
                    valueAnimator2.setFloatValues(q00Var2.f9257K, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                we1Var.m6771i(4);
                break;
            case 3:
                we1Var.m6771i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = we1Var.f12101h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    viewGroup3.setTranslationX(viewGroup3.getWidth());
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup4 = we1Var.f12099f;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                }
                break;
        }
    }
}
