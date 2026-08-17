package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n70 {

    /* JADX INFO: renamed from: a */
    public final long f7300a;

    /* JADX INFO: renamed from: b */
    public final long f7301b;

    public n70(long j, long j2) {
        if (j2 == 0) {
            this.f7300a = 0L;
            this.f7301b = 1L;
        } else {
            this.f7300a = j;
            this.f7301b = j2;
        }
    }

    public final String toString() {
        return this.f7300a + "/" + this.f7301b;
    }
}
