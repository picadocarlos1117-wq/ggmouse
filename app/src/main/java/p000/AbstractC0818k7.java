package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: k7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0818k7 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m3806a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m3807b(Object obj, LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7) {
        Objects.requireNonNull(layoutInflaterFactory2C1359r7);
        C0780j7 c0780j7 = new C0780j7(layoutInflaterFactory2C1359r7, 0);
        AbstractC1354r2.m5668j(obj).registerOnBackInvokedCallback(1000000, c0780j7);
        return c0780j7;
    }

    /* JADX INFO: renamed from: c */
    public static void m3808c(Object obj, Object obj2) {
        AbstractC1354r2.m5668j(obj).unregisterOnBackInvokedCallback(AbstractC1354r2.m5664f(obj2));
    }
}
