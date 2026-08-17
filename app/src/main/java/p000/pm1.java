package p000;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 {

    /* JADX INFO: renamed from: a */
    public final int f8944a;

    /* JADX INFO: renamed from: b */
    public final long f8945b;

    /* JADX INFO: renamed from: c */
    public final long f8946c;

    /* JADX INFO: renamed from: d */
    public final double f8947d;

    /* JADX INFO: renamed from: e */
    public final Long f8948e;

    /* JADX INFO: renamed from: f */
    public final tm0 f8949f;

    public pm1(int i, long j, long j2, double d, Long l, Set set) {
        this.f8944a = i;
        this.f8945b = j;
        this.f8946c = j2;
        this.f8947d = d;
        this.f8948e = l;
        this.f8949f = tm0.m6292n(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        return this.f8944a == pm1Var.f8944a && this.f8945b == pm1Var.f8945b && this.f8946c == pm1Var.f8946c && Double.compare(this.f8947d, pm1Var.f8947d) == 0 && hr1.m3275k(this.f8948e, pm1Var.f8948e) && hr1.m3275k(this.f8949f, pm1Var.f8949f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8944a), Long.valueOf(this.f8945b), Long.valueOf(this.f8946c), Double.valueOf(this.f8947d), this.f8948e, this.f8949f});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7362d("maxAttempts", String.valueOf(this.f8944a));
        c1679zvM5176k0.m7360b("initialBackoffNanos", this.f8945b);
        c1679zvM5176k0.m7360b("maxBackoffNanos", this.f8946c);
        c1679zvM5176k0.m7362d("backoffMultiplier", String.valueOf(this.f8947d));
        c1679zvM5176k0.m7359a(this.f8948e, "perAttemptRecvTimeoutNanos");
        c1679zvM5176k0.m7359a(this.f8949f, "retryableStatusCodes");
        return c1679zvM5176k0.toString();
    }
}
