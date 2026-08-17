package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f90 extends o81 {

    /* JADX INFO: renamed from: b */
    public boolean f3719b;

    /* JADX INFO: renamed from: c */
    public final nv1 f3720c;

    /* JADX INFO: renamed from: d */
    public final EnumC1376ro f3721d;

    /* JADX INFO: renamed from: e */
    public final rc2[] f3722e;

    public f90(nv1 nv1Var, EnumC1376ro enumC1376ro, rc2[] rc2VarArr) {
        p32.m5177l(!nv1Var.m4612e(), "error must not be OK");
        this.f3720c = nv1Var;
        this.f3721d = enumC1376ro;
        this.f3722e = rc2VarArr;
    }

    @Override // p000.o81, p000.InterfaceC1339qo
    /* JADX INFO: renamed from: g */
    public final void mo1031g(zj0 zj0Var) {
        zj0Var.m7315f(this.f3720c, "error");
        zj0Var.m7315f(this.f3721d, "progress");
    }

    @Override // p000.o81, p000.InterfaceC1339qo
    /* JADX INFO: renamed from: m */
    public final void mo1037m(InterfaceC1413so interfaceC1413so) {
        p32.m5193x(!this.f3719b, "already started");
        this.f3719b = true;
        rc2[] rc2VarArr = this.f3722e;
        int length = rc2VarArr.length;
        int i = 0;
        while (true) {
            nv1 nv1Var = this.f3720c;
            if (i >= length) {
                interfaceC1413so.mo4775x(nv1Var, this.f3721d, new j51());
                return;
            } else {
                rc2VarArr[i].mo4527q0(nv1Var);
                i++;
            }
        }
    }

    public f90(nv1 nv1Var, rc2[] rc2VarArr) {
        this(nv1Var, EnumC1376ro.f10079a, rc2VarArr);
    }
}
