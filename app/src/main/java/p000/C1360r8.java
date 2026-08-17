package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1360r8 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0819k8 f9807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1397s8 f9808b;

    public C1360r8(C1397s8 c1397s8, ViewTreeObserverOnGlobalLayoutListenerC0819k8 viewTreeObserverOnGlobalLayoutListenerC0819k8) {
        this.f9808b = c1397s8;
        this.f9807a = viewTreeObserverOnGlobalLayoutListenerC0819k8;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f9808b.f10282L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9807a);
        }
    }
}
