package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cr1 extends p32 {

    /* JADX INFO: renamed from: l */
    public final AtomicIntegerFieldUpdater f2605l;

    public cr1(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f2605l = atomicIntegerFieldUpdater;
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: d0 */
    public final boolean mo2118d0(er1 er1Var) {
        return this.f2605l.compareAndSet(er1Var, 0, -1);
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: e0 */
    public final void mo2119e0(er1 er1Var) {
        this.f2605l.set(er1Var, 0);
    }
}
