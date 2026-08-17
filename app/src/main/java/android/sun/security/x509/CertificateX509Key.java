package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.PublicKey;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateX509Key implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.key";
    public static final String KEY = "value";
    public static final String NAME = "key";
    private PublicKey key;

    public CertificateX509Key(InputStream inputStream) {
        this.key = X509Key.parse(new DerValue(inputStream));
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("value")) {
            this.key = null;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateX509Key.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.write(this.key.getEncoded());
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("value")) {
            return this.key;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateX509Key.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("value");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "key";
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase("value")) {
            this.key = (PublicKey) obj;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateX509Key.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        PublicKey publicKey = this.key;
        return publicKey == null ? "" : publicKey.toString();
    }

    public CertificateX509Key(DerInputStream derInputStream) {
        this.key = X509Key.parse(derInputStream.getDerValue());
    }

    public CertificateX509Key(PublicKey publicKey) {
        this.key = publicKey;
    }
}
