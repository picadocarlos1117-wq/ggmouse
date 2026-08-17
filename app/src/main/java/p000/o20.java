package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o20 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final byte[] f7619c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7620d;

    /* JADX INFO: renamed from: e */
    public final byte[] f7621e;

    /* JADX INFO: renamed from: f */
    public final byte[] f7622f;

    /* JADX INFO: renamed from: g */
    public final byte[] f7623g;

    /* JADX INFO: renamed from: m */
    public final byte[] f7624m;

    /* JADX INFO: renamed from: n */
    public final byte[] f7625n;

    public o20(n20 n20Var, byte[] bArr, p20 p20Var) {
        int i;
        char c;
        int i2;
        super((Object) n20Var, true);
        int i3 = n20Var.f7176a;
        new rn1(256);
        int i4 = 96;
        if (i3 != 2) {
            i = 5;
            if (i3 == 3) {
                i2 = 6;
                i4 = 128;
            } else {
                if (i3 != 5) {
                    f40.m2713i(jd0.m3610h(i3, "The mode ", "is not supported by Crystals Dilithium!"));
                    throw null;
                }
                i2 = 8;
                i = 7;
            }
            c = 0;
        } else {
            i = 4;
            c = 0;
            i2 = 4;
        }
        new rn1(128);
        new rn1(256);
        if (c != 0 && c != 0) {
            l41.m4048q("Wrong Dilithium Gamma1!");
            throw null;
        }
        this.f7619c = sc2.m6067k(0, 32, bArr);
        this.f7620d = sc2.m6067k(32, 64, bArr);
        this.f7621e = sc2.m6067k(64, 128, bArr);
        int i5 = (i * i4) + 128;
        this.f7622f = sc2.m6067k(128, i5, bArr);
        int i6 = (i4 * i2) + i5;
        this.f7623g = sc2.m6067k(i5, i6, bArr);
        this.f7624m = sc2.m6067k(i6, (i2 * 416) + i6, bArr);
        if (p20Var != null) {
            this.f7625n = sc2.m6061e(p20Var.f8669d);
        } else {
            this.f7625n = null;
        }
    }

    public o20(n20 n20Var, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super((Object) n20Var, true);
        this.f7619c = sc2.m6061e(bArr);
        this.f7620d = sc2.m6061e(bArr2);
        this.f7621e = sc2.m6061e(bArr3);
        this.f7622f = sc2.m6061e(bArr4);
        this.f7623g = sc2.m6061e(bArr5);
        this.f7624m = sc2.m6061e(bArr6);
        this.f7625n = sc2.m6061e(bArr7);
    }
}
