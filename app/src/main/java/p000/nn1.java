package p000;

import android.sun.security.util.DerValue;

/* JADX INFO: loaded from: classes3.dex */
public final class nn1 implements r80, e31 {

    /* JADX INFO: renamed from: n */
    public static final int[] f7467n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: a */
    public final byte[] f7468a;

    /* JADX INFO: renamed from: b */
    public int f7469b;

    /* JADX INFO: renamed from: c */
    public long f7470c;

    /* JADX INFO: renamed from: d */
    public int f7471d;

    /* JADX INFO: renamed from: e */
    public int f7472e;

    /* JADX INFO: renamed from: f */
    public int f7473f;

    /* JADX INFO: renamed from: g */
    public int f7474g;

    /* JADX INFO: renamed from: h */
    public int f7475h;

    /* JADX INFO: renamed from: i */
    public int f7476i;

    /* JADX INFO: renamed from: j */
    public int f7477j;

    /* JADX INFO: renamed from: k */
    public int f7478k;

    /* JADX INFO: renamed from: l */
    public final int[] f7479l;

    /* JADX INFO: renamed from: m */
    public int f7480m;

    public nn1(nn1 nn1Var) {
        byte[] bArr = new byte[4];
        this.f7468a = bArr;
        byte[] bArr2 = nn1Var.f7468a;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f7469b = nn1Var.f7469b;
        this.f7470c = nn1Var.f7470c;
        this.f7479l = new int[64];
        m4568l(nn1Var);
    }

