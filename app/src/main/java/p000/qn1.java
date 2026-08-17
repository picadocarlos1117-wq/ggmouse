package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qn1 extends aw0 {
    public qn1() {
        sc2.m6075s(this);
        AbstractC0728hv.m3295a();
        mo733o();
    }

    @Override // p000.e31
    /* JADX INFO: renamed from: a */
    public final e31 mo2487a() {
        qn1 qn1Var = new qn1(this);
        sc2.m6075s(qn1Var);
        AbstractC0728hv.m3295a();
        return qn1Var;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: b */
    public final int mo3526b(int i, byte[] bArr) {
        m731m();
        sc2.m6034D(bArr, this.f1081f, i);
        sc2.m6034D(bArr, this.f1082g, i + 8);
        sc2.m6034D(bArr, this.f1083h, i + 16);
        sc2.m6034D(bArr, this.f1084i, i + 24);
        sc2.m6034D(bArr, this.f1085j, i + 32);
        sc2.m6034D(bArr, this.f1086k, i + 40);
        sc2.m6034D(bArr, this.f1087l, i + 48);
        sc2.m6034D(bArr, this.f1088m, i + 56);
        mo733o();
        return 64;
    }

    @Override // p000.e31
    /* JADX INFO: renamed from: d */
    public final void mo2488d(e31 e31Var) {
        m730l((qn1) e31Var);
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: f */
    public final String mo3527f() {
        return "SHA-512";
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public final int mo3528g() {
        return 64;
    }

    @Override // p000.aw0
    /* JADX INFO: renamed from: o */
    public final void mo733o() {
        super.mo733o();
        this.f1081f = 7640891576956012808L;
        this.f1082g = -4942790177534073029L;
        this.f1083h = 4354685564936845355L;
        this.f1084i = -6534734903238641935L;
        this.f1085j = 5840696475078001361L;
        this.f1086k = -7276294671716946913L;
        this.f1087l = 2270897969802886507L;
        this.f1088m = 6620516959819538809L;
    }
}
