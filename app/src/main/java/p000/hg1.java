package p000;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public final class hg1 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public C1127n f4560a;

    /* JADX INFO: renamed from: b */
    public C1431t5 f4561b;

    /* JADX INFO: renamed from: c */
    public AbstractC1388s f4562c;

    /* JADX INFO: renamed from: d */
    public AbstractC0001a0 f4563d;

    /* JADX INFO: renamed from: e */
    public AbstractC0585e f4564e;

    public hg1(C1431t5 c1431t5, byte[] bArr, AbstractC0001a0 abstractC0001a0, byte[] bArr2) {
        this.f4560a = new C1127n(bArr2 != null ? AbstractC1628yh.f12982b : AbstractC1628yh.f12981a);
        this.f4561b = c1431t5;
        this.f4562c = new C1123mw(bArr);
        this.f4563d = abstractC0001a0;
        this.f4564e = bArr2 == null ? null : new C0618ew(bArr2, 0);
    }

    /* JADX INFO: renamed from: j */
    public static hg1 m3143j(Object obj) {
        if (obj instanceof hg1) {
            return (hg1) obj;
        }
        if (obj != null) {
            AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(obj);
            hg1 hg1Var = new hg1();
            Enumeration enumerationMo6824y = abstractC1647zM7171w.mo6824y();
            C1127n c1127nM4489u = C1127n.m4489u(enumerationMo6824y.nextElement());
            hg1Var.f4560a = c1127nM4489u;
            int iM4493x = c1127nM4489u.m4493x();
            if (iM4493x >= 0 && iM4493x <= 1) {
                hg1Var.f4561b = C1431t5.m6230j(enumerationMo6824y.nextElement());
                hg1Var.f4562c = AbstractC1388s.m5931u(enumerationMo6824y.nextElement());
                int i = -1;
                while (enumerationMo6824y.hasMoreElements()) {
                    C0827kg c0827kg = (C0827kg) enumerationMo6824y.nextElement();
                    int i2 = c0827kg.f5793c;
                    if (i2 <= i) {
                        f40.m2713i("invalid optional field in private key info");
                        return null;
                    }
                    if (i2 == 0) {
                        hg1Var.f4563d = (AbstractC0001a0) AbstractC0001a0.f1c.m2152e(c0827kg, false);
                    } else {
                        if (i2 != 1) {
                            f40.m2713i("unknown optional field in private key info");
                            return null;
                        }
                        if (iM4493x < 1) {
                            f40.m2713i("'publicKey' requires version v2(1) or later");
                            return null;
                        }
                        hg1Var.f4564e = (AbstractC0585e) AbstractC0585e.f3084b.m2152e(c0827kg, false);
                    }
                    i = i2;
                }
                return hg1Var;
            }
            f40.m2713i("invalid version for private key info");
        }
        return null;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i(5);
        c0733i.m3324b(this.f4560a);
        c0733i.m3324b(this.f4561b);
        c0733i.m3324b(this.f4562c);
        AbstractC0001a0 abstractC0001a0 = this.f4563d;
        if (abstractC0001a0 != null) {
            c0733i.m3324b(new C0827kg(false, 0, (InterfaceC0696h) abstractC0001a0, 1));
        }
        AbstractC0585e abstractC0585e = this.f4564e;
        if (abstractC0585e != null) {
            c0733i.m3324b(new C0827kg(false, 1, (InterfaceC0696h) abstractC0585e, 1));
        }
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC1536w m3144k() {
        return AbstractC1536w.m6675q(this.f4562c.f10174a);
    }

    public hg1(C1431t5 c1431t5, AbstractC1536w abstractC1536w, AbstractC0001a0 abstractC0001a0) {
        this(c1431t5, abstractC1536w, abstractC0001a0, (byte[]) null);
    }

    public hg1(C1431t5 c1431t5, AbstractC1164o abstractC1164o, AbstractC0001a0 abstractC0001a0, byte[] bArr) {
        this(c1431t5, abstractC1164o.mo696b().m4629i(), abstractC0001a0, bArr);
    }
}
