package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: t5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1431t5 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public C1351r f10750a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0696h f10751b;

    public C1431t5(C1351r c1351r, AbstractC1164o abstractC1164o) {
        this.f10750a = c1351r;
        this.f10751b = abstractC1164o;
    }

    /* JADX INFO: renamed from: j */
    public static C1431t5 m6230j(Object obj) {
        C1351r c1351r;
        if (obj instanceof C1431t5) {
            return (C1431t5) obj;
        }
        if (obj != null) {
            AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(obj);
            C1431t5 c1431t5 = new C1431t5();
            if (abstractC1647zM7171w.size() >= 1 && abstractC1647zM7171w.size() <= 2) {
                InterfaceC0696h interfaceC0696hMo6823x = abstractC1647zM7171w.mo6823x(0);
                ConcurrentHashMap concurrentHashMap = C1351r.f9639c;
                if (interfaceC0696hMo6823x == null || (interfaceC0696hMo6823x instanceof C1351r)) {
                    c1351r = (C1351r) interfaceC0696hMo6823x;
                } else {
                    AbstractC1536w abstractC1536wMo696b = interfaceC0696hMo6823x.mo696b();
                    if (!(abstractC1536wMo696b instanceof C1351r)) {
                        f40.m2713i("illegal object in getInstance: ".concat(interfaceC0696hMo6823x.getClass().getName()));
                        return null;
                    }
                    c1351r = (C1351r) abstractC1536wMo696b;
                }
                c1431t5.f10750a = c1351r;
                if (abstractC1647zM7171w.size() == 2) {
                    c1431t5.f10751b = abstractC1647zM7171w.mo6823x(1);
                    return c1431t5;
                }
                c1431t5.f10751b = null;
                return c1431t5;
            }
            ca0.m1174f(abstractC1647zM7171w.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        C0733i c0733i = new C0733i(2);
        c0733i.m3324b(this.f10750a);
        InterfaceC0696h interfaceC0696h = this.f10751b;
        if (interfaceC0696h != null) {
            c0733i.m3324b(interfaceC0696h);
        }
        C1310pw c1310pw = new C1310pw(c0733i, false);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    public C1431t5(C1351r c1351r) {
        this.f10750a = c1351r;
    }
}
