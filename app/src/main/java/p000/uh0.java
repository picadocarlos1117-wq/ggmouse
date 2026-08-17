package p000;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class uh0 {

    /* JADX INFO: renamed from: a */
    public int f11291a;

    /* JADX INFO: renamed from: b */
    public int f11292b;

    /* JADX INFO: renamed from: c */
    public int[][] f11293c;

    /* JADX INFO: renamed from: d */
    public int f11294d;

    public uh0(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f11291a = ua0.m6443b(0, bArr);
        int iM6443b = ua0.m6443b(4, bArr);
        this.f11292b = iM6443b;
        int i = this.f11291a;
        int i2 = ((iM6443b + 7) >>> 3) * i;
        if (i > 0) {
            int i3 = 8;
            if (i2 == bArr.length - 8) {
                int i4 = (iM6443b + 31) >>> 5;
                this.f11294d = i4;
                this.f11293c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i4);
                int i5 = this.f11292b;
                int i6 = i5 >> 5;
                int i7 = i5 & 31;
                for (int i8 = 0; i8 < this.f11291a; i8++) {
                    int i9 = 0;
                    while (i9 < i6) {
                        this.f11293c[i8][i9] = ua0.m6443b(i3, bArr);
                        i9++;
                        i3 += 4;
                    }
                    int i10 = 0;
                    while (i10 < i7) {
                        int[] iArr = this.f11293c[i8];
                        iArr[i6] = ((bArr[i3] & 255) << i10) ^ iArr[i6];
                        i10 += 8;
                        i3++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m6493a() {
        int[][] iArr = this.f11293c;
        int i = (this.f11292b + 7) >>> 3;
        int i2 = this.f11291a;
        int i3 = 8;
        byte[] bArr = new byte[(i * i2) + 8];
        ua0.m6441a(i2, 0, bArr);
        ua0.m6441a(this.f11292b, 4, bArr);
        int i4 = this.f11292b;
        int i5 = i4 >>> 5;
        int i6 = i4 & 31;
        for (int i7 = 0; i7 < this.f11291a; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                ua0.m6441a(iArr[i7][i8], i3, bArr);
                i8++;
                i3 += 4;
            }
            int i9 = 0;
            while (i9 < i6) {
                bArr[i3] = (byte) ((iArr[i7][i5] >>> i9) & 255);
                i9 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uh0)) {
            return false;
        }
        uh0 uh0Var = (uh0) obj;
        if (this.f11291a != uh0Var.f11291a || this.f11292b != uh0Var.f11292b || this.f11294d != uh0Var.f11294d) {
            return false;
        }
        for (int i = 0; i < this.f11291a; i++) {
            if (!o21.m4688x(this.f11293c[i], uh0Var.f11293c[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = (((this.f11291a * 31) + this.f11292b) * 31) + this.f11294d;
        for (int i3 = 0; i3 < this.f11291a; i3++) {
            int i4 = i2 * 31;
            int[] iArr = this.f11293c[i3];
            if (iArr == null) {
                i = 0;
            } else {
                int length = iArr.length;
                i = length + 1;
                while (true) {
                    length--;
                    if (length >= 0) {
                        i = (i * 257) ^ iArr[length];
                    }
                }
            }
            i2 = i4 + i;
        }
        return i2;
    }

    public final String toString() {
        int[][] iArr;
        int i = this.f11292b & 31;
        int i2 = this.f11294d;
        int i3 = i == 0 ? i2 : i2 - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < this.f11291a; i4++) {
            stringBuffer.append(i4 + ": ");
            int i5 = 0;
            while (true) {
                iArr = this.f11293c;
                if (i5 >= i3) {
                    break;
                }
                int i6 = iArr[i4][i5];
                for (int i7 = 0; i7 < 32; i7++) {
                    if (((i6 >>> i7) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
                i5++;
            }
            int i8 = iArr[i4][i2 - 1];
            for (int i9 = 0; i9 < i; i9++) {
                if (((i8 >>> i9) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
