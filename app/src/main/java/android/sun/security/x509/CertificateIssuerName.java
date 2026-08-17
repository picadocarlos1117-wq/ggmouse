package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateIssuerName implements CertAttrSet<String> {
    public static final String DN_NAME = "dname";
    public static final String DN_PRINCIPAL = "x500principal";
    public static final String IDENT = "x509.info.issuer";
    public static final String NAME = "issuer";
    private X500Name dnName;
    private X500Principal dnPrincipal;

    public CertificateIssuerName(InputStream inputStream) {
        this.dnName = new X500Name(new DerValue(inputStream));
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("dname")) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateIssuerName.");
        } else {
            this.dnName = null;
            this.dnPrincipal = null;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.dnName.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        X500Name x500Name;
        if (str.equalsIgnoreCase("dname")) {
            return this.dnName;
        }
        if (!str.equalsIgnoreCase("x500principal")) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateIssuerName.");
            return null;
        }
        if (this.dnPrincipal == null && (x500Name = this.dnName) != null) {
            this.dnPrincipal = x500Name.asX500Principal();
        }
        return this.dnPrincipal;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("dname");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "issuer";
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof X500Name)) {
            ca0.m1178j("Attribute must be of type X500Name.");
        } else if (!str.equalsIgnoreCase("dname")) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateIssuerName.");
        } else {
            this.dnName = (X500Name) obj;
            this.dnPrincipal = null;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        X500Name x500Name = this.dnName;
        return x500Name == null ? "" : x500Name.toString();
    }

    public CertificateIssuerName(DerInputStream derInputStream) {
        this.dnName = new X500Name(derInputStream);
    }

    public CertificateIssuerName(X500Name x500Name) {
        this.dnName = x500Name;
    }
}
