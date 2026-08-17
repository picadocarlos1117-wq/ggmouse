package p000;

/* JADX INFO: renamed from: pg */
/* JADX INFO: loaded from: classes3.dex */
public final class C1294pg extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public byte[] f8888c;

    /* JADX INFO: renamed from: d */
    public byte[] f8889d;

    /* JADX INFO: renamed from: e */
    public byte[] f8890e;

    public final byte[] getEncoded() {
        byte[] bArr = this.f8888c;
        byte[] bArr2 = this.f8889d;
        byte[] bArr3 = this.f8890e;
        if (bArr == null) {
            return sc2.m6064h(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return sc2.m6064h(bArr, bArr3);
        }
        if (bArr3 == null) {
            return sc2.m6064h(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }
}
