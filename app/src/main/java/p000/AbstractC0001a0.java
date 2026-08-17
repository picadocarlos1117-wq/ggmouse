package p000;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0001a0 extends AbstractC1536w implements Iterable {

    /* JADX INFO: renamed from: c */
    public static final C0549d f1c = new C0549d(AbstractC0001a0.class, 6);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0696h[] f2a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0696h[] f3b;

    public AbstractC0001a0(C0733i c0733i) {
        if (c0733i == null) {
            l41.m4051t("'elementVector' cannot be null");
            throw null;
        }
        InterfaceC0696h[] interfaceC0696hArrM3326d = c0733i.m3326d();
        this.f2a = interfaceC0696hArrM3326d;
        this.f3b = interfaceC0696hArrM3326d.length < 2 ? interfaceC0696hArrM3326d : null;
    }

    /* JADX INFO: renamed from: u */
    public static byte[] m0u(InterfaceC0696h interfaceC0696h) {
        try {
            return interfaceC0696h.mo696b().m4629i();
        } catch (IOException unused) {
            f40.m2713i("cannot encode object added to SET");
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m1v(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        InterfaceC0696h[] interfaceC0696hArr = this.f2a;
        int length = interfaceC0696hArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += interfaceC0696hArr[length].mo696b().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC0696h[] interfaceC0696hArr = this.f2a;
        return new C1657z9(interfaceC0696hArr.length < 1 ? C0733i.f4750e : (InterfaceC0696h[]) interfaceC0696hArr.clone(), 1);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof AbstractC0001a0) {
            AbstractC0001a0 abstractC0001a0 = (AbstractC0001a0) abstractC1536w;
            int length = this.f2a.length;
            if (abstractC0001a0.f2a.length == length) {
                C1347qw c1347qw = (C1347qw) mo4s();
                C1347qw c1347qw2 = (C1347qw) abstractC0001a0.mo4s();
                for (int i = 0; i < length; i++) {
                    AbstractC1536w abstractC1536wMo696b = c1347qw.f2a[i].mo696b();
                    AbstractC1536w abstractC1536wMo696b2 = c1347qw2.f2a[i].mo696b();
                    if (abstractC1536wMo696b == abstractC1536wMo696b2 || abstractC1536wMo696b.mo2j(abstractC1536wMo696b2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return true;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        int i;
        boolean z = true;
        if (this.f3b == null) {
            InterfaceC0696h[] interfaceC0696hArr = (InterfaceC0696h[]) this.f2a.clone();
            this.f3b = interfaceC0696hArr;
            int length = interfaceC0696hArr.length;
            if (length >= 2) {
                InterfaceC0696h interfaceC0696h = interfaceC0696hArr[0];
                InterfaceC0696h interfaceC0696h2 = interfaceC0696hArr[1];
                byte[] bArrM0u = m0u(interfaceC0696h);
                byte[] bArrM0u2 = m0u(interfaceC0696h2);
                if (m1v(bArrM0u2, bArrM0u)) {
                    interfaceC0696h2 = interfaceC0696h;
                    interfaceC0696h = interfaceC0696h2;
                    bArrM0u2 = bArrM0u;
                    bArrM0u = bArrM0u2;
                }
                for (int i2 = 2; i2 < length; i2++) {
                    InterfaceC0696h interfaceC0696h3 = interfaceC0696hArr[i2];
                    byte[] bArrM0u3 = m0u(interfaceC0696h3);
                    if (m1v(bArrM0u2, bArrM0u3)) {
                        interfaceC0696hArr[i2 - 2] = interfaceC0696h;
                        interfaceC0696h = interfaceC0696h2;
                        bArrM0u = bArrM0u2;
                        interfaceC0696h2 = interfaceC0696h3;
                        bArrM0u2 = bArrM0u3;
                    } else if (m1v(bArrM0u, bArrM0u3)) {
                        interfaceC0696hArr[i2 - 2] = interfaceC0696h;
                        interfaceC0696h = interfaceC0696h3;
                        bArrM0u = bArrM0u3;
                    } else {
                        int i3 = i2 - 1;
                        while (true) {
                            i = i3 - 1;
                            if (i <= 0) {
                                break;
                            }
                            InterfaceC0696h interfaceC0696h4 = interfaceC0696hArr[i3 - 2];
                            if (m1v(m0u(interfaceC0696h4), bArrM0u3)) {
                                break;
                            }
                            interfaceC0696hArr[i] = interfaceC0696h4;
                            i3 = i;
                        }
                        interfaceC0696hArr[i] = interfaceC0696h3;
                    }
                }
                interfaceC0696hArr[length - 2] = interfaceC0696h;
                interfaceC0696hArr[length - 1] = interfaceC0696h2;
            }
        }
        C1347qw c1347qw = new C1347qw(z, this.f3b);
        c1347qw.f9591e = -1;
        return c1347qw;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public AbstractC1536w mo5t() {
        C1347qw c1347qw = new C1347qw(this.f2a, this.f3b);
        c1347qw.f9591e = -1;
        return c1347qw;
    }

    public final String toString() {
        InterfaceC0696h[] interfaceC0696hArr = this.f2a;
        int length = interfaceC0696hArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(interfaceC0696hArr[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC0001a0() {
        InterfaceC0696h[] interfaceC0696hArr = C0733i.f4750e;
        this.f2a = interfaceC0696hArr;
        this.f3b = interfaceC0696hArr;
    }

    public AbstractC0001a0(boolean z, InterfaceC0696h[] interfaceC0696hArr) {
        this.f2a = interfaceC0696hArr;
        if (!z && interfaceC0696hArr.length >= 2) {
            interfaceC0696hArr = null;
        }
        this.f3b = interfaceC0696hArr;
    }

    public AbstractC0001a0(InterfaceC0696h[] interfaceC0696hArr, InterfaceC0696h[] interfaceC0696hArr2) {
        this.f2a = interfaceC0696hArr;
        this.f3b = interfaceC0696hArr2;
    }
}
