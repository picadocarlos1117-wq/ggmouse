package p000;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j70 extends MediaDataSource {

    /* JADX INFO: renamed from: a */
    public long f5312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o70 f5313b;

    public j70(o70 o70Var) {
        this.f5313b = o70Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        o70 o70Var = this.f5313b;
        DataInputStream dataInputStream = o70Var.f5688a;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f5312a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        o70Var.m4717d(j);
                        this.f5312a = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = o70Var.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f5312a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f5312a = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
