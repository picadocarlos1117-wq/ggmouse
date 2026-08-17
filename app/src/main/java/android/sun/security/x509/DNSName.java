package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.util.Locale;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DNSName implements GeneralNameInterface {
    private static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String alphaDigitsAndHyphen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-";
    private static final String digitsAndHyphen = "0123456789-";
    private String name;

    public DNSName(String str) throws IOException {
        if (str == null || str.length() == 0) {
            ca0.m1178j("DNS name must not be null");
            throw null;
        }
        if (str.indexOf(32) != -1) {
            ca0.m1178j("DNS names or NameConstraints with blank components are not permitted");
            throw null;
        }
        int i = 0;
        if (str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.') {
            ca0.m1178j("DNS names or NameConstraints may not begin or end with a .");
            throw null;
        }
        while (i < str.length()) {
            int iIndexOf = str.indexOf(46, i);
            iIndexOf = iIndexOf < 0 ? str.length() : iIndexOf;
            if (iIndexOf - i < 1) {
                ca0.m1178j("DNSName SubjectAltNames with empty components are not permitted");
                throw null;
            }
            if (alpha.indexOf(str.charAt(i)) < 0) {
                ca0.m1178j("DNSName components must begin with a letter");
                throw null;
            }
            while (true) {
                i++;
                if (i < iIndexOf) {
                    if (alphaDigitsAndHyphen.indexOf(str.charAt(i)) < 0) {
                        ca0.m1178j("DNSName components must consist of letters, digits, and hyphens");
                        throw null;
                    }
                }
            }
            i = iIndexOf + 1;
        }
        this.name = str;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 2) {
            return -1;
        }
        String name = ((DNSName) generalNameInterface).getName();
        Locale locale = Locale.ENGLISH;
        String lowerCase = name.toLowerCase(locale);
        String lowerCase2 = this.name.toLowerCase(locale);
        if (lowerCase.equals(lowerCase2)) {
            return 0;
        }
        if (lowerCase2.endsWith(lowerCase)) {
            return lowerCase2.charAt(lowerCase2.lastIndexOf(lowerCase) - 1) == '.' ? 2 : 3;
        }
        return (lowerCase.endsWith(lowerCase2) && lowerCase.charAt(lowerCase.lastIndexOf(lowerCase2) - 1) == '.') ? 1 : 3;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putIA5String(this.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DNSName) {
            return this.name.equalsIgnoreCase(((DNSName) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 2;
    }

    public int hashCode() {
        return this.name.toUpperCase().hashCode();
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        String strSubstring = this.name;
        int i = 1;
        while (strSubstring.lastIndexOf(46) >= 0) {
            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(46));
            i++;
        }
        return i;
    }

    public String toString() {
        return "DNSName: " + this.name;
    }

    public DNSName(DerValue derValue) {
        this.name = derValue.getIA5String();
    }
}
