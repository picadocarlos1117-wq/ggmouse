package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC0068g;

/* JADX INFO: renamed from: lz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1089lz extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6558a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0068g f6559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f6560c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f6561d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1350qz f6562e;

    public C1089lz(C1350qz c1350qz, AbstractC0068g abstractC0068g, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f6562e = c1350qz;
        this.f6559b = abstractC0068g;
        this.f6561d = viewPropertyAnimator;
        this.f6560c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6558a) {
            case 1:
                this.f6560c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6558a;
        AbstractC0068g abstractC0068g = this.f6559b;
        C1350qz c1350qz = this.f6562e;
        ViewPropertyAnimator viewPropertyAnimator = this.f6561d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f6560c.setAlpha(1.0f);
                c1350qz.m647c(abstractC0068g);
                c1350qz.f9620q.remove(abstractC0068g);
                c1350qz.m5624i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                c1350qz.m647c(abstractC0068g);
                c1350qz.f9618o.remove(abstractC0068g);
                c1350qz.m5624i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f6558a) {
            case 0:
                this.f6562e.getClass();
                break;
            default:
                this.f6562e.getClass();
                break;
        }
    }

    public C1089lz(C1350qz c1350qz, AbstractC0068g abstractC0068g, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f6562e = c1350qz;
        this.f6559b = abstractC0068g;
        this.f6560c = view;
        this.f6561d = viewPropertyAnimator;
    }
}
