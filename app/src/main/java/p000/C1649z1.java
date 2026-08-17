package p000;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1649z1 extends AbstractC1390s1 {
    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: a */
    public final boolean mo5934a(AbstractC0084b2 abstractC0084b2, C1538w1 c1538w1, C1538w1 c1538w2) {
        synchronized (abstractC0084b2) {
            try {
                if (abstractC0084b2.listeners != c1538w1) {
                    return false;
                }
                abstractC0084b2.listeners = c1538w2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: b */
    public final boolean mo5935b(AbstractC0084b2 abstractC0084b2, Object obj, Object obj2) {
        synchronized (abstractC0084b2) {
            try {
                if (abstractC0084b2.value != obj) {
                    return false;
                }
                abstractC0084b2.value = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: c */
    public final boolean mo5936c(AbstractC0084b2 abstractC0084b2, C0003a2 c0003a2, C0003a2 c0003a3) {
        synchronized (abstractC0084b2) {
            try {
                if (abstractC0084b2.waiters != c0003a2) {
                    return false;
                }
                abstractC0084b2.waiters = c0003a3;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: d */
    public final void mo5937d(C0003a2 c0003a2, C0003a2 c0003a3) {
        c0003a2.f26b = c0003a3;
    }

    @Override // p000.AbstractC1390s1
    /* JADX INFO: renamed from: e */
    public final void mo5938e(C0003a2 c0003a2, Thread thread) {
        c0003a2.f25a = thread;
    }
}
