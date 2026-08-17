package p000;

import android.sun.security.util.DerValue;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 {

    /* JADX INFO: renamed from: d */
    public static final char[] f2879d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f2880e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final tm0 f2881f = tm0.m6291m(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a */
    public byte[] f2882a;

    /* JADX INFO: renamed from: b */
    public int f2883b;

    /* JADX INFO: renamed from: c */
    public int f2884c;

    public dc1(int i) {
        this.f2882a = new byte[i];
        this.f2884c = i;
    }

    /* JADX INFO: renamed from: A */
    public final long m2311A() {
        int i;
        int i2;
        long j = this.f2882a[this.f2883b];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException(jd0.m3612j("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f2882a[this.f2883b + i];
            if ((b & DerValue.TAG_PRIVATE) != 128) {
                throw new NumberFormatException(jd0.m3612j("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f2883b += i2;
        return j;
    }

    /* JADX INFO: renamed from: B */
    public final Charset m2312B() {
        if (m2318a() >= 3) {
            byte[] bArr = this.f2882a;
            int i = this.f2883b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f2883b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m2318a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f2882a;
        int i2 = this.f2883b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f2883b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f2883b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: C */
    public final void m2313C(int i) {
        byte[] bArr = this.f2882a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m2314D(i, bArr);
    }

    /* JADX INFO: renamed from: D */
    public final void m2314D(int i, byte[] bArr) {
        this.f2882a = bArr;
        this.f2884c = i;
        this.f2883b = 0;
    }

    /* JADX INFO: renamed from: E */
    public final void m2315E(int i) {
        ki0.m3857c(i >= 0 && i <= this.f2882a.length);
        this.f2884c = i;
    }

    /* JADX INFO: renamed from: F */
    public final void m2316F(int i) {
        ki0.m3857c(i >= 0 && i <= this.f2884c);
        this.f2883b = i;
    }

    /* JADX INFO: renamed from: G */
    public final void m2317G(int i) {
        m2316F(this.f2883b + i);
    }

    /* JADX INFO: renamed from: a */
    public final int m2318a() {
        return this.f2884c - this.f2883b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2319b(int i) {
        byte[] bArr = this.f2882a;
        if (i > bArr.length) {
            this.f2882a = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final char m2320c(Charset charset) {
        ki0.m3859d(f2881f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m2321d(charset) >> 16);
    }

    /* JADX INFO: renamed from: d */
    public final int m2321d(Charset charset) {
        byte b;
        int i;
        byte b2;
        byte b3;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && m2318a() >= 1) {
            long j = this.f2882a[this.f2883b] & 255;
            char c = (char) j;
            p32.m5173j("Out of range: %s", j, ((long) c) == j);
            b = (byte) c;
            i = 1;
        } else {
            i = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && m2318a() >= 2) {
                byte[] bArr = this.f2882a;
                int i2 = this.f2883b;
                b2 = bArr[i2];
                b3 = bArr[i2 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || m2318a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f2882a;
                int i3 = this.f2883b;
                b2 = bArr2[i3 + 1];
                b3 = bArr2[i3];
            }
            b = (byte) ((char) ((b3 & 255) | (b2 << 8)));
        }
        long j2 = b;
        char c2 = (char) j2;
        p32.m5173j("Out of range: %s", j2, ((long) c2) == j2);
        return (c2 << 16) + i;
    }

    /* JADX INFO: renamed from: e */
    public final void m2322e(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f2882a, this.f2883b, bArr, i, i2);
        this.f2883b += i2;
    }

    /* JADX INFO: renamed from: f */
    public final char m2323f(Charset charset, char[] cArr) {
        int iM2321d = m2321d(charset);
        if (iM2321d != 0) {
            char c = (char) (iM2321d >> 16);
            for (char c2 : cArr) {
                if (c2 == c) {
                    this.f2883b += iM2321d & 65535;
                    return c;
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m2324g() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f2883b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f2883b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f2883b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf A[ADDED_TO_REGION, EDGE_INSN: B:65:0x00bf->B:55:0x00bf BREAK  A[LOOP:0: B:25:0x005b->B:53:0x00bc], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[ADDED_TO_REGION, EDGE_INSN: B:67:0x00bf->B:55:0x00bf BREAK  A[LOOP:0: B:25:0x005b->B:53:0x00bc], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final String m2325h(Charset charset) {
        int i;
        byte[] bArr;
        byte b;
        byte[] bArr2;
        byte b2;
        ki0.m3859d(f2881f.contains(charset), "Unsupported charset: " + charset);
        if (m2318a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m2312B();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                l41.m4038g(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.f2883b;
        while (true) {
            int i3 = this.f2884c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b3 = this.f2882a[i2];
                int i4 = z42.f13274a;
                if (b3 == 10 || b3 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f2882a;
                    if (bArr[i2] == 0) {
                        b = bArr[i2 + 1];
                        int i5 = z42.f13274a;
                        if (b != 10 || b == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f2882a;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                int i6 = z42.f13274a;
                                if (b2 != 10 || b2 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2 += i;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f2882a;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                int i7 = z42.f13274a;
                                if (b2 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i2 += i;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f2882a;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            int i8 = z42.f13274a;
                            if (b2 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i2 += i;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f2882a;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    int i9 = z42.f13274a;
                    if (b != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f2882a;
                    if (bArr2[i2 + 1] == 0) {
                        b2 = bArr2[i2];
                        int i10 = z42.f13274a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i2 += i;
            } else {
                bArr = this.f2882a;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    int i11 = z42.f13274a;
                    if (b != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f2882a;
                    if (bArr2[i2 + 1] == 0) {
                        b2 = bArr2[i2];
                        int i12 = z42.f13274a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i2 += i;
            }
        }
        String strM2335r = m2335r(i2 - this.f2883b, charset);
        if (this.f2883b != this.f2884c && m2323f(charset, f2879d) == '\r') {
            m2323f(charset, f2880e);
        }
        return strM2335r;
    }

    /* JADX INFO: renamed from: i */
    public final int m2326i() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f2883b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f2883b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f2883b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: j */
    public final long m2327j() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f2883b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f2883b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f2883b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f2883b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f2883b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f2883b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f2883b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: k */
    public final long m2328k() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f2883b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f2883b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f2883b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: l */
    public final int m2329l() {
        int iM2326i = m2326i();
        if (iM2326i >= 0) {
            return iM2326i;
        }
        f40.m2719o(jd0.m3609g(iM2326i, "Top bit not zero: "));
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m2330m() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        int i3 = bArr[i] & 255;
        this.f2883b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: n */
    public final long m2331n() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f2883b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f2883b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f2883b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f2883b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f2883b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f2883b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f2883b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: o */
    public final String m2332o() {
        if (m2318a() == 0) {
            return null;
        }
        int i = this.f2883b;
        while (i < this.f2884c && this.f2882a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f2882a;
        int i2 = this.f2883b;
        int i3 = z42.f13274a;
        String str = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f2883b = i;
        if (i < this.f2884c) {
            this.f2883b = i + 1;
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public final String m2333p(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f2883b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f2884c || this.f2882a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f2882a;
        int i5 = z42.f13274a;
        String str = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f2883b += i;
        return str;
    }

    /* JADX INFO: renamed from: q */
    public final short m2334q() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f2883b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: r */
    public final String m2335r(int i, Charset charset) {
        String str = new String(this.f2882a, this.f2883b, i, charset);
        this.f2883b += i;
        return str;
    }

    /* JADX INFO: renamed from: s */
    public final int m2336s() {
        return m2337t() | (m2337t() << 21) | (m2337t() << 14) | (m2337t() << 7);
    }

    /* JADX INFO: renamed from: t */
    public final int m2337t() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        this.f2883b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: u */
    public final int m2338u() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f2883b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f2883b = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: v */
    public final long m2339v() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f2883b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f2883b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f2883b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: w */
    public final int m2340w() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f2883b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f2883b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: x */
    public final int m2341x() {
        int iM2324g = m2324g();
        if (iM2324g >= 0) {
            return iM2324g;
        }
        f40.m2719o(jd0.m3609g(iM2324g, "Top bit not zero: "));
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public final long m2342y() {
        long jM2331n = m2331n();
        if (jM2331n >= 0) {
            return jM2331n;
        }
        f40.m2719o(jd0.m3612j("Top bit not zero: ", jM2331n));
        return 0L;
    }

    /* JADX INFO: renamed from: z */
    public final int m2343z() {
        byte[] bArr = this.f2882a;
        int i = this.f2883b;
        int i2 = i + 1;
        this.f2883b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f2883b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public dc1() {
        this.f2882a = z42.f13279f;
    }

    public dc1(byte[] bArr) {
        this.f2882a = bArr;
        this.f2884c = bArr.length;
    }

    public dc1(byte[] bArr, int i) {
        this.f2882a = bArr;
        this.f2884c = i;
    }
}
