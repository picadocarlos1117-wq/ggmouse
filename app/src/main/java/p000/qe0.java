package p000;

import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends se0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lh0 f9488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f9489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0815k4 f9490c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0777j4 f9491d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractComponentCallbacksC0048l f9492e;

    public qe0(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, lh0 lh0Var, AtomicReference atomicReference, AbstractC0815k4 abstractC0815k4, InterfaceC0777j4 interfaceC0777j4) {
        this.f9492e = abstractComponentCallbacksC0048l;
        this.f9488a = lh0Var;
        this.f9489b = atomicReference;
        this.f9490c = abstractC0815k4;
        this.f9491d = interfaceC0777j4;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: a */
    public final void mo351a() {
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f9492e;
        this.f9489b.set(this.f9488a.apply().m5691d(abstractComponentCallbacksC0048l.generateActivityResultKey(), abstractComponentCallbacksC0048l, this.f9490c, this.f9491d));
    }
}
