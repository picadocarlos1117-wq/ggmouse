package p000;

import java.io.IOException;

/* JADX INFO: renamed from: jg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0789jg extends AbstractC0001a0 {
    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        c1462u.m6368n(z, 49, this.f2a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        int iMo1095n = z ? 4 : 3;
        for (InterfaceC0696h interfaceC0696h : this.f2a) {
            iMo1095n += interfaceC0696h.mo696b().mo1095n(true);
        }
        return iMo1095n;
    }
}
