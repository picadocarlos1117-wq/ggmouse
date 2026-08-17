package p000;

/* JADX INFO: renamed from: cm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0141cm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1857a;

    /* JADX INFO: renamed from: b */
    public byte[] f1858b;

    /* JADX INFO: renamed from: c */
    public int f1859c;

    /* JADX INFO: renamed from: d */
    public int f1860d;

    /* JADX INFO: renamed from: e */
    public int f1861e;

    public C0141cm(int i, int i2) {
        this.f1857a = 0;
        this.f1859c = i;
        this.f1860d = i2;
        this.f1858b = new byte[(i2 * 2) - 1];
        this.f1861e = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m1230a() {
        int i;
        int i2;
        switch (this.f1857a) {
            case 1:
                int i3 = this.f1859c;
                ki0.m3864h(i3 >= 0 && (i3 < (i = this.f1861e) || (i3 == i && this.f1860d == 0)));
                break;
            default:
                int i4 = this.f1860d;
                ki0.m3864h(i4 >= 0 && (i4 < (i2 = this.f1859c) || (i4 == i2 && this.f1861e == 0)));
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m1231b() {
        return ((this.f1861e - this.f1859c) * 8) - this.f1860d;
    }

    /* JADX INFO: renamed from: c */
    public void m1232c() {
        if (this.f1860d == 0) {
            return;
        }
        this.f1860d = 0;
        this.f1859c++;
        m1230a();
    }

    /* JADX INFO: renamed from: d */
    public boolean m1233d(int i) {
        int i2 = this.f1860d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f1861e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f1859c) {
                break;
            }
            if (m1247r(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f1859c;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    /* JADX INFO: renamed from: e */
    public boolean m1234e() {
        int i = this.f1860d;
        int i2 = this.f1861e;
        int i3 = 0;
        while (this.f1860d < this.f1859c && !m1237h()) {
            i3++;
        }
        boolean z = this.f1860d == this.f1859c;
        this.f1860d = i;
        this.f1861e = i2;
        return !z && m1233d((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: f */
    public int m1235f() {
        ki0.m3864h(this.f1860d == 0);
        return this.f1859c;
    }

    /* JADX INFO: renamed from: g */
    public int m1236g() {
        return (this.f1859c * 8) + this.f1860d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1237h() {
        switch (this.f1857a) {
            case 1:
                boolean z = (this.f1858b[this.f1859c] & (128 >> this.f1860d)) != 0;
                m1248s();
                return z;
            case 2:
                boolean z2 = (this.f1858b[this.f1860d] & (128 >> this.f1861e)) != 0;
                m1248s();
                return z2;
            default:
                boolean z3 = (((this.f1858b[this.f1860d] & 255) >> this.f1861e) & 1) == 1;
                m1249t(1);
                return z3;
        }
    }

    /* JADX INFO: renamed from: i */
    public int m1238i(int i) {
        switch (this.f1857a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.f1860d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.f1860d;
                    if (i3 <= 8) {
                        byte[] bArr = this.f1858b;
                        int i4 = this.f1859c;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((255 & bArr[i4]) >> (8 - i3)));
                        if (i3 == 8) {
                            this.f1860d = 0;
                            this.f1859c = i4 + 1;
                        }
                        m1230a();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.f1860d = i6;
                    byte[] bArr2 = this.f1858b;
                    int i7 = this.f1859c;
                    this.f1859c = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
                break;
            case 2:
                this.f1861e += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.f1861e;
                    int i10 = 2;
                    if (i9 <= 8) {
                        byte[] bArr3 = this.f1858b;
                        int i11 = this.f1860d;
                        int i12 = ((-1) >>> (32 - i)) & (i8 | ((255 & bArr3[i11]) >> (8 - i9)));
                        if (i9 == 8) {
                            this.f1861e = 0;
                            this.f1860d = i11 + (m1247r(i11 + 1) ? 2 : 1);
                        }
                        m1230a();
                        return i12;
                    }
                    int i13 = i9 - 8;
                    this.f1861e = i13;
                    byte[] bArr4 = this.f1858b;
                    int i14 = this.f1860d;
                    i8 |= (bArr4[i14] & 255) << i13;
                    if (!m1247r(i14 + 1)) {
                        i10 = 1;
                    }
                    this.f1860d = i14 + i10;
                }
                break;
            default:
                int i15 = this.f1860d;
                int iMin = Math.min(i, 8 - this.f1861e);
                byte[] bArr5 = this.f1858b;
                int i16 = i15 + 1;
                int i17 = ((bArr5[i15] & 255) >> this.f1861e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i17 |= (bArr5[i16] & 255) << iMin;
                    iMin += 8;
                    i16++;
                }
                int i18 = i17 & ((-1) >>> (32 - i));
                m1249t(i);
                return i18;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1239j(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f1858b;
            int i4 = this.f1859c;
            int i5 = i4 + 1;
            this.f1859c = i5;
            byte b = bArr2[i4];
            int i6 = this.f1860d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f1860d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f1858b;
            int i9 = this.f1859c;
            this.f1859c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f1860d = i8 - 8;
        }
        int i10 = this.f1860d + i7;
        this.f1860d = i10;
        byte[] bArr4 = this.f1858b;
        int i11 = this.f1859c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f1860d = 0;
            this.f1859c = i11 + 1;
        }
        m1230a();
    }

    /* JADX INFO: renamed from: k */
    public long m1240k(int i) {
        if (i <= 32) {
            int iM1238i = m1238i(i);
            int i2 = z42.f13274a;
            return ((long) iM1238i) & 4294967295L;
        }
        int iM1238i2 = m1238i(i - 32);
        int iM1238i3 = m1238i(32);
        int i3 = z42.f13274a;
        return (((long) iM1238i3) & 4294967295L) | ((((long) iM1238i2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: l */
    public void m1241l(int i, byte[] bArr) {
        ki0.m3864h(this.f1860d == 0);
        System.arraycopy(this.f1858b, this.f1859c, bArr, 0, i);
        this.f1859c += i;
        m1230a();
    }

    /* JADX INFO: renamed from: m */
    public int m1242m() {
        int i = 0;
        while (!m1237h()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m1238i(i) : 0);
    }

    /* JADX INFO: renamed from: n */
    public int m1243n() {
        int iM1242m = m1242m();
        return ((iM1242m + 1) / 2) * (iM1242m % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: o */
    public void m1244o(int i, byte[] bArr) {
        this.f1858b = bArr;
        this.f1859c = 0;
        this.f1860d = 0;
        this.f1861e = i;
    }

    /* JADX INFO: renamed from: p */
    public void m1245p(dc1 dc1Var) {
        m1244o(dc1Var.f2884c, dc1Var.f2882a);
        m1246q(dc1Var.f2883b * 8);
    }

    /* JADX INFO: renamed from: q */
    public void m1246q(int i) {
        int i2 = i / 8;
        this.f1859c = i2;
        this.f1860d = i - (i2 * 8);
        m1230a();
    }

    /* JADX INFO: renamed from: r */
    public boolean m1247r(int i) {
        if (2 > i || i >= this.f1859c) {
            return false;
        }
        byte[] bArr = this.f1858b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: s */
    public void m1248s() {
        switch (this.f1857a) {
            case 1:
                int i = this.f1860d + 1;
                this.f1860d = i;
                if (i == 8) {
                    this.f1860d = 0;
                    this.f1859c++;
                }
                m1230a();
                break;
            default:
                int i2 = this.f1861e + 1;
                this.f1861e = i2;
                if (i2 == 8) {
                    this.f1861e = 0;
                    int i3 = this.f1860d;
                    this.f1860d = i3 + (m1247r(i3 + 1) ? 2 : 1);
                }
                m1230a();
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1249t(int i) {
        int i2;
        switch (this.f1857a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.f1859c + i3;
                this.f1859c = i4;
                int i5 = (i - (i3 * 8)) + this.f1860d;
                this.f1860d = i5;
                if (i5 > 7) {
                    this.f1859c = i4 + 1;
                    this.f1860d = i5 - 8;
                }
                m1230a();
                break;
            case 2:
                int i6 = this.f1860d;
                int i7 = i / 8;
                int i8 = i6 + i7;
                this.f1860d = i8;
                int i9 = (i - (i7 * 8)) + this.f1861e;
                this.f1861e = i9;
                if (i9 > 7) {
                    this.f1860d = i8 + 1;
                    this.f1861e = i9 - 8;
                }
                while (true) {
                    i6++;
                    if (i6 > this.f1860d) {
                        m1230a();
                        break;
                    } else if (m1247r(i6)) {
                        this.f1860d++;
                        i6 += 2;
                    }
                }
                break;
            default:
                int i10 = i / 8;
                int i11 = this.f1860d + i10;
                this.f1860d = i11;
                int i12 = (i - (i10 * 8)) + this.f1861e;
                this.f1861e = i12;
                boolean z = true;
                if (i12 > 7) {
                    this.f1860d = i11 + 1;
                    this.f1861e = i12 - 8;
                }
                int i13 = this.f1860d;
                if (i13 < 0 || (i13 >= (i2 = this.f1859c) && (i13 != i2 || this.f1861e != 0))) {
                    z = false;
                }
                ki0.m3864h(z);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1250u(int i) {
        ki0.m3864h(this.f1860d == 0);
        this.f1859c += i;
        m1230a();
    }

    public C0141cm(byte[] bArr) {
        this.f1857a = 3;
        this.f1858b = bArr;
        this.f1859c = bArr.length;
    }

    public C0141cm(byte[] bArr, int i, int i2) {
        this.f1857a = 2;
        this.f1858b = bArr;
        this.f1860d = i;
        this.f1859c = i2;
        this.f1861e = 0;
        m1230a();
    }

    public C0141cm(byte[] bArr, int i) {
        this.f1857a = 1;
        this.f1858b = bArr;
        this.f1861e = i;
    }

    public C0141cm() {
        this.f1857a = 1;
        this.f1858b = z42.f13279f;
    }
}
