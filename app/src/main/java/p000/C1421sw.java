package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: sw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1421sw extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f10567a;

    public C1421sw(byte[] bArr) {
        this.f10567a = bArr;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f10567a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C1421sw) {
            return Arrays.equals(this.f10567a, ((C1421sw) abstractC1536w).f10567a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(12, z, this.f10567a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f10567a.length, z);
    }

    public final String toString() {
        String str = yv1.f13156a;
        byte[] bArr = this.f10567a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = v32.f11502a;
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = v32.f11502a[b & 127];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i3 < length2) {
                            int i5 = i3 + 1;
                            byte b3 = bArr[i3];
                            i4 = (i4 << 6) | (b3 & 63);
                            b2 = v32.f11503b[b2 + ((b3 & 255) >>> 4)];
                            i3 = i5;
                        }
                    } else if (b2 != -2) {
                        if (i4 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i4;
                                i2++;
                                i = i3;
                            }
                        } else if (i2 < length - 1) {
                            int i6 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 += 2;
                            cArr[i6] = (char) ((i4 & 1023) | 56320);
                            i = i3;
                        }
                    }
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i = i3;
            i2++;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        f40.m2713i("Invalid UTF-8 input");
        return null;
    }
}
