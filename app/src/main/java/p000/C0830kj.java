package p000;

import java.io.Closeable;

/* JADX INFO: renamed from: kj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0830kj implements Closeable {

    /* JADX INFO: renamed from: a */
    public C1073lj f5872a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5872a != null) {
            this.f5872a = null;
        } else {
            f40.m2719o("not attached to a buffer");
        }
    }
}
