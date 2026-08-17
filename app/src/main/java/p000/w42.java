package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w42 {

    /* JADX INFO: renamed from: a */
    public static final rc2 f11969a;

    static {
        f11969a = (k42.f5666e && k42.f5665d && !AbstractC1579x5.m6867a()) ? new u42(1) : new u42(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m6705a(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m6708d(b, bArr[i]);
        }
        if (i3 == 2) {
            return m6709e(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static String m6706b(ByteBuffer byteBuffer, int i, int i2) {
        rc2 rc2Var = f11969a;
        rc2Var.getClass();
        if (byteBuffer.hasArray()) {
            return rc2Var.mo5815v(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        return byteBuffer.isDirect() ? rc2Var.mo5816x(byteBuffer, i, i2) : rc2.m5809w(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static int m6707c(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new v42(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    /* JADX INFO: renamed from: d */
    public static int m6708d(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: e */
    public static int m6709e(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
