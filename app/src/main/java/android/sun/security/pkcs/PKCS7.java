package android.sun.security.pkcs;

import android.sun.security.util.Debug;
import android.sun.security.util.DerEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import android.sun.security.x509.AlgorithmId;
import android.sun.security.x509.X500Name;
import android.sun.security.x509.X509CRLImpl;
import android.sun.security.x509.X509CertImpl;
import android.sun.security.x509.X509CertInfo;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Vector;
import p000.AbstractC1308pu;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PKCS7 {
    private Principal[] certIssuerNames;
    private X509Certificate[] certificates;
    private ContentInfo contentInfo;
    private ObjectIdentifier contentType;
    private X509CRL[] crls;
    private AlgorithmId[] digestAlgorithmIds;
    private boolean oldStyle;
    private SignerInfo[] signerInfos;
    private BigInteger version;

    public PKCS7(InputStream inputStream) throws Throwable {
        this.version = null;
        this.digestAlgorithmIds = null;
        this.contentInfo = null;
        this.certificates = null;
        this.crls = null;
        this.signerInfos = null;
        this.oldStyle = false;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.readFully(bArr);
        parse(new DerInputStream(bArr));
    }

    private void parse(DerInputStream derInputStream, boolean z) throws Throwable {
        ContentInfo contentInfo = new ContentInfo(derInputStream, z);
        this.contentInfo = contentInfo;
        this.contentType = contentInfo.contentType;
        DerValue content = contentInfo.getContent();
        if (this.contentType.equals(ContentInfo.SIGNED_DATA_OID)) {
            parseSignedData(content);
            return;
        }
        if (this.contentType.equals(ContentInfo.OLD_SIGNED_DATA_OID)) {
            parseOldSignedData(content);
            return;
        }
        if (this.contentType.equals(ContentInfo.NETSCAPE_CERT_SEQUENCE_OID)) {
            parseNetscapeCertChain(content);
            return;
        }
        throw new ParsingException("content type " + this.contentType + " not supported.");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    private void parseNetscapeCertChain(DerValue derValue) throws Throwable {
        CertificateFactory certificateFactory;
        DerValue[] sequence = new DerInputStream(derValue.toByteArray()).getSequence(2);
        this.certificates = new X509Certificate[sequence.length];
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused) {
            certificateFactory = null;
        }
        for (int i = 0; i < sequence.length; i++) {
            if (certificateFactory == null) {
                try {
                    try {
                        this.certificates[i] = new X509CertImpl(sequence[i]);
                    } catch (IOException e) {
                        e = e;
                        ParsingException parsingException = new ParsingException(e.getMessage());
                        parsingException.initCause(e);
                        throw parsingException;
                    } catch (CertificateException e2) {
                        e = e2;
                        ParsingException parsingException2 = new ParsingException(e.getMessage());
                        parsingException2.initCause(e);
                        throw parsingException2;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            } else {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(sequence[i].toByteArray());
                try {
                    this.certificates[i] = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream2);
                    byteArrayInputStream2.close();
                } catch (IOException e3) {
                    e = e3;
                    ParsingException parsingException3 = new ParsingException(e.getMessage());
                    parsingException3.initCause(e);
                    throw parsingException3;
                } catch (CertificateException e4) {
                    e = e4;
                    ParsingException parsingException4 = new ParsingException(e.getMessage());
                    parsingException4.initCause(e);
                    throw parsingException4;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    private void parseOldSignedData(DerValue derValue) throws Throwable {
        CertificateFactory certificateFactory;
        DerInputStream derInputStream = derValue.toDerInputStream();
        this.version = derInputStream.getBigInteger();
        DerValue[] set = derInputStream.getSet(1);
        int length = set.length;
        this.digestAlgorithmIds = new AlgorithmId[length];
        for (int i = 0; i < length; i++) {
            try {
                this.digestAlgorithmIds[i] = AlgorithmId.parse(set[i]);
            } catch (IOException unused) {
                throw new ParsingException("Error parsing digest AlgorithmId IDs");
            }
        }
        this.contentInfo = new ContentInfo(derInputStream, true);
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused2) {
            certificateFactory = null;
        }
        DerValue[] set2 = derInputStream.getSet(2);
        int length2 = set2.length;
        this.certificates = new X509Certificate[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            if (certificateFactory == null) {
                try {
                    try {
                        this.certificates[i2] = new X509CertImpl(set2[i2]);
                    } catch (IOException e) {
                        e = e;
                        ParsingException parsingException = new ParsingException(e.getMessage());
                        parsingException.initCause(e);
                        throw parsingException;
                    } catch (CertificateException e2) {
                        e = e2;
                        ParsingException parsingException2 = new ParsingException(e.getMessage());
                        parsingException2.initCause(e);
                        throw parsingException2;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            } else {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(set2[i2].toByteArray());
                try {
                    this.certificates[i2] = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream2);
                    byteArrayInputStream2.close();
                } catch (IOException e3) {
                    e = e3;
                    ParsingException parsingException3 = new ParsingException(e.getMessage());
                    parsingException3.initCause(e);
                    throw parsingException3;
                } catch (CertificateException e4) {
                    e = e4;
                    ParsingException parsingException4 = new ParsingException(e.getMessage());
                    parsingException4.initCause(e);
                    throw parsingException4;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            }
        }
        derInputStream.getSet(0);
        DerValue[] set3 = derInputStream.getSet(1);
        int length3 = set3.length;
        this.signerInfos = new SignerInfo[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            this.signerInfos[i3] = new SignerInfo(set3[i3].toDerInputStream(), true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    private void parseSignedData(DerValue derValue) throws Throwable {
        CertificateFactory certificateFactory;
        Throwable th;
        DerInputStream derInputStream = derValue.toDerInputStream();
        this.version = derInputStream.getBigInteger();
        DerValue[] set = derInputStream.getSet(1);
        int length = set.length;
        this.digestAlgorithmIds = new AlgorithmId[length];
        for (int i = 0; i < length; i++) {
            try {
                this.digestAlgorithmIds[i] = AlgorithmId.parse(set[i]);
            } catch (IOException e) {
                ParsingException parsingException = new ParsingException(jd0.m3611i(e, new StringBuilder("Error parsing digest AlgorithmId IDs: ")));
                parsingException.initCause(e);
                throw parsingException;
            }
        }
        this.contentInfo = new ContentInfo(derInputStream);
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused) {
            certificateFactory = null;
        }
        if (((byte) derInputStream.peekByte()) == -96) {
            DerValue[] set2 = derInputStream.getSet(2, true);
            int length2 = set2.length;
            this.certificates = new X509Certificate[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                if (certificateFactory == null) {
                    try {
                        try {
                            this.certificates[i2] = new X509CertImpl(set2[i2]);
                        } catch (IOException e2) {
                            e = e2;
                            ParsingException parsingException2 = new ParsingException(e.getMessage());
                            parsingException2.initCause(e);
                            throw parsingException2;
                        } catch (CertificateException e3) {
                            e = e3;
                            ParsingException parsingException3 = new ParsingException(e.getMessage());
                            parsingException3.initCause(e);
                            throw parsingException3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        throw th;
                    }
                } else {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(set2[i2].toByteArray());
                    try {
                        this.certificates[i2] = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream2);
                        byteArrayInputStream2.close();
                    } catch (IOException e4) {
                        e = e4;
                        ParsingException parsingException4 = new ParsingException(e.getMessage());
                        parsingException4.initCause(e);
                        throw parsingException4;
                    } catch (CertificateException e5) {
                        e = e5;
                        ParsingException parsingException5 = new ParsingException(e.getMessage());
                        parsingException5.initCause(e);
                        throw parsingException5;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayInputStream = byteArrayInputStream2;
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        throw th;
                    }
                }
            }
        }
        if (((byte) derInputStream.peekByte()) == -95) {
            DerValue[] set3 = derInputStream.getSet(1, true);
            int length3 = set3.length;
            this.crls = new X509CRL[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                if (certificateFactory == null) {
                    try {
                        try {
                            this.crls[i3] = new X509CRLImpl(set3[i3]);
                        } catch (Throwable th4) {
                            th = th4;
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                            throw th;
                        }
                    } catch (CRLException e6) {
                        e = e6;
                        ParsingException parsingException6 = new ParsingException(e.getMessage());
                        parsingException6.initCause(e);
                        throw parsingException6;
                    }
                } else {
                    ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(set3[i3].toByteArray());
                    try {
                        this.crls[i3] = (X509CRL) certificateFactory.generateCRL(byteArrayInputStream3);
                        byteArrayInputStream3.close();
                    } catch (CRLException e7) {
                        e = e7;
                        byteArrayInputStream = byteArrayInputStream3;
                        ParsingException parsingException7 = new ParsingException(e.getMessage());
                        parsingException7.initCause(e);
                        throw parsingException7;
                    } catch (Throwable th5) {
                        th = th5;
                        byteArrayInputStream = byteArrayInputStream3;
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                        throw th;
                    }
                }
            }
        }
        DerValue[] set4 = derInputStream.getSet(1);
        int length4 = set4.length;
        this.signerInfos = new SignerInfo[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            this.signerInfos[i4] = new SignerInfo(set4[i4].toDerInputStream());
        }
    }

    private void populateCertIssuerNames() {
        X509Certificate[] x509CertificateArr = this.certificates;
        if (x509CertificateArr == null) {
            return;
        }
        this.certIssuerNames = new Principal[x509CertificateArr.length];
        int i = 0;
        while (true) {
            X509Certificate[] x509CertificateArr2 = this.certificates;
            if (i >= x509CertificateArr2.length) {
                return;
            }
            X509Certificate x509Certificate = x509CertificateArr2[i];
            Principal issuerDN = x509Certificate.getIssuerDN();
            if (!(issuerDN instanceof X500Name)) {
                try {
                    issuerDN = (Principal) new X509CertInfo(x509Certificate.getTBSCertificate()).get("issuer.dname");
                } catch (Exception unused) {
                }
            }
            this.certIssuerNames[i] = issuerDN;
            i++;
        }
    }

    public void encodeSignedData(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.putInteger(this.version);
        derOutputStream2.putOrderedSetOf((byte) 49, this.digestAlgorithmIds);
        this.contentInfo.encode(derOutputStream2);
        X509Certificate[] x509CertificateArr = this.certificates;
        if (x509CertificateArr != null && x509CertificateArr.length != 0) {
            X509CertImpl[] x509CertImplArr = new X509CertImpl[x509CertificateArr.length];
            int i = 0;
            while (true) {
                X509Certificate[] x509CertificateArr2 = this.certificates;
                if (i >= x509CertificateArr2.length) {
                    break;
                }
                X509Certificate x509Certificate = x509CertificateArr2[i];
                if (x509Certificate instanceof X509CertImpl) {
                    x509CertImplArr[i] = (X509CertImpl) x509Certificate;
                } else {
                    try {
                        x509CertImplArr[i] = new X509CertImpl(x509Certificate.getEncoded());
                    } catch (CertificateException e) {
                        IOException iOException = new IOException(e.getMessage());
                        iOException.initCause(e);
                        throw iOException;
                    }
                }
                i++;
            }
            derOutputStream2.putOrderedSetOf((byte) -96, x509CertImplArr);
        }
        X509CRL[] x509crlArr = this.crls;
        if (x509crlArr != null && x509crlArr.length != 0) {
            HashSet hashSet = new HashSet(this.crls.length);
            for (X509CRL x509crl : this.crls) {
                if (x509crl instanceof X509CRLImpl) {
                    hashSet.add((X509CRLImpl) x509crl);
                } else {
                    try {
                        hashSet.add(new X509CRLImpl(x509crl.getEncoded()));
                    } catch (CRLException e2) {
                        IOException iOException2 = new IOException(e2.getMessage());
                        iOException2.initCause(e2);
                        throw iOException2;
                    }
                }
            }
            derOutputStream2.putOrderedSetOf((byte) -95, (DerEncoder[]) hashSet.toArray(new X509CRLImpl[hashSet.size()]));
        }
        derOutputStream2.putOrderedSetOf((byte) 49, this.signerInfos);
        new ContentInfo(ContentInfo.SIGNED_DATA_OID, new DerValue((byte) 48, derOutputStream2.toByteArray())).encode(derOutputStream);
    }

    public X509CRL[] getCRLs() {
        X509CRL[] x509crlArr = this.crls;
        if (x509crlArr != null) {
            return (X509CRL[]) x509crlArr.clone();
        }
        return null;
    }

    public X509Certificate getCertificate(BigInteger bigInteger, X500Name x500Name) {
        if (this.certificates == null) {
            return null;
        }
        if (this.certIssuerNames == null) {
            populateCertIssuerNames();
        }
        int i = 0;
        while (true) {
            X509Certificate[] x509CertificateArr = this.certificates;
            if (i >= x509CertificateArr.length) {
                return null;
            }
            X509Certificate x509Certificate = x509CertificateArr[i];
            if (bigInteger.equals(x509Certificate.getSerialNumber()) && x500Name.equals(this.certIssuerNames[i])) {
                return x509Certificate;
            }
            i++;
        }
    }

    public X509Certificate[] getCertificates() {
        X509Certificate[] x509CertificateArr = this.certificates;
        if (x509CertificateArr != null) {
            return (X509Certificate[]) x509CertificateArr.clone();
        }
        return null;
    }

    public ContentInfo getContentInfo() {
        return this.contentInfo;
    }

    public AlgorithmId[] getDigestAlgorithmIds() {
        return this.digestAlgorithmIds;
    }

    public SignerInfo[] getSignerInfos() {
        return this.signerInfos;
    }

    public BigInteger getVersion() {
        return this.version;
    }

    public boolean isOldStyle() {
        return this.oldStyle;
    }

    public String toString() {
        String strConcat = "" + this.contentInfo + "\n";
        if (this.version != null) {
            StringBuilder sbM5346m = AbstractC1308pu.m5346m(strConcat, "PKCS7 :: version: ");
            sbM5346m.append(Debug.toHexString(this.version));
            sbM5346m.append("\n");
            strConcat = sbM5346m.toString();
        }
        if (this.digestAlgorithmIds != null) {
            strConcat = strConcat.concat("PKCS7 :: digest AlgorithmIds: \n");
            for (int i = 0; i < this.digestAlgorithmIds.length; i++) {
                StringBuilder sbM5346m2 = AbstractC1308pu.m5346m(strConcat, "\t");
                sbM5346m2.append(this.digestAlgorithmIds[i]);
                sbM5346m2.append("\n");
                strConcat = sbM5346m2.toString();
            }
        }
        if (this.certificates != null) {
            strConcat = strConcat.concat("PKCS7 :: certificates: \n");
            for (int i2 = 0; i2 < this.certificates.length; i2++) {
                strConcat = strConcat + "\t" + i2 + ".   " + this.certificates[i2] + "\n";
            }
        }
        if (this.crls != null) {
            strConcat = strConcat.concat("PKCS7 :: crls: \n");
            for (int i3 = 0; i3 < this.crls.length; i3++) {
                strConcat = strConcat + "\t" + i3 + ".   " + this.crls[i3] + "\n";
            }
        }
        if (this.signerInfos != null) {
            strConcat = strConcat.concat("PKCS7 :: signer infos: \n");
            for (int i4 = 0; i4 < this.signerInfos.length; i4++) {
                strConcat = strConcat + "\t" + i4 + ".  " + this.signerInfos[i4] + "\n";
            }
        }
        return strConcat;
    }

    public SignerInfo[] verify(byte[] bArr) {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            SignerInfo[] signerInfoArr = this.signerInfos;
            if (i >= signerInfoArr.length) {
                break;
            }
            SignerInfo signerInfoVerify = verify(signerInfoArr[i], bArr);
            if (signerInfoVerify != null) {
                vector.addElement(signerInfoVerify);
            }
            i++;
        }
        if (vector.size() == 0) {
            return null;
        }
        SignerInfo[] signerInfoArr2 = new SignerInfo[vector.size()];
        vector.copyInto(signerInfoArr2);
        return signerInfoArr2;
    }

    public PKCS7(DerInputStream derInputStream) throws Throwable {
        this.version = null;
        this.digestAlgorithmIds = null;
        this.contentInfo = null;
        this.certificates = null;
        this.crls = null;
        this.signerInfos = null;
        this.oldStyle = false;
        parse(derInputStream);
    }

    public SignerInfo verify(SignerInfo signerInfo, byte[] bArr) {
        return signerInfo.verify(this, bArr);
    }

    public SignerInfo[] verify() {
        return verify(null);
    }

    public PKCS7(byte[] bArr) throws Throwable {
        this.version = null;
        this.digestAlgorithmIds = null;
        this.contentInfo = null;
        this.certificates = null;
        this.crls = null;
        this.signerInfos = null;
        this.oldStyle = false;
        try {
            parse(new DerInputStream(bArr));
        } catch (IOException e) {
            ParsingException parsingException = new ParsingException("Unable to parse the encoded bytes");
            parsingException.initCause(e);
            throw parsingException;
        }
    }

    public PKCS7(AlgorithmId[] algorithmIdArr, ContentInfo contentInfo, X509Certificate[] x509CertificateArr, X509CRL[] x509crlArr, SignerInfo[] signerInfoArr) {
        this.version = null;
        this.digestAlgorithmIds = null;
        this.contentInfo = null;
        this.certificates = null;
        this.crls = null;
        this.signerInfos = null;
        this.oldStyle = false;
        this.version = BigInteger.ONE;
        this.digestAlgorithmIds = algorithmIdArr;
        this.contentInfo = contentInfo;
        this.certificates = x509CertificateArr;
        this.crls = x509crlArr;
        this.signerInfos = signerInfoArr;
    }

    public PKCS7(AlgorithmId[] algorithmIdArr, ContentInfo contentInfo, X509Certificate[] x509CertificateArr, SignerInfo[] signerInfoArr) {
        this(algorithmIdArr, contentInfo, x509CertificateArr, null, signerInfoArr);
    }

    private void parse(DerInputStream derInputStream) throws Throwable {
        try {
            try {
                derInputStream.mark(derInputStream.available());
                parse(derInputStream, false);
            } catch (IOException unused) {
                derInputStream.reset();
                parse(derInputStream, true);
                this.oldStyle = true;
            }
        } catch (IOException e) {
            ParsingException parsingException = new ParsingException(e.getMessage());
            parsingException.initCause(e);
            throw parsingException;
        }
    }

    public void encodeSignedData(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        encodeSignedData(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }
}
