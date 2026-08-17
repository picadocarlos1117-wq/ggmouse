package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends i31 implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final r31 f7580A;

    /* JADX INFO: renamed from: z */
    public final i31 f7581z;

    public nx1(Context context, i31 i31Var, r31 r31Var) {
        super(context);
        this.f7581z = i31Var;
        this.f7580A = r31Var;
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: d */
    public final boolean mo3341d(r31 r31Var) {
        return this.f7581z.mo3341d(r31Var);
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: e */
    public final boolean mo3342e(i31 i31Var, MenuItem menuItem) {
        return super.mo3342e(i31Var, menuItem) || this.f7581z.mo3342e(i31Var, menuItem);
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: f */
    public final boolean mo3343f(r31 r31Var) {
        return this.f7581z.mo3343f(r31Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f7580A;
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: j */
    public final String mo3347j() {
        r31 r31Var = this.f7580A;
        int i = r31Var != null ? r31Var.f9671a : 0;
        if (i == 0) {
            return null;
        }
        return jd0.m3609g(i, "android:menu:actionviewstates:");
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: k */
    public final i31 mo3348k() {
        return this.f7581z.mo3348k();
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: m */
    public final boolean mo3350m() {
        return this.f7581z.mo3350m();
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: n */
    public final boolean mo3351n() {
        return this.f7581z.mo3351n();
    }

    @Override // p000.i31
    /* JADX INFO: renamed from: o */
    public final boolean mo3352o() {
        return this.f7581z.mo3352o();
    }

    @Override // p000.i31, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f7581z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m3358u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m3358u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m3358u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f7580A.setIcon(drawable);
        return this;
    }

    @Override // p000.i31, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f7581z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f7580A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m3358u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m3358u(i, null, 0, null, null);
        return this;
    }
}
