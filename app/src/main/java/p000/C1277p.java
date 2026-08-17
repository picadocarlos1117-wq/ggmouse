package p000;

import java.io.IOException;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277p extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final C0768iw f8603a;

    public C1277p(C0768iw c0768iw) {
        this.f8603a = c0768iw;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return ~sc2.m6079w(this.f8603a.f5185a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1277p) {
            return this.f8603a.mo2j(((C1277p) abstractC1536w).f8603a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        c1462u.m6370p(7, z);
        c1462u.m6367m(25, false, this.f8603a.f5185a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return this.f8603a.mo1095n(z);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public final AbstractC1536w mo4s() {
        return this;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public final AbstractC1536w mo5t() {
        return this;
    }
}
