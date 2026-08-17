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
public class SubjectKeyIdentifierExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.SubjectKeyIdentifier";
    public static final String KEY_ID = "key_id";
    public static final String NAME = "SubjectKeyIdentifier";

    /* JADX INFO: renamed from: id */
    private KeyIdentifier f296id;

    public SubjectKeyIdentifierExtension(Boolean bool, Object obj) {
        this.f296id = null;
        this.extensionId = PKIXExtensions.SubjectKey_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.f296id = new KeyIdentifier(new DerValue(bArr));
    }

    private void encodeThis() throws IOException {
        if (this.f296id == null) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        this.f296id.encode(derOutputStream);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("key_id")) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:SubjectKeyIdentifierExtension.");
        } else {
            this.f296id = null;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.SubjectKey_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("key_id")) {
            return this.f296id;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:SubjectKeyIdentifierExtension.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("key_id");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase("key_id")) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:SubjectKeyIdentifierExtension.");
        } else if (!(obj instanceof KeyIdentifier)) {
            ca0.m1178j("Attribute value should be of type KeyIdentifier.");
        } else {
            this.f296id = (KeyIdentifier) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        return super.toString() + "SubjectKeyIdentifier [\n" + String.valueOf(this.f296id) + "]\n";
    }

    public SubjectKeyIdentifierExtension(byte[] bArr) throws IOException {
        this.f296id = null;
        this.f296id = new KeyIdentifier(bArr);
        this.extensionId = PKIXExtensions.SubjectKey_Id;
        this.critical = false;
        encodeThis();
    }
}
