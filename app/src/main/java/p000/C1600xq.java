package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: xq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1600xq implements ks0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC0613er f12692b;

    public /* synthetic */ C1600xq(AbstractActivityC0613er abstractActivityC0613er, int i) {
        this.f12691a = i;
        this.f12692b = abstractActivityC0613er;
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        switch (this.f12691a) {
            case 0:
                if (ds0Var == ds0.ON_DESTROY) {
                    this.f12692b.mContextAwareHelper.f9575b = null;
                    if (!this.f12692b.isChangingConfigurations()) {
                        this.f12692b.getViewModelStore().m6597a();
                    }
                    ViewTreeObserverOnDrawListenerC0540cr viewTreeObserverOnDrawListenerC0540cr = (ViewTreeObserverOnDrawListenerC0540cr) this.f12692b.mReportFullyDrawnExecutor;
                    AbstractActivityC0613er abstractActivityC0613er = viewTreeObserverOnDrawListenerC0540cr.f2604d;
                    abstractActivityC0613er.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0540cr);
                    abstractActivityC0613er.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0540cr);
                }
                break;
            case 1:
                if (ds0Var == ds0.ON_STOP) {
                    Window window = this.f12692b.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            case 2:
                AbstractActivityC0613er abstractActivityC0613er2 = this.f12692b;
                abstractActivityC0613er2.ensureViewModelStore();
                abstractActivityC0613er2.getLifecycle().mo2849b(this);
                break;
            default:
                if (ds0Var == ds0.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    ra1 ra1Var = this.f12692b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher onBackInvokedDispatcherM7103a = AbstractC1637yq.m7103a((AbstractActivityC0613er) ms0Var);
                    ra1Var.getClass();
                    onBackInvokedDispatcherM7103a.getClass();
                    ra1Var.f9861e = onBackInvokedDispatcherM7103a;
                    ra1Var.m5755c(ra1Var.f9863g);
                    break;
                }
                break;
        }
    }
}
