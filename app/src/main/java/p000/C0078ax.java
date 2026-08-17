package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ax */
/* JADX INFO: loaded from: classes3.dex */
public final class C0078ax extends C1070lg {

    /* JADX INFO: renamed from: d */
    public final boolean f1091d;

    public C0078ax(int i, int i2, boolean z, C0082b0 c0082b0) {
        super(i, i2, c0082b0);
        this.f1091d = z;
    }

    @Override // p000.C1070lg, p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() throws IOException {
        boolean z = this.f1091d;
        int i = 4;
        C0082b0 c0082b0 = this.f6346c;
        int i2 = this.f6344a;
        int i3 = this.f6345b;
        if (!z) {
            return new C0827kg(i, i2, i3, new C1123mw(((h10) ((qs0) c0082b0.f1104c)).m3089d()), 2);
        }
        C0733i c0733iM812o = c0082b0.m812o();
        if (c0733iM812o.f4753c != 1) {
            return new C0827kg(i, i2, i3, AbstractC1643yw.m7156a(c0733iM812o), 2);
        }
        return new C0827kg(3, i2, i3, c0733iM812o.m3325c(0), 2);
    }
}
