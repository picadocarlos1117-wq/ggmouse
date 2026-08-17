package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 {

    /* JADX INFO: renamed from: a */
    public final v12 f2754a;

    /* JADX INFO: renamed from: b */
    public final int f2755b;

    /* JADX INFO: renamed from: c */
    public final long[] f2756c;

    /* JADX INFO: renamed from: d */
    public final int[] f2757d;

    /* JADX INFO: renamed from: e */
    public final int f2758e;

    /* JADX INFO: renamed from: f */
    public final long[] f2759f;

    /* JADX INFO: renamed from: g */
    public final int[] f2760g;

    /* JADX INFO: renamed from: h */
    public final long f2761h;

    public d22(v12 v12Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        ki0.m3857c(iArr.length == jArr2.length);
        ki0.m3857c(jArr.length == jArr2.length);
        ki0.m3857c(iArr2.length == jArr2.length);
        this.f2754a = v12Var;
        this.f2756c = jArr;
        this.f2757d = iArr;
        this.f2758e = i;
        this.f2759f = jArr2;
        this.f2760g = iArr2;
        this.f2761h = j;
        this.f2755b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2205a(long j) {
        long[] jArr = this.f2759f;
        for (int iM7227a = z42.m7227a(jArr, j, true); iM7227a < jArr.length; iM7227a++) {
            if ((this.f2760g[iM7227a] & 1) != 0) {
                return iM7227a;
            }
        }
        return -1;
    }
}
