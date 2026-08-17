package android.sun.security.x509;

import android.sun.security.util.BitArray;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.util.Enumeration;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ReasonFlags {
    private boolean[] bitString;
    public static final String UNUSED = "unused";
    public static final String KEY_COMPROMISE = "key_compromise";
    public static final String CA_COMPROMISE = "ca_compromise";
    public static final String AFFILIATION_CHANGED = "affiliation_changed";
    public static final String SUPERSEDED = "superseded";
    public static final String CESSATION_OF_OPERATION = "cessation_of_operation";
    public static final String CERTIFICATE_HOLD = "certificate_hold";
    public static final String PRIVILEGE_WITHDRAWN = "privilege_withdrawn";
    public static final String AA_COMPROMISE = "aa_compromise";
    private static final String[] NAMES = {UNUSED, KEY_COMPROMISE, CA_COMPROMISE, AFFILIATION_CHANGED, SUPERSEDED, CESSATION_OF_OPERATION, CERTIFICATE_HOLD, PRIVILEGE_WITHDRAWN, AA_COMPROMISE};

    public ReasonFlags(DerInputStream derInputStream) {
        this.bitString = derInputStream.getDerValue().getUnalignedBitString(true).toBooleanArray();
    }

    private boolean isSet(int i) {
        return this.bitString[i];
    }

    private static int name2Index(String str) throws IOException {
        int i = 0;
        while (true) {
            String[] strArr = NAMES;
            if (i >= strArr.length) {
                ca0.m1178j("Name not recognized by ReasonFlags");
                return 0;
            }
            if (strArr[i].equalsIgnoreCase(str)) {
                return i;
            }
            i++;
        }
    }

    public void delete(String str) throws IOException {
        set(str, Boolean.FALSE);
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putTruncatedUnalignedBitString(new BitArray(this.bitString));
    }

    public Object get(String str) {
        return Boolean.valueOf(isSet(name2Index(str)));
    }

    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        int i = 0;
        while (true) {
            String[] strArr = NAMES;
            if (i >= strArr.length) {
                return attributeNameEnumeration.elements();
            }
            attributeNameEnumeration.addElement(strArr[i]);
            i++;
        }
    }

    public boolean[] getFlags() {
        return this.bitString;
    }

    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Boolean)) {
            ca0.m1178j("Attribute must be of type Boolean.");
        } else {
            set(name2Index(str), ((Boolean) obj).booleanValue());
        }
    }

    public String toString() {
        String strConcat = "Reason Flags [\n";
        try {
            strConcat = isSet(0) ? "Reason Flags [\n  Unused\n" : "Reason Flags [\n";
            if (isSet(1)) {
                strConcat = strConcat.concat("  Key Compromise\n");
            }
            if (isSet(2)) {
                strConcat = strConcat.concat("  CA Compromise\n");
            }
            if (isSet(3)) {
                strConcat = strConcat.concat("  Affiliation_Changed\n");
            }
            if (isSet(4)) {
                strConcat = strConcat.concat("  Superseded\n");
            }
            if (isSet(5)) {
                strConcat = strConcat.concat("  Cessation Of Operation\n");
            }
            if (isSet(6)) {
                strConcat = strConcat.concat("  Certificate Hold\n");
            }
            if (isSet(7)) {
                strConcat = strConcat.concat("  Privilege Withdrawn\n");
            }
            if (isSet(8)) {
                strConcat = strConcat.concat("  AA Compromise\n");
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return strConcat.concat("]\n");
    }

    public ReasonFlags(boolean[] zArr) {
        this.bitString = zArr;
    }

    public ReasonFlags(BitArray bitArray) {
        this.bitString = bitArray.toBooleanArray();
    }

    public ReasonFlags(byte[] bArr) {
        this.bitString = new BitArray(bArr.length * 8, bArr).toBooleanArray();
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

    public ReasonFlags(DerValue derValue) {
        this.bitString = derValue.getUnalignedBitString(true).toBooleanArray();
    }
}
