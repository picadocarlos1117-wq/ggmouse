package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f52 implements oq1 {

    /* JADX INFO: renamed from: a */
    public final long[] f3617a;

    /* JADX INFO: renamed from: b */
    public final long[] f3618b;

    /* JADX INFO: renamed from: c */
    public final long f3619c;

    /* JADX INFO: renamed from: d */
    public final long f3620d;

    /* JADX INFO: renamed from: e */
    public final int f3621e;

    public f52(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.f3617a = jArr;
        this.f3618b = jArr2;
        this.f3619c = j;
        this.f3620d = j2;
        this.f3621e = i;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: a */
    public final long mo2724a() {
        return this.f3620d;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return true;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: d */
    public final long mo2725d(long j) {
        return this.f3617a[z42.m7230d(this.f3618b, j, true)];
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        long[] jArr = this.f3617a;
        int iM7230d = z42.m7230d(jArr, j, true);
        long j2 = jArr[iM7230d];
        long[] jArr2 = this.f3618b;
        mq1 mq1Var = new mq1(j2, jArr2[iM7230d]);
        if (j2 >= j || iM7230d == jArr.length - 1) {
            return new jq1(mq1Var, mq1Var);
        }
        int i = iM7230d + 1;
        return new jq1(mq1Var, new mq1(jArr[i], jArr2[i]));
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: i */
    public final int mo2726i() {
        return this.f3621e;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f3619c;
    }
}
