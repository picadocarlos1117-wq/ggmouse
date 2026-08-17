package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 {

    /* JADX INFO: renamed from: a */
    public final int f1533a;

    /* JADX INFO: renamed from: b */
    public final int f1534b;

    /* JADX INFO: renamed from: c */
    public final float f1535c;

    /* JADX INFO: renamed from: d */
    public final float f1536d;

    /* JADX INFO: renamed from: e */
    public final float f1537e;

    /* JADX INFO: renamed from: f */
    public final int f1538f;

    /* JADX INFO: renamed from: g */
    public final int f1539g;

    /* JADX INFO: renamed from: h */
    public final int f1540h;

    /* JADX INFO: renamed from: i */
    public final short[] f1541i;

    /* JADX INFO: renamed from: j */
    public short[] f1542j;

    /* JADX INFO: renamed from: k */
    public int f1543k;

    /* JADX INFO: renamed from: l */
    public short[] f1544l;

    /* JADX INFO: renamed from: m */
    public int f1545m;

    /* JADX INFO: renamed from: n */
    public short[] f1546n;

    /* JADX INFO: renamed from: o */
    public int f1547o;

    /* JADX INFO: renamed from: p */
    public int f1548p;

    /* JADX INFO: renamed from: q */
    public int f1549q;

    /* JADX INFO: renamed from: r */
    public int f1550r;

    /* JADX INFO: renamed from: s */
    public int f1551s;

    /* JADX INFO: renamed from: t */
    public int f1552t;

    /* JADX INFO: renamed from: u */
    public int f1553u;

    /* JADX INFO: renamed from: v */
    public int f1554v;

    /* JADX INFO: renamed from: w */
    public double f1555w;

    public bu1(int i, int i2, float f, float f2, int i3) {
        this.f1533a = i;
        this.f1534b = i2;
        this.f1535c = f;
        this.f1536d = f2;
        this.f1537e = i / i3;
        this.f1538f = i / 400;
        int i4 = i / 65;
        this.f1539g = i4;
        int i5 = i4 * 2;
        this.f1540h = i5;
        this.f1541i = new short[i5];
        this.f1542j = new short[i5 * i2];
        this.f1544l = new short[i5 * i2];
        this.f1546n = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: e */
    public static void m1062e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1063a(short[] sArr, int i, int i2) {
        short[] sArrM1065c = m1065c(this.f1544l, this.f1545m, i2);
        this.f1544l = sArrM1065c;
        int i3 = this.f1534b;
        System.arraycopy(sArr, i * i3, sArrM1065c, this.f1545m * i3, i3 * i2);
        this.f1545m += i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1064b(short[] sArr, int i, int i2) {
        int i3 = this.f1540h / i2;
        int i4 = this.f1534b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f1541i[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final short[] m1065c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f1534b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: d */
    public final int m1066d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f1534b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f1553u = i6 / i7;
        this.f1554v = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: f */
    public final void m1067f() {
        float f;
        double d;
        int iM1066d;
        int i;
        int i2;
        int iRound;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6 = this.f1545m;
        float f2 = this.f1535c;
        float f3 = this.f1536d;
        double d2 = f2 / f3;
        float f4 = this.f1537e * f3;
        int i7 = this.f1533a;
        int i8 = 1;
        int i9 = this.f1534b;
        int i10 = 0;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i11 = this.f1543k;
            int i12 = this.f1540h;
            if (i11 >= i12) {
                int i13 = 0;
                while (true) {
                    int i14 = this.f1550r;
                    if (i14 > 0) {
                        int iMin = Math.min(i12, i14);
                        m1063a(this.f1542j, i13, iMin);
                        this.f1550r -= iMin;
                        i13 += iMin;
                        f = f4;
                        d = d2;
                        i12 = i12;
                    } else {
                        short[] sArr = this.f1542j;
                        int i15 = i7 > 4000 ? i7 / 4000 : i8;
                        int i16 = this.f1539g;
                        int i17 = this.f1538f;
                        if (i9 == i8 && i15 == i8) {
                            iM1066d = m1066d(sArr, i13, i17, i16);
                            f = f4;
                            d = d2;
                        } else {
                            m1064b(sArr, i13, i15);
                            f = f4;
                            d = d2;
                            short[] sArr2 = this.f1541i;
                            int iM1066d2 = m1066d(sArr2, i10, i17 / i15, i16 / i15);
                            if (i15 != 1) {
                                int i18 = iM1066d2 * i15;
                                int i19 = i15 * 4;
                                int i20 = i18 - i19;
                                int i21 = i18 + i19;
                                if (i20 >= i17) {
                                    i17 = i20;
                                }
                                if (i21 <= i16) {
                                    i16 = i21;
                                }
                                if (i9 == 1) {
                                    iM1066d = m1066d(sArr, i13, i17, i16);
                                } else {
                                    m1064b(sArr, i13, 1);
                                    iM1066d = m1066d(sArr2, i10, i17, i16);
                                }
                            } else {
                                iM1066d = iM1066d2;
                            }
                        }
                        int i22 = this.f1553u;
                        int i23 = this.f1554v;
                        if (i22 == 0 || (i = this.f1551s) == 0 || i23 > i22 * 3 || i22 * 2 <= this.f1552t * 3) {
                            i = iM1066d;
                        }
                        this.f1552t = i22;
                        this.f1551s = iM1066d;
                        short[] sArr3 = this.f1542j;
                        double d3 = this.f1555w;
                        if (d > 1.0d) {
                            if (d >= 2.0d) {
                                double d4 = (((double) i) / (d - 1.0d)) + d3;
                                iRound = (int) Math.round(d4);
                                this.f1555w = d4 - ((double) iRound);
                            } else {
                                double d5 = (((2.0d - d) * ((double) i)) / (d - 1.0d)) + d3;
                                int iRound2 = (int) Math.round(d5);
                                this.f1550r = iRound2;
                                this.f1555w = d5 - ((double) iRound2);
                                iRound = i;
                            }
                            short[] sArrM1065c = m1065c(this.f1544l, this.f1545m, iRound);
                            this.f1544l = sArrM1065c;
                            int i24 = i13 + i;
                            int i25 = i13;
                            int i26 = iRound;
                            m1062e(i26, this.f1534b, sArrM1065c, this.f1545m, sArr3, i25, sArr3, i24);
                            this.f1545m += i26;
                            i13 = i + i26 + i25;
                        } else {
                            i12 = i12;
                            int i27 = i13;
                            if (d < 0.5d) {
                                double d6 = ((((double) i) * d) / (1.0d - d)) + d3;
                                int iRound3 = (int) Math.round(d6);
                                this.f1555w = d6 - ((double) iRound3);
                                i2 = iRound3;
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * ((double) i)) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.f1550r = iRound4;
                                this.f1555w = d7 - ((double) iRound4);
                                i2 = i;
                            }
                            int i28 = i + i2;
                            short[] sArrM1065c2 = m1065c(this.f1544l, this.f1545m, i28);
                            this.f1544l = sArrM1065c2;
                            System.arraycopy(sArr3, i27 * i9, sArrM1065c2, this.f1545m * i9, i * i9);
                            m1062e(i2, this.f1534b, this.f1544l, this.f1545m + i, sArr3, i27 + i, sArr3, i27);
                            this.f1545m += i28;
                            i13 = i27 + i2;
                        }
                    }
                    if (i13 + i12 > i11) {
                        break;
                    }
                    i10 = 0;
                    i12 = i12;
                    i8 = 1;
                    f4 = f;
                    d2 = d;
                }
                int i29 = this.f1543k - i13;
                short[] sArr4 = this.f1542j;
                System.arraycopy(sArr4, i13 * i9, sArr4, 0, i29 * i9);
                this.f1543k = i29;
            }
            if (f != 1.0f || this.f1545m == i6) {
            }
            long j3 = (long) (i7 / f);
            long j4 = i7;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i30 = this.f1545m - i6;
            short[] sArrM1065c3 = m1065c(this.f1546n, this.f1547o, i30);
            this.f1546n = sArrM1065c3;
            System.arraycopy(this.f1544l, i6 * i9, sArrM1065c3, this.f1547o * i9, i30 * i9);
            this.f1545m = i6;
            this.f1547o += i30;
            int i31 = 0;
            while (true) {
                i3 = this.f1547o;
                i4 = i3 - 1;
                if (i31 >= i4) {
                    break;
                }
                while (true) {
                    i5 = this.f1548p + 1;
                    j = i5;
                    long j5 = j * j3;
                    j2 = this.f1549q;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.f1544l = m1065c(this.f1544l, this.f1545m, 1);
                    int i32 = 0;
                    while (i32 < i9) {
                        short[] sArr5 = this.f1544l;
                        int i33 = (this.f1545m * i9) + i32;
                        short[] sArr6 = this.f1546n;
                        int i34 = (i31 * i9) + i32;
                        short s = sArr6[i34];
                        short s2 = sArr6[i34 + i9];
                        long j6 = ((long) this.f1549q) * j4;
                        int i35 = this.f1548p;
                        long j7 = j3;
                        int i36 = i31;
                        long j8 = ((long) (i35 + 1)) * j7;
                        long j9 = j8 - j6;
                        long j10 = j8 - (((long) i35) * j7);
                        sArr5[i33] = (short) ((((j10 - j9) * ((long) s2)) + (((long) s) * j9)) / j10);
                        i32++;
                        i31 = i36;
                        j3 = j7;
                    }
                    this.f1549q++;
                    this.f1545m++;
                    i31 = i31;
                    j3 = j3;
                }
                long j11 = j3;
                int i37 = i31;
                this.f1548p = i5;
                if (j == j4) {
                    this.f1548p = 0;
                    ki0.m3864h(j2 == j11);
                    this.f1549q = 0;
                }
                i31 = i37 + 1;
                j3 = j11;
            }
            if (i4 == 0) {
                return;
            }
            short[] sArr7 = this.f1546n;
            System.arraycopy(sArr7, i4 * i9, sArr7, 0, (i3 - i4) * i9);
            this.f1547o -= i4;
            return;
        }
        m1063a(this.f1542j, 0, this.f1543k);
        this.f1543k = 0;
        f = f4;
        if (f != 1.0f) {
        }
    }
}
