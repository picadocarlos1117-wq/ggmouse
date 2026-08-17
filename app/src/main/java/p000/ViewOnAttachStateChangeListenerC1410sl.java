package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: sl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1410sl implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10433a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10434b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1410sl(Object obj, int i) {
        this.f10433a = i;
        this.f10434b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f10433a;
        Object obj = this.f10434b;
        switch (i) {
            case 1:
                w60 w60Var = (w60) obj;
                AccessibilityManager accessibilityManager = w60Var.f12010y;
                if (w60Var.f12011z != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = i72.f4849a;
                    if (v62.m6586b(w60Var)) {
                        AbstractC1130n2.m4497a(accessibilityManager, w60Var.f12011z);
                    }
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = i72.f4849a;
                w62.m6726c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.f10433a;
        Object obj = this.f10434b;
        switch (i) {
            case 0:
                ViewOnKeyListenerC1484ul viewOnKeyListenerC1484ul = (ViewOnKeyListenerC1484ul) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1484ul.f11328C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1484ul.f11328C = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1484ul.f11328C.removeGlobalOnLayoutListener(viewOnKeyListenerC1484ul.f11338n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                w60 w60Var = (w60) obj;
                InterfaceC1167o2 interfaceC1167o2 = w60Var.f12011z;
                if (interfaceC1167o2 != null && (accessibilityManager = w60Var.f12010y) != null) {
                    AbstractC1130n2.m4498b(accessibilityManager, interfaceC1167o2);
                    break;
                }
                break;
            case 2:
                break;
            default:
                gv1 gv1Var = (gv1) obj;
                ViewTreeObserver viewTreeObserver2 = gv1Var.f4349t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        gv1Var.f4349t = view.getViewTreeObserver();
                    }
                    gv1Var.f4349t.removeGlobalOnLayoutListener(gv1Var.f4343n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m6109a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m6110b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m6111c(View view) {
    }
}
