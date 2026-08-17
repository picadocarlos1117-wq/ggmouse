package android.sun.security.provider;

import android.sun.misc.BASE64Decoder;
import android.sun.security.pkcs.PKCS7;
import android.sun.security.pkcs.ParsingException;
import android.sun.security.provider.certpath.X509CertPath;
import android.sun.security.provider.certpath.X509CertificatePair;
import android.sun.security.util.Cache;
import android.sun.security.x509.X509CRLImpl;
import android.sun.security.x509.X509CertImpl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.ca0;
import p000.jd0;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X509Factory extends CertificateFactorySpi {
    public static final String BEGIN_CERT = "-----BEGIN CERTIFICATE-----";
    private static final int ENC_MAX_LENGTH = 4194304;
    public static final String END_CERT = "-----END CERTIFICATE-----";
    private static final Cache certCache = Cache.newSoftMemoryCache(750);
    private static final Cache crlCache = Cache.newSoftMemoryCache(750);

    private static synchronized void addToCache(Cache cache, byte[] bArr, Object obj) {
        if (bArr.length > ENC_MAX_LENGTH) {
            return;
        }
        cache.put(new Cache.EqualByteArray(bArr), obj);
    }

    private static void checkHeaderFooter(String str, String str2) throws IOException {
        if (str.length() < 16 || !str.startsWith("-----BEGIN ") || !str.endsWith("-----")) {
            ca0.m1178j("Illegal header: ".concat(str));
            return;
        }
        if (str2.length() < 14 || !str2.startsWith("-----END ") || !str2.endsWith("-----")) {
            ca0.m1178j("Illegal footer: ".concat(str2));
        } else {
            if (str.substring(11, str.length() - 5).equals(str2.substring(9, str2.length() - 5))) {
                return;
            }
            ca0.m1178j(jd0.m3616n("Header and footer do not match: ", str, " ", str2));
        }
    }

    private static synchronized Object getFromCache(Cache cache, byte[] bArr) {
        return cache.get(new Cache.EqualByteArray(bArr));
    }

    public static synchronized X509CertImpl intern(X509Certificate x509Certificate) {
        X509CertImpl x509CertImpl;
        if (x509Certificate == null) {
            return null;
        }
        try {
            boolean z = x509Certificate instanceof X509CertImpl;
            byte[] encodedInternal = z ? ((X509CertImpl) x509Certificate).getEncodedInternal() : x509Certificate.getEncoded();
            Cache cache = certCache;
            X509CertImpl x509CertImpl2 = (X509CertImpl) getFromCache(cache, encodedInternal);
            if (x509CertImpl2 != null) {
                return x509CertImpl2;
            }
            if (z) {
                x509CertImpl = (X509CertImpl) x509Certificate;
            } else {
                x509CertImpl = new X509CertImpl(encodedInternal);
                encodedInternal = x509CertImpl.getEncodedInternal();
            }
            addToCache(cache, encodedInternal, x509CertImpl);
            return x509CertImpl;
        } catch (Throwable th) {
            throw th;
        }
    }

    private Collection<? extends CRL> parseX509orPKCS7CRL(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] oneBlock = readOneBlock(inputStream);
        if (oneBlock == null) {
            return new ArrayList(0);
        }
        try {
            X509CRL[] cRLs = new PKCS7(oneBlock).getCRLs();
            return cRLs != null ? Arrays.asList(cRLs) : new ArrayList(0);
        } catch (ParsingException unused) {
            while (oneBlock != null) {
                arrayList.add(new X509CRLImpl(oneBlock));
                oneBlock = readOneBlock(inputStream);
            }
            return arrayList;
        }
    }

    private Collection<? extends Certificate> parseX509orPKCS7Cert(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] oneBlock = readOneBlock(inputStream);
        if (oneBlock == null) {
            return new ArrayList(0);
        }
        try {
            X509Certificate[] certificates = new PKCS7(oneBlock).getCertificates();
            return certificates != null ? Arrays.asList(certificates) : new ArrayList(0);
        } catch (ParsingException unused) {
            while (oneBlock != null) {
                arrayList.add(new X509CertImpl(oneBlock));
                oneBlock = readOneBlock(inputStream);
            }
            return arrayList;
        }
    }

    private static int readBERInternal(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        if (i == -1) {
            i = inputStream.read();
            if (i == -1) {
                ca0.m1178j("BER/DER tag info absent");
                return 0;
            }
            if ((i & 31) == 31) {
                ca0.m1178j("Multi octets tag not supported");
                return 0;
            }
            byteArrayOutputStream.write(i);
        }
        int i2 = inputStream.read();
        if (i2 == -1) {
            ca0.m1178j("BER/DER length info ansent");
            return 0;
        }
        byteArrayOutputStream.write(i2);
        if (i2 != 128) {
            if (i2 >= 128) {
                if (i2 == 129) {
                    i2 = inputStream.read();
                    if (i2 == -1) {
                        ca0.m1178j("Incomplete BER/DER length info");
                        return 0;
                    }
                    byteArrayOutputStream.write(i2);
                } else if (i2 == 130) {
                    int i3 = inputStream.read();
                    int i4 = inputStream.read();
                    if (i4 == -1) {
                        ca0.m1178j("Incomplete BER/DER length info");
                        return 0;
                    }
                    byteArrayOutputStream.write(i3);
                    byteArrayOutputStream.write(i4);
                    i2 = (i3 << 8) | i4;
                } else {
                    if (i2 != 131) {
                        ca0.m1178j("Invalid BER/DER data (too huge?)");
                        return 0;
                    }
                    int i5 = inputStream.read();
                    int i6 = inputStream.read();
                    int i7 = inputStream.read();
                    if (i7 == -1) {
                        ca0.m1178j("Incomplete BER/DER length info");
                        return 0;
                    }
                    byteArrayOutputStream.write(i5);
                    byteArrayOutputStream.write(i6);
                    byteArrayOutputStream.write(i7);
                    i2 = (i5 << 16) | (i6 << 8) | i7;
                }
            }
            if (readFully(inputStream, byteArrayOutputStream, i2) != i2) {
                ca0.m1178j("Incomplete BER/DER data");
                return 0;
            }
        } else {
            if ((i & 32) != 32) {
                ca0.m1178j("Non constructed encoding must have definite length");
                return 0;
            }
            while (readBERInternal(inputStream, byteArrayOutputStream, -1) != 0) {
            }
        }
        return i;
    }

    private static int readFully(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        byte[] bArr = new byte[2048];
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, 0, i < 2048 ? i : 2048);
            if (i3 <= 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
            i2 += i3;
            i -= i3;
        }
        return i2;
    }

    private static byte[] readOneBlock(InputStream inputStream) throws IOException {
        int i;
        int i2 = inputStream.read();
        if (i2 == -1) {
            return null;
        }
        if (i2 == 48) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
            byteArrayOutputStream.write(i2);
            readBERInternal(inputStream, byteArrayOutputStream, i2);
            return byteArrayOutputStream.toByteArray();
        }
        char[] cArrCopyOf = new char[2048];
        int i3 = 1;
        int i4 = i2 == 45 ? 1 : 0;
        if (i2 == 45) {
            i2 = -1;
        }
        while (true) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                return null;
            }
            if (i5 == 45) {
                i4++;
            } else {
                i4 = 0;
                i2 = i5;
            }
            if (i4 == 5 && (i2 == -1 || i2 == 13 || i2 == 10)) {
                StringBuffer stringBuffer = new StringBuffer("-----");
                while (true) {
                    int i6 = inputStream.read();
                    if (i6 == -1) {
                        ca0.m1178j("Incomplete data");
                        return null;
                    }
                    if (i6 != 10) {
                        if (i6 == 13) {
                            int i7 = inputStream.read();
                            if (i7 == -1) {
                                ca0.m1178j("Incomplete data");
                                return null;
                            }
                            if (i7 != 10) {
                                cArrCopyOf[0] = (char) i7;
                                i = 13;
                                break;
                            }
                            break;
                        }
                        stringBuffer.append((char) i6);
                    }
                    i3 = 0;
                    i = 10;
                    break;
                }
                while (true) {
                    int i8 = inputStream.read();
                    if (i8 == -1) {
                        ca0.m1178j("Incomplete data");
                        return null;
                    }
                    if (i8 == 45) {
                        StringBuffer stringBuffer2 = new StringBuffer("-");
                        while (true) {
                            int i9 = inputStream.read();
                            if (i9 == -1 || i9 == i || i9 == 10) {
                                break;
                            }
                            if (i9 != 13) {
                                stringBuffer2.append((char) i9);
                            }
                        }
                        checkHeaderFooter(stringBuffer.toString(), stringBuffer2.toString());
                        return new BASE64Decoder().decodeBuffer(new String(cArrCopyOf, 0, i3));
                    }
                    int i10 = i3 + 1;
                    cArrCopyOf[i3] = (char) i8;
                    if (i10 >= cArrCopyOf.length) {
                        cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length + 1024);
                    }
                    i3 = i10;
                }
            }
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        if (inputStream == null) {
            crlCache.clear();
            throw new CRLException("Missing input stream");
        }
        try {
            byte[] oneBlock = readOneBlock(inputStream);
            if (oneBlock == null) {
                throw new IOException("Empty input");
            }
            Cache cache = crlCache;
            X509CRLImpl x509CRLImpl = (X509CRLImpl) getFromCache(cache, oneBlock);
            if (x509CRLImpl != null) {
                return x509CRLImpl;
            }
            X509CRLImpl x509CRLImpl2 = new X509CRLImpl(oneBlock);
            addToCache(cache, x509CRLImpl2.getEncodedInternal(), x509CRLImpl2);
            return x509CRLImpl2;
        } catch (IOException e) {
            throw new CRLException(e.getMessage());
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<? extends CRL> engineGenerateCRLs(InputStream inputStream) throws CRLException {
        if (inputStream == null) {
            throw new CRLException("Missing input stream");
        }
        try {
            return parseX509orPKCS7CRL(inputStream);
        } catch (IOException e) {
            throw new CRLException(e.getMessage());
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        if (inputStream == null) {
            lv1.m4299k("Missing input stream");
            return null;
        }
        try {
            byte[] oneBlock = readOneBlock(inputStream);
            if (oneBlock != null) {
                return new X509CertPath(new ByteArrayInputStream(oneBlock));
            }
            throw new IOException("Empty input");
        } catch (IOException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        if (inputStream == null) {
            certCache.clear();
            X509CertificatePair.clearCache();
            lv1.m4299k("Missing input stream");
            return null;
        }
        try {
            byte[] oneBlock = readOneBlock(inputStream);
            if (oneBlock == null) {
                throw new IOException("Empty input");
            }
            Cache cache = certCache;
            X509CertImpl x509CertImpl = (X509CertImpl) getFromCache(cache, oneBlock);
            if (x509CertImpl != null) {
                return x509CertImpl;
            }
            X509CertImpl x509CertImpl2 = new X509CertImpl(oneBlock);
            addToCache(cache, x509CertImpl2.getEncodedInternal(), x509CertImpl2);
            return x509CertImpl2;
        } catch (IOException e) {
            throw ((CertificateException) new CertificateException("Could not parse certificate: " + e.toString()).initCause(e));
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection<? extends Certificate> engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        if (inputStream == null) {
            lv1.m4299k("Missing input stream");
            return null;
        }
        try {
            return parseX509orPKCS7Cert(inputStream);
        } catch (IOException e) {
            throw new CertificateException(e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator<String> engineGetCertPathEncodings() {
        return X509CertPath.getEncodingsStatic();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        if (inputStream != null) {
            try {
                byte[] oneBlock = readOneBlock(inputStream);
                if (oneBlock != null) {
                    return new X509CertPath(new ByteArrayInputStream(oneBlock), str);
                }
                throw new IOException("Empty input");
            } catch (IOException e) {
                throw new CertificateException(e.getMessage());
            }
        }
        lv1.m4299k("Missing input stream");
        return null;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List<? extends Certificate> list) {
        return new X509CertPath(list);
    }

    public static synchronized X509CRLImpl intern(X509CRL x509crl) {
        byte[] encoded;
        X509CRLImpl x509CRLImpl;
        if (x509crl == null) {
            return null;
        }
        try {
            boolean z = x509crl instanceof X509CRLImpl;
            if (z) {
                encoded = ((X509CRLImpl) x509crl).getEncodedInternal();
            } else {
                encoded = x509crl.getEncoded();
            }
            Cache cache = crlCache;
            X509CRLImpl x509CRLImpl2 = (X509CRLImpl) getFromCache(cache, encoded);
            if (x509CRLImpl2 != null) {
                return x509CRLImpl2;
            }
            if (z) {
                x509CRLImpl = (X509CRLImpl) x509crl;
            } else {
                x509CRLImpl = new X509CRLImpl(encoded);
                encoded = x509CRLImpl.getEncodedInternal();
            }
            addToCache(cache, encoded, x509CRLImpl);
            return x509CRLImpl;
        } catch (Throwable th) {
            throw th;
        }
    }
}
