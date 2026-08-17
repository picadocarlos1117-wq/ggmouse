package p000;

import java.io.IOException;

/* JADX INFO: renamed from: cg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0134cg extends AbstractC0585e {

    /* JADX INFO: renamed from: d */
    public final int f1785d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0585e[] f1786e;

    public C0134cg(AbstractC0585e[] abstractC0585eArr) {
        super(m1213y(abstractC0585eArr));
        this.f1786e = abstractC0585eArr;
        this.f1785d = 1000;
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m1213y(AbstractC0585e[] abstractC0585eArr) {
        int length = abstractC0585eArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC0585eArr[0].f3086a;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = abstractC0585eArr[i2].f3086a;
            if (bArr[0] != 0) {
                f40.m2713i("only the last nested bitstring can have padding");
                return null;
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC0585eArr[i].f3086a;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b;
        int i3 = 1;
        for (AbstractC0585e abstractC0585e : abstractC0585eArr) {
            byte[] bArr4 = abstractC0585e.f3086a;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i3, length3);
            i3 += length3;
        }
        return bArr3;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        boolean zMo3m = mo3m();
        byte[] bArr = this.f3086a;
        if (!zMo3m) {
            int length = bArr.length;
            c1462u.m6370p(3, z);
            c1462u.m6366k(length);
            c1462u.m6365j(bArr, 0, length);
            return;
        }
        c1462u.m6370p(35, z);
        c1462u.m6364i(128);
        AbstractC0585e[] abstractC0585eArr = this.f1786e;
        if (abstractC0585eArr != null) {
            c1462u.mo4618r(abstractC0585eArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.f1785d;
            int i3 = i2 - 1;
            while (i > i3) {
                c1462u.m6364i(3);
                c1462u.m6366k(i2);
                c1462u.m6364i(0);
                c1462u.m6365j(bArr, length2 - i, i3);
                i -= i3;
            }
            c1462u.m6364i(3);
            c1462u.m6366k(i + 1);
            c1462u.m6364i(b);
            c1462u.m6365j(bArr, length2 - i, i);
        }
        c1462u.m6364i(0);
        c1462u.m6364i(0);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return this.f1786e != null || this.f3086a.length > this.f1785d;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        boolean zMo3m = mo3m();
        byte[] bArr = this.f3086a;
        if (!zMo3m) {
            return C1462u.m6358f(bArr.length, z);
        }
        int iMo1095n = z ? 4 : 3;
        AbstractC0585e[] abstractC0585eArr = this.f1786e;
        if (abstractC0585eArr != null) {
            for (AbstractC0585e abstractC0585e : abstractC0585eArr) {
                iMo1095n += abstractC0585e.mo1095n(true);
            }
            return iMo1095n;
        }
        if (bArr.length < 2) {
            return iMo1095n;
        }
        int length = bArr.length - 2;
        int i = this.f1785d;
        int i2 = i - 1;
        int i3 = length / i2;
        return C1462u.m6358f(bArr.length - (i2 * i3), true) + (C1462u.m6358f(i, true) * i3) + iMo1095n;
    }

    public C0134cg(byte[] bArr, int i) {
        super(bArr, i);
        this.f1786e = null;
        this.f1785d = 1000;
    }
}
