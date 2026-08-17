package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rn1 extends sq0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn1(int i) {
        super(i);
        if (i == 128 || i == 256) {
        } else {
            f40.m2713i(jd0.m3610h(i, "'bitStrength' ", " not supported for SHAKE"));
            throw null;
        }
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: b */
    public final int mo3526b(int i, byte[] bArr) {
        int i2 = this.f10487e / 4;
        m5864m(i, i2, bArr);
        return i2;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: f */
    public final String mo3527f() {
        return "SHAKE" + this.f10487e;
    }

    @Override // p000.sq0, p000.j20
    /* JADX INFO: renamed from: g */
    public final int mo3528g() {
        return this.f10487e / 4;
    }

    @Override // p000.sq0
    /* JADX INFO: renamed from: i */
    public final C0101bj mo5863i() {
        return new C0101bj(mo3527f(), 5);
    }

    /* JADX INFO: renamed from: m */
    public final void m5864m(int i, int i2, byte[] bArr) {
        m5865n(i, i2, bArr);
        m6130k();
    }

    /* JADX INFO: renamed from: n */
    public final void m5865n(int i, int i2, byte[] bArr) {
        if (!this.f10488f) {
            m6128h(15, 4);
        }
        m6131l(bArr, ((long) i2) * 8, i);
    }
}
