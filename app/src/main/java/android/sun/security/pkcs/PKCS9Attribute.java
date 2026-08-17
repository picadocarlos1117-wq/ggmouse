package android.sun.security.pkcs;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.Debug;
import android.sun.security.util.DerEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import android.sun.security.x509.CertificateExtensions;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import p000.ca0;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PKCS9Attribute implements DerEncoder {
    public static final ObjectIdentifier CHALLENGE_PASSWORD_OID;
    public static final String CHALLENGE_PASSWORD_STR = "ChallengePassword";
    public static final ObjectIdentifier CONTENT_TYPE_OID;
    public static final String CONTENT_TYPE_STR = "ContentType";
    public static final ObjectIdentifier COUNTERSIGNATURE_OID;
    public static final String COUNTERSIGNATURE_STR = "Countersignature";
    public static final ObjectIdentifier EMAIL_ADDRESS_OID;
    public static final String EMAIL_ADDRESS_STR = "EmailAddress";
    public static final ObjectIdentifier EXTENDED_CERTIFICATE_ATTRIBUTES_OID;
    public static final String EXTENDED_CERTIFICATE_ATTRIBUTES_STR = "ExtendedCertificateAttributes";
    public static final ObjectIdentifier EXTENSION_REQUEST_OID;
    public static final String EXTENSION_REQUEST_STR = "ExtensionRequest";
    public static final ObjectIdentifier ISSUER_SERIALNUMBER_OID;
    public static final String ISSUER_SERIALNUMBER_STR = "IssuerAndSerialNumber";
    public static final ObjectIdentifier MESSAGE_DIGEST_OID;
    public static final String MESSAGE_DIGEST_STR = "MessageDigest";
    private static final Hashtable<String, ObjectIdentifier> NAME_OID_TABLE;
    private static final Hashtable<ObjectIdentifier, String> OID_NAME_TABLE;
    private static final Byte[][] PKCS9_VALUE_TAGS;
    private static final String RSA_PROPRIETARY_STR = "RSAProprietary";
    public static final ObjectIdentifier SIGNATURE_TIMESTAMP_TOKEN_OID;
    public static final String SIGNATURE_TIMESTAMP_TOKEN_STR = "SignatureTimestampToken";
    public static final ObjectIdentifier SIGNING_CERTIFICATE_OID;
    public static final String SIGNING_CERTIFICATE_STR = "SigningCertificate";
    public static final ObjectIdentifier SIGNING_TIME_OID;
    public static final String SIGNING_TIME_STR = "SigningTime";
    private static final boolean[] SINGLE_VALUED;
    public static final ObjectIdentifier SMIME_CAPABILITY_OID;
    public static final String SMIME_CAPABILITY_STR = "SMIMECapability";
    private static final String SMIME_SIGNING_DESC_STR = "SMIMESigningDesc";
    public static final ObjectIdentifier UNSTRUCTURED_ADDRESS_OID;
    public static final String UNSTRUCTURED_ADDRESS_STR = "UnstructuredAddress";
    public static final ObjectIdentifier UNSTRUCTURED_NAME_OID;
    public static final String UNSTRUCTURED_NAME_STR = "UnstructuredName";
    private static final Class[] VALUE_CLASSES;
    private int index;
    private Object value;
    private static final Debug debug = Debug.getInstance("jar");
    static final ObjectIdentifier[] PKCS9_OIDS = new ObjectIdentifier[18];

    static {
        int i = 1;
        while (true) {
            ObjectIdentifier[] objectIdentifierArr = PKCS9_OIDS;
            if (i >= objectIdentifierArr.length - 2) {
                objectIdentifierArr[objectIdentifierArr.length - 2] = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 9, 16, 2, 12});
                objectIdentifierArr[objectIdentifierArr.length - 1] = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 9, 16, 2, 14});
                EMAIL_ADDRESS_OID = objectIdentifierArr[1];
                UNSTRUCTURED_NAME_OID = objectIdentifierArr[2];
                CONTENT_TYPE_OID = objectIdentifierArr[3];
                MESSAGE_DIGEST_OID = objectIdentifierArr[4];
                SIGNING_TIME_OID = objectIdentifierArr[5];
                COUNTERSIGNATURE_OID = objectIdentifierArr[6];
                CHALLENGE_PASSWORD_OID = objectIdentifierArr[7];
                UNSTRUCTURED_ADDRESS_OID = objectIdentifierArr[8];
                EXTENDED_CERTIFICATE_ATTRIBUTES_OID = objectIdentifierArr[9];
                ISSUER_SERIALNUMBER_OID = objectIdentifierArr[10];
                EXTENSION_REQUEST_OID = objectIdentifierArr[14];
                SMIME_CAPABILITY_OID = objectIdentifierArr[15];
                SIGNING_CERTIFICATE_OID = objectIdentifierArr[16];
                SIGNATURE_TIMESTAMP_TOKEN_OID = objectIdentifierArr[17];
                Hashtable<String, ObjectIdentifier> hashtable = new Hashtable<>(18);
                NAME_OID_TABLE = hashtable;
                hashtable.put("emailaddress", objectIdentifierArr[1]);
                hashtable.put("unstructuredname", objectIdentifierArr[2]);
                hashtable.put("contenttype", objectIdentifierArr[3]);
                hashtable.put("messagedigest", objectIdentifierArr[4]);
                hashtable.put("signingtime", objectIdentifierArr[5]);
                hashtable.put("countersignature", objectIdentifierArr[6]);
                hashtable.put("challengepassword", objectIdentifierArr[7]);
                hashtable.put("unstructuredaddress", objectIdentifierArr[8]);
                hashtable.put("extendedcertificateattributes", objectIdentifierArr[9]);
                hashtable.put("issuerandserialnumber", objectIdentifierArr[10]);
                hashtable.put("rsaproprietary", objectIdentifierArr[11]);
                hashtable.put("rsaproprietary", objectIdentifierArr[12]);
                hashtable.put("signingdescription", objectIdentifierArr[13]);
                hashtable.put("extensionrequest", objectIdentifierArr[14]);
                hashtable.put("smimecapability", objectIdentifierArr[15]);
                hashtable.put("signingcertificate", objectIdentifierArr[16]);
                hashtable.put("signaturetimestamptoken", objectIdentifierArr[17]);
                Hashtable<ObjectIdentifier, String> hashtable2 = new Hashtable<>(16);
                OID_NAME_TABLE = hashtable2;
                hashtable2.put(objectIdentifierArr[1], EMAIL_ADDRESS_STR);
                hashtable2.put(objectIdentifierArr[2], UNSTRUCTURED_NAME_STR);
                hashtable2.put(objectIdentifierArr[3], CONTENT_TYPE_STR);
                hashtable2.put(objectIdentifierArr[4], MESSAGE_DIGEST_STR);
                hashtable2.put(objectIdentifierArr[5], SIGNING_TIME_STR);
                hashtable2.put(objectIdentifierArr[6], COUNTERSIGNATURE_STR);
                hashtable2.put(objectIdentifierArr[7], CHALLENGE_PASSWORD_STR);
                hashtable2.put(objectIdentifierArr[8], UNSTRUCTURED_ADDRESS_STR);
                hashtable2.put(objectIdentifierArr[9], EXTENDED_CERTIFICATE_ATTRIBUTES_STR);
                hashtable2.put(objectIdentifierArr[10], ISSUER_SERIALNUMBER_STR);
                hashtable2.put(objectIdentifierArr[11], RSA_PROPRIETARY_STR);
                hashtable2.put(objectIdentifierArr[12], RSA_PROPRIETARY_STR);
                hashtable2.put(objectIdentifierArr[13], SMIME_SIGNING_DESC_STR);
                hashtable2.put(objectIdentifierArr[14], EXTENSION_REQUEST_STR);
                hashtable2.put(objectIdentifierArr[15], SMIME_CAPABILITY_STR);
                hashtable2.put(objectIdentifierArr[16], SIGNING_CERTIFICATE_STR);
                hashtable2.put(objectIdentifierArr[17], SIGNATURE_TIMESTAMP_TOKEN_STR);
                PKCS9_VALUE_TAGS = new Byte[][]{null, new Byte[]{new Byte(DerValue.tag_IA5String)}, new Byte[]{new Byte(DerValue.tag_IA5String)}, new Byte[]{new Byte((byte) 6)}, new Byte[]{new Byte((byte) 4)}, new Byte[]{new Byte(DerValue.tag_UtcTime)}, new Byte[]{new Byte((byte) 48)}, new Byte[]{new Byte(DerValue.tag_PrintableString), new Byte(DerValue.tag_T61String)}, new Byte[]{new Byte(DerValue.tag_PrintableString), new Byte(DerValue.tag_T61String)}, new Byte[]{new Byte((byte) 49)}, new Byte[]{new Byte((byte) 48)}, null, null, null, new Byte[]{new Byte((byte) 48)}, new Byte[]{new Byte((byte) 48)}, new Byte[]{new Byte((byte) 48)}, new Byte[]{new Byte((byte) 48)}};
                Class[] clsArr = new Class[18];
                VALUE_CLASSES = clsArr;
                try {
                    clsArr[0] = null;
                    clsArr[1] = String[].class;
                    clsArr[2] = String[].class;
                    clsArr[3] = ObjectIdentifier.class;
                    clsArr[4] = Class.forName("[B");
                    clsArr[5] = Class.forName("java.util.Date");
                    clsArr[6] = Class.forName("[L" + SignerInfo.class.getName() + ";");
                    clsArr[7] = String.class;
                    clsArr[8] = String[].class;
                    clsArr[9] = null;
                    clsArr[10] = null;
                    clsArr[11] = null;
                    clsArr[12] = null;
                    clsArr[13] = null;
                    clsArr[14] = CertificateExtensions.class;
                    clsArr[15] = null;
                    clsArr[16] = null;
                    clsArr[17] = Class.forName("[B");
                    SINGLE_VALUED = new boolean[]{false, false, false, true, true, true, false, true, false, false, true, false, false, false, true, true, true, true};
                    return;
                } catch (ClassNotFoundException e) {
                    throw new ExceptionInInitializerError(e.toString());
                }
            }
            objectIdentifierArr[i] = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 9, i});
            i++;
        }
    }

    public PKCS9Attribute(DerValue derValue) throws IOException {
        DerInputStream derInputStream = new DerInputStream(derValue.toByteArray());
        DerValue[] sequence = derInputStream.getSequence(2);
        if (derInputStream.available() != 0) {
            ca0.m1178j("Excess data parsing PKCS9Attribute");
            throw null;
        }
        if (sequence.length != 2) {
            ca0.m1178j("PKCS9Attribute doesn't have two components");
            throw null;
        }
        int i = 0;
        ObjectIdentifier oid = sequence[0].getOID();
        int iIndexOf = indexOf(oid, PKCS9_OIDS, 1);
        this.index = iIndexOf;
        if (iIndexOf == -1) {
            Debug debug2 = debug;
            if (debug2 != null) {
                debug2.println("ignoring unsupported signer attribute: " + oid);
            }
            throw new ParsingException("Unsupported PKCS9 attribute: " + oid);
        }
        DerValue[] set = new DerInputStream(sequence[1].toByteArray()).getSet(1);
        if (SINGLE_VALUED[this.index] && set.length > 1) {
            throwSingleValuedException();
        }
        for (DerValue derValue2 : set) {
            Byte b = new Byte(derValue2.tag);
            if (indexOf(b, PKCS9_VALUE_TAGS[this.index], 0) == -1) {
                throwTagException(b);
            }
        }
        switch (this.index) {
            case 1:
            case 2:
            case 8:
                String[] strArr = new String[set.length];
                while (i < set.length) {
                    strArr[i] = set[i].getAsString();
                    i++;
                }
                this.value = strArr;
                return;
            case 3:
                this.value = set[0].getOID();
                return;
            case 4:
                this.value = set[0].getOctetString();
                return;
            case 5:
                this.value = new DerInputStream(set[0].toByteArray()).getUTCTime();
                return;
            case 6:
                SignerInfo[] signerInfoArr = new SignerInfo[set.length];
                while (i < set.length) {
                    signerInfoArr[i] = new SignerInfo(set[i].toDerInputStream());
                    i++;
                }
                this.value = signerInfoArr;
                return;
            case 7:
                this.value = set[0].getAsString();
                return;
            case 9:
                ca0.m1178j("PKCS9 extended-certificate attribute not supported.");
                throw null;
            case 10:
                ca0.m1178j("PKCS9 IssuerAndSerialNumberattribute not supported.");
                throw null;
            case 11:
            case 12:
                ca0.m1178j("PKCS9 RSA DSI attributes11 and 12, not supported.");
                throw null;
            case 13:
                ca0.m1178j("PKCS9 attribute #13 not supported.");
                throw null;
            case 14:
                this.value = new CertificateExtensions(new DerInputStream(set[0].toByteArray()));
                return;
            case 15:
                ca0.m1178j("PKCS9 SMIMECapability attribute not supported.");
                throw null;
            case 16:
                this.value = new SigningCertificateInfo(set[0].toByteArray());
                return;
            case 17:
                this.value = set[0].toByteArray();
                return;
            default:
                return;
        }
    }

    public static ObjectIdentifier getOID(String str) {
        return NAME_OID_TABLE.get(str.toLowerCase(Locale.ENGLISH));
    }

    public static int indexOf(Object obj, Object[] objArr, int i) {
        while (i < objArr.length) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void init(ObjectIdentifier objectIdentifier, Object obj) {
        int iIndexOf = indexOf(objectIdentifier, PKCS9_OIDS, 1);
        this.index = iIndexOf;
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unsupported OID " + objectIdentifier + " constructing PKCS9Attribute.");
        }
        Class[] clsArr = VALUE_CLASSES;
        if (clsArr[iIndexOf].isInstance(obj)) {
            this.value = obj;
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong value class  for attribute ");
        sb.append(objectIdentifier);
        String string = obj.getClass().toString();
        Class cls = clsArr[this.index];
        sb.append(" constructing PKCS9Attribute; was ");
        sb.append(string);
        sb.append(", should be ");
        sb.append(cls.toString());
        throw new IllegalArgumentException(sb.toString());
    }

    private void throwSingleValuedException() throws IOException {
        throw new IOException("Single-value attribute " + getOID() + " (" + getName() + ") has multiple values.");
    }

    private void throwTagException(Byte b) throws IOException {
        Byte[] bArr = PKCS9_VALUE_TAGS[this.index];
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("Value of attribute ");
        stringBuffer.append(getOID().toString());
        stringBuffer.append(" (");
        stringBuffer.append(getName());
        stringBuffer.append(") has wrong tag: ");
        stringBuffer.append(b.toString());
        stringBuffer.append(".  Expected tags: ");
        stringBuffer.append(bArr[0].toString());
        for (int i = 1; i < bArr.length; i++) {
            stringBuffer.append(", ");
            stringBuffer.append(bArr[i].toString());
        }
        stringBuffer.append(".");
        throw new IOException(stringBuffer.toString());
    }

    @Override // android.sun.security.util.DerEncoder
    public void derEncode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putOID(getOID());
        int i = 0;
        switch (this.index) {
            case 1:
            case 2:
                String[] strArr = (String[]) this.value;
                DerOutputStream[] derOutputStreamArr = new DerOutputStream[strArr.length];
                while (i < strArr.length) {
                    DerOutputStream derOutputStream2 = new DerOutputStream();
                    derOutputStreamArr[i] = derOutputStream2;
                    derOutputStream2.putIA5String(strArr[i]);
                    i++;
                }
                derOutputStream.putOrderedSetOf((byte) 49, derOutputStreamArr);
                break;
            case 3:
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.putOID((ObjectIdentifier) this.value);
                derOutputStream.write((byte) 49, derOutputStream3.toByteArray());
                break;
            case 4:
                DerOutputStream derOutputStream4 = new DerOutputStream();
                derOutputStream4.putOctetString((byte[]) this.value);
                derOutputStream.write((byte) 49, derOutputStream4.toByteArray());
                break;
            case 5:
                DerOutputStream derOutputStream5 = new DerOutputStream();
                derOutputStream5.putUTCTime((Date) this.value);
                derOutputStream.write((byte) 49, derOutputStream5.toByteArray());
                break;
            case 6:
                derOutputStream.putOrderedSetOf((byte) 49, (DerEncoder[]) this.value);
                break;
            case 7:
                DerOutputStream derOutputStream6 = new DerOutputStream();
                derOutputStream6.putPrintableString((String) this.value);
                derOutputStream.write((byte) 49, derOutputStream6.toByteArray());
                break;
            case 8:
                String[] strArr2 = (String[]) this.value;
                DerOutputStream[] derOutputStreamArr2 = new DerOutputStream[strArr2.length];
                while (i < strArr2.length) {
                    DerOutputStream derOutputStream7 = new DerOutputStream();
                    derOutputStreamArr2[i] = derOutputStream7;
                    derOutputStream7.putPrintableString(strArr2[i]);
                    i++;
                }
                derOutputStream.putOrderedSetOf((byte) 49, derOutputStreamArr2);
                break;
            case 9:
                ca0.m1178j("PKCS9 extended-certificate attribute not supported.");
                return;
            case 10:
                ca0.m1178j("PKCS9 IssuerAndSerialNumberattribute not supported.");
                return;
            case 11:
            case 12:
                ca0.m1178j("PKCS9 RSA DSI attributes11 and 12, not supported.");
                return;
            case 13:
                ca0.m1178j("PKCS9 attribute #13 not supported.");
                return;
            case 14:
                DerOutputStream derOutputStream8 = new DerOutputStream();
                try {
                    ((CertificateExtensions) this.value).encode(derOutputStream8, true);
                    derOutputStream.write((byte) 49, derOutputStream8.toByteArray());
                } catch (CertificateException e) {
                    throw new IOException(e.toString());
                }
                break;
            case 15:
                ca0.m1178j("PKCS9 attribute #15 not supported.");
                return;
            case 16:
                ca0.m1178j("PKCS9 SigningCertificate attribute not supported.");
                return;
            case 17:
                derOutputStream.write((byte) 49, (byte[]) this.value);
                break;
        }
        DerOutputStream derOutputStream9 = new DerOutputStream();
        derOutputStream9.write((byte) 48, derOutputStream.toByteArray());
        outputStream.write(derOutputStream9.toByteArray());
    }

    public String getName() {
        return OID_NAME_TABLE.get(PKCS9_OIDS[this.index]);
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isSingleValued() {
        return SINGLE_VALUED[this.index];
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("[");
        stringBuffer.append(OID_NAME_TABLE.get(PKCS9_OIDS[this.index]));
        stringBuffer.append(": ");
        boolean z = SINGLE_VALUED[this.index];
        Object obj = this.value;
        if (z) {
            if (obj instanceof byte[]) {
                stringBuffer.append(new HexDumpEncoder().encodeBuffer((byte[]) this.value));
            } else {
                stringBuffer.append(obj.toString());
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
        boolean z2 = true;
        for (Object obj2 : (Object[]) obj) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(", ");
            }
            stringBuffer.append(obj2.toString());
        }
        return stringBuffer.toString();
    }

    public static String getName(ObjectIdentifier objectIdentifier) {
        return OID_NAME_TABLE.get(objectIdentifier);
    }

    public ObjectIdentifier getOID() {
        return PKCS9_OIDS[this.index];
    }

    public PKCS9Attribute(String str, Object obj) {
        ObjectIdentifier oid = getOID(str);
        if (oid != null) {
            init(oid, obj);
        } else {
            f40.m2713i(jd0.m3615m("Unrecognized attribute name ", str, " constructing PKCS9Attribute."));
            throw null;
        }
    }

    public PKCS9Attribute(ObjectIdentifier objectIdentifier, Object obj) {
        init(objectIdentifier, obj);
    }
}
