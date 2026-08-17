package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import p000.AbstractC1308pu;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenSSLSignatureRawRSA extends SignatureSpi {
    private byte[] inputBuffer;
    private boolean inputIsTooLong;
    private int inputOffset;
    private OpenSSLKey key;

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof OpenSSLRSAPrivateKey) {
            this.key = ((OpenSSLRSAPrivateKey) privateKey).getOpenSSLKey();
        } else if (privateKey instanceof RSAPrivateCrtKey) {
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) privateKey);
        } else {
            if (!(privateKey instanceof RSAPrivateKey)) {
                l41.m4039h("Need RSA private key");
                return;
            }
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) privateKey);
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof OpenSSLRSAPublicKey) {
            this.key = ((OpenSSLRSAPublicKey) publicKey).getOpenSSLKey();
        } else {
            if (!(publicKey instanceof RSAPublicKey)) {
                l41.m4039h("Need RSA public key");
                return;
            }
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) publicKey);
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA private key");
        }
        if (this.inputIsTooLong) {
            StringBuilder sb = new StringBuilder("input length ");
            sb.append(this.inputOffset);
            sb.append(" != ");
            throw new SignatureException(AbstractC1308pu.m5341h(sb, this.inputBuffer.length, " (modulus size)"));
        }
        byte[] bArr = this.inputBuffer;
        byte[] bArr2 = new byte[bArr.length];
        try {
            try {
                NativeCrypto.RSA_private_encrypt(this.inputOffset, bArr, bArr2, openSSLKey.getNativeRef(), 1);
                this.inputOffset = 0;
                return bArr2;
            } catch (Exception e) {
                throw new SignatureException(e);
            }
        } catch (Throwable th) {
            this.inputOffset = 0;
            throw th;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        int i3 = this.inputOffset;
        int i4 = i3 + i2;
        this.inputOffset = i4;
        byte[] bArr2 = this.inputBuffer;
        if (i4 > bArr2.length) {
            this.inputIsTooLong = true;
        } else {
            System.arraycopy(bArr, i, bArr2, i3, i2);
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA public key");
        }
        if (this.inputIsTooLong) {
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = this.inputBuffer;
        if (length > bArr2.length) {
            throw new SignatureException("Input signature length is too large: " + bArr.length + " > " + this.inputBuffer.length);
        }
        byte[] bArr3 = new byte[bArr2.length];
        try {
            try {
                try {
                    boolean z = true;
                    int iRSA_public_decrypt = NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr3, openSSLKey.getNativeRef(), 1);
                    if (iRSA_public_decrypt != this.inputOffset) {
                        z = false;
                    }
                    for (int i = 0; i < iRSA_public_decrypt; i++) {
                        if (this.inputBuffer[i] != bArr3[i]) {
                            z = false;
                        }
                    }
                    this.inputOffset = 0;
                    return z;
                } catch (SignatureException e) {
                    throw e;
                } catch (Exception unused) {
                    this.inputOffset = 0;
                    return false;
                }
            } catch (Throwable th) {
                this.inputOffset = 0;
                throw th;
            }
        } catch (Exception e2) {
            throw new SignatureException(e2);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        int i = this.inputOffset;
        int i2 = i + 1;
        this.inputOffset = i2;
        byte[] bArr = this.inputBuffer;
        if (i2 > bArr.length) {
            this.inputIsTooLong = true;
        } else {
            bArr[i] = b;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }
}
