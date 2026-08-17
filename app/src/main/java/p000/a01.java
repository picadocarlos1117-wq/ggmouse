package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f5a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b01 f7c;

    public a01(b01 b01Var, boolean z, int i) {
        this.f7c = b01Var;
        this.f5a = z;
        this.f6b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b01 b01Var = this.f7c;
        b01Var.f13609b.setTranslationX(TouchPipeline.SIZE);
        b01Var.m818a(TouchPipeline.SIZE, this.f5a, this.f6b);
    }
}
