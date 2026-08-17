package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: iw */
/* JADX INFO: loaded from: classes3.dex */
public final class C0768iw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f5185a;

    static {
        new C0549d(C0768iw.class, 1);
    }

    public C0768iw(byte[] bArr) {
        if (bArr != null) {
            this.f5185a = bArr;
        } else {
            l41.m4051t("'contents' cannot be null");
            throw null;
        }
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f5185a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C0768iw) {
            return Arrays.equals(this.f5185a, ((C0768iw) abstractC1536w).f5185a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(25, z, this.f5185a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f5185a.length, z);
    }
}
