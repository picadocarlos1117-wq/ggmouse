package org.conscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.f40;
import p000.jd0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLCipher extends CipherSpi {
    private int blockSize;
    byte[] encodedKey;
    private boolean encrypting;

    /* JADX INFO: renamed from: iv */
    byte[] f8444iv;
    Mode mode;
    private Padding padding;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum Mode {
        NONE,
        CBC,
        CTR,
        ECB,
        GCM,
        GCM_SIV,
        POLY1305;

        public static Mode getNormalized(String str) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.equals("GCM-SIV")) {
                return GCM_SIV;
            }
            if (!upperCase.equals("GCM_SIV")) {
                return valueOf(upperCase);
            }
            f40.m2713i("Invalid mode");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum Padding {
        NOPADDING,
        PKCS5PADDING,
        PKCS7PADDING;

        public static Padding getNormalized(String str) {
            Padding paddingValueOf = valueOf(str.toUpperCase(Locale.US));
            return paddingValueOf == PKCS7PADDING ? PKCS5PADDING : paddingValueOf;
        }
    }

    public OpenSSLCipher(Mode mode, Padding padding) {
        this.mode = Mode.ECB;
        Padding padding2 = Padding.NOPADDING;
        this.mode = mode;
        this.padding = padding;
        this.blockSize = getCipherBlockSize();
    }

    private byte[] checkAndSetEncodedKey(int i, Key key) throws InvalidKeyException {
        if (i == 1 || i == 3) {
            this.encrypting = true;
        } else {
            if (i != 2 && i != 4) {
                throw new InvalidParameterException(jd0.m3609g(i, "Unsupported opmode "));
            }
            this.encrypting = false;
        }
        if (!(key instanceof SecretKey)) {
            l41.m4039h("Only SecretKey is supported");
            return null;
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            l41.m4039h("key.getEncoded() == null");
            return null;
        }
        checkSupportedKeySize(encoded.length);
        this.encodedKey = encoded;
        return encoded;
    }

    public abstract void checkSupportedKeySize(int i);

    public abstract void checkSupportedMode(Mode mode);

    public abstract void checkSupportedPadding(Padding padding);

    public abstract int doFinalInternal(byte[] bArr, int i, int i2);

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        OpenSSLCipher openSSLCipher;
        int iUpdateInternal;
        int outputSizeForFinal = getOutputSizeForFinal(i2);
        byte[] bArr2 = new byte[outputSizeForFinal];
        if (i2 > 0) {
            openSSLCipher = this;
            try {
                iUpdateInternal = openSSLCipher.updateInternal(bArr, i, i2, bArr2, 0, outputSizeForFinal);
            } catch (ShortBufferException e) {
                l41.m4043l("our calculated buffer was too small", e);
                return null;
            }
        } else {
            openSSLCipher = this;
            iUpdateInternal = 0;
        }
        try {
            int iDoFinalInternal = iUpdateInternal + openSSLCipher.doFinalInternal(bArr2, iUpdateInternal, outputSizeForFinal - iUpdateInternal);
            if (iDoFinalInternal == outputSizeForFinal) {
                return bArr2;
            }
            return iDoFinalInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iDoFinalInternal);
        } catch (ShortBufferException e2) {
            l41.m4043l("our calculated buffer was too small", e2);
            return null;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.blockSize;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return this.f8444iv;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        if (!(key instanceof SecretKey)) {
            l41.m4039h("Only SecretKey is supported");
            return 0;
        }
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            checkSupportedKeySize(encoded.length);
            return encoded.length * 8;
        }
        l41.m4039h("key.getEncoded() == null");
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return Math.max(getOutputSizeForUpdate(i), getOutputSizeForFinal(i));
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f8444iv;
        if (bArr != null && bArr.length > 0) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(getBaseCipherName());
                algorithmParameters.init(new IvParameterSpec(this.f8444iv));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException | InvalidParameterSpecException unused) {
            }
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        checkAndSetEncodedKey(i, key);
        try {
            engineInitInternal(this.encodedKey, null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            ca0.m1184p(e);
        }
    }

    public abstract void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom);

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        try {
            Mode normalized = Mode.getNormalized(str);
            checkSupportedMode(normalized);
            this.mode = normalized;
        } catch (IllegalArgumentException e) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(AbstractC1308pu.m5339f("No such mode: ", str));
            noSuchAlgorithmException.initCause(e);
            throw noSuchAlgorithmException;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        try {
            Padding normalized = Padding.getNormalized(str);
            checkSupportedPadding(normalized);
            this.padding = normalized;
        } catch (IllegalArgumentException e) {
            NoSuchPaddingException noSuchPaddingException = new NoSuchPaddingException(AbstractC1308pu.m5339f("No such padding: ", str));
            noSuchPaddingException.initCause(e);
            throw noSuchPaddingException;
        }
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        try {
            byte[] bArrEngineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 1) {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
            }
            if (i == 2) {
                return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
            }
            if (i == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            throw new UnsupportedOperationException("wrappedKeyType == " + i);
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException(e);
        } catch (BadPaddingException e2) {
            throw new InvalidKeyException(e2);
        } catch (IllegalBlockSizeException e3) {
            throw new InvalidKeyException(e3);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int outputSizeForUpdate = getOutputSizeForUpdate(i2);
        byte[] bArr2 = outputSizeForUpdate > 0 ? new byte[outputSizeForUpdate] : EmptyArray.BYTE;
        try {
            int iUpdateInternal = updateInternal(bArr, i, i2, bArr2, 0, outputSizeForUpdate);
            if (bArr2.length == iUpdateInternal) {
                return bArr2;
            }
            return iUpdateInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iUpdateInternal);
        } catch (ShortBufferException unused) {
            l41.m4048q(jd0.m3609g(outputSizeForUpdate, "calculated buffer size was wrong: "));
            return null;
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException {
        try {
            byte[] encoded = key.getEncoded();
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e) {
            IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
            illegalBlockSizeException.initCause(e);
            throw illegalBlockSizeException;
        }
    }

    public abstract String getBaseCipherName();

    public abstract int getCipherBlockSize();

    public abstract int getOutputSizeForFinal(int i);

    public abstract int getOutputSizeForUpdate(int i);

    public Padding getPadding() {
        return this.padding;
    }

    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            return null;
        }
        try {
            return algorithmParameters.getParameterSpec(IvParameterSpec.class);
        } catch (InvalidParameterSpecException e) {
            throw new InvalidAlgorithmParameterException("Params must be convertible to IvParameterSpec", e);
        }
    }

    public boolean isEncrypting() {
        return this.encrypting;
    }

    public boolean supportsVariableSizeIv() {
        return false;
    }

    public boolean supportsVariableSizeKey() {
        return false;
    }

    public abstract int updateInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException {
        checkAndSetEncodedKey(i, key);
        engineInitInternal(this.encodedKey, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException {
        engineInit(i, key, getParameterSpec(algorithmParameters), secureRandom);
    }

    public OpenSSLCipher() {
        this.mode = Mode.ECB;
        this.padding = Padding.PKCS5PADDING;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return updateInternal(bArr, i, i2, bArr2, i3, getOutputSizeForUpdate(i2));
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        OpenSSLCipher openSSLCipher;
        byte[] bArr3;
        int iUpdateInternal = 0;
        if (bArr2 != null) {
            int outputSizeForFinal = getOutputSizeForFinal(i2);
            if (i2 > 0) {
                openSSLCipher = this;
                bArr3 = bArr2;
                iUpdateInternal = openSSLCipher.updateInternal(bArr, i, i2, bArr3, i3, outputSizeForFinal);
                i3 += iUpdateInternal;
                outputSizeForFinal -= iUpdateInternal;
            } else {
                openSSLCipher = this;
                bArr3 = bArr2;
            }
            return openSSLCipher.doFinalInternal(bArr3, i3, outputSizeForFinal) + iUpdateInternal;
        }
        l41.m4051t("output == null");
        return 0;
    }
}
