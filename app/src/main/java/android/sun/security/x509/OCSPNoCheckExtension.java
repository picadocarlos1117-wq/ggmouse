package android.sun.security.x509;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class OCSPNoCheckExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.OCSPNoCheck";
    public static final String NAME = "OCSPNoCheck";

    public OCSPNoCheckExtension(Boolean bool, Object obj) {
        this.extensionId = PKIXExtensions.OCSPNoCheck_Id;
        this.critical = bool.booleanValue();
        this.extensionValue = new byte[0];
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        throw new IOException("No attribute is allowed by CertAttrSet:OCSPNoCheckExtension.");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        throw new IOException("No attribute is allowed by CertAttrSet:OCSPNoCheckExtension.");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return new AttributeNameEnumeration().elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        throw new IOException("No attribute is allowed by CertAttrSet:OCSPNoCheckExtension.");
    }

    public OCSPNoCheckExtension() {
        this.extensionId = PKIXExtensions.OCSPNoCheck_Id;
        this.critical = false;
        this.extensionValue = new byte[0];
    }
}
