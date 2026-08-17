package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ek0 extends he0 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f3376s;

    /* JADX INFO: renamed from: t */
    public final Object f3377t;

    public /* synthetic */ ek0(Object obj, int i) {
        this.f3376s = i;
        this.f3377t = obj;
    }

    @Override // p000.he0, p000.hp0
    /* JADX INFO: renamed from: T */
    public void mo2595T(EnumC0651fs enumC0651fs, lu0 lu0Var) {
        switch (this.f3376s) {
            case 1:
                u61 u61Var = (u61) this.f3377t;
                cn1 cn1Var = u61Var.f11140g;
                if (cn1Var.f1870g.containsKey(u61Var.f11134a)) {
                    u61Var.f11137d = enumC0651fs;
                    u61Var.f11138e = lu0Var;
                    if (!u61Var.f11139f && !cn1Var.f1872n) {
                        if (enumC0651fs == EnumC0651fs.f3888d) {
                            u61Var.f11135b.mo4604p();
                        }
                        cn1Var.m1264u();
                        break;
                    }
                }
                break;
            default:
                super.mo2595T(enumC0651fs, lu0Var);
                break;
        }
    }

    @Override // p000.he0
    /* JADX INFO: renamed from: U */
    public final hp0 mo2596U() {
        int i = this.f3376s;
        Object obj = this.f3377t;
        switch (i) {
            case 0:
                return (hp0) obj;
            default:
                return ((u61) obj).f11140g.f1871m;
        }
    }

    @Override // p000.he0, p000.hp0
    /* JADX INFO: renamed from: m */
    public o21 mo2597m(iu0 iu0Var) {
        switch (this.f3376s) {
            case 0:
                mu0 mu0Var = (mu0) iu0Var.m3492b();
                o21 o21VarMo2597m = super.mo2597m(iu0Var);
                if (mu0Var != null) {
                    return o21VarMo2597m.getAttributes().f10817a.get(nu0.f7539e) == null ? new dk0(o21VarMo2597m, mu0Var) : o21VarMo2597m;
                }
                return o21VarMo2597m;
            default:
                return super.mo2597m(iu0Var);
        }
    }
}
