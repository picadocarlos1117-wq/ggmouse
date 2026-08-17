package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zb2 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public final C1127n f13336a;

    /* JADX INFO: renamed from: b */
    public final int f13337b;

    /* JADX INFO: renamed from: c */
    public final int f13338c;

    /* JADX INFO: renamed from: d */
    public final C1431t5 f13339d;

    public zb2(AbstractC1647z abstractC1647z) {
        this.f13336a = C1127n.m4489u(abstractC1647z.mo6823x(0));
        this.f13337b = C1127n.m4489u(abstractC1647z.mo6823x(1)).m4493x();
        this.f13338c = C1127n.m4489u(abstractC1647z.mo6823x(2)).m4493x();
        this.f13339d = C1431t5.m6230j(abstractC1647z.mo6823x(3));
    }

    /* JADX INFO: renamed from: j */
    public static zb2 m7301j(Object obj) {
        if (obj instanceof zb2) {
            return (zb2) obj;
        }
        if (obj != null) {
            return new zb2(AbstractC1647z.m7171w(obj));
        }
        return null;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(this.f13336a);
        c0733i.m3324b(new C1127n(this.f13337b));
        c0733i.m3324b(new C1127n(this.f13338c));
        c0733i.m3324b(this.f13339d);
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public zb2(int i, int i2, C1431t5 c1431t5) {
        this.f13336a = new C1127n(0L);
        this.f13337b = i;
        this.f13338c = i2;
        this.f13339d = c1431t5;
    }
}
