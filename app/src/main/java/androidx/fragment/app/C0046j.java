package androidx.fragment.app;

import android.view.View;
import p000.ds0;
import p000.ks0;
import p000.ms0;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0046j implements ks0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC0048l f689a;

    public C0046j(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        this.f689a = abstractComponentCallbacksC0048l;
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        View view;
        if (ds0Var != ds0.ON_STOP || (view = this.f689a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
