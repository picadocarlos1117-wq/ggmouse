package p000;

/* JADX INFO: renamed from: wz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1572wz implements x01 {

    /* JADX INFO: renamed from: a */
    public final fv1 f12361a;

    /* JADX INFO: renamed from: b */
    public final l80 f12362b;

    /* JADX INFO: renamed from: c */
    public AbstractC0828kh f12363c;

    /* JADX INFO: renamed from: d */
    public x01 f12364d;

    /* JADX INFO: renamed from: e */
    public boolean f12365e = true;

    /* JADX INFO: renamed from: f */
    public boolean f12366f;

    public C1572wz(l80 l80Var, xy1 xy1Var) {
        this.f12362b = l80Var;
        this.f12361a = new fv1(xy1Var);
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: a */
    public final void mo23a(td1 td1Var) {
        x01 x01Var = this.f12364d;
        if (x01Var != null) {
            x01Var.mo23a(td1Var);
            td1Var = this.f12364d.mo30e();
        }
        this.f12361a.mo23a(td1Var);
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: b */
    public final long mo25b() {
        if (this.f12365e) {
            return this.f12361a.mo25b();
        }
        x01 x01Var = this.f12364d;
        x01Var.getClass();
        return x01Var.mo25b();
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: c */
    public final boolean mo27c() {
        if (this.f12365e) {
            this.f12361a.getClass();
            return false;
        }
        x01 x01Var = this.f12364d;
        x01Var.getClass();
        return x01Var.mo27c();
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: e */
    public final td1 mo30e() {
        x01 x01Var = this.f12364d;
        return x01Var != null ? x01Var.mo30e() : this.f12361a.f3908e;
    }
}