    /* JADX INFO: renamed from: h */
    public static int m4564h(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    /* JADX INFO: renamed from: i */
    public static int m4565i(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    /* JADX INFO: renamed from: j */
    public static int m4566j(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* JADX INFO: renamed from: k */
    public static int m4567k(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    @Override // p000.e31
    /* JADX INFO: renamed from: a */
    public final e31 mo2487a() {
        return new nn1(this);
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: b */
    public final int mo3526b(int i, byte[] bArr) {
        long j = this.f7470c << 3;
        byte b = DerValue.TAG_CONTEXT;
        while (true) {
            mo728c(b);
            if (this.f7469b == 0) {
                break;
            }
            b = 0;
        }
        if (this.f7480m > 14) {
            m4569m();
        }
        int[] iArr = this.f7479l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        m4569m();
        sc2.m6081y(this.f7471d, i, bArr);
        sc2.m6081y(this.f7472e, i + 4, bArr);
        sc2.m6081y(this.f7473f, i + 8, bArr);
        sc2.m6081y(this.f7474g, i + 12, bArr);
        sc2.m6081y(this.f7475h, i + 16, bArr);
        sc2.m6081y(this.f7476i, i + 20, bArr);
        sc2.m6081y(this.f7477j, i + 24, bArr);
        sc2.m6081y(this.f7478k, i + 28, bArr);
        m4571o();
        return 32;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: c */
    public final void mo728c(byte b) {
        int i = this.f7469b;
        int i2 = i + 1;
        this.f7469b = i2;
        byte[] bArr = this.f7468a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            m4570n(0, bArr);
            this.f7469b = 0;
        }
        this.f7470c++;
    }

    @Override // p000.e31
    /* JADX INFO: renamed from: d */
    public final void mo2488d(e31 e31Var) {
        m4568l((nn1) e31Var);
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: e */
    public final void mo729e(int i, int i2, byte[] bArr) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        int i4 = this.f7469b;
        byte[] bArr2 = this.f7468a;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= iMax) {
                    i3 = i5;
                    break;
                }
                int i6 = this.f7469b;
                int i7 = i6 + 1;
                this.f7469b = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    m4570n(0, bArr2);
                    this.f7469b = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = iMax - 3;
        while (i3 < i9) {
            m4570n(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < iMax) {
            int i10 = this.f7469b;
            this.f7469b = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.f7470c += (long) iMax;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: f */
    public final String mo3527f() {
        return "SHA-256";
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public final int mo3528g() {
        return 32;
    }

    /* JADX INFO: renamed from: l */
    public final void m4568l(nn1 nn1Var) {
        byte[] bArr = nn1Var.f7468a;
        System.arraycopy(bArr, 0, this.f7468a, 0, bArr.length);
        this.f7469b = nn1Var.f7469b;
        this.f7470c = nn1Var.f7470c;
        this.f7471d = nn1Var.f7471d;
        this.f7472e = nn1Var.f7472e;
        this.f7473f = nn1Var.f7473f;
        this.f7474g = nn1Var.f7474g;
        this.f7475h = nn1Var.f7475h;
        this.f7476i = nn1Var.f7476i;
        this.f7477j = nn1Var.f7477j;
        this.f7478k = nn1Var.f7478k;
        int[] iArr = nn1Var.f7479l;
        System.arraycopy(iArr, 0, this.f7479l, 0, iArr.length);
        this.f7480m = nn1Var.f7480m;
    }

    /* JADX INFO: renamed from: m */
    public final void m4569m() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f7479l;
            if (i > 63) {
                break;
            }
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            i++;
        }
        int iM4565i = this.f7471d;
        int iM4565i2 = this.f7472e;
        int iM4565i3 = this.f7473f;
        int iM4565i4 = this.f7474g;
        int i5 = this.f7475h;
        int i6 = this.f7476i;
        int i7 = this.f7477j;
        int i8 = this.f7478k;
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            int iM4564h = m4564h(i5, i6, i7) + m4567k(i5);
            int[] iArr2 = f7467n;
            int i11 = iM4564h + iArr2[i9] + iArr[i9] + i8;
            int i12 = iM4565i4 + i11;
            int iM4565i5 = m4565i(iM4565i, iM4565i2, iM4565i3) + m4566j(iM4565i) + i11;
            int i13 = i9 + 1;
            int iM4564h2 = m4564h(i12, i5, i6) + m4567k(i12) + iArr2[i13] + iArr[i13] + i7;
            int i14 = iM4565i3 + iM4564h2;
            int iM4565i6 = m4565i(iM4565i5, iM4565i, iM4565i2) + m4566j(iM4565i5) + iM4564h2;
            int i15 = i9 + 2;
            int iM4564h3 = m4564h(i14, i12, i5) + m4567k(i14) + iArr2[i15] + iArr[i15] + i6;
            int i16 = iM4565i2 + iM4564h3;
            int iM4565i7 = m4565i(iM4565i6, iM4565i5, iM4565i) + m4566j(iM4565i6) + iM4564h3;
            int i17 = i9 + 3;
            int iM4564h4 = m4564h(i16, i14, i12) + m4567k(i16) + iArr2[i17] + iArr[i17] + i5;
            int i18 = iM4565i + iM4564h4;
            int iM4565i8 = m4565i(iM4565i7, iM4565i6, iM4565i5) + m4566j(iM4565i7) + iM4564h4;
            int i19 = i9 + 4;
            int iM4564h5 = m4564h(i18, i16, i14) + m4567k(i18) + iArr2[i19] + iArr[i19] + i12;
            i8 = iM4565i5 + iM4564h5;
            iM4565i4 = m4565i(iM4565i8, iM4565i7, iM4565i6) + m4566j(iM4565i8) + iM4564h5;
            int i20 = i9 + 5;
            int iM4564h6 = m4564h(i8, i18, i16) + m4567k(i8) + iArr2[i20] + iArr[i20] + i14;
            i7 = iM4565i6 + iM4564h6;
            iM4565i3 = m4565i(iM4565i4, iM4565i8, iM4565i7) + m4566j(iM4565i4) + iM4564h6;
            int i21 = i9 + 6;
            int iM4564h7 = m4564h(i7, i8, i18) + m4567k(i7) + iArr2[i21] + iArr[i21] + i16;
            i6 = iM4565i7 + iM4564h7;
            iM4565i2 = m4565i(iM4565i3, iM4565i4, iM4565i8) + m4566j(iM4565i3) + iM4564h7;
            int i22 = i9 + 7;
            int iM4564h8 = m4564h(i6, i7, i8) + m4567k(i6) + iArr2[i22] + iArr[i22] + i18;
            i5 = iM4565i8 + iM4564h8;
            iM4565i = m4565i(iM4565i2, iM4565i3, iM4565i4) + m4566j(iM4565i2) + iM4564h8;
            i9 += 8;
        }
        this.f7471d += iM4565i;
        this.f7472e += iM4565i2;
        this.f7473f += iM4565i3;
        this.f7474g += iM4565i4;
        this.f7475h += i5;
        this.f7476i += i6;
        this.f7477j += i7;
        this.f7478k += i8;
        this.f7480m = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            iArr[i23] = 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4570n(int i, byte[] bArr) {
        this.f7479l[this.f7480m] = sc2.m6058b(i, bArr);
        int i2 = this.f7480m + 1;
        this.f7480m = i2;
        if (i2 == 16) {
            m4569m();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4571o() {
        this.f7470c = 0L;
        this.f7469b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f7468a;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.f7471d = 1779033703;
        this.f7472e = -1150833019;
        this.f7473f = 1013904242;
        this.f7474g = -1521486534;
        this.f7475h = 1359893119;
        this.f7476i = -1694144372;
        this.f7477j = 528734635;
        this.f7478k = 1541459225;
        this.f7480m = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f7479l;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    public nn1() {
        this.f7468a = new byte[4];
        this.f7469b = 0;
        this.f7479l = new int[64];
        sc2.m6075s(this);
        AbstractC0728hv.m3295a();
        m4571o();
    }
}
