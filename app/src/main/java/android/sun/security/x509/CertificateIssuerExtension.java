package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateIssuerExtension extends Extension implements CertAttrSet<String> {
    public static final String ISSUER = "issuer";
    public static final String NAME = "CertificateIssuer";
    private GeneralNames names;

    public CertificateIssuerExtension(Boolean bool, Object obj) {
        this.extensionId = PKIXExtensions.CertificateIssuer_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.names = new GeneralNames(new DerValue(bArr));
    }

    private void encodeThis() throws IOException {
        GeneralNames generalNames = this.names;
        if (generalNames == null || generalNames.isEmpty()) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        this.names.encode(derOutputStream);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("issuer")) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateIssuer");
        } else {
            this.names = null;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.CertificateIssuer_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("issuer")) {
            return this.names;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateIssuer");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("issuer");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase("issuer")) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateIssuer");
        } else if (!(obj instanceof GeneralNames)) {
            ca0.m1178j("Attribute value must be of type GeneralNames");
        } else {
            this.names = (GeneralNames) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        return super.toString() + "Certificate Issuer [\n" + String.valueOf(this.names) + "]\n";
    }

    public CertificateIssuerExtension(GeneralNames generalNames) throws IOException {
        this.extensionId = PKIXExtensions.CertificateIssuer_Id;
        this.critical = true;
        this.names = generalNames;
        encodeThis();
    }
}
