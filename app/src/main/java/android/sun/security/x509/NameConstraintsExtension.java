package android.sun.security.x509;

import android.sun.security.pkcs.PKCS9Attribute;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class NameConstraintsExtension extends Extension implements CertAttrSet<String>, Cloneable {
    public static final String EXCLUDED_SUBTREES = "excluded_subtrees";
    public static final String IDENT = "x509.info.extensions.NameConstraints";
    public static final String NAME = "NameConstraints";
    public static final String PERMITTED_SUBTREES = "permitted_subtrees";
    private static final byte TAG_EXCLUDED = 1;
    private static final byte TAG_PERMITTED = 0;
    private GeneralSubtrees excluded;
    private GeneralSubtrees permitted;

    public NameConstraintsExtension(Boolean bool, Object obj) throws IOException {
        this.permitted = null;
        this.excluded = null;
        this.extensionId = PKIXExtensions.NameConstraints_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for NameConstraintsExtension.");
            throw null;
        }
        if (derValue.data == null) {
            return;
        }
        while (derValue.data.available() != 0) {
            DerValue derValue2 = derValue.data.getDerValue();
            if (derValue2.isContextSpecific((byte) 0) && derValue2.isConstructed()) {
                if (this.permitted != null) {
                    ca0.m1178j("Duplicate permitted GeneralSubtrees in NameConstraintsExtension.");
                    throw null;
                }
                derValue2.resetTag((byte) 48);
                this.permitted = new GeneralSubtrees(derValue2);
            } else {
                if (!derValue2.isContextSpecific((byte) 1) || !derValue2.isConstructed()) {
                    ca0.m1178j("Invalid encoding of NameConstraintsExtension.");
                    throw null;
                }
                if (this.excluded != null) {
                    ca0.m1178j("Duplicate excluded GeneralSubtrees in NameConstraintsExtension.");
                    throw null;
                }
                derValue2.resetTag((byte) 48);
                this.excluded = new GeneralSubtrees(derValue2);
            }
        }
    }

    private void encodeThis() throws IOException {
        if (this.permitted == null && this.excluded == null) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        if (this.permitted != null) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            this.permitted.encode(derOutputStream3);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream3);
        }
        if (this.excluded != null) {
            DerOutputStream derOutputStream4 = new DerOutputStream();
            this.excluded.encode(derOutputStream4);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1), derOutputStream4);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
        this.extensionValue = derOutputStream.toByteArray();
    }

    public Object clone() {
        try {
            NameConstraintsExtension nameConstraintsExtension = (NameConstraintsExtension) super.clone();
            GeneralSubtrees generalSubtrees = this.permitted;
            if (generalSubtrees != null) {
                nameConstraintsExtension.permitted = (GeneralSubtrees) generalSubtrees.clone();
            }
            GeneralSubtrees generalSubtrees2 = this.excluded;
            if (generalSubtrees2 != null) {
                nameConstraintsExtension.excluded = (GeneralSubtrees) generalSubtrees2.clone();
            }
            return nameConstraintsExtension;
        } catch (CloneNotSupportedException unused) {
            l41.m4048q("CloneNotSupportedException while cloning NameConstraintsException. This should never happen.");
            return null;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(PERMITTED_SUBTREES)) {
            this.permitted = null;
        } else {
            if (!str.equalsIgnoreCase(EXCLUDED_SUBTREES)) {
                ca0.m1178j("Attribute name not recognized by CertAttrSet:NameConstraintsExtension.");
                return;
            }
            this.excluded = null;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.NameConstraints_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(PERMITTED_SUBTREES)) {
            return this.permitted;
        }
        if (str.equalsIgnoreCase(EXCLUDED_SUBTREES)) {
            return this.excluded;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:NameConstraintsExtension.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(PERMITTED_SUBTREES);
        attributeNameEnumeration.addElement(EXCLUDED_SUBTREES);
        return attributeNameEnumeration.elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    public void merge(NameConstraintsExtension nameConstraintsExtension) throws IOException {
        GeneralSubtrees generalSubtreesIntersect;
        if (nameConstraintsExtension == null) {
            return;
        }
        GeneralSubtrees generalSubtrees = (GeneralSubtrees) nameConstraintsExtension.get(EXCLUDED_SUBTREES);
        GeneralSubtrees generalSubtrees2 = this.excluded;
        if (generalSubtrees2 == null) {
            this.excluded = generalSubtrees != null ? (GeneralSubtrees) generalSubtrees.clone() : null;
        } else if (generalSubtrees != null) {
            generalSubtrees2.union(generalSubtrees);
        }
        GeneralSubtrees generalSubtrees3 = (GeneralSubtrees) nameConstraintsExtension.get(PERMITTED_SUBTREES);
        GeneralSubtrees generalSubtrees4 = this.permitted;
        if (generalSubtrees4 == null) {
            this.permitted = generalSubtrees3 != null ? (GeneralSubtrees) generalSubtrees3.clone() : null;
        } else if (generalSubtrees3 != null && (generalSubtreesIntersect = generalSubtrees4.intersect(generalSubtrees3)) != null) {
            GeneralSubtrees generalSubtrees5 = this.excluded;
            if (generalSubtrees5 != null) {
                generalSubtrees5.union(generalSubtreesIntersect);
            } else {
                this.excluded = (GeneralSubtrees) generalSubtreesIntersect.clone();
            }
        }
        GeneralSubtrees generalSubtrees6 = this.permitted;
        if (generalSubtrees6 != null) {
            generalSubtrees6.reduce(this.excluded);
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase(PERMITTED_SUBTREES)) {
            if (!(obj instanceof GeneralSubtrees)) {
                ca0.m1178j("Attribute value should be of type GeneralSubtrees.");
                return;
            }
            this.permitted = (GeneralSubtrees) obj;
        } else if (!str.equalsIgnoreCase(EXCLUDED_SUBTREES)) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:NameConstraintsExtension.");
            return;
        } else {
            if (!(obj instanceof GeneralSubtrees)) {
                ca0.m1178j("Attribute value should be of type GeneralSubtrees.");
                return;
            }
            this.excluded = (GeneralSubtrees) obj;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("NameConstraints: [");
        String str2 = "";
        if (this.permitted == null) {
            str = "";
        } else {
            str = "\n    Permitted:" + this.permitted.toString();
        }
        sb.append(str);
        if (this.excluded != null) {
            str2 = "\n    Excluded:" + this.excluded.toString();
        }
        return AbstractC1308pu.m5342i(sb, str2, "   ]\n");
    }

    public boolean verify(GeneralNameInterface generalNameInterface) throws IOException {
        GeneralName name;
        GeneralNameInterface name2;
        GeneralName name3;
        GeneralNameInterface name4;
        int iConstrains;
        if (generalNameInterface == null) {
            ca0.m1178j("name is null");
            return false;
        }
        GeneralSubtrees generalSubtrees = this.excluded;
        if (generalSubtrees != null && generalSubtrees.size() > 0) {
            for (int i = 0; i < this.excluded.size(); i++) {
                GeneralSubtree generalSubtree = this.excluded.get(i);
                if (generalSubtree != null && (name3 = generalSubtree.getName()) != null && (name4 = name3.getName()) != null && ((iConstrains = name4.constrains(generalNameInterface)) == 0 || iConstrains == 1)) {
                    return false;
                }
            }
        }
        GeneralSubtrees generalSubtrees2 = this.permitted;
        if (generalSubtrees2 == null || generalSubtrees2.size() <= 0) {
            return true;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.permitted.size(); i2++) {
            GeneralSubtree generalSubtree2 = this.permitted.get(i2);
            if (generalSubtree2 != null && (name = generalSubtree2.getName()) != null && (name2 = name.getName()) != null) {
                int iConstrains2 = name2.constrains(generalNameInterface);
                if (iConstrains2 == 0 || iConstrains2 == 1) {
                    return true;
                }
                if (iConstrains2 == 2 || iConstrains2 == 3) {
                    z = true;
                }
            }
        }
        return !z;
    }

    public boolean verifyRFC822SpecialCase(X500Name x500Name) {
        String valueString;
        for (AVA ava : x500Name.allAvas()) {
            if (ava.getObjectIdentifier().equals(PKCS9Attribute.EMAIL_ADDRESS_OID) && (valueString = ava.getValueString()) != null) {
                try {
                    if (!verify(new RFC822Name(valueString))) {
                        return false;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return true;
    }

    public NameConstraintsExtension(GeneralSubtrees generalSubtrees, GeneralSubtrees generalSubtrees2) throws IOException {
        this.permitted = generalSubtrees;
        this.excluded = generalSubtrees2;
        this.extensionId = PKIXExtensions.NameConstraints_Id;
        this.critical = true;
        encodeThis();
    }
}
