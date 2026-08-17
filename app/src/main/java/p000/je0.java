package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class je0 implements ft1 {

    /* JADX INFO: renamed from: a */
    public final ft1 f5375a;

    public je0(ft1 ft1Var) {
        ft1Var.getClass();
        this.f5375a = ft1Var;
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: a */
    public final v02 mo954a() {
        return this.f5375a.mo954a();
    }

    @Override // p000.ft1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5375a.close();
    }

    @Override // p000.ft1, java.io.Flushable
    public void flush() {
        this.f5375a.flush();
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: q */
    public void mo956q(long j, C1073lj c1073lj) {
        this.f5375a.mo956q(j, c1073lj);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f5375a + ')';
    }
}
