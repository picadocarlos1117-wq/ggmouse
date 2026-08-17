package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class BasicConstraintsExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.BasicConstraints";
    public static final String IS_CA = "is_ca";
    public static final String NAME = "BasicConstraints";
    public static final String PATH_LEN = "path_len";

    /* JADX INFO: renamed from: ca */
    private boolean f286ca;
    private int pathLen;

    public BasicConstraintsExtension(Boolean bool, Object obj) throws IOException {
        this.f286ca = false;
        this.pathLen = -1;
        this.extensionId = PKIXExtensions.BasicConstraints_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding of BasicConstraints");
            throw null;
        }
        DerInputStream derInputStream = derValue.data;
        if (derInputStream == null || derInputStream.available() == 0) {
            return;
        }
        DerValue derValue2 = derValue.data.getDerValue();
        if (derValue2.tag != 1) {
            return;
        }
        this.f286ca = derValue2.getBoolean();
        if (derValue.data.available() == 0) {
            this.pathLen = Integer.MAX_VALUE;
            return;
        }
        DerValue derValue3 = derValue.data.getDerValue();
        if (derValue3.tag == 2) {
            this.pathLen = derValue3.getInteger();
        } else {
            ca0.m1178j("Invalid encoding of BasicConstraints");
            throw null;
        }
    }

    private void encodeThis() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        boolean z = this.f286ca;
        if (z) {
            derOutputStream2.putBoolean(z);
            int i = this.pathLen;
            if (i >= 0) {
                derOutputStream2.putInteger(i);
            }
        }
        derOutputStream.write((byte) 48, derOutputStream2);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(IS_CA)) {
            this.f286ca = false;
        } else {
            if (!str.equalsIgnoreCase(PATH_LEN)) {
                ca0.m1178j("Attribute name not recognized by CertAttrSet:BasicConstraints.");
                return;
            }
            this.pathLen = -1;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.BasicConstraints_Id;
            if (this.f286ca) {
                this.critical = true;
            } else {
                this.critical = false;
            }
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(IS_CA)) {
            return Boolean.valueOf(this.f286ca);
        }
        if (str.equalsIgnoreCase(PATH_LEN)) {
            return Integer.valueOf(this.pathLen);
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:BasicConstraints.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(IS_CA);
        attributeNameEnumeration.addElement(PATH_LEN);
        return attributeNameEnumeration.elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase(IS_CA)) {
            if (!(obj instanceof Boolean)) {
                ca0.m1178j("Attribute value should be of type Boolean.");
                return;
            }
            this.f286ca = ((Boolean) obj).booleanValue();
        } else if (!str.equalsIgnoreCase(PATH_LEN)) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:BasicConstraints.");
            return;
        } else {
            if (!(obj instanceof Integer)) {
                ca0.m1178j("Attribute value should be of type Integer.");
                return;
            }
            this.pathLen = ((Integer) obj).intValue();
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String strM5342i = AbstractC1308pu.m5342i(AbstractC1308pu.m5344k(AbstractC1308pu.m5342i(new StringBuilder(), super.toString(), "BasicConstraints:[\n")), this.f286ca ? "  CA:true" : "  CA:false", "\n");
        return (this.pathLen >= 0 ? AbstractC1308pu.m5341h(AbstractC1308pu.m5346m(strM5342i, "  PathLen:"), this.pathLen, "\n") : strM5342i.concat("  PathLen: undefined\n")).concat("]\n");
    }

    public BasicConstraintsExtension(Boolean bool, boolean z, int i) throws IOException {
        this.f286ca = z;
        this.pathLen = i;
        this.extensionId = PKIXExtensions.BasicConstraints_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public BasicConstraintsExtension(boolean z, int i) {
        this(Boolean.valueOf(z), z, i);
    }
}
