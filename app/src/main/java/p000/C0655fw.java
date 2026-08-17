package p000;

import java.io.IOException;

/* JADX INFO: renamed from: fw */
/* JADX INFO: loaded from: classes3.dex */
public final class C0655fw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public C1351r f3909a;

    /* JADX INFO: renamed from: b */
    public C1127n f3910b;

    /* JADX INFO: renamed from: c */
    public AbstractC1536w f3911c;

    /* JADX INFO: renamed from: d */
    public int f3912d;

    /* JADX INFO: renamed from: e */
    public AbstractC1536w f3913e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3914f = 0;

    public C0655fw(AbstractC1647z abstractC1647z) {
        int i;
        AbstractC1536w abstractC1536wMo696b;
        AbstractC1536w abstractC1536wM2859v = m2859v(abstractC1647z, 0);
        if (abstractC1536wM2859v instanceof C1351r) {
            this.f3909a = (C1351r) abstractC1536wM2859v;
            abstractC1536wM2859v = m2859v(abstractC1647z, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (abstractC1536wM2859v instanceof C1127n) {
            this.f3910b = (C1127n) abstractC1536wM2859v;
            i++;
            abstractC1536wM2859v = m2859v(abstractC1647z, i);
        }
        if (!(abstractC1536wM2859v instanceof C0827kg)) {
            this.f3911c = abstractC1536wM2859v;
            i++;
            abstractC1536wM2859v = m2859v(abstractC1647z, i);
        }
        if (abstractC1647z.size() != i + 1) {
            f40.m2713i("input sequence too large");
            throw null;
        }
        if (!(abstractC1536wM2859v instanceof C0827kg)) {
            f40.m2713i("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        C0827kg c0827kg = (C0827kg) abstractC1536wM2859v;
        int i2 = c0827kg.f5793c;
        if (i2 < 0 || i2 > 2) {
            f40.m2713i(jd0.m3609g(i2, "invalid encoding value: "));
            throw null;
        }
        this.f3912d = i2;
        ua0.m6449g(c0827kg);
        if (i2 != 0) {
            if (i2 == 1) {
                abstractC1536wMo696b = (AbstractC1388s) AbstractC1388s.f10172b.m2152e(c0827kg, false);
            } else {
                if (i2 != 2) {
                    f40.m2713i("invalid tag: ".concat(ua0.m6424C(c0827kg.f5792b, i2)));
                    throw null;
                }
                abstractC1536wMo696b = (AbstractC0585e) AbstractC0585e.f3084b.m2152e(c0827kg, false);
            }
        } else {
            if (!c0827kg.m3826v()) {
                f40.m2719o("object implicit - explicit expected.");
                throw null;
            }
            InterfaceC0696h interfaceC0696h = c0827kg.f5794d;
            abstractC1536wMo696b = (interfaceC0696h instanceof AbstractC1164o ? (AbstractC1164o) interfaceC0696h : interfaceC0696h.mo696b()).mo696b();
        }
        this.f3913e = abstractC1536wMo696b;
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC1536w m2859v(AbstractC1647z abstractC1647z, int i) {
        if (abstractC1647z.size() > i) {
            return abstractC1647z.mo6823x(i).mo696b();
        }
        f40.m2713i("too few objects in input sequence");
        return null;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        C1351r c1351r = this.f3909a;
        int iHashCode = c1351r == null ? 0 : c1351r.hashCode();
        C1127n c1127n = this.f3910b;
        int iHashCode2 = iHashCode ^ (c1127n == null ? 0 : c1127n.hashCode());
        AbstractC1536w abstractC1536w = this.f3911c;
        return this.f3913e.hashCode() ^ ((iHashCode2 ^ (abstractC1536w != null ? abstractC1536w.hashCode() : 0)) ^ this.f3912d);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        C0655fw c0655fw;
        C1351r c1351r;
        C1351r c1351r2;
        if (this == abstractC1536w) {
            return true;
        }
        if (!(abstractC1536w instanceof C0655fw) || ((c1351r = this.f3909a) != (c1351r2 = (c0655fw = (C0655fw) abstractC1536w).f3909a) && (c1351r == null || c1351r2 == null || !c1351r.equals(c1351r2)))) {
            return false;
        }
        C1127n c1127n = this.f3910b;
        C1127n c1127n2 = c0655fw.f3910b;
        if (c1127n != c1127n2 && (c1127n == null || c1127n2 == null || !c1127n.equals(c1127n2))) {
            return false;
        }
        AbstractC1536w abstractC1536w2 = this.f3911c;
        AbstractC1536w abstractC1536w3 = c0655fw.f3911c;
        return (abstractC1536w2 == abstractC1536w3 || !(abstractC1536w2 == null || abstractC1536w3 == null || !abstractC1536w2.equals(abstractC1536w3))) && this.f3912d == c0655fw.f3912d && this.f3913e.m6676p(c0655fw.f3913e);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        c1462u.m6370p(40, z);
        m2860u().mo1094k(c1462u, false);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return true;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return m2860u().mo1095n(z);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        switch (this.f3914f) {
            case 0:
                return this;
            default:
                C1351r c1351r = this.f3909a;
                C1127n c1127n = this.f3910b;
                AbstractC1536w abstractC1536w = this.f3911c;
                int i = this.f3912d;
                AbstractC1536w abstractC1536w2 = this.f3913e;
                C0655fw c0655fw = new C0655fw();
                c0655fw.f3909a = c1351r;
                c0655fw.f3910b = c1127n;
                c0655fw.f3911c = abstractC1536w;
                if (i < 0 || i > 2) {
                    f40.m2713i(jd0.m3609g(i, "invalid encoding value: "));
                } else {
                    c0655fw.f3912d = i;
                    if (i == 1 ? AbstractC1388s.class.isInstance(abstractC1536w2) : !(i == 2 && !AbstractC0585e.class.isInstance(abstractC1536w2))) {
                        c0655fw.f3913e = abstractC1536w2;
                        return c0655fw;
                    }
                    f40.m2719o("unexpected object: ".concat(abstractC1536w2.getClass().getName()));
                }
                return null;
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public final AbstractC1536w mo5t() {
        int i = this.f3914f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC1647z m2860u() {
        switch (this.f3914f) {
            case 0:
                C0733i c0733i = new C0733i(4);
                C1351r c1351r = this.f3909a;
                if (c1351r != null) {
                    c0733i.m3324b(c1351r);
                }
                C1127n c1127n = this.f3910b;
                if (c1127n != null) {
                    c0733i.m3324b(c1127n);
                }
                AbstractC1536w abstractC1536w = this.f3911c;
                if (abstractC1536w != null) {
                    c0733i.m3324b(abstractC1536w.mo4s());
                }
                int i = this.f3912d;
                c0733i.m3324b(new C0827kg(i == 0, i, this.f3913e, 1));
                C1310pw c1310pw = new C1310pw(c0733i, false);
                c1310pw.f9182d = -1;
                return c1310pw;
            default:
                C0733i c0733i2 = new C0733i(4);
                C1351r c1351r2 = this.f3909a;
                if (c1351r2 != null) {
                    c0733i2.m3324b(c1351r2);
                }
                C1127n c1127n2 = this.f3910b;
                if (c1127n2 != null) {
                    c0733i2.m3324b(c1127n2);
                }
                AbstractC1536w abstractC1536w2 = this.f3911c;
                if (abstractC1536w2 != null) {
                    c0733i2.m3324b(abstractC1536w2.mo5t());
                }
                int i2 = this.f3912d;
                c0733i2.m3324b(new C0827kg(i2 == 0, i2, this.f3913e, 2));
                C1310pw c1310pw2 = new C1310pw(c0733i2, 1);
                c1310pw2.f9182d = -1;
                return c1310pw2;
        }
    }

    public /* synthetic */ C0655fw() {
    }
}
