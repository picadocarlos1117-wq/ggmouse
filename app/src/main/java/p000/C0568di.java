package p000;

/* JADX INFO: renamed from: di */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0568di {

    /* JADX INFO: renamed from: d */
    public static final C0568di f2932d = new C0568di(-9223372036854775807L, -1, -3);

    /* JADX INFO: renamed from: e */
    public static C0568di f2933e;

    /* JADX INFO: renamed from: a */
    public long f2934a;

    /* JADX INFO: renamed from: b */
    public long f2935b;

    /* JADX INFO: renamed from: c */
    public int f2936c;

    public C0568di(long j, long j2, int i) {
        this.f2936c = i;
        this.f2934a = j;
        this.f2935b = j2;
    }

    /* JADX INFO: renamed from: a */
    public void m2360a(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.f2936c = 1;
            this.f2934a = -1L;
            this.f2935b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f2936c = 0;
                this.f2934a = -1L;
                this.f2935b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f2934a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f2935b = jRound;
            if (jRound >= j || this.f2934a <= j) {
                this.f2936c = 1;
            } else {
                this.f2936c = 0;
            }
        }
    }
}
