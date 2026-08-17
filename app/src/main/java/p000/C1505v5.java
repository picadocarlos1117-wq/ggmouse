package p000;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: v5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1505v5 implements x80 {

    /* JADX INFO: renamed from: q */
    public static final int[] f11529q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r */
    public static final int[] f11530r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s */
    public static final byte[] f11531s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f11532t;

    /* JADX INFO: renamed from: b */
    public final t20 f11534b;

    /* JADX INFO: renamed from: c */
    public boolean f11535c;

    /* JADX INFO: renamed from: d */
    public long f11536d;

    /* JADX INFO: renamed from: e */
    public int f11537e;

    /* JADX INFO: renamed from: f */
    public int f11538f;

    /* JADX INFO: renamed from: h */
    public int f11540h;

    /* JADX INFO: renamed from: i */
    public long f11541i;

    /* JADX INFO: renamed from: j */
    public z80 f11542j;

    /* JADX INFO: renamed from: k */
    public c22 f11543k;

    /* JADX INFO: renamed from: l */
    public c22 f11544l;

    /* JADX INFO: renamed from: m */
    public kq1 f11545m;

    /* JADX INFO: renamed from: n */
    public boolean f11546n;

    /* JADX INFO: renamed from: o */
    public long f11547o;

    /* JADX INFO: renamed from: p */
    public boolean f11548p;

    /* JADX INFO: renamed from: a */
    public final byte[] f11533a = new byte[1];

    /* JADX INFO: renamed from: g */
    public int f11539g = -1;

    static {
        int i = z42.f13274a;
        Charset charset = StandardCharsets.UTF_8;
        f11531s = "#!AMR\n".getBytes(charset);
        f11532t = "#!AMR-WB\n".getBytes(charset);
    }

    public C1505v5() {
        t20 t20Var = new t20();
        this.f11534b = t20Var;
        this.f11544l = t20Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m6569a(y80 y80Var) throws fc1 {
        boolean z;
        y80Var.mo2422l();
        byte[] bArr = this.f11533a;
        y80Var.mo2413a(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw fc1.m2799a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f11535c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f11530r[i] : f11529q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f11535c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw fc1.m2799a(null, sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e4 A[PHI: r4
  0x00e4: PHI (r4v1 y80) = (r4v0 y80), (r4v5 y80) binds: [B:50:0x00e2, B:53:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        y80 y80Var2;
        int iMo1116c;
        int i;
        ki0.m3866j(this.f11543k);
        int i2 = z42.f13274a;
        if (y80Var.getPosition() == 0 && !m6570c(y80Var)) {
            throw fc1.m2799a(null, "Could not find AMR header.");
        }
        if (!this.f11548p) {
            this.f11548p = true;
            boolean z = this.f11535c;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i3 = z ? 16000 : 8000;
            int i4 = z ? f11530r[8] : f11529q[7];
            c22 c22Var = this.f11544l;
            ae0 ae0Var = new ae0();
            ae0Var.f197m = v51.m6582l(str);
            ae0Var.f198n = i4;
            ae0Var.f175B = 1;
            ae0Var.f176C = i3;
            c22Var.mo1117d(new be0(ae0Var));
        }
        int i5 = 0;
        if (this.f11538f == 0) {
            try {
                int iM6569a = m6569a(y80Var);
                this.f11537e = iM6569a;
                this.f11538f = iM6569a;
                if (this.f11539g == -1) {
                    y80Var.getPosition();
                    this.f11539g = this.f11537e;
                }
                if (this.f11539g == this.f11537e) {
                    this.f11540h++;
                }
                kq1 kq1Var = this.f11545m;
                if (kq1Var instanceof gn0) {
                    gn0 gn0Var = (gn0) kq1Var;
                    long j = this.f11541i + this.f11536d + 20000;
                    long position = y80Var.getPosition() + ((long) this.f11537e);
                    C1296pi c1296pi = gn0Var.f4244b;
                    int i6 = c1296pi.f8901a;
                    if (i6 == 0 || j - c1296pi.m5260f(i6 - 1) >= 100000) {
                        C1296pi c1296pi2 = gn0Var.f4243a;
                        C1296pi c1296pi3 = gn0Var.f4244b;
                        if (c1296pi3.f8901a == 0 && j > 0) {
                            c1296pi2.m5258c(0L);
                            c1296pi3.m5258c(0L);
                        }
                        c1296pi2.m5258c(position);
                        c1296pi3.m5258c(j);
                    }
                    if (this.f11546n && Math.abs(this.f11547o - j) < 20000) {
                        this.f11546n = false;
                        this.f11544l = this.f11543k;
                    }
                }
                y80Var2 = y80Var;
                iMo1116c = this.f11544l.mo1116c(y80Var2, this.f11538f, true);
                if (iMo1116c == -1) {
                    i5 = -1;
                } else {
                    i = this.f11538f - iMo1116c;
                    this.f11538f = i;
                    if (i <= 0) {
                        this.f11544l.mo1114a(this.f11536d + this.f11541i, 1, this.f11537e, 0, null);
                        this.f11536d += 20000;
                    }
                }
            } catch (EOFException unused) {
                y80Var2 = y80Var;
            }
        } else {
            y80Var2 = y80Var;
            iMo1116c = this.f11544l.mo1116c(y80Var2, this.f11538f, true);
            if (iMo1116c == -1) {
                i5 = -1;
            } else {
                i = this.f11538f - iMo1116c;
                this.f11538f = i;
                if (i <= 0) {
                    this.f11544l.mo1114a(this.f11536d + this.f11541i, 1, this.f11537e, 0, null);
                    this.f11536d += 20000;
                }
            }
        }
        y80Var2.mo2420i();
        if (this.f11545m == null) {
            C0825ke c0825ke = new C0825ke(-9223372036854775807L);
            this.f11545m = c0825ke;
            this.f11542j.mo752q(c0825ke);
        }
        if (i5 == -1) {
            kq1 kq1Var2 = this.f11545m;
            if (kq1Var2 instanceof gn0) {
                ((gn0) kq1Var2).f4245c = this.f11541i + this.f11536d;
                this.f11542j.mo752q(kq1Var2);
            }
        }
        return i5;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6570c(y80 y80Var) {
        y80Var.mo2422l();
        byte[] bArr = f11531s;
        byte[] bArr2 = new byte[bArr.length];
        y80Var.mo2413a(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f11535c = false;
            y80Var.mo2423m(bArr.length);
            return true;
        }
        y80Var.mo2422l();
        byte[] bArr3 = f11532t;
        byte[] bArr4 = new byte[bArr3.length];
        y80Var.mo2413a(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f11535c = true;
        y80Var.mo2423m(bArr3.length);
        return true;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        return m6570c(y80Var);
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f11536d = 0L;
        this.f11537e = 0;
        this.f11538f = 0;
        this.f11547o = j2;
        kq1 kq1Var = this.f11545m;
        if (!(kq1Var instanceof gn0)) {
            if (j == 0 || !(kq1Var instanceof C0802js)) {
                this.f11541i = 0L;
                return;
            } else {
                C0802js c0802js = (C0802js) kq1Var;
                this.f11541i = (Math.max(0L, j - c0802js.f5505b) * 8000000) / ((long) c0802js.f5508e);
                return;
            }
        }
        gn0 gn0Var = (gn0) kq1Var;
        C1296pi c1296pi = gn0Var.f4244b;
        long jM5260f = c1296pi.f8901a == 0 ? -9223372036854775807L : c1296pi.m5260f(z42.m7228b(gn0Var.f4243a, j));
        this.f11541i = jM5260f;
        if (Math.abs(this.f11547o - jM5260f) < 20000) {
            return;
        }
        this.f11546n = true;
        this.f11544l = this.f11534b;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f11542j = z80Var;
        c22 c22VarMo750n = z80Var.mo750n(0, 1);
        this.f11543k = c22VarMo750n;
        this.f11544l = c22VarMo750n;
        z80Var.mo748k();
    }

    @Override // p000.x80
    public final void release() {
    }
}
