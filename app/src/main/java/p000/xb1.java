package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xb1 extends ws0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ yb1 f12515q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(yb1 yb1Var, Context context) {
        super(context);
        this.f12515q = yb1Var;
    }

    @Override // p000.ws0
    /* JADX INFO: renamed from: d */
    public final float mo5278d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // p000.ws0
    /* JADX INFO: renamed from: e */
    public final int mo6827e(int i) {
        return Math.min(100, super.mo6827e(i));
    }

    @Override // p000.ws0
    /* JADX INFO: renamed from: h */
    public final void mo6829h(View view, uj1 uj1Var) {
        yb1 yb1Var = this.f12515q;
        int[] iArrM7073a = yb1Var.m7073a(yb1Var.f12928a.getLayoutManager(), view);
        int i = iArrM7073a[0];
        int i2 = iArrM7073a[1];
        int iCeil = (int) Math.ceil(((double) mo6827e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            uj1Var.f11316a = i;
            uj1Var.f11317b = i2;
            uj1Var.f11318c = iCeil;
            uj1Var.f11320e = this.f12280j;
            uj1Var.f11321f = true;
        }
    }
}
