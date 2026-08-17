package android.sun.security.pkcs;

import android.sun.misc.BASE64Encoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.x509.AlgorithmId;
import android.sun.security.x509.X500Name;
import android.sun.security.x509.X509Key;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PKCS10 {
    private PKCS10Attributes attributeSet;
    private byte[] encoded;
    private X500Name subject;
    private PublicKey subjectPublicKeyInfo;

    public PKCS10(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, IOException {
        this.encoded = bArr;
        DerValue[] sequence = new DerInputStream(bArr).getSequence(3);
        if (sequence.length != 3) {
            f40.m2713i("not a PKCS #10 request");
            throw null;
        }
        byte[] byteArray = sequence[0].toByteArray();
        AlgorithmId algorithmId = AlgorithmId.parse(sequence[1]);
        byte[] bitString = sequence[2].getBitString();
        if (!sequence[0].data.getBigInteger().equals(BigInteger.ZERO)) {
            f40.m2713i("not PKCS #10 v1");
            throw null;
        }
        this.subject = new X500Name(sequence[0].data);
        this.subjectPublicKeyInfo = X509Key.parse(sequence[0].data.getDerValue());
        if (sequence[0].data.available() != 0) {
            this.attributeSet = new PKCS10Attributes(sequence[0].data);
        } else {
            this.attributeSet = new PKCS10Attributes();
        }
        if (sequence[0].data.available() != 0) {
            f40.m2713i("illegal PKCS #10 data");
            throw null;
        }
        try {
            Signature signature = Signature.getInstance(algorithmId.getName());
            signature.initVerify(this.subjectPublicKeyInfo);
            signature.update(byteArray);
            if (signature.verify(bitString)) {
            } else {
                throw new SignatureException("Invalid PKCS #10 signature");
            }
        } catch (InvalidKeyException unused) {
            throw new SignatureException("invalid key");
        }
    }

    public void encodeAndSign(X500Name x500Name, Signature signature) throws SignatureException, IOException {
        if (this.encoded != null) {
            throw new SignatureException("request is already signed");
        }
        this.subject = x500Name;
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putInteger(BigInteger.ZERO);
        x500Name.encode(derOutputStream);
        derOutputStream.write(this.subjectPublicKeyInfo.getEncoded());
        this.attributeSet.encode(derOutputStream);
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.write((byte) 48, derOutputStream);
        byte[] byteArray = derOutputStream2.toByteArray();
        signature.update(byteArray, 0, byteArray.length);
        byte[] bArrSign = signature.sign();
        try {
            AlgorithmId.getAlgorithmId(signature.getAlgorithm()).encode(derOutputStream2);
            derOutputStream2.putBitString(bArrSign);
            DerOutputStream derOutputStream3 = new DerOutputStream();
            derOutputStream3.write((byte) 48, derOutputStream2);
            this.encoded = derOutputStream3.toByteArray();
        } catch (NoSuchAlgorithmException e) {
            throw new SignatureException(e);
        }
    }

    public boolean equals(Object obj) {
        byte[] encoded;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PKCS10) || this.encoded == null || (encoded = ((PKCS10) obj).getEncoded()) == null) {
            return false;
        }
        return Arrays.equals(this.encoded, encoded);
    }

    public PKCS10Attributes getAttributes() {
        return this.attributeSet;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public X500Name getSubjectName() {
        return this.subject;
    }

    public PublicKey getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    public int hashCode() {
        int i = 0;
        if (this.encoded != null) {
            int i2 = 1;
            while (true) {
                byte[] bArr = this.encoded;
                if (i2 >= bArr.length) {
                    break;
                }
                i += bArr[i2] * i2;
                i2++;
            }
        }
        return i;
    }

    public void print(PrintStream printStream) throws SignatureException, IOException {
        if (this.encoded == null) {
            throw new SignatureException("Cert request was not signed");
        }
        BASE64Encoder bASE64Encoder = new BASE64Encoder();
        printStream.println("-----BEGIN NEW CERTIFICATE REQUEST-----");
        bASE64Encoder.encodeBuffer(this.encoded, printStream);
        printStream.println("-----END NEW CERTIFICATE REQUEST-----");
    }

    public String toString() {
        return "[PKCS #10 certificate request:\n" + this.subjectPublicKeyInfo.toString() + " subject: <" + this.subject + ">\n attributes: " + this.attributeSet.toString() + "\n]";
    }

    public PKCS10(PublicKey publicKey, PKCS10Attributes pKCS10Attributes) {
        this.subjectPublicKeyInfo = publicKey;
        this.attributeSet = pKCS10Attributes;
    }

    public PKCS10(PublicKey publicKey) {
        this.subjectPublicKeyInfo = publicKey;
        this.attributeSet = new PKCS10Attributes();
    }
}
