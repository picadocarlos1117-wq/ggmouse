package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: h6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0703h6 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f4454a;

    public C0703h6(Drawable.ConstantState constantState) {
        this.f4454a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4454a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4454a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0740i6 c0740i6 = new C0740i6(null);
        Drawable drawableNewDrawable = this.f4454a.newDrawable();
        c0740i6.f4069a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0740i6.f4833f);
        return c0740i6;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0740i6 c0740i6 = new C0740i6(null);
        Drawable drawableNewDrawable = this.f4454a.newDrawable(resources);
        c0740i6.f4069a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0740i6.f4833f);
        return c0740i6;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0740i6 c0740i6 = new C0740i6(null);
        Drawable drawableNewDrawable = this.f4454a.newDrawable(resources, theme);
        c0740i6.f4069a = drawableNewDrawable;
        drawableNewDrawable.setCallback(c0740i6.f4833f);
        return c0740i6;
    }
}
