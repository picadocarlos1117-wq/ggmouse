package p000;

/* JADX INFO: renamed from: ok */
/* JADX INFO: loaded from: classes3.dex */
public final class C1185ok extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final byte[] f7827c;

    public C1185ok(C1111mk c1111mk, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super((Object) c1111mk, true);
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length + bArr5.length];
        this.f7827c = bArr6;
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr6, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr6, length2, bArr3.length);
        int length3 = length2 + bArr3.length;
        System.arraycopy(bArr4, 0, bArr6, length3, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, length3 + bArr4.length, bArr5.length);
    }
}
