package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: vw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1532vw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f11784a;

    public C1532vw(byte[] bArr) {
        this.f11784a = bArr;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f11784a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1532vw) {
            return Arrays.equals(this.f11784a, ((C1532vw) abstractC1536w).f11784a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(26, z, this.f11784a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f11784a.length, z);
    }

    public final String toString() {
        return yv1.m7153a(this.f11784a);
    }
}
