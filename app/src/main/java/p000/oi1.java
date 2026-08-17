package p000;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class oi1 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final byte[] f7806c;

    /* JADX INFO: renamed from: d */
    public final short[][] f7807d;

    /* JADX INFO: renamed from: e */
    public final short[][] f7808e;

    /* JADX INFO: renamed from: f */
    public final short[][] f7809f;

    /* JADX INFO: renamed from: g */
    public final short[][] f7810g;

    /* JADX INFO: renamed from: m */
    public final short[][][] f7811m;

    /* JADX INFO: renamed from: n */
    public final short[][][] f7812n;

    /* JADX INFO: renamed from: o */
    public final short[][][] f7813o;

    /* JADX INFO: renamed from: p */
    public final short[][][] f7814p;

    /* JADX INFO: renamed from: q */
    public final short[][][] f7815q;

    /* JADX INFO: renamed from: r */
    public final short[][][] f7816r;

    /* JADX INFO: renamed from: s */
    public final short[][][] f7817s;

    /* JADX INFO: renamed from: t */
    public final byte[] f7818t;

    /* JADX INFO: renamed from: u */
    public final byte[] f7819u;

    public oi1(ni1 ni1Var, byte[] bArr) {
        super(true, ni1Var);
        aw0 aw0Var = ni1Var.f7426f;
        int i = ni1Var.f7423c;
        int i2 = ni1Var.f7422b;
        int i3 = ni1Var.f7421a;
        int i4 = ni1Var.f7427g;
        Class cls = Short.TYPE;
        int i5 = 0;
        if (i4 != 3) {
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
            this.f7807d = sArr;
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, i3, i2);
            this.f7808e = sArr2;
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, i3, i);
            this.f7810g = sArr3;
            short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
            this.f7809f = sArr4;
            short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i3);
            this.f7811m = sArr5;
            short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i2);
            this.f7812n = sArr6;
            short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i3);
            this.f7813o = sArr7;
            short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i2);
            this.f7814p = sArr8;
            short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i);
            this.f7815q = sArr9;
            short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i2);
            this.f7816r = sArr10;
            short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i);
            this.f7817s = sArr11;
            this.f7818t = null;
            byte[] bArrM6067k = sc2.m6067k(0, 32, bArr);
            this.f7806c = bArrM6067k;
            int length = bArrM6067k.length;
            int iM4651V = o21.m4651V(sArr, bArr, length) + length;
            int iM4651V2 = o21.m4651V(sArr2, bArr, iM4651V) + iM4651V;
            int iM4651V3 = o21.m4651V(sArr3, bArr, iM4651V2) + iM4651V2;
            int iM4651V4 = o21.m4651V(sArr4, bArr, iM4651V3) + iM4651V3;
            int iM4652W = o21.m4652W(sArr5, bArr, iM4651V4, true) + iM4651V4;
            int iM4652W2 = o21.m4652W(sArr6, bArr, iM4652W, false) + iM4652W;
            int iM4652W3 = o21.m4652W(sArr7, bArr, iM4652W2, true) + iM4652W2;
            int iM4652W4 = o21.m4652W(sArr8, bArr, iM4652W3, false) + iM4652W3;
            int iM4652W5 = o21.m4652W(sArr9, bArr, iM4652W4, false) + iM4652W4;
            int iM4652W6 = o21.m4652W(sArr10, bArr, iM4652W5, true) + iM4652W5;
            this.f7819u = sc2.m6067k(o21.m4652W(sArr11, bArr, iM4652W6, false) + iM4652W6, bArr.length, bArr);
            return;
        }
        byte[] bArrM6067k2 = sc2.m6067k(0, 32, bArr);
        this.f7818t = bArrM6067k2;
        byte[] bArrM6067k3 = sc2.m6067k(32, 64, bArr);
        this.f7806c = bArrM6067k3;
        byte[] bArrM6061e = sc2.m6061e(bArrM6067k3);
        byte[] bArrM6061e2 = sc2.m6061e(bArrM6067k2);
        mi1 mi1Var = new mi1(bArrM6061e, aw0Var);
        mi1 mi1Var2 = new mi1(bArrM6061e2, aw0Var);
        short[][] sArrM4635B = o21.m4635B(mi1Var, i2, i);
        short[][] sArrM4635B2 = o21.m4635B(mi1Var, i3, i2);
        short[][] sArrM4635B3 = o21.m4635B(mi1Var, i3, i);
        short[][] sArrM4635B4 = o21.m4635B(mi1Var, i2, i);
        short[][] sArrM3210a = hp0.m3210a(hp0.m3198G(sArrM4635B2, sArrM4635B4), sArrM4635B3);
        short[][][] sArrM4633A = o21.m4633A(mi1Var2, i2, i3, i3, true);
        short[][][] sArrM4633A2 = o21.m4633A(mi1Var2, i2, i3, i2, false);
        short[][][] sArrM4633A3 = o21.m4633A(mi1Var2, i, i3, i3, true);
        short[][][] sArrM4633A4 = o21.m4633A(mi1Var2, i, i3, i2, false);
        short[][][] sArrM4633A5 = o21.m4633A(mi1Var2, i, i3, i, false);
        short[][][] sArrM4633A6 = o21.m4633A(mi1Var2, i, i2, i2, true);
        short[][][] sArrM4633A7 = o21.m4633A(mi1Var2, i, i2, i, false);
        short[][][] sArrM3199H = hp0.m3199H(sArrM4635B, sArrM4633A3, sArrM4633A);
        short[][][] sArrM3199H2 = hp0.m3199H(sArrM4635B, sArrM4633A4, sArrM4633A2);
        short[][][] sArrM4675p = o21.m4675p(sArrM3199H);
        short[][][] sArr12 = new short[i2][][];
        while (i5 < i2) {
            short[][][] sArr13 = sArrM4633A3;
            short[][] sArrM3211b = hp0.m3211b(sArrM3199H[i5]);
            sArr12[i5] = sArrM3211b;
            short[][] sArrM3198G = hp0.m3198G(sArrM3211b, sArrM4635B2);
            sArr12[i5] = sArrM3198G;
            sArr12[i5] = hp0.m3210a(sArrM3198G, sArrM3199H2[i5]);
            i5++;
            sArrM4633A4 = sArrM4633A4;
            sArrM4633A3 = sArr13;
        }
        short[][][] sArr14 = sArrM4633A3;
        short[][][] sArr15 = sArrM4633A4;
        short[][][] sArr16 = new short[i][][];
        short[][][] sArr17 = new short[i][][];
        short[][][] sArr18 = new short[i][][];
        short[][][] sArr19 = new short[i][][];
        short[][][] sArrM4675p2 = o21.m4675p(sArr14);
        int i6 = 0;
        while (i6 < i) {
            short[][][] sArr20 = sArr16;
            short[][] sArrM3211b2 = hp0.m3211b(sArr14[i6]);
            short[][][] sArr21 = sArr19;
            short[][] sArrM3198G2 = hp0.m3198G(sArrM3211b2, sArrM4635B2);
            sArr20[i6] = sArrM3198G2;
            short[][][] sArr22 = sArr12;
            sArr20[i6] = hp0.m3210a(sArrM3198G2, sArr15[i6]);
            sArr17[i6] = hp0.m3198G(sArrM3211b2, sArrM3210a);
            short[][] sArrM3210a2 = hp0.m3210a(sArr17[i6], hp0.m3198G(sArr15[i6], sArrM4635B4));
            sArr17[i6] = sArrM3210a2;
            sArr17[i6] = hp0.m3210a(sArrM3210a2, sArrM4633A5[i6]);
            short[][] sArrM3210a3 = hp0.m3210a(hp0.m3198G(sArr14[i6], sArrM4635B2), sArr15[i6]);
            short[][] sArrM3209S = hp0.m3209S(sArrM4635B2);
            short[][] sArrM3198G3 = hp0.m3198G(sArrM3209S, sArrM3210a3);
            sArr18[i6] = sArrM3198G3;
            short[][] sArrM3210a4 = hp0.m3210a(sArrM3198G3, sArrM4633A6[i6]);
            sArr18[i6] = sArrM3210a4;
            short[][] sArr23 = sArrM4635B;
            if (sArrM3210a4.length != sArrM3210a4[0].length) {
                l41.m4048q("Computation to upper triangular matrix is not possible!");
                throw null;
            }
            short[][] sArr24 = (short[][]) Array.newInstance((Class<?>) cls, sArrM3210a4.length, sArrM3210a4.length);
            int i7 = 0;
            while (i7 < sArrM3210a4.length) {
                sArr24[i7][i7] = sArrM3210a4[i7][i7];
                short[][] sArr25 = sArrM3210a4;
                int i8 = i7 + 1;
                while (i8 < sArr25[0].length) {
                    short[] sArr26 = sArr24[i7];
                    short s = sArr25[i7][i8];
                    short s2 = sArr25[i8][i7];
                    byte[][] bArr2 = th0.f10881a;
                    int i9 = i8;
                    sArr26[i9] = (short) (s ^ s2);
                    i8 = i9 + 1;
                }
                sArrM3210a4 = sArr25;
                i7 = i8;
            }
            sArr18[i6] = sArr24;
            sArr21[i6] = hp0.m3198G(sArrM3209S, sArr17[i6]);
            sArr21[i6] = hp0.m3210a(sArr21[i6], hp0.m3198G(hp0.m3209S(sArr15[i6]), sArrM3210a));
            short[][] sArrM3210a5 = hp0.m3210a(sArr21[i6], hp0.m3198G(hp0.m3211b(sArrM4633A6[i6]), sArrM4635B4));
            sArr21[i6] = sArrM3210a5;
            sArr21[i6] = hp0.m3210a(sArrM3210a5, sArrM4633A7[i6]);
            i6++;
            sArr19 = sArr21;
            sArr16 = sArr20;
            sArr12 = sArr22;
            sArrM4635B = sArr23;
        }
        oi1 oi1Var = new oi1(ni1Var, bArrM6061e, sArrM4635B, sArrM4635B2, sArrM4635B4, sArrM3210a, sArrM4675p, sArr12, sArrM4675p2, sArr16, sArr17, sArr18, sArr19);
        this.f7819u = null;
        this.f7807d = oi1Var.f7807d;
        this.f7808e = oi1Var.f7808e;
        this.f7809f = oi1Var.f7809f;
        this.f7810g = oi1Var.f7810g;
        this.f7811m = oi1Var.f7811m;
        this.f7812n = oi1Var.f7812n;
        this.f7813o = oi1Var.f7813o;
        this.f7814p = oi1Var.f7814p;
        this.f7815q = oi1Var.f7815q;
        this.f7816r = oi1Var.f7816r;
        this.f7817s = oi1Var.f7817s;
    }

    public final byte[] getEncoded() {
        int i = ((ni1) this.f7397b).f7427g;
        byte[] bArr = this.f7806c;
        byte[] bArr2 = this.f7818t;
        if (i == 3) {
            return sc2.m6064h(bArr2, bArr);
        }
        return sc2.m6064h(i == 3 ? sc2.m6064h(bArr2, bArr) : sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(sc2.m6064h(bArr, o21.m4642L(this.f7807d)), o21.m4642L(this.f7808e)), o21.m4642L(this.f7810g)), o21.m4642L(this.f7809f)), o21.m4643M(this.f7811m, true)), o21.m4643M(this.f7812n, false)), o21.m4643M(this.f7813o, true)), o21.m4643M(this.f7814p, false)), o21.m4643M(this.f7815q, false)), o21.m4643M(this.f7816r, true)), o21.m4643M(this.f7817s, false)), this.f7819u);
    }

    public oi1(ni1 ni1Var, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, ni1Var);
        this.f7818t = null;
        this.f7819u = null;
        this.f7806c = (byte[]) bArr.clone();
        this.f7807d = o21.m4673o(sArr);
        this.f7808e = o21.m4673o(sArr2);
        this.f7809f = o21.m4673o(sArr3);
        this.f7810g = o21.m4673o(sArr4);
        this.f7811m = o21.m4675p(sArr5);
        this.f7812n = o21.m4675p(sArr6);
        this.f7813o = o21.m4675p(sArr7);
        this.f7814p = o21.m4675p(sArr8);
        this.f7815q = o21.m4675p(sArr9);
        this.f7816r = o21.m4675p(sArr10);
        this.f7817s = o21.m4675p(sArr11);
    }
}
