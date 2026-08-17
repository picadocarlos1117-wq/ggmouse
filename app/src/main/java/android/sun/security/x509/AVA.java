package android.sun.security.x509;

import android.sun.security.action.GetBooleanAction;
import android.sun.security.pkcs.PKCS9Attribute;
import android.sun.security.util.Debug;
import android.sun.security.util.DerEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p000.ca0;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AVA implements DerEncoder {
    static final int DEFAULT = 1;
    static final int RFC1779 = 2;
    static final int RFC2253 = 3;
    private static final String hexDigits = "0123456789ABCDEF";
    private static final String specialChars = ",+=\n<>#;";
    private static final String specialChars2253 = ",+\"\\<>;";
    private static final String specialCharsAll = ",=\n+<>#;\\\" ";
    final ObjectIdentifier oid;
    final DerValue value;
    private static final Debug debug = Debug.getInstance(X509CertImpl.NAME, "\t[AVA]");
    private static final boolean PRESERVE_OLD_DC_ENCODING = ((Boolean) AccessController.doPrivileged(new GetBooleanAction("com.sun.security.preserveOldDCEncoding"))).booleanValue();

    public AVA(Reader reader, int i, Map<String, String> map) throws IOException {
        int i2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i3 = readChar(reader, "Incorrect AVA format");
            if (i3 == 61) {
                break;
            } else {
                sb.append((char) i3);
            }
        }
        this.oid = AVAKeyword.getOID(sb.toString(), i, map);
        sb.setLength(0);
        if (i != 3) {
            while (true) {
                i2 = reader.read();
                if (i2 != 32 && i2 != 10) {
                    break;
                }
            }
        } else {
            i2 = reader.read();
            if (i2 == 32) {
                ca0.m1178j("Incorrect AVA RFC2253 format - leading space must be escaped");
                throw null;
            }
        }
        if (i2 == -1) {
            this.value = new DerValue("");
            return;
        }
        if (i2 == 35) {
            this.value = parseHexString(reader, i);
        } else if (i2 != 34 || i == 3) {
            this.value = parseString(reader, i2, i, sb);
        } else {
            this.value = parseQuotedString(reader, sb);
        }
    }

    private static Byte getEmbeddedHexPair(int i, Reader reader) throws IOException {
        char c = (char) i;
        if (hexDigits.indexOf(Character.toUpperCase(c)) >= 0) {
            char c2 = (char) readChar(reader, "unexpected EOF - escaped hex value must include two valid digits");
            if (hexDigits.indexOf(Character.toUpperCase(c2)) >= 0) {
                return Byte.valueOf((byte) ((Character.digit(c, 16) << 4) + Character.digit(c2, 16)));
            }
            ca0.m1178j("escaped hex value must include two valid digits");
        }
        return null;
    }

    private static String getEmbeddedHexString(List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get(i).byteValue();
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static boolean isDerString(DerValue derValue, boolean z) {
        if (z) {
            byte b = derValue.tag;
            return b == 12 || b == 19;
        }
        byte b2 = derValue.tag;
        return b2 == 12 || b2 == 22 || b2 == 27 || b2 == 30 || b2 == 19 || b2 == 20;
    }

    private static boolean isTerminator(int i, int i2) {
        if (i != -1) {
            if (i == 59 || i == 62) {
                return i2 != 3;
            }
            if (i != 43 && i != 44) {
                return false;
            }
        }
        return true;
    }

    private static DerValue parseHexString(Reader reader, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        byte b = 0;
        while (true) {
            int i3 = reader.read();
            if (isTerminator(i3, i)) {
                if (i2 == 0) {
                    ca0.m1178j("AVA parse, zero hex digits");
                    return null;
                }
                if (i2 % 2 != 1) {
                    return new DerValue(byteArrayOutputStream.toByteArray());
                }
                ca0.m1178j("AVA parse, odd number of hex digits");
                return null;
            }
            char c = (char) i3;
            int iIndexOf = hexDigits.indexOf(Character.toUpperCase(c));
            if (iIndexOf == -1) {
                throw new IOException("AVA parse, invalid hex digit: " + c);
            }
            if (i2 % 2 == 1) {
                b = (byte) ((b * 16) + ((byte) iIndexOf));
                byteArrayOutputStream.write(b);
            } else {
                b = (byte) iIndexOf;
            }
            i2++;
        }
    }

    private DerValue parseQuotedString(Reader reader, StringBuilder sb) throws IOException {
        int i;
        int i2 = readChar(reader, "Quoted string did not end in quote");
        ArrayList arrayList = new ArrayList();
        boolean zIsPrintableStringChar = true;
        while (i2 != 34) {
            if (i2 == 92) {
                i2 = readChar(reader, "Quoted string did not end in quote");
                Byte embeddedHexPair = getEmbeddedHexPair(i2, reader);
                if (embeddedHexPair != null) {
                    arrayList.add(embeddedHexPair);
                    i2 = reader.read();
                    zIsPrintableStringChar = false;
                } else if (i2 != 92 && i2 != 34) {
                    char c = (char) i2;
                    if (specialChars.indexOf(c) < 0) {
                        throw new IOException("Invalid escaped character in AVA: " + c);
                    }
                }
            }
            if (arrayList.size() > 0) {
                sb.append(getEmbeddedHexString(arrayList));
                arrayList.clear();
            }
            char c2 = (char) i2;
            zIsPrintableStringChar &= DerValue.isPrintableStringChar(c2);
            sb.append(c2);
            i2 = readChar(reader, "Quoted string did not end in quote");
        }
        if (arrayList.size() > 0) {
            sb.append(getEmbeddedHexString(arrayList));
            arrayList.clear();
        }
        while (true) {
            i = reader.read();
            if (i != 10 && i != 32) {
                break;
            }
        }
        if (i != -1) {
            ca0.m1178j("AVA had characters other than whitespace after terminating quote");
            return null;
        }
        if (this.oid.equals(PKCS9Attribute.EMAIL_ADDRESS_OID) || (this.oid.equals(X500Name.DOMAIN_COMPONENT_OID) && !PRESERVE_OLD_DC_ENCODING)) {
            return new DerValue(DerValue.tag_IA5String, sb.toString().trim());
        }
        return zIsPrintableStringChar ? new DerValue(sb.toString().trim()) : new DerValue(DerValue.tag_UTF8String, sb.toString().trim());
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0129  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170 A[LOOP:0: B:3:0x0013->B:91:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0117 A[SYNTHETIC] */
    private DerValue parseString(Reader reader, int i, int i2, StringBuilder sb) throws IOException {
        DerValue derValue;
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = i;
        boolean zIsPrintableStringChar = true;
        boolean z2 = true;
        int i5 = 0;
        while (true) {
            if (i4 == 92) {
                i4 = readChar(reader, "Invalid trailing backslash");
                derValue = null;
                Byte embeddedHexPair = getEmbeddedHexPair(i4, reader);
                if (embeddedHexPair == null) {
                    if ((i2 == i3 && specialCharsAll.indexOf((char) i4) == -1) || (i2 == 2 && specialChars.indexOf((char) i4) == -1 && i4 != 92 && i4 != 34)) {
                        break;
                    }
                    if (i2 == 3) {
                        if (i4 == 32) {
                            if (!z2 && !trailingSpace(reader)) {
                                ca0.m1178j("Invalid escaped space character in AVA. Only a leading or trailing space character can be escaped.");
                                return null;
                            }
                        } else if (i4 != 35) {
                            char c = (char) i4;
                            if (specialChars2253.indexOf(c) == -1) {
                                throw new IOException("Invalid escaped character in AVA: '" + c + "'");
                            }
                        } else if (!z2) {
                            ca0.m1178j("Invalid escaped '#' character in AVA. Only a leading '#' can be escaped.");
                            return null;
                        }
                    }
                    z = true;
                } else {
                    arrayList.add(embeddedHexPair);
                    i4 = reader.read();
                    zIsPrintableStringChar = false;
                }
                if (isTerminator(i4, i2)) {
                    if (i2 != 3 && i5 > 0) {
                        ca0.m1178j("Incorrect AVA RFC2253 format - trailing space must be escaped");
                        return derValue;
                    }
                    if (arrayList.size() > 0) {
                        sb.append(getEmbeddedHexString(arrayList));
                        arrayList.clear();
                    }
                    if (!this.oid.equals(PKCS9Attribute.EMAIL_ADDRESS_OID) || (this.oid.equals(X500Name.DOMAIN_COMPONENT_OID) && !PRESERVE_OLD_DC_ENCODING)) {
                        return new DerValue(DerValue.tag_IA5String, sb.toString());
                    }
                    return zIsPrintableStringChar ? new DerValue(sb.toString()) : new DerValue(DerValue.tag_UTF8String, sb.toString());
                }
                i3 = 1;
                z2 = false;
            } else {
                derValue = null;
                if (i2 == 3) {
                    char c2 = (char) i4;
                    if (specialChars2253.indexOf(c2) != -1) {
                        throw new IOException("Character '" + c2 + "' in AVA appears without escape");
                    }
                }
                z = false;
            }
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < i5; i6++) {
                    sb.append(" ");
                }
                sb.append(getEmbeddedHexString(arrayList));
                arrayList.clear();
                i5 = 0;
            }
            char c3 = (char) i4;
            zIsPrintableStringChar &= DerValue.isPrintableStringChar(c3);
            if (i4 != 32 || z) {
                for (int i7 = 0; i7 < i5; i7++) {
                    sb.append(" ");
                }
                sb.append(c3);
                i5 = 0;
            } else {
                i5++;
            }
            i4 = reader.read();
            if (isTerminator(i4, i2)) {
                if (i2 != 3) {
                }
                if (arrayList.size() > 0) {
                    sb.append(getEmbeddedHexString(arrayList));
                    arrayList.clear();
                }
                if (this.oid.equals(PKCS9Attribute.EMAIL_ADDRESS_OID)) {
                }
                return new DerValue(DerValue.tag_IA5String, sb.toString());
            }
            i3 = 1;
            z2 = false;
        }
        throw new IOException("Invalid escaped character in AVA: '" + ((char) i4) + "'");
    }

    private static int readChar(Reader reader, String str) throws IOException {
        int i = reader.read();
        if (i != -1) {
            return i;
        }
        ca0.m1178j(str);
        return 0;
    }

    private String toKeyword(int i, Map<String, String> map) {
        return AVAKeyword.getKeyword(this.oid, i, map);
    }

    private String toKeywordValueString(String str) {
        char cCharAt;
        StringBuilder sb = new StringBuilder(40);
        sb.append(str);
        sb.append("=");
        try {
            String asString = this.value.getAsString();
            if (asString == null) {
                byte[] byteArray = this.value.toByteArray();
                sb.append('#');
                for (byte b : byteArray) {
                    sb.append(hexDigits.charAt((b >> 4) & 15));
                    sb.append(hexDigits.charAt(b & 15));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    boolean z3 = true;
                    if (i >= asString.length()) {
                        break;
                    }
                    char cCharAt2 = asString.charAt(i);
                    if (DerValue.isPrintableStringChar(cCharAt2) || ",+=\n<>#;\\\"".indexOf(cCharAt2) >= 0) {
                        if (!z && ((i == 0 && (cCharAt2 == ' ' || cCharAt2 == '\n')) || ",+=\n<>#;\\\"".indexOf(cCharAt2) >= 0)) {
                            z = true;
                        }
                        if (cCharAt2 != ' ' && cCharAt2 != '\n') {
                            if (cCharAt2 == '\"' || cCharAt2 == '\\') {
                                sb2.append('\\');
                            }
                            z3 = false;
                        } else if (!z && z2) {
                            z = true;
                        }
                        sb2.append(cCharAt2);
                        z2 = z3;
                    } else {
                        if (debug == null || !Debug.isOn("ava")) {
                            sb2.append(cCharAt2);
                        } else {
                            for (byte b2 : Character.toString(cCharAt2).getBytes(StandardCharsets.UTF_8)) {
                                sb2.append('\\');
                                sb2.append(Character.toUpperCase(Character.forDigit((b2 >>> 4) & 15, 16)));
                                sb2.append(Character.toUpperCase(Character.forDigit(b2 & 15, 16)));
                            }
                        }
                        z2 = false;
                    }
                    i++;
                }
                if (sb2.length() > 0 && ((cCharAt = sb2.charAt(sb2.length() - 1)) == ' ' || cCharAt == '\n')) {
                    z = true;
                }
                if (z) {
                    sb.append("\"");
                    sb.append(sb2.toString());
                    sb.append("\"");
                } else {
                    sb.append(sb2.toString());
                }
            }
            return sb.toString();
        } catch (IOException unused) {
            f40.m2713i("DER Value conversion");
            return null;
        }
    }

    private static boolean trailingSpace(Reader reader) throws IOException {
        boolean z = true;
        if (!reader.markSupported()) {
            return true;
        }
        reader.mark(9999);
        while (true) {
            int i = reader.read();
            if (i == -1) {
                break;
            }
            if (i != 32 && (i != 92 || reader.read() != 32)) {
                z = false;
                break;
            }
        }
        reader.reset();
        return z;
    }

    @Override // android.sun.security.util.DerEncoder
    public void derEncode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream.putOID(this.oid);
        this.value.encode(derOutputStream);
        derOutputStream2.write((byte) 48, derOutputStream);
        outputStream.write(derOutputStream2.toByteArray());
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derEncode(derOutputStream);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AVA) {
            return toRFC2253CanonicalString().equals(((AVA) obj).toRFC2253CanonicalString());
        }
        return false;
    }

    public DerValue getDerValue() {
        return this.value;
    }

    public ObjectIdentifier getObjectIdentifier() {
        return this.oid;
    }

    public String getValueString() {
        try {
            String asString = this.value.getAsString();
            if (asString != null) {
                return asString;
            }
            throw new RuntimeException("AVA string is null");
        } catch (IOException e) {
            throw new RuntimeException("AVA error: " + e, e);
        }
    }

    public boolean hasRFC2253Keyword() {
        return AVAKeyword.hasKeyword(this.oid, 3);
    }

    public int hashCode() {
        return toRFC2253CanonicalString().hashCode();
    }

    public String toRFC1779String(Map<String, String> map) {
        return toKeywordValueString(toKeyword(2, map));
    }

    public String toRFC2253CanonicalString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append(toKeyword(3, Collections.EMPTY_MAP));
        sb.append('=');
        if ((sb.charAt(0) < '0' || sb.charAt(0) > '9') && isDerString(this.value, true)) {
            try {
                String str = new String(this.value.getDataBytes(), StandardCharsets.UTF_8);
                StringBuilder sb2 = new StringBuilder();
                boolean z = false;
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (DerValue.isPrintableStringChar(cCharAt) || ",+<>;\"\\".indexOf(cCharAt) >= 0 || (i == 0 && cCharAt == '#')) {
                        if ((i == 0 && cCharAt == '#') || ",+<>;\"\\".indexOf(cCharAt) >= 0) {
                            sb2.append('\\');
                        }
                        if (!Character.isWhitespace(cCharAt)) {
                            sb2.append(cCharAt);
                        } else if (!z) {
                            sb2.append(cCharAt);
                            z = true;
                        }
                    } else if (debug == null || !Debug.isOn("ava")) {
                        sb2.append(cCharAt);
                    } else {
                        for (byte b : Character.toString(cCharAt).getBytes(StandardCharsets.UTF_8)) {
                            sb2.append('\\');
                            sb2.append(Character.forDigit((b >>> 4) & 15, 16));
                            sb2.append(Character.forDigit(b & 15, 16));
                        }
                    }
                    z = false;
                }
                sb.append(sb2.toString().trim());
            } catch (IOException unused) {
                f40.m2713i("DER Value conversion");
                return null;
            }
        } else {
            try {
                byte[] byteArray = this.value.toByteArray();
                sb.append('#');
                for (byte b2 : byteArray) {
                    sb.append(Character.forDigit((b2 >>> 4) & 15, 16));
                    sb.append(Character.forDigit(b2 & 15, 16));
                }
            } catch (IOException unused2) {
                f40.m2713i("DER Value conversion");
                return null;
            }
        }
        String string = sb.toString();
        Locale locale = Locale.US;
        return Normalizer.normalize(string.toUpperCase(locale).toLowerCase(locale), Normalizer.Form.NFKD);
    }

    public String toRFC2253String(Map<String, String> map) {
        char c;
        StringBuilder sb = new StringBuilder(100);
        sb.append(toKeyword(3, map));
        sb.append('=');
        int i = 0;
        if ((sb.charAt(0) < '0' || sb.charAt(0) > '9') && isDerString(this.value, false)) {
            try {
                String str = new String(this.value.getDataBytes(), StandardCharsets.UTF_8);
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (DerValue.isPrintableStringChar(cCharAt) || ",=+<>#;\"\\".indexOf(cCharAt) >= 0) {
                        if (",=+<>#;\"\\".indexOf(cCharAt) >= 0) {
                            sb2.append('\\');
                        }
                        sb2.append(cCharAt);
                    } else if (cCharAt == 0) {
                        sb2.append("\\00");
                    } else if (debug == null || !Debug.isOn("ava")) {
                        sb2.append(cCharAt);
                    } else {
                        for (byte b : Character.toString(cCharAt).getBytes(StandardCharsets.UTF_8)) {
                            sb2.append('\\');
                            sb2.append(Character.toUpperCase(Character.forDigit((b >>> 4) & 15, 16)));
                            sb2.append(Character.toUpperCase(Character.forDigit(b & 15, 16)));
                        }
                    }
                }
                char[] charArray = sb2.toString().toCharArray();
                StringBuilder sb3 = new StringBuilder();
                int i3 = 0;
                while (i3 < charArray.length && ((c = charArray[i3]) == ' ' || c == '\r')) {
                    i3++;
                }
                int length = charArray.length - 1;
                while (length >= 0) {
                    char c2 = charArray[length];
                    if (c2 != ' ' && c2 != '\r') {
                        break;
                    }
                    length--;
                }
                while (i < charArray.length) {
                    char c3 = charArray[i];
                    if (i < i3 || i > length) {
                        sb3.append('\\');
                    }
                    sb3.append(c3);
                    i++;
                }
                sb.append(sb3.toString());
            } catch (IOException unused) {
                f40.m2713i("DER Value conversion");
                return null;
            }
        } else {
            try {
                byte[] byteArray = this.value.toByteArray();
                sb.append('#');
                int length2 = byteArray.length;
                while (i < length2) {
                    byte b2 = byteArray[i];
                    sb.append(Character.forDigit((b2 >>> 4) & 15, 16));
                    sb.append(Character.forDigit(b2 & 15, 16));
                    i++;
                }
            } catch (IOException unused2) {
                f40.m2713i("DER Value conversion");
                return null;
            }
        }
        return sb.toString();
    }

    public String toString() {
        return toKeywordValueString(toKeyword(1, Collections.EMPTY_MAP));
    }

    public String toRFC1779String() {
        return toRFC1779String(Collections.EMPTY_MAP);
    }

    public AVA(Reader reader) {
        this(reader, 1);
    }

    public AVA(Reader reader, Map<String, String> map) {
        this(reader, 1, map);
    }

    public AVA(Reader reader, int i) {
        this(reader, i, Collections.EMPTY_MAP);
    }

    public AVA(ObjectIdentifier objectIdentifier, DerValue derValue) {
        if (objectIdentifier != null && derValue != null) {
            this.oid = objectIdentifier;
            this.value = derValue;
            return;
        }
        throw null;
    }

    public AVA(DerValue derValue) throws IOException {
        if (derValue.tag == 48) {
            this.oid = X500Name.intern(derValue.data.getOID());
            this.value = derValue.data.getDerValue();
            if (derValue.data.available() == 0) {
                return;
            }
            f40.m2710f(derValue.data.available(), "AVA, extra bytes = ");
            throw null;
        }
        ca0.m1178j("AVA not a sequence");
        throw null;
    }

    public AVA(DerInputStream derInputStream) {
        this(derInputStream.getDerValue());
    }

    public String toRFC2253String() {
        return toRFC2253String(Collections.EMPTY_MAP);
    }
}
