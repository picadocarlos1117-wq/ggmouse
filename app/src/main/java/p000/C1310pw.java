package p000;

import java.io.IOException;

/* JADX INFO: renamed from: pw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1310pw extends AbstractC1647z {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9181c;

    /* JADX INFO: renamed from: d */
    public int f9182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310pw(C0733i c0733i, int i) {
        super(c0733i);
        this.f9181c = i;
        switch (i) {
            case 1:
                super(c0733i);
                break;
            default:
                this.f9182d = -1;
                break;
        }
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: A */
    public final AbstractC1388s mo3140A() {
        switch (this.f9181c) {
            case 0:
                break;
        }
        return new C1123mw(C0639fg.m2804v(m7173v()));
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: B */
    public final AbstractC0001a0 mo3141B() {
        switch (this.f9181c) {
            case 0:
                break;
        }
        return new C1347qw(this.f13209a);
    }

    /* JADX INFO: renamed from: C */
    public int m5368C() {
        if (this.f9182d < 0) {
            int length = this.f13209a.length;
            int iMo1095n = 0;
            for (int i = 0; i < length; i++) {
                iMo1095n += this.f13209a[i].mo696b().mo4s().mo1095n(true);
            }
            this.f9182d = iMo1095n;
        }
        return this.f9182d;
    }

    /* JADX INFO: renamed from: D */
    public int m5369D() {
        if (this.f9182d < 0) {
            int length = this.f13209a.length;
            int iMo1095n = 0;
            for (int i = 0; i < length; i++) {
                iMo1095n += this.f13209a[i].mo696b().mo5t().mo1095n(true);
            }
            this.f9182d = iMo1095n;
        }
        return this.f9182d;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        int i = 0;
        switch (this.f9181c) {
            case 0:
                c1462u.m6370p(48, z);
                C1160nw c1160nwMo4615c = c1462u.mo4615c();
                int length = this.f13209a.length;
                if (this.f9182d >= 0 || length > 16) {
                    c1462u.m6366k(m5368C());
                    while (i < length) {
                        this.f13209a[i].mo696b().mo4s().mo1094k(c1160nwMo4615c, true);
                        i++;
                    }
                } else {
                    AbstractC1536w[] abstractC1536wArr = new AbstractC1536w[length];
                    int iMo1095n = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        AbstractC1536w abstractC1536wMo4s = this.f13209a[i2].mo696b().mo4s();
                        abstractC1536wArr[i2] = abstractC1536wMo4s;
                        iMo1095n += abstractC1536wMo4s.mo1095n(true);
                    }
                    this.f9182d = iMo1095n;
                    c1462u.m6366k(iMo1095n);
                    while (i < length) {
                        abstractC1536wArr[i].mo1094k(c1160nwMo4615c, true);
                        i++;
                    }
                }
                break;
            default:
                c1462u.m6370p(48, z);
                C1680zw c1680zwMo6362d = c1462u.mo6362d();
                int length2 = this.f13209a.length;
                if (this.f9182d >= 0 || length2 > 16) {
                    c1462u.m6366k(m5369D());
                    while (i < length2) {
                        c1680zwMo6362d.mo4617q(this.f13209a[i].mo696b());
                        i++;
                    }
                } else {
                    AbstractC1536w[] abstractC1536wArr2 = new AbstractC1536w[length2];
                    int iMo1095n2 = 0;
                    for (int i3 = 0; i3 < length2; i3++) {
                        AbstractC1536w abstractC1536wMo5t = this.f13209a[i3].mo696b().mo5t();
                        abstractC1536wArr2[i3] = abstractC1536wMo5t;
                        iMo1095n2 += abstractC1536wMo5t.mo1095n(true);
                    }
                    this.f9182d = iMo1095n2;
                    c1462u.m6366k(iMo1095n2);
                    while (i < length2) {
                        c1680zwMo6362d.mo4617q(abstractC1536wArr2[i]);
                        i++;
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        switch (this.f9181c) {
            case 0:
                return C1462u.m6358f(m5368C(), z);
            default:
                return C1462u.m6358f(m5369D(), z);
        }
    }

    @Override // p000.AbstractC1647z, p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        switch (this.f9181c) {
            case 0:
                return this;
            default:
                return super.mo4s();
        }
    }

    @Override // p000.AbstractC1647z, p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public final AbstractC1536w mo5t() {
        int i = this.f9181c;
        return this;
    }

    @Override // p000.AbstractC1647z
    /* JADX INFO: renamed from: z */
    public final AbstractC0585e mo3142z() {
        byte b = 0;
        switch (this.f9181c) {
            case 0:
                return new C0618ew(C0134cg.m1213y(m7172u()), b, b);
            default:
                return new C0618ew(C0134cg.m1213y(m7172u()), 1, b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1310pw(InterfaceC0696h interfaceC0696h, int i) {
        super(interfaceC0696h);
        this.f9181c = i;
    }

    public /* synthetic */ C1310pw(int i) {
        this.f9181c = i;
        switch (i) {
            case 1:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1310pw(C0733i c0733i, boolean z) {
        super(c0733i);
        this.f9181c = 0;
    }

    public C1310pw(InterfaceC0696h[] interfaceC0696hArr, int i) {
        this.f9181c = i;
        this.f13209a = interfaceC0696hArr;
    }
}
