package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q61 implements m50 {

    /* JADX INFO: renamed from: a */
    public final dc1 f9398a;

    /* JADX INFO: renamed from: b */
    public final r61 f9399b;

    /* JADX INFO: renamed from: c */
    public final String f9400c;

    /* JADX INFO: renamed from: d */
    public final int f9401d;

    /* JADX INFO: renamed from: e */
    public c22 f9402e;

    /* JADX INFO: renamed from: f */
    public String f9403f;

    /* JADX INFO: renamed from: g */
    public int f9404g = 0;

    /* JADX INFO: renamed from: h */
    public int f9405h;

    /* JADX INFO: renamed from: i */
    public boolean f9406i;

    /* JADX INFO: renamed from: j */
    public boolean f9407j;

    /* JADX INFO: renamed from: k */
    public long f9408k;

    /* JADX INFO: renamed from: l */
    public int f9409l;

    /* JADX INFO: renamed from: m */
    public long f9410m;

    public q61(String str, int i) {
        dc1 dc1Var = new dc1(4);
        this.f9398a = dc1Var;
        dc1Var.f2882a[0] = -1;
        this.f9399b = new r61();
        this.f9410m = -9223372036854775807L;
        this.f9400c = str;
        this.f9401d = i;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) {
        ki0.m3866j(this.f9402e);
        while (dc1Var.m2318a() > 0) {
            int i = this.f9404g;
            dc1 dc1Var2 = this.f9398a;
            if (i == 0) {
                byte[] bArr = dc1Var.f2882a;
                int i2 = dc1Var.f2883b;
                int i3 = dc1Var.f2884c;
                while (true) {
                    if (i2 >= i3) {
                        dc1Var.m2316F(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f9407j && (b & 224) == 224;
                    this.f9407j = z;
                    if (z2) {
                        dc1Var.m2316F(i2 + 1);
                        this.f9407j = false;
                        dc1Var2.f2882a[1] = bArr[i2];
                        this.f9405h = 2;
                        this.f9404g = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(dc1Var.m2318a(), 4 - this.f9405h);
                dc1Var.m2322e(this.f9405h, iMin, dc1Var2.f2882a);
                int i4 = this.f9405h + iMin;
                this.f9405h = i4;
                if (i4 >= 4) {
                    dc1Var2.m2316F(0);
                    int iM2324g = dc1Var2.m2324g();
                    r61 r61Var = this.f9399b;
                    if (r61Var.m5716a(iM2324g)) {
                        this.f9409l = r61Var.f9743b;
                        if (!this.f9406i) {
                            this.f9408k = (((long) r61Var.f9747f) * 1000000) / ((long) r61Var.f9744c);
                            ae0 ae0Var = new ae0();
                            ae0Var.f185a = this.f9403f;
                            ae0Var.f197m = v51.m6582l((String) r61Var.f9748g);
                            ae0Var.f198n = 4096;
                            ae0Var.f175B = r61Var.f9745d;
                            ae0Var.f176C = r61Var.f9744c;
                            ae0Var.f188d = this.f9400c;
                            ae0Var.f190f = this.f9401d;
                            this.f9402e.mo1117d(new be0(ae0Var));
                            this.f9406i = true;
                        }
                        dc1Var2.m2316F(0);
                        this.f9402e.mo1115b(dc1Var2, 4, 0);
                        this.f9404g = 2;
                    } else {
                        this.f9405h = 0;
                        this.f9404g = 1;
                    }
                }
            } else {
                if (i != 2) {
                    l41.m4046o();
                    return;
                }
                int iMin2 = Math.min(dc1Var.m2318a(), this.f9409l - this.f9405h);
                this.f9402e.mo1115b(dc1Var, iMin2, 0);
                int i5 = this.f9405h + iMin2;
                this.f9405h = i5;
                if (i5 >= this.f9409l) {
                    ki0.m3864h(this.f9410m != -9223372036854775807L);
                    this.f9402e.mo1114a(this.f9410m, 1, this.f9409l, 0, null);
                    this.f9410m += this.f9408k;
                    this.f9405h = 0;
                    this.f9404g = 0;
                }
            }
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        this.f9404g = 0;
        this.f9405h = 0;
        this.f9407j = false;
        this.f9410m = -9223372036854775807L;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f9410m = j;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f9403f = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        this.f9402e = z80Var.mo750n(qk0Var.f9521c, 1);
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
    }
}
