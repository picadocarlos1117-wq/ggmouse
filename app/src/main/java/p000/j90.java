package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class j90 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public int f5326a;

    /* JADX INFO: renamed from: b */
    public byte[] f5327b;

    /* JADX INFO: renamed from: c */
    public byte[] f5328c;

    /* JADX INFO: renamed from: d */
    public byte[] f5329d;

    /* JADX INFO: renamed from: e */
    public l90 f5330e;

    /* JADX INFO: renamed from: j */
    public static j90 m3578j(AbstractC1536w abstractC1536w) {
        l90 l90Var = null;
        if (abstractC1536w != null) {
            AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(abstractC1536w);
            j90 j90Var = new j90();
            int iM4493x = C1127n.m4489u(abstractC1647zM7171w.mo6823x(0)).m4493x();
            j90Var.f5326a = iM4493x;
            if (iM4493x == 0) {
                j90Var.f5327b = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(1)).f10174a);
                j90Var.f5328c = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(2)).f10174a);
                j90Var.f5329d = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(3)).f10174a);
                if (abstractC1647zM7171w.size() == 5) {
                    InterfaceC0696h interfaceC0696hMo6823x = abstractC1647zM7171w.mo6823x(4);
                    if (interfaceC0696hMo6823x instanceof l90) {
                        l90Var = (l90) interfaceC0696hMo6823x;
                    } else if (interfaceC0696hMo6823x != null) {
                        AbstractC1647z abstractC1647zM7171w2 = AbstractC1647z.m7171w(interfaceC0696hMo6823x);
                        l90Var = new l90();
                        l90Var.f6273a = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w2.mo6823x(0)).f10174a);
                    }
                    j90Var.f5330e = l90Var;
                }
                return j90Var;
            }
            f40.m2713i("unrecognized version");
        }
        return null;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(new C1127n(this.f5326a));
        c0733i.m3324b(new C1123mw(this.f5327b));
        c0733i.m3324b(new C1123mw(this.f5328c));
        c0733i.m3324b(new C1123mw(this.f5329d));
        l90 l90Var = this.f5330e;
        if (l90Var != null) {
            c0733i.m3324b(new l90(l90Var.f6273a));
        }
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }
}
