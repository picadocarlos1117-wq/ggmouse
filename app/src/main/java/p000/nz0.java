package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nz0 extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f7591E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ qz0 f7592F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(qz0 qz0Var, int i, int i2) {
        super(i);
        this.f7592F = qz0Var;
        this.f7591E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0066e
    /* JADX INFO: renamed from: w0 */
    public final void mo544w0(RecyclerView recyclerView, int i) {
        C1299pl c1299pl = new C1299pl(recyclerView.getContext());
        c1299pl.f12271a = i;
        m680x0(c1299pl);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: z0 */
    public final void mo545z0(wj1 wj1Var, int[] iArr) {
        qz0 qz0Var = this.f7592F;
        RecyclerView recyclerView = qz0Var.f9628m;
        if (this.f7591E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = qz0Var.f9628m.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = qz0Var.f9628m.getHeight();
        }
    }
}
