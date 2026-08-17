package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 {

    /* JADX INFO: renamed from: a */
    public boolean f10565a;

    /* JADX INFO: renamed from: b */
    public long f10566b;

    /* JADX INFO: renamed from: a */
    public final long m6141a() {
        if (this.f10565a) {
            return System.nanoTime() - this.f10566b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public final void m6142b() {
        p32.m5193x(!this.f10565a, "This stopwatch is already running.");
        this.f10565a = true;
        this.f10566b = System.nanoTime();
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jNanoTime = this.f10565a ? System.nanoTime() - this.f10566b : 0L;
        long j = jNanoTime / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jNanoTime / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jNanoTime / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jNanoTime / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jNanoTime / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jNanoTime / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb.append(" ");
        switch (rv1.f10148a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }
}
