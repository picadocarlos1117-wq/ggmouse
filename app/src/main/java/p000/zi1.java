package p000;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class zi1 implements InterfaceC1334qj {

    /* JADX INFO: renamed from: a */
    public final du1 f13425a;

    /* JADX INFO: renamed from: b */
    public final C1073lj f13426b;

    /* JADX INFO: renamed from: c */
    public boolean f13427c;

    public zi1(du1 du1Var) {
        du1Var.getClass();
        this.f13425a = du1Var;
        this.f13426b = new C1073lj();
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: a */
    public final v02 mo154a() {
        return this.f13425a.mo154a();
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: b */
    public final C0717hk mo4199b(long j) throws EOFException {
        mo4214t(j);
        return this.f13426b.mo4199b(j);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7310c() {
        if (this.f13427c) {
            f40.m2719o("closed");
            return false;
        }
        C1073lj c1073lj = this.f13426b;
        return c1073lj.m4204g() && this.f13425a.mo156n(8192L, c1073lj) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f13427c) {
            return;
        }
        this.f13427c = true;
        this.f13425a.close();
        this.f13426b.m4200c();
    }

    /* JADX INFO: renamed from: d */
    public final long m7311d(byte b, long j, long j2) {
        if (this.f13427c) {
            f40.m2719o("closed");
            return 0L;
        }
        if (0 > j2) {
            f40.m2716l(jd0.m3612j("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            C1073lj c1073lj = this.f13426b;
            byte b2 = b;
            long j3 = j2;
            long jM4210o = c1073lj.m4210o(b2, jMax, j3);
            if (jM4210o != -1) {
                return jM4210o;
            }
            long j4 = c1073lj.f6361b;
            if (j4 >= j3 || this.f13425a.mo156n(8192L, c1073lj) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public final void m7312e(byte[] bArr) throws EOFException {
        C1073lj c1073lj = this.f13426b;
        bArr.getClass();
        try {
            mo4214t(bArr.length);
            c1073lj.m4212r(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c1073lj.f6361b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = c1073lj.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: f */
    public final String mo4203f(long j) throws EOFException {
        if (j < 0) {
            f40.m2716l(jd0.m3612j("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM7311d = m7311d((byte) 10, 0L, j2);
        C1073lj c1073lj = this.f13426b;
        if (jM7311d != -1) {
            return AbstractC0081b.m797a(jM7311d, c1073lj);
        }
        if (j2 < Long.MAX_VALUE && m7314j(j2) && c1073lj.m4208l(j2 - 1) == 13 && m7314j(j2 + 1) && c1073lj.m4208l(j2) == 10) {
            return AbstractC0081b.m797a(j2, c1073lj);
        }
        C1073lj c1073lj2 = new C1073lj();
        c1073lj.m4202e(c1073lj2, 0L, Math.min(32L, c1073lj.f6361b));
        throw new EOFException("\\n not found: limit=" + Math.min(c1073lj.f6361b, j) + " content=" + c1073lj2.mo4199b(c1073lj2.f6361b).mo3165e() + (char) 8230);
    }

    /* JADX INFO: renamed from: g */
    public final int m7313g() throws EOFException {
        mo4214t(4L);
        int i = this.f13426b.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: i */
    public final String mo4206i(Charset charset) {
        charset.getClass();
        du1 du1Var = this.f13425a;
        C1073lj c1073lj = this.f13426b;
        c1073lj.m4191C(du1Var);
        return c1073lj.m4213s(c1073lj.f6361b, charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13427c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7314j(long j) {
        C1073lj c1073lj;
        if (j < 0) {
            f40.m2716l(jd0.m3612j("byteCount < 0: ", j));
            return false;
        }
        if (this.f13427c) {
            f40.m2719o("closed");
            return false;
        }
        do {
            c1073lj = this.f13426b;
            if (c1073lj.f6361b >= j) {
                return true;
            }
        } while (this.f13425a.mo156n(8192L, c1073lj) != -1);
        return false;
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
        if (this.f13427c) {
            f40.m2719o("closed");
            return 0L;
        }
        C1073lj c1073lj2 = this.f13426b;
        if (c1073lj2.f6361b == 0 && this.f13425a.mo156n(8192L, c1073lj2) == -1) {
            return -1L;
        }
        return c1073lj2.mo156n(Math.min(j, c1073lj2.f6361b), c1073lj);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C1073lj c1073lj = this.f13426b;
        if (c1073lj.f6361b == 0 && this.f13425a.mo156n(8192L, c1073lj) == -1) {
            return -1;
        }
        return c1073lj.read(byteBuffer);
    }

    @Override // p000.InterfaceC1334qj
    public final byte readByte() throws EOFException {
        mo4214t(1L);
        return this.f13426b.readByte();
    }

    @Override // p000.InterfaceC1334qj
    public final int readInt() throws EOFException {
        mo4214t(4L);
        return this.f13426b.readInt();
    }

    @Override // p000.InterfaceC1334qj
    public final short readShort() throws EOFException {
        mo4214t(2L);
        return this.f13426b.readShort();
    }

    @Override // p000.InterfaceC1334qj
    public final void skip(long j) throws EOFException {
        if (this.f13427c) {
            f40.m2719o("closed");
            return;
        }
        while (j > 0) {
            C1073lj c1073lj = this.f13426b;
            if (c1073lj.f6361b == 0 && this.f13425a.mo156n(8192L, c1073lj) == -1) {
                f40.m2708d();
                return;
            } else {
                long jMin = Math.min(j, c1073lj.f6361b);
                c1073lj.skip(jMin);
                j -= jMin;
            }
        }
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: t */
    public final void mo4214t(long j) throws EOFException {
        if (m7314j(j)) {
            return;
        }
        f40.m2708d();
    }

    public final String toString() {
        return "buffer(" + this.f13425a + ')';
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: v */
    public final long mo4215v() throws EOFException {
        C1073lj c1073lj;
        mo4214t(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM7314j = m7314j(i2);
            c1073lj = this.f13426b;
            if (!zM7314j) {
                break;
            }
            byte bM4208l = c1073lj.m4208l(i);
            if ((bM4208l < 48 || bM4208l > 57) && ((bM4208l < 97 || bM4208l > 102) && (bM4208l < 65 || bM4208l > 70))) {
                if (i != 0) {
                    break;
                }
                hr1.m3270f(16);
                hr1.m3270f(16);
                String string = Integer.toString(bM4208l, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return c1073lj.mo4215v();
    }

    @Override // p000.InterfaceC1334qj
    /* JADX INFO: renamed from: w */
    public final boolean mo4216w(C0717hk c0717hk) {
        c0717hk.getClass();
        int iMo3164d = c0717hk.mo3164d();
        if (this.f13427c) {
            f40.m2719o("closed");
            return false;
        }
        if (iMo3164d >= 0 && c0717hk.mo3164d() >= iMo3164d) {
            for (int i = 0; i < iMo3164d; i++) {
                long j = i;
                if (m7314j(1 + j) && this.f13426b.m4208l(j) == c0717hk.mo3167g(i)) {
                }
            }
            return true;
        }
        return false;
    }
}
