package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: e6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0592e6 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rz0 f3215a;

    public C0592e6(rz0 rz0Var) {
        this.f3215a = rz0Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3215a.f10163b.f11069t;
        if (colorStateList != null) {
            v30.m6560h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        tz0 tz0Var = this.f3215a.f10163b;
        ColorStateList colorStateList = tz0Var.f11069t;
        if (colorStateList != null) {
            v30.m6559g(drawable, colorStateList.getColorForState(tz0Var.f11073x, colorStateList.getDefaultColor()));
        }
    }
}
