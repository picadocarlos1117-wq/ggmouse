package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kk0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f5894a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5895b;

    public kk0() {
        this.f5894a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        byte[] bArr = new byte[128];
        this.f5895b = bArr;
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.f5894a;
            if (i >= bArr2.length) {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public /* synthetic */ kk0(byte[] bArr, byte[] bArr2) {
        this.f5894a = bArr;
        this.f5895b = bArr2;
    }
}
