package p000;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public final class ox1 extends AbstractC1164o {

    /* JADX INFO: renamed from: a */
    public C1431t5 f8571a;

    /* JADX INFO: renamed from: b */
    public AbstractC0585e f8572b;

    public ox1(C1431t5 c1431t5, AbstractC1164o abstractC1164o) {
        this.f8572b = new C0618ew(abstractC1164o.mo696b().m4629i(), 0);
        this.f8571a = c1431t5;
    }

    /* JADX INFO: renamed from: j */
    public static ox1 m5086j(Object obj) {
        if (obj instanceof ox1) {
            return (ox1) obj;
        }
        if (obj != null) {
            AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(obj);
            ox1 ox1Var = new ox1();
            if (abstractC1647zM7171w.size() == 2) {
                Enumeration enumerationMo6824y = abstractC1647zM7171w.mo6824y();
                ox1Var.f8571a = C1431t5.m6230j(enumerationMo6824y.nextElement());
                ox1Var.f8572b = AbstractC0585e.m2434w(enumerationMo6824y.nextElement());
                return ox1Var;
            }
            ca0.m1174f(abstractC1647zM7171w.size(), "Bad sequence size: ");
        }
        return null;
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        String str;
        C1431t5 c1431t5 = this.f8571a;
        AbstractC0585e abstractC0585e = this.f8572b;
        C1310pw c1310pw = new C1310pw(0);
        if (c1431t5 == null) {
            str = "'element1' cannot be null";
        } else {
            if (abstractC0585e != null) {
                c1310pw.f13209a = new InterfaceC0696h[]{c1431t5, abstractC0585e};
                c1310pw.f9182d = -1;
                return c1310pw;
            }
            str = "'element2' cannot be null";
        }
        l41.m4051t(str);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC1536w m5087k() {
        return AbstractC1536w.m6675q(this.f8572b.m2436x());
    }

    public ox1(C1431t5 c1431t5, byte[] bArr) {
        this.f8572b = new C0618ew(bArr, 0);
        this.f8571a = c1431t5;
    }
}
