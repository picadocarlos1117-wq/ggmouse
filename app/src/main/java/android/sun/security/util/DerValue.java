package android.sun.security.util;

import android.sun.misc.IOUtils;
import com.example.ssmousepro.BuildConfig;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Date;
import p000.ca0;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DerValue {
    public static final byte TAG_APPLICATION = 64;
    public static final byte TAG_CONTEXT = -128;
    public static final byte TAG_PRIVATE = -64;
    public static final byte TAG_UNIVERSAL = 0;
    public static final byte tag_BMPString = 30;
    public static final byte tag_BitString = 3;
    public static final byte tag_Boolean = 1;
    public static final byte tag_Enumerated = 10;
    public static final byte tag_GeneralString = 27;
    public static final byte tag_GeneralizedTime = 24;
    public static final byte tag_IA5String = 22;
    public static final byte tag_Integer = 2;
    public static final byte tag_Null = 5;
    public static final byte tag_ObjectId = 6;
    public static final byte tag_OctetString = 4;
    public static final byte tag_PrintableString = 19;
    public static final byte tag_Sequence = 48;
    public static final byte tag_SequenceOf = 48;
    public static final byte tag_Set = 49;
    public static final byte tag_SetOf = 49;
    public static final byte tag_T61String = 20;
    public static final byte tag_UTF8String = 12;
    public static final byte tag_UniversalString = 28;
    public static final byte tag_UtcTime = 23;
    protected DerInputBuffer buffer;
    public final DerInputStream data;
    private int length;
    public byte tag;

    public DerValue(DerInputBuffer derInputBuffer) throws IOException {
        this.tag = (byte) derInputBuffer.read();
        byte b = (byte) derInputBuffer.read();
        int length = DerInputStream.getLength(b & 255, derInputBuffer);
        this.length = length;
        if (length != -1) {
            DerInputBuffer derInputBufferDup = derInputBuffer.dup();
            this.buffer = derInputBufferDup;
            derInputBufferDup.truncate(this.length);
            this.data = new DerInputStream(this.buffer);
            derInputBuffer.skip(this.length);
            return;
        }
        DerInputBuffer derInputBufferDup2 = derInputBuffer.dup();
        int iAvailable = derInputBufferDup2.available();
        byte[] bArr = new byte[iAvailable + 2];
        bArr[0] = this.tag;
        bArr[1] = b;
        DataInputStream dataInputStream = new DataInputStream(derInputBufferDup2);
        dataInputStream.readFully(bArr, 2, iAvailable);
        dataInputStream.close();
        DerInputBuffer derInputBuffer2 = new DerInputBuffer(new DerIndefLenConverter().convert(bArr));
        if (this.tag != derInputBuffer2.read()) {
            ca0.m1178j("Indefinite length encoding not supported");
            throw null;
        }
        this.length = DerInputStream.getLength(derInputBuffer2);
        DerInputBuffer derInputBufferDup3 = derInputBuffer2.dup();
        this.buffer = derInputBufferDup3;
        derInputBufferDup3.truncate(this.length);
        this.data = new DerInputStream(this.buffer);
        derInputBuffer.skip(this.length + 2);
    }

    private byte[] append(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte createTag(byte b, boolean z, byte b2) {
        byte b3 = (byte) (b | b2);
        return z ? (byte) (b3 | 32) : b3;
    }

    private static boolean doEquals(DerValue derValue, DerValue derValue2) {
        boolean zEquals;
        synchronized (derValue.data) {
            synchronized (derValue2.data) {
                derValue.data.reset();
                derValue2.data.reset();
                zEquals = derValue.buffer.equals(derValue2.buffer);
            }
        }
        return zEquals;
    }

    private DerInputStream init(boolean z, InputStream inputStream) throws IOException {
        this.tag = (byte) inputStream.read();
        byte b = (byte) inputStream.read();
        int length = DerInputStream.getLength(b & 255, inputStream);
        this.length = length;
        if (length == -1) {
            int iAvailable = inputStream.available();
            byte[] bArr = new byte[iAvailable + 2];
            bArr[0] = this.tag;
            bArr[1] = b;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.readFully(bArr, 2, iAvailable);
            dataInputStream.close();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new DerIndefLenConverter().convert(bArr));
            if (this.tag != byteArrayInputStream.read()) {
                ca0.m1178j("Indefinite length encoding not supported");
                return null;
            }
            this.length = DerInputStream.getLength(byteArrayInputStream);
            inputStream = byteArrayInputStream;
        }
        if (z && inputStream.available() != this.length) {
            ca0.m1178j("extra data given to DerValue constructor");
            return null;
        }
        DerInputBuffer derInputBuffer = new DerInputBuffer(IOUtils.readFully(inputStream, this.length, true));
        this.buffer = derInputBuffer;
        return new DerInputStream(derInputBuffer);
    }

    public static boolean isPrintableStringChar(char c) {
        if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != ' ' && c != ':' && c != '=' && c != '?'))) {
            switch (c) {
                default:
                    switch (c) {
                        case '+':
                        case ',':
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        case '.':
                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                            break;
                        default:
                            return false;
                    }
                case BuildConfig.VERSION_CODE /* 39 */:
                case '(':
                case ')':
                    return true;
            }
        }
        return true;
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.write(this.tag);
        derOutputStream.putLength(this.length);
        int i = this.length;
        if (i > 0) {
            byte[] bArr = new byte[i];
            synchronized (this.data) {
                try {
                    this.buffer.reset();
                    if (this.buffer.read(bArr) != this.length) {
                        throw new IOException("short DER value read (encode)");
                    }
                    derOutputStream.write(bArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean equals(DerValue derValue) {
        if (this == derValue) {
            return true;
        }
        if (this.tag != derValue.tag) {
            return false;
        }
        DerInputStream derInputStream = this.data;
        if (derInputStream == derValue.data) {
            return true;
        }
        return System.identityHashCode(derInputStream) > System.identityHashCode(derValue.data) ? doEquals(this, derValue) : doEquals(derValue, this);
    }

    public String getAsString() {
        byte b = this.tag;
        if (b == 12) {
            return getUTF8String();
        }
        if (b == 19) {
            return getPrintableString();
        }
        if (b == 20) {
            return getT61String();
        }
        if (b == 22) {
            return getIA5String();
        }
        if (b == 30) {
            return getBMPString();
        }
        if (b == 27) {
            return getGeneralString();
        }
        return null;
    }

    public String getBMPString() throws IOException {
        if (this.tag == 30) {
            return new String(getDataBytes(), "UnicodeBigUnmarked");
        }
        f40.m2710f(this.tag, "DerValue.getBMPString, not BMP ");
        return null;
    }

    public BigInteger getBigInteger() throws IOException {
        if (this.tag == 2) {
            return this.buffer.getBigInteger(this.data.available(), false);
        }
        f40.m2710f(this.tag, "DerValue.getBigInteger, not an int ");
        return null;
    }

    public byte[] getBitString(boolean z) throws IOException {
        if (z || this.tag == 3) {
            return this.buffer.getBitString();
        }
        f40.m2710f(this.tag, "DerValue.getBitString, not a bit string ");
        return null;
    }

    public boolean getBoolean() throws IOException {
        if (this.tag != 1) {
            f40.m2710f(this.tag, "DerValue.getBoolean, not a BOOLEAN ");
            return false;
        }
        if (this.length == 1) {
            return this.buffer.read() != 0;
        }
        f40.m2710f(this.length, "DerValue.getBoolean, invalid length ");
        return false;
    }

    public final DerInputStream getData() {
        return this.data;
    }

    public byte[] getDataBytes() {
        byte[] bArr = new byte[this.length];
        synchronized (this.data) {
            this.data.reset();
            this.data.getBytes(bArr);
        }
        return bArr;
    }

    public int getEnumerated() throws IOException {
        if (this.tag == 10) {
            return this.buffer.getInteger(this.data.available());
        }
        f40.m2710f(this.tag, "DerValue.getEnumerated, incorrect tag: ");
        return 0;
    }

    public String getGeneralString() throws IOException {
        if (this.tag == 27) {
            return new String(getDataBytes(), "ASCII");
        }
        f40.m2710f(this.tag, "DerValue.getGeneralString, not GeneralString ");
        return null;
    }

    public Date getGeneralizedTime() throws IOException {
        if (this.tag == 24) {
            return this.buffer.getGeneralizedTime(this.data.available());
        }
        f40.m2710f(this.tag, "DerValue.getGeneralizedTime, not a GeneralizedTime: ");
        return null;
    }

    public String getIA5String() throws IOException {
        if (this.tag == 22) {
            return new String(getDataBytes(), "ASCII");
        }
        f40.m2710f(this.tag, "DerValue.getIA5String, not IA5 ");
        return null;
    }

    public int getInteger() throws IOException {
        if (this.tag == 2) {
            return this.buffer.getInteger(this.data.available());
        }
        f40.m2710f(this.tag, "DerValue.getInteger, not an int ");
        return 0;
    }

    public ObjectIdentifier getOID() throws IOException {
        if (this.tag == 6) {
            return new ObjectIdentifier(this.buffer);
        }
        f40.m2710f(this.tag, "DerValue.getOID, not an OID ");
        return null;
    }

    public byte[] getOctetString() throws IOException {
        if (this.tag != 4 && !isConstructed((byte) 4)) {
            f40.m2710f(this.tag, "DerValue.getOctetString, not an Octet String: ");
            return null;
        }
        int i = this.length;
        byte[] bArrAppend = new byte[i];
        if (i != 0) {
            if (this.buffer.read(bArrAppend) != this.length) {
                ca0.m1178j("short read on DerValue buffer");
                return null;
            }
            if (isConstructed()) {
                DerInputStream derInputStream = new DerInputStream(bArrAppend);
                bArrAppend = null;
                while (derInputStream.available() != 0) {
                    bArrAppend = append(bArrAppend, derInputStream.getOctetString());
                }
            }
        }
        return bArrAppend;
    }

    public BigInteger getPositiveBigInteger() throws IOException {
        if (this.tag == 2) {
            return this.buffer.getBigInteger(this.data.available(), true);
        }
        f40.m2710f(this.tag, "DerValue.getBigInteger, not an int ");
        return null;
    }

    public String getPrintableString() throws IOException {
        if (this.tag == 19) {
            return new String(getDataBytes(), "ASCII");
        }
        f40.m2710f(this.tag, "DerValue.getPrintableString, not a string ");
        return null;
    }

    public String getT61String() throws IOException {
        if (this.tag == 20) {
            return new String(getDataBytes(), "ISO-8859-1");
        }
        f40.m2710f(this.tag, "DerValue.getT61String, not T61 ");
        return null;
    }

    public final byte getTag() {
        return this.tag;
    }

    public Date getUTCTime() throws IOException {
        if (this.tag == 23) {
            return this.buffer.getUTCTime(this.data.available());
        }
        f40.m2710f(this.tag, "DerValue.getUTCTime, not a UtcTime: ");
        return null;
    }

    public String getUTF8String() throws IOException {
        if (this.tag == 12) {
            return new String(getDataBytes(), "UTF8");
        }
        f40.m2710f(this.tag, "DerValue.getUTF8String, not UTF-8 ");
        return null;
    }

    public BitArray getUnalignedBitString(boolean z) throws IOException {
        if (z || this.tag == 3) {
            return this.buffer.getUnalignedBitString();
        }
        f40.m2710f(this.tag, "DerValue.getBitString, not a bit string ");
        return null;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isApplication() {
        return (this.tag & TAG_PRIVATE) == 64;
    }

    public boolean isConstructed(byte b) {
        return isConstructed() && (this.tag & 31) == b;
    }

    public boolean isContextSpecific(byte b) {
        return isContextSpecific() && (this.tag & 31) == b;
    }

    public boolean isPrivate() {
        return (this.tag & TAG_PRIVATE) == 192;
    }

    public boolean isUniversal() {
        return (this.tag & TAG_PRIVATE) == 0;
    }

    public int length() {
        return this.length;
    }

    public void resetTag(byte b) {
        this.tag = b;
    }

    public byte[] toByteArray() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        encode(derOutputStream);
        this.data.reset();
        return derOutputStream.toByteArray();
    }

    public DerInputStream toDerInputStream() throws IOException {
        byte b = this.tag;
        if (b == 48 || b == 49) {
            return new DerInputStream(this.buffer);
        }
        f40.m2710f(this.tag, "toDerInputStream rejects tag type ");
        return null;
    }

    public String toString() {
        try {
            String asString = getAsString();
            if (asString != null) {
                return "\"" + asString + "\"";
            }
            byte b = this.tag;
            if (b == 5) {
                return "[DerValue, null]";
            }
            if (b == 6) {
                return "OID." + getOID();
            }
            return "[DerValue, tag = " + ((int) this.tag) + ", length = " + this.length + "]";
        } catch (IOException unused) {
            f40.m2713i("misformatted DER value");
            return null;
        }
    }

    public boolean isConstructed() {
        return (this.tag & 32) == 32;
    }

    public boolean isContextSpecific() {
        return (this.tag & TAG_PRIVATE) == 128;
    }

    public byte[] getBitString() throws IOException {
        if (this.tag == 3) {
            return this.buffer.getBitString();
        }
        f40.m2710f(this.tag, "DerValue.getBitString, not a bit string ");
        return null;
    }

    public BitArray getUnalignedBitString() throws IOException {
        if (this.tag == 3) {
            return this.buffer.getUnalignedBitString();
        }
        f40.m2710f(this.tag, "DerValue.getBitString, not a bit string ");
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DerValue) {
            return equals((DerValue) obj);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    private DerInputStream init(byte b, String str) throws UnsupportedEncodingException {
        String str2;
        this.tag = b;
        if (b == 12) {
            str2 = "UTF8";
        } else if (b == 22 || b == 27) {
            str2 = "ASCII";
        } else if (b == 30) {
            str2 = "UnicodeBigUnmarked";
        } else if (b == 19) {
            str2 = "ASCII";
        } else if (b == 20) {
            str2 = "ISO-8859-1";
        } else {
            f40.m2713i("Unsupported DER string type");
            return null;
        }
        byte[] bytes = str.getBytes(str2);
        this.length = bytes.length;
        DerInputBuffer derInputBuffer = new DerInputBuffer(bytes);
        this.buffer = derInputBuffer;
        DerInputStream derInputStream = new DerInputStream(derInputBuffer);
        derInputStream.mark(Integer.MAX_VALUE);
        return derInputStream;
    }

    public DerValue(byte b, String str) {
        this.data = init(b, str);
    }

    public DerValue(byte b, byte[] bArr) {
        this.tag = b;
        DerInputBuffer derInputBuffer = new DerInputBuffer((byte[]) bArr.clone());
        this.buffer = derInputBuffer;
        this.length = bArr.length;
        DerInputStream derInputStream = new DerInputStream(derInputBuffer);
        this.data = derInputStream;
        derInputStream.mark(Integer.MAX_VALUE);
    }

    public DerValue(String str) {
        byte b;
        for (int i = 0; i < str.length(); i++) {
            if (!isPrintableStringChar(str.charAt(i))) {
                b = tag_UTF8String;
                this.data = init(b, str);
            }
        }
        b = tag_PrintableString;
        this.data = init(b, str);
    }

    public DerValue(byte[] bArr) {
        this.data = init(true, (InputStream) new ByteArrayInputStream(bArr));
    }

    public DerValue(byte[] bArr, int i, int i2) {
        this.data = init(true, (InputStream) new ByteArrayInputStream(bArr, i, i2));
    }

    public DerValue(InputStream inputStream) {
        this.data = init(false, inputStream);
    }
}
