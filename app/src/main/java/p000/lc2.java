package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class lc2 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public final byte[] f6314a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6315b;

    public lc2(AbstractC1647z abstractC1647z) {
        if (!C1127n.m4489u(abstractC1647z.mo6823x(0)).m4492v(0)) {
            f40.m2713i("unknown version of sequence");
            throw null;
        }
        this.f6314a = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647z.mo6823x(1)).f10174a);
        this.f6315b = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647z.mo6823x(2)).f10174a);
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(new C1127n(0L));
        c0733i.m3324b(new C1123mw(this.f6314a));
        c0733i.m3324b(new C1123mw(this.f6315b));
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public lc2(byte[] bArr, byte[] bArr2) {
        this.f6314a = sc2.m6061e(bArr);
        this.f6315b = sc2.m6061e(bArr2);
    }
}
