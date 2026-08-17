package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: gw */
/* JADX INFO: loaded from: classes3.dex */
public final class C0692gw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f4355a;

    public C0692gw(byte[] bArr) {
        this.f4355a = bArr;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f4355a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C0692gw) {
            return Arrays.equals(this.f4355a, ((C0692gw) abstractC1536w).f4355a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(27, z, this.f4355a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f4355a.length, z);
    }

    public final String toString() {
        return yv1.m7153a(this.f4355a);
    }
}
