package p000;

import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: gp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0685gp extends AbstractC0762ip {

    /* JADX INFO: renamed from: d */
    public final InputStream f4253d;

    /* JADX INFO: renamed from: e */
    public final byte[] f4254e;

    /* JADX INFO: renamed from: f */
    public int f4255f;

    /* JADX INFO: renamed from: g */
    public int f4256g;

    /* JADX INFO: renamed from: h */
    public int f4257h;

    /* JADX INFO: renamed from: i */
    public int f4258i;

    /* JADX INFO: renamed from: j */
    public int f4259j;

    /* JADX INFO: renamed from: k */
    public int f4260k = Integer.MAX_VALUE;

    public C0685gp(InputStream inputStream) {
        no0.m4572a(inputStream, "input");
        this.f4253d = inputStream;
        this.f4254e = new byte[4096];
        this.f4255f = 0;
        this.f4257h = 0;
        this.f4259j = 0;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: A */
    public final int mo2605A() {
        return m3024I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: B */
    public final long mo2606B() {
        return m3025J();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: C */
    public final boolean mo2607C(int i) throws rp0 {
        int iMo2635z;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f4255f - this.f4257h;
            byte[] bArr = this.f4254e;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f4257h;
                    this.f4257h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw rp0.m5884e();
            }
            while (i3 < 10) {
                if (this.f4257h == this.f4255f) {
                    m3028M(1);
                }
                int i6 = this.f4257h;
                this.f4257h = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw rp0.m5884e();
            return true;
        }
        if (i2 == 1) {
            m3029N(8);
            return true;
        }
        if (i2 == 2) {
            m3029N(m3024I());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw rp0.m5883d();
            }
            m3029N(4);
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
    public final byte[] m3019D(int i) throws IOException {
        byte[] bArrM3020E = m3020E(i);
        if (bArrM3020E != null) {
            return bArrM3020E;
        }
        int i2 = this.f4257h;
        int i3 = this.f4255f;
        int length = i3 - i2;
        this.f4259j += i3;
        this.f4257h = 0;
        this.f4255f = 0;
        ArrayList arrayListM3021F = m3021F(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4254e, i2, bArr, 0, length);
        int size = arrayListM3021F.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListM3021F.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: E */
    public final byte[] m3020E(int i) throws IOException {
        if (i == 0) {
            return no0.f7482b;
        }
        if (i < 0) {
            throw rp0.m5885f();
        }
        int i2 = this.f4259j;
        int i3 = this.f4257h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new rp0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f4260k;
        if (i4 > i5) {
            m3029N((i5 - i2) - i3);
            throw rp0.m5887h();
        }
        int i6 = this.f4255f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f4253d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (rp0 e) {
                e.f10092a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4254e, this.f4257h, bArr, 0, i6);
        this.f4259j += this.f4255f;
        this.f4257h = 0;
        this.f4255f = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw rp0.m5887h();
                }
                this.f4259j += i8;
                i6 += i8;
            } catch (rp0 e2) {
                e2.f10092a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: F */
    public final ArrayList m3021F(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f4253d.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw rp0.m5887h();
                }
                this.f4259j += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public final int m3022G() throws rp0 {
        int i = this.f4257h;
        if (this.f4255f - i < 4) {
            m3028M(4);
            i = this.f4257h;
        }
        this.f4257h = i + 4;
        byte[] bArr = this.f4254e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: H */
    public final long m3023H() throws rp0 {
        int i = this.f4257h;
        if (this.f4255f - i < 8) {
            m3028M(8);
            i = this.f4257h;
        }
        this.f4257h = i + 8;
        byte[] bArr = this.f4254e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: I */
    public final int m3024I() {
        int i;
        int i2 = this.f4257h;
        int i3 = this.f4255f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f4254e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f4257h = i4;
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
                this.f4257h = i5;
                return i;
            }
        }
        return (int) m3026K();
    }

    /* JADX INFO: renamed from: J */
    public final long m3025J() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f4257h;
        int i2 = this.f4255f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f4254e;
            byte b = bArr[i];
            if (b >= 0) {
                this.f4257h = i3;
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
                this.f4257h = i4;
                return j;
            }
        }
        return m3026K();
    }

    /* JADX INFO: renamed from: K */
    public final long m3026K() throws rp0 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f4257h == this.f4255f) {
                m3028M(1);
            }
            int i2 = this.f4257h;
            this.f4257h = i2 + 1;
            byte b = this.f4254e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & DerValue.TAG_CONTEXT) == 0) {
                return j;
            }
        }
        throw rp0.m5884e();
    }

    /* JADX INFO: renamed from: L */
    public final void m3027L() {
        int i = this.f4255f + this.f4256g;
        this.f4255f = i;
        int i2 = this.f4259j + i;
        int i3 = this.f4260k;
        if (i2 <= i3) {
            this.f4256g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f4256g = i4;
        this.f4255f = i - i4;
    }

    /* JADX INFO: renamed from: M */
    public final void m3028M(int i) throws rp0 {
        if (m3030O(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f4259j) - this.f4257h) {
            throw rp0.m5887h();
        }
        throw new rp0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: N */
    public final void m3029N(int i) throws rp0 {
        int i2 = this.f4255f;
        int i3 = this.f4257h;
        if (i <= i2 - i3 && i >= 0) {
            this.f4257h = i3 + i;
            return;
        }
        InputStream inputStream = this.f4253d;
        if (i < 0) {
            throw rp0.m5885f();
        }
        int i4 = this.f4259j;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f4260k;
        if (i6 > i7) {
            m3029N((i7 - i4) - i3);
            throw rp0.m5887h();
        }
        this.f4259j = i5;
        int i8 = i2 - i3;
        this.f4255f = 0;
        this.f4257h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (rp0 e) {
                    e.f10092a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f4259j += i8;
                m3027L();
                throw th;
            }
        }
        this.f4259j += i8;
        m3027L();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f4255f;
        int i10 = i9 - this.f4257h;
        this.f4257h = i9;
        m3028M(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f4255f;
            if (i11 <= i12) {
                this.f4257h = i11;
                return;
            } else {
                i10 += i12;
                this.f4257h = i12;
                m3028M(1);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m3030O(int i) throws IOException {
        InputStream inputStream = this.f4253d;
        int i2 = this.f4257h;
        int i3 = i2 + i;
        int i4 = this.f4255f;
        if (i3 <= i4) {
            f40.m2719o(jd0.m3610h(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f4259j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f4260k) {
            byte[] bArr = this.f4254e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f4259j += i2;
                this.f4255f -= i2;
                this.f4257h = 0;
            }
            int i6 = this.f4255f;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f4259j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f4255f += i7;
                    m3027L();
                    if (this.f4255f >= i) {
                        return true;
                    }
                    return m3030O(i);
                }
            } catch (rp0 e) {
                e.f10092a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: a */
    public final void mo2615a(int i) throws rp0 {
        if (this.f4258i != i) {
            throw rp0.m5880a();
        }
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: d */
    public final int mo2616d() {
        return this.f4259j + this.f4257h;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: e */
    public final boolean mo2617e() {
        return this.f4257h == this.f4255f && !m3030O(1);
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: h */
    public final void mo2618h(int i) {
        this.f4260k = i;
        m3027L();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: i */
    public final int mo2619i(int i) throws rp0 {
        if (i < 0) {
            throw rp0.m5885f();
        }
        int i2 = this.f4259j + this.f4257h + i;
        int i3 = this.f4260k;
        if (i2 > i3) {
            throw rp0.m5887h();
        }
        this.f4260k = i2;
        m3027L();
        return i3;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: j */
    public final boolean mo2620j() {
        return m3025J() != 0;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: k */
    public final C0680gk mo2621k() throws IOException {
        int iM3024I = m3024I();
        int i = this.f4255f;
        int i2 = this.f4257h;
        int i3 = i - i2;
        byte[] bArr = this.f4254e;
        if (iM3024I <= i3 && iM3024I > 0) {
            C0680gk c0680gkM3441i = AbstractC0753ik.m3441i(i2, iM3024I, bArr);
            this.f4257h += iM3024I;
            return c0680gkM3441i;
        }
        if (iM3024I == 0) {
            return AbstractC0753ik.f5042b;
        }
        byte[] bArrM3020E = m3020E(iM3024I);
        if (bArrM3020E != null) {
            return AbstractC0753ik.m3441i(0, bArrM3020E.length, bArrM3020E);
        }
        int i4 = this.f4257h;
        int i5 = this.f4255f;
        int length = i5 - i4;
        this.f4259j += i5;
        this.f4257h = 0;
        this.f4255f = 0;
        ArrayList arrayListM3021F = m3021F(iM3024I - length);
        byte[] bArr2 = new byte[iM3024I];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListM3021F.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListM3021F.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0680gk c0680gk = AbstractC0753ik.f5042b;
        return new C0680gk(bArr2);
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: l */
    public final double mo2622l() {
        return Double.longBitsToDouble(m3023H());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: m */
    public final int mo2623m() {
        return m3024I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: n */
    public final int mo2624n() {
        return m3022G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: o */
    public final long mo2625o() {
        return m3023H();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: p */
    public final float mo2626p() {
        return Float.intBitsToFloat(m3022G());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: q */
    public final int mo2627q() {
        return m3024I();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: r */
    public final long mo2628r() {
        return m3025J();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: t */
    public final int mo2629t() {
        return m3022G();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: u */
    public final long mo2630u() {
        return m3023H();
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: v */
    public final int mo2631v() {
        return AbstractC0762ip.m3466b(m3024I());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: w */
    public final long mo2632w() {
        return AbstractC0762ip.m3467c(m3025J());
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: x */
    public final String mo2633x() throws rp0 {
        int iM3024I = m3024I();
        byte[] bArr = this.f4254e;
        if (iM3024I > 0) {
            int i = this.f4255f;
            int i2 = this.f4257h;
            if (iM3024I <= i - i2) {
                String str = new String(bArr, i2, iM3024I, no0.f7481a);
                this.f4257h += iM3024I;
                return str;
            }
        }
        if (iM3024I == 0) {
            return "";
        }
        if (iM3024I > this.f4255f) {
            return new String(m3019D(iM3024I), no0.f7481a);
        }
        m3028M(iM3024I);
        String str2 = new String(bArr, this.f4257h, iM3024I, no0.f7481a);
        this.f4257h += iM3024I;
        return str2;
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: y */
    public final String mo2634y() throws IOException {
        int iM3024I = m3024I();
        int i = this.f4257h;
        int i2 = this.f4255f;
        int i3 = i2 - i;
        byte[] bArrM3019D = this.f4254e;
        if (iM3024I <= i3 && iM3024I > 0) {
            this.f4257h = i + iM3024I;
        } else {
            if (iM3024I == 0) {
                return "";
            }
            i = 0;
            if (iM3024I <= i2) {
                m3028M(iM3024I);
                this.f4257h = iM3024I;
            } else {
                bArrM3019D = m3019D(iM3024I);
            }
        }
        return w42.f11969a.mo5815v(i, iM3024I, bArrM3019D);
    }

    @Override // p000.AbstractC0762ip
    /* JADX INFO: renamed from: z */
    public final int mo2635z() throws rp0 {
        if (mo2617e()) {
            this.f4258i = 0;
            return 0;
        }
        int iM3024I = m3024I();
        this.f4258i = iM3024I;
        if ((iM3024I >>> 3) != 0) {
            return iM3024I;
        }
        throw rp0.m5881b();
    }
}
