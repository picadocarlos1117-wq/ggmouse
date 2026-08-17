package p000;

/* JADX INFO: renamed from: fy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0657fy implements xt0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3919a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3920b;

    public /* synthetic */ C0657fy(int i) {
        this.f3920b = i;
    }

    @Override // p000.xt0
    public final void invoke(Object obj) {
        int i = this.f3919a;
        int i2 = this.f3920b;
        switch (i) {
            case 0:
                h21 h21Var = (h21) obj;
                h21Var.getClass();
                if (i2 == 1) {
                    h21Var.f4417u = true;
                }
                h21Var.f4407k = i2;
                break;
            default:
                ((ce1) obj).onRepeatModeChanged(i2);
                break;
        }
    }

    public /* synthetic */ C0657fy(C1542w5 c1542w5, int i, de1 de1Var, de1 de1Var2) {
        this.f3920b = i;
    }
}
