package p000;

import android.sun.security.util.DerValue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: fp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0648fp extends AbstractC0762ip {

    /* JADX INFO: renamed from: d */
    public final Iterator f3867d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f3868e;

    /* JADX INFO: renamed from: f */
    public int f3869f;

    /* JADX INFO: renamed from: g */
    public int f3870g;

    /* JADX INFO: renamed from: i */
    public int f3872i;

    /* JADX INFO: renamed from: k */
    public long f3874k;

    /* JADX INFO: renamed from: l */
    public long f3875l;

    /* JADX INFO: renamed from: m */
    public long f3876m;

    /* JADX INFO: renamed from: h */
    public int f3871h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    public int f3873j = 0;

    public C0648fp(int i, ArrayList arrayList) {
        this.f3869f = i;
        this.f3867d = arrayList.iterator();
        if (i != 0) {
            m2840N();
            return;
        }
        this.f3868e = no0.f7483c;
        this.f3874k = 0L;
        this.f3875l = 0L;
        this.f3876m = 0L;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: A */
    public final int mo2605A() {
        return m2835I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: B */
    public final long mo2606B() {
        return m2836J();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: C */
    public final boolean mo2607C(int i) throws rp0 {
        int iMo2635z;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (m2831E() >= 0) {
                    return true;
                }
            }
            throw rp0.m5884e();
        }
        if (i2 == 1) {
            m2839M(8);
            return true;
        }
        if (i2 == 2) {
            m2839M(m2835I());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw rp0.m5883d();
            }
            m2839M(4);
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
    public final long m2830D() {
        return this.f3876m - this.f3874k;
    }

    /* JADX INFO: renamed from: E */
    public final byte m2831E() throws rp0 {
        if (m2830D() == 0) {
            if (!this.f3867d.hasNext()) {
                throw rp0.m5887h();
            }
            m2840N();
        }
        long j = this.f3874k;
        this.f3874k = 1 + j;
        return k42.f5664c.mo3099e(j);
    }

    /* JADX INFO: renamed from: F */
    public final void m2832F(int i, byte[] bArr) throws rp0 {
        if (i < 0 || i > m2838L()) {
            if (i > 0) {
                throw rp0.m5887h();
            }
            if (i != 0) {
                throw rp0.m5885f();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (m2830D() == 0) {
                if (!this.f3867d.hasNext()) {
                    throw rp0.m5887h();
                }
                m2840N();
            }
            int iMin = Math.min(i2, (int) m2830D());
            long j = iMin;
            k42.f5664c.mo3097c(this.f3874k, bArr, i - i2, j);
            i2 -= iMin;
            this.f3874k += j;
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m2833G() {
        if (m2830D() < 4) {
            return ((m2831E() & 255) << 24) | (m2831E() & 255) | ((m2831E() & 255) << 8) | ((m2831E() & 255) << 16);
        }
        long j = this.f3874k;
        this.f3874k = 4 + j;
        j42 j42Var = k42.f5664c;
        return ((j42Var.mo3099e(j + 3) & 255) << 24) | (j42Var.mo3099e(j) & 255) | ((j42Var.mo3099e(1 + j) & 255) << 8) | ((j42Var.mo3099e(2 + j) & 255) << 16);
    }

    /* JADX INFO: renamed from: H */
    public final long m2834H() throws rp0 {
        char c;
        long jM2831E;
        byte bM2831E;
        if (m2830D() >= 8) {
            long j = this.f3874k;
            this.f3874k = 8 + j;
            j42 j42Var = k42.f5664c;
            c = '8';
            jM2831E = (((long) j42Var.mo3099e(j)) & 255) | ((((long) j42Var.mo3099e(j + 1)) & 255) << 8) | ((((long) j42Var.mo3099e(j + 2)) & 255) << 16) | ((((long) j42Var.mo3099e(3 + j)) & 255) << 24) | ((((long) j42Var.mo3099e(4 + j)) & 255) << 32) | ((((long) j42Var.mo3099e(5 + j)) & 255) << 40) | ((((long) j42Var.mo3099e(6 + j)) & 255) << 48);
            bM2831E = j42Var.mo3099e(j + 7);
        } else {
            c = '8';
            jM2831E = (((long) m2831E()) & 255) | ((((long) m2831E()) & 255) << 8) | ((((long) m2831E()) & 255) << 16) | ((((long) m2831E()) & 255) << 24) | ((((long) m2831E()) & 255) << 32) | ((((long) m2831E()) & 255) << 40) | ((((long) m2831E()) & 255) << 48);
            bM2831E = m2831E();
        }
        return jM2831E | ((((long) bM2831E) & 255) << c);
    }

    /* JADX INFO: renamed from: I */
    public final int m2835I() {
        int i;
        long j = this.f3874k;
        if (this.f3876m != j) {
            long j2 = j + 1;
            j42 j42Var = k42.f5664c;
            byte bMo3099e = j42Var.mo3099e(j);
            if (bMo3099e >= 0) {
                this.f3874k++;
                return bMo3099e;
            }
            if (this.f3876m - this.f3874k >= 10) {
                long j3 = 2 + j;
                int iMo3099e = (j42Var.mo3099e(j2) << 7) ^ bMo3099e;
                if (iMo3099e < 0) {
                    i = iMo3099e ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iMo3099e2 = (j42Var.mo3099e(j3) << 14) ^ iMo3099e;
                    if (iMo3099e2 >= 0) {
                        i = iMo3099e2 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int iMo3099e3 = iMo3099e2 ^ (j42Var.mo3099e(j4) << 21);
                        if (iMo3099e3 < 0) {
                            i = (-2080896) ^ iMo3099e3;
                        } else {
                            j4 = 5 + j;
                            byte bMo3099e2 = j42Var.mo3099e(j5);
                            int i2 = (iMo3099e3 ^ (bMo3099e2 << DerValue.tag_UniversalString)) ^ 266354560;
                            if (bMo3099e2 < 0) {
                                j5 = 6 + j;
                                if (j42Var.mo3099e(j4) < 0) {
                                    j4 = 7 + j;
                                    if (j42Var.mo3099e(j5) < 0) {
                                        j5 = 8 + j;
                                        if (j42Var.mo3099e(j4) < 0) {
                                            j4 = 9 + j;
                                            if (j42Var.mo3099e(j5) < 0) {
                                                long j6 = j + 10;
                                                if (j42Var.mo3099e(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.f3874k = j3;
                return i;
            }
        }
        return (int) m2837K();
    }

    /* JADX INFO: renamed from: J */
    public final long m2836J() {
        long j;
        long j2;
        long j3;
        long j4 = this.f3874k;
        if (this.f3876m != j4) {
            long j5 = j4 + 1;
            j42 j42Var = k42.f5664c;
            byte bMo3099e = j42Var.mo3099e(j4);
            if (bMo3099e >= 0) {
                this.f3874k++;
                return bMo3099e;
            }
            if (this.f3876m - this.f3874k >= 10) {
                long j6 = 2 + j4;
                int iMo3099e = (j42Var.mo3099e(j5) << 7) ^ bMo3099e;
                if (iMo3099e < 0) {
                    j = iMo3099e ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int iMo3099e2 = (j42Var.mo3099e(j6) << 14) ^ iMo3099e;
                    if (iMo3099e2 >= 0) {
                        j = iMo3099e2 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int iMo3099e3 = iMo3099e2 ^ (j42Var.mo3099e(j7) << 21);
                        if (iMo3099e3 < 0) {
                            j = (-2080896) ^ iMo3099e3;
                            j6 = j8;
                        } else {
                            long j9 = 5 + j4;
                            long jMo3099e = (((long) j42Var.mo3099e(j8)) << 28) ^ ((long) iMo3099e3);
                            if (jMo3099e >= 0) {
                                j3 = 266354560;
                            } else {
                                j7 = 6 + j4;
                                long jMo3099e2 = jMo3099e ^ (((long) j42Var.mo3099e(j9)) << 35);
                                if (jMo3099e2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j9 = 7 + j4;
                                    jMo3099e = jMo3099e2 ^ (((long) j42Var.mo3099e(j7)) << 42);
                                    if (jMo3099e >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j7 = 8 + j4;
                                        jMo3099e2 = jMo3099e ^ (((long) j42Var.mo3099e(j9)) << 49);
                                        if (jMo3099e2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j4;
                                            long jMo3099e3 = (jMo3099e2 ^ (((long) j42Var.mo3099e(j7)) << 56)) ^ 71499008037633920L;
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
                            }
                            j = j3 ^ jMo3099e;
                            j6 = j9;
                        }
                    }
                    j6 = j7;
                }
                this.f3874k = j6;
                return j;
            }
        }
        return m2837K();
    }

    /* JADX INFO: renamed from: K */
    public final long m2837K() throws rp0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM2831E = m2831E();
            j |= ((long) (bM2831E & 127)) << i;
            if ((bM2831E & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw rp0.m5884e();
    }

    /* JADX INFO: renamed from: L */
    public final int m2838L() {
        return (int) ((((long) (this.f3869f - this.f3873j)) - this.f3874k) + this.f3875l);
    }

    /* JADX INFO: renamed from: M */
    public final void m2839M(int i) throws rp0 {
        if (i < 0 || i > (((long) (this.f3869f - this.f3873j)) - this.f3874k) + this.f3875l) {
            if (i >= 0) {
                throw rp0.m5887h();
            }
            throw rp0.m5885f();
        }
        while (i > 0) {
            if (m2830D() == 0) {
                if (!this.f3867d.hasNext()) {
                    throw rp0.m5887h();
                }
                m2840N();
            }
            int iMin = Math.min(i, (int) m2830D());
            i -= iMin;
            this.f3874k += (long) iMin;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m2840N() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f3867d.next();
        this.f3868e = byteBuffer;
        this.f3873j += (int) (this.f3874k - this.f3875l);
        long jPosition = byteBuffer.position();
        this.f3874k = jPosition;
        this.f3875l = jPosition;
        this.f3876m = this.f3868e.limit();
        long jM3555j = k42.f5664c.m3555j(k42.f5668g, this.f3868e);
        this.f3874k += jM3555j;
        this.f3875l += jM3555j;
        this.f3876m += jM3555j;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: a */
    public final void mo2615a(int i) throws rp0 {
        if (this.f3872i != i) {
            throw rp0.m5880a();
        }
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: d */
    public final int mo2616d() {
        return (int) ((((long) this.f3873j) + this.f3874k) - this.f3875l);
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: e */
    public final boolean mo2617e() {
        return (((long) this.f3873j) + this.f3874k) - this.f3875l == ((long) this.f3869f);
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: h */
    public final void mo2618h(int i) {
        this.f3871h = i;
        int i2 = this.f3869f + this.f3870g;
        this.f3869f = i2;
        if (i2 <= i) {
            this.f3870g = 0;
            return;
        }
        int i3 = i2 - i;
        this.f3870g = i3;
        this.f3869f = i2 - i3;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: i */
    public final int mo2619i(int i) throws rp0 {
        if (i < 0) {
            throw rp0.m5885f();
        }
        int iMo2616d = mo2616d() + i;
        int i2 = this.f3871h;
        if (iMo2616d > i2) {
            throw rp0.m5887h();
        }
        this.f3871h = iMo2616d;
        int i3 = this.f3869f + this.f3870g;
        this.f3869f = i3;
        if (i3 <= iMo2616d) {
            this.f3870g = 0;
            return i2;
        }
        int i4 = i3 - iMo2616d;
        this.f3870g = i4;
        this.f3869f = i3 - i4;
        return i2;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: j */
    public final boolean mo2620j() {
        return m2836J() != 0;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: k */
    public final C0680gk mo2621k() throws rp0 {
        int iM2835I = m2835I();
        if (iM2835I > 0) {
            long j = iM2835I;
            long j2 = this.f3876m;
            long j3 = this.f3874k;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iM2835I];
                k42.f5664c.mo3097c(j3, bArr, 0L, j);
                this.f3874k += j;
                C0680gk c0680gk = AbstractC0753ik.f5042b;
                return new C0680gk(bArr);
            }
        }
        if (iM2835I > 0 && iM2835I <= m2838L()) {
            byte[] bArr2 = new byte[iM2835I];
            m2832F(iM2835I, bArr2);
            C0680gk c0680gk2 = AbstractC0753ik.f5042b;
            return new C0680gk(bArr2);
        }
        if (iM2835I == 0) {
            return AbstractC0753ik.f5042b;
        }
        if (iM2835I < 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: l */
    public final double mo2622l() {
        return Double.longBitsToDouble(m2834H());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: m */
    public final int mo2623m() {
        return m2835I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: n */
    public final int mo2624n() {
        return m2833G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: o */
    public final long mo2625o() {
        return m2834H();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: p */
    public final float mo2626p() {
        return Float.intBitsToFloat(m2833G());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: q */
    public final int mo2627q() {
        return m2835I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: r */
    public final long mo2628r() {
        return m2836J();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: t */
    public final int mo2629t() {
        return m2833G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: u */
    public final long mo2630u() {
        return m2834H();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: v */
    public final int mo2631v() {
        return AbstractC0762ip.m3466b(m2835I());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: w */
    public final long mo2632w() {
        return AbstractC0762ip.m3467c(m2836J());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: x */
    public final String mo2633x() throws rp0 {
        int iM2835I = m2835I();
        if (iM2835I > 0) {
            long j = iM2835I;
            long j2 = this.f3876m;
            long j3 = this.f3874k;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iM2835I];
                k42.f5664c.mo3097c(j3, bArr, 0L, j);
                String str = new String(bArr, no0.f7481a);
                this.f3874k += j;
                return str;
            }
        }
        if (iM2835I > 0 && iM2835I <= m2838L()) {
            byte[] bArr2 = new byte[iM2835I];
            m2832F(iM2835I, bArr2);
            return new String(bArr2, no0.f7481a);
        }
        if (iM2835I == 0) {
            return "";
        }
        if (iM2835I < 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: y */
    public final String mo2634y() throws rp0 {
        int iM2835I = m2835I();
        if (iM2835I > 0) {
            long j = iM2835I;
            long j2 = this.f3876m;
            long j3 = this.f3874k;
            if (j <= j2 - j3) {
                String strM6706b = w42.m6706b(this.f3868e, (int) (j3 - this.f3875l), iM2835I);
                this.f3874k += j;
                return strM6706b;
            }
        }
        if (iM2835I >= 0 && iM2835I <= m2838L()) {
            byte[] bArr = new byte[iM2835I];
            m2832F(iM2835I, bArr);
            return w42.f11969a.mo5815v(0, iM2835I, bArr);
        }
        if (iM2835I == 0) {
            return "";
        }
        if (iM2835I <= 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: z */
    public final int mo2635z() throws rp0 {
        if (mo2617e()) {
            this.f3872i = 0;
            return 0;
        }
        int iM2835I = m2835I();
        this.f3872i = iM2835I;
        if ((iM2835I >>> 3) != 0) {
            return iM2835I;
        }
        throw rp0.m5881b();
    }
}
