package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: renamed from: nz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1163nz extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1276oz f7587b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f7588c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f7589d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1350qz f7590e;

    public /* synthetic */ C1163nz(C1350qz c1350qz, C1276oz c1276oz, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f7586a = i;
        this.f7590e = c1350qz;
        this.f7587b = c1276oz;
        this.f7588c = viewPropertyAnimator;
        this.f7589d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f7586a;
        C1276oz c1276oz = this.f7587b;
        C1350qz c1350qz = this.f7590e;
        View view = this.f7589d;
        ViewPropertyAnimator viewPropertyAnimator = this.f7588c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(TouchPipeline.SIZE);
                view.setTranslationY(TouchPipeline.SIZE);
                c1350qz.m647c(c1276oz.f8583a);
                c1350qz.f9621r.remove(c1276oz.f8583a);
                c1350qz.m5624i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(TouchPipeline.SIZE);
                view.setTranslationY(TouchPipeline.SIZE);
                c1350qz.m647c(c1276oz.f8584b);
                c1350qz.f9621r.remove(c1276oz.f8584b);
                c1350qz.m5624i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7586a) {
            case 0:
                this.f7590e.getClass();
                break;
            default:
                this.f7590e.getClass();
                break;
        }
    }
}
