package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nb1 extends rc2 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ rc2 f7349i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ pb1 f7350j;

    public nb1(pb1 pb1Var, rc2 rc2Var) {
        this.f7350j = pb1Var;
        this.f7349i = rc2Var;
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: N */
    public final void mo4516N() {
        this.f7349i.mo4516N();
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: O */
    public final void mo4517O(int i) {
        this.f7349i.mo4517O(i);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: P */
    public final void mo4518P(int i, long j) {
        this.f7349i.mo4518P(i, j);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: Q */
    public final void mo4519Q(j51 j51Var) {
        this.f7349i.mo4519Q(j51Var);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: R */
    public final void mo4520R(long j) {
        this.f7349i.mo4520R(j);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: S */
    public final void mo4521S(long j) {
        this.f7349i.mo4521S(j);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: a0 */
    public final void mo4522a0() {
        this.f7349i.mo4522a0();
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: b0 */
    public final void mo4523b0(int i) {
        this.f7349i.mo4523b0(i);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: c0 */
    public final void mo4524c0(long j, long j2, int i) {
        this.f7349i.mo4524c0(j, j2, i);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: d0 */
    public final void mo4525d0(long j) {
        this.f7349i.mo4525d0(j);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: e0 */
    public final void mo3181e0(long j) {
        this.f7349i.mo3181e0(j);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: o */
    public final void mo4526o() {
        this.f7349i.mo4526o();
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: q0 */
    public final void mo4527q0(nv1 nv1Var) {
        jb1 jb1Var = this.f7350j.f8831a;
        boolean zM4612e = nv1Var.m4612e();
        mb1 mb1Var = jb1Var.f5348a;
        if (mb1Var.f6746e != null || mb1Var.f6747f != null) {
            qo0 qo0Var = jb1Var.f5349b;
            if (zM4612e) {
                ((AtomicLong) qo0Var.f9548b).getAndIncrement();
            } else {
                ((AtomicLong) qo0Var.f9549c).getAndIncrement();
            }
        }
        this.f7349i.mo4527q0(nv1Var);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: r0 */
    public final void mo4528r0(C1437tb c1437tb, j51 j51Var) {
        this.f7349i.mo4528r0(c1437tb, j51Var);
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f7349i, "delegate");
        return c1679zvM5176k0.toString();
    }
}
