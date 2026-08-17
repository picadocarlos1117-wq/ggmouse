package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gn0 implements kq1 {

    /* JADX INFO: renamed from: a */
    public final C1296pi f4243a;

    /* JADX INFO: renamed from: b */
    public final C1296pi f4244b;

    /* JADX INFO: renamed from: c */
    public long f4245c;

    public gn0(long[] jArr, long[] jArr2, long j) {
        ki0.m3857c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f4243a = new C1296pi(length);
            this.f4244b = new C1296pi(length);
        } else {
            int i = length + 1;
            C1296pi c1296pi = new C1296pi(i);
            this.f4243a = c1296pi;
            C1296pi c1296pi2 = new C1296pi(i);
            this.f4244b = c1296pi2;
            c1296pi.m5258c(0L);
            c1296pi2.m5258c(0L);
        }
        this.f4243a.m5259e(jArr);
        this.f4244b.m5259e(jArr2);
        this.f4245c = j;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return this.f4244b.f8901a > 0;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        C1296pi c1296pi = this.f4244b;
        if (c1296pi.f8901a == 0) {
            mq1 mq1Var = mq1.f7075c;
            return new jq1(mq1Var, mq1Var);
        }
        int iM7228b = z42.m7228b(c1296pi, j);
        long jM5260f = c1296pi.m5260f(iM7228b);
        C1296pi c1296pi2 = this.f4243a;
        mq1 mq1Var2 = new mq1(jM5260f, c1296pi2.m5260f(iM7228b));
        if (jM5260f == j || iM7228b == c1296pi.f8901a - 1) {
            return new jq1(mq1Var2, mq1Var2);
        }
        int i = iM7228b + 1;
        return new jq1(mq1Var2, new mq1(c1296pi.m5260f(i), c1296pi2.m5260f(i)));
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f4245c;
    }
}
