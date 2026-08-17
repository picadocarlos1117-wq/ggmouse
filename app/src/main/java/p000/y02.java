package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y02 {

    /* JADX INFO: renamed from: a */
    public long f12796a;

    /* JADX INFO: renamed from: b */
    public long f12797b;

    /* JADX INFO: renamed from: c */
    public long f12798c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f12799d = new ThreadLocal();

    public y02(long j) {
        m6987e(j);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m6983a(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f12797b != -9223372036854775807L)) {
                    long jLongValue = this.f12796a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.f12799d.get();
                        l.getClass();
                        jLongValue = l.longValue();
                    }
                    this.f12797b = jLongValue - j;
                    notifyAll();
                }
                this.f12798c = j;
                j2 = j + this.f12797b;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m6984b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f12798c;
            if (j2 != -9223372036854775807L) {
                int i = z42.f13274a;
                long jM7222J = z42.m7222J(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jM7222J) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jM7222J) < Math.abs(j5 - jM7222J) ? j4 : j5;
            }
            long j6 = j;
            int i2 = z42.f13274a;
            return m6983a(z42.m7222J(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m6985c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f12798c;
            if (j2 != -9223372036854775807L) {
                int i = z42.f13274a;
                long jM7222J = z42.m7222J(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jM7222J / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jM7222J ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            int i2 = z42.f13274a;
            return m6983a(z42.m7222J(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m6986d() {
        long j;
        j = this.f12796a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6987e(long j) {
        this.f12796a = j;
        this.f12797b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f12798c = -9223372036854775807L;
    }
}
