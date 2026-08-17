package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ow */
/* JADX INFO: loaded from: classes3.dex */
public final class C1273ow extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f8497a;

    public C1273ow(byte[] bArr) {
        this.f8497a = bArr;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f8497a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1273ow) {
            return Arrays.equals(this.f8497a, ((C1273ow) abstractC1536w).f8497a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(19, z, this.f8497a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f8497a.length, z);
    }

    public final String toString() {
        return yv1.m7153a(this.f8497a);
    }
}
