package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 {

    /* JADX INFO: renamed from: a */
    public long f12034a;

    /* JADX INFO: renamed from: b */
    public long f12035b;

    /* JADX INFO: renamed from: c */
    public long f12036c;

    /* JADX INFO: renamed from: d */
    public long f12037d;

    /* JADX INFO: renamed from: e */
    public long f12038e;

    /* JADX INFO: renamed from: f */
    public long f12039f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f12040g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f12041h;

    /* JADX INFO: renamed from: a */
    public final boolean m6734a() {
        return this.f12037d > 15 && this.f12041h == 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m6735b(long j) {
        long j2 = this.f12037d;
        if (j2 == 0) {
            this.f12034a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f12034a;
            this.f12035b = j3;
            this.f12039f = j3;
            this.f12038e = 1L;
        } else {
            long j4 = j - this.f12036c;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f12035b);
            boolean[] zArr = this.f12040g;
            if (jAbs <= 1000000) {
                this.f12038e++;
                this.f12039f += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f12041h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f12041h++;
            }
        }
        this.f12037d++;
        this.f12036c = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m6736c() {
        this.f12037d = 0L;
        this.f12038e = 0L;
        this.f12039f = 0L;
        this.f12041h = 0;
        Arrays.fill(this.f12040g, false);
    }
}
