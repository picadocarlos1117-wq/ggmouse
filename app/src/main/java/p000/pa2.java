package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class pa2 extends ra2 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f8824c;

    public pa2(bb2 bb2Var) {
        super(bb2Var);
        WindowInsets windowInsetsM965f = bb2Var.m965f();
        this.f8824c = windowInsetsM965f != null ? d11.m2185h(windowInsetsM965f) : d11.m2184g();
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: b */
    public bb2 mo4787b() {
        m5757a();
        bb2 bb2VarM960g = bb2.m960g(null, this.f8824c.build());
        bb2VarM960g.f1285a.mo6022o(this.f9865b);
        return bb2VarM960g;
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: d */
    public void mo5238d(un0 un0Var) {
        this.f8824c.setMandatorySystemGestureInsets(un0Var.m6516d());
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: e */
    public void mo4788e(un0 un0Var) {
        this.f8824c.setStableInsets(un0Var.m6516d());
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: f */
    public void mo5239f(un0 un0Var) {
        this.f8824c.setSystemGestureInsets(un0Var.m6516d());
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: g */
    public void mo4789g(un0 un0Var) {
        this.f8824c.setSystemWindowInsets(un0Var.m6516d());
    }

    @Override // p000.ra2
    /* JADX INFO: renamed from: h */
    public void mo5240h(un0 un0Var) {
        this.f8824c.setTappableElementInsets(un0Var.m6516d());
    }

    public pa2() {
        this.f8824c = d11.m2184g();
    }
}
