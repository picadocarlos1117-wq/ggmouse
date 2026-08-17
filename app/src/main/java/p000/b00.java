package p000;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b00 implements o91 {

    /* JADX INFO: renamed from: a */
    public final n91 f1106a;

    /* JADX INFO: renamed from: b */
    public final long f1107b;

    /* JADX INFO: renamed from: c */
    public final long f1108c;

    /* JADX INFO: renamed from: d */
    public final xv1 f1109d;

    /* JADX INFO: renamed from: e */
    public int f1110e;

    /* JADX INFO: renamed from: f */
    public long f1111f;

    /* JADX INFO: renamed from: g */
    public long f1112g;

    /* JADX INFO: renamed from: m */
    public long f1113m;

    /* JADX INFO: renamed from: n */
    public long f1114n;

    /* JADX INFO: renamed from: o */
    public long f1115o;

    /* JADX INFO: renamed from: p */
    public long f1116p;

    /* JADX INFO: renamed from: q */
    public long f1117q;

    public b00(xv1 xv1Var, long j, long j2, long j3, long j4, boolean z) {
        ki0.m3857c(j >= 0 && j2 > j);
        this.f1109d = xv1Var;
        this.f1107b = j;
        this.f1108c = j2;
        if (j3 == j2 - j || z) {
            this.f1111f = j4;
            this.f1110e = 4;
        } else {
            this.f1110e = 0;
        }
        this.f1106a = new n91();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // p000.o91
    /* JADX INFO: renamed from: a */
    public final long mo815a(y80 y80Var) throws IOException {
        long j;
        long jM7234h;
        int i = this.f1110e;
        long j2 = this.f1108c;
        n91 n91Var = this.f1106a;
        if (i == 0) {
            long position = y80Var.getPosition();
            this.f1112g = position;
            this.f1110e = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f1114n == this.f1115o) {
                    jM7234h = -1;
                } else {
                    long position2 = y80Var.getPosition();
                    if (n91Var.m4510b(y80Var, this.f1115o)) {
                        n91Var.m4509a(y80Var, false);
                        y80Var.mo2422l();
                        long j4 = this.f1113m;
                        long j5 = n91Var.f7312b;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = n91Var.f7314d + n91Var.f7315e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.f1115o = position2;
                                this.f1117q = j5;
                            } else {
                                this.f1114n = y80Var.getPosition() + ((long) i2);
                                this.f1116p = n91Var.f7312b;
                            }
                            long j7 = this.f1115o;
                            long j8 = this.f1114n;
                            if (j7 - j8 < 100000) {
                                this.f1115o = j8;
                                jM7234h = j8;
                            } else {
                                long position3 = y80Var.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.f1115o;
                                long j10 = this.f1114n;
                                jM7234h = z42.m7234h((((j9 - j10) * j6) / (this.f1117q - this.f1116p)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jM7234h = -1;
                        }
                    } else {
                        jM7234h = this.f1114n;
                        if (jM7234h == position2) {
                            ca0.m1178j("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jM7234h != -1) {
                        return jM7234h;
                    }
                    this.f1110e = 3;
                }
                j = 2;
                if (jM7234h != -1) {
                    return jM7234h;
                }
                this.f1110e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    l41.m4046o();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                n91Var.m4510b(y80Var, -1L);
                n91Var.m4509a(y80Var, false);
                if (n91Var.f7312b > this.f1113m) {
                    y80Var.mo2422l();
                    this.f1110e = 4;
                    return -(this.f1116p + j);
                }
                y80Var.mo2423m(n91Var.f7314d + n91Var.f7315e);
                this.f1114n = y80Var.getPosition();
                this.f1116p = n91Var.f7312b;
            }
        }
        n91Var.f7311a = 0;
        n91Var.f7312b = 0L;
        n91Var.f7313c = 0;
        n91Var.f7314d = 0;
        n91Var.f7315e = 0;
        if (!n91Var.m4510b(y80Var, -1L)) {
            f40.m2708d();
            return 0L;
        }
        n91Var.m4509a(y80Var, false);
        y80Var.mo2423m(n91Var.f7314d + n91Var.f7315e);
        long j11 = n91Var.f7312b;
        while ((n91Var.f7311a & 4) != 4 && n91Var.m4510b(y80Var, -1L) && y80Var.getPosition() < j2 && n91Var.m4509a(y80Var, true)) {
            try {
                y80Var.mo2423m(n91Var.f7314d + n91Var.f7315e);
                j11 = n91Var.f7312b;
            } catch (EOFException unused) {
            }
        }
        this.f1111f = j11;
        this.f1110e = 4;
        return this.f1112g;
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: g */
    public final kq1 mo816g() {
        if (this.f1111f != 0) {
            return new a00(this);
        }
        return null;
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: k */
    public final void mo817k(long j) {
        this.f1113m = z42.m7234h(j, 0L, this.f1111f - 1);
        this.f1110e = 2;
        this.f1114n = this.f1107b;
        this.f1115o = this.f1108c;
        this.f1116p = 0L;
        this.f1117q = this.f1111f;
    }
}
