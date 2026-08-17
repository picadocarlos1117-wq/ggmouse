package p000;

/* JADX INFO: renamed from: hy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0731hy implements xt0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4743a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m62 f4744b;

    public /* synthetic */ C0731hy(C1542w5 c1542w5, m62 m62Var) {
        this.f4744b = m62Var;
    }

    @Override // p000.xt0
    public final void invoke(Object obj) {
        int i = this.f4743a;
        m62 m62Var = this.f4744b;
        switch (i) {
            case 0:
                h21 h21Var = (h21) obj;
                qo0 qo0Var = h21Var.f4411o;
                if (qo0Var != null) {
                    be0 be0Var = (be0) qo0Var.f9548b;
                    if (be0Var.f1349v == -1) {
                        ae0 ae0VarM969a = be0Var.m969a();
                        ae0VarM969a.f204t = m62Var.f6672a;
                        ae0VarM969a.f205u = m62Var.f6673b;
                        h21Var.f4411o = new qo0(new be0(ae0VarM969a), (String) qo0Var.f9549c, 6, false);
                    }
                }
                int i2 = m62Var.f6672a;
                break;
            default:
                ((ce1) obj).onVideoSizeChanged(m62Var);
                break;
        }
    }

    public /* synthetic */ C0731hy(m62 m62Var) {
        this.f4744b = m62Var;
    }
}
