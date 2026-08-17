package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 extends rc2 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ pb1 f7741i;

    public ob1(pb1 pb1Var) {
        this.f7741i = pb1Var;
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: q0 */
    public final void mo4527q0(nv1 nv1Var) {
        jb1 jb1Var = this.f7741i.f8831a;
        boolean zM4612e = nv1Var.m4612e();
        mb1 mb1Var = jb1Var.f5348a;
        if (mb1Var.f6746e == null && mb1Var.f6747f == null) {
            return;
        }
        qo0 qo0Var = jb1Var.f5349b;
        if (zM4612e) {
            ((AtomicLong) qo0Var.f9548b).getAndIncrement();
        } else {
            ((AtomicLong) qo0Var.f9549c).getAndIncrement();
        }
    }
}
