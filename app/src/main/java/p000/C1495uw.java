package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: uw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1495uw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f11439a;

    public C1495uw(byte[] bArr) {
        this.f11439a = bArr;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f11439a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1495uw) {
            return Arrays.equals(this.f11439a, ((C1495uw) abstractC1536w).f11439a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(21, z, this.f11439a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f11439a.length, z);
    }
}
