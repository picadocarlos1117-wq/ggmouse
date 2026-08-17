package org.conscrypt;

import com.google.android.gms.stats.CodePackage;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import p000.jd0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class GCM extends OpenSSLAeadCipherAES {

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static class AES_128 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i != 16) {
                    throw new InvalidKeyException(jd0.m3610h(i, "Unsupported key size: ", " bytes (must be 16)"));
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static class AES_256 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i != 32) {
                    throw new InvalidKeyException(jd0.m3610h(i, "Unsupported key size: ", " bytes (must be 32)"));
                }
            }
        }

        public GCM() {
            super(OpenSSLCipher.Mode.GCM);
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM) {
                throw new NoSuchAlgorithmException("Mode must be GCM");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i) {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm();
            }
            l41.m4048q(jd0.m3609g(i, "Unexpected key length: "));
            return 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class GCM_SIV extends OpenSSLAeadCipherAES {

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static class AES_128 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i != 16) {
                    throw new InvalidKeyException(jd0.m3610h(i, "Unsupported key size: ", " bytes (must be 16)"));
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        public static class AES_256 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i) throws InvalidKeyException {
                if (i != 32) {
                    throw new InvalidKeyException(jd0.m3610h(i, "Unsupported key size: ", " bytes (must be 32)"));
                }
            }
        }

        public GCM_SIV() {
            super(OpenSSLCipher.Mode.GCM_SIV);
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public boolean allowsNonceReuse() {
            return true;
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM_SIV) {
                throw new NoSuchAlgorithmException("Mode must be GCM-SIV");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public void checkSupportedTagLength(int i) throws InvalidAlgorithmParameterException {
            if (i != 128) {
                throw new InvalidAlgorithmParameterException("Tag length must be 128 bits");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i) {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm_siv();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm_siv();
            }
            l41.m4048q(jd0.m3609g(i, "Unexpected key length: "));
            return 0L;
        }
    }

    public OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
        super(mode);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) throws InvalidKeyException {
        if (i != 16 && i != 32) {
            throw new InvalidKeyException(jd0.m3610h(i, "Unsupported key size: ", " bytes (must be 16 or 32)"));
        }
    }

    @Override // org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f8444iv;
        if (bArr == null) {
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = Platform.toGCMParameterSpec(this.tagLengthInBytes * 8, bArr);
        if (gCMParameterSpec == null) {
            return super.engineGetParameters();
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(CodePackage.GCM);
            algorithmParameters.init(gCMParameterSpec);
            return algorithmParameters;
        } catch (NoSuchAlgorithmException e) {
            throw ((Error) new AssertionError("GCM not supported").initCause(e));
        } catch (InvalidParameterSpecException unused) {
            return null;
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "AES";
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 16;
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        boolean zIsEncrypting = isEncrypting();
        int i2 = this.bufCount;
        return zIsEncrypting ? i2 + i + this.tagLengthInBytes : Math.max(0, (i2 + i) - this.tagLengthInBytes);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) {
        if (algorithmParameters == null) {
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecFromGCMParameters = Platform.fromGCMParameters(algorithmParameters);
        return algorithmParameterSpecFromGCMParameters != null ? algorithmParameterSpecFromGCMParameters : super.getParameterSpec(algorithmParameters);
    }
}
