package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n41 implements n80 {

    /* JADX INFO: renamed from: a */
    public final n80 f7211a;

    /* JADX INFO: renamed from: b */
    public final y12 f7212b;

    public n41(n80 n80Var, y12 y12Var) {
        this.f7211a = n80Var;
        this.f7212b = y12Var;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: a */
    public final y12 mo855a() {
        return this.f7212b;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: b */
    public final void mo856b(boolean z) {
        this.f7211a.mo856b(z);
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: c */
    public final be0 mo857c(int i) {
        return this.f7212b.f12805d[this.f7211a.mo859e(i)];
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: d */
    public final void mo858d() {
        this.f7211a.mo858d();
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: e */
    public final int mo859e(int i) {
        return this.f7211a.mo859e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n41)) {
            return false;
        }
        n41 n41Var = (n41) obj;
        return this.f7211a.equals(n41Var.f7211a) && this.f7212b.equals(n41Var.f7212b);
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: f */
    public final void mo860f() {
        this.f7211a.mo860f();
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: g */
    public final int mo861g() {
        return this.f7211a.mo861g();
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: h */
    public final be0 mo862h() {
        return this.f7212b.f12805d[this.f7211a.mo861g()];
    }

    public final int hashCode() {
        return this.f7211a.hashCode() + ((this.f7212b.hashCode() + 527) * 31);
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: i */
    public final void mo863i(float f) {
        this.f7211a.mo863i(f);
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: j */
    public final void mo4500j() {
        this.f7211a.mo4500j();
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: k */
    public final void mo4501k() {
        this.f7211a.mo4501k();
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: l */
    public final int mo864l(int i) {
        return this.f7211a.mo864l(i);
    }

    @Override // p000.n80
    public final int length() {
        return this.f7211a.length();
    }
}
