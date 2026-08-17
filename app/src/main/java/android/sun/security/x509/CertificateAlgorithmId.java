package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateAlgorithmId implements CertAttrSet<String> {
    public static final String ALGORITHM = "algorithm";
    public static final String IDENT = "x509.info.algorithmID";
    public static final String NAME = "algorithmID";
    private AlgorithmId algId;

    public CertificateAlgorithmId(InputStream inputStream) {
        this.algId = AlgorithmId.parse(new DerValue(inputStream));
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("algorithm")) {
            this.algId = null;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateAlgorithmId.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.algId.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("algorithm")) {
            return this.algId;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateAlgorithmId.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("algorithm");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "algorithmID";
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof AlgorithmId)) {
            ca0.m1178j("Attribute must be of type AlgorithmId.");
        } else if (str.equalsIgnoreCase("algorithm")) {
            this.algId = (AlgorithmId) obj;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateAlgorithmId.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        if (this.algId == null) {
            return "";
        }
        return this.algId.toString() + ", OID = " + this.algId.getOID().toString() + "\n";
    }

    public CertificateAlgorithmId(DerInputStream derInputStream) {
        this.algId = AlgorithmId.parse(derInputStream.getDerValue());
    }

    public CertificateAlgorithmId(AlgorithmId algorithmId) {
        this.algId = algorithmId;
    }
}
