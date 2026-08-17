package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r41 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final int f9719a;

    /* JADX INFO: renamed from: b */
    public final kv1 f9720b;

    /* JADX INFO: renamed from: c */
    public long f9721c;

    /* JADX INFO: renamed from: d */
    public long f9722d;

    /* JADX INFO: renamed from: e */
    public long f9723e;

    public r41(InputStream inputStream, int i, kv1 kv1Var) {
        super(inputStream);
        this.f9723e = -1L;
        this.f9719a = i;
        this.f9720b = kv1Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m5699c() {
        long j = this.f9722d;
        long j2 = this.f9721c;
        if (j > j2) {
            long j3 = j - j2;
            for (rc2 rc2Var : this.f9720b.f6043a) {
                rc2Var.mo4520R(j3);
            }
            this.f9721c = this.f9722d;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5700d() {
        long j = this.f9722d;
        int i = this.f9719a;
        if (j <= i) {
            return;
        }
        throw new qv1(nv1.f7556k.m4614g("Decompressed gRPC message exceeds maximum size " + i));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f9723e = this.f9722d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f9722d++;
        }
        m5700d();
        m5699c();
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f9723e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f9722d = this.f9723e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.f9722d += jSkip;
        m5700d();
        m5699c();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.f9722d += (long) i3;
        }
        m5700d();
        m5699c();
        return i3;
    }
}
