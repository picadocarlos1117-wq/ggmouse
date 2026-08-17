package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t10 f9292c;

    public /* synthetic */ q10(t10 t10Var, int i, int i2) {
        this.f9290a = i2;
        this.f9292c = t10Var;
        this.f9291b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9290a;
        int i2 = this.f9291b;
        t10 t10Var = this.f9292c;
        switch (i) {
            case 0:
                t10Var.f10697c.mo1035k(i2);
                break;
            case 1:
                t10Var.f10697c.mo1036l(i2);
                break;
            default:
                t10Var.f10697c.mo1028d(i2);
                break;
        }
    }
}
