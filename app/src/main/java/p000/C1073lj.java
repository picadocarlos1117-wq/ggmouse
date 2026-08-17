package p000;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1073lj implements InterfaceC1334qj, InterfaceC1297pj, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public rq1 f6360a;

    /* JADX INFO: renamed from: b */
    public long f6361b;

    /* JADX INFO: renamed from: A */
    public final rq1 m4189A(int i) {
        if (i < 1 || i > 8192) {
            f40.m2713i("unexpected capacity");
            return null;
        }
        rq1 rq1Var = this.f6360a;
        if (rq1Var == null) {
            rq1 rq1VarM6133b = sq1.m6133b();
            this.f6360a = rq1VarM6133b;
            rq1VarM6133b.f10102g = rq1VarM6133b;
            rq1VarM6133b.f10101f = rq1VarM6133b;
            return rq1VarM6133b;
        }
        rq1 rq1Var2 = rq1Var.f10102g;
        rq1Var2.getClass();
        if (rq1Var2.f10098c + i <= 8192 && rq1Var2.f10100e) {
            return rq1Var2;
        }
        rq1 rq1VarM6133b2 = sq1.m6133b();
        rq1Var2.m5889b(rq1VarM6133b2);
        return rq1VarM6133b2;
    }

    /* JADX INFO: renamed from: B */
    public final void m4190B(C0717hk c0717hk) {
        c0717hk.getClass();
        c0717hk.mo3173n(this, c0717hk.mo3164d());
    }

    /* JADX INFO: renamed from: C */
    public final long m4191C(du1 du1Var) {
        du1Var.getClass();
        long j = 0;
        while (true) {
            long jMo156n = du1Var.mo156n(8192L, this);
            if (jMo156n == -1) {
                return j;
            }
            j += jMo156n;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4192D(int i) {
        rq1 rq1VarM4189A = m4189A(1);
        byte[] bArr = rq1VarM4189A.f10096a;
        int i2 = rq1VarM4189A.f10098c;
        rq1VarM4189A.f10098c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f6361b++;
    }

    /* JADX INFO: renamed from: E */
    public final void m4193E(long j) {
        if (j == 0) {
            m4192D(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        rq1 rq1VarM4189A = m4189A(i);
        byte[] bArr = rq1VarM4189A.f10096a;
        int i2 = rq1VarM4189A.f10098c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0081b.f1101a[(int) (15 & j)];
            j >>>= 4;
        }
        rq1VarM4189A.f10098c += i;
        this.f6361b += (long) i;
    }

    /* JADX INFO: renamed from: F */
    public final void m4194F(int i) {
        rq1 rq1VarM4189A = m4189A(4);
        byte[] bArr = rq1VarM4189A.f10096a;
        int i2 = rq1VarM4189A.f10098c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        rq1VarM4189A.f10098c = i2 + 4;
        this.f6361b += 4;
    }

    /* JADX INFO: renamed from: G */
    public final void m4195G(int i) {
        rq1 rq1VarM4189A = m4189A(2);
        byte[] bArr = rq1VarM4189A.f10096a;
        int i2 = rq1VarM4189A.f10098c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        rq1VarM4189A.f10098c = i2 + 2;
        this.f6361b += 2;
    }

    /* JADX INFO: renamed from: H */
    public final void m4196H(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            f40.m2716l(jd0.m3609g(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            f40.m2716l(AbstractC1308pu.m5338e("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbM5343j = AbstractC1308pu.m5343j(i2, "endIndex > string.length: ", " > ");
            sbM5343j.append(str.length());
            throw new IllegalArgumentException(sbM5343j.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                rq1 rq1VarM4189A = m4189A(1);
                byte[] bArr = rq1VarM4189A.f10096a;
                int i3 = rq1VarM4189A.f10098c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = rq1VarM4189A.f10098c;
                int i6 = (i3 + i) - i5;
                rq1VarM4189A.f10098c = i5 + i6;
                this.f6361b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    rq1 rq1VarM4189A2 = m4189A(2);
                    byte[] bArr2 = rq1VarM4189A2.f10096a;
                    int i7 = rq1VarM4189A2.f10098c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    rq1VarM4189A2.f10098c = i7 + 2;
                    this.f6361b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    rq1 rq1VarM4189A3 = m4189A(3);
                    byte[] bArr3 = rq1VarM4189A3.f10096a;
                    int i8 = rq1VarM4189A3.f10098c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    rq1VarM4189A3.f10098c = i8 + 3;
                    this.f6361b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m4192D(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        rq1 rq1VarM4189A4 = m4189A(4);
                        byte[] bArr4 = rq1VarM4189A4.f10096a;
                        int i11 = rq1VarM4189A4.f10098c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        rq1VarM4189A4.f10098c = i11 + 4;
                        this.f6361b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m4197I(String str) {
        str.getClass();
        m4196H(0, str.length(), str);
    }

    /* JADX INFO: renamed from: J */
    public final void m4198J(int i) {
        String str;
        if (i < 128) {
            m4192D(i);
            return;
        }
        if (i < 2048) {
            rq1 rq1VarM4189A = m4189A(2);
            byte[] bArr = rq1VarM4189A.f10096a;
            int i2 = rq1VarM4189A.f10098c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            rq1VarM4189A.f10098c = i2 + 2;
            this.f6361b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m4192D(63);
            return;
        }
        if (i < 65536) {
            rq1 rq1VarM4189A2 = m4189A(3);
            byte[] bArr2 = rq1VarM4189A2.f10096a;
            int i3 = rq1VarM4189A2.f10098c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            rq1VarM4189A2.f10098c = i3 + 3;
            this.f6361b += 3;
            return;
        }
        if (i <= 1114111) {
            rq1 rq1VarM4189A3 = m4189A(4);
            byte[] bArr3 = rq1VarM4189A3.f10096a;
            int i4 = rq1VarM4189A3.f10098c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            rq1VarM4189A3.f10098c = i4 + 4;
            this.f6361b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = AbstractC1337qm.f9533a;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                f40.m2718n(jd0.m3610h(i5, "startIndex: ", ", endIndex: 8, size: 8"));
                return;
            } else {
                if (i5 > 8) {
                    f40.m2713i(jd0.m3610h(i5, "startIndex: ", " > endIndex: 8"));
                    return;
                }
                str = new String(cArr2, i5, 8 - i5);
            }
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: a */
    public final v02 mo154a() {
        return v02.f11473d;
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: b */
    public final C0717hk mo4199b(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            f40.m2716l(jd0.m3612j("byteCount: ", j));
            return null;
        }
        if (this.f6361b < j) {
            f40.m2708d();
            return null;
        }
        if (j < 4096) {
            return new C0717hk(m4211p(j));
        }
        C0717hk c0717hkM4219z = m4219z((int) j);
        skip(j);
        return c0717hkM4219z;
    }

    /* JADX INFO: renamed from: c */
    public final void m4200c() throws EOFException {
        skip(this.f6361b);
    }

    public final Object clone() {
        C1073lj c1073lj = new C1073lj();
        if (this.f6361b == 0) {
            return c1073lj;
        }
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        rq1 rq1VarM5890c = rq1Var.m5890c();
        c1073lj.f6360a = rq1VarM5890c;
        rq1VarM5890c.f10102g = rq1VarM5890c;
        rq1VarM5890c.f10101f = rq1VarM5890c;
        for (rq1 rq1Var2 = rq1Var.f10101f; rq1Var2 != rq1Var; rq1Var2 = rq1Var2.f10101f) {
            rq1 rq1Var3 = rq1VarM5890c.f10102g;
            rq1Var3.getClass();
            rq1Var2.getClass();
            rq1Var3.m5889b(rq1Var2.m5890c());
        }
        c1073lj.f6361b = this.f6361b;
        return c1073lj;
    }

    /* JADX INFO: renamed from: d */
    public final long m4201d() {
        long j = this.f6361b;
        if (j == 0) {
            return 0L;
        }
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        rq1 rq1Var2 = rq1Var.f10102g;
        rq1Var2.getClass();
        int i = rq1Var2.f10098c;
        return (i >= 8192 || !rq1Var2.f10100e) ? j : j - ((long) (i - rq1Var2.f10097b));
    }

    /* JADX INFO: renamed from: e */
    public final void m4202e(C1073lj c1073lj, long j, long j2) {
        c1073lj.getClass();
        long j3 = j;
        ua0.m6451h(this.f6361b, j3, j2);
        if (j2 == 0) {
            return;
        }
        c1073lj.f6361b += j2;
        rq1 rq1Var = this.f6360a;
        while (true) {
            rq1Var.getClass();
            long j4 = rq1Var.f10098c - rq1Var.f10097b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            rq1Var = rq1Var.f10101f;
        }
        long j5 = j2;
        while (j5 > 0) {
            rq1Var.getClass();
            rq1 rq1VarM5890c = rq1Var.m5890c();
            int i = rq1VarM5890c.f10097b + ((int) j3);
            rq1VarM5890c.f10097b = i;
            rq1VarM5890c.f10098c = Math.min(i + ((int) j5), rq1VarM5890c.f10098c);
            rq1 rq1Var2 = c1073lj.f6360a;
            if (rq1Var2 == null) {
                rq1VarM5890c.f10102g = rq1VarM5890c;
                rq1VarM5890c.f10101f = rq1VarM5890c;
                c1073lj.f6360a = rq1VarM5890c;
            } else {
                rq1 rq1Var3 = rq1Var2.f10102g;
                rq1Var3.getClass();
                rq1Var3.m5889b(rq1VarM5890c);
            }
            j5 -= (long) (rq1VarM5890c.f10098c - rq1VarM5890c.f10097b);
            rq1Var = rq1Var.f10101f;
            j3 = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1073lj)) {
            return false;
        }
        long j = this.f6361b;
        C1073lj c1073lj = (C1073lj) obj;
        if (j != c1073lj.f6361b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        rq1 rq1Var2 = c1073lj.f6360a;
        rq1Var2.getClass();
        int i = rq1Var.f10097b;
        int i2 = rq1Var2.f10097b;
        long j2 = 0;
        while (j2 < this.f6361b) {
            long jMin = Math.min(rq1Var.f10098c - i, rq1Var2.f10098c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (rq1Var.f10096a[i] != rq1Var2.f10096a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == rq1Var.f10098c) {
                rq1Var = rq1Var.f10101f;
                rq1Var.getClass();
                i = rq1Var.f10097b;
            }
            if (i2 == rq1Var2.f10098c) {
                rq1Var2 = rq1Var2.f10101f;
                rq1Var2.getClass();
                i2 = rq1Var2.f10097b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: f */
    public final String mo4203f(long j) throws EOFException {
        if (j < 0) {
            f40.m2716l(jd0.m3612j("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM4210o = m4210o((byte) 10, 0L, j2);
        if (jM4210o != -1) {
            return AbstractC0081b.m797a(jM4210o, this);
        }
        if (j2 < this.f6361b && m4208l(j2 - 1) == 13 && m4208l(j2) == 10) {
            return AbstractC0081b.m797a(j2, this);
        }
        C1073lj c1073lj = new C1073lj();
        m4202e(c1073lj, 0L, Math.min(32L, this.f6361b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f6361b, j) + " content=" + c1073lj.mo4199b(c1073lj.f6361b).mo3165e() + (char) 8230);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4204g() {
        return this.f6361b == 0;
    }

    @Override // p000.InterfaceC1297pj
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ InterfaceC1297pj mo4205h(String str) {
        m4197I(str);
        return this;
    }

    public final int hashCode() {
        rq1 rq1Var = this.f6360a;
        if (rq1Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = rq1Var.f10098c;
            for (int i3 = rq1Var.f10097b; i3 < i2; i3++) {
                i = (i * 31) + rq1Var.f10096a[i3];
            }
            rq1Var = rq1Var.f10101f;
            rq1Var.getClass();
        } while (rq1Var != this.f6360a);
        return i;
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: i */
    public final String mo4206i(Charset charset) {
        charset.getClass();
        return m4213s(this.f6361b, charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p000.InterfaceC1297pj
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1297pj mo4207k(long j) {
        m4193E(j);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final byte m4208l(long j) {
        ua0.m6451h(this.f6361b, j, 1L);
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        long j2 = this.f6361b;
        if (j2 - j < j) {
            while (j2 > j) {
                rq1Var = rq1Var.f10102g;
                rq1Var.getClass();
                j2 -= (long) (rq1Var.f10098c - rq1Var.f10097b);
            }
            return rq1Var.f10096a[(int) ((((long) rq1Var.f10097b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = rq1Var.f10098c;
            int i2 = rq1Var.f10097b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return rq1Var.f10096a[(int) ((((long) i2) + j) - j3)];
            }
            rq1Var = rq1Var.f10101f;
            rq1Var.getClass();
            j3 = j4;
        }
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: m */
    public final String mo4209m() {
        return mo4203f(Long.MAX_VALUE);
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: n */
    public final long mo156n(long j, C1073lj c1073lj) {
        c1073lj.getClass();
        if (j < 0) {
            f40.m2716l(jd0.m3612j("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.f6361b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c1073lj.mo956q(j, this);
        return j;
    }

    /* JADX INFO: renamed from: o */
    public final long m4210o(byte b, long j, long j2) {
        rq1 rq1Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f6361b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f6361b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (rq1Var = this.f6360a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                rq1Var = rq1Var.f10102g;
                rq1Var.getClass();
                j4 -= (long) (rq1Var.f10098c - rq1Var.f10097b);
            }
            while (j4 < j2) {
                byte[] bArr = rq1Var.f10096a;
                int iMin = (int) Math.min(rq1Var.f10098c, (((long) rq1Var.f10097b) + j2) - j4);
                for (int i = (int) ((((long) rq1Var.f10097b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - rq1Var.f10097b)) + j4;
                    }
                }
                j4 += (long) (rq1Var.f10098c - rq1Var.f10097b);
                rq1Var = rq1Var.f10101f;
                rq1Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (rq1Var.f10098c - rq1Var.f10097b)) + j3;
            if (j5 > j) {
                break;
            }
            rq1Var = rq1Var.f10101f;
            rq1Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = rq1Var.f10096a;
            int iMin2 = (int) Math.min(rq1Var.f10098c, (((long) rq1Var.f10097b) + j2) - j3);
            for (int i2 = (int) ((((long) rq1Var.f10097b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - rq1Var.f10097b)) + j3;
                }
            }
            j3 += (long) (rq1Var.f10098c - rq1Var.f10097b);
            rq1Var = rq1Var.f10101f;
            rq1Var.getClass();
            j = j3;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: p */
    public final byte[] m4211p(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            f40.m2716l(jd0.m3612j("byteCount: ", j));
            return null;
        }
        if (this.f6361b < j) {
            f40.m2708d();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        m4212r(bArr);
        return bArr;
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: q */
    public final void mo956q(long j, C1073lj c1073lj) {
        rq1 rq1VarM6133b;
        c1073lj.getClass();
        if (c1073lj == this) {
            f40.m2713i("source == this");
            return;
        }
        ua0.m6451h(c1073lj.f6361b, 0L, j);
        while (j > 0) {
            rq1 rq1Var = c1073lj.f6360a;
            rq1Var.getClass();
            int i = rq1Var.f10098c;
            rq1 rq1Var2 = c1073lj.f6360a;
            rq1Var2.getClass();
            long j2 = i - rq1Var2.f10097b;
            int i2 = 0;
            if (j < j2) {
                rq1 rq1Var3 = this.f6360a;
                rq1 rq1Var4 = rq1Var3 != null ? rq1Var3.f10102g : null;
                if (rq1Var4 != null && rq1Var4.f10100e) {
                    if ((((long) rq1Var4.f10098c) + j) - ((long) (rq1Var4.f10099d ? 0 : rq1Var4.f10097b)) <= 8192) {
                        rq1 rq1Var5 = c1073lj.f6360a;
                        rq1Var5.getClass();
                        rq1Var5.m5891d(rq1Var4, (int) j);
                        c1073lj.f6361b -= j;
                        this.f6361b += j;
                        return;
                    }
                }
                rq1 rq1Var6 = c1073lj.f6360a;
                rq1Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > rq1Var6.f10098c - rq1Var6.f10097b) {
                    f40.m2713i("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    rq1VarM6133b = rq1Var6.m5890c();
                } else {
                    rq1VarM6133b = sq1.m6133b();
                    byte[] bArr = rq1Var6.f10096a;
                    byte[] bArr2 = rq1VarM6133b.f10096a;
                    int i4 = rq1Var6.f10097b;
                    AbstractC1064la.m4153n0(bArr, 0, i4, bArr2, i4 + i3);
                }
                rq1VarM6133b.f10098c = rq1VarM6133b.f10097b + i3;
                rq1Var6.f10097b += i3;
                rq1 rq1Var7 = rq1Var6.f10102g;
                rq1Var7.getClass();
                rq1Var7.m5889b(rq1VarM6133b);
                c1073lj.f6360a = rq1VarM6133b;
            }
            rq1 rq1Var8 = c1073lj.f6360a;
            rq1Var8.getClass();
            long j3 = rq1Var8.f10098c - rq1Var8.f10097b;
            c1073lj.f6360a = rq1Var8.m5888a();
            rq1 rq1Var9 = this.f6360a;
            if (rq1Var9 == null) {
                this.f6360a = rq1Var8;
                rq1Var8.f10102g = rq1Var8;
                rq1Var8.f10101f = rq1Var8;
            } else {
                rq1 rq1Var10 = rq1Var9.f10102g;
                rq1Var10.getClass();
                rq1Var10.m5889b(rq1Var8);
                rq1 rq1Var11 = rq1Var8.f10102g;
                if (rq1Var11 == rq1Var8) {
                    f40.m2719o("cannot compact");
                    return;
                }
                rq1Var11.getClass();
                if (rq1Var11.f10100e) {
                    int i5 = rq1Var8.f10098c - rq1Var8.f10097b;
                    rq1 rq1Var12 = rq1Var8.f10102g;
                    rq1Var12.getClass();
                    int i6 = 8192 - rq1Var12.f10098c;
                    rq1 rq1Var13 = rq1Var8.f10102g;
                    rq1Var13.getClass();
                    if (!rq1Var13.f10099d) {
                        rq1 rq1Var14 = rq1Var8.f10102g;
                        rq1Var14.getClass();
                        i2 = rq1Var14.f10097b;
                    }
                    if (i5 <= i6 + i2) {
                        rq1 rq1Var15 = rq1Var8.f10102g;
                        rq1Var15.getClass();
                        rq1Var8.m5891d(rq1Var15, i5);
                        rq1Var8.m5888a();
                        sq1.m6132a(rq1Var8);
                    }
                }
            }
            c1073lj.f6361b -= j3;
            this.f6361b += j3;
            j -= j3;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4212r(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                f40.m2708d();
                return;
            }
            i += i2;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ua0.m6451h(bArr.length, i, i2);
        rq1 rq1Var = this.f6360a;
        if (rq1Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, rq1Var.f10098c - rq1Var.f10097b);
        byte[] bArr2 = rq1Var.f10096a;
        int i3 = rq1Var.f10097b;
        AbstractC1064la.m4153n0(bArr2, i, i3, bArr, i3 + iMin);
        int i4 = rq1Var.f10097b + iMin;
        rq1Var.f10097b = i4;
        this.f6361b -= (long) iMin;
        if (i4 == rq1Var.f10098c) {
            this.f6360a = rq1Var.m5888a();
            sq1.m6132a(rq1Var);
        }
        return iMin;
    }

    @Override // p000.InterfaceC1334qj
    public final byte readByte() throws EOFException {
        if (this.f6361b == 0) {
            f40.m2708d();
            return (byte) 0;
        }
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        int i = rq1Var.f10097b;
        int i2 = rq1Var.f10098c;
        int i3 = i + 1;
        byte b = rq1Var.f10096a[i];
        this.f6361b--;
        if (i3 != i2) {
            rq1Var.f10097b = i3;
            return b;
        }
        this.f6360a = rq1Var.m5888a();
        sq1.m6132a(rq1Var);
        return b;
    }

    @Override // p000.InterfaceC1334qj
    public final int readInt() throws EOFException {
        if (this.f6361b < 4) {
            f40.m2708d();
            return 0;
        }
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        int i = rq1Var.f10097b;
        int i2 = rq1Var.f10098c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = rq1Var.f10096a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f6361b -= 4;
        if (i5 != i2) {
            rq1Var.f10097b = i5;
            return i6;
        }
        this.f6360a = rq1Var.m5888a();
        sq1.m6132a(rq1Var);
        return i6;
    }

    @Override // p000.InterfaceC1334qj
    public final short readShort() throws EOFException {
        if (this.f6361b < 2) {
            f40.m2708d();
            return (short) 0;
        }
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        int i = rq1Var.f10097b;
        int i2 = rq1Var.f10098c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = rq1Var.f10096a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f6361b -= 2;
        if (i5 == i2) {
            this.f6360a = rq1Var.m5888a();
            sq1.m6132a(rq1Var);
        } else {
            rq1Var.f10097b = i5;
        }
        return (short) i6;
    }

    /* JADX INFO: renamed from: s */
    public final String m4213s(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            f40.m2716l(jd0.m3612j("byteCount: ", j));
            return null;
        }
        if (this.f6361b < j) {
            f40.m2708d();
            return null;
        }
        if (j == 0) {
            return "";
        }
        rq1 rq1Var = this.f6360a;
        rq1Var.getClass();
        int i = rq1Var.f10097b;
        if (((long) i) + j > rq1Var.f10098c) {
            return new String(m4211p(j), charset);
        }
        int i2 = (int) j;
        String str = new String(rq1Var.f10096a, i, i2, charset);
        int i3 = rq1Var.f10097b + i2;
        rq1Var.f10097b = i3;
        this.f6361b -= j;
        if (i3 == rq1Var.f10098c) {
            this.f6360a = rq1Var.m5888a();
            sq1.m6132a(rq1Var);
        }
        return str;
    }

    @Override // p000.InterfaceC1334qj
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            rq1 rq1Var = this.f6360a;
            if (rq1Var == null) {
                f40.m2708d();
                return;
            }
            int iMin = (int) Math.min(j, rq1Var.f10098c - rq1Var.f10097b);
            long j2 = iMin;
            this.f6361b -= j2;
            j -= j2;
            int i = rq1Var.f10097b + iMin;
            rq1Var.f10097b = i;
            if (i == rq1Var.f10098c) {
                this.f6360a = rq1Var.m5888a();
                sq1.m6132a(rq1Var);
            }
        }
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: t */
    public final void mo4214t(long j) throws EOFException {
        if (this.f6361b >= j) {
            return;
        }
        f40.m2708d();
    }

    public final String toString() {
        return m4218y().toString();
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: v */
    public final long mo4215v() throws EOFException {
        int i;
        if (this.f6361b == 0) {
            f40.m2708d();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            rq1 rq1Var = this.f6360a;
            rq1Var.getClass();
            byte[] bArr = rq1Var.f10096a;
            int i3 = rq1Var.f10097b;
            int i4 = rq1Var.f10098c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = AbstractC1337qm.f9533a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C1073lj c1073lj = new C1073lj();
                    c1073lj.m4193E(j);
                    c1073lj.m4192D(b);
                    throw new NumberFormatException("Number too large: ".concat(c1073lj.m4217x()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f6360a = rq1Var.m5888a();
                sq1.m6132a(rq1Var);
            } else {
                rq1Var.f10097b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f6360a != null);
        this.f6361b -= (long) i2;
        return j;
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: w */
    public final boolean mo4216w(C0717hk c0717hk) {
        c0717hk.getClass();
        int iMo3164d = c0717hk.mo3164d();
        if (iMo3164d >= 0 && this.f6361b >= iMo3164d && c0717hk.mo3164d() >= iMo3164d) {
            for (int i = 0; i < iMo3164d; i++) {
                if (m4208l(i) == c0717hk.mo3167g(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        ua0.m6451h(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            rq1 rq1VarM4189A = m4189A(1);
            int iMin = Math.min(i3 - i, 8192 - rq1VarM4189A.f10098c);
            int i4 = i + iMin;
            AbstractC1064la.m4153n0(bArr, rq1VarM4189A.f10098c, i, rq1VarM4189A.f10096a, i4);
            rq1VarM4189A.f10098c += iMin;
            i = i4;
        }
        this.f6361b += j;
    }

    @Override // p000.InterfaceC1297pj
    public final /* bridge */ /* synthetic */ InterfaceC1297pj writeByte(int i) {
        m4192D(i);
        return this;
    }

    @Override // p000.InterfaceC1297pj
    public final /* bridge */ /* synthetic */ InterfaceC1297pj writeInt(int i) {
        m4194F(i);
        return this;
    }

    @Override // p000.InterfaceC1297pj
    public final /* bridge */ /* synthetic */ InterfaceC1297pj writeShort(int i) {
        m4195G(i);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final String m4217x() {
        return m4213s(this.f6361b, AbstractC0609en.f3387a);
    }

    /* JADX INFO: renamed from: y */
    public final C0717hk m4218y() {
        long j = this.f6361b;
        if (j <= 2147483647L) {
            return m4219z((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f6361b).toString());
    }

    /* JADX INFO: renamed from: z */
    public final C0717hk m4219z(int i) {
        if (i == 0) {
            return C0717hk.f4607d;
        }
        ua0.m6451h(this.f6361b, 0L, i);
        rq1 rq1Var = this.f6360a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            rq1Var.getClass();
            int i5 = rq1Var.f10098c;
            int i6 = rq1Var.f10097b;
            if (i5 == i6) {
                f40.m2711g("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            rq1Var = rq1Var.f10101f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        rq1 rq1Var2 = this.f6360a;
        int i7 = 0;
        while (i2 < i) {
            rq1Var2.getClass();
            bArr[i7] = rq1Var2.f10096a;
            i2 += rq1Var2.f10098c - rq1Var2.f10097b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = rq1Var2.f10097b;
            rq1Var2.f10099d = true;
            i7++;
            rq1Var2 = rq1Var2.f10101f;
        }
        return new tq1(bArr, iArr);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            rq1 rq1VarM4189A = m4189A(1);
            int iMin = Math.min(i, 8192 - rq1VarM4189A.f10098c);
            byteBuffer.get(rq1VarM4189A.f10096a, rq1VarM4189A.f10098c, iMin);
            i -= iMin;
            rq1VarM4189A.f10098c += iMin;
        }
        this.f6361b += (long) iRemaining;
        return iRemaining;
    }

    @Override // p000.InterfaceC1297pj
    public final InterfaceC1297pj write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        rq1 rq1Var = this.f6360a;
        if (rq1Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), rq1Var.f10098c - rq1Var.f10097b);
        byteBuffer.put(rq1Var.f10096a, rq1Var.f10097b, iMin);
        int i = rq1Var.f10097b + iMin;
        rq1Var.f10097b = i;
        this.f6361b -= (long) iMin;
        if (i == rq1Var.f10098c) {
            this.f6360a = rq1Var.m5888a();
            sq1.m6132a(rq1Var);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.ft1
    public final void close() {
    }

    @Override // p000.InterfaceC1297pj, p000.ft1, java.io.Flushable
    public final void flush() {
    }
}
