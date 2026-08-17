package p000;

/* JADX INFO: renamed from: bi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0100bi {

    /* JADX INFO: renamed from: a */
    public final long f1373a;

    /* JADX INFO: renamed from: b */
    public final long f1374b;

    /* JADX INFO: renamed from: c */
    public final long f1375c;

    /* JADX INFO: renamed from: d */
    public long f1376d = 0;

    /* JADX INFO: renamed from: e */
    public long f1377e;

    /* JADX INFO: renamed from: f */
    public long f1378f;

    /* JADX INFO: renamed from: g */
    public long f1379g;

    /* JADX INFO: renamed from: h */
    public long f1380h;

    public C0100bi(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f1373a = j;
        this.f1374b = j2;
        this.f1377e = j3;
        this.f1378f = j4;
        this.f1379g = j5;
        this.f1375c = j6;
        this.f1380h = m994a(j2, 0L, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a */
    public static long m994a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return z42.m7234h(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
