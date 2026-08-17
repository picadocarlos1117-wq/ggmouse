package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fc2 extends k01 implements r60 {

    /* JADX INFO: renamed from: c */
    public final ac2 f3752c;

    /* JADX INFO: renamed from: d */
    public final int f3753d;

    /* JADX INFO: renamed from: e */
    public final byte[] f3754e;

    /* JADX INFO: renamed from: f */
    public final byte[] f3755f;

    /* JADX WARN: Illegal instructions before constructor call */
    public fc2(C0599ed c0599ed) {
        ac2 ac2Var = (ac2) c0599ed.f3313a;
        hc2 hc2Var = ac2Var.f143b;
        super(false, hc2Var.f4530e);
        this.f3752c = ac2Var;
        int i = hc2Var.f4531f;
        byte[] bArr = (byte[]) c0599ed.f3316d;
        if (bArr != null) {
            if (bArr.length == i + i) {
                this.f3753d = 0;
                this.f3754e = o21.m4690y(0, i, bArr);
                this.f3755f = o21.m4690y(i, i, bArr);
                return;
            }
            int i2 = i + 4;
            if (bArr.length != i2 + i) {
                f40.m2713i("public key has wrong size");
                throw null;
            }
            this.f3753d = sc2.m6058b(0, bArr);
            this.f3754e = o21.m4690y(4, i, bArr);
            this.f3755f = o21.m4690y(i2, i, bArr);
            return;
        }
        f10 f10Var = ac2Var.f142a;
        if (f10Var != null) {
            this.f3753d = f10Var.f3576a;
        } else {
            this.f3753d = 0;
        }
        byte[] bArr2 = (byte[]) c0599ed.f3314b;
        if (bArr2 == null) {
            this.f3754e = new byte[i];
        } else {
            if (bArr2.length != i) {
                f40.m2713i("length of root must be equal to length of digest");
                throw null;
            }
            this.f3754e = bArr2;
        }
        byte[] bArr3 = (byte[]) c0599ed.f3315c;
        if (bArr3 == null) {
            this.f3755f = new byte[i];
        } else if (bArr3.length == i) {
            this.f3755f = bArr3;
        } else {
            f40.m2713i("length of publicSeed must be equal to length of digest");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2801a() {
        byte[] bArr;
        int i = this.f3752c.f143b.f4531f;
        int i2 = 0;
        int i3 = this.f3753d;
        if (i3 != 0) {
            bArr = new byte[i + 4 + i];
            sc2.m6081y(i3, 0, bArr);
            i2 = 4;
        } else {
            bArr = new byte[i + i];
        }
        o21.m4681t(i2, bArr, this.f3754e);
        o21.m4681t(i2 + i, bArr, this.f3755f);
        return bArr;
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        return m2801a();
    }
}
