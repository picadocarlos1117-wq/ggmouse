package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.r */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0054r implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0059w f696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0055s f697b;

    public ViewOnAttachStateChangeListenerC0054r(LayoutInflaterFactory2C0055s layoutInflaterFactory2C0055s, C0059w c0059w) {
        this.f697b = layoutInflaterFactory2C0055s;
        this.f696a = c0059w;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0059w c0059w = this.f696a;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0059w.f760c;
        c0059w.m427i();
        C0042f.m340h((ViewGroup) abstractComponentCallbacksC0048l.mView.getParent(), this.f697b.f698a.m371F()).m347g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
