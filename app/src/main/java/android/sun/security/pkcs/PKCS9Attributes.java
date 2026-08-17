package android.sun.security.pkcs;

import android.sun.security.util.DerEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import p000.ca0;
import p000.jd0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PKCS9Attributes {
    private final Hashtable<ObjectIdentifier, PKCS9Attribute> attributes;
    private final byte[] derEncoding;
    private boolean ignoreUnsupportedAttributes;
    private final Hashtable<ObjectIdentifier, ObjectIdentifier> permittedAttributes;

    public PKCS9Attributes(PKCS9Attribute[] pKCS9AttributeArr) {
        this.attributes = new Hashtable<>(3);
        this.ignoreUnsupportedAttributes = false;
        for (int i = 0; i < pKCS9AttributeArr.length; i++) {
            ObjectIdentifier oid = pKCS9AttributeArr[i].getOID();
            if (this.attributes.containsKey(oid)) {
                ca0.m1180l("PKCSAttribute ", pKCS9AttributeArr[i].getOID(), " duplicated while constructing PKCS9Attributes.");
                throw null;
            }
            this.attributes.put(oid, pKCS9AttributeArr[i]);
        }
        this.derEncoding = generateDerEncoding();
        this.permittedAttributes = null;
    }

    public static DerEncoder[] castToDerEncoder(Object[] objArr) {
        int length = objArr.length;
        DerEncoder[] derEncoderArr = new DerEncoder[length];
        for (int i = 0; i < length; i++) {
            derEncoderArr[i] = (DerEncoder) objArr[i];
        }
        return derEncoderArr;
    }

    private byte[] decode(DerInputStream derInputStream) throws IOException {
        byte[] byteArray = derInputStream.getDerValue().toByteArray();
        byteArray[0] = 49;
        boolean z = true;
        for (DerValue derValue : new DerInputStream(byteArray).getSet(3, true)) {
            try {
                PKCS9Attribute pKCS9Attribute = new PKCS9Attribute(derValue);
                ObjectIdentifier oid = pKCS9Attribute.getOID();
                if (this.attributes.get(oid) != null) {
                    l41.m4047p(oid, "Duplicate PKCS9 attribute: ");
                    return null;
                }
                Hashtable<ObjectIdentifier, ObjectIdentifier> hashtable = this.permittedAttributes;
                if (hashtable != null && !hashtable.containsKey(oid)) {
                    throw new IOException("Attribute " + oid + " not permitted in this attribute set");
                }
                this.attributes.put(oid, pKCS9Attribute);
            } catch (ParsingException e) {
                if (!this.ignoreUnsupportedAttributes) {
                    throw e;
                }
                z = false;
            }
        }
        return z ? byteArray : generateDerEncoding();
    }

    private byte[] generateDerEncoding() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putOrderedSetOf((byte) 49, castToDerEncoder(this.attributes.values().toArray()));
        return derOutputStream.toByteArray();
    }

    public void encode(byte b, OutputStream outputStream) {
        outputStream.write(b);
        byte[] bArr = this.derEncoding;
        outputStream.write(bArr, 1, bArr.length - 1);
    }

    public PKCS9Attribute getAttribute(String str) {
        return this.attributes.get(PKCS9Attribute.getOID(str));
    }

    public Object getAttributeValue(String str) throws IOException {
        ObjectIdentifier oid = PKCS9Attribute.getOID(str);
        if (oid != null) {
            return getAttributeValue(oid);
        }
        ca0.m1178j(jd0.m3615m("Attribute name ", str, " not recognized or not supported."));
        return null;
    }

    public PKCS9Attribute[] getAttributes() {
        int size = this.attributes.size();
        PKCS9Attribute[] pKCS9AttributeArr = new PKCS9Attribute[size];
        int i = 0;
        int i2 = 1;
        while (true) {
            ObjectIdentifier[] objectIdentifierArr = PKCS9Attribute.PKCS9_OIDS;
            if (i2 >= objectIdentifierArr.length || i >= size) {
                break;
            }
            PKCS9Attribute attribute = getAttribute(objectIdentifierArr[i2]);
            pKCS9AttributeArr[i] = attribute;
            if (attribute != null) {
                i++;
            }
            i2++;
        }
        return pKCS9AttributeArr;
    }

    public byte[] getDerEncoding() {
        return (byte[]) this.derEncoding.clone();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append("PKCS9 Attributes: [\n\t");
        int i = 1;
        boolean z = true;
        while (true) {
            ObjectIdentifier[] objectIdentifierArr = PKCS9Attribute.PKCS9_OIDS;
            if (i >= objectIdentifierArr.length) {
                stringBuffer.append("\n\t] (end PKCS9 Attributes)");
                return stringBuffer.toString();
            }
            PKCS9Attribute attribute = getAttribute(objectIdentifierArr[i]);
            if (attribute != null) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(";\n\t");
                }
                stringBuffer.append(attribute.toString());
            }
            i++;
        }
    }

    public PKCS9Attribute getAttribute(ObjectIdentifier objectIdentifier) {
        return this.attributes.get(objectIdentifier);
    }

    public Object getAttributeValue(ObjectIdentifier objectIdentifier) throws IOException {
        try {
            return getAttribute(objectIdentifier).getValue();
        } catch (NullPointerException unused) {
            l41.m4047p(objectIdentifier, "No value found for attribute ");
            return null;
        }
    }

    public PKCS9Attributes(DerInputStream derInputStream) {
        this(derInputStream, false);
    }

    public PKCS9Attributes(DerInputStream derInputStream, boolean z) {
        this.attributes = new Hashtable<>(3);
        this.ignoreUnsupportedAttributes = z;
        this.derEncoding = decode(derInputStream);
        this.permittedAttributes = null;
    }

    public PKCS9Attributes(ObjectIdentifier[] objectIdentifierArr, DerInputStream derInputStream) {
        this.attributes = new Hashtable<>(3);
        this.ignoreUnsupportedAttributes = false;
        if (objectIdentifierArr != null) {
            this.permittedAttributes = new Hashtable<>(objectIdentifierArr.length);
            for (ObjectIdentifier objectIdentifier : objectIdentifierArr) {
                this.permittedAttributes.put(objectIdentifier, objectIdentifier);
            }
        } else {
            this.permittedAttributes = null;
        }
        this.derEncoding = decode(derInputStream);
    }
}
