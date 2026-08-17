package p000;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: kg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0827kg extends AbstractC1536w implements wm0 {

    /* JADX INFO: renamed from: a */
    public final int f5791a;

    /* JADX INFO: renamed from: b */
    public final int f5792b;

    /* JADX INFO: renamed from: c */
    public final int f5793c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0696h f5794d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5795e;

    public C0827kg(int i, int i2, int i3, InterfaceC0696h interfaceC0696h) {
        if (interfaceC0696h == null) {
            l41.m4051t("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            f40.m2713i(jd0.m3609g(i2, "invalid tag class: "));
            throw null;
        }
        this.f5791a = i;
        this.f5792b = i2;
        this.f5793c = i3;
        this.f5794d = interfaceC0696h;
    }

    /* JADX INFO: renamed from: u */
    public static C0827kg m3825u(Object obj) {
        String strM3611i;
        if (obj == null || (obj instanceof C0827kg)) {
            return (C0827kg) obj;
        }
        if (!(obj instanceof InterfaceC0696h)) {
            if (obj instanceof byte[]) {
                try {
                    AbstractC1536w abstractC1536wM6675q = AbstractC1536w.m6675q((byte[]) obj);
                    if (abstractC1536wM6675q instanceof C0827kg) {
                        return (C0827kg) abstractC1536wM6675q;
                    }
                    throw new IllegalStateException("unexpected object: ".concat(abstractC1536wM6675q.getClass().getName()));
                } catch (IOException e) {
                    strM3611i = jd0.m3611i(e, new StringBuilder("failed to construct tagged object from byte[]: "));
                }
            }
            f40.m2713i(strM3611i);
            return null;
        }
        AbstractC1536w abstractC1536wMo696b = ((InterfaceC0696h) obj).mo696b();
        if (abstractC1536wMo696b instanceof C0827kg) {
            return (C0827kg) abstractC1536wMo696b;
        }
        strM3611i = "unknown object in getInstance: ".concat(obj.getClass().getName());
        f40.m2713i(strM3611i);
        return null;
    }

    @Override // p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() {
        return this;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return this.f5794d.mo696b().hashCode() ^ (((this.f5792b * 7919) ^ this.f5793c) ^ (m3826v() ? 15 : 240));
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (!(abstractC1536w instanceof C0827kg)) {
            return false;
        }
        C0827kg c0827kg = (C0827kg) abstractC1536w;
        if (this.f5793c != c0827kg.f5793c || this.f5792b != c0827kg.f5792b) {
            return false;
        }
        if (this.f5791a != c0827kg.f5791a && m3826v() != c0827kg.m3826v()) {
            return false;
        }
        AbstractC1536w abstractC1536wMo696b = this.f5794d.mo696b();
        AbstractC1536w abstractC1536wMo696b2 = c0827kg.f5794d.mo696b();
        if (abstractC1536wMo696b == abstractC1536wMo696b2) {
            return true;
        }
        if (m3826v()) {
            return abstractC1536wMo696b.mo2j(abstractC1536wMo696b2);
        }
        try {
            return Arrays.equals(getEncoded(), c0827kg.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        int i = this.f5795e;
        int i2 = this.f5793c;
        int i3 = this.f5792b;
        InterfaceC0696h interfaceC0696h = this.f5794d;
        switch (i) {
            case 0:
                AbstractC1536w abstractC1536wMo696b = interfaceC0696h.mo696b();
                boolean zM3826v = m3826v();
                if (z) {
                    if (zM3826v || abstractC1536wMo696b.mo3m()) {
                        i3 |= 32;
                    }
                    c1462u.m6369o(i3, i2);
                }
                if (!zM3826v) {
                    abstractC1536wMo696b.mo1094k(c1462u, false);
                } else {
                    c1462u.m6364i(128);
                    abstractC1536wMo696b.mo1094k(c1462u, true);
                    c1462u.m6364i(0);
                    c1462u.m6364i(0);
                }
                break;
            case 1:
                AbstractC1536w abstractC1536wMo4s = interfaceC0696h.mo696b().mo4s();
                boolean zM3826v2 = m3826v();
                if (z) {
                    if (zM3826v2 || abstractC1536wMo4s.mo3m()) {
                        i3 |= 32;
                    }
                    c1462u.m6369o(i3, i2);
                }
                if (zM3826v2) {
                    c1462u.m6366k(abstractC1536wMo4s.mo1095n(true));
                }
                abstractC1536wMo4s.mo1094k(c1462u.mo4615c(), zM3826v2);
                break;
            default:
                AbstractC1536w abstractC1536wMo5t = interfaceC0696h.mo696b().mo5t();
                boolean zM3826v3 = m3826v();
                if (z) {
                    if (zM3826v3 || abstractC1536wMo5t.mo3m()) {
                        i3 |= 32;
                    }
                    c1462u.m6369o(i3, i2);
                }
                if (zM3826v3) {
                    c1462u.m6366k(abstractC1536wMo5t.mo1095n(true));
                }
                abstractC1536wMo5t.mo1094k(c1462u.mo6362d(), zM3826v3);
                break;
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        int i = this.f5795e;
        InterfaceC0696h interfaceC0696h = this.f5794d;
        switch (i) {
            case 0:
                return m3826v() || interfaceC0696h.mo696b().mo3m();
            case 1:
                return m3826v() || interfaceC0696h.mo696b().mo4s().mo3m();
            default:
                return m3826v() || interfaceC0696h.mo696b().mo5t().mo3m();
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        int i = this.f5795e;
        int i2 = this.f5793c;
        InterfaceC0696h interfaceC0696h = this.f5794d;
        switch (i) {
            case 0:
                AbstractC1536w abstractC1536wMo696b = interfaceC0696h.mo696b();
                boolean zM3826v = m3826v();
                int iMo1095n = abstractC1536wMo696b.mo1095n(zM3826v);
                if (zM3826v) {
                    iMo1095n += 3;
                }
                return iMo1095n + (z ? C1462u.m6359g(i2) : 0);
            case 1:
                AbstractC1536w abstractC1536wMo4s = interfaceC0696h.mo696b().mo4s();
                boolean zM3826v2 = m3826v();
                int iMo1095n2 = abstractC1536wMo4s.mo1095n(zM3826v2);
                if (zM3826v2) {
                    iMo1095n2 += C1462u.m6357e(iMo1095n2);
                }
                return iMo1095n2 + (z ? C1462u.m6359g(i2) : 0);
            default:
                AbstractC1536w abstractC1536wMo5t = interfaceC0696h.mo696b().mo5t();
                boolean zM3826v3 = m3826v();
                int iMo1095n3 = abstractC1536wMo5t.mo1095n(zM3826v3);
                if (zM3826v3) {
                    iMo1095n3 += C1462u.m6357e(iMo1095n3);
                }
                return iMo1095n3 + (z ? C1462u.m6359g(i2) : 0);
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        switch (this.f5795e) {
            case 1:
                return this;
            default:
                return new C0827kg(this.f5791a, this.f5792b, this.f5793c, this.f5794d, 1);
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public AbstractC1536w mo5t() {
        switch (this.f5795e) {
            case 1:
            case 2:
                return this;
            default:
                return new C0827kg(this.f5791a, this.f5792b, this.f5793c, this.f5794d, 2);
        }
    }

    public final String toString() {
        return ua0.m6424C(this.f5792b, this.f5793c) + this.f5794d;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3826v() {
        int i = this.f5791a;
        return i == 1 || i == 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0827kg(int i, int i2, int i3, InterfaceC0696h interfaceC0696h, int i4) {
        this(i, i2, i3, interfaceC0696h);
        this.f5795e = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0827kg(C1123mw c1123mw) {
        this(2, 128, 0, c1123mw);
        this.f5795e = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0827kg(boolean z, int i, InterfaceC0696h interfaceC0696h, int i2) {
        this(z ? 1 : 2, 128, i, interfaceC0696h);
        this.f5795e = i2;
    }
}
