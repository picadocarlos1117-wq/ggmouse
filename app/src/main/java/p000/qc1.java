package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qc1 extends lu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9481a;

    /* JADX INFO: renamed from: b */
    public final ju0 f9482b;

    public qc1(ju0 ju0Var, int i) {
        this.f9481a = i;
        switch (i) {
            case 1:
                p32.m5188s(ju0Var, "result");
                this.f9482b = ju0Var;
                break;
            default:
                p32.m5188s(ju0Var, "result");
                this.f9482b = ju0Var;
                break;
        }
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: a */
    public final ju0 mo200a(yc1 yc1Var) {
        switch (this.f9481a) {
            case 0:
                break;
        }
        return this.f9482b;
    }

    public final String toString() {
        int i = this.f9481a;
        ju0 ju0Var = this.f9482b;
        switch (i) {
            case 0:
                C1679zv c1679zv = new C1679zv(qc1.class.getSimpleName());
                c1679zv.m7359a(ju0Var, "result");
                return c1679zv.toString();
            default:
                return "FixedResultPicker(" + ju0Var + ")";
        }
    }
}
