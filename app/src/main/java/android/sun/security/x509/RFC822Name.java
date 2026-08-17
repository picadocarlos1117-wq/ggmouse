package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.util.Locale;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class RFC822Name implements GeneralNameInterface {
    private String name;

    public RFC822Name(DerValue derValue) throws IOException {
        String iA5String = derValue.getIA5String();
        this.name = iA5String;
        parseName(iA5String);
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 1) {
            return -1;
        }
        String name = ((RFC822Name) generalNameInterface).getName();
        Locale locale = Locale.ENGLISH;
        String lowerCase = name.toLowerCase(locale);
        String lowerCase2 = this.name.toLowerCase(locale);
        if (lowerCase.equals(lowerCase2)) {
            return 0;
        }
        if (lowerCase2.endsWith(lowerCase)) {
            if (lowerCase.indexOf(64) != -1) {
                return 3;
            }
            return (lowerCase.startsWith(".") || lowerCase2.charAt(lowerCase2.lastIndexOf(lowerCase) - 1) == '@') ? 2 : 3;
        }
        if (lowerCase.endsWith(lowerCase2) && lowerCase2.indexOf(64) == -1) {
            return (lowerCase2.startsWith(".") || lowerCase.charAt(lowerCase.lastIndexOf(lowerCase2) - 1) == '@') ? 1 : 3;
        }
        return 3;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putIA5String(this.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RFC822Name) {
            return this.name.equalsIgnoreCase(((RFC822Name) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 1;
    }

    public int hashCode() {
        return this.name.toUpperCase().hashCode();
    }

    public void parseName(String str) throws IOException {
        if (str == null || str.length() == 0) {
            ca0.m1178j("RFC822Name may not be null or empty");
            return;
        }
        String strSubstring = str.substring(str.indexOf(64) + 1);
        if (strSubstring.length() == 0) {
            ca0.m1178j("RFC822Name may not end with @");
        } else if (strSubstring.startsWith(".") && strSubstring.length() == 1) {
            ca0.m1178j("RFC822Name domain may not be just .");
        }
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        String strSubstring = this.name;
        int iLastIndexOf = strSubstring.lastIndexOf(64);
        int i = 1;
        if (iLastIndexOf >= 0) {
            strSubstring = strSubstring.substring(iLastIndexOf + 1);
            i = 2;
        }
        while (strSubstring.lastIndexOf(46) >= 0) {
            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(46));
            i++;
        }
        return i;
    }

    public String toString() {
        return "RFC822Name: " + this.name;
    }

    public RFC822Name(String str) throws IOException {
        parseName(str);
        this.name = str;
    }
}
