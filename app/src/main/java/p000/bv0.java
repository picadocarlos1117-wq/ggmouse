package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bv0 extends b71 implements wu0 {

    /* JADX INFO: renamed from: l */
    public final yu0 f1557l;

    /* JADX INFO: renamed from: m */
    public ms0 f1558m;

    /* JADX INFO: renamed from: n */
    public C1548wb f1559n;

    public bv0(yu0 yu0Var) {
        this.f1557l = yu0Var;
        yu0Var.registerListener(0, this);
    }

    @Override // p000.hu0
    /* JADX INFO: renamed from: e */
    public final void mo1068e() {
        this.f1557l.startLoading();
    }

    @Override // p000.hu0
    /* JADX INFO: renamed from: f */
    public final void mo1069f() {
        this.f1557l.stopLoading();
    }

    @Override // p000.hu0
    /* JADX INFO: renamed from: g */
    public final void mo1070g(j91 j91Var) {
        super.mo1070g(j91Var);
        this.f1558m = null;
        this.f1559n = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m1071i() {
        ms0 ms0Var = this.f1558m;
        C1548wb c1548wb = this.f1559n;
        if (ms0Var == null || c1548wb == null) {
            return;
        }
        super.mo1070g(c1548wb);
        m3294d(ms0Var, c1548wb);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f1557l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
