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
public class AuthorityKeyIdentifierExtension extends Extension implements CertAttrSet<String> {
    public static final String AUTH_NAME = "auth_name";
    public static final String IDENT = "x509.info.extensions.AuthorityKeyIdentifier";
    public static final String KEY_ID = "key_id";
    public static final String NAME = "AuthorityKeyIdentifier";
    public static final String SERIAL_NUMBER = "serial_number";
    private static final byte TAG_ID = 0;
    private static final byte TAG_NAMES = 1;
    private static final byte TAG_SERIAL_NUM = 2;

    /* JADX INFO: renamed from: id */
    private KeyIdentifier f285id;
    private GeneralNames names;
    private SerialNumber serialNum;

    public AuthorityKeyIdentifierExtension(Boolean bool, Object obj) throws IOException {
        this.f285id = null;
        this.names = null;
        this.serialNum = null;
        this.extensionId = PKIXExtensions.AuthorityKey_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for AuthorityKeyIdentifierExtension.");
            throw null;
        }
        while (true) {
            DerInputStream derInputStream = derValue.data;
            if (derInputStream == null || derInputStream.available() == 0) {
                return;
            }
            DerValue derValue2 = derValue.data.getDerValue();
            if (!derValue2.isContextSpecific((byte) 0) || derValue2.isConstructed()) {
                if (derValue2.isContextSpecific((byte) 1) && derValue2.isConstructed()) {
                    if (this.names != null) {
                        ca0.m1178j("Duplicate GeneralNames in AuthorityKeyIdentifier.");
                        throw null;
                    }
                    derValue2.resetTag((byte) 48);
                    this.names = new GeneralNames(derValue2);
                } else {
                    if (!derValue2.isContextSpecific((byte) 2) || derValue2.isConstructed()) {
                        ca0.m1178j("Invalid encoding of AuthorityKeyIdentifierExtension.");
                        throw null;
                    }
                    if (this.serialNum != null) {
                        ca0.m1178j("Duplicate SerialNumber in AuthorityKeyIdentifier.");
                        throw null;
                    }
                    derValue2.resetTag((byte) 2);
                    this.serialNum = new SerialNumber(derValue2);
                }
            } else {
                if (this.f285id != null) {
                    ca0.m1178j("Duplicate KeyIdentifier in AuthorityKeyIdentifier.");
                    throw null;
                }
                derValue2.resetTag((byte) 4);
                this.f285id = new KeyIdentifier(derValue2);
            }
        }
    }

    private void encodeThis() throws IOException {
        if (this.f285id == null && this.names == null && this.serialNum == null) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        if (this.f285id != null) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            this.f285id.encode(derOutputStream3);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
        }
        try {
            if (this.names != null) {
                DerOutputStream derOutputStream4 = new DerOutputStream();
                this.names.encode(derOutputStream4);
                derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1), derOutputStream4);
            }
            if (this.serialNum != null) {
                DerOutputStream derOutputStream5 = new DerOutputStream();
                this.serialNum.encode(derOutputStream5);
                derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 2), derOutputStream5);
            }
            derOutputStream.write((byte) 48, derOutputStream2);
            this.extensionValue = derOutputStream.toByteArray();
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("key_id")) {
            this.f285id = null;
        } else if (str.equalsIgnoreCase(AUTH_NAME)) {
            this.names = null;
        } else {
            if (!str.equalsIgnoreCase(SERIAL_NUMBER)) {
                ca0.m1178j("Attribute name not recognized by CertAttrSet:AuthorityKeyIdentifier.");
                return;
            }
            this.serialNum = null;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.AuthorityKey_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("key_id")) {
            return this.f285id;
        }
        if (str.equalsIgnoreCase(AUTH_NAME)) {
            return this.names;
        }
        if (str.equalsIgnoreCase(SERIAL_NUMBER)) {
            return this.serialNum;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:AuthorityKeyIdentifier.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement("key_id");
        attributeNameEnumeration.addElement(AUTH_NAME);
        attributeNameEnumeration.addElement(SERIAL_NUMBER);
        return attributeNameEnumeration.elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase("key_id")) {
            if (!(obj instanceof KeyIdentifier)) {
                ca0.m1178j("Attribute value should be of type KeyIdentifier.");
                return;
            }
            this.f285id = (KeyIdentifier) obj;
        } else if (str.equalsIgnoreCase(AUTH_NAME)) {
            if (!(obj instanceof GeneralNames)) {
                ca0.m1178j("Attribute value should be of type GeneralNames.");
                return;
            }
            this.names = (GeneralNames) obj;
        } else if (!str.equalsIgnoreCase(SERIAL_NUMBER)) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:AuthorityKeyIdentifier.");
            return;
        } else {
            if (!(obj instanceof SerialNumber)) {
                ca0.m1178j("Attribute value should be of type SerialNumber.");
                return;
            }
            this.serialNum = (SerialNumber) obj;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String strM5342i = AbstractC1308pu.m5342i(new StringBuilder(), super.toString(), "AuthorityKeyIdentifier [\n");
        if (this.f285id != null) {
            StringBuilder sbM5344k = AbstractC1308pu.m5344k(strM5342i);
            sbM5344k.append(this.f285id.toString());
            strM5342i = sbM5344k.toString();
        }
        if (this.names != null) {
            StringBuilder sbM5344k2 = AbstractC1308pu.m5344k(strM5342i);
            sbM5344k2.append(this.names.toString());
            sbM5344k2.append("\n");
            strM5342i = sbM5344k2.toString();
        }
        if (this.serialNum != null) {
            StringBuilder sbM5344k3 = AbstractC1308pu.m5344k(strM5342i);
            sbM5344k3.append(this.serialNum.toString());
            sbM5344k3.append("\n");
            strM5342i = sbM5344k3.toString();
        }
        return strM5342i.concat("]\n");
    }

    public AuthorityKeyIdentifierExtension(KeyIdentifier keyIdentifier, GeneralNames generalNames, SerialNumber serialNumber) throws IOException {
        this.f285id = keyIdentifier;
        this.names = generalNames;
        this.serialNum = serialNumber;
        this.extensionId = PKIXExtensions.AuthorityKey_Id;
        this.critical = false;
        encodeThis();
    }
}
