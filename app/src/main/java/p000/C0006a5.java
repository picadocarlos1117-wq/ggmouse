package p000;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a5 {

    /* JADX INFO: renamed from: a */
    public final long f50a;

    /* JADX INFO: renamed from: b */
    public final long f51b;

    public C0006a5(long j, long j2) {
        this.f50a = j;
        this.f51b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0006a5)) {
            return false;
        }
        C0006a5 c0006a5 = (C0006a5) obj;
        return this.f50a == c0006a5.f50a && this.f51b == c0006a5.f51b;
    }

    public final int hashCode() {
        return (((int) this.f50a) * 31) + ((int) this.f51b);
    }
}
