package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: d0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0550d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2691a;

    /* JADX INFO: renamed from: b */
    public final Object f2692b;

    public AbstractC0550d0() {
        this.f2691a = 1;
        this.f2692b = Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m2150a(AbstractC1536w abstractC1536w) {
        if (((Class) this.f2692b).isInstance(abstractC1536w)) {
            return;
        }
        f40.m2719o("unexpected object: ".concat(abstractC1536w.getClass().getName()));
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1536w m2151b(byte[] bArr) throws IOException {
        AbstractC1536w abstractC1536wM6675q = AbstractC1536w.m6675q(bArr);
        m2150a(abstractC1536wM6675q);
        return abstractC1536wM6675q;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1536w mo2148c(AbstractC1647z abstractC1647z) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1536w mo2149d(C1123mw c1123mw) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    /* JADX INFO: renamed from: e */
    public AbstractC1536w m2152e(C0827kg c0827kg, boolean z) {
        String str;
        AbstractC1647z c0713hg;
        AbstractC1536w abstractC1536wMo2148c;
        ua0.m6449g(c0827kg);
        int i = c0827kg.f5791a;
        InterfaceC0696h interfaceC0696h = c0827kg.f5794d;
        if (z) {
            if (!c0827kg.m3826v()) {
                str = "object implicit - explicit expected.";
                f40.m2719o(str);
                return null;
            }
            abstractC1536wMo2148c = interfaceC0696h.mo696b();
            m2150a(abstractC1536wMo2148c);
            m2150a(abstractC1536wMo2148c);
            return abstractC1536wMo2148c;
        }
        int i2 = 1;
        if (1 == i) {
            str = "object explicit - implicit expected.";
            f40.m2719o(str);
            return null;
        }
        AbstractC1536w abstractC1536wMo696b = interfaceC0696h.mo696b();
        if (i == 3) {
            switch (c0827kg.f5795e) {
                case 0:
                    c0713hg = new C0713hg(abstractC1536wMo696b);
                    break;
                case 1:
                    C1310pw c1310pw = new C1310pw(abstractC1536wMo696b, 0);
                    c1310pw.f9182d = -1;
                    c0713hg = c1310pw;
                    break;
                default:
                    C1310pw c1310pw2 = new C1310pw(abstractC1536wMo696b, i2);
                    c1310pw2.f9182d = -1;
                    c0713hg = c1310pw2;
                    break;
            }
            abstractC1536wMo2148c = mo2148c(c0713hg);
        } else if (i != 4) {
            m2150a(abstractC1536wMo696b);
            abstractC1536wMo2148c = abstractC1536wMo696b;
        } else {
            abstractC1536wMo2148c = abstractC1536wMo696b instanceof AbstractC1647z ? mo2148c((AbstractC1647z) abstractC1536wMo696b) : mo2149d((C1123mw) abstractC1536wMo696b);
        }
        m2150a(abstractC1536wMo2148c);
        return abstractC1536wMo2148c;
    }

    public boolean equals(Object obj) {
        switch (this.f2691a) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2153f();

    /* JADX INFO: renamed from: g */
    public abstract void mo2154g();

    /* JADX INFO: renamed from: h */
    public void m2155h(Object obj, boolean z) {
        Set set = (Set) this.f2692b;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                mo2153f();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            mo2154g();
        }
    }

    public /* synthetic */ AbstractC0550d0(Object obj, int i) {
        this.f2691a = i;
        this.f2692b = obj;
    }
}
