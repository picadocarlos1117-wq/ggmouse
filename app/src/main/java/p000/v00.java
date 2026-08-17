package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v00 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final boolean f11470a;

    /* JADX INFO: renamed from: b */
    public final boolean f11471b;

    public v00(be0 be0Var, int i) {
        this.f11470a = (be0Var.f1332e & 1) != 0;
        this.f11471b = AbstractC0828kh.m3829m(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v00 v00Var = (v00) obj;
        return AbstractC1341qq.f9556a.mo5046c(this.f11471b, v00Var.f11471b).mo5046c(this.f11470a, v00Var.f11470a).mo5048e();
    }
}
