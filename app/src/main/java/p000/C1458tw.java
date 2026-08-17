package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: tw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1458tw extends AbstractC1536w {

    /* JADX INFO: renamed from: b */
    public static final char[] f11025b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final byte[] f11026a;

    public C1458tw(byte[] bArr) {
        this.f11026a = bArr;
    }

    /* JADX INFO: renamed from: u */
    public static void m6346u(StringBuffer stringBuffer, int i) {
        char[] cArr = f11025b;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f11026a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1458tw) {
            return Arrays.equals(this.f11026a, ((C1458tw) abstractC1536w).f11026a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(28, z, this.f11026a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f11026a.length, z);
    }

    public final String toString() {
        int i;
        byte[] bArr = this.f11026a;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((C1462u.m6357e(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            m6346u(stringBuffer, length);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                m6346u(stringBuffer, bArr2[i4]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            m6346u(stringBuffer, b);
        }
        return stringBuffer.toString();
    }
}
