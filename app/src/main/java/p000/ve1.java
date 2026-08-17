package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ re1 f11645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ we1 f11646c;

    public /* synthetic */ ve1(we1 we1Var, re1 re1Var, int i) {
        this.f11644a = i;
        this.f11646c = we1Var;
        this.f11645b = re1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f11644a;
        re1 re1Var = this.f11645b;
        we1 we1Var = this.f11646c;
        switch (i) {
            case 0:
                we1Var.m6771i(1);
                if (we1Var.f12092B) {
                    re1Var.post(we1Var.f12112s);
                    we1Var.f12092B = false;
                }
                break;
            case 1:
                we1Var.m6771i(2);
                if (we1Var.f12092B) {
                    re1Var.post(we1Var.f12112s);
                    we1Var.f12092B = false;
                }
                break;
            default:
                we1Var.m6771i(2);
                if (we1Var.f12092B) {
                    re1Var.post(we1Var.f12112s);
                    we1Var.f12092B = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f11644a;
        we1 we1Var = this.f11646c;
        switch (i) {
            case 0:
                we1Var.m6771i(3);
                break;
            case 1:
                we1Var.m6771i(3);
                break;
            default:
                we1Var.m6771i(3);
                break;
        }
    }
}
