package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ew */
/* JADX INFO: loaded from: classes3.dex */
public final class C0618ew extends AbstractC0585e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0618ew(byte[] bArr, int i) {
        super(bArr, i);
        this.f3453d = 0;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        int i = this.f3453d;
        byte[] bArr = this.f3086a;
        switch (i) {
            case 0:
                int i2 = bArr[0] & 255;
                int length = bArr.length;
                int i3 = length - 1;
                byte b = bArr[i3];
                byte b2 = (byte) ((255 << i2) & b);
                if (b != b2) {
                    c1462u.m6370p(3, z);
                    c1462u.m6366k(length);
                    c1462u.m6365j(bArr, 0, i3);
                    c1462u.m6364i(b2);
                } else {
                    c1462u.m6367m(3, z, bArr);
                }
                break;
            default:
                c1462u.m6367m(3, z, bArr);
                break;
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        switch (this.f3453d) {
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        switch (this.f3453d) {
            case 0:
                break;
        }
        return C1462u.m6358f(this.f3086a.length, z);
    }

    @Override // p000.AbstractC0585e, p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        switch (this.f3453d) {
            case 0:
                return this;
            default:
                return super.mo4s();
        }
    }

    @Override // p000.AbstractC0585e, p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public final AbstractC1536w mo5t() {
        int i = this.f3453d;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0618ew(byte[] bArr, int i, byte b) {
        super(bArr);
        this.f3453d = i;
    }
}
