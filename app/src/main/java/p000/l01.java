package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class l01 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public int f6129a;

    /* JADX INFO: renamed from: b */
    public int f6130b;

    /* JADX INFO: renamed from: c */
    public byte[] f6131c;

    /* JADX INFO: renamed from: d */
    public byte[] f6132d;

    /* JADX INFO: renamed from: e */
    public byte[] f6133e;

    /* JADX INFO: renamed from: f */
    public C1431t5 f6134f;

    public l01(int i, int i2, vh0 vh0Var, if1 if1Var, kc1 kc1Var, C1431t5 c1431t5) {
        int i3;
        this.f6129a = i;
        this.f6130b = i2;
        int i4 = vh0Var.f11658b;
        this.f6131c = new byte[]{(byte) i4, (byte) (i4 >>> 8), (byte) (i4 >>> 16), (byte) (i4 >>> 24)};
        int i5 = 8;
        int i6 = 1;
        while (if1Var.f5009a.f11657a > i5) {
            i6++;
            i5 += 8;
        }
        byte[] bArr = new byte[if1Var.f5011c.length * i6];
        int i7 = 0;
        for (int i8 = 0; i8 < if1Var.f5011c.length; i8++) {
            int i9 = 0;
            while (i9 < i5) {
                bArr[i7] = (byte) (if1Var.f5011c[i8] >>> i9);
                i9 += 8;
                i7++;
            }
        }
        this.f6132d = bArr;
        int[] iArr = kc1Var.f5748a;
        int length = iArr.length;
        int i10 = length - 1;
        int i11 = do0.f2984a;
        if (i10 == 0) {
            i3 = 1;
        } else {
            i3 = 0;
            for (i10 = i10 < 0 ? -i10 : i10; i10 > 0; i10 >>>= 8) {
                i3++;
            }
        }
        byte[] bArr2 = new byte[(length * i3) + 4];
        ua0.m6441a(length, 0, bArr2);
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            int i14 = (i12 * i3) + 4;
            for (int i15 = i3 - 1; i15 >= 0; i15--) {
                bArr2[i14 + i15] = (byte) (i13 >>> (i15 * 8));
            }
        }
        this.f6133e = bArr2;
        this.f6134f = c1431t5;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(new C1127n(this.f6129a));
        c0733i.m3324b(new C1127n(this.f6130b));
        c0733i.m3324b(new C1123mw(this.f6131c));
        c0733i.m3324b(new C1123mw(this.f6132d));
        c0733i.m3324b(new C1123mw(this.f6133e));
        c0733i.m3324b(this.f6134f);
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    /* JADX INFO: renamed from: j */
    public final vh0 m4018j() {
        byte[] bArr = this.f6131c;
        vh0 vh0Var = new vh0();
        vh0Var.f11657a = 0;
        if (bArr.length != 4) {
            f40.m2713i("byte array is not an encoded finite field");
            return null;
        }
        int iM3197F = 2;
        int i = ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        vh0Var.f11658b = i;
        if (i != 0) {
            int iM3219n = hp0.m3219n(i) >>> 1;
            for (int i2 = 0; i2 < iM3219n; i2++) {
                iM3197F = hp0.m3197F(iM3197F, iM3197F, i);
                int i3 = iM3197F ^ 2;
                int i4 = i;
                while (i4 != 0) {
                    int iM3203M = hp0.m3203M(i3, i4);
                    i3 = i4;
                    i4 = iM3203M;
                }
                if (i3 == 1) {
                }
            }
            vh0Var.f11657a = hp0.m3219n(vh0Var.f11658b);
            return vh0Var;
        }
        f40.m2713i("byte array is not an encoded finite field");
        return null;
    }
}
