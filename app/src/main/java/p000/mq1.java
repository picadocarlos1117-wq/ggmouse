package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 {

    /* JADX INFO: renamed from: c */
    public static final mq1 f7075c = new mq1(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f7076a;

    /* JADX INFO: renamed from: b */
    public final long f7077b;

    public mq1(long j, long j2) {
        this.f7076a = j;
        this.f7077b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mq1.class == obj.getClass()) {
            mq1 mq1Var = (mq1) obj;
            if (this.f7076a == mq1Var.f7076a && this.f7077b == mq1Var.f7077b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7076a) * 31) + ((int) this.f7077b);
    }

    public final String toString() {
        return "[timeUs=" + this.f7076a + ", position=" + this.f7077b + "]";
    }
}
