package android.sun.security.x509;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Arrays;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class KeyIdentifier {
    private byte[] octetString;

    public KeyIdentifier(PublicKey publicKey) throws IOException {
        DerValue derValue = new DerValue(publicKey.getEncoded());
        if (derValue.tag != 48) {
            ca0.m1178j("PublicKey value is not a valid X.509 public key");
            throw null;
        }
        AlgorithmId.parse(derValue.data.getDerValue());
        byte[] byteArray = derValue.data.getUnalignedBitString().toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(byteArray);
            this.octetString = messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            ca0.m1178j("SHA1 not supported");
            throw null;
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOctetString(this.octetString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyIdentifier) {
            return Arrays.equals(this.octetString, ((KeyIdentifier) obj).getIdentifier());
        }
        return false;
    }

    public byte[] getIdentifier() {
        return (byte[]) this.octetString.clone();
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.octetString;
            if (i >= bArr.length) {
                return i2;
            }
            i2 += bArr[i] * i;
            i++;
        }
    }

    public String toString() {
        return ("KeyIdentifier [\n" + new HexDumpEncoder().encodeBuffer(this.octetString)).concat("]\n");
    }

    public KeyIdentifier(DerValue derValue) {
        this.octetString = derValue.getOctetString();
    }

    public KeyIdentifier(byte[] bArr) {
        this.octetString = (byte[]) bArr.clone();
    }
}
