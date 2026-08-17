package androidx.fragment.app;

import android.view.View;
import p000.f40;
import p000.jd0;
import p000.ve0;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0045i extends ve0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC0048l f688a;

    public C0045i(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        this.f688a = abstractComponentCallbacksC0048l;
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: b */
    public final View mo352b(int i) {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f688a;
        View view = abstractComponentCallbacksC0048l.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        f40.m2719o(jd0.m3613k("Fragment ", abstractComponentCallbacksC0048l, " does not have a view"));
        return null;
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: c */
    public final boolean mo353c() {
        return this.f688a.mView != null;
    }
}
