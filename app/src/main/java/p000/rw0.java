package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rw0 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final byte[] f10150c;

    /* JADX INFO: renamed from: d */
    public final byte[] f10151d;

    public rw0(ow0 ow0Var, byte[] bArr) {
        super((Object) ow0Var, false);
        this.f10150c = sc2.m6067k(0, bArr.length - 32, bArr);
        this.f10151d = sc2.m6067k(bArr.length - 32, bArr.length, bArr);
    }

    public final byte[] getEncoded() {
        return sc2.m6064h(this.f10150c, this.f10151d);
    }

    public rw0(ow0 ow0Var, byte[] bArr, byte[] bArr2) {
        super((Object) ow0Var, false);
        this.f10150c = sc2.m6061e(bArr);
        this.f10151d = sc2.m6061e(bArr2);
    }
}
