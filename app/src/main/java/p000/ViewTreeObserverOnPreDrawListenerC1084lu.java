package p000;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: lu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1084lu implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f6510a;

    public ViewTreeObserverOnPreDrawListenerC1084lu(CoordinatorLayout coordinatorLayout) {
        this.f6510a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f6510a.m300p(0);
        return true;
    }
}
