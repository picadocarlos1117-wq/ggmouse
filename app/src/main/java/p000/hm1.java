package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends rc2 {

    /* JADX INFO: renamed from: i */
    public final nm1 f4617i;

    /* JADX INFO: renamed from: j */
    public long f4618j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ dx0 f4619k;

    public hm1(dx0 dx0Var, nm1 nm1Var) {
        this.f4619k = dx0Var;
        this.f4617i = nm1Var;
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: e0 */
    public final void mo3181e0(long j) {
        if (this.f4619k.f3060o.f5908f != null) {
            return;
        }
        synchronized (this.f4619k.f3054i) {
            try {
                if (this.f4619k.f3060o.f5908f == null) {
                    nm1 nm1Var = this.f4617i;
                    if (!nm1Var.f7451b) {
                        long j2 = this.f4618j + j;
                        this.f4618j = j2;
                        dx0 dx0Var = this.f4619k;
                        long j3 = dx0Var.f3065t;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > dx0Var.f3056k) {
                            nm1Var.f7452c = true;
                        } else {
                            long jAddAndGet = dx0Var.f3055j.f9866a.addAndGet(j2 - j3);
                            dx0 dx0Var2 = this.f4619k;
                            dx0Var2.f3065t = this.f4618j;
                            if (jAddAndGet > dx0Var2.f3057l) {
                                this.f4617i.f7452c = true;
                            }
                        }
                        nm1 nm1Var2 = this.f4617i;
                        zl1 zl1VarM2394p = nm1Var2.f7452c ? this.f4619k.m2394p(nm1Var2) : null;
                        if (zl1VarM2394p != null) {
                            zl1VarM2394p.run();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
