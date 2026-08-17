package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: mn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1114mn implements kq1 {

    /* JADX INFO: renamed from: a */
    public final int f7044a;

    /* JADX INFO: renamed from: b */
    public final int[] f7045b;

    /* JADX INFO: renamed from: c */
    public final long[] f7046c;

    /* JADX INFO: renamed from: d */
    public final long[] f7047d;

    /* JADX INFO: renamed from: e */
    public final long[] f7048e;

    /* JADX INFO: renamed from: f */
    public final long f7049f;

    public C1114mn(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7045b = iArr;
        this.f7046c = jArr;
        this.f7047d = jArr2;
        this.f7048e = jArr3;
        int length = iArr.length;
        this.f7044a = length;
        if (length <= 0) {
            this.f7049f = 0L;
        } else {
            int i = length - 1;
            this.f7049f = jArr2[i] + jArr3[i];
        }
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return true;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        long[] jArr = this.f7048e;
        int iM7230d = z42.m7230d(jArr, j, true);
        long j2 = jArr[iM7230d];
        long[] jArr2 = this.f7046c;
        mq1 mq1Var = new mq1(j2, jArr2[iM7230d]);
        if (j2 >= j || iM7230d == this.f7044a - 1) {
            return new jq1(mq1Var, mq1Var);
        }
        int i = iM7230d + 1;
        return new jq1(mq1Var, new mq1(jArr[i], jArr2[i]));
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f7049f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f7044a + ", sizes=" + Arrays.toString(this.f7045b) + ", offsets=" + Arrays.toString(this.f7046c) + ", timeUs=" + Arrays.toString(this.f7048e) + ", durationsUs=" + Arrays.toString(this.f7047d) + ")";
    }
}
