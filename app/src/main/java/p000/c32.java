package p000;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c32 {

    /* JADX INFO: renamed from: a */
    public static final Logger f1660a = Logger.getLogger(c32.class.getName());

    /* JADX INFO: renamed from: b */
    public static final byte[] f1661b = "-bin".getBytes(AbstractC0646fn.f3855a);

    /* JADX INFO: renamed from: a */
    public static boolean m1122a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
