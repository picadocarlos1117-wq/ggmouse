package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jw0 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final byte[] f5577c;

    /* JADX INFO: renamed from: d */
    public final byte[] f5578d;

    /* JADX INFO: renamed from: e */
    public final byte[] f5579e;

    /* JADX INFO: renamed from: f */
    public final byte[] f5580f;

    /* JADX INFO: renamed from: g */
    public final byte[] f5581g;

    /* JADX INFO: renamed from: m */
    public final byte[] f5582m;

    /* JADX INFO: renamed from: n */
    public final byte[] f5583n;

    /* JADX INFO: renamed from: o */
    public final byte[] f5584o;

    /* JADX INFO: renamed from: p */
    public final int f5585p;

    public jw0(iw0 iw0Var, byte[] bArr, kw0 kw0Var) throws Throwable {
        jw0 jw0Var;
        C1174o9[] c1174o9Arr;
        C1174o9[] c1174o9Arr2;
        int i;
        Throwable th;
        C1174o9[] c1174o9Arr3;
        C1174o9[] c1174o9Arr4;
        super((Object) iw0Var, true);
        ch1 ch1Var = new ch1(iw0Var.f5192a, 2);
        int i2 = ch1Var.f1808c;
        int i3 = ch1Var.f1806a;
        int i4 = ch1Var.f1807b;
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[128];
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[32];
            byte[] bArr5 = new byte[64];
            byte[] bArr6 = new byte[32];
            pn0 pn0Var = new pn0(ch1Var);
            hf1 hf1Var = new hf1(ch1Var, 1);
            hf1 hf1Var2 = new hf1(ch1Var, 0);
            hf1 hf1Var3 = new hf1(ch1Var, 0);
            hf1 hf1Var4 = new hf1(ch1Var, 0);
            rn1 rn1Var = (rn1) ch1Var.f1812g;
            rn1Var.mo729e(0, 32, bArr);
            rn1Var.mo728c((byte) i4);
            rn1Var.mo728c((byte) i2);
            rn1Var.m5864m(0, 128, bArr2);
            System.arraycopy(bArr2, 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 32, bArr5, 0, 64);
            System.arraycopy(bArr2, 96, bArr6, 0, 32);
            pn0Var.m5286g(bArr4);
            int i5 = 0;
            short s = 0;
            while (true) {
                c1174o9Arr3 = hf1Var.f4558b;
                if (i5 >= c1174o9Arr3.length) {
                    break;
                }
                c1174o9Arr3[i5].m4759b0(bArr5, s);
                i5++;
                s = (short) (s + 1);
            }
            short s2 = (short) i2;
            int i6 = 0;
            while (true) {
                c1174o9Arr4 = hf1Var2.f4558b;
                if (i6 >= c1174o9Arr4.length) {
                    break;
                }
                c1174o9Arr4[i6].m4759b0(bArr5, s2);
                i6++;
                s2 = (short) (s2 + 1);
            }
            hf1 hf1Var5 = new hf1(ch1Var, 1);
            for (int i7 = 0; i7 < c1174o9Arr3.length; i7++) {
                System.arraycopy((int[]) c1174o9Arr3[i7].f7699b, 0, (int[]) hf1Var5.f4558b[i7].f7699b, 0, 256);
            }
            hf1Var5.m3137c();
            pn0Var.m5291m(hf1Var3, hf1Var5);
            hf1Var3.m3139e();
            hf1Var3.m3136b();
            int i8 = 0;
            while (true) {
                C1174o9[] c1174o9Arr5 = hf1Var3.f4558b;
                if (i8 >= c1174o9Arr5.length) {
                    break;
                }
                C1174o9 c1174o9 = c1174o9Arr5[i8];
                C1174o9 c1174o10 = c1174o9Arr4[i8];
                int i9 = 0;
                while (i9 < 256) {
                    int[] iArr = (int[]) c1174o9.f7699b;
                    iArr[i9] = iArr[i9] + ((int[]) c1174o10.f7699b)[i9];
                    i9++;
                    i8 = i8;
                }
                c1174o9.getClass();
                i8++;
            }
            hf1Var3.m3135a();
            hf1Var3.m3138d(hf1Var4);
            byte[] bArrM5515P = AbstractC1337qm.m5515P(hf1Var3, ch1Var);
            rn1Var.mo729e(0, 32, bArr4);
            rn1Var.mo729e(0, bArrM5515P.length, bArrM5515P);
            rn1Var.m5864m(0, 64, bArr3);
            byte[][] bArr7 = new byte[6][];
            bArr7[0] = bArr4;
            bArr7[1] = bArr6;
            bArr7[2] = bArr3;
            bArr7[3] = new byte[i2 * i3];
            for (int i10 = 0; i10 < i2; i10++) {
                c1174o9Arr3[i10].m4751R(i10 * i3, bArr7[3]);
            }
            bArr7[4] = new byte[i4 * i3];
            for (int i11 = 0; i11 < i4; i11++) {
                c1174o9Arr4[i11].m4751R(i11 * i3, bArr7[4]);
            }
            bArr7[5] = new byte[i4 * 416];
            int i12 = 0;
            while (i12 < i4) {
                C1174o9 c1174o11 = hf1Var4.f4558b[i12];
                byte[] bArr8 = bArr7[5];
                int i13 = i12 * 416;
                int i14 = 0;
                while (i14 < 32) {
                    int i15 = i14 * 8;
                    int[] iArr2 = (int[]) c1174o11.f7699b;
                    int i16 = i12;
                    int[] iArr3 = {4096 - iArr2[i15], 4096 - iArr2[i15 + 1], 4096 - iArr2[i15 + 2], 4096 - iArr2[i15 + 3], 4096 - iArr2[i15 + 4], 4096 - iArr2[i15 + 5], 4096 - iArr2[i15 + 6], 4096 - iArr2[i15 + 7]};
                    int i17 = (i14 * 13) + i13;
                    int i18 = iArr3[0];
                    bArr8[i17] = (byte) i18;
                    int i19 = i17 + 1;
                    byte b = (byte) (i18 >> 8);
                    bArr8[i19] = b;
                    int i20 = iArr3[1];
                    bArr8[i19] = (byte) (b | ((byte) (i20 << 5)));
                    bArr8[i17 + 2] = (byte) (i20 >> 3);
                    int i21 = i17 + 3;
                    byte b2 = (byte) (i20 >> 11);
                    bArr8[i21] = b2;
                    int i22 = iArr3[2];
                    bArr8[i21] = (byte) (b2 | ((byte) (i22 << 2)));
                    int i23 = i17 + 4;
                    byte b3 = (byte) (i22 >> 6);
                    bArr8[i23] = b3;
                    int i24 = iArr3[3];
                    bArr8[i23] = (byte) (b3 | ((byte) (i24 << 7)));
                    bArr8[i17 + 5] = (byte) (i24 >> 1);
                    int i25 = i17 + 6;
                    byte b4 = (byte) (i24 >> 9);
                    bArr8[i25] = b4;
                    int i26 = iArr3[4];
                    bArr8[i25] = (byte) (b4 | ((byte) (i26 << 4)));
                    bArr8[i17 + 7] = (byte) (i26 >> 4);
                    int i27 = i17 + 8;
                    byte b5 = (byte) (i26 >> 12);
                    bArr8[i27] = b5;
                    int i28 = iArr3[5];
                    bArr8[i27] = (byte) (b5 | ((byte) (i28 << 1)));
                    int i29 = i17 + 9;
                    byte b6 = (byte) (i28 >> 7);
                    bArr8[i29] = b6;
                    int i30 = iArr3[6];
                    bArr8[i29] = (byte) (b6 | ((byte) (i30 << 6)));
                    bArr8[i17 + 10] = (byte) (i30 >> 2);
                    int i31 = i17 + 11;
                    byte b7 = (byte) (i30 >> 10);
                    bArr8[i31] = b7;
                    int i32 = iArr3[7];
                    bArr8[i31] = (byte) (b7 | ((byte) (i32 << 3)));
                    bArr8[i17 + 12] = (byte) (i32 >> 5);
                    i14++;
                    i12 = i16;
                }
                c1174o11.getClass();
                i12++;
            }
            byte[][] bArr9 = {bArr7[0], bArr7[1], bArr7[2], bArr7[3], bArr7[4], bArr7[5], bArrM5515P, bArr};
            jw0Var = this;
            jw0Var.f5577c = bArr9[0];
            jw0Var.f5578d = bArr9[1];
            jw0Var.f5579e = bArr9[2];
            jw0Var.f5580f = bArr9[3];
            jw0Var.f5581g = bArr9[4];
            jw0Var.f5582m = bArr9[5];
            jw0Var.f5583n = bArr9[6];
            jw0Var.f5584o = bArr9[7];
            th = null;
            i = 0;
        } else {
            jw0Var = this;
            byte[] bArrM6067k = sc2.m6067k(0, 32, bArr);
            jw0Var.f5577c = bArrM6067k;
            jw0Var.f5578d = sc2.m6067k(32, 64, bArr);
            jw0Var.f5579e = sc2.m6067k(64, 128, bArr);
            int i33 = (i2 * i3) + 128;
            byte[] bArrM6067k2 = sc2.m6067k(128, i33, bArr);
            jw0Var.f5580f = bArrM6067k2;
            int i34 = (i4 * i3) + i33;
            byte[] bArrM6067k3 = sc2.m6067k(i33, i34, bArr);
            jw0Var.f5581g = bArrM6067k3;
            byte[] bArrM6067k4 = sc2.m6067k(i34, (i4 * 416) + i34, bArr);
            jw0Var.f5582m = bArrM6067k4;
            pn0 pn0Var2 = new pn0(ch1Var);
            hf1 hf1Var6 = new hf1(ch1Var, 1);
            hf1 hf1Var7 = new hf1(ch1Var, 0);
            hf1 hf1Var8 = new hf1(ch1Var, 0);
            hf1 hf1Var9 = new hf1(ch1Var, 0);
            int i35 = 0;
            while (true) {
                c1174o9Arr = hf1Var6.f4558b;
                if (i35 >= i2) {
                    break;
                }
                c1174o9Arr[i35].m4752S(i35 * i3, bArrM6067k2);
                i35++;
            }
            int i36 = 0;
            while (true) {
                c1174o9Arr2 = hf1Var7.f4558b;
                if (i36 >= i4) {
                    break;
                }
                c1174o9Arr2[i36].m4752S(i36 * i3, bArrM6067k3);
                i36++;
            }
            for (int i37 = 0; i37 < i4; i37++) {
                C1174o9 c1174o12 = hf1Var9.f4558b[i37];
                int i38 = i37 * 416;
                c1174o12.getClass();
                int i39 = 0;
                while (i39 < 32) {
                    int i40 = (i39 * 13) + i38;
                    int i41 = i39 * 8;
                    int i42 = bArrM6067k4[i40] & 255;
                    C1174o9[] c1174o9Arr6 = c1174o9Arr2;
                    int i43 = bArrM6067k4[i40 + 1] & 255;
                    int i44 = (i42 | (i43 << 8)) & 8191;
                    int[] iArr4 = (int[]) c1174o12.f7699b;
                    iArr4[i41] = i44;
                    int i45 = i41 + 1;
                    int i46 = (i43 >> 5) | ((bArrM6067k4[i40 + 2] & 255) << 3);
                    int i47 = bArrM6067k4[i40 + 3] & 255;
                    iArr4[i45] = (i46 | (i47 << 11)) & 8191;
                    int i48 = i41 + 2;
                    int i49 = i47 >> 2;
                    int i50 = bArrM6067k4[i40 + 4] & 255;
                    iArr4[i48] = (i49 | (i50 << 6)) & 8191;
                    int i51 = i41 + 3;
                    int i52 = (i50 >> 7) | ((bArrM6067k4[i40 + 5] & 255) << 1);
                    int i53 = bArrM6067k4[i40 + 6] & 255;
                    iArr4[i51] = (i52 | (i53 << 9)) & 8191;
                    int i54 = i41 + 4;
                    int i55 = (i53 >> 4) | ((bArrM6067k4[i40 + 7] & 255) << 4);
                    int i56 = bArrM6067k4[i40 + 8] & 255;
                    iArr4[i54] = (i55 | (i56 << 12)) & 8191;
                    int i57 = i41 + 5;
                    int i58 = i56 >> 1;
                    int i59 = bArrM6067k4[i40 + 9] & 255;
                    iArr4[i57] = (i58 | (i59 << 7)) & 8191;
                    int i60 = i41 + 6;
                    int i61 = (i59 >> 6) | ((bArrM6067k4[i40 + 10] & 255) << 2);
                    int i62 = bArrM6067k4[i40 + 11] & 255;
                    iArr4[i60] = (i61 | (i62 << 10)) & 8191;
                    int i63 = i41 + 7;
                    iArr4[i63] = ((i62 >> 3) | ((bArrM6067k4[i40 + 12] & 255) << 5)) & 8191;
                    iArr4[i41] = 4096 - iArr4[i41];
                    iArr4[i45] = 4096 - iArr4[i45];
                    iArr4[i48] = 4096 - iArr4[i48];
                    iArr4[i51] = 4096 - iArr4[i51];
                    iArr4[i54] = 4096 - iArr4[i54];
                    iArr4[i57] = 4096 - iArr4[i57];
                    iArr4[i60] = 4096 - iArr4[i60];
                    iArr4[i63] = 4096 - iArr4[i63];
                    i39++;
                    c1174o9Arr2 = c1174o9Arr6;
                }
            }
            C1174o9[] c1174o9Arr7 = c1174o9Arr2;
            pn0Var2.m5286g(bArrM6067k);
            hf1 hf1Var10 = new hf1(ch1Var, 1);
            for (int i64 = 0; i64 < c1174o9Arr.length; i64++) {
                System.arraycopy((int[]) c1174o9Arr[i64].f7699b, 0, (int[]) hf1Var10.f4558b[i64].f7699b, 0, 256);
            }
            i = 0;
            hf1Var10.m3137c();
            pn0Var2.m5291m(hf1Var8, hf1Var10);
            hf1Var8.m3139e();
            hf1Var8.m3136b();
            int i65 = 0;
            while (true) {
                C1174o9[] c1174o9Arr8 = hf1Var8.f4558b;
                if (i65 >= c1174o9Arr8.length) {
                    break;
                }
                C1174o9 c1174o13 = c1174o9Arr8[i65];
                C1174o9 c1174o14 = c1174o9Arr7[i65];
                for (int i66 = 0; i66 < 256; i66++) {
                    int[] iArr5 = (int[]) c1174o13.f7699b;
                    iArr5[i66] = iArr5[i66] + ((int[]) c1174o14.f7699b)[i66];
                }
                c1174o13.getClass();
                i65++;
            }
            hf1Var8.m3135a();
            hf1Var8.m3138d(hf1Var9);
            jw0Var.f5583n = AbstractC1337qm.m5515P(hf1Var8, ch1Var);
            th = null;
            jw0Var.f5584o = null;
        }
        if (kw0Var != null && !sc2.m6066j(jw0Var.f5583n, sc2.m6061e(kw0Var.f6048d))) {
            f40.m2713i("passed in public key does not match private values");
            throw th;
        }
        jw0Var.f5585p = jw0Var.f5584o == null ? 2 : i;
    }

    public final byte[] getEncoded() {
        return sc2.m6065i(new byte[][]{this.f5577c, this.f5578d, this.f5579e, this.f5580f, this.f5581g, this.f5582m});
    }
}
