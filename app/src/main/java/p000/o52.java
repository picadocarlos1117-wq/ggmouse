package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o52 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f7666a;

    public o52(Drawable.ConstantState constantState) {
        this.f7666a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f7666a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7666a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        p52 p52Var = new p52();
        p52Var.f4069a = (VectorDrawable) this.f7666a.newDrawable();
        return p52Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        p52 p52Var = new p52();
        p52Var.f4069a = (VectorDrawable) this.f7666a.newDrawable(resources);
        return p52Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p52 p52Var = new p52();
        p52Var.f4069a = (VectorDrawable) this.f7666a.newDrawable(resources, theme);
        return p52Var;
    }
}
