package io.github.muntashirakon.adb;

import io.github.muntashirakon.crypto.spake2.Spake2Context;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.security.auth.Destroyable;
import p000.C0117c;
import p000.C0656fx;
import p000.C1627yg;
import p000.f40;
import p000.jd0;
import p000.lj0;
import p000.mj0;
import p000.nn1;
import p000.o21;
import p000.pp0;
import p000.qo0;
import p000.rh0;
import p000.sc2;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
class PairingAuthCtx implements Destroyable {
    public static final int GCM_IV_LENGTH = 12;
    private static final int HKDF_KEY_LENGTH = 16;
    private final byte[] mMsg;
    private final Spake2Context mSpake2Ctx;
    private static final byte[] CLIENT_NAME = StringCompat.getBytes("adb pair client\u0000", "UTF-8");
    private static final byte[] SERVER_NAME = StringCompat.getBytes("adb pair server\u0000", "UTF-8");
    private static final byte[] INFO = StringCompat.getBytes("adb pairing_auth aes-128-gcm key", "UTF-8");
    private final byte[] mSecretKey = new byte[16];
    private long mDecIv = 0;
    private long mEncIv = 0;
    private boolean mIsDestroyed = false;

    private PairingAuthCtx(Spake2Context spake2Context, byte[] bArr) {
        this.mSpake2Ctx = spake2Context;
        this.mMsg = spake2Context.m3464a(bArr);
    }

    public static PairingAuthCtx createAlice(byte[] bArr) {
        try {
            return new PairingAuthCtx(new Spake2Context(1, CLIENT_NAME, SERVER_NAME), bArr);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return null;
        }
    }

