package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: x1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1575x1 extends AbstractC1390s1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f12404a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f12405b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f12406c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f12407d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f12408e;

    public C1575x1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f12404a = atomicReferenceFieldUpdater;
        this.f12405b = atomicReferenceFieldUpdater2;
        this.f12406c = atomicReferenceFieldUpdater3;
        this.f12407d = atomicReferenceFieldUpdater4;
        this.f12408e = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: a */
    public final boolean mo5934a(AbstractC0084b2 abstractC0084b2, C1538w1 c1538w1, C1538w1 c1538w2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12407d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0084b2, c1538w1, c1538w2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0084b2) == c1538w1);
        return false;
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: b */
    public final boolean mo5935b(AbstractC0084b2 abstractC0084b2, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12408e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0084b2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0084b2) == obj);
        return false;
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: c */
    public final boolean mo5936c(AbstractC0084b2 abstractC0084b2, C0003a2 c0003a2, C0003a2 c0003a3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12406c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0084b2, c0003a2, c0003a3)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0084b2) == c0003a2);
        return false;
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: d */
    public final void mo5937d(C0003a2 c0003a2, C0003a2 c0003a3) {
        this.f12405b.lazySet(c0003a2, c0003a3);
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: e */
    public final void mo5938e(C0003a2 c0003a2, Thread thread) {
        this.f12404a.lazySet(c0003a2, thread);
    }
}
