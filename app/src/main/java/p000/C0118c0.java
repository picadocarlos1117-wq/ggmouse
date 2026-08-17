package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0118c0 extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f1595a;

    public C0118c0(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            f40.m2713i("UTCTime string too short");
            throw null;
        }
        this.f1595a = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            f40.m2713i("illegal characters in UTCTime string");
            throw null;
        }
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f1595a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (!(abstractC1536w instanceof C0118c0)) {
            return false;
        }
        return Arrays.equals(this.f1595a, ((C0118c0) abstractC1536w).f1595a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(23, z, this.f1595a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f1595a.length, z);
    }

    public final String toString() {
        return yv1.m7153a(this.f1595a);
    }
}
