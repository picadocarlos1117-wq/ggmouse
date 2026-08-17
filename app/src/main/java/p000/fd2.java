package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 {

    /* JADX INFO: renamed from: a */
    public final int f3765a;

    /* JADX INFO: renamed from: b */
    public final long f3766b;

    public fd2(int i, long j) {
        this.f3765a = i;
        this.f3766b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fd2)) {
            return false;
        }
        fd2 fd2Var = (fd2) obj;
        return this.f3765a == fd2Var.f3765a && this.f3766b == fd2Var.f3766b;
    }

    public final int hashCode() {
        long j = this.f3766b;
        return ((this.f3765a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f3765a + ", eventTimestamp=" + this.f3766b + "}";
    }
}
