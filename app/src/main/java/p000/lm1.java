package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lm1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nm1 f6388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qo0 f6389c;

    public /* synthetic */ lm1(qo0 qo0Var, nm1 nm1Var, int i) {
        this.f6387a = i;
        this.f6389c = qo0Var;
        this.f6388b = nm1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6387a;
        qo0 qo0Var = this.f6389c;
        switch (i) {
            case 0:
                ((dx0) qo0Var.f9549c).f3047b.execute(new RunnableC1621ya(this, 24));
                break;
            default:
                dx0 dx0Var = (dx0) qo0Var.f9549c;
                d51 d51Var = dx0.f3038E;
                dx0Var.m2397s(this.f6388b);
                break;
        }
    }
}
