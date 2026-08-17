package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oc2 implements oq1 {

    /* JADX INFO: renamed from: a */
    public final long f7750a;

    /* JADX INFO: renamed from: b */
    public final int f7751b;

    /* JADX INFO: renamed from: c */
    public final long f7752c;

    /* JADX INFO: renamed from: d */
    public final int f7753d;

    /* JADX INFO: renamed from: e */
    public final long f7754e;

    /* JADX INFO: renamed from: f */
    public final long f7755f;

    /* JADX INFO: renamed from: g */
    public final long[] f7756g;

    public oc2(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f7750a = j;
        this.f7751b = i;
        this.f7752c = j2;
        this.f7753d = i2;
        this.f7754e = j3;
        this.f7756g = jArr;
        this.f7755f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: a */
    public final long mo2724a() {
        return this.f7755f;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return this.f7756g != null;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: d */
    public final long mo2725d(long j) {
        long j2 = j - this.f7750a;
        if (!mo6c() || j2 <= this.f7751b) {
            return 0L;
        }
        long[] jArr = this.f7756g;
        ki0.m3866j(jArr);
        double d = (j2 * 256.0d) / this.f7754e;
        int iM7230d = z42.m7230d(jArr, (long) d, true);
        long j3 = this.f7752c;
        long j4 = (((long) iM7230d) * j3) / 100;
        long j5 = jArr[iM7230d];
        int i = iM7230d + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iM7230d == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        double d;
        double d2;
        boolean zMo6c = mo6c();
        int i = this.f7751b;
        long j2 = this.f7750a;
        if (!zMo6c) {
            mq1 mq1Var = new mq1(0L, j2 + ((long) i));
            return new jq1(mq1Var, mq1Var);
        }
        long jM7234h = z42.m7234h(j, 0L, this.f7752c);
        double d3 = (jM7234h * 100.0d) / this.f7752c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.f7756g;
            ki0.m3866j(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.f7754e;
        mq1 mq1Var2 = new mq1(jM7234h, j2 + z42.m7234h(Math.round((d4 / d) * j3), i, j3 - 1));
        return new jq1(mq1Var2, mq1Var2);
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: i */
    public final int mo2726i() {
        return this.f7753d;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f7752c;
    }
}
