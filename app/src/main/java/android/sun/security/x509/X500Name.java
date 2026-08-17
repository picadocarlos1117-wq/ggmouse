package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.security.auth.x500.X500Principal;
import p000.ca0;
import p000.f40;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X500Name implements GeneralNameInterface, Principal {
    private static final int[] DNQUALIFIER_DATA;
    public static final ObjectIdentifier DNQUALIFIER_OID;
    private static final int[] DOMAIN_COMPONENT_DATA;
    public static final ObjectIdentifier DOMAIN_COMPONENT_OID;
    private static final int[] GENERATIONQUALIFIER_DATA;
    public static final ObjectIdentifier GENERATIONQUALIFIER_OID;
    private static final int[] GIVENNAME_DATA;
    public static final ObjectIdentifier GIVENNAME_OID;
    private static final int[] INITIALS_DATA;
    public static final ObjectIdentifier INITIALS_OID;
    private static final int[] SERIALNUMBER_DATA;
    public static final ObjectIdentifier SERIALNUMBER_OID;
    private static final int[] SURNAME_DATA;
    public static final ObjectIdentifier SURNAME_OID;
    private static final int[] commonName_data;
    public static final ObjectIdentifier commonName_oid;
    private static final int[] countryName_data;
    public static final ObjectIdentifier countryName_oid;
    private static final Map<ObjectIdentifier, ObjectIdentifier> internedOIDs = new HashMap();
    private static final int[] ipAddress_data;
    public static final ObjectIdentifier ipAddress_oid;
    private static final int[] localityName_data;
    public static final ObjectIdentifier localityName_oid;
    private static final int[] orgName_data;
    public static final ObjectIdentifier orgName_oid;
    private static final int[] orgUnitName_data;
    public static final ObjectIdentifier orgUnitName_oid;
    private static final int[] stateName_data;
    public static final ObjectIdentifier stateName_oid;
    private static final int[] streetAddress_data;
    public static final ObjectIdentifier streetAddress_oid;
    private static final int[] title_data;
    public static final ObjectIdentifier title_oid;
    private static final int[] userid_data;
    public static final ObjectIdentifier userid_oid;
    private volatile List<AVA> allAvaList;
    private String canonicalDn;

    /* JADX INFO: renamed from: dn */
    private String f298dn;
    private byte[] encoded;
    private RDN[] names;
    private volatile List<RDN> rdnList;
    private String rfc1779Dn;
    private String rfc2253Dn;
    private X500Principal x500Principal;

    static {
        int[] iArr = {2, 5, 4, 3};
        commonName_data = iArr;
        int[] iArr2 = {2, 5, 4, 4};
        SURNAME_DATA = iArr2;
        int[] iArr3 = {2, 5, 4, 5};
        SERIALNUMBER_DATA = iArr3;
        int[] iArr4 = {2, 5, 4, 6};
        countryName_data = iArr4;
        int[] iArr5 = {2, 5, 4, 7};
        localityName_data = iArr5;
        int[] iArr6 = {2, 5, 4, 8};
        stateName_data = iArr6;
        int[] iArr7 = {2, 5, 4, 9};
        streetAddress_data = iArr7;
        int[] iArr8 = {2, 5, 4, 10};
        orgName_data = iArr8;
        int[] iArr9 = {2, 5, 4, 11};
        orgUnitName_data = iArr9;
        int[] iArr10 = {2, 5, 4, 12};
        title_data = iArr10;
        int[] iArr11 = {2, 5, 4, 42};
        GIVENNAME_DATA = iArr11;
        int[] iArr12 = {2, 5, 4, 43};
        INITIALS_DATA = iArr12;
        int[] iArr13 = {2, 5, 4, 44};
        GENERATIONQUALIFIER_DATA = iArr13;
        int[] iArr14 = {2, 5, 4, 46};
        DNQUALIFIER_DATA = iArr14;
        int[] iArr15 = {1, 3, 6, 1, 4, 1, 42, 2, 11, 2, 1};
        ipAddress_data = iArr15;
        int[] iArr16 = {0, 9, 2342, 19200300, 100, 1, 25};
        DOMAIN_COMPONENT_DATA = iArr16;
        int[] iArr17 = {0, 9, 2342, 19200300, 100, 1, 1};
        userid_data = iArr17;
        commonName_oid = intern(ObjectIdentifier.newInternal(iArr));
        SERIALNUMBER_OID = intern(ObjectIdentifier.newInternal(iArr3));
        countryName_oid = intern(ObjectIdentifier.newInternal(iArr4));
        localityName_oid = intern(ObjectIdentifier.newInternal(iArr5));
        orgName_oid = intern(ObjectIdentifier.newInternal(iArr8));
        orgUnitName_oid = intern(ObjectIdentifier.newInternal(iArr9));
        stateName_oid = intern(ObjectIdentifier.newInternal(iArr6));
        streetAddress_oid = intern(ObjectIdentifier.newInternal(iArr7));
        title_oid = intern(ObjectIdentifier.newInternal(iArr10));
        DNQUALIFIER_OID = intern(ObjectIdentifier.newInternal(iArr14));
        SURNAME_OID = intern(ObjectIdentifier.newInternal(iArr2));
        GIVENNAME_OID = intern(ObjectIdentifier.newInternal(iArr11));
        INITIALS_OID = intern(ObjectIdentifier.newInternal(iArr12));
        GENERATIONQUALIFIER_OID = intern(ObjectIdentifier.newInternal(iArr13));
        ipAddress_oid = intern(ObjectIdentifier.newInternal(iArr15));
        DOMAIN_COMPONENT_OID = intern(ObjectIdentifier.newInternal(iArr16));
        userid_oid = intern(ObjectIdentifier.newInternal(iArr17));
    }

    public X500Name(String str, String str2, String str3, String str4, String str5, String str6) {
        RDN[] rdnArr = new RDN[6];
        this.names = rdnArr;
        rdnArr[5] = new RDN(1);
        this.names[5].assertion[0] = new AVA(commonName_oid, new DerValue(str));
        this.names[4] = new RDN(1);
        this.names[4].assertion[0] = new AVA(orgUnitName_oid, new DerValue(str2));
        this.names[3] = new RDN(1);
        this.names[3].assertion[0] = new AVA(orgName_oid, new DerValue(str3));
        this.names[2] = new RDN(1);
        this.names[2].assertion[0] = new AVA(localityName_oid, new DerValue(str4));
        this.names[1] = new RDN(1);
        this.names[1].assertion[0] = new AVA(stateName_oid, new DerValue(str5));
        this.names[0] = new RDN(1);
        this.names[0].assertion[0] = new AVA(countryName_oid, new DerValue(str6));
    }

    public static int countQuotes(String str, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            if ((str.charAt(i4) == '\"' && i4 == i) || (str.charAt(i4) == '\"' && str.charAt(i4 - 1) != '\\')) {
                i3++;
            }
        }
        return i3;
    }

    private static boolean escaped(int i, int i2, String str) {
        if (i == 1 && str.charAt(0) == '\\') {
            return true;
        }
        if (i > 1 && str.charAt(i - 1) == '\\' && str.charAt(i - 2) != '\\') {
            return true;
        }
        if (i > 1 && str.charAt(i - 1) == '\\' && str.charAt(i - 2) == '\\') {
            int i3 = 0;
            for (int i4 = i - 1; i4 >= i2; i4--) {
                if (str.charAt(i4) == '\\') {
                    i3++;
                }
            }
            if (i3 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private DerValue findAttribute(ObjectIdentifier objectIdentifier) {
        RDN[] rdnArr = this.names;
        if (rdnArr == null) {
            return null;
        }
        for (RDN rdn : rdnArr) {
            DerValue derValueFindAttribute = rdn.findAttribute(objectIdentifier);
            if (derValueFindAttribute != null) {
                return derValueFindAttribute;
            }
        }
        return null;
    }

    private void generateDN() {
        RDN[] rdnArr = this.names;
        if (rdnArr.length == 1) {
            this.f298dn = rdnArr[0].toString();
            return;
        }
        StringBuilder sb = new StringBuilder(48);
        RDN[] rdnArr2 = this.names;
        if (rdnArr2 != null) {
            for (int length = rdnArr2.length - 1; length >= 0; length--) {
                if (length != this.names.length - 1) {
                    sb.append(", ");
                }
                sb.append(this.names[length].toString());
            }
        }
        this.f298dn = sb.toString();
    }

    private String generateRFC1779DN(Map<String, String> map) {
        RDN[] rdnArr = this.names;
        if (rdnArr.length == 1) {
            return rdnArr[0].toRFC1779String(map);
        }
        StringBuilder sb = new StringBuilder(48);
        RDN[] rdnArr2 = this.names;
        if (rdnArr2 != null) {
            for (int length = rdnArr2.length - 1; length >= 0; length--) {
                if (length != this.names.length - 1) {
                    sb.append(", ");
                }
                sb.append(this.names[length].toRFC1779String(map));
            }
        }
        return sb.toString();
    }

    private String generateRFC2253DN(Map<String, String> map) {
        if (this.names.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(48);
        for (int length = this.names.length - 1; length >= 0; length--) {
            if (length < this.names.length - 1) {
                sb.append(',');
            }
            sb.append(this.names[length].toRFC2253String(map));
        }
        return sb.toString();
    }

    private String getString(DerValue derValue) throws IOException {
        if (derValue == null) {
            return null;
        }
        String asString = derValue.getAsString();
        if (asString != null) {
            return asString;
        }
        f40.m2710f(derValue.tag, "not a DER string encoding, ");
        return null;
    }

    public static ObjectIdentifier intern(ObjectIdentifier objectIdentifier) {
        Map<ObjectIdentifier, ObjectIdentifier> map = internedOIDs;
        ObjectIdentifier objectIdentifier2 = map.get(objectIdentifier);
        if (objectIdentifier2 != null) {
            return objectIdentifier2;
        }
        map.put(objectIdentifier, objectIdentifier);
        return objectIdentifier;
    }

    private boolean isWithinSubtree(X500Name x500Name) {
        if (this == x500Name) {
            return true;
        }
        if (x500Name == null) {
            return false;
        }
        RDN[] rdnArr = x500Name.names;
        if (rdnArr.length == 0) {
            return true;
        }
        RDN[] rdnArr2 = this.names;
        if (rdnArr2.length == 0 || rdnArr2.length < rdnArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            RDN[] rdnArr3 = x500Name.names;
            if (i >= rdnArr3.length) {
                return true;
            }
            if (!this.names[i].equals(rdnArr3[i])) {
                return false;
            }
            i++;
        }
    }

    private void parseDER(DerInputStream derInputStream) {
        DerValue[] sequence;
        byte[] byteArray = derInputStream.toByteArray();
        try {
            sequence = derInputStream.getSequence(5);
        } catch (IOException unused) {
            sequence = byteArray == null ? null : new DerInputStream(new DerValue((byte) 48, byteArray).toByteArray()).getSequence(5);
        }
        if (sequence == null) {
            this.names = new RDN[0];
            return;
        }
        this.names = new RDN[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            this.names[i] = new RDN(sequence[i]);
        }
    }

    private void parseDN(String str, Map<String, String> map) {
        if (str == null || str.length() == 0) {
            this.names = new RDN[0];
            return;
        }
        this.x500Principal = new X500Principal(str, map);
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf(44);
        int iIndexOf2 = str.indexOf(59);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (iIndexOf < 0 && iIndexOf2 < 0) {
                arrayList.add(new RDN(str.substring(i), map));
                Collections.reverse(arrayList);
                this.names = (RDN[]) arrayList.toArray(new RDN[0]);
                return;
            }
            if (iIndexOf2 >= 0) {
                iIndexOf = iIndexOf < 0 ? iIndexOf2 : Math.min(iIndexOf, iIndexOf2);
            }
            int iCountQuotes = countQuotes(str, i3, iIndexOf) + i2;
            if (iCountQuotes == 1 || escaped(iIndexOf, i3, str)) {
                i2 = iCountQuotes;
            } else {
                arrayList.add(new RDN(str.substring(i, iIndexOf), map));
                i = iIndexOf + 1;
                i2 = 0;
            }
            i3 = iIndexOf + 1;
            iIndexOf = str.indexOf(44, i3);
            iIndexOf2 = str.indexOf(59, i3);
        }
    }

    private void parseRFC2253DN(String str) {
        if (str.length() == 0) {
            this.names = new RDN[0];
            return;
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf(44);
        int i = 0;
        int i2 = 0;
        while (iIndexOf >= 0) {
            if (iIndexOf > 0 && !escaped(iIndexOf, i2, str)) {
                arrayList.add(new RDN(str.substring(i, iIndexOf), "RFC2253"));
                i = iIndexOf + 1;
            }
            i2 = iIndexOf + 1;
            iIndexOf = str.indexOf(44, i2);
        }
        arrayList.add(new RDN(str.substring(i), "RFC2253"));
        Collections.reverse(arrayList);
        this.names = (RDN[]) arrayList.toArray(new RDN[0]);
    }

    public List<AVA> allAvas() {
        List<AVA> list = this.allAvaList;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (RDN rdn : this.names) {
            arrayList.addAll(rdn.avas());
        }
        List<AVA> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.allAvaList = listUnmodifiableList;
        return listUnmodifiableList;
    }

    public X500Principal asX500Principal() {
        return this.x500Principal;
    }

    public int avaSize() {
        return allAvas().size();
    }

    public X500Name commonAncestor(X500Name x500Name) {
        if (x500Name == null) {
            return null;
        }
        int length = x500Name.names.length;
        int length2 = this.names.length;
        if (length2 != 0 && length != 0) {
            int iMin = Math.min(length2, length);
            int i = 0;
            while (i < iMin) {
                if (!this.names[i].equals(x500Name.names[i])) {
                    if (i != 0) {
                        break;
                    }
                    return null;
                }
                i++;
            }
            RDN[] rdnArr = new RDN[i];
            System.arraycopy(this.names, 0, rdnArr, 0, i);
            try {
                return new X500Name(rdnArr);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 4) {
            return -1;
        }
        X500Name x500Name = (X500Name) generalNameInterface;
        if (x500Name.equals(this)) {
            return 0;
        }
        if (x500Name.names.length == 0) {
            return 2;
        }
        if (this.names.length == 0 || x500Name.isWithinSubtree(this)) {
            return 1;
        }
        return isWithinSubtree(x500Name) ? 2 : 3;
    }

    @Deprecated
    public void emit(DerOutputStream derOutputStream) throws IOException {
        encode(derOutputStream);
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        for (RDN rdn : this.names) {
            rdn.encode(derOutputStream2);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X500Name)) {
            return false;
        }
        X500Name x500Name = (X500Name) obj;
        String str2 = this.canonicalDn;
        if (str2 != null && (str = x500Name.canonicalDn) != null) {
            return str2.equals(str);
        }
        int length = this.names.length;
        if (length != x500Name.names.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.names[i].assertion.length != x500Name.names[i].assertion.length) {
                return false;
            }
        }
        return getRFC2253CanonicalName().equals(x500Name.getRFC2253CanonicalName());
    }

    public DerValue findMostSpecificAttribute(ObjectIdentifier objectIdentifier) {
        RDN[] rdnArr = this.names;
        if (rdnArr == null) {
            return null;
        }
        for (int length = rdnArr.length - 1; length >= 0; length--) {
            DerValue derValueFindAttribute = this.names[length].findAttribute(objectIdentifier);
            if (derValueFindAttribute != null) {
                return derValueFindAttribute;
            }
        }
        return null;
    }

    public String getCommonName() {
        return getString(findAttribute(commonName_oid));
    }

    public String getCountry() {
        return getString(findAttribute(countryName_oid));
    }

    public String getDNQualifier() {
        return getString(findAttribute(DNQUALIFIER_OID));
    }

    public String getDomain() {
        return getString(findAttribute(DOMAIN_COMPONENT_OID));
    }

    public byte[] getEncoded() {
        return (byte[]) getEncodedInternal().clone();
    }

    public byte[] getEncodedInternal() throws IOException {
        if (this.encoded == null) {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            for (RDN rdn : this.names) {
                rdn.encode(derOutputStream2);
            }
            derOutputStream.write((byte) 48, derOutputStream2);
            this.encoded = derOutputStream.toByteArray();
        }
        return this.encoded;
    }

    public String getGeneration() {
        return getString(findAttribute(GENERATIONQUALIFIER_OID));
    }

    public String getGivenName() {
        return getString(findAttribute(GIVENNAME_OID));
    }

    public String getIP() {
        return getString(findAttribute(ipAddress_oid));
    }

    public String getInitials() {
        return getString(findAttribute(INITIALS_OID));
    }

    public String getLocality() {
        return getString(findAttribute(localityName_oid));
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }

    public String getOrganization() {
        return getString(findAttribute(orgName_oid));
    }

    public String getOrganizationalUnit() {
        return getString(findAttribute(orgUnitName_oid));
    }

    public String getRFC1779Name(Map<String, String> map) {
        if (!map.isEmpty()) {
            return generateRFC1779DN(map);
        }
        if (this.rfc1779Dn == null) {
            this.rfc1779Dn = generateRFC1779DN(map);
        }
        return this.rfc1779Dn;
    }

    public String getRFC2253CanonicalName() {
        String str = this.canonicalDn;
        if (str != null) {
            return str;
        }
        if (this.names.length == 0) {
            this.canonicalDn = "";
            return "";
        }
        StringBuilder sb = new StringBuilder(48);
        for (int length = this.names.length - 1; length >= 0; length--) {
            if (length < this.names.length - 1) {
                sb.append(',');
            }
            sb.append(this.names[length].toRFC2253String(true));
        }
        String string = sb.toString();
        this.canonicalDn = string;
        return string;
    }

    public String getRFC2253Name(Map<String, String> map) {
        if (!map.isEmpty()) {
            return generateRFC2253DN(map);
        }
        if (this.rfc2253Dn == null) {
            this.rfc2253Dn = generateRFC2253DN(map);
        }
        return this.rfc2253Dn;
    }

    public String getState() {
        return getString(findAttribute(stateName_oid));
    }

    public String getSurname() {
        return getString(findAttribute(SURNAME_OID));
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 4;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return getRFC2253CanonicalName().hashCode();
    }

    public boolean isEmpty() {
        RDN[] rdnArr = this.names;
        if (rdnArr.length == 0) {
            return true;
        }
        for (RDN rdn : rdnArr) {
            if (rdn.assertion.length != 0) {
                return false;
            }
        }
        return true;
    }

    public List<RDN> rdns() {
        List<RDN> list = this.rdnList;
        if (list != null) {
            return list;
        }
        List<RDN> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(this.names));
        this.rdnList = listUnmodifiableList;
        return listUnmodifiableList;
    }

    public int size() {
        return this.names.length;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        return this.names.length;
    }

    @Override // java.security.Principal
    public String toString() {
        if (this.f298dn == null) {
            generateDN();
        }
        return this.f298dn;
    }

    public String getRFC1779Name() {
        return getRFC1779Name(Collections.EMPTY_MAP);
    }

    public String getRFC2253Name() {
        return getRFC2253Name(Collections.EMPTY_MAP);
    }

    public X500Name(String str, Map<String, String> map) {
        parseDN(str, map);
    }

    public X500Name(String str, String str2) throws IOException {
        if (str != null) {
            if (str2.equalsIgnoreCase("RFC2253")) {
                parseRFC2253DN(str);
                return;
            } else if (str2.equalsIgnoreCase("DEFAULT")) {
                parseDN(str, Collections.EMPTY_MAP);
                return;
            } else {
                ca0.m1178j("Unsupported format ".concat(str2));
                throw null;
            }
        }
        l41.m4051t("Name must not be null");
        throw null;
    }

    public X500Name(String str, String str2, String str3, String str4) {
        RDN[] rdnArr = new RDN[4];
        this.names = rdnArr;
        rdnArr[3] = new RDN(1);
        this.names[3].assertion[0] = new AVA(commonName_oid, new DerValue(str));
        this.names[2] = new RDN(1);
        this.names[2].assertion[0] = new AVA(orgUnitName_oid, new DerValue(str2));
        this.names[1] = new RDN(1);
        this.names[1].assertion[0] = new AVA(orgName_oid, new DerValue(str3));
        this.names[0] = new RDN(1);
        this.names[0].assertion[0] = new AVA(countryName_oid, new DerValue(str4));
    }

    public X500Name(String str) {
        this(str, (Map<String, String>) Collections.EMPTY_MAP);
    }

    public X500Name(RDN[] rdnArr) throws IOException {
        if (rdnArr == null) {
            this.names = new RDN[0];
            return;
        }
        RDN[] rdnArr2 = (RDN[]) rdnArr.clone();
        this.names = rdnArr2;
        for (RDN rdn : rdnArr2) {
            if (rdn == null) {
                ca0.m1178j("Cannot create an X500Name");
                throw null;
            }
        }
    }

    public X500Name(DerValue derValue) {
        this(derValue.toDerInputStream());
    }

    public X500Name(DerInputStream derInputStream) {
        parseDER(derInputStream);
    }

    public X500Name(byte[] bArr) {
        parseDER(new DerInputStream(bArr));
    }
}
