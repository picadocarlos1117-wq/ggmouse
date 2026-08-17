package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k20 implements j20 {

    /* JADX INFO: renamed from: a */
    public final r80 f5633a;

    /* JADX INFO: renamed from: b */
    public final int f5634b;

    public k20(int i, C1351r c1351r) {
        if (c1351r == null) {
            l41.m4051t("digest == null");
            throw null;
        }
        this.f5633a = l20.m4019a(c1351r);
        this.f5634b = i;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m3752a(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length != this.f5634b) {
            str = "wrong key length";
        } else {
            if (bArr2.length == 32) {
                return m3753d(3, bArr, bArr2);
            }
            str = "wrong address length";
        }
        f40.m2713i(str);
        return null;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: b */
    public int mo3526b(int i, byte[] bArr) {
        r80 r80Var = this.f5633a;
        byte[] bArr2 = new byte[r80Var.mo3528g()];
        r80Var.mo3526b(0, bArr2);
        int i2 = this.f5634b;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: c */
    public void mo728c(byte b) {
        this.f5633a.mo728c(b);
    }

    /* JADX INFO: renamed from: d */
    public byte[] m3753d(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.f5634b;
        byte[] bArrM4687w0 = o21.m4687w0(i2, j);
        int length = bArrM4687w0.length;
        r80 r80Var = this.f5633a;
        r80Var.mo729e(0, length, bArrM4687w0);
        r80Var.mo729e(0, bArr.length, bArr);
        r80Var.mo729e(0, bArr2.length, bArr2);
        byte[] bArr3 = new byte[i2];
        if (r80Var instanceof rn1) {
            ((rn1) r80Var).m5864m(0, i2, bArr3);
            return bArr3;
        }
        r80Var.mo3526b(0, bArr3);
        return bArr3;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: e */
    public void mo729e(int i, int i2, byte[] bArr) {
        this.f5633a.mo729e(i, i2, bArr);
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: f */
    public String mo3527f() {
        return this.f5633a.mo3527f() + "/" + (this.f5634b * 8);
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public int mo3528g() {
        return this.f5634b;
    }

    public k20(int i, r80 r80Var) {
        this.f5633a = r80Var;
        this.f5634b = i;
    }
}
