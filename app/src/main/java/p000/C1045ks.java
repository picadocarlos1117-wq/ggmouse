package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ks */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1045ks implements vq1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f5996a;

    public C1045ks(C1636yp c1636yp) {
        this.f5996a = new AtomicReference(c1636yp);
    }

    @Override // p000.vq1
    public final Iterator iterator() {
        vq1 vq1Var = (vq1) this.f5996a.getAndSet(null);
        if (vq1Var != null) {
            return vq1Var.iterator();
        }
        f40.m2719o("This sequence can be consumed only once.");
        return null;
    }
}
