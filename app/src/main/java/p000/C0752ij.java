package p000;

/* JADX INFO: renamed from: ij */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0752ij implements InterfaceC0679gj {

    /* JADX INFO: renamed from: a */
    public final int f5022a;

    /* JADX INFO: renamed from: b */
    public final int f5023b;

    /* JADX INFO: renamed from: c */
    public int f5024c;

    /* JADX INFO: renamed from: d */
    public int f5025d;

    /* JADX INFO: renamed from: e */
    public final Object f5026e;

    public C0752ij(l61 l61Var) {
        dc1 dc1Var = l61Var.f6194g;
        this.f5026e = dc1Var;
        dc1Var.m2316F(12);
        this.f5023b = dc1Var.m2341x() & 255;
        this.f5022a = dc1Var.m2341x();
    }

    @Override // p000.InterfaceC0679gj
    /* JADX INFO: renamed from: a */
    public int mo2987a() {
        return -1;
    }

    @Override // p000.InterfaceC0679gj
    /* JADX INFO: renamed from: b */
    public int mo2988b() {
        return this.f5022a;
    }

    @Override // p000.InterfaceC0679gj
    /* JADX INFO: renamed from: c */
    public int mo2989c() {
        dc1 dc1Var = (dc1) this.f5026e;
        int i = this.f5023b;
        if (i == 8) {
            return dc1Var.m2337t();
        }
        if (i == 16) {
            return dc1Var.m2343z();
        }
        int i2 = this.f5024c;
        this.f5024c = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f5025d & 15;
        }
        int iM2337t = dc1Var.m2337t();
        this.f5025d = iM2337t;
        return (iM2337t & 240) >> 4;
    }

    public C0752ij(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f5022a = i2;
        this.f5023b = i3;
        this.f5024c = i4;
        this.f5025d = i5;
        this.f5026e = bArr;
    }
}
