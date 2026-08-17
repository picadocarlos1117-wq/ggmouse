package android.sun.security.util;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ByteArrayLexOrder implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public final int compare(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length && i < bArr2.length; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }
}
