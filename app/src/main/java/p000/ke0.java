package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ke0 implements du1 {

    /* JADX INFO: renamed from: a */
    public final du1 f5782a;

    public ke0(du1 du1Var) {
        du1Var.getClass();
        this.f5782a = du1Var;
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: a */
    public final v02 mo154a() {
        return this.f5782a.mo154a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5782a.close();
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: n */
    public long mo156n(long j, C1073lj c1073lj) {
        c1073lj.getClass();
        return this.f5782a.mo156n(j, c1073lj);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f5782a + ')';
    }
}
