package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o70 extends k70 {
    public o70(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f5688a.mark(Integer.MAX_VALUE);
        } else {
            f40.m2713i("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4717d(long j) throws IOException {
        int i = this.f5690c;
        if (i > j) {
            this.f5690c = 0;
            this.f5688a.reset();
        } else {
            j -= (long) i;
        }
        m3809c((int) j);
    }

    public o70(byte[] bArr) {
        super(bArr);
        this.f5688a.mark(Integer.MAX_VALUE);
    }
}
