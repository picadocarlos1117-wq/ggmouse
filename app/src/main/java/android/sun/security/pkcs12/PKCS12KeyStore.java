package android.sun.security.pkcs12;

import android.sun.security.pkcs.ContentInfo;
import android.sun.security.pkcs.EncryptedPrivateKeyInfo;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import android.sun.security.x509.AlgorithmId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.security.auth.x500.X500Principal;
import p000.ca0;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PKCS12KeyStore extends KeyStoreSpi {
    private static ObjectIdentifier CertBag_OID = null;
    private static ObjectIdentifier PKCS8ShroudedKeyBag_OID = null;
    private static ObjectIdentifier PKCS9CertType_OID = null;
    private static ObjectIdentifier PKCS9FriendlyName_OID = null;
    private static ObjectIdentifier PKCS9LocalKeyId_OID = null;
    private static final int SALT_LEN = 20;
    public static final int VERSION_3 = 3;
    private static final int[] certBag;
    private static final int iterationCount = 1024;
    private static final int[] keyBag;
    private static final int[] pbeWithSHAAnd3KeyTripleDESCBC;
    private static ObjectIdentifier pbeWithSHAAnd3KeyTripleDESCBC_OID;
    private static final int[] pbeWithSHAAnd40BitRC2CBC;
    private static ObjectIdentifier pbeWithSHAAnd40BitRC2CBC_OID;
    private static final int[] pkcs9KeyId;
    private static final int[] pkcs9Name;
    private static final int[] pkcs9certType;
    private SecureRandom random;
    private int counter = 0;
    private int privateKeyCount = 0;
    private Hashtable<String, KeyEntry> entries = new Hashtable<>();
    private ArrayList<KeyEntry> keyList = new ArrayList<>();
    private LinkedHashMap<X500Principal, X509Certificate> certsMap = new LinkedHashMap<>();
    private ArrayList<CertEntry> certEntries = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class CertEntry {
        final String alias;
        final X509Certificate cert;
        final byte[] keyId;

        public CertEntry(X509Certificate x509Certificate, byte[] bArr, String str) {
            this.cert = x509Certificate;
            this.keyId = bArr;
            this.alias = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class KeyEntry {
        String alias;
        Certificate[] chain;
        Date date;
        byte[] keyId;
        byte[] protectedPrivKey;

        private KeyEntry() {
        }
    }

    static {
        int[] iArr = {1, 2, 840, 113549, 1, 12, 10, 1, 2};
        keyBag = iArr;
        int[] iArr2 = {1, 2, 840, 113549, 1, 12, 10, 1, 3};
        certBag = iArr2;
        int[] iArr3 = {1, 2, 840, 113549, 1, 9, 20};
        pkcs9Name = iArr3;
        int[] iArr4 = {1, 2, 840, 113549, 1, 9, 21};
        pkcs9KeyId = iArr4;
        int[] iArr5 = {1, 2, 840, 113549, 1, 9, 22, 1};
        pkcs9certType = iArr5;
        int[] iArr6 = {1, 2, 840, 113549, 1, 12, 1, 6};
        pbeWithSHAAnd40BitRC2CBC = iArr6;
        int[] iArr7 = {1, 2, 840, 113549, 1, 12, 1, 3};
        pbeWithSHAAnd3KeyTripleDESCBC = iArr7;
        try {
            PKCS8ShroudedKeyBag_OID = new ObjectIdentifier(iArr);
            CertBag_OID = new ObjectIdentifier(iArr2);
            PKCS9FriendlyName_OID = new ObjectIdentifier(iArr3);
            PKCS9LocalKeyId_OID = new ObjectIdentifier(iArr4);
            PKCS9CertType_OID = new ObjectIdentifier(iArr5);
            pbeWithSHAAnd40BitRC2CBC_OID = new ObjectIdentifier(iArr6);
            pbeWithSHAAnd3KeyTripleDESCBC_OID = new ObjectIdentifier(iArr7);
        } catch (IOException unused) {
        }
    }

    private byte[] calculateMac(char[] cArr, byte[] bArr) throws IOException {
        try {
            byte[] salt = getSalt();
            Mac mac = Mac.getInstance("HmacPBESHA1");
            mac.init(getPBEKey(cArr), new PBEParameterSpec(salt, 1024));
            mac.update(bArr);
            MacData macData = new MacData("SHA1", mac.doFinal(), salt, 1024);
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStream.write(macData.getEncoded());
            return derOutputStream.toByteArray();
        } catch (Exception e) {
            IOException iOException = new IOException("calculateMac failed: " + e);
            iOException.initCause(e);
            throw iOException;
        }
    }

    private byte[] createEncryptedData(char[] cArr) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        Enumeration<String> enumerationKeys = this.entries.keys();
        while (enumerationKeys.hasMoreElements()) {
            KeyEntry keyEntry = this.entries.get(enumerationKeys.nextElement());
            Certificate[] certificateArr = keyEntry.chain;
            int length = certificateArr == null ? 0 : certificateArr.length;
            int i = 0;
            while (i < length) {
                DerOutputStream derOutputStream2 = new DerOutputStream();
                derOutputStream2.putOID(CertBag_OID);
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.putOID(PKCS9CertType_OID);
                DerOutputStream derOutputStream4 = new DerOutputStream();
                X509Certificate x509Certificate = (X509Certificate) keyEntry.chain[i];
                derOutputStream4.putOctetString(x509Certificate.getEncoded());
                derOutputStream3.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream4);
                DerOutputStream derOutputStream5 = new DerOutputStream();
                derOutputStream5.write((byte) 48, derOutputStream3);
                byte[] byteArray = derOutputStream5.toByteArray();
                DerOutputStream derOutputStream6 = new DerOutputStream();
                derOutputStream6.write(byteArray);
                derOutputStream2.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream6);
                byte[] bagAttributes = i == 0 ? getBagAttributes(keyEntry.alias, keyEntry.keyId) : getBagAttributes(x509Certificate.getSubjectX500Principal().getName(), null);
                if (bagAttributes != null) {
                    derOutputStream2.write(bagAttributes);
                }
                derOutputStream.write((byte) 48, derOutputStream2);
                i++;
            }
        }
        DerOutputStream derOutputStream7 = new DerOutputStream();
        derOutputStream7.write((byte) 48, derOutputStream);
        byte[] bArrEncryptContent = encryptContent(derOutputStream7.toByteArray(), cArr);
        DerOutputStream derOutputStream8 = new DerOutputStream();
        DerOutputStream derOutputStream9 = new DerOutputStream();
        derOutputStream8.putInteger(0);
        derOutputStream8.write(bArrEncryptContent);
        derOutputStream9.write((byte) 48, derOutputStream8);
        return derOutputStream9.toByteArray();
    }

    private byte[] createSafeContent() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        Enumeration<String> enumerationKeys = this.entries.keys();
        while (enumerationKeys.hasMoreElements()) {
            String strNextElement = enumerationKeys.nextElement();
            KeyEntry keyEntry = this.entries.get(strNextElement);
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.putOID(PKCS8ShroudedKeyBag_OID);
            try {
                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(keyEntry.protectedPrivKey);
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.write(encryptedPrivateKeyInfo.getEncoded());
                derOutputStream2.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream3);
                derOutputStream2.write(getBagAttributes(strNextElement, keyEntry.keyId));
                derOutputStream.write((byte) 48, derOutputStream2);
            } catch (IOException e) {
                ca0.m1178j(jd0.m3611i(e, new StringBuilder("Private key not stored as PKCS#8 EncryptedPrivateKeyInfo")));
                return null;
            }
        }
        DerOutputStream derOutputStream4 = new DerOutputStream();
        derOutputStream4.write((byte) 48, derOutputStream);
        return derOutputStream4.toByteArray();
    }

    private byte[] encryptContent(byte[] bArr, char[] cArr) throws IOException {
        AlgorithmParameters algorithmParameters = getAlgorithmParameters("PBEWithSHA1AndRC2_40");
        DerOutputStream derOutputStream = new DerOutputStream();
        new AlgorithmId(pbeWithSHAAnd40BitRC2CBC_OID, algorithmParameters).encode(derOutputStream);
        byte[] byteArray = derOutputStream.toByteArray();
        try {
            SecretKey pBEKey = getPBEKey(cArr);
            Cipher cipher = Cipher.getInstance("PBEWithSHA1AndRC2_40");
            cipher.init(1, pBEKey, algorithmParameters);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.putOID(ContentInfo.DATA_OID);
            derOutputStream2.write(byteArray);
            DerOutputStream derOutputStream3 = new DerOutputStream();
            derOutputStream3.putOctetString(bArrDoFinal);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
            DerOutputStream derOutputStream4 = new DerOutputStream();
            derOutputStream4.write((byte) 48, derOutputStream2);
            return derOutputStream4.toByteArray();
        } catch (Exception e) {
            IOException iOException = new IOException("Failed to encrypt safe contents entry: " + e);
            iOException.initCause(e);
            throw iOException;
        }
    }

    private byte[] encryptPrivateKey(byte[] bArr, char[] cArr) throws UnrecoverableKeyException {
        try {
            AlgorithmParameters algorithmParameters = getAlgorithmParameters("PBEWithSHA1AndDESede");
            SecretKey pBEKey = getPBEKey(cArr);
            Cipher cipher = Cipher.getInstance("PBEWithSHA1AndDESede");
            cipher.init(1, pBEKey, algorithmParameters);
            return new EncryptedPrivateKeyInfo(new AlgorithmId(pbeWithSHAAnd3KeyTripleDESCBC_OID, algorithmParameters), cipher.doFinal(bArr)).getEncoded();
        } catch (Exception e) {
            UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException("Encrypt Private Key failed: " + e.getMessage());
            unrecoverableKeyException.initCause(e);
            throw unrecoverableKeyException;
        }
    }

    private X509Certificate findMatchedCertificate(KeyEntry keyEntry) {
        ArrayList<CertEntry> arrayList = this.certEntries;
        int size = arrayList.size();
        int i = 0;
        CertEntry certEntry = null;
        CertEntry certEntry2 = null;
        while (i < size) {
            CertEntry certEntry3 = arrayList.get(i);
            i++;
            CertEntry certEntry4 = certEntry3;
            boolean zEquals = Arrays.equals(keyEntry.keyId, certEntry4.keyId);
            String str = keyEntry.alias;
            if (zEquals) {
                if (str.equalsIgnoreCase(certEntry4.alias)) {
                    return certEntry4.cert;
                }
                certEntry = certEntry4;
            } else if (str.equalsIgnoreCase(certEntry4.alias)) {
                certEntry2 = certEntry4;
            }
        }
        if (certEntry != null) {
            return certEntry.cert;
        }
        if (certEntry2 != null) {
            return certEntry2.cert;
        }
        return null;
    }

    private byte[] generateHash(byte[] bArr) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e) {
            IOException iOException = new IOException("generateHash failed: " + e);
            iOException.initCause(e);
            throw iOException;
        }
    }

    private AlgorithmParameters getAlgorithmParameters(String str) throws IOException {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(getSalt(), 1024);
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(str);
            algorithmParameters.init(pBEParameterSpec);
            return algorithmParameters;
        } catch (Exception e) {
            IOException iOException = new IOException("getAlgorithmParameters failed: " + e.getMessage());
            iOException.initCause(e);
            throw iOException;
        }
    }

    private byte[] getBagAttributes(String str, byte[] bArr) throws IOException {
        byte[] byteArray;
        byte[] byteArray2 = null;
        if (str == null && bArr == null) {
            return null;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        if (str != null) {
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.putOID(PKCS9FriendlyName_OID);
            DerOutputStream derOutputStream3 = new DerOutputStream();
            DerOutputStream derOutputStream4 = new DerOutputStream();
            derOutputStream3.putBMPString(str);
            derOutputStream2.write((byte) 49, derOutputStream3);
            derOutputStream4.write((byte) 48, derOutputStream2);
            byteArray = derOutputStream4.toByteArray();
        } else {
            byteArray = null;
        }
        if (bArr != null) {
            DerOutputStream derOutputStream5 = new DerOutputStream();
            derOutputStream5.putOID(PKCS9LocalKeyId_OID);
            DerOutputStream derOutputStream6 = new DerOutputStream();
            DerOutputStream derOutputStream7 = new DerOutputStream();
            derOutputStream6.putOctetString(bArr);
            derOutputStream5.write((byte) 49, derOutputStream6);
            derOutputStream7.write((byte) 48, derOutputStream5);
            byteArray2 = derOutputStream7.toByteArray();
        }
        DerOutputStream derOutputStream8 = new DerOutputStream();
        if (byteArray != null) {
            derOutputStream8.write(byteArray);
        }
        if (byteArray2 != null) {
            derOutputStream8.write(byteArray2);
        }
        derOutputStream.write((byte) 49, derOutputStream8);
        return derOutputStream.toByteArray();
    }

    private SecretKey getPBEKey(char[] cArr) throws IOException {
        try {
            return SecretKeyFactory.getInstance("PBE").generateSecret(new PBEKeySpec(cArr));
        } catch (Exception e) {
            IOException iOException = new IOException("getSecretKey failed: " + e.getMessage());
            iOException.initCause(e);
            throw iOException;
        }
    }

    private byte[] getSalt() {
        byte[] bArr = new byte[20];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr);
        return bArr;
    }

    private String getUnfriendlyName() {
        int i = this.counter + 1;
        this.counter = i;
        return String.valueOf(i);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5 */
    private void loadSafeContents(DerInputStream derInputStream, char[] cArr) throws IOException {
        Object obj;
        DerValue[] set;
        byte[] bytes;
        String unfriendlyName;
        String str;
        DerValue[] sequence = derInputStream.getSequence(2);
        int length = sequence.length;
        for (int i = 0; i < length; i++) {
            DerInputStream derInputStream2 = sequence[i].toDerInputStream();
            ObjectIdentifier oid = derInputStream2.getOID();
            DerValue derValue = derInputStream2.getDerValue();
            if (!derValue.isContextSpecific((byte) 0)) {
                f40.m2710f(derValue.tag, "unsupported PKCS12 bag value type ");
                return;
            }
            DerValue derValue2 = derValue.data.getDerValue();
            Date date = 0;
            date = 0;
            if (oid.equals(PKCS8ShroudedKeyBag_OID)) {
                KeyEntry keyEntry = new KeyEntry();
                keyEntry.protectedPrivKey = derValue2.toByteArray();
                this.privateKeyCount++;
                obj = keyEntry;
            } else if (oid.equals(CertBag_OID)) {
                DerValue[] sequence2 = new DerInputStream(derValue2.toByteArray()).getSequence(2);
                sequence2[0].getOID();
                if (!sequence2[1].isContextSpecific((byte) 0)) {
                    f40.m2710f(sequence2[1].tag, "unsupported PKCS12 cert value type ");
                    return;
                }
                obj = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(sequence2[1].data.getDerValue().getOctetString()));
            } else {
                obj = null;
            }
            try {
                set = derInputStream2.getSet(2);
            } catch (IOException unused) {
                set = null;
            }
            if (set != null) {
                bytes = null;
                unfriendlyName = null;
                for (DerValue derValue3 : set) {
                    DerValue[] sequence3 = new DerInputStream(derValue3.toByteArray()).getSequence(2);
                    ObjectIdentifier oid2 = sequence3[0].getOID();
                    try {
                        DerValue[] set2 = new DerInputStream(sequence3[1].toByteArray()).getSet(1);
                        if (oid2.equals(PKCS9FriendlyName_OID)) {
                            unfriendlyName = set2[0].getBMPString();
                        } else if (oid2.equals(PKCS9LocalKeyId_OID)) {
                            bytes = set2[0].getOctetString();
                        }
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder("Attribute ");
                        sb.append(oid2);
                        sb.append(" should have a value ");
                        ca0.m1178j(jd0.m3611i(e, sb));
                        return;
                    }
                }
            } else {
                bytes = null;
                unfriendlyName = null;
            }
            if (obj instanceof KeyEntry) {
                KeyEntry keyEntry2 = (KeyEntry) obj;
                if (bytes != null) {
                    keyEntry2.keyId = bytes;
                    str = new String(bytes, "UTF8");
                    if (str.startsWith("Time ")) {
                        try {
                            date = new Date(Long.parseLong(str.substring(5)));
                        } catch (Exception unused2) {
                        }
                    }
                    if (date == 0) {
                        date = new Date();
                    }
                    keyEntry2.date = date;
                    this.keyList.add(keyEntry2);
                    if (unfriendlyName == null) {
                        unfriendlyName = getUnfriendlyName();
                    }
                    keyEntry2.alias = unfriendlyName;
                    this.entries.put(unfriendlyName.toLowerCase(), keyEntry2);
                } else if (this.privateKeyCount == 1) {
                    bytes = "01".getBytes("UTF8");
                    keyEntry2.keyId = bytes;
                    str = new String(bytes, "UTF8");
                    if (str.startsWith("Time ")) {
                        date = new Date(Long.parseLong(str.substring(5)));
                    }
                    if (date == 0) {
                        date = new Date();
                    }
                    keyEntry2.date = date;
                    this.keyList.add(keyEntry2);
                    if (unfriendlyName == null) {
                        unfriendlyName = getUnfriendlyName();
                    }
                    keyEntry2.alias = unfriendlyName;
                    this.entries.put(unfriendlyName.toLowerCase(), keyEntry2);
                }
            } else if (obj instanceof X509Certificate) {
                X509Certificate x509Certificate = (X509Certificate) obj;
                if (bytes == null && this.privateKeyCount == 1 && i == 0) {
                    bytes = "01".getBytes("UTF8");
                }
                this.certEntries.add(new CertEntry(x509Certificate, bytes, unfriendlyName));
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                if (subjectX500Principal != null && !this.certsMap.containsKey(subjectX500Principal)) {
                    this.certsMap.put(subjectX500Principal, x509Certificate);
                }
            }
        }
    }

    private AlgorithmParameters parseAlgParameters(DerInputStream derInputStream) throws IOException {
        DerValue derValue;
        try {
            if (derInputStream.available() == 0) {
                derValue = null;
            } else {
                derValue = derInputStream.getDerValue();
                if (derValue.tag == 5) {
                    derValue = null;
                }
            }
            if (derValue == null) {
                return null;
            }
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PBE");
            algorithmParameters.init(derValue.toByteArray());
            return algorithmParameters;
        } catch (Exception e) {
            IOException iOException = new IOException("parseAlgParameters failed: " + e.getMessage());
            iOException.initCause(e);
            throw iOException;
        }
    }

    private boolean validateChain(Certificate[] certificateArr) {
        int i = 0;
        while (i < certificateArr.length - 1) {
            X500Principal issuerX500Principal = ((X509Certificate) certificateArr[i]).getIssuerX500Principal();
            i++;
            if (!issuerX500Principal.equals(((X509Certificate) certificateArr[i]).getSubjectX500Principal())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        return this.entries.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return this.entries.containsKey(str.toLowerCase());
    }

    @Override // java.security.KeyStoreSpi
    public synchronized void engineDeleteEntry(String str) {
        this.entries.remove(str.toLowerCase());
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        Certificate[] certificateArr;
        KeyEntry keyEntry = this.entries.get(str.toLowerCase());
        if (keyEntry == null || (certificateArr = keyEntry.chain) == null) {
            return null;
        }
        return certificateArr[0];
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration<String> enumerationKeys = this.entries.keys();
        Certificate certificate2 = null;
        while (enumerationKeys.hasMoreElements()) {
            String strNextElement = enumerationKeys.nextElement();
            Certificate[] certificateArr = this.entries.get(strNextElement).chain;
            if (certificateArr != null) {
                certificate2 = certificateArr[0];
            }
            if (certificate2.equals(certificate)) {
                return strNextElement;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        Certificate[] certificateArr;
        KeyEntry keyEntry = this.entries.get(str.toLowerCase());
        if (keyEntry == null || (certificateArr = keyEntry.chain) == null) {
            return null;
        }
        return (Certificate[]) certificateArr.clone();
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        KeyEntry keyEntry = this.entries.get(str.toLowerCase());
        if (keyEntry != null) {
            return new Date(keyEntry.date.getTime());
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException {
        KeyEntry keyEntry = this.entries.get(str.toLowerCase());
        if (keyEntry == null) {
            return null;
        }
        try {
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(keyEntry.protectedPrivKey);
            byte[] encryptedData = encryptedPrivateKeyInfo.getEncryptedData();
            DerInputStream derInputStream = new DerValue(encryptedPrivateKeyInfo.getAlgorithm().encode()).toDerInputStream();
            ObjectIdentifier oid = derInputStream.getOID();
            AlgorithmParameters algParameters = parseAlgParameters(derInputStream);
            try {
                SecretKey pBEKey = getPBEKey(cArr);
                Cipher cipher = Cipher.getInstance(oid.toString());
                cipher.init(2, pBEKey, algParameters);
                byte[] bArrDoFinal = cipher.doFinal(encryptedData);
                PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrDoFinal);
                DerInputStream derInputStream2 = new DerValue(bArrDoFinal).toDerInputStream();
                derInputStream2.getInteger();
                return KeyFactory.getInstance(new AlgorithmId(derInputStream2.getSequence(2)[0].getOID()).getName()).generatePrivate(pKCS8EncodedKeySpec);
            } catch (Exception e) {
                UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException("Get Key failed: " + e.getMessage());
                unrecoverableKeyException.initCause(e);
                throw unrecoverableKeyException;
            }
        } catch (IOException e2) {
            UnrecoverableKeyException unrecoverableKeyException2 = new UnrecoverableKeyException("Private key not stored as PKCS#8 EncryptedPrivateKeyInfo: " + e2);
            unrecoverableKeyException2.initCause(e2);
            throw unrecoverableKeyException2;
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.entries.get(str.toLowerCase()) != null;
    }

    @Override // java.security.KeyStoreSpi
    public synchronized void engineLoad(InputStream inputStream, char[] cArr) {
        byte[] bArrDoFinal;
        if (inputStream == null) {
            return;
        }
        try {
            this.counter = 0;
            DerInputStream derInputStream = new DerValue(inputStream).toDerInputStream();
            if (derInputStream.getInteger() != 3) {
                throw new IOException("PKCS12 keystore not in version 3 format");
            }
            this.entries.clear();
            ContentInfo contentInfo = new ContentInfo(derInputStream);
            if (!contentInfo.getContentType().equals(ContentInfo.DATA_OID)) {
                throw new IOException("public key protected PKCS12 not supported");
            }
            byte[] data = contentInfo.getData();
            DerValue[] sequence = new DerInputStream(data).getSequence(2);
            this.privateKeyCount = 0;
            for (DerValue derValue : sequence) {
                ContentInfo contentInfo2 = new ContentInfo(new DerInputStream(derValue.toByteArray()));
                ObjectIdentifier contentType = contentInfo2.getContentType();
                if (contentType.equals(ContentInfo.DATA_OID)) {
                    bArrDoFinal = contentInfo2.getData();
                } else {
                    if (!contentType.equals(ContentInfo.ENCRYPTED_DATA_OID)) {
                        throw new IOException("public key protected PKCS12 not supported");
                    }
                    if (cArr != null) {
                        DerInputStream derInputStream2 = contentInfo2.getContent().toDerInputStream();
                        derInputStream2.getInteger();
                        DerValue[] sequence2 = derInputStream2.getSequence(2);
                        sequence2[0].getOID();
                        sequence2[1].toByteArray();
                        if (!sequence2[2].isContextSpecific((byte) 0)) {
                            throw new IOException("encrypted content not present!");
                        }
                        sequence2[2].resetTag(sequence2[2].isConstructed() ? (byte) 36 : (byte) 4);
                        byte[] octetString = sequence2[2].getOctetString();
                        DerInputStream derInputStream3 = sequence2[1].toDerInputStream();
                        ObjectIdentifier oid = derInputStream3.getOID();
                        AlgorithmParameters algParameters = parseAlgParameters(derInputStream3);
                        try {
                            SecretKey pBEKey = getPBEKey(cArr);
                            Cipher cipher = Cipher.getInstance(oid.toString());
                            cipher.init(2, pBEKey, algParameters);
                            bArrDoFinal = cipher.doFinal(octetString);
                        } catch (Exception e) {
                            IOException iOException = new IOException("failed to decrypt safe contents entry: " + e);
                            iOException.initCause(e);
                            throw iOException;
                        }
                    }
                }
                loadSafeContents(new DerInputStream(bArrDoFinal), cArr);
            }
            if (cArr != null && derInputStream.available() > 0) {
                MacData macData = new MacData(derInputStream);
                try {
                    String upperCase = macData.getDigestAlgName().toUpperCase();
                    if (upperCase.equals("SHA") || upperCase.equals("SHA1") || upperCase.equals("SHA-1")) {
                        upperCase = "SHA1";
                    }
                    Mac mac = Mac.getInstance("HmacPBE" + upperCase);
                    mac.init(getPBEKey(cArr), new PBEParameterSpec(macData.getSalt(), macData.getIterations()));
                    mac.update(data);
                    if (!Arrays.equals(macData.getDigest(), mac.doFinal())) {
                        throw new SecurityException("Failed PKCS12 integrity checking");
                    }
                } catch (Exception e2) {
                    IOException iOException2 = new IOException("Integrity check failed: " + e2);
                    iOException2.initCause(e2);
                    throw iOException2;
                }
            }
            ArrayList<KeyEntry> arrayList = this.keyList;
            for (KeyEntry keyEntry : (KeyEntry[]) arrayList.toArray(new KeyEntry[arrayList.size()])) {
                if (keyEntry.keyId != null) {
                    ArrayList arrayList2 = new ArrayList();
                    X509Certificate x509CertificateFindMatchedCertificate = findMatchedCertificate(keyEntry);
                    while (x509CertificateFindMatchedCertificate != null) {
                        arrayList2.add(x509CertificateFindMatchedCertificate);
                        X500Principal issuerX500Principal = x509CertificateFindMatchedCertificate.getIssuerX500Principal();
                        if (issuerX500Principal.equals(x509CertificateFindMatchedCertificate.getSubjectX500Principal())) {
                            break;
                        } else {
                            x509CertificateFindMatchedCertificate = this.certsMap.get(issuerX500Principal);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        keyEntry.chain = (Certificate[]) arrayList2.toArray(new Certificate[arrayList2.size()]);
                    }
                }
            }
            this.certEntries.clear();
            this.certsMap.clear();
            this.keyList.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public synchronized void engineSetCertificateEntry(String str, Certificate certificate) {
        try {
            if (this.entries.get(str.toLowerCase()) == null) {
                throw new KeyStoreException("TrustedCertEntry not supported");
            }
            throw new KeyStoreException("Cannot overwrite own certificate");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public synchronized void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        try {
            try {
                KeyEntry keyEntry = new KeyEntry();
                keyEntry.date = new Date();
                if (!(key instanceof PrivateKey)) {
                    throw new KeyStoreException("Key is not a PrivateKey");
                }
                if (!key.getFormat().equals("PKCS#8") && !key.getFormat().equals("PKCS8")) {
                    throw new KeyStoreException("Private key is not encodedas PKCS#8");
                }
                keyEntry.protectedPrivKey = encryptPrivateKey(key.getEncoded(), cArr);
                if (certificateArr != null) {
                    if (certificateArr.length > 1 && !validateChain(certificateArr)) {
                        throw new KeyStoreException("Certificate chain is not validate");
                    }
                    keyEntry.chain = (Certificate[]) certificateArr.clone();
                }
                keyEntry.keyId = ("Time " + keyEntry.date.getTime()).getBytes("UTF8");
                keyEntry.alias = str.toLowerCase();
                this.entries.put(str.toLowerCase(), keyEntry);
            } catch (Exception e) {
                KeyStoreException keyStoreException = new KeyStoreException("Key protection  algorithm not found: " + e);
                keyStoreException.initCause(e);
                throw keyStoreException;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public synchronized void engineStore(OutputStream outputStream, char[] cArr) {
        try {
            if (cArr == null) {
                throw new IllegalArgumentException("password can't be null");
            }
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.putInteger(3);
            derOutputStream.write(derOutputStream2.toByteArray());
            DerOutputStream derOutputStream3 = new DerOutputStream();
            DerOutputStream derOutputStream4 = new DerOutputStream();
            new ContentInfo(createSafeContent()).encode(derOutputStream4);
            new ContentInfo(ContentInfo.ENCRYPTED_DATA_OID, new DerValue(createEncryptedData(cArr))).encode(derOutputStream4);
            DerOutputStream derOutputStream5 = new DerOutputStream();
            derOutputStream5.write((byte) 48, derOutputStream4);
            byte[] byteArray = derOutputStream5.toByteArray();
            new ContentInfo(byteArray).encode(derOutputStream3);
            derOutputStream.write(derOutputStream3.toByteArray());
            derOutputStream.write(calculateMac(cArr, byteArray));
            DerOutputStream derOutputStream6 = new DerOutputStream();
            derOutputStream6.write((byte) 48, derOutputStream);
            outputStream.write(derOutputStream6.toByteArray());
            outputStream.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.security.KeyStoreSpi
    public synchronized void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        try {
            new EncryptedPrivateKeyInfo(bArr);
            KeyEntry keyEntry = new KeyEntry();
            keyEntry.date = new Date();
            try {
                keyEntry.keyId = ("Time " + keyEntry.date.getTime()).getBytes("UTF8");
            } catch (UnsupportedEncodingException unused) {
            }
            keyEntry.alias = str.toLowerCase();
            keyEntry.protectedPrivKey = (byte[]) bArr.clone();
            if (certificateArr != null) {
                keyEntry.chain = (Certificate[]) certificateArr.clone();
            }
            this.entries.put(str.toLowerCase(), keyEntry);
        } catch (IOException e) {
            KeyStoreException keyStoreException = new KeyStoreException("Private key is not stored as PKCS#8 EncryptedPrivateKeyInfo: " + e);
            keyStoreException.initCause(e);
            throw keyStoreException;
        }
    }
}
