package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 extends InputStream implements yq0 {

    /* JADX INFO: renamed from: a */
    public AbstractC1353r1 f11692a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f11692a.mo1196r();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11692a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f11692a.mo5653d();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f11692a.mo5654e();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        AbstractC1353r1 abstractC1353r1 = this.f11692a;
        if (abstractC1353r1.mo1196r() == 0) {
            return -1;
        }
        int iMin = Math.min(abstractC1353r1.mo1196r(), i2);
        abstractC1353r1.mo1192j(i, iMin, bArr);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f11692a.mo5655s();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        AbstractC1353r1 abstractC1353r1 = this.f11692a;
        int iMin = (int) Math.min(abstractC1353r1.mo1196r(), j);
        abstractC1353r1.mo1197x(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC1353r1 abstractC1353r1 = this.f11692a;
        if (abstractC1353r1.mo1196r() == 0) {
            return -1;
        }
        return abstractC1353r1.mo1195p();
    }
}
