package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: yg */
/* JADX INFO: loaded from: classes3.dex */
public final class C1627yg implements InterfaceC1230on {

    /* JADX INFO: renamed from: a */
    public final byte[] f12975a;

    public C1627yg() {
        this.f12975a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        byte[] bArr = new byte[128];
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.f12975a;
            if (i >= bArr2.length) {
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m7079a(byte[] bArr, int i, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr2;
        if (i < 0) {
            return 0;
        }
        byte[] bArr3 = new byte[72];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int iMin = Math.min(54, i2);
            int i4 = i3 + iMin;
            int i5 = i4 - 2;
            int i6 = 0;
            int i7 = i3;
            while (true) {
                bArr2 = this.f12975a;
                if (i7 >= i5) {
                    break;
                }
                byte b = bArr[i7];
                int i8 = i7 + 2;
                int i9 = bArr[i7 + 1] & 255;
                i7 += 3;
                byte b2 = bArr[i8];
                bArr3[i6] = bArr2[(b >>> 2) & 63];
                bArr3[i6 + 1] = bArr2[((b << 4) | (i9 >>> 4)) & 63];
                int i10 = i6 + 3;
                bArr3[i6 + 2] = bArr2[((i9 << 2) | ((b2 & 255) >>> 6)) & 63];
                i6 += 4;
                bArr3[i10] = bArr2[b2 & 63];
            }
            int i11 = iMin - (i7 - i3);
            if (i11 == 1) {
                int i12 = bArr[i7] & 255;
                bArr3[i6] = bArr2[(i12 >>> 2) & 63];
                bArr3[i6 + 1] = bArr2[(i12 << 4) & 63];
                int i13 = i6 + 3;
                bArr3[i6 + 2] = 61;
                i6 += 4;
                bArr3[i13] = 61;
            } else if (i11 == 2) {
                int i14 = i7 + 1;
                int i15 = bArr[i7] & 255;
                int i16 = bArr[i14] & 255;
                bArr3[i6] = bArr2[(i15 >>> 2) & 63];
                bArr3[i6 + 1] = bArr2[((i15 << 4) | (i16 >>> 4)) & 63];
                int i17 = i6 + 3;
                bArr3[i6 + 2] = bArr2[(i16 << 2) & 63];
                i6 += 4;
                bArr3[i17] = 61;
            }
            byteArrayOutputStream.write(bArr3, 0, i6);
            i2 -= iMin;
            i3 = i4;
        }
        return ((i + 2) / 3) * 4;
    }

    public C1627yg(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.f12975a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }
}
