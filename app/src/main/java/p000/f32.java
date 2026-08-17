package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f32 {

    /* JADX INFO: renamed from: a */
    public final byte[] f3604a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f3605b;

    /* JADX INFO: renamed from: c */
    public int f3606c;

    /* JADX INFO: renamed from: d */
    public long f3607d;

    /* JADX INFO: renamed from: e */
    public int f3608e;

    /* JADX INFO: renamed from: f */
    public int f3609f;

    /* JADX INFO: renamed from: g */
    public int f3610g;

    /* JADX INFO: renamed from: a */
    public final void m2702a(c22 c22Var, b22 b22Var) {
        if (this.f3606c > 0) {
            c22Var.mo1114a(this.f3607d, this.f3608e, this.f3609f, this.f3610g, b22Var);
            this.f3606c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2703b(c22 c22Var, long j, int i, int i2, int i3, b22 b22Var) {
        ki0.m3865i(this.f3610g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f3605b) {
            int i4 = this.f3606c;
            int i5 = i4 + 1;
            this.f3606c = i5;
            if (i4 == 0) {
                this.f3607d = j;
                this.f3608e = i;
                this.f3609f = 0;
            }
            this.f3609f += i2;
            this.f3610g = i3;
            if (i5 >= 16) {
                m2702a(c22Var, b22Var);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2704c(y80 y80Var) {
        if (this.f3605b) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f3604a;
        y80Var.mo2413a(0, 10, bArr);
        y80Var.mo2422l();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f3605b = true;
    }
}
