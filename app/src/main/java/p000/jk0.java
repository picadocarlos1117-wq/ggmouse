package p000;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jk0 {

    /* JADX INFO: renamed from: a */
    public static final kk0 f5438a = new kk0();

    /* JADX INFO: renamed from: a */
    public static byte[] m3656a(String str) {
        String str2;
        try {
            kk0 kk0Var = f5438a;
            int length = str.length();
            byte[] bArr = kk0Var.f5895b;
            if (length < 0 || str.length() - length < 0) {
                f40.m2718n("invalid offset and/or length specified");
                return null;
            }
            if ((length & 1) == 0) {
                int i = length >>> 1;
                byte[] bArr2 = new byte[i];
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i2 + 1;
                    byte b = bArr[str.charAt(i2)];
                    i2 += 2;
                    int i5 = bArr[str.charAt(i4)] | (b << 4);
                    if (i5 >= 0) {
                        bArr2[i3] = (byte) i5;
                    } else {
                        str2 = "invalid characters encountered in Hex string";
                    }
                }
                return bArr2;
            }
            str2 = "a hexadecimal encoding must have an even number of characters";
            ca0.m1178j(str2);
            return null;
        } catch (Exception e) {
            C1499v c1499v = new C1499v("exception decoding Hex string: " + e.getMessage(), 1);
            c1499v.f11464b = e;
            throw c1499v;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m3657b(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            kk0 kk0Var = f5438a;
            kk0Var.getClass();
            if (i >= 0) {
                byte[] bArr2 = new byte[72];
                int i2 = 0;
                while (i > 0) {
                    int iMin = Math.min(36, i);
                    int i3 = i2 + iMin;
                    int i4 = 0;
                    while (i2 < i3) {
                        int i5 = i2 + 1;
                        byte b = bArr[i2];
                        int i6 = i4 + 1;
                        byte[] bArr3 = kk0Var.f5894a;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i2 = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i -= iMin;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C1499v("exception encoding Hex string: " + e.getMessage(), e, 2);
        }
    }
}
