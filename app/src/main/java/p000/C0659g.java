package p000;

import java.io.IOException;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes3.dex */
public final class C0659g extends AbstractC1536w {

    /* JADX INFO: renamed from: b */
    public static final C0659g f3931b = new C0659g((byte) 0);

    /* JADX INFO: renamed from: c */
    public static final C0659g f3932c = new C0659g((byte) -1);

    /* JADX INFO: renamed from: a */
    public final byte f3933a;

    public C0659g(byte b) {
        this.f3933a = b;
    }

    /* JADX INFO: renamed from: u */
    public static C0659g m2880u(byte[] bArr) {
        if (bArr.length != 1) {
            f40.m2713i("BOOLEAN value should have 1 byte in it");
            return null;
        }
        byte b = bArr[0];
        if (b != -1) {
            return b != 0 ? new C0659g(b) : f3931b;
        }
        return f3932c;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return this.f3933a != 0 ? 1 : 0;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C0659g) {
            if ((this.f3933a != 0) == (((C0659g) abstractC1536w).f3933a != 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        c1462u.m6370p(1, z);
        c1462u.m6366k(1);
        c1462u.m6364i(this.f3933a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(1, z);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public final AbstractC1536w mo4s() {
        return this.f3933a != 0 ? f3932c : f3931b;
    }

    public final String toString() {
        return this.f3933a != 0 ? "TRUE" : "FALSE";
    }
}
