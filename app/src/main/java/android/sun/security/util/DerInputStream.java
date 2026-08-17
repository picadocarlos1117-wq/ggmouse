package android.sun.security.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Vector;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DerInputStream {
    DerInputBuffer buffer;
    public byte tag;

    public DerInputStream(DerInputBuffer derInputBuffer) {
        this.buffer = derInputBuffer;
        derInputBuffer.mark(Integer.MAX_VALUE);
    }

    public static int getLength(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        if (i2 == 0) {
            return -1;
        }
        if (i2 < 0 || i2 > 4) {
            StringBuilder sbM5343j = AbstractC1308pu.m5343j(i2, "DerInputStream.getLength(): lengthTag=", ", ");
            sbM5343j.append(i2 < 0 ? "incorrect DER encoding." : "too big.");
            throw new IOException(sbM5343j.toString());
        }
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 8) + (inputStream.read() & 255);
            i2--;
        }
        return i3;
    }

    private void init(byte[] bArr, int i, int i2) throws IOException {
        if (i + 2 > bArr.length || i + i2 > bArr.length) {
            ca0.m1178j("Encoding bytes too short");
            return;
        }
        if (DerIndefLenConverter.isIndefinite(bArr[i + 1])) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            this.buffer = new DerInputBuffer(new DerIndefLenConverter().convert(bArr2));
        } else {
            this.buffer = new DerInputBuffer(bArr, i, i2);
        }
        this.buffer.mark(Integer.MAX_VALUE);
    }

    private String readString(byte b, String str, String str2) throws IOException {
        if (this.buffer.read() != b) {
            ca0.m1178j(jd0.m3615m("DER input not a ", str, " string"));
            return null;
        }
        int length = getLength(this.buffer);
        byte[] bArr = new byte[length];
        if (length == 0 || this.buffer.read(bArr) == length) {
            return new String(bArr, str2);
        }
        ca0.m1178j(jd0.m3615m("short read of DER ", str, " string"));
        return null;
    }

    public int available() {
        return this.buffer.available();
    }

    public String getBMPString() {
        return readString(DerValue.tag_BMPString, "BMP", "UnicodeBigUnmarked");
    }

    public BigInteger getBigInteger() throws IOException {
        if (this.buffer.read() == 2) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getBigInteger(getLength(derInputBuffer), false);
        }
        ca0.m1178j("DER input, Integer tag error");
        return null;
    }

    public byte[] getBitString() throws IOException {
        if (this.buffer.read() == 3) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getBitString(getLength(derInputBuffer));
        }
        ca0.m1178j("DER input not an bit string");
        return null;
    }

    public int getByte() {
        return this.buffer.read() & 255;
    }

    public void getBytes(byte[] bArr) throws IOException {
        if (bArr.length == 0 || this.buffer.read(bArr) == bArr.length) {
            return;
        }
        ca0.m1178j("short read of DER octet string");
    }

    public DerValue getDerValue() {
        return new DerValue(this.buffer);
    }

    public int getEnumerated() throws IOException {
        if (this.buffer.read() == 10) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getInteger(getLength(derInputBuffer));
        }
        ca0.m1178j("DER input, Enumerated tag error");
        return 0;
    }

    public String getGeneralString() {
        return readString(DerValue.tag_GeneralString, "General", "ASCII");
    }

    public Date getGeneralizedTime() throws IOException {
        if (this.buffer.read() == 24) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getGeneralizedTime(getLength(derInputBuffer));
        }
        ca0.m1178j("DER input, GeneralizedTime tag invalid ");
        return null;
    }

    public String getIA5String() {
        return readString(DerValue.tag_IA5String, "IA5", "ASCII");
    }

    public int getInteger() throws IOException {
        if (this.buffer.read() == 2) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getInteger(getLength(derInputBuffer));
        }
        ca0.m1178j("DER input, Integer tag error");
        return 0;
    }

    public void getNull() throws IOException {
        if (this.buffer.read() == 5 && this.buffer.read() == 0) {
            return;
        }
        ca0.m1178j("getNull, bad data");
    }

    public ObjectIdentifier getOID() {
        return new ObjectIdentifier(this);
    }

    public byte[] getOctetString() throws IOException {
        if (this.buffer.read() != 4) {
            ca0.m1178j("DER input not an octet string");
            return null;
        }
        int length = getLength(this.buffer);
        byte[] bArr = new byte[length];
        if (length == 0 || this.buffer.read(bArr) == length) {
            return bArr;
        }
        ca0.m1178j("short read of DER octet string");
        return null;
    }

    public BigInteger getPositiveBigInteger() throws IOException {
        if (this.buffer.read() == 2) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getBigInteger(getLength(derInputBuffer), true);
        }
        ca0.m1178j("DER input, Integer tag error");
        return null;
    }

    public String getPrintableString() {
        return readString(DerValue.tag_PrintableString, "Printable", "ASCII");
    }

    public DerValue[] getSequence(int i) throws IOException {
        byte b = (byte) this.buffer.read();
        this.tag = b;
        if (b == 48) {
            return readVector(i);
        }
        ca0.m1178j("Sequence tag error");
        return null;
    }

    public DerValue[] getSet(int i, boolean z) throws IOException {
        byte b = (byte) this.buffer.read();
        this.tag = b;
        if (z || b == 49) {
            return readVector(i);
        }
        ca0.m1178j("Set tag error");
        return null;
    }

    public String getT61String() {
        return readString(DerValue.tag_T61String, "T61", "ISO-8859-1");
    }

    public Date getUTCTime() throws IOException {
        if (this.buffer.read() == 23) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getUTCTime(getLength(derInputBuffer));
        }
        ca0.m1178j("DER input, UTCtime tag invalid ");
        return null;
    }

    public String getUTF8String() {
        return readString(DerValue.tag_UTF8String, "UTF-8", "UTF8");
    }

    public BitArray getUnalignedBitString() throws IOException {
        if (this.buffer.read() != 3) {
            ca0.m1178j("DER input not a bit string");
            return null;
        }
        int length = getLength(this.buffer) - 1;
        int i = (length * 8) - this.buffer.read();
        byte[] bArr = new byte[length];
        if (length == 0 || this.buffer.read(bArr) == length) {
            return new BitArray(i, bArr);
        }
        ca0.m1178j("short read of DER bit string");
        return null;
    }

    public void mark(int i) {
        this.buffer.mark(i);
    }

    public int peekByte() {
        return this.buffer.peek();
    }

    public DerValue[] readVector(int i) throws IOException {
        byte b = (byte) this.buffer.read();
        int length = getLength(b & 255, this.buffer);
        if (length == -1) {
            int iAvailable = this.buffer.available();
            byte[] bArr = new byte[iAvailable + 2];
            bArr[0] = this.tag;
            bArr[1] = b;
            DataInputStream dataInputStream = new DataInputStream(this.buffer);
            dataInputStream.readFully(bArr, 2, iAvailable);
            dataInputStream.close();
            DerInputBuffer derInputBuffer = new DerInputBuffer(new DerIndefLenConverter().convert(bArr));
            this.buffer = derInputBuffer;
            if (this.tag != derInputBuffer.read()) {
                ca0.m1178j("Indefinite length encoding not supported");
                return null;
            }
            length = getLength(this.buffer);
        }
        if (length == 0) {
            return new DerValue[0];
        }
        if (this.buffer.available() != length) {
            this = subStream(length, true);
        }
        Vector vector = new Vector(i);
        do {
            vector.addElement(new DerValue(this.buffer));
        } while (this.available() > 0);
        if (this.available() != 0) {
            ca0.m1178j("extra data at end of vector");
            return null;
        }
        int size = vector.size();
        DerValue[] derValueArr = new DerValue[size];
        for (int i2 = 0; i2 < size; i2++) {
            derValueArr[i2] = (DerValue) vector.elementAt(i2);
        }
        return derValueArr;
    }

    public void reset() {
        this.buffer.reset();
    }

    public DerInputStream subStream(int i, boolean z) throws IOException {
        DerInputBuffer derInputBufferDup = this.buffer.dup();
        derInputBufferDup.truncate(i);
        if (z) {
            this.buffer.skip(i);
        }
        return new DerInputStream(derInputBufferDup);
    }

    public byte[] toByteArray() {
        return this.buffer.toByteArray();
    }

    public DerInputStream(byte[] bArr, int i, int i2) throws IOException {
        init(bArr, i, i2);
    }

    public DerInputStream(byte[] bArr) throws IOException {
        init(bArr, 0, bArr.length);
    }

    public DerValue[] getSet(int i) throws IOException {
        byte b = (byte) this.buffer.read();
        this.tag = b;
        if (b == 49) {
            return readVector(i);
        }
        ca0.m1178j("Set tag error");
        return null;
    }

    public static int getLength(InputStream inputStream) {
        return getLength(inputStream.read(), inputStream);
    }

    public int getLength() {
        return getLength(this.buffer);
    }
}
