package p000;

import android.sun.security.util.DerValue;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: hp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0722hp extends AbstractC0762ip {

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f4629d;

    /* JADX INFO: renamed from: e */
    public final long f4630e;

    /* JADX INFO: renamed from: f */
    public long f4631f;

    /* JADX INFO: renamed from: g */
    public long f4632g;

    /* JADX INFO: renamed from: h */
    public final long f4633h;

    /* JADX INFO: renamed from: i */
    public int f4634i;

    /* JADX INFO: renamed from: j */
    public int f4635j;

    /* JADX INFO: renamed from: k */
    public int f4636k = Integer.MAX_VALUE;

    public C0722hp(ByteBuffer byteBuffer, boolean z) {
        this.f4629d = byteBuffer;
        long jM3555j = k42.f5664c.m3555j(k42.f5668g, byteBuffer);
        this.f4630e = jM3555j;
        this.f4631f = ((long) byteBuffer.limit()) + jM3555j;
        long jPosition = jM3555j + ((long) byteBuffer.position());
        this.f4632g = jPosition;
        this.f4633h = jPosition;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: A */
    public final int mo2605A() {
        return m3188F();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: B */
    public final long mo2606B() {
        return m3189G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: C */
    public final boolean mo2607C(int i) throws rp0 {
        int iMo2635z;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.f4631f - this.f4632g)) >= 10) {
                while (i3 < 10) {
                    long j = this.f4632g;
                    this.f4632g = j + 1;
                    if (k42.f5664c.mo3099e(j) < 0) {
                        i3++;
                    }
                }
                throw rp0.m5884e();
            }
            while (i3 < 10) {
                long j2 = this.f4632g;
                if (j2 == this.f4631f) {
                    throw rp0.m5887h();
                }
                this.f4632g = j2 + 1;
                if (k42.f5664c.mo3099e(j2) < 0) {
                    i3++;
                }
            }
            throw rp0.m5884e();
            return true;
        }
        if (i2 == 1) {
            m3192J(8);
            return true;
        }
        if (i2 == 2) {
            m3192J(m3188F());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw rp0.m5883d();
            }
            m3192J(4);
            return true;
        }
        do {
            iMo2635z = mo2635z();
            if (iMo2635z == 0) {
                break;
            }
        } while (mo2607C(iMo2635z));
        mo2615a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final int m3186D() throws rp0 {
        long j = this.f4632g;
        if (this.f4631f - j < 4) {
            throw rp0.m5887h();
        }
        this.f4632g = 4 + j;
        j42 j42Var = k42.f5664c;
        return ((j42Var.mo3099e(j + 3) & 255) << 24) | (j42Var.mo3099e(j) & 255) | ((j42Var.mo3099e(1 + j) & 255) << 8) | ((j42Var.mo3099e(2 + j) & 255) << 16);
    }

    /* JADX INFO: renamed from: E */
    public final long m3187E() throws rp0 {
        long j = this.f4632g;
        if (this.f4631f - j < 8) {
            throw rp0.m5887h();
        }
        this.f4632g = 8 + j;
        j42 j42Var = k42.f5664c;
        return ((((long) j42Var.mo3099e(j + 7)) & 255) << 56) | (((long) j42Var.mo3099e(j)) & 255) | ((((long) j42Var.mo3099e(1 + j)) & 255) << 8) | ((((long) j42Var.mo3099e(2 + j)) & 255) << 16) | ((((long) j42Var.mo3099e(3 + j)) & 255) << 24) | ((((long) j42Var.mo3099e(4 + j)) & 255) << 32) | ((((long) j42Var.mo3099e(5 + j)) & 255) << 40) | ((((long) j42Var.mo3099e(6 + j)) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.mo3099e(r8) < 0) goto L34;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3188F() {
        /*
            r12 = this;
            long r0 = r12.f4632g
            long r2 = r12.f4631f
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            j42 r4 = p000.k42.f5664c
            byte r5 = r4.mo3099e(r0)
            if (r5 < 0) goto L18
            r12.f4632g = r2
            return r5
        L18:
            long r6 = r12.f4631f
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.mo3099e(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.mo3099e(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.mo3099e(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.mo3099e(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.mo3099e(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.mo3099e(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.mo3099e(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.mo3099e(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.mo3099e(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.m3190H()
            int r12 = (int) r0
            return r12
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f4632g = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0722hp.m3188F():int");
    }

    /* JADX INFO: renamed from: G */
    public final long m3189G() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.f4632g;
        if (this.f4631f != j4) {
            long j5 = 1 + j4;
            j42 j42Var = k42.f5664c;
            byte bMo3099e = j42Var.mo3099e(j4);
            if (bMo3099e >= 0) {
                this.f4632g = j5;
                return bMo3099e;
            }
            if (this.f4631f - j5 >= 9) {
                long j6 = 2 + j4;
                int iMo3099e = (j42Var.mo3099e(j5) << 7) ^ bMo3099e;
                if (iMo3099e >= 0) {
                    long j7 = 3 + j4;
                    int iMo3099e2 = iMo3099e ^ (j42Var.mo3099e(j6) << 14);
                    if (iMo3099e2 < 0) {
                        j6 = j4 + 4;
                        int iMo3099e3 = iMo3099e2 ^ (j42Var.mo3099e(j7) << 21);
                        if (iMo3099e3 < 0) {
                            i = (-2080896) ^ iMo3099e3;
                        } else {
                            j7 = 5 + j4;
                            long jMo3099e = ((long) iMo3099e3) ^ (((long) j42Var.mo3099e(j6)) << 28);
                            if (jMo3099e >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = 6 + j4;
                                long jMo3099e2 = jMo3099e ^ (((long) j42Var.mo3099e(j7)) << 35);
                                if (jMo3099e2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jMo3099e = jMo3099e2 ^ (((long) j42Var.mo3099e(j8)) << 42);
                                    if (jMo3099e >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j4;
                                        jMo3099e2 = jMo3099e ^ (((long) j42Var.mo3099e(j7)) << 49);
                                        if (jMo3099e2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            long j9 = j4 + 9;
                                            long jMo3099e3 = (jMo3099e2 ^ (((long) j42Var.mo3099e(j8)) << 56)) ^ 71499008037633920L;
                                            if (jMo3099e3 < 0) {
                                                long j10 = j4 + 10;
                                                if (j42Var.mo3099e(j9) >= 0) {
                                                    j6 = j10;
                                                    j = jMo3099e3;
                                                }
                                            } else {
                                                j = jMo3099e3;
                                                j6 = j9;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jMo3099e2;
                                j6 = j8;
                            }
                            j = j3 ^ jMo3099e;
                        }
                        this.f4632g = j6;
                        return j;
                    }
                    j = iMo3099e2 ^ 16256;
                    j6 = j7;
                    this.f4632g = j6;
                    return j;
                }
                i = iMo3099e ^ (-128);
                j = i;
                this.f4632g = j6;
                return j;
            }
        }
        return m3190H();
    }

    /* JADX INFO: renamed from: H */
    public final long m3190H() throws rp0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.f4632g;
            if (j2 == this.f4631f) {
                throw rp0.m5887h();
            }
            this.f4632g = 1 + j2;
            byte bMo3099e = k42.f5664c.mo3099e(j2);
            j |= ((long) (bMo3099e & 127)) << i;
            if ((bMo3099e & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw rp0.m5884e();
    }

    /* JADX INFO: renamed from: I */
    public final void m3191I() {
        long j = this.f4631f + ((long) this.f4634i);
        this.f4631f = j;
        int i = (int) (j - this.f4633h);
        int i2 = this.f4636k;
        if (i <= i2) {
            this.f4634i = 0;
            return;
        }
        int i3 = i - i2;
        this.f4634i = i3;
        this.f4631f = j - ((long) i3);
    }

    /* JADX INFO: renamed from: J */
    public final void m3192J(int i) throws rp0 {
        if (i >= 0) {
            long j = this.f4631f;
            long j2 = this.f4632g;
            if (i <= ((int) (j - j2))) {
                this.f4632g = j2 + ((long) i);
                return;
            }
        }
        if (i >= 0) {
            throw rp0.m5887h();
        }
        throw rp0.m5885f();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: a */
    public final void mo2615a(int i) throws rp0 {
        if (this.f4635j != i) {
            throw rp0.m5880a();
        }
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: d */
    public final int mo2616d() {
        return (int) (this.f4632g - this.f4633h);
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: e */
    public final boolean mo2617e() {
        return this.f4632g == this.f4631f;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: h */
    public final void mo2618h(int i) {
        this.f4636k = i;
        m3191I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: i */
    public final int mo2619i(int i) throws rp0 {
        if (i < 0) {
            throw rp0.m5885f();
        }
        int iMo2616d = mo2616d() + i;
        int i2 = this.f4636k;
        if (iMo2616d > i2) {
            throw rp0.m5887h();
        }
        this.f4636k = iMo2616d;
        m3191I();
        return i2;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: j */
    public final boolean mo2620j() {
        return m3189G() != 0;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: k */
    public final C0680gk mo2621k() throws rp0 {
        int iM3188F = m3188F();
        if (iM3188F > 0) {
            long j = this.f4631f;
            long j2 = this.f4632g;
            if (iM3188F <= ((int) (j - j2))) {
                byte[] bArr = new byte[iM3188F];
                long j3 = iM3188F;
                k42.f5664c.mo3097c(j2, bArr, 0L, j3);
                this.f4632g += j3;
                C0680gk c0680gk = AbstractC0753ik.f5042b;
                return new C0680gk(bArr);
            }
        }
        if (iM3188F == 0) {
            return AbstractC0753ik.f5042b;
        }
        if (iM3188F < 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: l */
    public final double mo2622l() {
        return Double.longBitsToDouble(m3187E());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: m */
    public final int mo2623m() {
        return m3188F();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: n */
    public final int mo2624n() {
        return m3186D();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: o */
    public final long mo2625o() {
        return m3187E();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: p */
    public final float mo2626p() {
        return Float.intBitsToFloat(m3186D());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: q */
    public final int mo2627q() {
        return m3188F();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: r */
    public final long mo2628r() {
        return m3189G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: t */
    public final int mo2629t() {
        return m3186D();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: u */
    public final long mo2630u() {
        return m3187E();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: v */
    public final int mo2631v() {
        return AbstractC0762ip.m3466b(m3188F());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: w */
    public final long mo2632w() {
        return AbstractC0762ip.m3467c(m3189G());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: x */
    public final String mo2633x() throws rp0 {
        int iM3188F = m3188F();
        if (iM3188F > 0) {
            long j = this.f4631f;
            long j2 = this.f4632g;
            if (iM3188F <= ((int) (j - j2))) {
                byte[] bArr = new byte[iM3188F];
                long j3 = iM3188F;
                k42.f5664c.mo3097c(j2, bArr, 0L, j3);
                String str = new String(bArr, no0.f7481a);
                this.f4632g += j3;
                return str;
            }
        }
        if (iM3188F == 0) {
            return "";
        }
        if (iM3188F < 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: y */
    public final String mo2634y() throws rp0 {
        int iM3188F = m3188F();
        if (iM3188F > 0) {
            long j = this.f4631f;
            long j2 = this.f4632g;
            if (iM3188F <= ((int) (j - j2))) {
                String strM6706b = w42.m6706b(this.f4629d, (int) (j2 - this.f4630e), iM3188F);
                this.f4632g += (long) iM3188F;
                return strM6706b;
            }
        }
        if (iM3188F == 0) {
            return "";
        }
        if (iM3188F <= 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: z */
    public final int mo2635z() throws rp0 {
        if (mo2617e()) {
            this.f4635j = 0;
            return 0;
        }
        int iM3188F = m3188F();
        this.f4635j = iM3188F;
        if ((iM3188F >>> 3) != 0) {
            return iM3188F;
        }
        throw rp0.m5881b();
    }
}
