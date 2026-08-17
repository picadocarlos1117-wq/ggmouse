package p000;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x51 implements oq1 {

    /* JADX INFO: renamed from: a */
    public final long[] f12457a;

    /* JADX INFO: renamed from: b */
    public final long[] f12458b;

    /* JADX INFO: renamed from: c */
    public final long f12459c;

    public x51(long[] jArr, long[] jArr2, long j) {
        this.f12457a = jArr;
        this.f12458b = jArr2;
        this.f12459c = j == -9223372036854775807L ? z42.m7216D(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: b */
    public static Pair m6868b(long[] jArr, long[] jArr2, long j) {
        int iM7230d = z42.m7230d(jArr, j, true);
        long j2 = jArr[iM7230d];
        long j3 = jArr2[iM7230d];
        int i = iM7230d + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: a */
    public final long mo2724a() {
        return -1L;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return true;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: d */
    public final long mo2725d(long j) {
        return z42.m7216D(((Long) m6868b(this.f12457a, this.f12458b, j).second).longValue());
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        Pair pairM6868b = m6868b(this.f12458b, this.f12457a, z42.m7226N(z42.m7234h(j, 0L, this.f12459c)));
        mq1 mq1Var = new mq1(z42.m7216D(((Long) pairM6868b.first).longValue()), ((Long) pairM6868b.second).longValue());
        return new jq1(mq1Var, mq1Var);
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: i */
    public final int mo2726i() {
        return -2147483647;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f12459c;
    }
}
