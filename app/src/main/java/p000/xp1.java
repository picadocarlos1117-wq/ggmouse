package p000;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xp1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f12690b;

    public /* synthetic */ xp1(SearchView searchView, int i) {
        this.f12689a = i;
        this.f12690b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12689a;
        SearchView searchView = this.f12690b;
        switch (i) {
            case 0:
                searchView.m247s();
                break;
            default:
                AbstractC1420sv abstractC1420sv = searchView.f471T;
                if (abstractC1420sv instanceof cy1) {
                    abstractC1420sv.mo2141b(null);
                }
                break;
        }
    }
}
