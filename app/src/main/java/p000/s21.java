package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s21 implements InterfaceC0578dt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c40 f10208b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ su0 f10209c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ b21 f10210d;

    public /* synthetic */ s21(c40 c40Var, su0 su0Var, b21 b21Var, int i) {
        this.f10207a = i;
        this.f10208b = c40Var;
        this.f10209c = su0Var;
        this.f10210d = b21Var;
    }

    @Override // p000.InterfaceC0578dt
    public final void accept(Object obj) {
        int i = this.f10207a;
        b21 b21Var = this.f10210d;
        su0 su0Var = this.f10209c;
        c40 c40Var = this.f10208b;
        v21 v21Var = (v21) obj;
        switch (i) {
            case 0:
                v21Var.mo64b(c40Var.f1662a, c40Var.f1663b, su0Var, b21Var);
                break;
            case 1:
                v21Var.mo66d(c40Var.f1662a, c40Var.f1663b, su0Var, b21Var);
                break;
            default:
                v21Var.mo65c(c40Var.f1662a, c40Var.f1663b, su0Var, b21Var);
                break;
        }
    }
}
