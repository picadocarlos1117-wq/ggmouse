package p000;

import java.io.IOException;

/* JADX INFO: renamed from: hg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0713hg extends AbstractC1647z {
    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: A */
    public final AbstractC1388s mo3140A() {
        AbstractC1388s[] abstractC1388sArrM7173v = m7173v();
        return new C0639fg(C0639fg.m2804v(abstractC1388sArrM7173v), abstractC1388sArrM7173v);
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: B */
    public final AbstractC0001a0 mo3141B() {
        return new C0789jg(false, this.f13209a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        c1462u.m6368n(z, 48, this.f13209a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        int iMo1095n = z ? 4 : 3;
        int length = this.f13209a.length;
        for (int i = 0; i < length; i++) {
            iMo1095n += this.f13209a[i].mo696b().mo1095n(true);
        }
        return iMo1095n;
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: z */
    public final AbstractC0585e mo3142z() {
        return new C0134cg(m7172u());
    }
}
