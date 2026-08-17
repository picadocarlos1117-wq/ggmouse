package p000;

/* JADX INFO: renamed from: pb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1289pb implements y80, z80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8825a;

    /* JADX INFO: renamed from: b */
    public long f8826b;

    /* JADX INFO: renamed from: c */
    public Object f8827c;

    public C1289pb(y80 y80Var, long j) {
        this.f8825a = 3;
        this.f8827c = y80Var;
        ki0.m3857c(y80Var.getPosition() >= j);
        this.f8826b = j;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: a */
    public void mo2413a(int i, int i2, byte[] bArr) {
        ((y80) this.f8827c).mo2413a(i, i2, bArr);
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: b */
    public boolean mo2414b(byte[] bArr, int i, int i2, boolean z) {
        return ((y80) this.f8827c).mo2414b(bArr, 0, i2, z);
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: d */
    public int mo2415d(int i, int i2, byte[] bArr) {
        return ((y80) this.f8827c).mo2415d(i, i2, bArr);
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: e */
    public boolean mo2416e(byte[] bArr, int i, int i2, boolean z) {
        return ((y80) this.f8827c).mo2416e(bArr, 0, i2, z);
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: f */
    public long mo2417f() {
        return ((y80) this.f8827c).mo2417f() - this.f8826b;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: g */
    public void mo2418g(int i) {
        ((y80) this.f8827c).mo2418g(i);
    }

    @Override // p000.y80
    public long getPosition() {
        return ((y80) this.f8827c).getPosition() - this.f8826b;
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: h */
    public int mo2419h(int i) {
        return ((y80) this.f8827c).mo2419h(i);
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: i */
    public long mo2420i() {
        return ((y80) this.f8827c).mo2420i() - this.f8826b;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: k */
    public void mo748k() {
        ((z80) this.f8827c).mo748k();
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: l */
    public void mo2422l() {
        ((y80) this.f8827c).mo2422l();
    }

    @Override // p000.y80
    /* JADX INFO: renamed from: m */
    public void mo2423m(int i) {
        ((y80) this.f8827c).mo2423m(i);
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: n */
    public c22 mo750n(int i, int i2) {
        return ((z80) this.f8827c).mo750n(i, i2);
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: q */
    public void mo752q(kq1 kq1Var) {
        ((z80) this.f8827c).mo752q(new iv1(this, kq1Var, kq1Var));
    }

    /* JADX INFO: renamed from: r */
    public void m5241r(int i) {
        if (i < 64) {
            this.f8826b &= ~(1 << i);
            return;
        }
        C1289pb c1289pb = (C1289pb) this.f8827c;
        if (c1289pb != null) {
            c1289pb.m5241r(i - 64);
        }
    }

    @Override // p000.InterfaceC0693gx
    public int read(byte[] bArr, int i, int i2) {
        return ((y80) this.f8827c).read(bArr, i, i2);
    }

    @Override // p000.y80
    public void readFully(byte[] bArr, int i, int i2) {
        ((y80) this.f8827c).readFully(bArr, i, i2);
    }

    /* JADX INFO: renamed from: s */
    public int m5242s(int i) {
        C1289pb c1289pb = (C1289pb) this.f8827c;
        if (c1289pb == null) {
            long j = this.f8826b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f8826b);
        }
        return Long.bitCount(this.f8826b) + c1289pb.m5242s(i - 64);
    }

    /* JADX INFO: renamed from: t */
    public void m5243t() {
        if (((C1289pb) this.f8827c) == null) {
            this.f8827c = new C1289pb();
        }
    }

    public String toString() {
        switch (this.f8825a) {
            case 1:
                if (((C1289pb) this.f8827c) == null) {
                    return Long.toBinaryString(this.f8826b);
                }
                return ((C1289pb) this.f8827c).toString() + "xx" + Long.toBinaryString(this.f8826b);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m5244u(int i) {
        if (i < 64) {
            return ((1 << i) & this.f8826b) != 0;
        }
        m5243t();
        return ((C1289pb) this.f8827c).m5244u(i - 64);
    }

    /* JADX INFO: renamed from: v */
    public void m5245v(int i, boolean z) {
        if (i >= 64) {
            m5243t();
            ((C1289pb) this.f8827c).m5245v(i - 64, z);
            return;
        }
        long j = this.f8826b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f8826b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m5248y(i);
        } else {
            m5241r(i);
        }
        if (z2 || ((C1289pb) this.f8827c) != null) {
            m5243t();
            ((C1289pb) this.f8827c).m5245v(0, z2);
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m5246w(int i) {
        if (i >= 64) {
            m5243t();
            return ((C1289pb) this.f8827c).m5246w(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f8826b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f8826b = j3;
        long j4 = j - 1;
        this.f8826b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C1289pb c1289pb = (C1289pb) this.f8827c;
        if (c1289pb != null) {
            if (c1289pb.m5244u(0)) {
                m5248y(63);
            }
            ((C1289pb) this.f8827c).m5246w(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: x */
    public void m5247x() {
        this.f8826b = 0L;
        C1289pb c1289pb = (C1289pb) this.f8827c;
        if (c1289pb != null) {
            c1289pb.m5247x();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m5248y(int i) {
        if (i < 64) {
            this.f8826b |= 1 << i;
        } else {
            m5243t();
            ((C1289pb) this.f8827c).m5248y(i - 64);
        }
    }

    public /* synthetic */ C1289pb(Object obj, int i, long j) {
        this.f8825a = i;
        this.f8826b = j;
        this.f8827c = obj;
    }

    public C1289pb(C1326qb c1326qb, long j) {
        this.f8825a = 0;
        this.f8827c = c1326qb;
        this.f8826b = j;
    }

    public C1289pb() {
        this.f8825a = 1;
        this.f8826b = 0L;
    }
}
