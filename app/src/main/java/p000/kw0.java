package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kw0 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final byte[] f6047c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6048d;

    public kw0(iw0 iw0Var, byte[] bArr, byte[] bArr2) {
        super((Object) iw0Var, false);
        if (bArr == null) {
            l41.m4051t("rho cannot be null");
            throw null;
        }
        if (bArr2 == null) {
            l41.m4051t("t1 cannot be null");
            throw null;
        }
        this.f6047c = sc2.m6061e(bArr);
        this.f6048d = sc2.m6061e(bArr2);
    }

    public kw0(iw0 iw0Var, byte[] bArr) {
        super((Object) iw0Var, false);
        this.f6047c = sc2.m6067k(0, 32, bArr);
        byte[] bArrM6067k = sc2.m6067k(32, bArr.length, bArr);
        this.f6048d = bArrM6067k;
        if (bArrM6067k.length != 0) {
            return;
        }
        f40.m2713i("encoding too short");
        throw null;
    }
}
