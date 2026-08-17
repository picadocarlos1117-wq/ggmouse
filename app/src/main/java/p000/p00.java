package p000;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p00 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8605b;

    public /* synthetic */ p00(Object obj, int i) {
        this.f8604a = i;
        this.f8605b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f8604a;
        Object obj = this.f8605b;
        switch (i) {
            case 0:
                q00 q00Var = (q00) obj;
                q00Var.f9257K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00Var.invalidate(q00Var.f9267a);
                break;
            default:
                ((p40) obj).f12463d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
