package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class on1 extends aw0 {
    @Override // p000.e31
    /* JADX INFO: renamed from: a */
    public final e31 mo2487a() {
        on1 on1Var = new on1(this);
        sc2.m6075s(on1Var);
        AbstractC0728hv.m3295a();
        return on1Var;
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
        mo733o();
        return 48;
    }

    @Override // p000.e31
    /* JADX INFO: renamed from: d */
    public final void mo2488d(e31 e31Var) {
        m730l((on1) e31Var);
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: f */
    public final String mo3527f() {
        return "SHA-384";
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public final int mo3528g() {
        return 48;
    }

    @Override // p000.aw0
    /* JADX INFO: renamed from: o */
    public final void mo733o() {
        super.mo733o();
        this.f1081f = -3766243637369397544L;
        this.f1082g = 7105036623409894663L;
        this.f1083h = -7973340178411365097L;
        this.f1084i = 1526699215303891257L;
        this.f1085j = 7436329637833083697L;
        this.f1086k = -8163818279084223215L;
        this.f1087l = -2662702644619276377L;
        this.f1088m = 5167115440072839076L;
    }
}
