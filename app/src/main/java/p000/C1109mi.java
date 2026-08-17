package p000;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: mi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1109mi implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6995b;

    public /* synthetic */ C1109mi(Object obj, int i) {
        this.f6994a = i;
        this.f6995b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f6994a;
        Object obj = this.f6995b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zz0 zz0Var = ((BottomSheetBehavior) obj).f1994i;
                if (zz0Var != null) {
                    yz0 yz0Var = zz0Var.f13626a;
                    if (yz0Var.f13180i != fFloatValue) {
                        yz0Var.f13180i = fFloatValue;
                        zz0Var.f13630e = true;
                        zz0Var.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                s90 s90Var = (s90) obj;
                s90Var.f10289c.setAlpha(iFloatValue);
                s90Var.f10290d.setAlpha(iFloatValue);
                s90Var.f10305s.invalidate();
                break;
            default:
                ((TextInputLayout) obj).f2192z0.m5306k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
