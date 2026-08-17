package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class SubjectAlternativeNameExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.SubjectAlternativeName";
    public static final String NAME = "SubjectAlternativeName";
    public static final String SUBJECT_NAME = "subject_name";
    GeneralNames names;

    public SubjectAlternativeNameExtension(Boolean bool, Object obj) {
        this.names = null;
        this.extensionId = PKIXExtensions.SubjectAlternativeName_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.data == null) {
            this.names = new GeneralNames();
        } else {
            this.names = new GeneralNames(derValue);
        }
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
        if (!str.equalsIgnoreCase(SUBJECT_NAME)) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:SubjectAlternativeName.");
        } else {
            this.names = null;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.SubjectAlternativeName_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(SUBJECT_NAME)) {
            return this.names;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:SubjectAlternativeName.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o(SUBJECT_NAME);
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(SUBJECT_NAME)) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:SubjectAlternativeName.");
        } else if (!(obj instanceof GeneralNames)) {
            ca0.m1178j("Attribute value should be of type GeneralNames.");
        } else {
            this.names = (GeneralNames) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String strConcat;
        String strM5342i = AbstractC1308pu.m5342i(new StringBuilder(), super.toString(), "SubjectAlternativeName [\n");
        GeneralNames generalNames = this.names;
        if (generalNames == null) {
            strConcat = strM5342i.concat("  null\n");
        } else {
            Iterator<GeneralName> it = generalNames.names().iterator();
            while (it.hasNext()) {
                strM5342i = strM5342i + "  " + it.next() + "\n";
            }
            strConcat = strM5342i;
        }
        return strConcat.concat("]\n");
    }

    public SubjectAlternativeNameExtension(Boolean bool, GeneralNames generalNames) throws IOException {
        this.names = generalNames;
        this.extensionId = PKIXExtensions.SubjectAlternativeName_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public SubjectAlternativeNameExtension() {
        this.names = null;
        this.extensionId = PKIXExtensions.SubjectAlternativeName_Id;
        this.critical = false;
        this.names = new GeneralNames();
    }

    public SubjectAlternativeNameExtension(GeneralNames generalNames) {
        this(Boolean.FALSE, generalNames);
    }
}
