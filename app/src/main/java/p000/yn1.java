package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yn1 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public final C1127n f13034a;

    /* JADX INFO: renamed from: b */
    public final C1431t5 f13035b;

    public yn1(AbstractC1647z abstractC1647z) {
        this.f13034a = C1127n.m4489u(abstractC1647z.mo6823x(0));
        this.f13035b = C1431t5.m6230j(abstractC1647z.mo6823x(1));
    }

    /* JADX INFO: renamed from: j */
    public static final yn1 m7101j(Object obj) {
        if (obj instanceof yn1) {
            return (yn1) obj;
        }
        if (obj != null) {
            return new yn1(AbstractC1647z.m7171w(obj));
        }
        return null;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i();
        c0733i.m3324b(this.f13034a);
        c0733i.m3324b(this.f13035b);
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public yn1(C1431t5 c1431t5) {
        this.f13034a = new C1127n(0L);
        this.f13035b = c1431t5;
    }
}
