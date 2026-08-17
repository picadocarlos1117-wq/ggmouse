package android.sun.security.provider.certpath;

import android.sun.security.pkcs.ContentInfo;
import android.sun.security.pkcs.PKCS7;
import android.sun.security.pkcs.SignerInfo;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.x509.AlgorithmId;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X509CertPath extends CertPath {
    private static final String COUNT_ENCODING = "count";
    private static final String PKCS7_ENCODING = "PKCS7";
    private static final String PKIPATH_ENCODING = "PkiPath";
    private static final Collection<String> encodingList;
    private static final long serialVersionUID = 4989800333263052980L;
    private List<X509Certificate> certs;

    static {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(PKIPATH_ENCODING);
        arrayList.add(PKCS7_ENCODING);
        encodingList = Collections.unmodifiableCollection(arrayList);
    }

    public X509CertPath(List<? extends Certificate> list) throws CertificateException {
        super("X.509");
        for (Certificate certificate : list) {
            if (!(certificate instanceof X509Certificate)) {
                throw new CertificateException("List is not all X509Certificates: ".concat(certificate.getClass().getName()));
            }
        }
        this.certs = Collections.unmodifiableList(new ArrayList(list));
    }

    private byte[] encodePKCS7() throws CertificateEncodingException {
        ContentInfo contentInfo = new ContentInfo(ContentInfo.DATA_OID, (DerValue) null);
        List<X509Certificate> list = this.certs;
        PKCS7 pkcs7 = new PKCS7(new AlgorithmId[0], contentInfo, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), new SignerInfo[0]);
        DerOutputStream derOutputStream = new DerOutputStream();
        try {
            pkcs7.encodeSignedData(derOutputStream);
            return derOutputStream.toByteArray();
        } catch (IOException e) {
            throw new CertificateEncodingException(e.getMessage());
        }
    }

    private byte[] encodePKIPATH() throws CertificateEncodingException {
        List<X509Certificate> list = this.certs;
        ListIterator<X509Certificate> listIterator = list.listIterator(list.size());
        try {
            DerOutputStream derOutputStream = new DerOutputStream();
            while (listIterator.hasPrevious()) {
                X509Certificate x509CertificatePrevious = listIterator.previous();
                if (this.certs.lastIndexOf(x509CertificatePrevious) != this.certs.indexOf(x509CertificatePrevious)) {
                    throw new CertificateEncodingException("Duplicate Certificate");
                }
                derOutputStream.write(x509CertificatePrevious.getEncoded());
            }
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.write((byte) 48, derOutputStream);
            return derOutputStream2.toByteArray();
        } catch (IOException e) {
            CertificateEncodingException certificateEncodingException = new CertificateEncodingException("IOException encoding PkiPath data: " + e);
            certificateEncodingException.initCause(e);
            throw certificateEncodingException;
        }
    }

    public static Iterator<String> getEncodingsStatic() {
        return encodingList.iterator();
    }

    private static List<X509Certificate> parsePKCS7(InputStream inputStream) throws CertificateException {
        if (inputStream == null) {
            lv1.m4299k("input stream is null");
            return null;
        }
        try {
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(readAllBytes(inputStream));
            }
            X509Certificate[] certificates = new PKCS7(inputStream).getCertificates();
            return Collections.unmodifiableList(certificates != null ? Arrays.asList(certificates) : new ArrayList(0));
        } catch (IOException e) {
            throw new CertificateException("IOException parsing PKCS7 data: " + e);
        }
    }

    private static List<X509Certificate> parsePKIPATH(InputStream inputStream) throws CertificateException {
        if (inputStream == null) {
            lv1.m4299k("input stream is null");
            return null;
        }
        try {
            DerValue[] sequence = new DerInputStream(readAllBytes(inputStream)).getSequence(3);
            if (sequence.length == 0) {
                return Collections.EMPTY_LIST;
            }
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(sequence.length);
            for (int length = sequence.length - 1; length >= 0; length--) {
                arrayList.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(sequence[length].toByteArray())));
            }
            return Collections.unmodifiableList(arrayList);
        } catch (IOException e) {
            CertificateException certificateException = new CertificateException("IOException parsing PkiPath data: " + e);
            certificateException.initCause(e);
            throw certificateException;
        }
    }

    private static byte[] readAllBytes(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    @Override // java.security.cert.CertPath
    public List<X509Certificate> getCertificates() {
        return this.certs;
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        if (PKIPATH_ENCODING.equals(str)) {
            return encodePKIPATH();
        }
        if (PKCS7_ENCODING.equals(str)) {
            return encodePKCS7();
        }
        throw new CertificateEncodingException("unsupported encoding");
    }

    @Override // java.security.cert.CertPath
    public Iterator<String> getEncodings() {
        return getEncodingsStatic();
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() {
        return encodePKIPATH();
    }

    public X509CertPath(InputStream inputStream) {
        this(inputStream, PKIPATH_ENCODING);
    }

    public X509CertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        if (PKIPATH_ENCODING.equals(str)) {
            this.certs = parsePKIPATH(inputStream);
        } else if (PKCS7_ENCODING.equals(str)) {
            this.certs = parsePKCS7(inputStream);
        } else {
            lv1.m4299k("unsupported encoding");
            throw null;
        }
    }
}
