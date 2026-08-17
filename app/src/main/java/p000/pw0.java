package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pw0 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final byte[] f9183c;

    /* JADX INFO: renamed from: d */
    public final byte[] f9184d;

    /* JADX INFO: renamed from: e */
    public final byte[] f9185e;

    /* JADX INFO: renamed from: f */
    public final byte[] f9186f;

    /* JADX INFO: renamed from: g */
    public final byte[] f9187g;

    /* JADX INFO: renamed from: m */
    public final byte[] f9188m;

    /* JADX INFO: renamed from: n */
    public final int f9189n;

    public pw0(ow0 ow0Var, byte[] bArr, rw0 rw0Var) {
        pw0 pw0Var;
        int i;
        int i2;
        super((Object) ow0Var, true);
        ch1 ch1Var = new ch1(ow0Var.f8502b, 3);
        int i3 = ch1Var.f1809d;
        int i4 = ch1Var.f1810e;
        if (bArr.length == 64) {
            byte[] bArrM6067k = sc2.m6067k(0, 32, bArr);
            byte[] bArrM6067k2 = sc2.m6067k(32, bArr.length, bArr);
            lw0 lw0Var = (lw0) ch1Var.f1812g;
            ch1 ch1Var2 = (ch1) lw0Var.f6532e;
            l91 l91Var = new l91(ch1Var2);
            l91 l91Var2 = new l91(ch1Var2);
            i2 = 2;
            l91 l91Var3 = new l91(ch1Var2);
            byte[] bArr2 = new byte[64];
            C0599ed c0599ed = (C0599ed) lw0Var.f6533f;
            int i5 = lw0Var.f6528a;
            int length = bArrM6067k.length;
            byte[] bArr3 = new byte[length + 1];
            System.arraycopy(bArrM6067k, 0, bArr3, 0, length);
            bArr3[length] = (byte) i5;
            pn1 pn1Var = (pn1) c0599ed.f3314b;
            rn1 rn1Var = (rn1) c0599ed.f3313a;
            pn1Var.mo729e(0, bArr3.length, bArr3);
            pn1Var.mo3526b(0, bArr2);
            byte[] bArr4 = new byte[32];
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr2, 0, bArr4, 0, 32);
            System.arraycopy(bArr2, 32, bArr5, 0, 32);
            l91[] l91VarArr = new l91[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                l91VarArr[i6] = new l91(ch1Var2);
            }
            int i7 = lw0Var.f6531d * 168;
            byte[] bArr6 = new byte[i7 + 2];
            int i8 = 0;
            while (i8 < i5) {
                int i9 = 0;
                while (i9 < i5) {
                    int i10 = i3;
                    rn1Var.m6130k();
                    int i11 = i8;
                    byte[] bArr7 = new byte[34];
                    int i12 = i9;
                    System.arraycopy(bArr4, 0, bArr7, 0, 32);
                    bArr7[32] = (byte) i9;
                    bArr7[33] = (byte) i8;
                    rn1Var.mo729e(0, 34, bArr7);
                    rn1Var.m5865n(0, i7, bArr6);
                    int iM4308i = lw0.m4308i(((C0082b0[]) l91VarArr[i11].f6280d)[i12], 0, 256, bArr6, i7);
                    int i13 = i7;
                    for (int i14 = 256; iM4308i < i14; i14 = 256) {
                        int i15 = i13 % 3;
                        int i16 = i13;
                        for (int i17 = 0; i17 < i15; i17++) {
                            bArr6[i17] = bArr6[(i16 - i15) + i17];
                        }
                        rn1Var.m5865n(i15, 336, bArr6);
                        i13 = i15 + 168;
                        iM4308i += lw0.m4308i(((C0082b0[]) l91VarArr[i11].f6280d)[i12], iM4308i, 256 - iM4308i, bArr6, i13);
                        i7 = i7;
                    }
                    i9 = i12 + 1;
                    i3 = i10;
                    i8 = i11;
                }
                i8++;
            }
            int i18 = i3;
            byte b = 0;
            for (int i19 = 0; i19 < i5; i19++) {
                ((C0082b0[]) l91Var.f6280d)[i19].m805g(b, bArr5);
                b = (byte) (b + 1);
            }
            for (int i20 = 0; i20 < i5; i20++) {
                ((C0082b0[]) l91Var3.f6280d)[i20].m805g(b, bArr5);
                b = (byte) (b + 1);
            }
            l91Var.m4150e();
            l91Var3.m4150e();
            int i21 = 0;
            while (i21 < i5) {
                C0082b0 c0082b0 = ((C0082b0[]) l91Var2.f6280d)[i21];
                l91 l91Var4 = l91VarArr[i21];
                C0082b0 c0082b1 = new C0082b0(ch1Var2);
                C0082b0.m798b(c0082b0, ((C0082b0[]) l91Var4.f6280d)[0], ((C0082b0[]) l91Var.f6280d)[0]);
                for (int i22 = 1; i22 < ch1Var2.f1806a; i22++) {
                    C0082b0.m798b(c0082b1, ((C0082b0[]) l91Var4.f6280d)[i22], ((C0082b0[]) l91Var.f6280d)[i22]);
                    int i23 = 0;
                    while (i23 < 256) {
                        short[] sArr = (short[]) c0082b0.f1104c;
                        sArr[i23] = (short) (sArr[i23] + ((short[]) c0082b1.f1104c)[i23]);
                        i23++;
                        i21 = i21;
                    }
                    c0082b0.getClass();
                }
                int i24 = i21;
                c0082b0.m813p();
                C0082b0 c0082b2 = ((C0082b0[]) l91Var2.f6280d)[i24];
                for (int i25 = 0; i25 < 256; i25++) {
                    ((short[]) c0082b2.f1104c)[i25] = rc2.m5776Z(((short[]) c0082b2.f1104c)[i25] * 1353);
                }
                c0082b2.getClass();
                i21 = i24 + 1;
            }
            for (int i26 = 0; i26 < l91Var2.f6278b; i26++) {
                C0082b0 c0082b3 = ((C0082b0[]) l91Var2.f6280d)[i26];
                C0082b0 c0082b4 = ((C0082b0[]) l91Var3.f6280d)[i26];
                for (int i27 = 0; i27 < 256; i27++) {
                    short[] sArr2 = (short[]) c0082b3.f1104c;
                    sArr2[i27] = (short) (sArr2[i27] + ((short[]) c0082b4.f1104c)[i27]);
                }
                c0082b3.getClass();
            }
            for (int i28 = 0; i28 < l91Var2.f6278b; i28++) {
                ((C0082b0[]) l91Var2.f6280d)[i28].m813p();
            }
            byte[] bArr8 = new byte[lw0Var.f6529b];
            byte[] bArrM4152h = l91Var2.m4152h();
            int i29 = lw0Var.f6530c;
            i = 0;
            System.arraycopy(bArrM4152h, 0, bArr8, 0, i29);
            System.arraycopy(bArr4, 0, bArr8, i29, 32);
            byte[][] bArr9 = {bArr8, l91Var.m4152h()};
            byte[] bArr10 = new byte[i4];
            System.arraycopy(bArr9[1], 0, bArr10, 0, i4);
            byte[] bArr11 = new byte[32];
            C0599ed c0599ed2 = (C0599ed) ch1Var.f1813h;
            byte[] bArr12 = bArr9[0];
            pn1 pn1Var2 = (pn1) c0599ed2.f3315c;
            pn1Var2.mo729e(0, bArr12.length, bArr12);
            pn1Var2.mo3526b(0, bArr11);
            byte[] bArr13 = new byte[i18];
            System.arraycopy(bArr9[0], 0, bArr13, 0, i18);
            int i30 = i18 - 32;
            byte[][] bArr14 = {sc2.m6067k(0, i30, bArr13), sc2.m6067k(i30, i18, bArr13), bArr10, bArr11, bArrM6067k2, sc2.m6064h(bArrM6067k, bArrM6067k2)};
            pw0Var = this;
            pw0Var.f9183c = bArr14[2];
            pw0Var.f9184d = bArr14[3];
            pw0Var.f9185e = bArr14[4];
            pw0Var.f9186f = bArr14[0];
            pw0Var.f9187g = bArr14[1];
            pw0Var.f9188m = bArr14[5];
        } else {
            pw0Var = this;
            i = 0;
            i2 = 2;
            pw0Var.f9183c = sc2.m6067k(0, i4, bArr);
            pw0Var.f9186f = sc2.m6067k(i4, (i4 + i3) - 32, bArr);
            int i31 = (i3 - 32) + i4;
            int i32 = i31 + 32;
            pw0Var.f9187g = sc2.m6067k(i31, i32, bArr);
            int i33 = i31 + 64;
            pw0Var.f9184d = sc2.m6067k(i32, i33, bArr);
            pw0Var.f9185e = sc2.m6067k(i33, i31 + 96, bArr);
            pw0Var.f9188m = null;
        }
        if (rw0Var != null && (!sc2.m6066j(pw0Var.f9186f, rw0Var.f10150c) || !sc2.m6066j(pw0Var.f9187g, rw0Var.f10151d))) {
            f40.m2713i("passed in public key does not match private values");
            throw null;
        }
        pw0Var.f9189n = pw0Var.f9188m == null ? i2 : i;
    }

    public final byte[] getEncoded() {
        return sc2.m6065i(new byte[][]{this.f9183c, this.f9186f, this.f9187g, this.f9184d, this.f9185e});
    }
}
