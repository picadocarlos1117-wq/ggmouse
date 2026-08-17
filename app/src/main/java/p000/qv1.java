package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final nv1 f9588a;

    /* JADX INFO: renamed from: b */
    public final boolean f9589b;

    public qv1(nv1 nv1Var) {
        super(nv1.m4608b(nv1Var), nv1Var.f7564c);
        this.f9588a = nv1Var;
        this.f9589b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f9589b ? super.fillInStackTrace() : this;
    }
}
