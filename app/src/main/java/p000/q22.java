package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q22 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9314a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9315b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9316c;

    public q22(t22 t22Var, C0633fa c0633fa) {
        this.f9314a = 0;
        this.f9316c = t22Var;
        this.f9315b = c0633fa;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f9314a) {
            case 1:
                ((d82) this.f9315b).mo2288a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f9314a;
        Object obj = this.f9316c;
        Object obj2 = this.f9315b;
        switch (i) {
            case 0:
                ((C0633fa) obj2).remove(animator);
                ((t22) obj).f10725r.remove(animator);
                break;
            case 1:
                ((d82) obj2).mo139f();
                break;
            default:
                ((ma2) obj2).f6733a.mo3816d(1.0f);
                ia2.m3404e((View) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9314a) {
            case 0:
                ((t22) this.f9316c).f10725r.add(animator);
                break;
            case 1:
                ((d82) this.f9315b).mo2289e();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ q22(Object obj, View view, int i) {
        this.f9314a = i;
        this.f9315b = obj;
        this.f9316c = view;
    }
}
