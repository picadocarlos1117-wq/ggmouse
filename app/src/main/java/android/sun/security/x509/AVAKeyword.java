package android.sun.security.x509;

import android.sun.security.pkcs.PKCS9Attribute;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class AVAKeyword {
    private final String keyword;
    private final ObjectIdentifier oid;
    private final boolean rfc1779Compliant;
    private final boolean rfc2253Compliant;
    private static final Map<ObjectIdentifier, AVAKeyword> oidMap = new HashMap();
    private static final Map<String, AVAKeyword> keywordMap = new HashMap();

    static {
        new AVAKeyword("CN", X500Name.commonName_oid, true, true);
        new AVAKeyword("C", X500Name.countryName_oid, true, true);
        new AVAKeyword("L", X500Name.localityName_oid, true, true);
        ObjectIdentifier objectIdentifier = X500Name.stateName_oid;
        new AVAKeyword("S", objectIdentifier, false, false);
        new AVAKeyword("ST", objectIdentifier, true, true);
        new AVAKeyword("O", X500Name.orgName_oid, true, true);
        new AVAKeyword("OU", X500Name.orgUnitName_oid, true, true);
        new AVAKeyword("T", X500Name.title_oid, false, false);
        new AVAKeyword("IP", X500Name.ipAddress_oid, false, false);
        new AVAKeyword("STREET", X500Name.streetAddress_oid, true, true);
        new AVAKeyword("DC", X500Name.DOMAIN_COMPONENT_OID, false, true);
        ObjectIdentifier objectIdentifier2 = X500Name.DNQUALIFIER_OID;
        new AVAKeyword("DNQUALIFIER", objectIdentifier2, false, false);
        new AVAKeyword("DNQ", objectIdentifier2, false, false);
        new AVAKeyword("SURNAME", X500Name.SURNAME_OID, false, false);
        new AVAKeyword("GIVENNAME", X500Name.GIVENNAME_OID, false, false);
        new AVAKeyword("INITIALS", X500Name.INITIALS_OID, false, false);
        new AVAKeyword("GENERATION", X500Name.GENERATIONQUALIFIER_OID, false, false);
        ObjectIdentifier objectIdentifier3 = PKCS9Attribute.EMAIL_ADDRESS_OID;
        new AVAKeyword("EMAIL", objectIdentifier3, false, false);
        new AVAKeyword("EMAILADDRESS", objectIdentifier3, false, false);
        new AVAKeyword("UID", X500Name.userid_oid, false, true);
        new AVAKeyword("SERIALNUMBER", X500Name.SERIALNUMBER_OID, false, false);
    }

    private AVAKeyword(String str, ObjectIdentifier objectIdentifier, boolean z, boolean z2) {
        this.keyword = str;
        this.oid = objectIdentifier;
        this.rfc1779Compliant = z;
        this.rfc2253Compliant = z2;
        oidMap.put(objectIdentifier, this);
        keywordMap.put(str, this);
    }

    public static String getKeyword(ObjectIdentifier objectIdentifier, int i, Map<String, String> map) {
        String string = objectIdentifier.toString();
        String str = map.get(string);
        if (str == null) {
            AVAKeyword aVAKeyword = oidMap.get(objectIdentifier);
            if (aVAKeyword == null || !aVAKeyword.isCompliant(i)) {
                return i == 3 ? string : AbstractC1308pu.m5339f("OID.", string);
            }
            return aVAKeyword.keyword;
        }
        if (str.length() == 0) {
            f40.m2713i("keyword cannot be empty");
            return null;
        }
        String strTrim = str.trim();
        char cCharAt = strTrim.charAt(0);
        if (cCharAt < 'A' || cCharAt > 'z' || (cCharAt > 'Z' && cCharAt < 'a')) {
            f40.m2713i("keyword does not start with letter");
            return null;
        }
        for (int i2 = 1; i2 < strTrim.length(); i2++) {
            char cCharAt2 = strTrim.charAt(i2);
            if ((cCharAt2 < 'A' || cCharAt2 > 'z' || (cCharAt2 > 'Z' && cCharAt2 < 'a')) && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_')) {
                f40.m2713i("keyword character is not a letter, digit, or underscore");
                return null;
            }
        }
        return strTrim;
    }

    public static ObjectIdentifier getOID(String str, int i, Map<String, String> map) throws IOException {
        char cCharAt;
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (i != 3) {
            upperCase = upperCase.trim();
        } else if (upperCase.startsWith(" ") || upperCase.endsWith(" ")) {
            ca0.m1178j(jd0.m3615m("Invalid leading or trailing space in keyword \"", upperCase, "\""));
            return null;
        }
        String str2 = map.get(upperCase);
        if (str2 != null) {
            return new ObjectIdentifier(str2);
        }
        AVAKeyword aVAKeyword = keywordMap.get(upperCase);
        if (aVAKeyword != null && aVAKeyword.isCompliant(i)) {
            return aVAKeyword.oid;
        }
        if (i == 2) {
            if (!upperCase.startsWith("OID.")) {
                ca0.m1178j("Invalid RFC1779 keyword: ".concat(upperCase));
                return null;
            }
            upperCase = upperCase.substring(4);
        } else if (i == 1 && upperCase.startsWith("OID.")) {
            upperCase = upperCase.substring(4);
        }
        if (upperCase.length() != 0 && (cCharAt = upperCase.charAt(0)) >= '0' && cCharAt <= '9') {
            return new ObjectIdentifier(upperCase);
        }
        ca0.m1178j(jd0.m3615m("Invalid keyword \"", upperCase, "\""));
        return null;
    }

    public static boolean hasKeyword(ObjectIdentifier objectIdentifier, int i) {
        AVAKeyword aVAKeyword = oidMap.get(objectIdentifier);
        if (aVAKeyword == null) {
            return false;
        }
        return aVAKeyword.isCompliant(i);
    }

    private boolean isCompliant(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.rfc1779Compliant;
        }
        if (i == 3) {
            return this.rfc2253Compliant;
        }
        f40.m2713i(jd0.m3609g(i, "Invalid standard "));
        return false;
    }

    public static String getKeyword(ObjectIdentifier objectIdentifier, int i) {
        return getKeyword(objectIdentifier, i, Collections.EMPTY_MAP);
    }

    public static ObjectIdentifier getOID(String str, int i) {
        return getOID(str, i, Collections.EMPTY_MAP);
    }
}
