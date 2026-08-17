package p000;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: dw */
/* JADX INFO: loaded from: classes3.dex */
public final class C0581dw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final char[] f3036a;

    public C0581dw(char[] cArr) {
        this.f3036a = cArr;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        char[] cArr = this.f3036a;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C0581dw) {
            return Arrays.equals(this.f3036a, ((C0581dw) abstractC1536w).f3036a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) throws IOException {
        char[] cArr = this.f3036a;
        int length = cArr.length;
        c1462u.m6370p(30, z);
        c1462u.m6366k(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            c1462u.m6365j(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            c1462u.m6365j(bArr, 0, i3);
        }
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f3036a.length * 2, z);
    }

    public final String toString() {
        return new String(this.f3036a);
    }
}
