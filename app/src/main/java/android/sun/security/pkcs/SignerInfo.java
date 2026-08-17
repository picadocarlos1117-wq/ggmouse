package android.sun.security.pkcs;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.Debug;
import android.sun.security.util.DerEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import android.sun.security.x509.AlgorithmId;
import android.sun.security.x509.KeyUsageExtension;
import android.sun.security.x509.X500Name;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import p000.AbstractC1308pu;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class SignerInfo implements DerEncoder {
    PKCS9Attributes authenticatedAttributes;
    BigInteger certificateSerialNumber;
    AlgorithmId digestAlgorithmId;
    AlgorithmId digestEncryptionAlgorithmId;
    byte[] encryptedDigest;
    X500Name issuerName;
    PKCS9Attributes unauthenticatedAttributes;
    BigInteger version;

    public SignerInfo(DerInputStream derInputStream, boolean z) throws IOException {
        this.version = derInputStream.getBigInteger();
        DerValue[] sequence = derInputStream.getSequence(2);
        this.issuerName = new X500Name(new DerValue((byte) 48, sequence[0].toByteArray()));
        this.certificateSerialNumber = sequence[1].getBigInteger();
        this.digestAlgorithmId = AlgorithmId.parse(derInputStream.getDerValue());
        if (z) {
            derInputStream.getSet(0);
        } else if (((byte) derInputStream.peekByte()) == -96) {
            this.authenticatedAttributes = new PKCS9Attributes(derInputStream);
        }
        this.digestEncryptionAlgorithmId = AlgorithmId.parse(derInputStream.getDerValue());
        this.encryptedDigest = derInputStream.getOctetString();
        if (z) {
            derInputStream.getSet(0);
        } else if (derInputStream.available() != 0 && ((byte) derInputStream.peekByte()) == -95) {
            this.unauthenticatedAttributes = new PKCS9Attributes(derInputStream, true);
        }
        if (derInputStream.available() != 0) {
            throw new ParsingException("extra data at the end");
        }
    }

    @Override // android.sun.security.util.DerEncoder
    public void derEncode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putInteger(this.version);
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.issuerName.encode(derOutputStream2);
        derOutputStream2.putInteger(this.certificateSerialNumber);
        derOutputStream.write((byte) 48, derOutputStream2);
        this.digestAlgorithmId.encode(derOutputStream);
        PKCS9Attributes pKCS9Attributes = this.authenticatedAttributes;
        if (pKCS9Attributes != null) {
            pKCS9Attributes.encode((byte) -96, derOutputStream);
        }
        this.digestEncryptionAlgorithmId.encode(derOutputStream);
        derOutputStream.putOctetString(this.encryptedDigest);
        PKCS9Attributes pKCS9Attributes2 = this.unauthenticatedAttributes;
        if (pKCS9Attributes2 != null) {
            pKCS9Attributes2.encode((byte) -95, derOutputStream);
        }
        DerOutputStream derOutputStream3 = new DerOutputStream();
        derOutputStream3.write((byte) 48, derOutputStream);
        outputStream.write(derOutputStream3.toByteArray());
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derEncode(derOutputStream);
    }

    public PKCS9Attributes getAuthenticatedAttributes() {
        return this.authenticatedAttributes;
    }

    public X509Certificate getCertificate(PKCS7 pkcs7) {
        return pkcs7.getCertificate(this.certificateSerialNumber, this.issuerName);
    }

    public ArrayList<X509Certificate> getCertificateChain(PKCS7 pkcs7) {
        boolean z;
        X509Certificate certificate = pkcs7.getCertificate(this.certificateSerialNumber, this.issuerName);
        if (certificate == null) {
            return null;
        }
        ArrayList<X509Certificate> arrayList = new ArrayList<>();
        arrayList.add(certificate);
        X509Certificate[] certificates = pkcs7.getCertificates();
        if (certificates != null && !certificate.getSubjectDN().equals(certificate.getIssuerDN())) {
            Principal issuerDN = certificate.getIssuerDN();
            int length = 0;
            do {
                int i = length;
                while (true) {
                    if (i >= certificates.length) {
                        z = false;
                        break;
                    }
                    if (issuerDN.equals(certificates[i].getSubjectDN())) {
                        arrayList.add(certificates[i]);
                        if (certificates[i].getSubjectDN().equals(certificates[i].getIssuerDN())) {
                            length = certificates.length;
                        } else {
                            issuerDN = certificates[i].getIssuerDN();
                            X509Certificate x509Certificate = certificates[length];
                            certificates[length] = certificates[i];
                            certificates[i] = x509Certificate;
                            length++;
                        }
                        z = true;
                        break;
                    }
                    i++;
                }
            } while (z);
        }
        return arrayList;
    }

    public BigInteger getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }

    public AlgorithmId getDigestAlgorithmId() {
        return this.digestAlgorithmId;
    }

    public AlgorithmId getDigestEncryptionAlgorithmId() {
        return this.digestEncryptionAlgorithmId;
    }

    public byte[] getEncryptedDigest() {
        return this.encryptedDigest;
    }

    public X500Name getIssuerName() {
        return this.issuerName;
    }

    public PKCS9Attributes getUnauthenticatedAttributes() {
        return this.unauthenticatedAttributes;
    }

    public BigInteger getVersion() {
        return this.version;
    }

    public String toString() {
        HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
        StringBuilder sbM5346m = AbstractC1308pu.m5346m("Signer Info for (issuer): " + this.issuerName + "\n", "\tversion: ");
        sbM5346m.append(Debug.toHexString(this.version));
        sbM5346m.append("\n");
        StringBuilder sbM5346m2 = AbstractC1308pu.m5346m(sbM5346m.toString(), "\tcertificateSerialNumber: ");
        sbM5346m2.append(Debug.toHexString(this.certificateSerialNumber));
        sbM5346m2.append("\n");
        StringBuilder sbM5346m3 = AbstractC1308pu.m5346m(sbM5346m2.toString(), "\tdigestAlgorithmId: ");
        sbM5346m3.append(this.digestAlgorithmId);
        sbM5346m3.append("\n");
        String string = sbM5346m3.toString();
        if (this.authenticatedAttributes != null) {
            StringBuilder sbM5346m4 = AbstractC1308pu.m5346m(string, "\tauthenticatedAttributes: ");
            sbM5346m4.append(this.authenticatedAttributes);
            sbM5346m4.append("\n");
            string = sbM5346m4.toString();
        }
        StringBuilder sbM5346m5 = AbstractC1308pu.m5346m(string, "\tdigestEncryptionAlgorithmId: ");
        sbM5346m5.append(this.digestEncryptionAlgorithmId);
        sbM5346m5.append("\n");
        StringBuilder sbM5346m6 = AbstractC1308pu.m5346m(sbM5346m5.toString(), "\tencryptedDigest: \n");
        sbM5346m6.append(hexDumpEncoder.encodeBuffer(this.encryptedDigest));
        sbM5346m6.append("\n");
        String string2 = sbM5346m6.toString();
        if (this.unauthenticatedAttributes == null) {
            return string2;
        }
        StringBuilder sbM5346m7 = AbstractC1308pu.m5346m(string2, "\tunauthenticatedAttributes: ");
        sbM5346m7.append(this.unauthenticatedAttributes);
        sbM5346m7.append("\n");
        return sbM5346m7.toString();
    }

    public SignerInfo verify(PKCS7 pkcs7, byte[] bArr) throws NoSuchAlgorithmException, SignatureException {
        byte[] bArr2;
        try {
            try {
                ContentInfo contentInfo = pkcs7.getContentInfo();
                if (bArr == null) {
                    bArr = contentInfo.getContentBytes();
                }
                String name = getDigestAlgorithmId().getName();
                PKCS9Attributes pKCS9Attributes = this.authenticatedAttributes;
                if (pKCS9Attributes != null) {
                    ObjectIdentifier objectIdentifier = (ObjectIdentifier) pKCS9Attributes.getAttributeValue(PKCS9Attribute.CONTENT_TYPE_OID);
                    if (objectIdentifier == null || !objectIdentifier.equals(contentInfo.contentType) || (bArr2 = (byte[]) this.authenticatedAttributes.getAttributeValue(PKCS9Attribute.MESSAGE_DIGEST_OID)) == null) {
                        return null;
                    }
                    byte[] bArrDigest = MessageDigest.getInstance(name).digest(bArr);
                    if (bArr2.length != bArrDigest.length) {
                        return null;
                    }
                    for (int i = 0; i < bArr2.length; i++) {
                        if (bArr2[i] != bArrDigest[i]) {
                            return null;
                        }
                    }
                    bArr = this.authenticatedAttributes.getDerEncoding();
                }
                String name2 = getDigestEncryptionAlgorithmId().getName();
                String encAlgFromSigAlg = AlgorithmId.getEncAlgFromSigAlg(name2);
                if (encAlgFromSigAlg != null) {
                    name2 = encAlgFromSigAlg;
                }
                Signature signature = Signature.getInstance(AlgorithmId.makeSigAlg(name, name2));
                X509Certificate certificate = getCertificate(pkcs7);
                if (certificate == null) {
                    return null;
                }
                if (certificate.hasUnsupportedCriticalExtension()) {
                    throw new SignatureException("Certificate has unsupported critical extension(s)");
                }
                boolean[] keyUsage = certificate.getKeyUsage();
                if (keyUsage != null) {
                    try {
                        KeyUsageExtension keyUsageExtension = new KeyUsageExtension(keyUsage);
                        boolean zBooleanValue = ((Boolean) keyUsageExtension.get(KeyUsageExtension.DIGITAL_SIGNATURE)).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) keyUsageExtension.get(KeyUsageExtension.NON_REPUDIATION)).booleanValue();
                        if (!zBooleanValue && !zBooleanValue2) {
                            throw new SignatureException("Key usage restricted: cannot be used for digital signatures");
                        }
                    } catch (IOException unused) {
                        throw new SignatureException("Failed to parse keyUsage extension");
                    }
                }
                signature.initVerify(certificate.getPublicKey());
                signature.update(bArr);
                if (signature.verify(this.encryptedDigest)) {
                    return this;
                }
                return null;
            } catch (IOException e) {
                throw new SignatureException(jd0.m3611i(e, new StringBuilder("IO error verifying signature:\n")));
            }
        } catch (InvalidKeyException e2) {
            throw new SignatureException("InvalidKey: " + e2.getMessage());
        }
    }

    public SignerInfo(X500Name x500Name, BigInteger bigInteger, AlgorithmId algorithmId, PKCS9Attributes pKCS9Attributes, AlgorithmId algorithmId2, byte[] bArr, PKCS9Attributes pKCS9Attributes2) {
        this.version = BigInteger.ONE;
        this.issuerName = x500Name;
        this.certificateSerialNumber = bigInteger;
        this.digestAlgorithmId = algorithmId;
        this.authenticatedAttributes = pKCS9Attributes;
        this.digestEncryptionAlgorithmId = algorithmId2;
        this.encryptedDigest = bArr;
        this.unauthenticatedAttributes = pKCS9Attributes2;
    }

    public SignerInfo(DerInputStream derInputStream) {
        this(derInputStream, false);
    }

    public SignerInfo(X500Name x500Name, BigInteger bigInteger, AlgorithmId algorithmId, AlgorithmId algorithmId2, byte[] bArr) {
        this.version = BigInteger.ONE;
        this.issuerName = x500Name;
        this.certificateSerialNumber = bigInteger;
        this.digestAlgorithmId = algorithmId;
        this.digestEncryptionAlgorithmId = algorithmId2;
        this.encryptedDigest = bArr;
    }

    public SignerInfo verify(PKCS7 pkcs7) {
        return verify(pkcs7, null);
    }
}
