package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bc2 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public final int f1294a;

    /* JADX INFO: renamed from: b */
    public final long f1295b;

    /* JADX INFO: renamed from: c */
    public final long f1296c;

    /* JADX INFO: renamed from: d */
    public final byte[] f1297d;

    /* JADX INFO: renamed from: e */
    public final byte[] f1298e;

    /* JADX INFO: renamed from: f */
    public final byte[] f1299f;

    /* JADX INFO: renamed from: g */
    public final byte[] f1300g;

    /* JADX INFO: renamed from: m */
    public final byte[] f1301m;

    public bc2(AbstractC1647z abstractC1647z) {
        long jM4494z;
        C1127n c1127nM4489u = C1127n.m4489u(abstractC1647z.mo6823x(0));
        if (!c1127nM4489u.m4492v(0) && !c1127nM4489u.m4492v(1)) {
            f40.m2713i("unknown version of sequence");
            throw null;
        }
        this.f1294a = c1127nM4489u.m4493x();
        if (abstractC1647z.size() != 2 && abstractC1647z.size() != 3) {
            f40.m2713i("key sequence wrong size");
            throw null;
        }
        AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(abstractC1647z.mo6823x(1));
        this.f1295b = C1127n.m4489u(abstractC1647zM7171w.mo6823x(0)).m4494z();
        this.f1297d = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(1)).f10174a);
        this.f1298e = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(2)).f10174a);
        this.f1299f = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(3)).f10174a);
        this.f1300g = sc2.m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(4)).f10174a);
        if (abstractC1647zM7171w.size() == 6) {
            C0827kg c0827kgM3825u = C0827kg.m3825u(abstractC1647zM7171w.mo6823x(5));
            if (c0827kgM3825u.f5793c != 0) {
                f40.m2713i("unknown tag in XMSSPrivateKey");
                throw null;
            }
            jM4494z = ((C1127n) C1127n.f7153c.m2152e(c0827kgM3825u, false)).m4494z();
        } else {
            if (abstractC1647zM7171w.size() != 5) {
                f40.m2713i("keySeq should be 5 or 6 in length");
                throw null;
            }
            jM4494z = -1;
        }
        this.f1296c = jM4494z;
        if (abstractC1647z.size() != 3) {
            this.f1301m = null;
        } else {
            this.f1301m = sc2.m6061e(((AbstractC1388s) AbstractC1388s.f10172b.m2152e(C0827kg.m3825u(abstractC1647z.mo6823x(2)), true)).f10174a);
        }
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        long j = this.f1296c;
        c0733i.m3324b(j >= 0 ? new C1127n(1L) : new C1127n(0L));
        C0733i c0733i2 = new C0733i();
        c0733i2.m3324b(new C1127n(this.f1295b));
        c0733i2.m3324b(new C1123mw(this.f1297d));
        c0733i2.m3324b(new C1123mw(this.f1298e));
        c0733i2.m3324b(new C1123mw(this.f1299f));
        c0733i2.m3324b(new C1123mw(this.f1300g));
        if (j >= 0) {
            c0733i2.m3324b(new C0827kg(false, 0, (InterfaceC0696h) new C1127n(j), 1));
        }
        C1310pw c1310pw = new C1310pw(c0733i2, false);
        c1310pw.f9182d = -1;
        c0733i.m3324b(c1310pw);
        c0733i.m3324b(new C0827kg(true, 0, (InterfaceC0696h) new C1123mw(this.f1301m), 1));
        C1310pw c1310pw2 = new C1310pw(c0733i, false);
        c1310pw2.f9182d = -1;
        return c1310pw2;
    }

    public bc2(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.f1294a = 1;
        this.f1295b = j;
        this.f1297d = sc2.m6061e(bArr);
        this.f1298e = sc2.m6061e(bArr2);
        this.f1299f = sc2.m6061e(bArr3);
        this.f1300g = sc2.m6061e(bArr4);
        this.f1301m = sc2.m6061e(bArr5);
        this.f1296c = j2;
    }

    public bc2(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f1294a = 0;
        this.f1295b = j;
        this.f1297d = sc2.m6061e(bArr);
        this.f1298e = sc2.m6061e(bArr2);
        this.f1299f = sc2.m6061e(bArr3);
        this.f1300g = sc2.m6061e(bArr4);
        this.f1301m = sc2.m6061e(bArr5);
        this.f1296c = -1L;
    }
}
