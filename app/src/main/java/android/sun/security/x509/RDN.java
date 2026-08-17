package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class RDN {
    final AVA[] assertion;
    private volatile List<AVA> avaList;
    private volatile String canonicalString;

    public RDN(String str, String str2, Map<String, String> map) throws IOException {
        if (!str2.equalsIgnoreCase("RFC2253")) {
            ca0.m1178j("Unsupported format ".concat(str2));
            throw null;
        }
        ArrayList arrayList = new ArrayList(3);
        int iIndexOf = str.indexOf(43);
        int i = 0;
        while (iIndexOf >= 0) {
            if (iIndexOf > 0 && str.charAt(iIndexOf - 1) != '\\') {
                String strSubstring = str.substring(i, iIndexOf);
                if (strSubstring.length() == 0) {
                    ca0.m1178j(jd0.m3615m("empty AVA in RDN \"", str, "\""));
                    throw null;
                }
                arrayList.add(new AVA(new StringReader(strSubstring), 3, map));
                i = iIndexOf + 1;
            }
            iIndexOf = str.indexOf(43, iIndexOf + 1);
        }
        String strSubstring2 = str.substring(i);
        if (strSubstring2.length() == 0) {
            ca0.m1178j(jd0.m3615m("empty AVA in RDN \"", str, "\""));
            throw null;
        }
        arrayList.add(new AVA(new StringReader(strSubstring2), 3, map));
        this.assertion = (AVA[]) arrayList.toArray(new AVA[arrayList.size()]);
    }

    private String toRFC2253StringInternal(boolean z, Map<String, String> map) {
        AVA[] avaArr = this.assertion;
        int i = 0;
        if (avaArr.length == 1) {
            return z ? avaArr[0].toRFC2253CanonicalString() : avaArr[0].toRFC2253String(map);
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            ArrayList arrayList = new ArrayList(this.assertion.length);
            int i2 = 0;
            while (true) {
                AVA[] avaArr2 = this.assertion;
                if (i2 >= avaArr2.length) {
                    break;
                }
                arrayList.add(avaArr2[i2]);
                i2++;
            }
            Collections.sort(arrayList, AVAComparator.getInstance());
            while (i < arrayList.size()) {
                if (i > 0) {
                    sb.append('+');
                }
                sb.append(((AVA) arrayList.get(i)).toRFC2253CanonicalString());
                i++;
            }
        } else {
            while (i < this.assertion.length) {
                if (i > 0) {
                    sb.append('+');
                }
                sb.append(this.assertion[i].toRFC2253String(map));
                i++;
            }
        }
        return sb.toString();
    }

    public List<AVA> avas() {
        List<AVA> list = this.avaList;
        if (list != null) {
            return list;
        }
        List<AVA> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(this.assertion));
        this.avaList = listUnmodifiableList;
        return listUnmodifiableList;
    }

    public void encode(DerOutputStream derOutputStream) {
        derOutputStream.putOrderedSetOf((byte) 49, this.assertion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RDN)) {
            return false;
        }
        RDN rdn = (RDN) obj;
        if (this.assertion.length != rdn.assertion.length) {
            return false;
        }
        return toRFC2253String(true).equals(rdn.toRFC2253String(true));
    }

    public DerValue findAttribute(ObjectIdentifier objectIdentifier) {
        int i = 0;
        while (true) {
            AVA[] avaArr = this.assertion;
            if (i >= avaArr.length) {
                return null;
            }
            if (avaArr[i].oid.equals(objectIdentifier)) {
                return this.assertion[i].value;
            }
            i++;
        }
    }

    public int hashCode() {
        return toRFC2253String(true).hashCode();
    }

    public int size() {
        return this.assertion.length;
    }

    public String toRFC1779String(Map<String, String> map) {
        AVA[] avaArr = this.assertion;
        if (avaArr.length == 1) {
            return avaArr[0].toRFC1779String(map);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.assertion.length; i++) {
            if (i != 0) {
                sb.append(" + ");
            }
            sb.append(this.assertion[i].toRFC1779String(map));
        }
        return sb.toString();
    }

    public String toRFC2253String(boolean z) {
        if (!z) {
            return toRFC2253StringInternal(false, Collections.EMPTY_MAP);
        }
        String str = this.canonicalString;
        if (str != null) {
            return str;
        }
        String rFC2253StringInternal = toRFC2253StringInternal(true, Collections.EMPTY_MAP);
        this.canonicalString = rFC2253StringInternal;
        return rFC2253StringInternal;
    }

    public String toString() {
        AVA[] avaArr = this.assertion;
        if (avaArr.length == 1) {
            return avaArr[0].toString();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.assertion.length; i++) {
            if (i != 0) {
                sb.append(" + ");
            }
            sb.append(this.assertion[i].toString());
        }
        return sb.toString();
    }

    public String toRFC2253String(Map<String, String> map) {
        return toRFC2253StringInternal(false, map);
    }

    public String toRFC2253String() {
        return toRFC2253StringInternal(false, Collections.EMPTY_MAP);
    }

    public String toRFC1779String() {
        return toRFC1779String(Collections.EMPTY_MAP);
    }

    public RDN(String str, Map<String, String> map) throws IOException {
        ArrayList arrayList = new ArrayList(3);
        int iIndexOf = str.indexOf(43);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (iIndexOf >= 0) {
            int iCountQuotes = X500Name.countQuotes(str, i3, iIndexOf) + i2;
            if (iIndexOf <= 0 || str.charAt(iIndexOf - 1) == '\\' || iCountQuotes == 1) {
                i2 = iCountQuotes;
            } else {
                String strSubstring = str.substring(i, iIndexOf);
                if (strSubstring.length() != 0) {
                    arrayList.add(new AVA(new StringReader(strSubstring), map));
                    i = iIndexOf + 1;
                    i2 = 0;
                } else {
                    ca0.m1178j(jd0.m3615m("empty AVA in RDN \"", str, "\""));
                    throw null;
                }
            }
            i3 = iIndexOf + 1;
            iIndexOf = str.indexOf(43, i3);
        }
        String strSubstring2 = str.substring(i);
        if (strSubstring2.length() != 0) {
            arrayList.add(new AVA(new StringReader(strSubstring2), map));
            this.assertion = (AVA[]) arrayList.toArray(new AVA[arrayList.size()]);
        } else {
            ca0.m1178j(jd0.m3615m("empty AVA in RDN \"", str, "\""));
            throw null;
        }
    }

    public RDN(String str, String str2) {
        this(str, str2, Collections.EMPTY_MAP);
    }

    public RDN(String str) {
        this(str, (Map<String, String>) Collections.EMPTY_MAP);
    }

    public RDN(DerValue derValue) throws IOException {
        if (derValue.tag == 49) {
            DerValue[] set = new DerInputStream(derValue.toByteArray()).getSet(5);
            this.assertion = new AVA[set.length];
            for (int i = 0; i < set.length; i++) {
                this.assertion[i] = new AVA(set[i]);
            }
            return;
        }
        ca0.m1178j("X500 RDN");
        throw null;
    }

    public RDN(int i) {
        this.assertion = new AVA[i];
    }

    public RDN(AVA ava) {
        ava.getClass();
        this.assertion = new AVA[]{ava};
    }

    public RDN(AVA[] avaArr) {
        this.assertion = (AVA[]) avaArr.clone();
        int i = 0;
        while (true) {
            AVA[] avaArr2 = this.assertion;
            if (i >= avaArr2.length) {
                return;
            }
            avaArr2[i].getClass();
            i++;
        }
    }
}
