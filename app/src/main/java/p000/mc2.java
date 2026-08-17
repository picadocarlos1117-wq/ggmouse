package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class mc2 extends k01 implements r60 {

    /* JADX INFO: renamed from: c */
    public final hc2 f6767c;

    /* JADX INFO: renamed from: d */
    public final int f6768d;

    /* JADX INFO: renamed from: e */
    public final byte[] f6769e;

    /* JADX INFO: renamed from: f */
    public final byte[] f6770f;

    /* JADX WARN: Illegal instructions before constructor call */
    public mc2(C0599ed c0599ed) {
        hc2 hc2Var = (hc2) c0599ed.f3313a;
        super(false, hc2Var.f4530e);
        this.f6767c = hc2Var;
        int i = hc2Var.f4531f;
        byte[] bArr = (byte[]) c0599ed.f3316d;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.f6768d = 0;
                this.f6769e = o21.m4690y(0, i, bArr);
                this.f6770f = o21.m4690y(i, i, bArr);
                return;
            }
            int i2 = i + 4;
            if (bArr.length != i2 + i) {
                f40.m2713i("public key has wrong size");
                throw null;
            }
            this.f6768d = sc2.m6058b(0, bArr);
            this.f6769e = o21.m4690y(4, i, bArr);
            this.f6770f = o21.m4690y(i2, i, bArr);
            return;
        }
        g10 g10Var = hc2Var.f4526a;
        if (g10Var != null) {
            this.f6768d = g10Var.f3946a;
        } else {
            this.f6768d = 0;
        }
        byte[] bArr2 = (byte[]) c0599ed.f3314b;
        if (bArr2 == null) {
            this.f6769e = new byte[i];
        } else {
            if (bArr2.length != i) {
                f40.m2713i("length of root must be equal to length of digest");
                throw null;
            }
            this.f6769e = bArr2;
        }
        byte[] bArr3 = (byte[]) c0599ed.f3315c;
        if (bArr3 == null) {
            this.f6770f = new byte[i];
        } else if (bArr3.length == i) {
            this.f6770f = bArr3;
        } else {
            f40.m2713i("length of publicSeed must be equal to length of digest");
            throw null;
        }
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        byte[] bArr;
        int i = this.f6767c.f4531f;
        int i2 = 0;
        int i3 = this.f6768d;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            sc2.m6081y(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        o21.m4681t(i2, bArr, this.f6769e);
        o21.m4681t(i2 + i, bArr, this.f6770f);
        return bArr;
    }
}
