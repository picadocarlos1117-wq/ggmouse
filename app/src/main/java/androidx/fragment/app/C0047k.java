package androidx.fragment.app;

import p000.AbstractC1356r4;
import p000.InterfaceC1393s4;
import p000.lh0;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047k implements lh0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC0048l f690a;

    public C0047k(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        this.f690a = abstractComponentCallbacksC0048l;
    }

    @Override // p000.lh0
    public final AbstractC1356r4 apply() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f690a;
        Object obj = abstractComponentCallbacksC0048l.mHost;
        return obj instanceof InterfaceC1393s4 ? ((InterfaceC1393s4) obj).getActivityResultRegistry() : abstractComponentCallbacksC0048l.requireActivity().getActivityResultRegistry();
    }
}
