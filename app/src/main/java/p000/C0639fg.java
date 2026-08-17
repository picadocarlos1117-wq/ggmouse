package p000;

import java.io.IOException;

/* JADX INFO: renamed from: fg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0639fg extends AbstractC1388s {

    /* JADX INFO: renamed from: d */
    public final int f3778d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1388s[] f3779e;

    public C0639fg(byte[] bArr, AbstractC1388s[] abstractC1388sArr) {
        super(bArr);
        this.f3779e = abstractC1388sArr;
        this.f3778d = 1000;
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m2804v(AbstractC1388s[] abstractC1388sArr) {
        int length = abstractC1388sArr.length;
        if (length == 0) {
            return AbstractC1388s.f10173c;
        }
        if (length == 1) {
            return abstractC1388sArr[0].f10174a;
        }
        int length2 = 0;
        for (AbstractC1388s abstractC1388s : abstractC1388sArr) {
            length2 += abstractC1388s.f10174a.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (AbstractC1388s abstractC1388s2 : abstractC1388sArr) {
            byte[] bArr2 = abstractC1388s2.f10174a;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        c1462u.m6370p(36, z);
        c1462u.m6364i(128);
        AbstractC1388s[] abstractC1388sArr = this.f3779e;
        if (abstractC1388sArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f10174a;
                if (i >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i, this.f3778d);
                c1462u.m6370p(4, true);
                c1462u.m6366k(iMin);
                c1462u.m6365j(bArr, i, iMin);
                i += iMin;
            }
        } else {
            c1462u.mo4618r(abstractC1388sArr);
        }
        c1462u.m6364i(0);
        c1462u.m6364i(0);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return true;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        int iMo1095n = z ? 4 : 3;
        AbstractC1388s[] abstractC1388sArr = this.f3779e;
        if (abstractC1388sArr != null) {
            for (AbstractC1388s abstractC1388s : abstractC1388sArr) {
                iMo1095n += abstractC1388s.mo1095n(true);
            }
            return iMo1095n;
        }
        byte[] bArr = this.f10174a;
        int length = bArr.length;
        int i = this.f3778d;
        int i2 = length / i;
        int iM6358f = (C1462u.m6358f(i, true) * i2) + iMo1095n;
        int length2 = bArr.length - (i2 * i);
        return length2 > 0 ? C1462u.m6358f(length2, true) + iM6358f : iM6358f;
    }
}