    public static PairingAuthCtx createBob(byte[] bArr) {
        try {
            return new PairingAuthCtx(new Spake2Context(2, SERVER_NAME, CLIENT_NAME), bArr);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0285  */
    /* JADX WARN: Code duplicated, block: B:104:0x0295  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bf A[LOOP:4: B:108:0x02bd->B:109:0x02bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x018f  */
    /* JADX WARN: Code duplicated, block: B:55:0x019e  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2 A[LOOP:5: B:56:0x01a0->B:57:0x01a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0203  */
    /* JADX WARN: Code duplicated, block: B:65:0x0205 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0207  */
    /* JADX WARN: Code duplicated, block: B:67:0x0209  */
    /* JADX WARN: Code duplicated, block: B:70:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0215  */
    /* JADX WARN: Code duplicated, block: B:73:0x021c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0220  */
    /* JADX WARN: Code duplicated, block: B:76:0x0222  */
    /* JADX WARN: Code duplicated, block: B:77:0x0223 A[PHI: r3
  0x0223: PHI (r3v26 int) = (r3v25 int), (r3v29 int) binds: [B:72:0x021a, B:76:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0238  */
    /* JADX WARN: Code duplicated, block: B:87:0x023c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0243  */
    /* JADX WARN: Code duplicated, block: B:91:0x024e  */
    /* JADX WARN: Code duplicated, block: B:92:0x025a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0261 A[LOOP:3: B:94:0x025f->B:95:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0274  */
    /* JADX WARN: Code duplicated, block: B:99:0x027d  */
    private byte[] encryptDecrypt(boolean z, byte[] bArr, byte[] bArr2) {
        String strM3609g;
        byte b;
        boolean z2;
        byte[] bArr3;
        byte[] bArr4;
        int length;
        int i;
        byte[] bArr5;
        int length2;
        boolean z3;
        int i2;
        int i3;
        byte[] bArr6;
        int length3;
        int i4;
        byte[] bArr7;
        int i5;
        int i6;
        int i7;
        int length4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr8;
        int i15;
        int i16;
        int i17;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11 = bArr;
        if (this.mIsDestroyed) {
            return null;
        }
        C1627yg c1627yg = new C1627yg(this.mSecretKey);
        int length5 = this.mSecretKey.length * 8;
        byte[] bArrM6061e = sc2.m6061e(bArr2);
        C0117c c0117c = new C0117c();
        rh0 rh0Var = new rh0();
        boolean z4 = false;
        qo0 qo0Var = new qo0(23, z4);
        rh0Var.f10022a = c0117c;
        rh0Var.f10023b = qo0Var;
        rh0Var.f10025d = z;
        rh0Var.f10034m = null;
        byte b2 = 1;
        rh0Var.f10026e = true;
        byte[] bArrM6061e2 = sc2.m6061e(bArrM6061e);
        rh0Var.f10030i = sc2.m6061e(null);
        char c = ' ';
        if (length5 < 32 || length5 > 128 || length5 % 8 != 0) {
            strM3609g = jd0.m3609g(length5, "Invalid value for MAC size: ");
        } else {
            int i18 = length5 / 8;
            rh0Var.f10027f = i18;
            rh0Var.f10033l = new byte[z ? 16 : i18 + 16];
            if (bArrM6061e2 == null || bArrM6061e2.length < 1) {
                strM3609g = "IV must be at least 1 byte";
            } else {
                byte[] bArr12 = c1627yg.f12975a;
                if (!z || (bArr9 = rh0Var.f10029h) == null || !Arrays.equals(bArr9, bArrM6061e2) || (bArr10 = rh0Var.f10028g) == null || !Arrays.equals(bArr10, bArr12)) {
                    rh0Var.f10029h = bArrM6061e2;
                    rh0Var.f10028g = bArr12;
                    c0117c.m1092b(c1627yg);
                    byte[] bArr13 = new byte[16];
                    rh0Var.f10031j = bArr13;
                    c0117c.m1093c(0, 0, bArr13, bArr13);
                    byte[] bArr14 = rh0Var.f10031j;
                    int i19 = 2;
                    if (((long[][]) qo0Var.f9549c) != null) {
                        byte[] bArr15 = (byte[]) qo0Var.f9548b;
                        int i20 = 0;
                        for (int i21 = 0; i21 < 16; i21++) {
                            i20 |= bArr15[i21] ^ bArr14[i21];
                        }
                        if (((byte) ((((i20 >>> 1) | (i20 & 1)) - 1) >> 31)) != 0) {
                            b = 1;
                            z2 = false;
                        }
                        rh0Var.f10024c = null;
                        bArr3 = new byte[16];
                        rh0Var.f10032k = bArr3;
                        bArr4 = rh0Var.f10029h;
                        if (bArr4.length == 12) {
                            boolean z5 = z2;
                            System.arraycopy(bArr4, z5 ? 1 : 0, bArr3, z5 ? 1 : 0, bArr4.length);
                            rh0Var.f10032k[15] = b;
                        } else {
                            length = bArr4.length;
                            for (i = 0; i < length; i += 16) {
                                rh0Var.m5851e(i, Math.min(length - i, 16), bArr3, bArr4);
                            }
                            byte[] bArr16 = new byte[16];
                            sc2.m6034D(bArr16, ((long) rh0Var.f10029h.length) * 8, 8);
                            byte[] bArr17 = rh0Var.f10032k;
                            o21.m4636B0(bArr17, bArr16);
                            rh0Var.f10023b.m5596S(bArr17);
                        }
                        rh0Var.f10035n = new byte[16];
                        rh0Var.f10036o = new byte[16];
                        rh0Var.f10037p = new byte[16];
                        rh0Var.f10042u = new byte[16];
                        rh0Var.f10043v = 0;
                        rh0Var.f10044w = 0L;
                        rh0Var.f10045x = 0L;
                        rh0Var.f10038q = sc2.m6061e(rh0Var.f10032k);
                        rh0Var.f10039r = -2;
                        rh0Var.f10040s = 0;
                        rh0Var.f10041t = 0L;
                        bArr5 = rh0Var.f10030i;
                        if (bArr5 != null) {
                            rh0Var.m5854h(bArr5.length, bArr5);
                        }
                        length2 = bArr11.length + rh0Var.f10040s;
                        z3 = rh0Var.f10025d;
                        i2 = rh0Var.f10027f;
                        if (z3) {
                            i3 = length2 + i2;
                        } else if (length2 < i2) {
                            i3 = 0;
                        } else {
                            i3 = length2 - i2;
                        }
                        bArr6 = new byte[i3];
                        length3 = bArr11.length;
                        rh0Var.m5847a();
                        if (bArr11.length >= length3) {
                            throw new C0656fx("Input buffer too short");
                        }
                        if (bArr11 == bArr6) {
                            i15 = rh0Var.f10040s + length3;
                            if (rh0Var.f10025d) {
                                i16 = i15 - (i15 % 16);
                            } else {
                                i17 = rh0Var.f10027f;
                                if (i15 < i17) {
                                    i16 = 0;
                                } else {
                                    i15 -= i17;
                                    i16 = i15 - (i15 % 16);
                                }
                            }
                            if (length3 > 0 && i16 > 0 && i16 > 0 && length3 > 0) {
                                bArr11 = new byte[length3];
                                System.arraycopy(bArr6, 0, bArr11, 0, length3);
                            }
                        }
                        if (rh0Var.f10025d) {
                            i11 = rh0Var.f10040s;
                            if (i11 > 0) {
                                i12 = 16 - i11;
                                bArr8 = rh0Var.f10033l;
                                i4 = 0;
                                if (length3 < i12) {
                                    System.arraycopy(bArr11, 0, bArr8, i11, length3);
                                    rh0Var.f10040s += length3;
                                    i10 = i4;
                                } else {
                                    System.arraycopy(bArr11, 0, bArr8, i11, i12);
                                    rh0Var.m5850d(0, 0, rh0Var.f10033l, bArr6);
                                    length3 -= i12;
                                    i13 = 16;
                                }
                            } else {
                                i12 = 0;
                                i13 = 0;
                            }
                            int i22 = length3 + i12;
                            i14 = i22 - 16;
                            while (i12 <= i14) {
                                rh0Var.m5850d(i12, i13, bArr11, bArr6);
                                i12 += 16;
                                i13 += 16;
                            }
                            int i23 = i22 - i12;
                            rh0Var.f10040s = i23;
                            System.arraycopy(bArr11, i12, rh0Var.f10033l, 0, i23);
                            i10 = i13;
                        } else {
                            i4 = 0;
                            bArr7 = rh0Var.f10033l;
                            int length6 = bArr7.length;
                            i5 = rh0Var.f10040s;
                            i6 = length6 - i5;
                            if (length3 < i6) {
                                System.arraycopy(bArr11, 0, bArr7, i5, length3);
                                rh0Var.f10040s += length3;
                                i10 = i4;
                            } else {
                                if (i5 >= 16) {
                                    rh0Var.m5848b(0, 0, bArr7, bArr6);
                                    byte[] bArr18 = rh0Var.f10033l;
                                    int i24 = rh0Var.f10040s - 16;
                                    rh0Var.f10040s = i24;
                                    System.arraycopy(bArr18, 16, bArr18, 0, i24);
                                    if (length3 < i6 + 16) {
                                        System.arraycopy(bArr11, 0, rh0Var.f10033l, rh0Var.f10040s, length3);
                                        rh0Var.f10040s += length3;
                                        i10 = 16;
                                    } else {
                                        i7 = 16;
                                    }
                                } else {
                                    i7 = 0;
                                }
                                byte[] bArr19 = rh0Var.f10033l;
                                length4 = length3 - bArr19.length;
                                int i25 = rh0Var.f10040s;
                                i8 = 16 - i25;
                                System.arraycopy(bArr11, 0, bArr19, i25, i8);
                                rh0Var.m5848b(0, i7, rh0Var.f10033l, bArr6);
                                i9 = i7 + 16;
                                while (i8 <= length4) {
                                    rh0Var.m5848b(i8, i9, bArr11, bArr6);
                                    i8 += 16;
                                    i9 += 16;
                                }
                                byte[] bArr20 = rh0Var.f10033l;
                                int length7 = (bArr20.length + length4) - i8;
                                rh0Var.f10040s = length7;
                                System.arraycopy(bArr11, i8, bArr20, 0, length7);
                                i10 = i9;
                            }
                        }
                        try {
                            rh0Var.m5849c(i10, bArr6);
                            return bArr6;
                        } catch (pp0 unused) {
                            return null;
                        }
                    }
                    qo0Var.f9549c = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
                    byte[] bArr21 = new byte[16];
                    qo0Var.f9548b = bArr21;
                    for (int i26 = 0; i26 < 16; i26++) {
                        bArr21[i26] = bArr14[i26];
                    }
                    byte[] bArr22 = (byte[]) qo0Var.f9548b;
                    long[] jArr = ((long[][]) qo0Var.f9549c)[1];
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i19) {
                        jArr[i27] = ((((long) sc2.m6058b(i28, bArr22)) & 4294967295L) << c) | (((long) sc2.m6058b(i28 + 4, bArr22)) & 4294967295L);
                        i28 += 8;
                        i27++;
                        i19 = i19;
                        z4 = z4;
                        b2 = b2;
                        c = ' ';
                    }
                    int i29 = i19;
                    b = b2;
                    z2 = z4;
                    long[] jArr2 = ((long[][]) qo0Var.f9549c)[b];
                    long j = jArr2[z2 ? 1 : 0];
                    long j2 = jArr2[b];
                    long j3 = j2 << 57;
                    jArr2[z2 ? 1 : 0] = ((((j >>> 7) ^ j3) ^ (j3 >>> b)) ^ (j3 >>> i29)) ^ (j3 >>> 7);
                    jArr2[b] = (j << 57) | (j2 >>> 7);
                    for (int i30 = i29; i30 < 256; i30 += 2) {
                        long[][] jArr3 = (long[][]) qo0Var.f9549c;
                        long[] jArr4 = jArr3[i30 >> 1];
                        long[] jArr5 = jArr3[i30];
                        long j4 = jArr4[z2 ? 1 : 0];
                        long j5 = jArr4[b];
                        long j6 = j4 >> 63;
                        long j7 = ((j4 ^ (j6 & (-2233785415175766016L))) << b) | (j5 >>> 63);
                        jArr5[z2 ? 1 : 0] = j7;
                        long j8 = (j5 << b) | (-j6);
                        jArr5[b] = j8;
                        long[] jArr6 = jArr3[b];
                        long[] jArr7 = jArr3[i30 + 1];
                        jArr7[z2 ? 1 : 0] = j7 ^ jArr6[z2 ? 1 : 0];
                        jArr7[b] = jArr6[b] ^ j8;
                    }
                    rh0Var.f10024c = null;
                    bArr3 = new byte[16];
                    rh0Var.f10032k = bArr3;
                    bArr4 = rh0Var.f10029h;
                    if (bArr4.length == 12) {
                        boolean z6 = z2;
                        System.arraycopy(bArr4, z6 ? 1 : 0, bArr3, z6 ? 1 : 0, bArr4.length);
                        rh0Var.f10032k[15] = b;
                    } else {
                        length = bArr4.length;
                        while (i < length) {
                            rh0Var.m5851e(i, Math.min(length - i, 16), bArr3, bArr4);
                        }
                        byte[] bArr110 = new byte[16];
                        sc2.m6034D(bArr110, ((long) rh0Var.f10029h.length) * 8, 8);
                        byte[] bArr111 = rh0Var.f10032k;
                        o21.m4636B0(bArr111, bArr110);
                        rh0Var.f10023b.m5596S(bArr111);
                    }
                    rh0Var.f10035n = new byte[16];
                    rh0Var.f10036o = new byte[16];
                    rh0Var.f10037p = new byte[16];
                    rh0Var.f10042u = new byte[16];
                    rh0Var.f10043v = 0;
                    rh0Var.f10044w = 0L;
                    rh0Var.f10045x = 0L;
                    rh0Var.f10038q = sc2.m6061e(rh0Var.f10032k);
                    rh0Var.f10039r = -2;
                    rh0Var.f10040s = 0;
                    rh0Var.f10041t = 0L;
                    bArr5 = rh0Var.f10030i;
                    if (bArr5 != null) {
                        rh0Var.m5854h(bArr5.length, bArr5);
                    }
                    length2 = bArr11.length + rh0Var.f10040s;
                    z3 = rh0Var.f10025d;
                    i2 = rh0Var.f10027f;
                    if (z3) {
                        i3 = length2 + i2;
                    } else if (length2 < i2) {
                        i3 = 0;
                    } else {
                        i3 = length2 - i2;
                    }
                    bArr6 = new byte[i3];
                    length3 = bArr11.length;
                    rh0Var.m5847a();
                    if (bArr11.length >= length3) {
                        throw new C0656fx("Input buffer too short");
                    }
                    if (bArr11 == bArr6) {
                        i15 = rh0Var.f10040s + length3;
                        if (rh0Var.f10025d) {
                            i16 = i15 - (i15 % 16);
                        } else {
                            i17 = rh0Var.f10027f;
                            if (i15 < i17) {
                                i16 = 0;
                            } else {
                                i15 -= i17;
                                i16 = i15 - (i15 % 16);
                            }
                        }
                        if (length3 > 0) {
                            bArr11 = new byte[length3];
                            System.arraycopy(bArr6, 0, bArr11, 0, length3);
                        }
                    }
                    if (rh0Var.f10025d) {
                        i11 = rh0Var.f10040s;
                        if (i11 > 0) {
                            i12 = 16 - i11;
                            bArr8 = rh0Var.f10033l;
                            i4 = 0;
                            if (length3 < i12) {
                                System.arraycopy(bArr11, 0, bArr8, i11, length3);
                                rh0Var.f10040s += length3;
                                i10 = i4;
                            } else {
                                System.arraycopy(bArr11, 0, bArr8, i11, i12);
                                rh0Var.m5850d(0, 0, rh0Var.f10033l, bArr6);
                                length3 -= i12;
                                i13 = 16;
                            }
                        } else {
                            i12 = 0;
                            i13 = 0;
                        }
                        int i210 = length3 + i12;
                        i14 = i210 - 16;
                        while (i12 <= i14) {
                            rh0Var.m5850d(i12, i13, bArr11, bArr6);
                            i12 += 16;
                            i13 += 16;
                        }
                        int i211 = i210 - i12;
                        rh0Var.f10040s = i211;
                        System.arraycopy(bArr11, i12, rh0Var.f10033l, 0, i211);
                        i10 = i13;
                    } else {
                        i4 = 0;
                        bArr7 = rh0Var.f10033l;
                        int length8 = bArr7.length;
                        i5 = rh0Var.f10040s;
                        i6 = length8 - i5;
                        if (length3 < i6) {
                            System.arraycopy(bArr11, 0, bArr7, i5, length3);
                            rh0Var.f10040s += length3;
                            i10 = i4;
                        } else {
                            if (i5 >= 16) {
                                rh0Var.m5848b(0, 0, bArr7, bArr6);
                                byte[] bArr112 = rh0Var.f10033l;
                                int i212 = rh0Var.f10040s - 16;
                                rh0Var.f10040s = i212;
                                System.arraycopy(bArr112, 16, bArr112, 0, i212);
                                if (length3 < i6 + 16) {
                                    System.arraycopy(bArr11, 0, rh0Var.f10033l, rh0Var.f10040s, length3);
                                    rh0Var.f10040s += length3;
                                    i10 = 16;
                                } else {
                                    i7 = 16;
                                }
                            } else {
                                i7 = 0;
                            }
                            byte[] bArr113 = rh0Var.f10033l;
                            length4 = length3 - bArr113.length;
                            int i213 = rh0Var.f10040s;
                            i8 = 16 - i213;
                            System.arraycopy(bArr11, 0, bArr113, i213, i8);
                            rh0Var.m5848b(0, i7, rh0Var.f10033l, bArr6);
                            i9 = i7 + 16;
                            while (i8 <= length4) {
                                rh0Var.m5848b(i8, i9, bArr11, bArr6);
                                i8 += 16;
                                i9 += 16;
                            }
                            byte[] bArr23 = rh0Var.f10033l;
                            int length9 = (bArr23.length + length4) - i8;
                            rh0Var.f10040s = length9;
                            System.arraycopy(bArr11, i8, bArr23, 0, length9);
                            i10 = i9;
                        }
                    }
                    rh0Var.m5849c(i10, bArr6);
                    return bArr6;
                }
                strM3609g = "cannot reuse nonce for GCM encryption";
            }
        }
        f40.m2713i(strM3609g);
        return null;
    }

    public byte[] decrypt(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        long j = this.mDecIv;
        this.mDecIv = 1 + j;
        return encryptDecrypt(false, bArr, byteBufferOrder.putLong(j).array());
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        this.mIsDestroyed = true;
        Arrays.fill(this.mSecretKey, (byte) 0);
        this.mSpake2Ctx.destroy();
    }

    public byte[] encrypt(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        long j = this.mEncIv;
        this.mEncIv = 1 + j;
        return encryptDecrypt(true, bArr, byteBufferOrder.putLong(j).array());
    }

    public byte[] getMsg() {
        return this.mMsg;
    }

    public boolean initCipher(byte[] bArr) {
        if (this.mIsDestroyed) {
            return false;
        }
        byte[] bArrM3465b = this.mSpake2Ctx.m3465b(bArr);
        nn1 nn1Var = new nn1();
        lj0 lj0Var = new lj0();
        mj0 mj0Var = new mj0();
        mj0Var.f7003a = nn1Var;
        mj0Var.f7004b = 32;
        mj0Var.f7005c = 64;
        mj0Var.f7008f = new byte[64];
        mj0Var.f7009g = new byte[96];
        lj0Var.f6364c = mj0Var;
        lj0Var.f6362a = 32;
        byte[] bArr2 = INFO;
        byte[] bArrM6061e = sc2.m6061e(bArrM3465b);
        byte[] bArrM6061e2 = bArr2 == null ? new byte[0] : sc2.m6061e(bArr2);
        byte[] bArrM6061e3 = sc2.m6061e(bArrM6061e);
        mj0Var.m4427b(new C1627yg(new byte[32]));
        nn1Var.mo729e(0, bArrM6061e3.length, bArrM6061e3);
        byte[] bArr3 = new byte[32];
        mj0Var.m4426a(bArr3);
        mj0Var.m4427b(new C1627yg(bArr3));
        lj0Var.f6365d = sc2.m6061e(bArrM6061e2);
        lj0Var.f6363b = 0;
        lj0Var.f6366e = new byte[32];
        byte[] bArr4 = this.mSecretKey;
        int length = bArr4.length;
        if (length > 8160) {
            throw new C0656fx("HKDF may only be used for 255 * HashLen bytes of output");
        }
        lj0Var.m4221b();
        int i = lj0Var.f6363b % 32;
        int iMin = Math.min(32 - i, length);
        System.arraycopy((byte[]) lj0Var.f6366e, i, bArr4, 0, iMin);
        lj0Var.f6363b += iMin;
        int i2 = length - iMin;
        while (i2 > 0) {
            lj0Var.m4221b();
            int iMin2 = Math.min(32, i2);
            System.arraycopy((byte[]) lj0Var.f6366e, 0, bArr4, iMin, iMin2);
            lj0Var.f6363b += iMin2;
            i2 -= iMin2;
            iMin += iMin2;
        }
        return true;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }
}
