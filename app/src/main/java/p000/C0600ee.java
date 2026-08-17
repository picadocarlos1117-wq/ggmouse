package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ee */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0600ee {

    /* JADX INFO: renamed from: a */
    public final ax0 f3324a;

    /* JADX INFO: renamed from: b */
    public final HashMap f3325b;

    public C0600ee(ax0 ax0Var, HashMap map) {
        this.f3324a = ax0Var;
        this.f3325b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m2576a(cg1 cg1Var, long j, int i) {
        long jM753r = j - this.f3324a.m753r();
        C0637fe c0637fe = (C0637fe) this.f3325b.get(cg1Var);
        long j2 = c0637fe.f3767a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jM753r), c0637fe.f3768b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0600ee)) {
            return false;
        }
        C0600ee c0600ee = (C0600ee) obj;
        return this.f3324a.equals(c0600ee.f3324a) && this.f3325b.equals(c0600ee.f3325b);
    }

    public final int hashCode() {
        return this.f3325b.hashCode() ^ ((this.f3324a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f3324a + ", values=" + this.f3325b + "}";
    }
}
