package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends lu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11629a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f11630b;

    public vc1(ju0 ju0Var) {
        p32.m5188s(ju0Var, "result");
        this.f11630b = ju0Var;
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: a */
    public final ju0 mo200a(yc1 yc1Var) {
        int i = this.f11629a;
        Object obj = this.f11630b;
        switch (i) {
            case 0:
                return (ju0) obj;
            default:
                ju0 ju0VarMo200a = ((lu0) obj).mo200a(yc1Var);
                o21 o21Var = ju0VarMo200a.f5527a;
                if (o21Var == null) {
                    return ju0VarMo200a;
                }
                C1437tb attributes = o21Var.getAttributes();
                return ju0.m3709b(o21Var, new pb1((jb1) attributes.f10817a.get(rb1.f9871t), ju0VarMo200a.f5528b));
        }
    }

    public String toString() {
        switch (this.f11629a) {
            case 0:
                C1679zv c1679zv = new C1679zv(vc1.class.getSimpleName());
                c1679zv.m7359a((ju0) this.f11630b, "result");
                return c1679zv.toString();
            default:
                return super.toString();
        }
    }

    public vc1(lu0 lu0Var) {
        this.f11630b = lu0Var;
    }
}
