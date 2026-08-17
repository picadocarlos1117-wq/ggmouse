package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PolicyConstraintsExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.PolicyConstraints";
    public static final String INHIBIT = "inhibit";
    public static final String NAME = "PolicyConstraints";
    public static final String REQUIRE = "require";
    private static final byte TAG_INHIBIT = 1;
    private static final byte TAG_REQUIRE = 0;
    private int inhibit;
    private int require;

    public PolicyConstraintsExtension(Boolean bool, Object obj) throws IOException {
        this.require = -1;
        this.inhibit = -1;
        this.extensionId = PKIXExtensions.PolicyConstraints_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Sequence tag missing for PolicyConstraint.");
            throw null;
        }
        DerInputStream derInputStream = derValue.data;
        while (derInputStream != null && derInputStream.available() != 0) {
            DerValue derValue2 = derInputStream.getDerValue();
            if (!derValue2.isContextSpecific((byte) 0) || derValue2.isConstructed()) {
                if (!derValue2.isContextSpecific((byte) 1) || derValue2.isConstructed()) {
                    ca0.m1178j("Invalid encoding of PolicyConstraint");
                    throw null;
                }
                if (this.inhibit != -1) {
                    ca0.m1178j("Duplicate inhibitPolicyMappingfound in the PolicyConstraintsExtension");
                    throw null;
                }
                derValue2.resetTag((byte) 2);
                this.inhibit = derValue2.getInteger();
            } else {
                if (this.require != -1) {
                    ca0.m1178j("Duplicate requireExplicitPolicyfound in the PolicyConstraintsExtension");
                    throw null;
                }
                derValue2.resetTag((byte) 2);
                this.require = derValue2.getInteger();
            }
        }
    }

    private void encodeThis() throws IOException {
        if (this.require == -1 && this.inhibit == -1) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        if (this.require != -1) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            derOutputStream3.putInteger(this.require);
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
        }
        if (this.inhibit != -1) {
            DerOutputStream derOutputStream4 = new DerOutputStream();
            derOutputStream4.putInteger(this.inhibit);
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream4);
        }
        derOutputStream2.write((byte) 48, derOutputStream);
        this.extensionValue = derOutputStream2.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(REQUIRE)) {
            this.require = -1;
        } else {
            if (!str.equalsIgnoreCase(INHIBIT)) {
                ca0.m1178j("Attribute name not recognized by CertAttrSet:PolicyConstraints.");
                return;
            }
            this.inhibit = -1;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.PolicyConstraints_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(REQUIRE)) {
            return new Integer(this.require);
        }
        if (str.equalsIgnoreCase(INHIBIT)) {
            return new Integer(this.inhibit);
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:PolicyConstraints.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(REQUIRE);
        attributeNameEnumeration.addElement(INHIBIT);
        return attributeNameEnumeration.elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Integer)) {
            ca0.m1178j("Attribute value should be of type Integer.");
            return;
        }
        if (str.equalsIgnoreCase(REQUIRE)) {
            this.require = ((Integer) obj).intValue();
        } else {
            if (!str.equalsIgnoreCase(INHIBIT)) {
                ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:PolicyConstraints."));
                return;
            }
            this.inhibit = ((Integer) obj).intValue();
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String string;
        String strM5342i = AbstractC1308pu.m5342i(new StringBuilder(), super.toString(), "PolicyConstraints: [  Require: ");
        String strConcat = (this.require == -1 ? strM5342i.concat("unspecified;") : AbstractC1308pu.m5341h(AbstractC1308pu.m5344k(strM5342i), this.require, ";")).concat("\tInhibit: ");
        if (this.inhibit == -1) {
            string = strConcat.concat("unspecified");
        } else {
            StringBuilder sbM5344k = AbstractC1308pu.m5344k(strConcat);
            sbM5344k.append(this.inhibit);
            string = sbM5344k.toString();
        }
        return string.concat(" ]\n");
    }

    public PolicyConstraintsExtension(Boolean bool, int i, int i2) throws IOException {
        this.require = i;
        this.inhibit = i2;
        this.extensionId = PKIXExtensions.PolicyConstraints_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public PolicyConstraintsExtension(int i, int i2) {
        this(Boolean.FALSE, i, i2);
    }
}
