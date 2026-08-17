package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends gj1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f10419a;

    public sj1(RecyclerView recyclerView) {
        this.f10419a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m6106a() {
        boolean z = RecyclerView.f868H0;
        RecyclerView recyclerView = this.f10419a;
        if (!z || !recyclerView.f943y || !recyclerView.f941x) {
            recyclerView.f882F = true;
            recyclerView.requestLayout();
        } else {
            bj1 bj1Var = recyclerView.f921n;
            WeakHashMap weakHashMap = i72.f4849a;
            s62.m5992m(recyclerView, bj1Var);
        }
    }
}
