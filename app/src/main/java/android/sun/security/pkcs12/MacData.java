package android.sun.security.pkcs12;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.x509.AlgorithmId;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import p000.f40;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class MacData {
    private byte[] digest;
    private String digestAlgorithmName;
    private AlgorithmParameters digestAlgorithmParams;
    private byte[] encoded;
    private int iterations;
    private byte[] macSalt;

    public MacData(DerInputStream derInputStream) throws IOException {
        this.encoded = null;
        DerValue[] sequence = derInputStream.getSequence(2);
        DerValue[] sequence2 = new DerInputStream(sequence[0].toByteArray()).getSequence(2);
        AlgorithmId algorithmId = AlgorithmId.parse(sequence2[0]);
        this.digestAlgorithmName = algorithmId.getName();
        this.digestAlgorithmParams = algorithmId.getParameters();
        this.digest = sequence2[1].getOctetString();
        this.macSalt = sequence[1].getOctetString();
        if (sequence.length > 2) {
            this.iterations = sequence[2].getInteger();
        } else {
            this.iterations = 1;
        }
    }

    public byte[] getDigest() {
        return this.digest;
    }

    public String getDigestAlgName() {
        return this.digestAlgorithmName;
    }

    public byte[] getEncoded() throws IOException {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        DerOutputStream derOutputStream3 = new DerOutputStream();
        AlgorithmId.get(this.digestAlgorithmName).encode(derOutputStream3);
        derOutputStream3.putOctetString(this.digest);
        derOutputStream2.write((byte) 48, derOutputStream3);
        derOutputStream2.putOctetString(this.macSalt);
        derOutputStream2.putInteger(this.iterations);
        derOutputStream.write((byte) 48, derOutputStream2);
        byte[] byteArray = derOutputStream.toByteArray();
        this.encoded = byteArray;
        return (byte[]) byteArray.clone();
    }

    public int getIterations() {
        return this.iterations;
    }

    public byte[] getSalt() {
        return this.macSalt;
    }

    public MacData(String str, byte[] bArr, byte[] bArr2, int i) throws NoSuchAlgorithmException {
        this.encoded = null;
        if (str != null) {
            AlgorithmId algorithmId = AlgorithmId.get(str);
            this.digestAlgorithmName = algorithmId.getName();
            this.digestAlgorithmParams = algorithmId.getParameters();
            if (bArr != null) {
                if (bArr.length != 0) {
                    this.digest = (byte[]) bArr.clone();
                    this.macSalt = bArr2;
                    this.iterations = i;
                    this.encoded = null;
                    return;
                }
                f40.m2713i("the digest parameter must not be empty");
                throw null;
            }
            l41.m4051t("the digest parameter must be non-null");
            throw null;
        }
        l41.m4051t("the algName parameter must be non-null");
        throw null;
    }

    public MacData(AlgorithmParameters algorithmParameters, byte[] bArr, byte[] bArr2, int i) throws NoSuchAlgorithmException {
        this.encoded = null;
        if (algorithmParameters != null) {
            AlgorithmId algorithmId = AlgorithmId.get(algorithmParameters);
            this.digestAlgorithmName = algorithmId.getName();
            this.digestAlgorithmParams = algorithmId.getParameters();
            if (bArr != null) {
                if (bArr.length != 0) {
                    this.digest = (byte[]) bArr.clone();
                    this.macSalt = bArr2;
                    this.iterations = i;
                    this.encoded = null;
                    return;
                }
                f40.m2713i("the digest parameter must not be empty");
                throw null;
            }
            l41.m4051t("the digest parameter must be non-null");
            throw null;
        }
        l41.m4051t("the algParams parameter must be non-null");
        throw null;
    }
}
