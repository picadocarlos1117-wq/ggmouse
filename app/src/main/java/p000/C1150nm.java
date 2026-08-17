package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: nm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1150nm extends u22 {

    /* JADX INFO: renamed from: a */
    public boolean f7448a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f7449b;

    public C1150nm(ViewGroup viewGroup) {
        this.f7449b = viewGroup;
    }

    @Override // p000.u22, p000.s22
    /* JADX INFO: renamed from: a */
    public final void mo4507a() {
        hp0.m3205O(this.f7449b, false);
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: b */
    public final void mo149b(t22 t22Var) {
        if (!this.f7448a) {
            hp0.m3205O(this.f7449b, false);
        }
        t22Var.m6218w(this);
    }

    @Override // p000.u22, p000.s22
    /* JADX INFO: renamed from: c */
    public final void mo4560c() {
        hp0.m3205O(this.f7449b, false);
        this.f7448a = true;
    }

    @Override // p000.u22, p000.s22
    /* JADX INFO: renamed from: e */
    public final void mo4508e() {
        hp0.m3205O(this.f7449b, true);
    }
}
