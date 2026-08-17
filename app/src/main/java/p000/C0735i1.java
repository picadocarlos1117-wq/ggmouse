package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: i1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0735i1 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public int f4767a;

    public C0735i1(InputStream inputStream, int i) {
        super(inputStream);
        this.f4767a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f4767a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f4767a;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.f4767a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip = (int) super.skip(Math.min(j, this.f4767a));
        if (iSkip >= 0) {
            this.f4767a -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f4767a <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f4767a--;
        }
        return i;
    }
}
