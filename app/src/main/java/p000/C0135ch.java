package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: ch */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135ch {

    /* JADX INFO: renamed from: a */
    public final String f1795a;

    /* JADX INFO: renamed from: b */
    public final char[] f1796b;

    /* JADX INFO: renamed from: c */
    public final int f1797c;

    /* JADX INFO: renamed from: d */
    public final int f1798d;

    /* JADX INFO: renamed from: e */
    public final int f1799e;

    /* JADX INFO: renamed from: f */
    public final int f1800f;

    /* JADX INFO: renamed from: g */
    public final byte[] f1801g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f1802h;

    public C0135ch(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            if (i >= cArr.length) {
                this.f1795a = str;
                this.f1796b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    int iM3196E = hp0.m3196E(length);
                    this.f1798d = iM3196E;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM3196E);
                    int i2 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f1799e = i2;
                    this.f1800f = iM3196E >> iNumberOfTrailingZeros;
                    this.f1797c = cArr.length - 1;
                    this.f1801g = bArr;
                    boolean[] zArr = new boolean[i2];
                    for (int i3 = 0; i3 < this.f1800f; i3++) {
                        int i4 = this.f1798d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[hp0.m3220o(i3 * 8, i4)] = true;
                    }
                    this.f1802h = zArr;
                    return;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                }
            }
            char c = cArr[i];
            if (!(c < 128)) {
                f40.m2713i(p32.m5153T("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
            if (!(bArr[c] == -1)) {
                f40.m2713i(p32.m5153T("Duplicate character: %s", Character.valueOf(c)));
                throw null;
            }
            bArr[c] = (byte) i;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1216a(char c) throws C0640fh {
        if (c > 127) {
            throw new C0640fh("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.f1801g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new C0640fh("Unrecognized character: " + c);
        }
        throw new C0640fh("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0135ch) && Arrays.equals(this.f1796b, ((C0135ch) obj).f1796b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1796b) + 1237;
    }

    public final String toString() {
        return this.f1795a;
    }
}
