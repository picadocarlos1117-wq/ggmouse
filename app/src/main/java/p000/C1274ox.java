package p000;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: ox */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1274ox implements Comparable {

    /* JADX INFO: renamed from: d */
    public static final bz1 f8503d = new bz1(18);

    /* JADX INFO: renamed from: e */
    public static final long f8504e = -3153600000000000000L;

    /* JADX INFO: renamed from: a */
    public final bz1 f8505a;

    /* JADX INFO: renamed from: b */
    public final long f8506b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f8507c;

    public C1274ox(long j) {
        bz1 bz1Var = f8503d;
        long jNanoTime = System.nanoTime();
        this.f8505a = bz1Var;
        long jMin = Math.min(3153600000000000000L, Math.max(f8504e, j));
        this.f8506b = jNanoTime + jMin;
        this.f8507c = jMin <= 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5075a() {
        if (!this.f8507c) {
            long j = this.f8506b;
            this.f8505a.getClass();
            if (j - System.nanoTime() > 0) {
                return false;
            }
            this.f8507c = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m5076b() {
        this.f8505a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f8507c && this.f8506b - jNanoTime <= 0) {
            this.f8507c = true;
        }
        return this.f8506b - jNanoTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1274ox c1274ox = (C1274ox) obj;
        bz1 bz1Var = c1274ox.f8505a;
        bz1 bz1Var2 = this.f8505a;
        if (bz1Var2 == bz1Var) {
            long j = this.f8506b - c1274ox.f8506b;
            if (j < 0) {
                return -1;
            }
            return j > 0 ? 1 : 0;
        }
        StringBuilder sb = new StringBuilder("Tickers (");
        sb.append(bz1Var2);
        bz1 bz1Var3 = c1274ox.f8505a;
        sb.append(" and ");
        sb.append(bz1Var3);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1274ox)) {
            return false;
        }
        C1274ox c1274ox = (C1274ox) obj;
        bz1 bz1Var = c1274ox.f8505a;
        bz1 bz1Var2 = this.f8505a;
        if (bz1Var2 != null ? bz1Var2 == bz1Var : bz1Var == null) {
            return this.f8506b == c1274ox.f8506b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f8505a, Long.valueOf(this.f8506b)).hashCode();
    }

    public final String toString() {
        long jM5076b = m5076b();
        long jAbs = Math.abs(jM5076b) / 1000000000;
        long jAbs2 = Math.abs(jM5076b) % 1000000000;
        StringBuilder sb = new StringBuilder();
        if (jM5076b < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        bz1 bz1Var = f8503d;
        bz1 bz1Var2 = this.f8505a;
        if (bz1Var2 != bz1Var) {
            sb.append(" (ticker=" + bz1Var2 + ")");
        }
        return sb.toString();
    }
}
