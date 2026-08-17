package io.github.muntashirakon.adb;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p000.AbstractC1590xg;
import p000.jd0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
final class AndroidPubkey {
    public static final int ANDROID_PUBKEY_ENCODED_SIZE = 524;
    public static final int ANDROID_PUBKEY_MODULUS_SIZE = 256;
    public static final int ANDROID_PUBKEY_MODULUS_SIZE_WORDS = 64;
    private static final byte[] RSA_SHA_PKCS1_SIGNATURE_PADDING;
    private static final int[] SIGNATURE_PADDING_AS_INT;

    static {
        int[] iArr = {0, 1, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 48, 33, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 4, 20};
        SIGNATURE_PADDING_AS_INT = iArr;
        RSA_SHA_PKCS1_SIGNATURE_PADDING = new byte[iArr.length];
        int i = 0;
        while (true) {
            byte[] bArr = RSA_SHA_PKCS1_SIGNATURE_PADDING;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = (byte) SIGNATURE_PADDING_AS_INT[i];
            i++;
        }
    }

    private static byte[] BigEndianToLittleEndianPadded(int i, BigInteger bigInteger) {
        byte[] bArr = new byte[i];
        byte[] bArrSwapEndianness = swapEndianness(bigInteger.toByteArray());
        int length = bArrSwapEndianness.length;
        if (i >= length) {
            i = length;
        } else if (!fitsInBytes(bArrSwapEndianness, length, i)) {
            return null;
        }
        System.arraycopy(bArrSwapEndianness, 0, bArr, 0, i);
        return bArr;
    }

    public static byte[] adbAuthSign(PrivateKey privateKey, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(1, privateKey);
        cipher.update(RSA_SHA_PKCS1_SIGNATURE_PADDING);
        return cipher.doFinal(bArr);
    }

    public static RSAPublicKey decode(byte[] bArr) throws InvalidKeyException {
        if (bArr.length < 524) {
            l41.m4039h("Invalid key length");
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (byteBufferOrder.getInt() != 64) {
            l41.m4039h("Invalid modulus length.");
            return null;
        }
        byte[] bArr2 = new byte[256];
        byteBufferOrder.position(8);
        byteBufferOrder.get(bArr2);
        BigInteger bigInteger = new BigInteger(1, swapEndianness(bArr2));
        byteBufferOrder.position(520);
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, BigInteger.valueOf(byteBufferOrder.getInt())));
    }

    public static byte[] encode(RSAPublicKey rSAPublicKey) throws InvalidKeyException {
        if (rSAPublicKey.getModulus().toByteArray().length < 256) {
            throw new InvalidKeyException("Invalid key length " + rSAPublicKey.getModulus().toByteArray().length);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(ANDROID_PUBKEY_ENCODED_SIZE).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(64);
        BigInteger bigInteger = BigInteger.ZERO;
        BigInteger bit = bigInteger.setBit(32);
        byteBufferOrder.putInt(bit.subtract(rSAPublicKey.getModulus().mod(bit).modInverse(bit)).intValue());
        byte[] bArrBigEndianToLittleEndianPadded = BigEndianToLittleEndianPadded(256, rSAPublicKey.getModulus());
        Objects.requireNonNull(bArrBigEndianToLittleEndianPadded);
        byteBufferOrder.put(bArrBigEndianToLittleEndianPadded);
        byte[] bArrBigEndianToLittleEndianPadded2 = BigEndianToLittleEndianPadded(256, bigInteger.setBit(2048).modPow(BigInteger.valueOf(2L), rSAPublicKey.getModulus()));
        Objects.requireNonNull(bArrBigEndianToLittleEndianPadded2);
        byteBufferOrder.put(bArrBigEndianToLittleEndianPadded2);
        byteBufferOrder.putInt(rSAPublicKey.getPublicExponent().intValue());
        return byteBufferOrder.array();
    }

    public static byte[] encodeWithName(RSAPublicKey rSAPublicKey, String str) {
        ByteArrayNoThrowOutputStream byteArrayNoThrowOutputStream = new ByteArrayNoThrowOutputStream(str.length() + (((int) Math.ceil(174.66666666666666d)) * 4) + 2);
        try {
            byteArrayNoThrowOutputStream.write(AbstractC1590xg.m6923a(encode(rSAPublicKey)));
            byteArrayNoThrowOutputStream.write(getUserInfo(str));
            byte[] byteArray = byteArrayNoThrowOutputStream.toByteArray();
            byteArrayNoThrowOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayNoThrowOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean fitsInBytes(byte[] bArr, int i, int i2) {
        byte b = 0;
        while (i2 < i) {
            b = (byte) (b | bArr[i2]);
            i2++;
        }
        return b == 0;
    }

    public static byte[] getUserInfo(String str) {
        return StringCompat.getBytes(jd0.m3615m(" ", str, "\u0000"), "UTF-8");
    }

    private static byte[] swapEndianness(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[(length - i) - 1];
        }
        return bArr2;
    }
}
