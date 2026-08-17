package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t10 f9657b;

    public /* synthetic */ r10(t10 t10Var, int i) {
        this.f9656a = i;
        this.f9657b = t10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9656a;
        t10 t10Var = this.f9657b;
        switch (i) {
            case 0:
                t10Var.f10697c.mo1038n();
                break;
            case 1:
                t10Var.m6178p();
                break;
            case 2:
                t10Var.f10697c.flush();
                break;
            default:
                t10Var.f10697c.mo1034j();
                break;
        }
    }
}
