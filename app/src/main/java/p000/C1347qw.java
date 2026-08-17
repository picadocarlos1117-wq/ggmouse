package p000;

import java.io.IOException;

/* JADX INFO: renamed from: qw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1347qw extends AbstractC0001a0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9590d = 1;

    /* JADX INFO: renamed from: e */
    public int f9591e;

    public C1347qw(InterfaceC0696h[] interfaceC0696hArr) {
        super(false, interfaceC0696hArr);
        this.f9591e = -1;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        int i = this.f9590d;
        InterfaceC0696h[] interfaceC0696hArr = this.f2a;
        int i2 = 0;
        switch (i) {
            case 0:
                c1462u.m6370p(49, z);
                C1160nw c1160nwMo4615c = c1462u.mo4615c();
                int length = interfaceC0696hArr.length;
                if (this.f9591e >= 0 || length > 16) {
                    c1462u.m6366k(m5613w());
                    while (i2 < length) {
                        interfaceC0696hArr[i2].mo696b().mo4s().mo1094k(c1160nwMo4615c, true);
                        i2++;
                    }
                } else {
                    AbstractC1536w[] abstractC1536wArr = new AbstractC1536w[length];
                    int iMo1095n = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        AbstractC1536w abstractC1536wMo4s = interfaceC0696hArr[i3].mo696b().mo4s();
                        abstractC1536wArr[i3] = abstractC1536wMo4s;
                        iMo1095n += abstractC1536wMo4s.mo1095n(true);
                    }
                    this.f9591e = iMo1095n;
                    c1462u.m6366k(iMo1095n);
                    while (i2 < length) {
                        abstractC1536wArr[i2].mo1094k(c1160nwMo4615c, true);
                        i2++;
                    }
                }
                break;
            default:
                c1462u.m6370p(49, z);
                C1680zw c1680zwMo6362d = c1462u.mo6362d();
                int length2 = interfaceC0696hArr.length;
                if (this.f9591e >= 0 || length2 > 16) {
                    c1462u.m6366k(m5614x());
                    while (i2 < length2) {
                        c1680zwMo6362d.mo4617q(interfaceC0696hArr[i2].mo696b());
                        i2++;
                    }
                } else {
                    AbstractC1536w[] abstractC1536wArr2 = new AbstractC1536w[length2];
                    int iMo1095n2 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        AbstractC1536w abstractC1536wMo5t = interfaceC0696hArr[i4].mo696b().mo5t();
                        abstractC1536wArr2[i4] = abstractC1536wMo5t;
                        iMo1095n2 += abstractC1536wMo5t.mo1095n(true);
                    }
                    this.f9591e = iMo1095n2;
                    c1462u.m6366k(iMo1095n2);
                    while (i2 < length2) {
                        c1680zwMo6362d.mo4617q(abstractC1536wArr2[i2]);
                        i2++;
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        switch (this.f9590d) {
            case 0:
                return C1462u.m6358f(m5613w(), z);
            default:
                return C1462u.m6358f(m5614x(), z);
        }
    }

    @Override // p000.AbstractC0001a0, p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        switch (this.f9590d) {
            case 0:
                return this.f3b != null ? this : super.mo4s();
            default:
                return super.mo4s();
        }
    }

    @Override // p000.AbstractC0001a0, p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public final AbstractC1536w mo5t() {
        int i = this.f9590d;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public int m5613w() {
        if (this.f9591e < 0) {
            int iMo1095n = 0;
            for (InterfaceC0696h interfaceC0696h : this.f2a) {
                iMo1095n += interfaceC0696h.mo696b().mo4s().mo1095n(true);
            }
            this.f9591e = iMo1095n;
        }
        return this.f9591e;
    }

    /* JADX INFO: renamed from: x */
    public int m5614x() {
        if (this.f9591e < 0) {
            int iMo1095n = 0;
            for (InterfaceC0696h interfaceC0696h : this.f2a) {
                iMo1095n += interfaceC0696h.mo696b().mo5t().mo1095n(true);
            }
            this.f9591e = iMo1095n;
        }
        return this.f9591e;
    }

    public /* synthetic */ C1347qw(C0733i c0733i) {
        super(c0733i);
    }

    public /* synthetic */ C1347qw(boolean z, InterfaceC0696h[] interfaceC0696hArr) {
        super(z, interfaceC0696hArr);
    }

    public /* synthetic */ C1347qw() {
    }

    public /* synthetic */ C1347qw(InterfaceC0696h[] interfaceC0696hArr, InterfaceC0696h[] interfaceC0696hArr2) {
        super(interfaceC0696hArr, interfaceC0696hArr2);
    }
}
