package p000;

/* JADX INFO: renamed from: hw */
/* JADX INFO: loaded from: classes3.dex */
public final class C0729hw extends C1053l {
    @Override // p000.C1053l, p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(24, z, m3304v());
    }

    @Override // p000.C1053l, p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(m3304v().length, z);
    }

    @Override // p000.C1053l, p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public final AbstractC1536w mo4s() {
        return this;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public final AbstractC1536w mo5t() {
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final byte[] m3304v() {
        byte[] bArr = this.f6119a;
        if (bArr[bArr.length - 1] == 90) {
            if (!m4016u(10) || !m4016u(11)) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                String str = yv1.f13156a;
                byte[] bArr3 = new byte[5];
                for (int i = 0; i != 5; i++) {
                    bArr3[i] = (byte) "0000Z".charAt(i);
                }
                System.arraycopy(bArr3, 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!m4016u(12) || !m4016u(13)) {
                byte[] bArr4 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr4, 0, bArr.length - 1);
                String str2 = yv1.f13156a;
                byte[] bArr5 = new byte[3];
                for (int i2 = 0; i2 != 3; i2++) {
                    bArr5[i2] = (byte) "00Z".charAt(i2);
                }
                System.arraycopy(bArr5, 0, bArr4, bArr.length - 1, 3);
                return bArr4;
            }
            for (int i3 = 0; i3 != bArr.length; i3++) {
                if (bArr[i3] == 46 && i3 == 14) {
                    int length = bArr.length - 2;
                    while (length > 0 && bArr[length] == 48) {
                        length--;
                    }
                    if (bArr[length] == 46) {
                        byte[] bArr6 = new byte[length + 1];
                        System.arraycopy(bArr, 0, bArr6, 0, length);
                        bArr6[length] = 90;
                        return bArr6;
                    }
                    byte[] bArr7 = new byte[length + 2];
                    int i4 = length + 1;
                    System.arraycopy(bArr, 0, bArr7, 0, i4);
                    bArr7[i4] = 90;
                    return bArr7;
                }
            }
        }
        return bArr;
    }
}
