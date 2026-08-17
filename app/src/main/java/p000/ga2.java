package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ga2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ma2 f4122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bb2 f4123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bb2 f4124c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4125d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f4126e;

    public ga2(ma2 ma2Var, bb2 bb2Var, bb2 bb2Var2, int i, View view) {
        this.f4122a = ma2Var;
        this.f4123b = bb2Var;
        this.f4124c = bb2Var2;
        this.f4125d = i;
        this.f4126e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ma2 ma2Var = this.f4122a;
        la2 la2Var = ma2Var.f6733a;
        la2Var.mo3816d(animatedFraction);
        float fMo3814b = la2Var.mo3814b();
        PathInterpolator pathInterpolator = ia2.f4904e;
        int i = Build.VERSION.SDK_INT;
        bb2 bb2Var = this.f4123b;
        ra2 qa2Var = i >= 30 ? new qa2(bb2Var) : i >= 29 ? new pa2(bb2Var) : new oa2(bb2Var);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            int i3 = this.f4125d & i2;
            ya2 ya2Var = bb2Var.f1285a;
            if (i3 == 0) {
                qa2Var.mo5462c(i2, ya2Var.mo6018f(i2));
            } else {
                un0 un0VarMo6018f = ya2Var.mo6018f(i2);
                un0 un0VarMo6018f2 = this.f4124c.f1285a.mo6018f(i2);
                float f = 1.0f - fMo3814b;
                qa2Var.mo5462c(i2, bb2.m959e(un0VarMo6018f, (int) (((double) ((un0VarMo6018f.f11368a - un0VarMo6018f2.f11368a) * f)) + 0.5d), (int) (((double) ((un0VarMo6018f.f11369b - un0VarMo6018f2.f11369b) * f)) + 0.5d), (int) (((double) ((un0VarMo6018f.f11370c - un0VarMo6018f2.f11370c) * f)) + 0.5d), (int) (((double) ((un0VarMo6018f.f11371d - un0VarMo6018f2.f11371d) * f)) + 0.5d)));
            }
        }
        ia2.m3406g(this.f4126e, qa2Var.mo4787b(), Collections.singletonList(ma2Var));
    }
}
