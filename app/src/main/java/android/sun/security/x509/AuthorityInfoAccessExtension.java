package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AuthorityInfoAccessExtension extends Extension implements CertAttrSet<String> {
    public static final String DESCRIPTIONS = "descriptions";
    public static final String IDENT = "x509.info.extensions.AuthorityInfoAccess";
    public static final String NAME = "AuthorityInfoAccess";
    private List<AccessDescription> accessDescriptions;

    public AuthorityInfoAccessExtension(Boolean bool, Object obj) throws IOException {
        this.extensionId = PKIXExtensions.AuthInfoAccess_Id;
        this.critical = bool.booleanValue();
        if (!(obj instanceof byte[])) {
            ca0.m1178j("Illegal argument type");
            throw null;
        }
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for AuthorityInfoAccessExtension.");
            throw null;
        }
        this.accessDescriptions = new ArrayList();
        while (derValue.data.available() != 0) {
            this.accessDescriptions.add(new AccessDescription(derValue.data.getDerValue()));
        }
    }

    private void encodeThis() throws IOException {
        if (this.accessDescriptions.isEmpty()) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        Iterator<AccessDescription> it = this.accessDescriptions.iterator();
        while (it.hasNext()) {
            it.next().encode(derOutputStream);
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.write((byte) 48, derOutputStream);
        this.extensionValue = derOutputStream2.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("descriptions")) {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:AuthorityInfoAccessExtension."));
        } else {
            this.accessDescriptions = new ArrayList();
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.AuthInfoAccess_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("descriptions")) {
            return this.accessDescriptions;
        }
        ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:AuthorityInfoAccessExtension."));
        return null;
    }

    public List<AccessDescription> getAccessDescriptions() {
        return this.accessDescriptions;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("descriptions");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase("descriptions")) {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:AuthorityInfoAccessExtension."));
        } else if (!(obj instanceof List)) {
            ca0.m1178j("Attribute value should be of type List.");
        } else {
            this.accessDescriptions = (List) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        return super.toString() + "AuthorityInfoAccess [\n  " + this.accessDescriptions + "\n]\n";
    }

    public AuthorityInfoAccessExtension(List<AccessDescription> list) throws IOException {
        this.extensionId = PKIXExtensions.AuthInfoAccess_Id;
        this.critical = false;
        this.accessDescriptions = list;
        encodeThis();
    }
}
