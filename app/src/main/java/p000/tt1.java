package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tt1 extends oj1 {

    /* JADX INFO: renamed from: a */
    public boolean f11015a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yb1 f11016b;

    public tt1(yb1 yb1Var) {
        this.f11016b = yb1Var;
    }

    @Override // p000.oj1
    /* JADX INFO: renamed from: a */
    public final void mo4806a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f11015a) {
            this.f11015a = false;
            this.f11016b.m7076f();
        }
    }

    @Override // p000.oj1
    /* JADX INFO: renamed from: b */
    public final void mo4807b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f11015a = true;
    }
}
