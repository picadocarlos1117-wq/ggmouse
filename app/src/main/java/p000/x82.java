package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 implements y82 {

    /* JADX INFO: renamed from: m */
    public static final int[] f12480m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f12481n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final z80 f12482a;

    /* JADX INFO: renamed from: b */
    public final c22 f12483b;

    /* JADX INFO: renamed from: c */
    public final C0752ij f12484c;

    /* JADX INFO: renamed from: d */
    public final int f12485d;

    /* JADX INFO: renamed from: e */
    public final byte[] f12486e;

    /* JADX INFO: renamed from: f */
    public final dc1 f12487f;

    /* JADX INFO: renamed from: g */
    public final int f12488g;

    /* JADX INFO: renamed from: h */
    public final be0 f12489h;

    /* JADX INFO: renamed from: i */
    public int f12490i;

    /* JADX INFO: renamed from: j */
    public long f12491j;

    /* JADX INFO: renamed from: k */
    public int f12492k;

    /* JADX INFO: renamed from: l */
    public long f12493l;

    public x82(z80 z80Var, c22 c22Var, C0752ij c0752ij) throws fc1 {
        this.f12482a = z80Var;
        this.f12483b = c22Var;
        this.f12484c = c0752ij;
        int i = c0752ij.f5023b;
        int iMax = Math.max(1, i / 10);
        this.f12488g = iMax;
        dc1 dc1Var = new dc1((byte[]) c0752ij.f5026e);
        dc1Var.m2330m();
        int iM2330m = dc1Var.m2330m();
        this.f12485d = iM2330m;
        int i2 = c0752ij.f5022a;
        int i3 = c0752ij.f5024c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (c0752ij.f5025d * i2)) + 1;
        if (iM2330m != i4) {
            throw fc1.m2799a(null, "Expected frames per block: " + i4 + "; got: " + iM2330m);
        }
        int iM7231e = z42.m7231e(iMax, iM2330m);
        this.f12486e = new byte[iM7231e * i3];
        this.f12487f = new dc1(iM2330m * 2 * i2 * iM7231e);
        int i5 = ((i3 * i) * 8) / iM2330m;
        ae0 ae0Var = new ae0();
        ae0Var.f197m = v51.m6582l("audio/raw");
        ae0Var.f192h = i5;
        ae0Var.f193i = i5;
        ae0Var.f198n = iMax * 2 * i2;
        ae0Var.f175B = i2;
        ae0Var.f176C = i;
        ae0Var.f177D = 2;
        this.f12489h = new be0(ae0Var);
    }

    @Override // p000.y82
    /* JADX INFO: renamed from: a */
    public final void mo6872a(long j) {
        this.f12490i = 0;
        this.f12491j = j;
        this.f12492k = 0;
        this.f12493l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // p000.y82
    /* JADX INFO: renamed from: b */
    public final boolean mo6873b(y80 y80Var, long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        dc1 dc1Var;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        int i8;
        int iM7233g;
        int iMin;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        byte b;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f12492k;
        C0752ij c0752ij = this.f12484c;
        int i19 = i18 / (c0752ij.f5022a * 2);
        int i20 = this.f12488g;
        int i21 = this.f12485d;
        int iM7231e = z42.m7231e(i20 - i19, i21);
        int i22 = c0752ij.f5024c;
        int i23 = iM7231e * i22;
        boolean z = j == 0;
        while (true) {
            bArr = this.f12486e;
            if (z && (i16 = this.f12490i) < i23) {
                i17 = y80Var.read(bArr, this.f12490i, (int) Math.min(i23 - i16, j));
                if (i17 == -1) {
                    break;
                }
                this.f12490i += i17;
                bArr = this.f12486e;
                if (z) {
                }
            }
            i = this.f12490i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    dc1Var = this.f12487f;
                    if (i3 < i) {
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = c0752ij.f5022a;
                        if (i5 < i6) {
                            bArr2 = dc1Var.f2882a;
                            int i24 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i24;
                            i8 = (i22 / i6) - 4;
                            iM7233g = (short) ((bArr[i24] & 255) | ((bArr[i24 + 1] & 255) << 8));
                            int i25 = i;
                            iMin = Math.min(bArr[i24 + 2] & 255, 88);
                            iArr = f12481n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iM7233g & 255);
                            bArr2[i10 + 1] = (byte) (iM7233g >> 8);
                            int i26 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iM7233g = z42.m7233g(iM7233g + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iM7233g & 255);
                                bArr2[i10 + 1] = (byte) (iM7233g >> 8);
                                iMin = z42.m7233g(iMin + f12480m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i25;
                            i3 = i26;
                        }
                    }
                    i3++;
                }
                int i27 = i;
                int i28 = i21 * i27 * 2 * c0752ij.f5022a;
                dc1Var.m2316F(0);
                dc1Var.m2315E(i28);
                this.f12490i -= i27 * i22;
                int i29 = dc1Var.f2884c;
                this.f12483b.mo1115b(dc1Var, i29, 0);
                i4 = this.f12492k + i29;
                this.f12492k = i4;
                if (i4 / (c0752ij.f5022a * 2) >= i20) {
                    m6875d(i20);
                }
            }
            if (z && (i2 = this.f12492k / (c0752ij.f5022a * 2)) > 0) {
                m6875d(i2);
            }
            return z;
        }
        while (true) {
            bArr = this.f12486e;
            if (z) {
            }
            i = this.f12490i / i22;
            if (i > 0) {
                i3 = 0;
                while (true) {
                    dc1Var = this.f12487f;
                    if (i3 < i) {
                        break;
                        break;
                    }
                    i5 = 0;
                    while (true) {
                        i6 = c0752ij.f5022a;
                        if (i5 < i6) {
                            bArr2 = dc1Var.f2882a;
                            int i210 = (i5 * 4) + (i3 * i22);
                            i7 = (i6 * 4) + i210;
                            i8 = (i22 / i6) - 4;
                            iM7233g = (short) ((bArr[i210] & 255) | ((bArr[i210 + 1] & 255) << 8));
                            int i211 = i;
                            iMin = Math.min(bArr[i210 + 2] & 255, 88);
                            iArr = f12481n;
                            i9 = iArr[iMin];
                            i10 = ((i3 * i21 * i6) + i5) * 2;
                            bArr2[i10] = (byte) (iM7233g & 255);
                            bArr2[i10 + 1] = (byte) (iM7233g >> 8);
                            int i212 = i3;
                            i11 = 0;
                            while (i11 < i8 * 2) {
                                b = bArr[((i11 / 8) * i6 * 4) + i7 + ((i11 / 2) % 4)];
                                i12 = i11;
                                i13 = b & 255;
                                if (i12 % 2 == 0) {
                                    i14 = b & 15;
                                } else {
                                    i14 = i13 >> 4;
                                }
                                i15 = ((((i14 & 7) * 2) + 1) * i9) >> 3;
                                if ((i14 & 8) != 0) {
                                    i15 = -i15;
                                }
                                iM7233g = z42.m7233g(iM7233g + i15, -32768, 32767);
                                i10 = (i6 * 2) + i10;
                                bArr2[i10] = (byte) (iM7233g & 255);
                                bArr2[i10 + 1] = (byte) (iM7233g >> 8);
                                iMin = z42.m7233g(iMin + f12480m[i14], 0, 88);
                                i9 = iArr[iMin];
                                i11 = i12 + 1;
                            }
                            i5++;
                            i = i211;
                            i3 = i212;
                        }
                    }
                    i3++;
                }
                int i213 = i;
                int i214 = i21 * i213 * 2 * c0752ij.f5022a;
                dc1Var.m2316F(0);
                dc1Var.m2315E(i214);
                this.f12490i -= i213 * i22;
                int i215 = dc1Var.f2884c;
                this.f12483b.mo1115b(dc1Var, i215, 0);
                i4 = this.f12492k + i215;
                this.f12492k = i4;
                if (i4 / (c0752ij.f5022a * 2) >= i20) {
                    m6875d(i20);
                }
            }
            if (z) {
                m6875d(i2);
            }
            return z;
            this.f12490i += i17;
        }
    }

    @Override // p000.y82
    /* JADX INFO: renamed from: c */
    public final void mo6874c(int i, long j) {
        this.f12482a.mo752q(new b92(this.f12484c, this.f12485d, i, j));
        this.f12483b.mo1117d(this.f12489h);
    }

    /* JADX INFO: renamed from: d */
    public final void m6875d(int i) {
        long j = this.f12491j;
        long j2 = this.f12493l;
        C0752ij c0752ij = this.f12484c;
        long j3 = c0752ij.f5023b;
        int i2 = z42.f13274a;
        long jM7222J = j + z42.m7222J(j2, 1000000L, j3, RoundingMode.DOWN);
        int i3 = i * 2 * c0752ij.f5022a;
        this.f12483b.mo1114a(jM7222J, 1, i3, this.f12492k - i3, null);
        this.f12493l += (long) i;
        this.f12492k -= i3;
    }
}
