package p000;

/* JADX INFO: renamed from: go */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684go extends AbstractRunnableC0012ab {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nv1 f4246c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j51 f4247d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1174o9 f4248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684go(C1174o9 c1174o9, nv1 nv1Var, j51 j51Var) {
        super(((C0798jo) c1174o9.f7701d).f5469e, 1);
        this.f4248e = c1174o9;
        this.f4246c = nv1Var;
        this.f4247d = j51Var;
    }

    @Override // p000.AbstractRunnableC0012ab
    /* JADX INFO: renamed from: b */
    public final void mo141b() {
        jc1.m3599c();
        try {
            jc1.m3597a();
            vm0 vm0Var = jc1.f5363a;
            vm0Var.getClass();
            m3018c();
            vm0Var.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3018c() {
        nv1 nv1Var = this.f4246c;
        j51 j51Var = this.f4247d;
        nv1 nv1Var2 = (nv1) this.f4248e.f7700c;
        if (nv1Var2 != null) {
            j51Var = new j51();
            nv1Var = nv1Var2;
        }
        ((C0798jo) this.f4248e.f7701d).f5474j = true;
        try {
            ((AbstractC0143co) this.f4248e.f7699b).onClose(nv1Var, j51Var);
            ((C0798jo) this.f4248e.f7701d).m3676b();
            C0599ed c0599ed = ((C0798jo) this.f4248e.f7701d).f5468d;
            if (nv1Var.m4612e()) {
                ((zv0) c0599ed.f3315c).mo3445a();
            } else {
                ((zv0) c0599ed.f3316d).mo3445a();
            }
        } catch (Throwable th) {
            ((C0798jo) this.f4248e.f7701d).m3676b();
            C0599ed c0599ed2 = ((C0798jo) this.f4248e.f7701d).f5468d;
            if (nv1Var.m4612e()) {
                ((zv0) c0599ed2.f3315c).mo3445a();
            } else {
                ((zv0) c0599ed2.f3316d).mo3445a();
            }
            throw th;
        }
    }
}
