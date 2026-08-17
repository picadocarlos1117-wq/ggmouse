package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i12 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m3327a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m3328b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0780j7(runnable, 3);
    }

    /* JADX INFO: renamed from: c */
    public static void m3329c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m3330d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
