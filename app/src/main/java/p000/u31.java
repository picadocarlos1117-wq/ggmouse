package p000;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u31 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f11108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v31 f11109b;

    public u31(v31 v31Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11109b = v31Var;
        this.f11108a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11108a.onMenuItemActionCollapse(this.f11109b.m4715f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11108a.onMenuItemActionExpand(this.f11109b.m4715f(menuItem));
    }
}
