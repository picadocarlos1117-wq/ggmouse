package android.sun.security.x509;

import android.sun.security.util.BitArray;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class KeyUsageExtension extends Extension implements CertAttrSet<String> {
    public static final String CRL_SIGN = "crl_sign";
    public static final String DATA_ENCIPHERMENT = "data_encipherment";
    public static final String DECIPHER_ONLY = "decipher_only";
    public static final String DIGITAL_SIGNATURE = "digital_signature";
    public static final String ENCIPHER_ONLY = "encipher_only";
    public static final String IDENT = "x509.info.extensions.KeyUsage";
    public static final String KEY_AGREEMENT = "key_agreement";
    public static final String KEY_CERTSIGN = "key_certsign";
    public static final String KEY_ENCIPHERMENT = "key_encipherment";
    public static final String NAME = "KeyUsage";
    public static final String NON_REPUDIATION = "non_repudiation";
    private boolean[] bitString;

    public KeyUsageExtension(Boolean bool, Object obj) {
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        if (bArr[0] == 4) {
            this.extensionValue = new DerValue(bArr).getOctetString();
        } else {
            this.extensionValue = bArr;
        }
        this.bitString = new DerValue(this.extensionValue).getUnalignedBitString().toBooleanArray();
    }

    private void encodeThis() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putTruncatedUnalignedBitString(new BitArray(this.bitString));
        this.extensionValue = derOutputStream.toByteArray();
    }

    private boolean isSet(int i) {
        return this.bitString[i];
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(DIGITAL_SIGNATURE)) {
            set(0, false);
        } else if (str.equalsIgnoreCase(NON_REPUDIATION)) {
            set(1, false);
        } else if (str.equalsIgnoreCase(KEY_ENCIPHERMENT)) {
            set(2, false);
        } else if (str.equalsIgnoreCase(DATA_ENCIPHERMENT)) {
            set(3, false);
        } else if (str.equalsIgnoreCase(KEY_AGREEMENT)) {
            set(4, false);
        } else if (str.equalsIgnoreCase(KEY_CERTSIGN)) {
            set(5, false);
        } else if (str.equalsIgnoreCase(CRL_SIGN)) {
            set(6, false);
        } else if (str.equalsIgnoreCase(ENCIPHER_ONLY)) {
            set(7, false);
        } else {
            if (!str.equalsIgnoreCase(DECIPHER_ONLY)) {
                ca0.m1178j("Attribute name not recognized by CertAttrSet:KeyUsage.");
                return;
            }
            set(8, false);
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.KeyUsage_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(DIGITAL_SIGNATURE)) {
            return Boolean.valueOf(isSet(0));
        }
        if (str.equalsIgnoreCase(NON_REPUDIATION)) {
            return Boolean.valueOf(isSet(1));
        }
        if (str.equalsIgnoreCase(KEY_ENCIPHERMENT)) {
            return Boolean.valueOf(isSet(2));
        }
        if (str.equalsIgnoreCase(DATA_ENCIPHERMENT)) {
            return Boolean.valueOf(isSet(3));
        }
        if (str.equalsIgnoreCase(KEY_AGREEMENT)) {
            return Boolean.valueOf(isSet(4));
        }
        if (str.equalsIgnoreCase(KEY_CERTSIGN)) {
            return Boolean.valueOf(isSet(5));
        }
        if (str.equalsIgnoreCase(CRL_SIGN)) {
            return Boolean.valueOf(isSet(6));
        }
        if (str.equalsIgnoreCase(ENCIPHER_ONLY)) {
            return Boolean.valueOf(isSet(7));
        }
        if (str.equalsIgnoreCase(DECIPHER_ONLY)) {
            return Boolean.valueOf(isSet(8));
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:KeyUsage.");
        return null;
    }

    public boolean[] getBits() {
        return (boolean[]) this.bitString.clone();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(DIGITAL_SIGNATURE);
        attributeNameEnumeration.addElement(NON_REPUDIATION);
        attributeNameEnumeration.addElement(KEY_ENCIPHERMENT);
        attributeNameEnumeration.addElement(DATA_ENCIPHERMENT);
        attributeNameEnumeration.addElement(KEY_AGREEMENT);
        attributeNameEnumeration.addElement(KEY_CERTSIGN);
        attributeNameEnumeration.addElement(CRL_SIGN);
        attributeNameEnumeration.addElement(ENCIPHER_ONLY);
        attributeNameEnumeration.addElement(DECIPHER_ONLY);
        return attributeNameEnumeration.elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Boolean)) {
            ca0.m1178j("Attribute must be of type Boolean.");
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (str.equalsIgnoreCase(DIGITAL_SIGNATURE)) {
            set(0, zBooleanValue);
        } else if (str.equalsIgnoreCase(NON_REPUDIATION)) {
            set(1, zBooleanValue);
        } else if (str.equalsIgnoreCase(KEY_ENCIPHERMENT)) {
            set(2, zBooleanValue);
        } else if (str.equalsIgnoreCase(DATA_ENCIPHERMENT)) {
            set(3, zBooleanValue);
        } else if (str.equalsIgnoreCase(KEY_AGREEMENT)) {
            set(4, zBooleanValue);
        } else if (str.equalsIgnoreCase(KEY_CERTSIGN)) {
            set(5, zBooleanValue);
        } else if (str.equalsIgnoreCase(CRL_SIGN)) {
            set(6, zBooleanValue);
        } else if (str.equalsIgnoreCase(ENCIPHER_ONLY)) {
            set(7, zBooleanValue);
        } else {
            if (!str.equalsIgnoreCase(DECIPHER_ONLY)) {
                ca0.m1178j("Attribute name not recognized by CertAttrSet:KeyUsage.");
                return;
            }
            set(8, zBooleanValue);
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String strM5342i = AbstractC1308pu.m5342i(new StringBuilder(), super.toString(), "KeyUsage [\n");
        try {
            if (isSet(0)) {
                strM5342i = strM5342i.concat("  DigitalSignature\n");
            }
            if (isSet(1)) {
                strM5342i = strM5342i.concat("  Non_repudiation\n");
            }
            if (isSet(2)) {
                strM5342i = strM5342i.concat("  Key_Encipherment\n");
            }
            if (isSet(3)) {
                strM5342i = strM5342i.concat("  Data_Encipherment\n");
            }
            if (isSet(4)) {
                strM5342i = strM5342i.concat("  Key_Agreement\n");
            }
            if (isSet(5)) {
                strM5342i = strM5342i.concat("  Key_CertSign\n");
            }
            if (isSet(6)) {
                strM5342i = strM5342i.concat("  Crl_Sign\n");
            }
            if (isSet(7)) {
                strM5342i = strM5342i.concat("  Encipher_Only\n");
            }
            if (isSet(8)) {
                strM5342i = strM5342i.concat("  Decipher_Only\n");
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return strM5342i.concat("]\n");
    }

    public KeyUsageExtension(boolean[] zArr) throws IOException {
        this.bitString = zArr;
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        encodeThis();
    }

    public KeyUsageExtension(BitArray bitArray) throws IOException {
        this.bitString = bitArray.toBooleanArray();
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        encodeThis();
    }

    public KeyUsageExtension(byte[] bArr) throws IOException {
        this.bitString = new BitArray(bArr.length * 8, bArr).toBooleanArray();
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        encodeThis();
    }

    public KeyUsageExtension() {
        this.extensionId = PKIXExtensions.KeyUsage_Id;
        this.critical = true;
        this.bitString = new boolean[0];
    }

    private void set(int i, boolean z) {
        boolean[] zArr = this.bitString;
        if (i >= zArr.length) {
            boolean[] zArr2 = new boolean[i + 1];
            System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
            this.bitString = zArr2;
        }
        this.bitString[i] = z;
    }
}
