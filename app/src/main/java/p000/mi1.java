package p000;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class mi1 extends SecureRandom {

    /* JADX INFO: renamed from: a */
    public final byte[] f6997a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6998b;

    public mi1(byte[] bArr, aw0 aw0Var) {
        if (bArr.length >= 48) {
            byte[] bArr2 = new byte[48];
            System.arraycopy(bArr, 0, bArr2, 0, 48);
            byte[] bArr3 = new byte[32];
            this.f6997a = bArr3;
            byte[] bArr4 = new byte[16];
            this.f6998b = bArr4;
            m4424a(bArr2, bArr3, bArr4);
            return;
        }
        int length = 48 - bArr.length;
        int iMo3528g = aw0Var.mo3528g();
        aw0Var.mo729e(0, bArr.length, bArr);
        byte[] bArr5 = new byte[iMo3528g];
        aw0Var.mo3526b(0, bArr5);
        if (length != iMo3528g) {
            if (length < iMo3528g) {
                byte[] bArr6 = new byte[length];
                System.arraycopy(bArr5, 0, bArr6, 0, Math.min(iMo3528g, length));
                bArr5 = bArr6;
            } else {
                byte[] bArrM6064h = new byte[iMo3528g];
                System.arraycopy(bArr5, 0, bArrM6064h, 0, Math.min(iMo3528g, iMo3528g));
                while (true) {
                    length -= iMo3528g;
                    if (length < iMo3528g) {
                        break;
                    }
                    aw0Var.mo729e(0, iMo3528g, bArr5);
                    bArr5 = new byte[iMo3528g];
                    aw0Var.mo3526b(0, bArr5);
                    bArrM6064h = sc2.m6064h(bArrM6064h, bArr5);
                }
                if (length > 0) {
                    aw0Var.mo729e(0, iMo3528g, bArr5);
                    byte[] bArr7 = new byte[iMo3528g];
                    aw0Var.mo3526b(0, bArr7);
                    int length2 = bArrM6064h.length;
                    int i = length2 + length;
                    byte[] bArr8 = new byte[i];
                    System.arraycopy(bArrM6064h, 0, bArr8, 0, Math.min(bArrM6064h.length, i));
                    System.arraycopy(bArr7, 0, bArr8, length2, length);
                    bArr5 = bArr8;
                } else {
                    bArr5 = bArrM6064h;
                }
            }
        }
        byte[] bArr9 = new byte[48];
        System.arraycopy(sc2.m6064h(bArr, bArr5), 0, bArr9, 0, 48);
        byte[] bArr10 = new byte[32];
        this.f6997a = bArr10;
        byte[] bArr11 = new byte[16];
        this.f6998b = bArr11;
        m4424a(bArr9, bArr10, bArr11);
    }

    /* JADX INFO: renamed from: a */
    public static void m4424a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            for (int i2 = 15; i2 >= 0; i2--) {
                byte b = bArr3[i2];
                if ((b & 255) != 255) {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                }
                bArr3[i2] = 0;
            }
            m4425b(bArr2, bArr3, i * 16, bArr4);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    /* JADX INFO: renamed from: b */
    public static void m4425b(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        try {
            C0117c c0117c = new C0117c();
            c0117c.m1092b(new C1627yg(bArr));
            for (int i2 = 0; i2 != bArr2.length; i2 += 16) {
                c0117c.m1093c(i2, i + i2, bArr2, bArr3);
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: " + th.getMessage(), th);
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (true) {
            byte[] bArr3 = this.f6997a;
            byte[] bArr4 = this.f6998b;
            if (length <= 0) {
                m4424a(null, bArr3, bArr4);
                return;
            }
            for (int i2 = 15; i2 >= 0; i2--) {
                byte b = bArr4[i2];
                if ((b & 255) != 255) {
                    bArr4[i2] = (byte) (b + 1);
                    break;
                }
                bArr4[i2] = 0;
            }
            m4425b(bArr3, bArr4, 0, bArr2);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
    }
}
