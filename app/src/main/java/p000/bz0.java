package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class bz0 {

    /* JADX INFO: renamed from: a */
    public OnBackInvokedCallback f1576a;

    /* JADX INFO: renamed from: a */
    public OnBackInvokedCallback mo1073a(az0 az0Var) {
        Objects.requireNonNull(az0Var);
        return new C0780j7(az0Var, 1);
    }

    /* JADX INFO: renamed from: b */
    public void m1074b(az0 az0Var, View view, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f1576a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackMo1073a = mo1073a(az0Var);
            this.f1576a = onBackInvokedCallbackMo1073a;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackMo1073a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1075c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1576a);
        this.f1576a = null;
    }
}
