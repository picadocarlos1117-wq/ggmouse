package p000;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1353r1 implements Closeable {
    /* JADX INFO: renamed from: c */
    public final void m5652c(int i) {
        if (mo1196r() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo5654e() {
        return this instanceof wi1;
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC1353r1 mo1191g(int i);

    /* JADX INFO: renamed from: j */
    public abstract void mo1192j(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: l */
    public abstract void mo1193l(OutputStream outputStream, int i);

    /* JADX INFO: renamed from: o */
    public abstract void mo1194o(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: p */
    public abstract int mo1195p();

    /* JADX INFO: renamed from: r */
    public abstract int mo1196r();

    /* JADX INFO: renamed from: s */
    public void mo5655s() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo1197x(int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: d */
    public void mo5653d() {
    }
}
