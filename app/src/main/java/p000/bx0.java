package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends lu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1566a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f1567b;

    public bx0(Throwable th) {
        nv1 nv1VarM4613f = nv1.f7558m.m4614g("Panic! This is a bug!").m4613f(th);
        ju0 ju0Var = ju0.f5526e;
        p32.m5177l(!nv1VarM4613f.m4612e(), "drop status shouldn't be OK");
        this.f1567b = new ju0(null, null, nv1VarM4613f, true);
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: a */
    public final ju0 mo200a(yc1 yc1Var) {
        int i = this.f1566a;
        Object obj = this.f1567b;
        switch (i) {
            case 0:
                return (ju0) obj;
            default:
                return ju0.m3708a((nv1) obj);
        }
    }

    public String toString() {
        switch (this.f1566a) {
            case 0:
                C1679zv c1679zv = new C1679zv(bx0.class.getSimpleName());
                c1679zv.m7359a((ju0) this.f1567b, "panicPickResult");
                return c1679zv.toString();
            default:
                return super.toString();
        }
    }

    public bx0(nv1 nv1Var) {
        this.f1567b = nv1Var;
    }
}
