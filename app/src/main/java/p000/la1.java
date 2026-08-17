package p000;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class la1 {

    /* JADX INFO: renamed from: a */
    public static final la1 f6286a = new la1();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m4163a(mg0 mg0Var) {
        mg0Var.getClass();
        return new C0780j7(mg0Var, 2);
    }

    /* JADX INFO: renamed from: b */
    public final void m4164b(Object obj, int i, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public final void m4165c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
