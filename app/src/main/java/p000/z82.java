package p000;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z82 implements y82 {

    /* JADX INFO: renamed from: a */
    public final z80 f13307a;

    /* JADX INFO: renamed from: b */
    public final c22 f13308b;

    /* JADX INFO: renamed from: c */
    public final C0752ij f13309c;

    /* JADX INFO: renamed from: d */
    public final be0 f13310d;

    /* JADX INFO: renamed from: e */
    public final int f13311e;

    /* JADX INFO: renamed from: f */
    public long f13312f;

    /* JADX INFO: renamed from: g */
    public int f13313g;

    /* JADX INFO: renamed from: h */
    public long f13314h;

    public z82(z80 z80Var, c22 c22Var, C0752ij c0752ij, String str, int i) throws fc1 {
        this.f13307a = z80Var;
        this.f13308b = c22Var;
        this.f13309c = c0752ij;
        int i2 = c0752ij.f5022a;
        int i3 = c0752ij.f5023b;
        int i4 = (c0752ij.f5025d * i2) / 8;
        int i5 = c0752ij.f5024c;
        if (i5 != i4) {
            throw fc1.m2799a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.f13311e = iMax;
        ae0 ae0Var = new ae0();
        ae0Var.f197m = v51.m6582l(str);
        ae0Var.f192h = i7;
        ae0Var.f193i = i7;
        ae0Var.f198n = iMax;
        ae0Var.f175B = i2;
        ae0Var.f176C = i3;
        ae0Var.f177D = i;
        this.f13310d = new be0(ae0Var);
    }

    @Override // p000.y82
    /* JADX INFO: renamed from: a */
    public final void mo6872a(long j) {
        this.f13312f = j;
        this.f13313g = 0;
        this.f13314h = 0L;
    }

    @Override // p000.y82
    /* JADX INFO: renamed from: b */
    public final boolean mo6873b(y80 y80Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f13313g) < (i2 = this.f13311e)) {
            int iMo1116c = this.f13308b.mo1116c(y80Var, (int) Math.min(i2 - i, j2), true);
            if (iMo1116c == -1) {
                j2 = 0;
            } else {
                this.f13313g += iMo1116c;
                j2 -= (long) iMo1116c;
            }
        }
        C0752ij c0752ij = this.f13309c;
        int i3 = c0752ij.f5024c;
        int i4 = this.f13313g / i3;
        if (i4 > 0) {
            long j3 = this.f13312f;
            long j4 = this.f13314h;
            long j5 = c0752ij.f5023b;
            int i5 = z42.f13274a;
            long jM7222J = j3 + z42.m7222J(j4, 1000000L, j5, RoundingMode.DOWN);
            int i6 = i4 * i3;
            int i7 = this.f13313g - i6;
            this.f13308b.mo1114a(jM7222J, 1, i6, i7, null);
            this.f13314h += (long) i4;
            this.f13313g = i7;
        }
        return j2 <= 0;
    }

    @Override // p000.y82
    /* JADX INFO: renamed from: c */
    public final void mo6874c(int i, long j) {
        this.f13307a.mo752q(new b92(this.f13309c, 1, i, j));
        this.f13308b.mo1117d(this.f13310d);
    }
}
