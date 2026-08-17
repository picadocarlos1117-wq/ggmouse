package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pn1 extends sq0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn1(int i) {
        super(i);
        if (i == 224 || i == 256 || i == 384 || i == 512) {
        } else {
            f40.m2713i(jd0.m3610h(i, "'bitLength' ", " not supported for SHA-3"));
            throw null;
        }
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: b */
    public final int mo3526b(int i, byte[] bArr) {
        m6128h(2, 2);
        m6131l(bArr, this.f10487e, i);
        m6130k();
        return mo3528g();
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: f */
    public final String mo3527f() {
        return "SHA3-" + this.f10487e;
    }
}
