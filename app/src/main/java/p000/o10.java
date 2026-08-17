package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o10 extends t10 {

    /* JADX INFO: renamed from: j */
    public final yc1 f7605j;

    /* JADX INFO: renamed from: k */
    public final C1307pt f7606k = C1307pt.m5325b();

    /* JADX INFO: renamed from: l */
    public final rc2[] f7607l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ p10 f7608m;

    public o10(p10 p10Var, yc1 yc1Var, rc2[] rc2VarArr) {
        this.f7608m = p10Var;
        this.f7605j = yc1Var;
        this.f7607l = rc2VarArr;
    }

    @Override // p000.t10, p000.InterfaceC1339qo
    /* JADX INFO: renamed from: f */
    public final void mo1030f(nv1 nv1Var) {
        super.mo1030f(nv1Var);
        synchronized (this.f7608m.f8613b) {
            try {
                p10 p10Var = this.f7608m;
                if (p10Var.f8618g != null) {
                    boolean zRemove = p10Var.f8620i.remove(this);
                    if (!this.f7608m.m5102e() && zRemove) {
                        p10 p10Var2 = this.f7608m;
                        p10Var2.f8615d.m5928b(p10Var2.f8617f);
                        p10 p10Var3 = this.f7608m;
                        if (p10Var3.f8621j != null) {
                            p10Var3.f8615d.m5928b(p10Var3.f8618g);
                            this.f7608m.f8618g = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7608m.f8615d.m5927a();
    }

    @Override // p000.t10, p000.InterfaceC1339qo
    /* JADX INFO: renamed from: g */
    public final void mo1031g(zj0 zj0Var) {
        if (Boolean.TRUE.equals(this.f7605j.f12951a.f263f)) {
            zj0Var.f13431b.add("wait_for_ready");
        }
        super.mo1031g(zj0Var);
    }

    @Override // p000.t10
    /* JADX INFO: renamed from: r */
    public final void mo4630r(nv1 nv1Var) {
        for (rc2 rc2Var : this.f7607l) {
            rc2Var.mo4527q0(nv1Var);
        }
    }
}
