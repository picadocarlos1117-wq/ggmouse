package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u00 extends b10 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f11079e;

    /* JADX INFO: renamed from: f */
    public final int f11080f;

    public u00(int i, y12 y12Var, int i2, x00 x00Var, int i3) {
        int i4;
        super(i, y12Var, i2);
        this.f11079e = AbstractC0828kh.m3829m(i3, x00Var.f12401x) ? 1 : 0;
        be0 be0Var = this.f1125d;
        int i5 = be0Var.f1348u;
        int i6 = -1;
        if (i5 != -1 && (i4 = be0Var.f1349v) != -1) {
            i6 = i5 * i4;
        }
        this.f11080f = i6;
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: a */
    public final int mo824a() {
        return this.f11079e;
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo825b(b10 b10Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11080f, ((u00) obj).f11080f);
    }
}
