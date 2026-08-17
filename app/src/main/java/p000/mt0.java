package p000;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mt0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ot0 f7094a;

    public mt0(ot0 ot0Var) {
        this.f7094a = ot0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        ot0 ot0Var = this.f7094a;
        lt0 lt0Var = ot0Var.f8488w;
        C0126c8 c0126c8 = ot0Var.f8470E;
        if (i != 1 || c0126c8.getInputMethodMode() == 2 || c0126c8.getContentView() == null) {
            return;
        }
        ot0Var.f8466A.removeCallbacks(lt0Var);
        lt0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
