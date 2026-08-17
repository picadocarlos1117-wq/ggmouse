package android.sun.security.x509;

import android.sun.security.pkcs.PKCS10;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Random;
import p000.AbstractC1308pu;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class CertAndKeyGen {
    private KeyPairGenerator keyGen;
    private PrivateKey privateKey;
    private SecureRandom prng;
    private PublicKey publicKey;
    private String sigAlg;

    public CertAndKeyGen(String str, String str2, String str3) {
        if (str3 == null) {
            this.keyGen = KeyPairGenerator.getInstance(str);
        } else {
            try {
                this.keyGen = KeyPairGenerator.getInstance(str, str3);
            } catch (Exception unused) {
                this.keyGen = KeyPairGenerator.getInstance(str);
            }
        }
        this.sigAlg = str2;
    }

    public void generate(int i) {
        try {
            if (this.prng == null) {
                this.prng = new SecureRandom();
            }
            this.keyGen.initialize(i, this.prng);
            KeyPair keyPairGenerateKeyPair = this.keyGen.generateKeyPair();
            this.publicKey = keyPairGenerateKeyPair.getPublic();
            this.privateKey = keyPairGenerateKeyPair.getPrivate();
        } catch (Exception e) {
            f40.m2713i(e.getMessage());
        }
    }

    public PKCS10 getCertRequest(X500Name x500Name) throws SignatureException, InvalidKeyException {
        PKCS10 pkcs10 = new PKCS10(this.publicKey);
        try {
            Signature signature = Signature.getInstance(this.sigAlg);
            signature.initSign(this.privateKey);
            pkcs10.encodeAndSign(x500Name, signature);
            return pkcs10;
        } catch (IOException unused) {
            throw new SignatureException(AbstractC1308pu.m5342i(new StringBuilder(), this.sigAlg, " IOException"));
        } catch (NoSuchAlgorithmException unused2) {
            throw new SignatureException(AbstractC1308pu.m5342i(new StringBuilder(), this.sigAlg, " unavailable?"));
        } catch (CertificateException unused3) {
            throw new SignatureException(AbstractC1308pu.m5342i(new StringBuilder(), this.sigAlg, " CertificateException"));
        }
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public X509Key getPublicKey() {
        PublicKey publicKey = this.publicKey;
        if (publicKey instanceof X509Key) {
            return (X509Key) publicKey;
        }
        return null;
    }

    public X509Certificate getSelfCertificate(X500Name x500Name, Date date, long j) throws SignatureException, InvalidKeyException, CertificateEncodingException {
        try {
            Date date2 = new Date();
            date2.setTime((j * 1000) + date.getTime());
            CertificateValidity certificateValidity = new CertificateValidity(date, date2);
            X509CertInfo x509CertInfo = new X509CertInfo();
            x509CertInfo.set("version", new CertificateVersion(2));
            x509CertInfo.set("serialNumber", new CertificateSerialNumber(new Random().nextInt() & Integer.MAX_VALUE));
            x509CertInfo.set("algorithmID", new CertificateAlgorithmId(AlgorithmId.getAlgorithmId(this.sigAlg)));
            x509CertInfo.set("subject", new CertificateSubjectName(x500Name));
            x509CertInfo.set("key", new CertificateX509Key(this.publicKey));
            x509CertInfo.set("validity", certificateValidity);
            x509CertInfo.set("issuer", new CertificateIssuerName(x500Name));
            X509CertImpl x509CertImpl = new X509CertImpl(x509CertInfo);
            x509CertImpl.sign(this.privateKey, this.sigAlg);
            return x509CertImpl;
        } catch (IOException e) {
            throw new CertificateEncodingException(jd0.m3611i(e, new StringBuilder("getSelfCert: ")));
        }
    }

    public void setRandom(SecureRandom secureRandom) {
        this.prng = secureRandom;
    }

    public CertAndKeyGen(String str, String str2) {
        this.keyGen = KeyPairGenerator.getInstance(str);
        this.sigAlg = str2;
    }

    public X509Certificate getSelfCertificate(X500Name x500Name, long j) {
        return getSelfCertificate(x500Name, new Date(), j);
    }
}
