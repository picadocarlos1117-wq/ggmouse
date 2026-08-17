package p000;

/* JADX INFO: renamed from: pk */
/* JADX INFO: loaded from: classes3.dex */
public final class C1298pk extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public byte[] f8915a;

    public C1298pk(byte[] bArr) {
        this.f8915a = bArr;
    }

    /* JADX INFO: renamed from: j */
    public static C1298pk m5267j(InterfaceC0696h interfaceC0696h) {
        if (interfaceC0696h instanceof C1298pk) {
            return (C1298pk) interfaceC0696h;
        }
        if (interfaceC0696h == null) {
            return null;
        }
        AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(interfaceC0696h);
        C1298pk c1298pk = new C1298pk();
        c1298pk.f8915a = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(0)).f10174a);
        return c1298pk;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(new C1123mw(this.f8915a));
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }
}
