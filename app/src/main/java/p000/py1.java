package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class py1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qy1 f9229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i10 f9230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f9231c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ry1 f9232d;

    public py1(ry1 ry1Var, qy1 qy1Var, i10 i10Var, long j) {
        this.f9232d = ry1Var;
        this.f9229a = qy1Var;
        this.f9230b = i10Var;
        this.f9231c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9232d.execute(this.f9229a);
    }

    public final String toString() {
        return this.f9230b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f9231c + ")";
    }
}
