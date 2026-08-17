package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dr1 extends p32 {
    @Override // p000.p32
    /* JADX INFO: renamed from: d0 */
    public final boolean mo2118d0(er1 er1Var) {
        synchronized (er1Var) {
            try {
                if (er1Var.f3427c != 0) {
                    return false;
                }
                er1Var.f3427c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: e0 */
    public final void mo2119e0(er1 er1Var) {
        synchronized (er1Var) {
            er1Var.f3427c = 0;
        }
    }
}
