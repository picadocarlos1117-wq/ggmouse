package p000;

/* JADX INFO: renamed from: js */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0802js implements oq1, kq1 {

    /* JADX INFO: renamed from: a */
    public final long f5504a;

    /* JADX INFO: renamed from: b */
    public final long f5505b;

    /* JADX INFO: renamed from: c */
    public final int f5506c;

    /* JADX INFO: renamed from: d */
    public final long f5507d;

    /* JADX INFO: renamed from: e */
    public final int f5508e;

    /* JADX INFO: renamed from: f */
    public final long f5509f;

    /* JADX INFO: renamed from: g */
    public final boolean f5510g;

    /* JADX INFO: renamed from: h */
    public final long f5511h;

    /* JADX INFO: renamed from: i */
    public final int f5512i;

    /* JADX INFO: renamed from: j */
    public final int f5513j;

    /* JADX INFO: renamed from: k */
    public final boolean f5514k;

    /* JADX INFO: renamed from: l */
    public final long f5515l;

    public C0802js(long j, long j2, int i, int i2, boolean z) {
        this.f5504a = j;
        this.f5505b = j2;
        this.f5506c = i2 == -1 ? 1 : i2;
        this.f5508e = i;
        this.f5510g = z;
        if (j == -1) {
            this.f5507d = -1L;
            this.f5509f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f5507d = j3;
            this.f5509f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.f5511h = j2;
        this.f5512i = i;
        this.f5513j = i2;
        this.f5514k = z;
        this.f5515l = j == -1 ? -1L : j;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: a */
    public final long mo2724a() {
        return this.f5515l;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return this.f5507d != -1 || this.f5510g;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: d */
    public final long mo2725d(long j) {
        return (Math.max(0L, j - this.f5505b) * 8000000) / ((long) this.f5508e);
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        long j2 = this.f5507d;
        long j3 = this.f5505b;
        if (j2 == -1 && !this.f5510g) {
            mq1 mq1Var = new mq1(0L, j3);
            return new jq1(mq1Var, mq1Var);
        }
        int i = this.f5508e;
        long j4 = this.f5506c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        mq1 mq1Var2 = new mq1(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f5504a) {
                return new jq1(mq1Var2, new mq1((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new jq1(mq1Var2, mq1Var2);
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: i */
    public final int mo2726i() {
        return this.f5512i;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f5509f;
    }
}
