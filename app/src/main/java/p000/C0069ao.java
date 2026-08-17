package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: ao */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0069ao extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0106bo f1007b;

    public /* synthetic */ C0069ao(C0106bo c0106bo, int i) {
        this.f1006a = i;
        this.f1007b = c0106bo;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1006a) {
            case 1:
                this.f1007b.f12461b.m6717h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1006a) {
            case 0:
                this.f1007b.f12461b.m6717h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
