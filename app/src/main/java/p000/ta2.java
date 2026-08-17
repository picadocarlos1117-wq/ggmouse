package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ta2 extends sa2 {

    /* JADX INFO: renamed from: m */
    public un0 f10815m;

    public ta2(bb2 bb2Var, WindowInsets windowInsets) {
        super(bb2Var, windowInsets);
        this.f10815m = null;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: b */
    public bb2 mo6259b() {
        return bb2.m960g(null, this.f10341c.consumeStableInsets());
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: c */
    public bb2 mo6260c() {
        return bb2.m960g(null, this.f10341c.consumeSystemWindowInsets());
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: h */
    public final un0 mo6261h() {
        if (this.f10815m == null) {
            WindowInsets windowInsets = this.f10341c;
            this.f10815m = un0.m6514b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f10815m;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: m */
    public boolean mo6262m() {
        return this.f10341c.isConsumed();
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: q */
    public void mo6263q(un0 un0Var) {
        this.f10815m = un0Var;
    }
}
