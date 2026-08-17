package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lq1 {

    /* JADX INFO: renamed from: c */
    public static final lq1 f6490c;

    /* JADX INFO: renamed from: a */
    public final long f6491a;

    /* JADX INFO: renamed from: b */
    public final long f6492b;

    static {
        lq1 lq1Var = new lq1(0L, 0L);
        new lq1(Long.MAX_VALUE, Long.MAX_VALUE);
        new lq1(Long.MAX_VALUE, 0L);
        new lq1(0L, Long.MAX_VALUE);
        f6490c = lq1Var;
    }

    public lq1(long j, long j2) {
        ki0.m3857c(j >= 0);
        ki0.m3857c(j2 >= 0);
        this.f6491a = j;
        this.f6492b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lq1.class == obj.getClass()) {
            lq1 lq1Var = (lq1) obj;
            if (this.f6491a == lq1Var.f6491a && this.f6492b == lq1Var.f6492b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6491a) * 31) + ((int) this.f6492b);
    }
}
