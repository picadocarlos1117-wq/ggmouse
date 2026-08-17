package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b80 implements xt0, ty1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1252b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1253c;

    public /* synthetic */ b80(de1 de1Var, de1 de1Var2, int i) {
        this.f1251a = i;
        this.f1252b = de1Var;
        this.f1253c = de1Var2;
    }

    @Override // p000.ty1
    /* JADX INFO: renamed from: b */
    public Object mo940b() {
        p42 p42Var = (p42) this.f1252b;
        p42Var.f8719d.m4755X((C0674ge) this.f1253c, this.f1251a + 1, false);
        return null;
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        de1 de1Var = (de1) this.f1252b;
        de1 de1Var2 = (de1) this.f1253c;
        ce1 ce1Var = (ce1) obj;
        int i = this.f1251a;
        ce1Var.onPositionDiscontinuity(i);
        ce1Var.onPositionDiscontinuity(de1Var, de1Var2, i);
    }

    public /* synthetic */ b80(p42 p42Var, C0674ge c0674ge, int i) {
        this.f1252b = p42Var;
        this.f1253c = c0674ge;
        this.f1251a = i;
    }
}
