package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b92 implements kq1 {

    /* JADX INFO: renamed from: a */
    public final C0752ij f1255a;

    /* JADX INFO: renamed from: b */
    public final int f1256b;

    /* JADX INFO: renamed from: c */
    public final long f1257c;

    /* JADX INFO: renamed from: d */
    public final long f1258d;

    /* JADX INFO: renamed from: e */
    public final long f1259e;

    public b92(C0752ij c0752ij, int i, long j, long j2) {
        this.f1255a = c0752ij;
        this.f1256b = i;
        this.f1257c = j;
        long j3 = (j2 - j) / ((long) c0752ij.f5024c);
        this.f1258d = j3;
        this.f1259e = m952b(j3);
    }

    /* JADX INFO: renamed from: b */
    public final long m952b(long j) {
        long j2 = j * ((long) this.f1256b);
        long j3 = this.f1255a.f5023b;
        int i = z42.f13274a;
        return z42.m7222J(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return true;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        C0752ij c0752ij = this.f1255a;
        long j2 = (((long) c0752ij.f5023b) * j) / (((long) this.f1256b) * 1000000);
        long j3 = this.f1258d - 1;
        long jM7234h = z42.m7234h(j2, 0L, j3);
        int i = c0752ij.f5024c;
        long j4 = this.f1257c;
        long jM952b = m952b(jM7234h);
        mq1 mq1Var = new mq1(jM952b, (((long) i) * jM7234h) + j4);
        if (jM952b >= j || jM7234h == j3) {
            return new jq1(mq1Var, mq1Var);
        }
        long j5 = jM7234h + 1;
        return new jq1(mq1Var, new mq1(m952b(j5), (((long) i) * j5) + j4));
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f1259e;
    }
}
