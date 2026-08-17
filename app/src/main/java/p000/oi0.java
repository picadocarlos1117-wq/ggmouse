package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oi0 extends nu0 {

    /* JADX INFO: renamed from: u */
    public static final C0636fd f7796u = new C0636fd(1);

    /* JADX INFO: renamed from: g */
    public final mi0 f7797g;

    /* JADX INFO: renamed from: m */
    public final he0 f7798m;

    /* JADX INFO: renamed from: n */
    public ou0 f7799n;

    /* JADX INFO: renamed from: o */
    public nu0 f7800o;

    /* JADX INFO: renamed from: p */
    public ou0 f7801p;

    /* JADX INFO: renamed from: q */
    public nu0 f7802q;

    /* JADX INFO: renamed from: r */
    public EnumC0651fs f7803r;

    /* JADX INFO: renamed from: s */
    public lu0 f7804s;

    /* JADX INFO: renamed from: t */
    public boolean f7805t;

    public oi0(he0 he0Var) {
        super(0);
        mi0 mi0Var = new mi0(this);
        this.f7797g = mi0Var;
        this.f7800o = mi0Var;
        this.f7802q = mi0Var;
        this.f7798m = he0Var;
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: f */
    public final boolean mo4598f() {
        return m4803r().mo4598f();
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: n */
    public final void mo1259n(nv1 nv1Var) {
        m4803r().mo1259n(nv1Var);
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: o */
    public final void mo2958o(ku0 ku0Var) {
        m4803r().mo2958o(ku0Var);
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: p */
    public final void mo4604p() {
        m4803r().mo4604p();
    }

    @Override // p000.nu0
    /* JADX INFO: renamed from: q */
    public final void mo1260q() {
        this.f7802q.mo1260q();
        this.f7800o.mo1260q();
    }

    /* JADX INFO: renamed from: r */
    public final nu0 m4803r() {
        nu0 nu0Var = this.f7802q;
        return nu0Var == this.f7797g ? this.f7800o : nu0Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m4804s() {
        this.f7798m.mo2595T(this.f7803r, this.f7804s);
        this.f7800o.mo1260q();
        this.f7800o = this.f7802q;
        this.f7799n = this.f7801p;
        this.f7802q = this.f7797g;
        this.f7801p = null;
    }

    /* JADX INFO: renamed from: t */
    public final void m4805t(ou0 ou0Var) {
        p32.m5188s(ou0Var, "newBalancerFactory");
        if (ou0Var == this.f7801p) {
            return;
        }
        this.f7802q.mo1260q();
        this.f7802q = this.f7797g;
        this.f7801p = null;
        this.f7803r = EnumC0651fs.f3885a;
        this.f7804s = f7796u;
        if (ou0Var == this.f7799n) {
            return;
        }
        ni0 ni0Var = new ni0(this);
        nu0 nu0VarMo2845b = ou0Var.mo2845b(ni0Var);
        ni0Var.f7413t = nu0VarMo2845b;
        this.f7802q = nu0VarMo2845b;
        this.f7801p = ou0Var;
        if (this.f7805t) {
            return;
        }
        m4804s();
    }

    @Override // p000.nu0
    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(m4803r(), "delegate");
        return c1679zvM5176k0.toString();
    }
}
