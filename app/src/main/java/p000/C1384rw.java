package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: rw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1384rw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f10149a;

    public C1384rw(byte[] bArr) {
        this.f10149a = bArr;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f10149a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1384rw) {
            return Arrays.equals(this.f10149a, ((C1384rw) abstractC1536w).f10149a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(20, z, this.f10149a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f10149a.length, z);
    }

    public final String toString() {
        return yv1.m7153a(this.f10149a);
    }
}
