package p000;

/* JADX INFO: renamed from: y1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1612y1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AbstractC0084b2 f12800a;

    /* JADX INFO: renamed from: b */
    public final vt0 f12801b;

    public RunnableC1612y1(AbstractC0084b2 abstractC0084b2, vt0 vt0Var) {
        this.f12800a = abstractC0084b2;
        this.f12801b = vt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12800a.value != this) {
            return;
        }
        if (AbstractC0084b2.ATOMIC_HELPER.mo5935b(this.f12800a, this, AbstractC0084b2.getFutureValue(this.f12801b))) {
            AbstractC0084b2.complete(this.f12800a);
        }
    }
}
