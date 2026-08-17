package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pn0 f7171b;

    public /* synthetic */ n10(pn0 pn0Var, int i) {
        this.f7170a = i;
        this.f7171b = pn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7170a;
        pn0 pn0Var = this.f7171b;
        switch (i) {
            case 0:
                pn0Var.m5292n(true);
                break;
            case 1:
                pn0Var.m5292n(false);
                break;
            default:
                ox0 ox0Var = (ox0) pn0Var.f8968a;
                p32.m5193x(ox0Var.f8530O.get(), "Channel must have been shut down");
                ox0Var.f8532Q = true;
                ox0Var.m5085Q0(false);
                ox0.m5078J0(ox0Var);
                ox0.m5079K0(ox0Var);
                break;
        }
    }
}
