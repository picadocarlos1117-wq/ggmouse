package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g90 implements InterfaceC1487uo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4102a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f4103b;

    /* JADX INFO: renamed from: c */
    public final Object f4104c;

    public g90(nv1 nv1Var, EnumC1376ro enumC1376ro) {
        p32.m5177l(!nv1Var.m4612e(), "error must not be OK");
        this.f4103b = nv1Var;
        this.f4104c = enumC1376ro;
    }

    @Override // p000.InterfaceC1487uo
    /* JADX INFO: renamed from: d */
    public final InterfaceC1339qo mo2110d(u51 u51Var, j51 j51Var, C0022al c0022al, rc2[] rc2VarArr) {
        int i = this.f4102a;
        Object obj = this.f4104c;
        Object obj2 = this.f4103b;
        switch (i) {
            case 0:
                return new f90((nv1) obj2, (EnumC1376ro) obj, rc2VarArr);
            default:
                C0022al c0022al2 = C0022al.f257i;
                p32.m5188s(c0022al, "callOptions cannot be null");
                rc2 rc2VarMo2828a = ((AbstractC1450to) obj2).mo2828a(new C0733i(c0022al, 0, false), j51Var);
                p32.m5193x(rc2VarArr[rc2VarArr.length - 1] == vi0.f11688o, "lb tracer already assigned");
                rc2VarArr[rc2VarArr.length - 1] = rc2VarMo2828a;
                return ((yx0) obj).mo2110d(u51Var, j51Var, c0022al, rc2VarArr);
        }
    }

    @Override // p000.uo0
    /* JADX INFO: renamed from: g */
    public final vo0 mo2579g() {
        switch (this.f4102a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((yx0) this.f4104c).mo2579g();
        }
    }

    public g90(AbstractC1450to abstractC1450to, yx0 yx0Var) {
        this.f4103b = abstractC1450to;
        this.f4104c = yx0Var;
    }
}
