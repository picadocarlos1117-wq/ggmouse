package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ig */
/* JADX INFO: loaded from: classes3.dex */
public final class C0749ig implements InterfaceC0696h, wm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5012a;

    /* JADX INFO: renamed from: b */
    public C0082b0 f5013b;

    public C0749ig(C0082b0 c0082b0) {
        this.f5012a = 2;
        this.f5013b = c0082b0;
    }

    /* JADX INFO: renamed from: c */
    public static C0655fw m3431c(C0082b0 c0082b0) throws C0810k {
        try {
            C1310pw c1310pw = new C1310pw(c0082b0.m812o(), 1);
            c1310pw.f9182d = -1;
            return new C0655fw(c1310pw);
        } catch (IllegalArgumentException e) {
            throw new C0810k(e, e.getMessage());
        }
    }

    @Override // p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        switch (this.f5012a) {
            case 0:
                try {
                    return new C0713hg(this.f5013b.m812o());
                } catch (IOException e) {
                    f40.m2719o(e.getMessage());
                    return null;
                }
            case 1:
                try {
                    return new C0789jg(this.f5013b.m812o());
                } catch (IOException e2) {
                    throw new C1499v(e2.getMessage(), e2, 0);
                }
            case 2:
                try {
                    return m3431c(this.f5013b);
                } catch (IOException e3) {
                    throw new C1499v("unable to get DER object", e3, 0);
                } catch (IllegalArgumentException e4) {
                    throw new C1499v("unable to get DER object", e4, 0);
                }
            case 3:
                try {
                    return mo735h();
                } catch (IOException e5) {
                    f40.m2719o(e5.getMessage());
                    return null;
                }
            default:
                try {
                    return mo735h();
                } catch (IOException e6) {
                    throw new C1499v(e6.getMessage(), e6, 0);
                }
        }
    }

    @Override // p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() {
        switch (this.f5012a) {
            case 0:
                return new C0713hg(this.f5013b.m812o());
            case 1:
                return new C0789jg(this.f5013b.m812o());
            case 2:
                return m3431c(this.f5013b);
            case 3:
                return AbstractC1643yw.m7156a(this.f5013b.m812o());
            default:
                return AbstractC1643yw.m7157b(this.f5013b.m812o());
        }
    }

    public /* synthetic */ C0749ig(int i) {
        this.f5012a = i;
    }
}
