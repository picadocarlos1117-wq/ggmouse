package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zn1 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public int f13496a;

    /* JADX INFO: renamed from: b */
    public byte[] f13497b;

    /* JADX INFO: renamed from: c */
    public byte[] f13498c;

    /* JADX INFO: renamed from: d */
    public ao1 f13499d;

    /* JADX INFO: renamed from: j */
    public static zn1 m7323j(AbstractC1647z abstractC1647z) {
        AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(abstractC1647z);
        zn1 zn1Var = new zn1();
        int iM4493x = C1127n.m4489u(abstractC1647zM7171w.mo6823x(0)).m4493x();
        zn1Var.f13496a = iM4493x;
        ao1 ao1Var = null;
        if (iM4493x != 0) {
            f40.m2713i("unrecognized version");
            return null;
        }
        zn1Var.f13497b = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(1)).f10174a);
        zn1Var.f13498c = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(2)).f10174a);
        if (abstractC1647zM7171w.size() == 4) {
            InterfaceC0696h interfaceC0696hMo6823x = abstractC1647zM7171w.mo6823x(3);
            if (interfaceC0696hMo6823x instanceof ao1) {
                ao1Var = (ao1) interfaceC0696hMo6823x;
            } else if (interfaceC0696hMo6823x != null) {
                AbstractC1647z abstractC1647zM7171w2 = AbstractC1647z.m7171w(interfaceC0696hMo6823x);
                ao1Var = new ao1();
                ao1Var.f1011a = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w2.mo6823x(0)).f10174a);
                ao1Var.f1012b = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w2.mo6823x(1)).f10174a);
            }
            zn1Var.f13499d = ao1Var;
        }
        return zn1Var;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(new C1127n(this.f13496a));
        c0733i.m3324b(new C1123mw(this.f13497b));
        c0733i.m3324b(new C1123mw(this.f13498c));
        ao1 ao1Var = this.f13499d;
        if (ao1Var != null) {
            byte[] bArrM6061e = sc2.m6061e(ao1Var.f1011a);
            byte[] bArrM6061e2 = sc2.m6061e(ao1Var.f1012b);
            ao1 ao1Var2 = new ao1();
            ao1Var2.f1011a = bArrM6061e;
            ao1Var2.f1012b = bArrM6061e2;
            c0733i.m3324b(ao1Var2);
        }
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }
}
