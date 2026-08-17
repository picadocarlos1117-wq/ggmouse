package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class co1 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final kk0 f1878c;

    /* JADX INFO: renamed from: d */
    public final kk0 f1879d;

    public co1(bo1 bo1Var, byte[] bArr) {
        super((Object) bo1Var, true);
        int iM5228a = bo1Var.f1497c.m5228a();
        int i = iM5228a * 4;
        if (bArr.length != i) {
            f40.m2713i("private key encoding does not match parameters");
            throw null;
        }
        int i2 = iM5228a * 2;
        this.f1878c = new kk0(sc2.m6067k(0, iM5228a, bArr), sc2.m6067k(iM5228a, i2, bArr));
        int i3 = iM5228a * 3;
        this.f1879d = new kk0(sc2.m6067k(i2, i3, bArr), sc2.m6067k(i3, i, bArr));
    }

    public final byte[] getEncoded() {
        kk0 kk0Var = this.f1878c;
        byte[] bArr = kk0Var.f5894a;
        byte[] bArr2 = kk0Var.f5895b;
        kk0 kk0Var2 = this.f1879d;
        return sc2.m6065i(new byte[][]{bArr, bArr2, kk0Var2.f5894a, kk0Var2.f5895b});
    }

    public co1(bo1 bo1Var, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super((Object) bo1Var, true);
        this.f1878c = new kk0(bArr, bArr2);
        this.f1879d = new kk0(bArr3, bArr4);
    }
}
