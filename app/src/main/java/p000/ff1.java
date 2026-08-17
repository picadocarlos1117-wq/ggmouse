package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ff1 extends me0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3776c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f3777d;

    public ff1(t02 t02Var) {
        super(t02Var);
        this.f3777d = new s02();
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: f */
    public r02 mo1055f(int i, r02 r02Var, boolean z) {
        switch (this.f3776c) {
            case 0:
                t02 t02Var = this.f6780b;
                r02 r02VarMo1055f = t02Var.mo1055f(i, r02Var, z);
                if (t02Var.mo1058m(r02VarMo1055f.f9651c, (s02) this.f3777d, 0L).m5932a()) {
                    r02VarMo1055f.m5651h(r02Var.f9649a, r02Var.f9650b, r02Var.f9651c, r02Var.f9652d, r02Var.f9653e, C1541w4.f11961c, true);
                } else {
                    r02VarMo1055f.f9654f = true;
                }
                return r02VarMo1055f;
            default:
                return super.mo1055f(i, r02Var, z);
        }
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: m */
    public s02 mo1058m(int i, s02 s02Var, long j) {
        switch (this.f3776c) {
            case 1:
                super.mo1058m(i, s02Var, j);
                z11 z11Var = (z11) this.f3777d;
                s02Var.f10182b = z11Var;
                w11 w11Var = z11Var.f13231b;
                return s02Var;
            default:
                return super.mo1058m(i, s02Var, j);
        }
    }

    public ff1(t02 t02Var, z11 z11Var) {
        super(t02Var);
        this.f3777d = z11Var;
    }
}
