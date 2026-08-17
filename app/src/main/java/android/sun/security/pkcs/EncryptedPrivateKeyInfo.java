package android.sun.security.pkcs;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.x509.AlgorithmId;
import java.io.IOException;
import p000.ca0;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class EncryptedPrivateKeyInfo {
    private AlgorithmId algid;
    private byte[] encoded;
    private byte[] encryptedData;

    public EncryptedPrivateKeyInfo(byte[] bArr) throws IOException {
        if (bArr == null) {
            f40.m2713i("encoding must not be null");
            throw null;
        }
        DerValue derValue = new DerValue(bArr);
        DerValue[] derValueArr = {derValue.data.getDerValue(), derValue.data.getDerValue()};
        if (derValue.data.available() != 0) {
            f40.m2710f(derValue.data.available(), "overrun, bytes = ");
            throw null;
        }
        this.algid = AlgorithmId.parse(derValueArr[0]);
        if (derValueArr[0].data.available() != 0) {
            ca0.m1178j("encryptionAlgorithm field overrun");
            throw null;
        }
        this.encryptedData = derValueArr[1].getOctetString();
        if (derValueArr[1].data.available() == 0) {
            this.encoded = (byte[]) bArr.clone();
        } else {
            ca0.m1178j("encryptedData field overrun");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedPrivateKeyInfo)) {
            return false;
        }
        try {
            byte[] encoded = getEncoded();
            byte[] encoded2 = ((EncryptedPrivateKeyInfo) obj).getEncoded();
            if (encoded.length != encoded2.length) {
                return false;
            }
            for (int i = 0; i < encoded.length; i++) {
                if (encoded[i] != encoded2[i]) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public AlgorithmId getAlgorithm() {
        return this.algid;
    }

    public byte[] getEncoded() throws IOException {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.algid.encode(derOutputStream2);
        derOutputStream2.putOctetString(this.encryptedData);
        derOutputStream.write((byte) 48, derOutputStream2);
        byte[] byteArray = derOutputStream.toByteArray();
        this.encoded = byteArray;
        return (byte[]) byteArray.clone();
    }

    public byte[] getEncryptedData() {
        return (byte[]) this.encryptedData.clone();
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.encryptedData;
            if (i >= bArr.length) {
                return i2;
            }
            i2 += bArr[i] * i;
            i++;
        }
    }

    public EncryptedPrivateKeyInfo(AlgorithmId algorithmId, byte[] bArr) {
        this.algid = algorithmId;
        this.encryptedData = (byte[]) bArr.clone();
    }
}
