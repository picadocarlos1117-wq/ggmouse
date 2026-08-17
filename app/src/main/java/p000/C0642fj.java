package p000;

/* JADX INFO: renamed from: fj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0642fj implements o91 {

    /* JADX INFO: renamed from: a */
    public long f3824a;

    /* JADX INFO: renamed from: b */
    public long f3825b;

    /* JADX INFO: renamed from: c */
    public Object f3826c;

    /* JADX INFO: renamed from: d */
    public Object f3827d;

    public C0642fj(long j, int i) {
        ki0.m3864h(((C1468u5) this.f3826c) == null);
        this.f3824a = j;
        this.f3825b = j + ((long) i);
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: a */
    public long mo815a(y80 y80Var) {
        long j = this.f3825b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f3825b = -1L;
        return j2;
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: g */
    public kq1 mo816g() {
        ki0.m3864h(this.f3824a != -1);
        return new C0825ke((db0) this.f3826c, 1, this.f3824a);
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: k */
    public void mo817k(long j) {
        long[] jArr = (long[]) ((C0558d8) this.f3827d).f2821b;
        this.f3825b = jArr[z42.m7230d(jArr, j, true)];
    }

    public C0642fj(String str, byte[] bArr, long j, long j2) {
        this.f3826c = str;
        this.f3827d = bArr;
        this.f3824a = j;
        this.f3825b = j2;
    }
}
