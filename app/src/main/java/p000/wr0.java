package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wr0 extends AbstractC1647z {

    /* JADX INFO: renamed from: c */
    public byte[] f12255c;

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: A */
    public final AbstractC1388s mo3140A() {
        return ((AbstractC1647z) mo5t()).mo3140A();
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: B */
    public final AbstractC0001a0 mo3141B() {
        return ((AbstractC1647z) mo5t()).mo3141B();
    }

    /* JADX INFO: renamed from: C */
    public final synchronized void m6822C() {
        C0733i c0733i;
        if (this.f12255c != null) {
            C1090m c1090m = new C1090m(this.f12255c);
            try {
                AbstractC1536w abstractC1536wM4339l = c1090m.m4339l();
                if (abstractC1536wM4339l == null) {
                    c0733i = new C0733i(0);
                } else {
                    C0733i c0733i2 = new C0733i();
                    do {
                        c0733i2.m3324b(abstractC1536wM4339l);
                        abstractC1536wM4339l = c1090m.m4339l();
                    } while (abstractC1536wM4339l != null);
                    c0733i = c0733i2;
                }
                c1090m.close();
                this.f13209a = c0733i.m3326d();
                this.f12255c = null;
            } catch (IOException e) {
                throw new C1499v("malformed ASN.1: " + e, e, 0);
            }
        }
    }

    @Override // p000.AbstractC1647z, p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        m6822C();
        return super.hashCode();
    }

    @Override // p000.AbstractC1647z, java.lang.Iterable
    public final Iterator iterator() {
        m6822C();
        return super.iterator();
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f12255c;
        }
        if (bArr != null) {
            c1462u.m6367m(48, z, bArr);
        } else {
            super.mo5t().mo1094k(c1462u, z);
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f12255c;
        }
        return bArr != null ? C1462u.m6358f(bArr.length, z) : super.mo5t().mo1095n(z);
    }

    @Override // p000.AbstractC1647z, p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public final AbstractC1536w mo4s() {
        m6822C();
        return super.mo4s();
    }

    @Override // p000.AbstractC1647z
    public final int size() {
        m6822C();
        return this.f13209a.length;
    }

    @Override // p000.AbstractC1647z, p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public final AbstractC1536w mo5t() {
        m6822C();
        return super.mo5t();
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: x */
    public final InterfaceC0696h mo6823x(int i) {
        m6822C();
        return this.f13209a[i];
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: y */
    public final Enumeration mo6824y() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f12255c;
        }
        if (bArr == null) {
            return new C1610y(this);
        }
        vr0 vr0Var = new vr0();
        vr0Var.f11753a = new C1090m(bArr);
        vr0Var.f11754b = vr0Var.m6654a();
        return vr0Var;
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: z */
    public final AbstractC0585e mo3142z() {
        return ((AbstractC1647z) mo5t()).mo3142z();
    }
}
