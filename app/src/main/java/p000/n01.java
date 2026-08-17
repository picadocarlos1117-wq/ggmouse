package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class n01 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public final int f7164a;

    /* JADX INFO: renamed from: b */
    public final int f7165b;

    /* JADX INFO: renamed from: c */
    public final uh0 f7166c;

    /* JADX INFO: renamed from: d */
    public final C1431t5 f7167d;

    public n01(AbstractC1647z abstractC1647z) {
        this.f7164a = ((C1127n) abstractC1647z.mo6823x(0)).m4493x();
        this.f7165b = ((C1127n) abstractC1647z.mo6823x(1)).m4493x();
        this.f7166c = new uh0(((AbstractC1388s) abstractC1647z.mo6823x(2)).f10174a);
        this.f7167d = C1431t5.m6230j(abstractC1647z.mo6823x(3));
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(new C1127n(this.f7164a));
        c0733i.m3324b(new C1127n(this.f7165b));
        c0733i.m3324b(new C1123mw(this.f7166c.m6493a()));
        c0733i.m3324b(this.f7167d);
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public n01(int i, int i2, uh0 uh0Var, C1431t5 c1431t5) {
        this.f7164a = i;
        this.f7165b = i2;
        this.f7166c = new uh0(uh0Var.m6493a());
        this.f7167d = c1431t5;
    }
}
