package android.sun.security.x509;

import android.sun.security.p002ec.ECKeyFactory;
import android.sun.security.util.DerEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AlgorithmId implements Serializable, DerEncoder {
    private static final int[] DH_PKIX_data;
    public static final ObjectIdentifier DH_PKIX_oid;
    private static final int[] DH_data;
    public static final ObjectIdentifier DH_oid;
    private static final int[] DSA_OIW_data;
    public static final ObjectIdentifier DSA_OIW_oid;
    private static final int[] DSA_PKIX_data;
    public static final ObjectIdentifier DSA_oid;
    public static final ObjectIdentifier EC_oid;
    public static final ObjectIdentifier MD2_oid;
    public static final ObjectIdentifier MD5_oid;
    private static final int[] RSAEncryption_data;
    public static final ObjectIdentifier RSAEncryption_oid;
    private static final int[] RSA_data;
    public static final ObjectIdentifier RSA_oid;
    public static final ObjectIdentifier SHA256_oid;
    public static final ObjectIdentifier SHA384_oid;
    public static final ObjectIdentifier SHA512_oid;
    public static final ObjectIdentifier SHA_oid;
    private static final int[] dsaWithSHA1_PKIX_data;
    private static boolean initOidTable = false;
    private static final int[] md2WithRSAEncryption_data;
    public static final ObjectIdentifier md2WithRSAEncryption_oid;
    private static final int[] md5WithRSAEncryption_data;
    public static final ObjectIdentifier md5WithRSAEncryption_oid;
    private static final Map<ObjectIdentifier, String> nameTable;
    private static Map<String, ObjectIdentifier> oidTable = null;
    public static final ObjectIdentifier pbeWithMD5AndDES_oid;
    public static final ObjectIdentifier pbeWithMD5AndRC2_oid;
    public static final ObjectIdentifier pbeWithSHA1AndDES_oid;
    public static ObjectIdentifier pbeWithSHA1AndDESede_oid = null;
    public static ObjectIdentifier pbeWithSHA1AndRC2_40_oid = null;
    public static final ObjectIdentifier pbeWithSHA1AndRC2_oid;
    private static final long serialVersionUID = 7205873507486557157L;
    private static final int[] sha1WithDSA_OIW_data;
    public static final ObjectIdentifier sha1WithDSA_OIW_oid;
    public static final ObjectIdentifier sha1WithDSA_oid;
    public static final ObjectIdentifier sha1WithECDSA_oid;
    private static final int[] sha1WithRSAEncryption_OIW_data;
    public static final ObjectIdentifier sha1WithRSAEncryption_OIW_oid;
    private static final int[] sha1WithRSAEncryption_data;
    public static final ObjectIdentifier sha1WithRSAEncryption_oid;
    public static final ObjectIdentifier sha224WithECDSA_oid;
    public static final ObjectIdentifier sha256WithECDSA_oid;
    private static final int[] sha256WithRSAEncryption_data;
    public static final ObjectIdentifier sha256WithRSAEncryption_oid;
    public static final ObjectIdentifier sha384WithECDSA_oid;
    private static final int[] sha384WithRSAEncryption_data;
    public static final ObjectIdentifier sha384WithRSAEncryption_oid;
    public static final ObjectIdentifier sha512WithECDSA_oid;
    private static final int[] sha512WithRSAEncryption_data;
    public static final ObjectIdentifier sha512WithRSAEncryption_oid;
    private static final int[] shaWithDSA_OIW_data;
    public static final ObjectIdentifier shaWithDSA_OIW_oid;
    public static final ObjectIdentifier specifiedWithECDSA_oid;
    private AlgorithmParameters algParams;
    private ObjectIdentifier algid;
    private boolean constructedFromDer = true;
    protected DerValue params;

    static {
        ObjectIdentifier objectIdentifierNewInternal = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 2, 2});
        MD2_oid = objectIdentifierNewInternal;
        ObjectIdentifier objectIdentifierNewInternal2 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 2, 5});
        MD5_oid = objectIdentifierNewInternal2;
        ObjectIdentifier objectIdentifierNewInternal3 = ObjectIdentifier.newInternal(new int[]{1, 3, 14, 3, 2, 26});
        SHA_oid = objectIdentifierNewInternal3;
        ObjectIdentifier objectIdentifierNewInternal4 = ObjectIdentifier.newInternal(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 1});
        SHA256_oid = objectIdentifierNewInternal4;
        ObjectIdentifier objectIdentifierNewInternal5 = ObjectIdentifier.newInternal(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 2});
        SHA384_oid = objectIdentifierNewInternal5;
        ObjectIdentifier objectIdentifierNewInternal6 = ObjectIdentifier.newInternal(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 3});
        SHA512_oid = objectIdentifierNewInternal6;
        int[] iArr = {1, 2, 840, 113549, 1, 3, 1};
        DH_data = iArr;
        int[] iArr2 = {1, 2, 840, 10046, 2, 1};
        DH_PKIX_data = iArr2;
        int[] iArr3 = {1, 3, 14, 3, 2, 12};
        DSA_OIW_data = iArr3;
        int[] iArr4 = {1, 2, 840, 10040, 4, 1};
        DSA_PKIX_data = iArr4;
        int[] iArr5 = {2, 5, 8, 1, 1};
        RSA_data = iArr5;
        int[] iArr6 = {1, 2, 840, 113549, 1, 1, 1};
        RSAEncryption_data = iArr6;
        ObjectIdentifier objectIdentifierOid = oid(1, 2, 840, 10045, 2, 1);
        EC_oid = objectIdentifierOid;
        int[] iArr7 = {1, 2, 840, 113549, 1, 1, 2};
        md2WithRSAEncryption_data = iArr7;
        int[] iArr8 = {1, 2, 840, 113549, 1, 1, 4};
        md5WithRSAEncryption_data = iArr8;
        int[] iArr9 = {1, 2, 840, 113549, 1, 1, 5};
        sha1WithRSAEncryption_data = iArr9;
        int[] iArr10 = {1, 3, 14, 3, 2, 29};
        sha1WithRSAEncryption_OIW_data = iArr10;
        int[] iArr11 = {1, 2, 840, 113549, 1, 1, 11};
        sha256WithRSAEncryption_data = iArr11;
        int[] iArr12 = {1, 2, 840, 113549, 1, 1, 12};
        sha384WithRSAEncryption_data = iArr12;
        int[] iArr13 = {1, 2, 840, 113549, 1, 1, 13};
        sha512WithRSAEncryption_data = iArr13;
        int[] iArr14 = {1, 3, 14, 3, 2, 13};
        shaWithDSA_OIW_data = iArr14;
        int[] iArr15 = {1, 3, 14, 3, 2, 27};
        sha1WithDSA_OIW_data = iArr15;
        int[] iArr16 = {1, 2, 840, 10040, 4, 3};
        dsaWithSHA1_PKIX_data = iArr16;
        ObjectIdentifier objectIdentifierOid2 = oid(1, 2, 840, 10045, 4, 1);
        sha1WithECDSA_oid = objectIdentifierOid2;
        ObjectIdentifier objectIdentifierOid3 = oid(1, 2, 840, 10045, 4, 3, 1);
        sha224WithECDSA_oid = objectIdentifierOid3;
        ObjectIdentifier objectIdentifierOid4 = oid(1, 2, 840, 10045, 4, 3, 2);
        sha256WithECDSA_oid = objectIdentifierOid4;
        ObjectIdentifier objectIdentifierOid5 = oid(1, 2, 840, 10045, 4, 3, 3);
        sha384WithECDSA_oid = objectIdentifierOid5;
        ObjectIdentifier objectIdentifierOid6 = oid(1, 2, 840, 10045, 4, 3, 4);
        sha512WithECDSA_oid = objectIdentifierOid6;
        specifiedWithECDSA_oid = oid(1, 2, 840, 10045, 4, 3);
        ObjectIdentifier objectIdentifierNewInternal7 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 3});
        pbeWithMD5AndDES_oid = objectIdentifierNewInternal7;
        ObjectIdentifier objectIdentifierNewInternal8 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 6});
        pbeWithMD5AndRC2_oid = objectIdentifierNewInternal8;
        ObjectIdentifier objectIdentifierNewInternal9 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 10});
        pbeWithSHA1AndDES_oid = objectIdentifierNewInternal9;
        ObjectIdentifier objectIdentifierNewInternal10 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 11});
        pbeWithSHA1AndRC2_oid = objectIdentifierNewInternal10;
        pbeWithSHA1AndDESede_oid = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 12, 1, 3});
        pbeWithSHA1AndRC2_40_oid = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 12, 1, 6});
        ObjectIdentifier objectIdentifierNewInternal11 = ObjectIdentifier.newInternal(iArr);
        DH_oid = objectIdentifierNewInternal11;
        ObjectIdentifier objectIdentifierNewInternal12 = ObjectIdentifier.newInternal(iArr2);
        DH_PKIX_oid = objectIdentifierNewInternal12;
        ObjectIdentifier objectIdentifierNewInternal13 = ObjectIdentifier.newInternal(iArr3);
        DSA_OIW_oid = objectIdentifierNewInternal13;
        ObjectIdentifier objectIdentifierNewInternal14 = ObjectIdentifier.newInternal(iArr4);
        DSA_oid = objectIdentifierNewInternal14;
        ObjectIdentifier objectIdentifierNewInternal15 = ObjectIdentifier.newInternal(iArr5);
        RSA_oid = objectIdentifierNewInternal15;
        ObjectIdentifier objectIdentifierNewInternal16 = ObjectIdentifier.newInternal(iArr6);
        RSAEncryption_oid = objectIdentifierNewInternal16;
        ObjectIdentifier objectIdentifierNewInternal17 = ObjectIdentifier.newInternal(iArr7);
        md2WithRSAEncryption_oid = objectIdentifierNewInternal17;
        ObjectIdentifier objectIdentifierNewInternal18 = ObjectIdentifier.newInternal(iArr8);
        md5WithRSAEncryption_oid = objectIdentifierNewInternal18;
        ObjectIdentifier objectIdentifierNewInternal19 = ObjectIdentifier.newInternal(iArr9);
        sha1WithRSAEncryption_oid = objectIdentifierNewInternal19;
        ObjectIdentifier objectIdentifierNewInternal20 = ObjectIdentifier.newInternal(iArr10);
        sha1WithRSAEncryption_OIW_oid = objectIdentifierNewInternal20;
        ObjectIdentifier objectIdentifierNewInternal21 = ObjectIdentifier.newInternal(iArr11);
        sha256WithRSAEncryption_oid = objectIdentifierNewInternal21;
        ObjectIdentifier objectIdentifierNewInternal22 = ObjectIdentifier.newInternal(iArr12);
        sha384WithRSAEncryption_oid = objectIdentifierNewInternal22;
        ObjectIdentifier objectIdentifierNewInternal23 = ObjectIdentifier.newInternal(iArr13);
        sha512WithRSAEncryption_oid = objectIdentifierNewInternal23;
        ObjectIdentifier objectIdentifierNewInternal24 = ObjectIdentifier.newInternal(iArr14);
        shaWithDSA_OIW_oid = objectIdentifierNewInternal24;
        ObjectIdentifier objectIdentifierNewInternal25 = ObjectIdentifier.newInternal(iArr15);
        sha1WithDSA_OIW_oid = objectIdentifierNewInternal25;
        ObjectIdentifier objectIdentifierNewInternal26 = ObjectIdentifier.newInternal(iArr16);
        sha1WithDSA_oid = objectIdentifierNewInternal26;
        HashMap map = new HashMap();
        nameTable = map;
        map.put(objectIdentifierNewInternal2, "MD5");
        map.put(objectIdentifierNewInternal, "MD2");
        map.put(objectIdentifierNewInternal3, "SHA");
        map.put(objectIdentifierNewInternal4, "SHA256");
        map.put(objectIdentifierNewInternal5, "SHA384");
        map.put(objectIdentifierNewInternal6, "SHA512");
        map.put(objectIdentifierNewInternal16, "RSA");
        map.put(objectIdentifierNewInternal15, "RSA");
        map.put(objectIdentifierNewInternal11, "Diffie-Hellman");
        map.put(objectIdentifierNewInternal12, "Diffie-Hellman");
        map.put(objectIdentifierNewInternal14, "DSA");
        map.put(objectIdentifierNewInternal13, "DSA");
        map.put(objectIdentifierOid, "EC");
        map.put(objectIdentifierOid2, "SHA1withECDSA");
        map.put(objectIdentifierOid3, "SHA224withECDSA");
        map.put(objectIdentifierOid4, "SHA256withECDSA");
        map.put(objectIdentifierOid5, "SHA384withECDSA");
        map.put(objectIdentifierOid6, "SHA512withECDSA");
        map.put(objectIdentifierNewInternal18, "MD5withRSA");
        map.put(objectIdentifierNewInternal17, "MD2withRSA");
        map.put(objectIdentifierNewInternal26, "SHA1withDSA");
        map.put(objectIdentifierNewInternal25, "SHA1withDSA");
        map.put(objectIdentifierNewInternal24, "SHA1withDSA");
        map.put(objectIdentifierNewInternal19, "SHA1withRSA");
        map.put(objectIdentifierNewInternal20, "SHA1withRSA");
        map.put(objectIdentifierNewInternal21, "SHA256withRSA");
        map.put(objectIdentifierNewInternal22, "SHA384withRSA");
        map.put(objectIdentifierNewInternal23, "SHA512withRSA");
        map.put(objectIdentifierNewInternal7, "PBEWithMD5AndDES");
        map.put(objectIdentifierNewInternal8, "PBEWithMD5AndRC2");
        map.put(objectIdentifierNewInternal9, "PBEWithSHA1AndDES");
        map.put(objectIdentifierNewInternal10, "PBEWithSHA1AndRC2");
        map.put(pbeWithSHA1AndDESede_oid, "PBEWithSHA1AndDESede");
        map.put(pbeWithSHA1AndRC2_40_oid, "PBEWithSHA1AndRC2_40");
    }

    private AlgorithmId(ObjectIdentifier objectIdentifier, DerValue derValue) throws IOException {
        this.algid = objectIdentifier;
        this.params = derValue;
        if (derValue != null) {
            decodeParams();
        }
    }

    private static ObjectIdentifier algOID(String str) {
        int iIndexOf;
        if (str.indexOf(46) != -1) {
            return str.startsWith("OID.") ? new ObjectIdentifier(str.substring(4)) : new ObjectIdentifier(str);
        }
        if (str.equalsIgnoreCase("MD5")) {
            return MD5_oid;
        }
        if (str.equalsIgnoreCase("MD2")) {
            return MD2_oid;
        }
        if (str.equalsIgnoreCase("SHA") || str.equalsIgnoreCase("SHA1") || str.equalsIgnoreCase("SHA-1")) {
            return SHA_oid;
        }
        if (str.equalsIgnoreCase("SHA-256") || str.equalsIgnoreCase("SHA256")) {
            return SHA256_oid;
        }
        if (str.equalsIgnoreCase("SHA-384") || str.equalsIgnoreCase("SHA384")) {
            return SHA384_oid;
        }
        if (str.equalsIgnoreCase("SHA-512") || str.equalsIgnoreCase("SHA512")) {
            return SHA512_oid;
        }
        if (str.equalsIgnoreCase("RSA")) {
            return RSAEncryption_oid;
        }
        if (str.equalsIgnoreCase("Diffie-Hellman") || str.equalsIgnoreCase("DH")) {
            return DH_oid;
        }
        if (str.equalsIgnoreCase("DSA")) {
            return DSA_oid;
        }
        if (str.equalsIgnoreCase("EC")) {
            return EC_oid;
        }
        if (str.equalsIgnoreCase("MD5withRSA") || str.equalsIgnoreCase("MD5/RSA")) {
            return md5WithRSAEncryption_oid;
        }
        if (str.equalsIgnoreCase("MD2withRSA") || str.equalsIgnoreCase("MD2/RSA")) {
            return md2WithRSAEncryption_oid;
        }
        if (str.equalsIgnoreCase("SHAwithDSA") || str.equalsIgnoreCase("SHA1withDSA") || str.equalsIgnoreCase("SHA/DSA") || str.equalsIgnoreCase("SHA1/DSA") || str.equalsIgnoreCase("DSAWithSHA1") || str.equalsIgnoreCase("DSS") || str.equalsIgnoreCase("SHA-1/DSA")) {
            return sha1WithDSA_oid;
        }
        if (str.equalsIgnoreCase("SHA1WithRSA") || str.equalsIgnoreCase("SHA1/RSA")) {
            return sha1WithRSAEncryption_oid;
        }
        if (str.equalsIgnoreCase("SHA1withECDSA") || str.equalsIgnoreCase("ECDSA")) {
            return sha1WithECDSA_oid;
        }
        if (str.equalsIgnoreCase("SHA224withECDSA")) {
            return sha224WithECDSA_oid;
        }
        if (str.equalsIgnoreCase("SHA256withECDSA")) {
            return sha256WithECDSA_oid;
        }
        if (str.equalsIgnoreCase("SHA384withECDSA")) {
            return sha384WithECDSA_oid;
        }
        if (str.equalsIgnoreCase("SHA512withECDSA")) {
            return sha512WithECDSA_oid;
        }
        if (!initOidTable) {
            Provider[] providers = Security.getProviders();
            for (int i = 0; i < providers.length; i++) {
                Enumeration<Object> enumerationKeys = providers[i].keys();
                while (enumerationKeys.hasMoreElements()) {
                    String str2 = (String) enumerationKeys.nextElement();
                    Locale locale = Locale.ENGLISH;
                    String upperCase = str2.toUpperCase(locale);
                    if (upperCase.startsWith("ALG.ALIAS") && (iIndexOf = upperCase.indexOf("OID.", 0)) != -1) {
                        int i2 = iIndexOf + 4;
                        if (i2 == str2.length()) {
                            break;
                        }
                        if (oidTable == null) {
                            oidTable = new HashMap();
                        }
                        String strSubstring = str2.substring(i2);
                        String property = providers[i].getProperty(str2);
                        if (property != null) {
                            property = property.toUpperCase(locale);
                        }
                        if (property != null && oidTable.get(property) == null) {
                            oidTable.put(property, new ObjectIdentifier(strSubstring));
                        }
                    }
                }
            }
            if (oidTable == null) {
                oidTable = new HashMap(1);
            }
            initOidTable = true;
        }
        return oidTable.get(str.toUpperCase(Locale.ENGLISH));
    }

    public static AlgorithmId get(AlgorithmParameters algorithmParameters) throws NoSuchAlgorithmException {
        String algorithm = algorithmParameters.getAlgorithm();
        try {
            ObjectIdentifier objectIdentifierAlgOID = algOID(algorithm);
            if (objectIdentifierAlgOID != null) {
                return new AlgorithmId(objectIdentifierAlgOID, algorithmParameters);
            }
            throw new NoSuchAlgorithmException(AbstractC1308pu.m5339f("unrecognized algorithm name: ", algorithm));
        } catch (IOException unused) {
            throw new NoSuchAlgorithmException(AbstractC1308pu.m5339f("Invalid ObjectIdentifier ", algorithm));
        }
    }

    @Deprecated
    public static AlgorithmId getAlgorithmId(String str) {
        return get(str);
    }

    public static String getDigAlgFromSigAlg(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int iIndexOf = upperCase.indexOf("WITH");
        if (iIndexOf > 0) {
            return upperCase.substring(0, iIndexOf);
        }
        return null;
    }

    public static String getEncAlgFromSigAlg(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int iIndexOf = upperCase.indexOf("WITH");
        if (iIndexOf <= 0) {
            return null;
        }
        int i = iIndexOf + 4;
        int iIndexOf2 = upperCase.indexOf("AND", i);
        String strSubstring = iIndexOf2 > 0 ? upperCase.substring(i, iIndexOf2) : upperCase.substring(i);
        return strSubstring.equalsIgnoreCase("ECDSA") ? "EC" : strSubstring;
    }

    public static String makeSigAlg(String str, String str2) {
        String strReplace = str.replace("-", "");
        Locale locale = Locale.ENGLISH;
        String upperCase = strReplace.toUpperCase(locale);
        if (upperCase.equalsIgnoreCase("SHA")) {
            upperCase = "SHA1";
        }
        String upperCase2 = str2.toUpperCase(locale);
        if (upperCase2.equals("EC")) {
            upperCase2 = "ECDSA";
        }
        return AbstractC1308pu.m5340g(upperCase, "with", upperCase2);
    }

    private static ObjectIdentifier oid(int... iArr) {
        return ObjectIdentifier.newInternal(iArr);
    }

    public static AlgorithmId parse(DerValue derValue) {
        DerValue derValue2 = null;
        if (derValue.tag != 48) {
            ca0.m1178j("algid parse error, not a sequence");
            return null;
        }
        DerInputStream derInputStream = derValue.toDerInputStream();
        ObjectIdentifier oid = derInputStream.getOID();
        if (derInputStream.available() != 0) {
            DerValue derValue3 = derInputStream.getDerValue();
            if (derValue3.tag == 5) {
                if (derValue3.length() != 0) {
                    ca0.m1178j("invalid NULL");
                    return null;
                }
                derValue3 = null;
            }
            if (derInputStream.available() != 0) {
                ca0.m1178j("Invalid AlgorithmIdentifier: extra data");
                return null;
            }
            derValue2 = derValue3;
        }
        return new AlgorithmId(oid, derValue2);
    }

    public void decodeParams() throws IOException {
        String string = this.algid.toString();
        try {
            try {
                this.algParams = AlgorithmParameters.getInstance(string);
            } catch (NoSuchAlgorithmException unused) {
                this.algParams = AlgorithmParameters.getInstance(string, ECKeyFactory.ecInternalProvider);
            }
            this.algParams.init(this.params.toByteArray());
        } catch (NoSuchAlgorithmException unused2) {
            this.algParams = null;
        }
    }

    @Override // android.sun.security.util.DerEncoder
    public void derEncode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream.putOID(this.algid);
        if (!this.constructedFromDer) {
            AlgorithmParameters algorithmParameters = this.algParams;
            if (algorithmParameters != null) {
                this.params = new DerValue(algorithmParameters.getEncoded());
            } else {
                this.params = null;
            }
        }
        DerValue derValue = this.params;
        if (derValue == null) {
            derOutputStream.putNull();
        } else {
            derOutputStream.putDerValue(derValue);
        }
        derOutputStream2.write((byte) 48, derOutputStream);
        outputStream.write(derOutputStream2.toByteArray());
    }

    public final byte[] encode() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derEncode(derOutputStream);
        return derOutputStream.toByteArray();
    }

    public boolean equals(AlgorithmId algorithmId) {
        boolean zEquals;
        DerValue derValue = this.params;
        if (derValue == null) {
            zEquals = algorithmId.params == null;
        } else {
            zEquals = derValue.equals(algorithmId.params);
        }
        return this.algid.equals(algorithmId.algid) && zEquals;
    }

    public byte[] getEncodedParams() {
        DerValue derValue = this.params;
        if (derValue == null) {
            return null;
        }
        return derValue.toByteArray();
    }

    public String getName() {
        String strConcat = nameTable.get(this.algid);
        if (strConcat != null) {
            return strConcat;
        }
        if (this.params != null && this.algid.equals(specifiedWithECDSA_oid)) {
            try {
                String name = parse(new DerValue(getEncodedParams())).getName();
                if (name.equals("SHA")) {
                    name = "SHA1";
                }
                strConcat = name.concat("withECDSA");
            } catch (IOException unused) {
            }
        }
        return strConcat == null ? this.algid.toString() : strConcat;
    }

    public final ObjectIdentifier getOID() {
        return this.algid;
    }

    public AlgorithmParameters getParameters() {
        return this.algParams;
    }

    public int hashCode() {
        return (this.algid.toString() + paramsToString()).hashCode();
    }

    public String paramsToString() {
        if (this.params == null) {
            return "";
        }
        AlgorithmParameters algorithmParameters = this.algParams;
        return algorithmParameters != null ? algorithmParameters.toString() : ", params unparsed";
    }

    public String toString() {
        return getName() + paramsToString();
    }

    public final void encode(DerOutputStream derOutputStream) {
        derEncode(derOutputStream);
    }

    public AlgorithmId(ObjectIdentifier objectIdentifier) {
        this.algid = objectIdentifier;
    }

    public AlgorithmId(ObjectIdentifier objectIdentifier, AlgorithmParameters algorithmParameters) {
        this.algid = objectIdentifier;
        this.algParams = algorithmParameters;
    }

    @Deprecated
    public AlgorithmId() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlgorithmId) {
            return equals((AlgorithmId) obj);
        }
        if (obj instanceof ObjectIdentifier) {
            return equals((ObjectIdentifier) obj);
        }
        return false;
    }

    public final boolean equals(ObjectIdentifier objectIdentifier) {
        return this.algid.equals(objectIdentifier);
    }

    public static AlgorithmId get(String str) throws NoSuchAlgorithmException {
        try {
            ObjectIdentifier objectIdentifierAlgOID = algOID(str);
            if (objectIdentifierAlgOID != null) {
                return new AlgorithmId(objectIdentifierAlgOID);
            }
            throw new NoSuchAlgorithmException(AbstractC1308pu.m5339f("unrecognized algorithm name: ", str));
        } catch (IOException unused) {
            throw new NoSuchAlgorithmException(AbstractC1308pu.m5339f("Invalid ObjectIdentifier ", str));
        }
    }
}
