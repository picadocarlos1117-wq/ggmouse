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
public class CertificateSubjectUniqueIdentity implements CertAttrSet<String> {

    /* JADX INFO: renamed from: ID */
    public static final String f290ID = "id";
    public static final String IDENT = "x509.info.subjectID";
    public static final String NAME = "subjectID";

    /* JADX INFO: renamed from: id */
    private UniqueIdentity f291id;

    public CertificateSubjectUniqueIdentity(InputStream inputStream) {
        this.f291id = new UniqueIdentity(new DerValue(inputStream));
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            this.f291id = null;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateSubjectUniqueIdentity.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.f291id.encode(derOutputStream, DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 2));
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            return this.f291id;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateSubjectUniqueIdentity.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("id");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "subjectID";
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof UniqueIdentity)) {
            ca0.m1178j("Attribute must be of type UniqueIdentity.");
        } else if (str.equalsIgnoreCase("id")) {
            this.f291id = (UniqueIdentity) obj;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateSubjectUniqueIdentity.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        UniqueIdentity uniqueIdentity = this.f291id;
        return uniqueIdentity == null ? "" : uniqueIdentity.toString();
    }

    public CertificateSubjectUniqueIdentity(DerInputStream derInputStream) {
        this.f291id = new UniqueIdentity(derInputStream);
    }

    public CertificateSubjectUniqueIdentity(UniqueIdentity uniqueIdentity) {
        this.f291id = uniqueIdentity;
    }

    public CertificateSubjectUniqueIdentity(DerValue derValue) {
        this.f291id = new UniqueIdentity(derValue);
    }
}
