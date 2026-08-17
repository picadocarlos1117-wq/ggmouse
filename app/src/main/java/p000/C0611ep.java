package p000;

import android.sun.security.util.DerValue;
import java.util.Arrays;

/* JADX INFO: renamed from: ep */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611ep extends AbstractC0762ip {

    /* JADX INFO: renamed from: d */
    public final byte[] f3401d;

    /* JADX INFO: renamed from: e */
    public int f3402e;

    /* JADX INFO: renamed from: f */
    public int f3403f;

    /* JADX INFO: renamed from: g */
    public int f3404g;

    /* JADX INFO: renamed from: h */
    public final int f3405h;

    /* JADX INFO: renamed from: i */
    public int f3406i;

    /* JADX INFO: renamed from: j */
    public int f3407j = Integer.MAX_VALUE;

    public C0611ep(byte[] bArr, int i, int i2, boolean z) {
        this.f3401d = bArr;
        this.f3402e = i2 + i;
        this.f3404g = i;
        this.f3405h = i;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: A */
    public final int mo2605A() {
        return m2610F();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: B */
    public final long mo2606B() {
        return m2611G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: C */
    public final boolean mo2607C(int i) throws rp0 {
        int iMo2635z;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f3402e - this.f3404g;
            byte[] bArr = this.f3401d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f3404g;
                    this.f3404g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw rp0.m5884e();
            }
            while (i3 < 10) {
                int i6 = this.f3404g;
                if (i6 == this.f3402e) {
                    throw rp0.m5887h();
                }
                this.f3404g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw rp0.m5884e();
            return true;
        }
        if (i2 == 1) {
            m2614J(8);
            return true;
        }
        if (i2 == 2) {
            m2614J(m2610F());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw rp0.m5883d();
            }
            m2614J(4);
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
    public final int m2608D() throws rp0 {
        int i = this.f3404g;
        if (this.f3402e - i < 4) {
            throw rp0.m5887h();
        }
        this.f3404g = i + 4;
        byte[] bArr = this.f3401d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: E */
    public final long m2609E() throws rp0 {
        int i = this.f3404g;
        if (this.f3402e - i < 8) {
            throw rp0.m5887h();
        }
        this.f3404g = i + 8;
        byte[] bArr = this.f3401d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: F */
    public final int m2610F() {
        int i;
        int i2 = this.f3404g;
        int i3 = this.f3402e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f3401d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f3404g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << DerValue.tag_UniversalString)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f3404g = i5;
                return i;
            }
        }
        return (int) m2612H();
    }

    /* JADX INFO: renamed from: G */
    public final long m2611G() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f3404g;
        int i2 = this.f3402e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f3401d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f3404g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f3404g = i4;
                return j;
            }
        }
        return m2612H();
    }

    /* JADX INFO: renamed from: H */
    public final long m2612H() throws rp0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f3404g;
            if (i2 == this.f3402e) {
                throw rp0.m5887h();
            }
            this.f3404g = i2 + 1;
            byte b = this.f3401d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw rp0.m5884e();
    }

    /* JADX INFO: renamed from: I */
    public final void m2613I() {
        int i = this.f3402e + this.f3403f;
        this.f3402e = i;
        int i2 = i - this.f3405h;
        int i3 = this.f3407j;
        if (i2 <= i3) {
            this.f3403f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f3403f = i4;
        this.f3402e = i - i4;
    }

    /* JADX INFO: renamed from: J */
    public final void m2614J(int i) throws rp0 {
        if (i >= 0) {
            int i2 = this.f3402e;
            int i3 = this.f3404g;
            if (i <= i2 - i3) {
                this.f3404g = i3 + i;
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
        if (this.f3406i != i) {
            throw rp0.m5880a();
        }
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: d */
    public final int mo2616d() {
        return this.f3404g - this.f3405h;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: e */
    public final boolean mo2617e() {
        return this.f3404g == this.f3402e;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: h */
    public final void mo2618h(int i) {
        this.f3407j = i;
        m2613I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: i */
    public final int mo2619i(int i) throws rp0 {
        if (i < 0) {
            throw rp0.m5885f();
        }
        int iMo2616d = mo2616d() + i;
        if (iMo2616d < 0) {
            throw rp0.m5886g();
        }
        int i2 = this.f3407j;
        if (iMo2616d > i2) {
            throw rp0.m5887h();
        }
        this.f3407j = iMo2616d;
        m2613I();
        return i2;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: j */
    public final boolean mo2620j() {
        return m2611G() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: k */
    public final C0680gk mo2621k() throws rp0 {
        byte[] bArrCopyOfRange;
        int iM2610F = m2610F();
        byte[] bArr = this.f3401d;
        if (iM2610F > 0) {
            int i = this.f3402e;
            int i2 = this.f3404g;
            if (iM2610F <= i - i2) {
                C0680gk c0680gkM3441i = AbstractC0753ik.m3441i(i2, iM2610F, bArr);
                this.f3404g += iM2610F;
                return c0680gkM3441i;
            }
        }
        if (iM2610F == 0) {
            return AbstractC0753ik.f5042b;
        }
        if (iM2610F > 0) {
            int i3 = this.f3402e;
            int i4 = this.f3404g;
            if (iM2610F <= i3 - i4) {
                int i5 = iM2610F + i4;
                this.f3404g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM2610F <= 0) {
                    throw rp0.m5887h();
                }
                if (iM2610F == 0) {
                    throw rp0.m5885f();
                }
                bArrCopyOfRange = no0.f7482b;
            }
        } else {
            if (iM2610F <= 0) {
                throw rp0.m5887h();
            }
            if (iM2610F == 0) {
                throw rp0.m5885f();
            }
            bArrCopyOfRange = no0.f7482b;
        }
        C0680gk c0680gk = AbstractC0753ik.f5042b;
        return new C0680gk(bArrCopyOfRange);
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: l */
    public final double mo2622l() {
        return Double.longBitsToDouble(m2609E());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: m */
    public final int mo2623m() {
        return m2610F();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: n */
    public final int mo2624n() {
        return m2608D();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: o */
    public final long mo2625o() {
        return m2609E();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: p */
    public final float mo2626p() {
        return Float.intBitsToFloat(m2608D());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: q */
    public final int mo2627q() {
        return m2610F();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: r */
    public final long mo2628r() {
        return m2611G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: t */
    public final int mo2629t() {
        return m2608D();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: u */
    public final long mo2630u() {
        return m2609E();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: v */
    public final int mo2631v() {
        return AbstractC0762ip.m3466b(m2610F());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: w */
    public final long mo2632w() {
        return AbstractC0762ip.m3467c(m2611G());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: x */
    public final String mo2633x() throws rp0 {
        int iM2610F = m2610F();
        if (iM2610F > 0) {
            int i = this.f3402e;
            int i2 = this.f3404g;
            if (iM2610F <= i - i2) {
                String str = new String(this.f3401d, i2, iM2610F, no0.f7481a);
                this.f3404g += iM2610F;
                return str;
            }
        }
        if (iM2610F == 0) {
            return "";
        }
        if (iM2610F < 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: y */
    public final String mo2634y() throws rp0 {
        int iM2610F = m2610F();
        if (iM2610F > 0) {
            int i = this.f3402e;
            int i2 = this.f3404g;
            if (iM2610F <= i - i2) {
                String strMo5815v = w42.f11969a.mo5815v(i2, iM2610F, this.f3401d);
                this.f3404g += iM2610F;
                return strMo5815v;
            }
        }
        if (iM2610F == 0) {
            return "";
        }
        if (iM2610F <= 0) {
            throw rp0.m5885f();
        }
        throw rp0.m5887h();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: z */
    public final int mo2635z() throws rp0 {
        if (mo2617e()) {
            this.f3406i = 0;
            return 0;
        }
        int iM2610F = m2610F();
        this.f3406i = iM2610F;
        if ((iM2610F >>> 3) != 0) {
            return iM2610F;
        }
        throw rp0.m5881b();
    }
}
