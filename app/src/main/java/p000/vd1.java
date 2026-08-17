package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k62 f11639b;

    public /* synthetic */ vd1(wd1 wd1Var, k62 k62Var, m62 m62Var) {
        this.f11638a = 0;
        this.f11639b = k62Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11638a;
        k62 k62Var = this.f11639b;
        switch (i) {
            case 0:
                k62Var.getClass();
                break;
            case 1:
                k62Var.mo741d();
                break;
            default:
                k62Var.mo746i();
                break;
        }
    }

    public /* synthetic */ vd1(wd1 wd1Var, k62 k62Var, int i) {
        this.f11638a = i;
        this.f11639b = k62Var;
    }
}
