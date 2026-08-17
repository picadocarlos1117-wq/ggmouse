package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yb2 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public final C1127n f12932a;

    /* JADX INFO: renamed from: b */
    public final int f12933b;

    /* JADX INFO: renamed from: c */
    public final C1431t5 f12934c;

    public yb2(AbstractC1647z abstractC1647z) {
        this.f12932a = C1127n.m4489u(abstractC1647z.mo6823x(0));
        this.f12933b = C1127n.m4489u(abstractC1647z.mo6823x(1)).m4493x();
        this.f12934c = C1431t5.m6230j(abstractC1647z.mo6823x(2));
    }

    /* JADX INFO: renamed from: j */
    public static yb2 m7077j(Object obj) {
        if (obj instanceof yb2) {
            return (yb2) obj;
        }
        if (obj != null) {
            return new yb2(AbstractC1647z.m7171w(obj));
        }
        return null;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(this.f12932a);
        c0733i.m3324b(new C1127n(this.f12933b));
        c0733i.m3324b(this.f12934c);
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public yb2(int i, C1431t5 c1431t5) {
        this.f12932a = new C1127n(0L);
        this.f12933b = i;
        this.f12934c = c1431t5;
    }
}
