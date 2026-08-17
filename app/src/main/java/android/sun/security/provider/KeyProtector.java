package android.sun.security.provider;

import android.sun.security.pkcs.EncryptedPrivateKeyInfo;
import android.sun.security.pkcs.PKCS8Key;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import android.sun.security.x509.AlgorithmId;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.util.Arrays;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
final class KeyProtector {
    private static final String DIGEST_ALG = "SHA";
    private static final int DIGEST_LEN = 20;
    private static final String KEY_PROTECTOR_OID = "1.3.6.1.4.1.42.2.17.1.1";
    private static final int SALT_LEN = 20;

    /* JADX INFO: renamed from: md */
    private MessageDigest f280md;
    private byte[] passwdBytes;

    public KeyProtector(char[] cArr) {
        if (cArr == null) {
            f40.m2713i("password can't be null");
            throw null;
        }
        this.f280md = MessageDigest.getInstance(DIGEST_ALG);
        this.passwdBytes = new byte[cArr.length * 2];
        int i = 0;
        for (char c : cArr) {
            byte[] bArr = this.passwdBytes;
            int i2 = i + 1;
            bArr[i] = (byte) (c >> '\b');
            i += 2;
            bArr[i2] = (byte) c;
        }
    }

    public void finalize() {
        byte[] bArr = this.passwdBytes;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.passwdBytes = null;
        }
    }

    public byte[] protect(Key key) throws KeyStoreException {
        if (key == null) {
            f40.m2713i("plaintext key can't be null");
            return null;
        }
        if (!"PKCS#8".equalsIgnoreCase(key.getFormat())) {
            throw new KeyStoreException("Cannot get key bytes, not PKCS#8 encoded");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new KeyStoreException("Cannot get key bytes, encoding not supported");
        }
        int length = encoded.length / 20;
        if (encoded.length % 20 != 0) {
            length++;
        }
        byte[] bArr = new byte[20];
        new SecureRandom().nextBytes(bArr);
        int length2 = encoded.length;
        byte[] bArr2 = new byte[length2];
        byte[] bArrDigest = bArr;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            this.f280md.update(this.passwdBytes);
            this.f280md.update(bArrDigest);
            bArrDigest = this.f280md.digest();
            this.f280md.reset();
            if (i < length - 1) {
                System.arraycopy(bArrDigest, 0, bArr2, i2, bArrDigest.length);
            } else {
                System.arraycopy(bArrDigest, 0, bArr2, i2, length2 - i2);
            }
            i++;
            i2 += 20;
        }
        int length3 = encoded.length;
        byte[] bArr3 = new byte[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            bArr3[i3] = (byte) (encoded[i3] ^ bArr2[i3]);
        }
        byte[] bArr4 = new byte[length3 + 40];
        System.arraycopy(bArr, 0, bArr4, 0, 20);
        System.arraycopy(bArr3, 0, bArr4, 20, length3);
        this.f280md.update(this.passwdBytes);
        Arrays.fill(this.passwdBytes, (byte) 0);
        this.passwdBytes = null;
        this.f280md.update(encoded);
        byte[] bArrDigest2 = this.f280md.digest();
        this.f280md.reset();
        System.arraycopy(bArrDigest2, 0, bArr4, 20 + length3, bArrDigest2.length);
        try {
            return new EncryptedPrivateKeyInfo(new AlgorithmId(new ObjectIdentifier(KEY_PROTECTOR_OID)), bArr4).getEncoded();
        } catch (IOException e) {
            throw new KeyStoreException(e.getMessage());
        }
    }

    public Key recover(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo) throws UnrecoverableKeyException {
        if (!encryptedPrivateKeyInfo.getAlgorithm().getOID().toString().equals(KEY_PROTECTOR_OID)) {
            throw new UnrecoverableKeyException("Unsupported key protection algorithm");
        }
        byte[] encryptedData = encryptedPrivateKeyInfo.getEncryptedData();
        byte[] bArrDigest = new byte[20];
        System.arraycopy(encryptedData, 0, bArrDigest, 0, 20);
        int length = encryptedData.length;
        int i = length - 40;
        int i2 = i / 20;
        if (i % 20 != 0) {
            i2++;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(encryptedData, 20, bArr, 0, i);
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            this.f280md.update(this.passwdBytes);
            this.f280md.update(bArrDigest);
            bArrDigest = this.f280md.digest();
            this.f280md.reset();
            if (i3 < i2 - 1) {
                System.arraycopy(bArrDigest, 0, bArr2, i4, bArrDigest.length);
            } else {
                System.arraycopy(bArrDigest, 0, bArr2, i4, i - i4);
            }
            i3++;
            i4 += 20;
        }
        byte[] bArr3 = new byte[i];
        for (int i5 = 0; i5 < i; i5++) {
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
        }
        this.f280md.update(this.passwdBytes);
        Arrays.fill(this.passwdBytes, (byte) 0);
        this.passwdBytes = null;
        this.f280md.update(bArr3);
        byte[] bArrDigest2 = this.f280md.digest();
        this.f280md.reset();
        for (int i6 = 0; i6 < bArrDigest2.length; i6++) {
            if (bArrDigest2[i6] != encryptedData[(length - 20) + i6]) {
                throw new UnrecoverableKeyException("Cannot recover key");
            }
        }
        try {
            return PKCS8Key.parseKey(new DerValue(bArr3));
        } catch (IOException e) {
            throw new UnrecoverableKeyException(e.getMessage());
        }
    }
}
