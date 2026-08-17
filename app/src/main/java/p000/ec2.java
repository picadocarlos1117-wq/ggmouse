package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ec2 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public final byte[] f3311a;

    /* JADX INFO: renamed from: b */
    public final byte[] f3312b;

    public ec2(byte[] bArr, byte[] bArr2) {
        this.f3311a = sc2.m6061e(bArr);
        this.f3312b = sc2.m6061e(bArr2);
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(new C1127n(0L));
        c0733i.m3324b(new C1123mw(this.f3311a));
        c0733i.m3324b(new C1123mw(this.f3312b));
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }
}
