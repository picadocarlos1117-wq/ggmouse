package p000;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public interface ft1 extends Closeable, Flushable {
    /* JADX INFO: renamed from: a */
    v02 mo954a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* JADX INFO: renamed from: q */
    void mo956q(long j, C1073lj c1073lj);
}
