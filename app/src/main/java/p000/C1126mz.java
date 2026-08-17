package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC0068g;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: renamed from: mz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1126mz extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0068g f7144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7145b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7146c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7147d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f7148e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1350qz f7149f;

    public C1126mz(C1350qz c1350qz, AbstractC0068g abstractC0068g, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7149f = c1350qz;
        this.f7144a = abstractC0068g;
        this.f7145b = i;
        this.f7146c = view;
        this.f7147d = i2;
        this.f7148e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f7145b;
        View view = this.f7146c;
        if (i != 0) {
            view.setTranslationX(TouchPipeline.SIZE);
        }
        if (this.f7147d != 0) {
            view.setTranslationY(TouchPipeline.SIZE);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7148e.setListener(null);
        C1350qz c1350qz = this.f7149f;
        AbstractC0068g abstractC0068g = this.f7144a;
        c1350qz.m647c(abstractC0068g);
        c1350qz.f9619p.remove(abstractC0068g);
        c1350qz.m5624i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7149f.getClass();
    }
}
