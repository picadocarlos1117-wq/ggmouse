package p000;

import android.sun.security.util.DerValue;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: classes3.dex */
public final class C1573x extends AbstractC1536w {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f12387c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final byte[] f12388a;

    /* JADX INFO: renamed from: b */
    public String f12389b = null;

    public C1573x(byte[] bArr) {
        this.f12388a = bArr;
    }

    /* JADX INFO: renamed from: u */
    public static C1573x m6849u(byte[] bArr, boolean z) {
        if (bArr.length > 4096) {
            f40.m2713i("exceeded relative OID contents length limit");
            return null;
        }
        C1573x c1573x = (C1573x) f12387c.get(new C1314q(bArr));
        if (c1573x != null) {
            return c1573x;
        }
        if (!m6850v(bArr)) {
            f40.m2713i("invalid relative OID contents");
            return null;
        }
        if (z) {
            bArr = sc2.m6061e(bArr);
        }
        return new C1573x(bArr);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m6850v(byte[] bArr) {
        if (dh1.m2359a("org.bouncycastle.asn1.allow_wrong_oid_enc")) {
            return true;
        }
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & DerValue.TAG_CONTEXT) == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m6851w(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == '.') {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
                length = i3;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                i2++;
                length = i3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static void m6852x(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* JADX INFO: renamed from: y */
    public static void m6853y(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f12388a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (this == abstractC1536w) {
            return true;
        }
        if (abstractC1536w instanceof C1573x) {
            return Arrays.equals(this.f12388a, ((C1573x) abstractC1536w).f12388a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(13, z, this.f12388a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f12388a.length, z);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.f12389b == null) {
                    byte[] bArr = this.f12388a;
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    BigInteger bigIntegerShiftLeft = null;
                    long j = 0;
                    for (int i = 0; i != bArr.length; i++) {
                        byte b = bArr[i];
                        if (j <= 72057594037927808L) {
                            long j2 = j + ((long) (b & 127));
                            if ((b & DerValue.TAG_CONTEXT) == 0) {
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append('.');
                                }
                                sb.append(j2);
                                j = 0;
                            } else {
                                j = j2 << 7;
                            }
                        } else {
                            if (bigIntegerShiftLeft == null) {
                                bigIntegerShiftLeft = BigInteger.valueOf(j);
                            }
                            BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                            if ((b & DerValue.TAG_CONTEXT) == 0) {
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append('.');
                                }
                                sb.append(bigIntegerOr);
                                bigIntegerShiftLeft = null;
                                j = 0;
                            } else {
                                bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                            }
                        }
                    }
                    this.f12389b = sb.toString();
                }
                str = this.f12389b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
