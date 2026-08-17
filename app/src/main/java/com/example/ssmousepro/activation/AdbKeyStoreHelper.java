package com.example.ssmousepro.activation;

import android.content.Context;
import android.sun.misc.BASE64Encoder;
import android.sun.security.provider.X509Factory;
import android.sun.security.x509.AlgorithmId;
import android.sun.security.x509.CertificateAlgorithmId;
import android.sun.security.x509.CertificateExtensions;
import android.sun.security.x509.CertificateIssuerName;
import android.sun.security.x509.CertificateSerialNumber;
import android.sun.security.x509.CertificateSubjectName;
import android.sun.security.x509.CertificateValidity;
import android.sun.security.x509.CertificateVersion;
import android.sun.security.x509.CertificateX509Key;
import android.sun.security.x509.KeyIdentifier;
import android.sun.security.x509.PrivateKeyUsageExtension;
import android.sun.security.x509.SubjectKeyIdentifierExtension;
import android.sun.security.x509.X500Name;
import android.sun.security.x509.X509CertImpl;
import android.sun.security.x509.X509CertInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Date;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
final class AdbKeyStoreHelper {
    private static final String ALG = "SHA512withRSA";
    private static final String CERT_FILE = "sspro_adb_cert.pem";
    private static final String KEY_FILE = "sspro_adb_private.key";
    private static final String SUBJECT = "CN=SS KeyMouse Pro";
    final Certificate certificate;
    final PrivateKey privateKey;

    private AdbKeyStoreHelper(PrivateKey privateKey, Certificate certificate) {
        this.privateKey = privateKey;
        this.certificate = certificate;
    }

    public static AdbKeyStoreHelper loadOrCreate(Context context) {
        Context applicationContext = context.getApplicationContext();
        PrivateKey privateKey = readPrivateKey(applicationContext);
        Certificate certificate = readCertificate(applicationContext);
        if (privateKey != null && certificate != null) {
            return new AdbKeyStoreHelper(privateKey, certificate);
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048, SecureRandom.getInstance("SHA1PRNG"));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        PrivateKey privateKey2 = keyPairGenerateKeyPair.getPrivate();
        long jCurrentTimeMillis = System.currentTimeMillis() + 315360000000L;
        CertificateExtensions certificateExtensions = new CertificateExtensions();
        certificateExtensions.set(SubjectKeyIdentifierExtension.NAME, new SubjectKeyIdentifierExtension(new KeyIdentifier(publicKey).getIdentifier()));
        X500Name x500Name = new X500Name(SUBJECT);
        Date date = new Date();
        Date date2 = new Date(jCurrentTimeMillis);
        certificateExtensions.set(PrivateKeyUsageExtension.NAME, new PrivateKeyUsageExtension(date, date2));
        X509CertInfo x509CertInfo = new X509CertInfo();
        x509CertInfo.set("version", new CertificateVersion(2));
        x509CertInfo.set("serialNumber", new CertificateSerialNumber(new Random().nextInt() & Integer.MAX_VALUE));
        x509CertInfo.set("algorithmID", new CertificateAlgorithmId(AlgorithmId.get(ALG)));
        x509CertInfo.set("subject", new CertificateSubjectName(x500Name));
        x509CertInfo.set("key", new CertificateX509Key(publicKey));
        x509CertInfo.set("validity", new CertificateValidity(date, date2));
        x509CertInfo.set("issuer", new CertificateIssuerName(x500Name));
        x509CertInfo.set("extensions", certificateExtensions);
        X509CertImpl x509CertImpl = new X509CertImpl(x509CertInfo);
        x509CertImpl.sign(privateKey2, ALG);
        writePrivateKey(applicationContext, privateKey2);
        writeCertificate(applicationContext, x509CertImpl);
        return new AdbKeyStoreHelper(privateKey2, x509CertImpl);
    }

    private static Certificate readCertificate(Context context) throws IOException {
        File file = new File(context.getFilesDir(), CERT_FILE);
        if (!file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(fileInputStream);
            fileInputStream.close();
            return certificateGenerateCertificate;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static PrivateKey readPrivateKey(Context context) throws IOException {
        File file = new File(context.getFilesDir(), KEY_FILE);
        if (!file.exists()) {
            return null;
        }
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.read(bArr);
            fileInputStream.close();
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void writeCertificate(Context context, Certificate certificate) throws IOException {
        File file = new File(context.getFilesDir(), CERT_FILE);
        BASE64Encoder bASE64Encoder = new BASE64Encoder();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Charset charset = StandardCharsets.UTF_8;
            fileOutputStream.write(X509Factory.BEGIN_CERT.getBytes(charset));
            fileOutputStream.write(10);
            bASE64Encoder.encode(certificate.getEncoded(), fileOutputStream);
            fileOutputStream.write(10);
            fileOutputStream.write(X509Factory.END_CERT.getBytes(charset));
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void writePrivateKey(Context context, PrivateKey privateKey) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), KEY_FILE));
        try {
            fileOutputStream.write(privateKey.getEncoded());
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
