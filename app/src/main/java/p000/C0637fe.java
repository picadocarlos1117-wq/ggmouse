package p000;

import java.util.Set;

/* JADX INFO: renamed from: fe */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0637fe {

    /* JADX INFO: renamed from: a */
    public final long f3767a;

    /* JADX INFO: renamed from: b */
    public final long f3768b;

    /* JADX INFO: renamed from: c */
    public final Set f3769c;

    public C0637fe(long j, long j2, Set set) {
        this.f3767a = j;
        this.f3768b = j2;
        this.f3769c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0637fe) {
            C0637fe c0637fe = (C0637fe) obj;
            if (this.f3767a == c0637fe.f3767a && this.f3768b == c0637fe.f3768b && this.f3769c.equals(c0637fe.f3769c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3767a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f3768b;
        return this.f3769c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f3767a + ", maxAllowedDelay=" + this.f3768b + ", flags=" + this.f3769c + "}";
    }
}
