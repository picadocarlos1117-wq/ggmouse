package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: gk */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0680gk extends AbstractC0753ik {

    /* JADX INFO: renamed from: d */
    public final byte[] f4216d;

    public C0680gk(byte[] bArr) {
        bArr.getClass();
        this.f4216d = bArr;
    }

    /* JADX INFO: renamed from: A */
    public int mo2591A() {
        return 0;
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo2990a() {
        return ByteBuffer.wrap(this.f4216d, mo2591A(), size()).asReadOnlyBuffer();
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: e */
    public byte mo2592e(int i) {
        return this.f4216d[i];
    }

    @Override // p000.AbstractC0753ik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0753ik) && size() == ((AbstractC0753ik) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0680gk)) {
                return obj.equals(this);
            }
            C0680gk c0680gk = (C0680gk) obj;
            int i = this.f5044a;
            int i2 = c0680gk.f5044a;
            if (i == 0 || i2 == 0 || i == i2) {
                return m3000z(c0680gk, 0, size());
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0138ck(this);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: j */
    public void mo2593j(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.f4216d, i, bArr, i2, i3);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: k */
    public final int mo2991k() {
        return 0;
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: m */
    public byte mo2594m(int i) {
        return this.f4216d[i];
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: n */
    public final boolean mo2992n() {
        return true;
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: p */
    public final boolean mo2993p() {
        int iMo2591A = mo2591A();
        return w42.f11969a.m5813V(iMo2591A, size() + iMo2591A, this.f4216d);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: q */
    public final AbstractC0762ip mo2994q() {
        return AbstractC0762ip.m3468f(this.f4216d, mo2591A(), size(), true);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: s */
    public final int mo2995s(int i, int i2, int i3) {
        int iMo2591A = mo2591A() + i2;
        Charset charset = no0.f7481a;
        for (int i4 = iMo2591A; i4 < iMo2591A + i3; i4++) {
            i = (i * 31) + this.f4216d[i4];
        }
        return i;
    }

    @Override // p000.AbstractC0753ik
    public int size() {
        return this.f4216d.length;
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: t */
    public final int mo2996t(int i, int i2, int i3) {
        int iMo2591A = mo2591A() + i2;
        return w42.f11969a.mo5814g0(i, iMo2591A, i3 + iMo2591A, this.f4216d);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: u */
    public final AbstractC0753ik mo2997u(int i, int i2) {
        int iM3440h = AbstractC0753ik.m3440h(i, i2, size());
        if (iM3440h == 0) {
            return AbstractC0753ik.f5042b;
        }
        return new C0606ek(this.f4216d, mo2591A() + i, iM3440h);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: w */
    public final String mo2998w(Charset charset) {
        return new String(this.f4216d, mo2591A(), size(), charset);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: y */
    public final void mo2999y(AbstractC1153np abstractC1153np) {
        abstractC1153np.mo3987r(mo2591A(), size(), this.f4216d);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m3000z(C0680gk c0680gk, int i, int i2) {
        if (i2 > c0680gk.size()) {
            lv1.m4303o(i2, size());
            return false;
        }
        int i3 = i + i2;
        if (i3 > c0680gk.size()) {
            StringBuilder sbM5345l = AbstractC1308pu.m5345l("Ran off end of other: ", i, ", ", i2, ", ");
            sbM5345l.append(c0680gk.size());
            throw new IllegalArgumentException(sbM5345l.toString());
        }
        if (!(c0680gk instanceof C0680gk)) {
            return c0680gk.mo2997u(i, i3).equals(mo2997u(0, i2));
        }
        byte[] bArr = c0680gk.f4216d;
        int iMo2591A = mo2591A() + i2;
        int iMo2591A2 = mo2591A();
        int iMo2591A3 = c0680gk.mo2591A() + i;
        while (iMo2591A2 < iMo2591A) {
            if (this.f4216d[iMo2591A2] != bArr[iMo2591A3]) {
                return false;
            }
            iMo2591A2++;
            iMo2591A3++;
        }
        return true;
    }
}
