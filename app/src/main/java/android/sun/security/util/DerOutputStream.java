package android.sun.security.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DerOutputStream extends ByteArrayOutputStream implements DerEncoder {
    private static ByteArrayLexOrder lexOrder = new ByteArrayLexOrder();
    private static ByteArrayTagOrder tagOrder = new ByteArrayTagOrder();

    public DerOutputStream(int i) {
        super(i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:1: B:21:0x0055->B:22:0x0057, LOOP_END] */
    private void putIntegerContents(int i) throws IOException {
        int i2;
        byte[] bArr = {b, (byte) ((16711680 & i) >>> 16), (byte) ((65280 & i) >>> 8), (byte) (i & 255)};
        byte b = (byte) ((i & (-16777216)) >>> 24);
        int i3 = 0;
        if (b != -1) {
            if (b == 0) {
                i2 = 0;
                while (i3 < 3 && bArr[i3] == 0) {
                    i3++;
                    if ((bArr[i3] & DerValue.TAG_CONTEXT) != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            putLength(4 - i3);
            while (i3 < 4) {
                write(bArr[i3]);
                i3++;
            }
        }
        i2 = 0;
        while (i3 < 3 && bArr[i3] == -1) {
            i3++;
            if ((bArr[i3] & DerValue.TAG_CONTEXT) != 128) {
                break;
            } else {
                i2++;
            }
        }
        i3 = i2;
        putLength(4 - i3);
        while (i3 < 4) {
            write(bArr[i3]);
            i3++;
        }
    }

    private void putOrderedSet(byte b, DerEncoder[] derEncoderArr, Comparator<byte[]> comparator) throws IOException {
        int length = derEncoderArr.length;
        DerOutputStream[] derOutputStreamArr = new DerOutputStream[length];
        for (int i = 0; i < derEncoderArr.length; i++) {
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStreamArr[i] = derOutputStream;
            derEncoderArr[i].derEncode(derOutputStream);
        }
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = derOutputStreamArr[i2].toByteArray();
        }
        Arrays.sort(bArr, comparator);
        DerOutputStream derOutputStream2 = new DerOutputStream();
        for (int i3 = 0; i3 < length; i3++) {
            derOutputStream2.write(bArr[i3]);
        }
        write(b, derOutputStream2);
    }

    private void putTime(Date date, byte b) throws IOException {
        String str;
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (b == 23) {
            str = "yyMMddHHmmss'Z'";
        } else {
            b = DerValue.tag_GeneralizedTime;
            str = "yyyyMMddHHmmss'Z'";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        byte[] bytes = simpleDateFormat.format(date).getBytes("ISO-8859-1");
        write(b);
        putLength(bytes.length);
        write(bytes);
    }

    private void writeString(String str, byte b, String str2) throws IOException {
        byte[] bytes = str.getBytes(str2);
        write(b);
        putLength(bytes.length);
        write(bytes);
    }

    @Override // android.sun.security.util.DerEncoder
    public void derEncode(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    public void putBMPString(String str) throws IOException {
        writeString(str, DerValue.tag_BMPString, "UnicodeBigUnmarked");
    }

    public void putBitString(byte[] bArr) throws IOException {
        write(3);
        putLength(bArr.length + 1);
        write(0);
        write(bArr);
    }

    public void putBoolean(boolean z) throws IOException {
        write(1);
        putLength(1);
        if (z) {
            write(255);
        } else {
            write(0);
        }
    }

    public void putDerValue(DerValue derValue) throws IOException {
        derValue.encode(this);
    }

    public void putEnumerated(int i) throws IOException {
        write(10);
        putIntegerContents(i);
    }

    public void putGeneralString(String str) throws IOException {
        writeString(str, DerValue.tag_GeneralString, "ASCII");
    }

    public void putGeneralizedTime(Date date) throws IOException {
        putTime(date, DerValue.tag_GeneralizedTime);
    }

    public void putIA5String(String str) throws IOException {
        writeString(str, DerValue.tag_IA5String, "ASCII");
    }

    public void putInteger(BigInteger bigInteger) throws IOException {
        write(2);
        byte[] byteArray = bigInteger.toByteArray();
        putLength(byteArray.length);
        write(byteArray, 0, byteArray.length);
    }

    public void putLength(int i) {
        if (i < 128) {
            write((byte) i);
            return;
        }
        if (i < 256) {
            write(-127);
            write((byte) i);
            return;
        }
        if (i < 65536) {
            write(-126);
            write((byte) (i >> 8));
            write((byte) i);
        } else {
            if (i < 16777216) {
                write(-125);
                write((byte) (i >> 16));
                write((byte) (i >> 8));
                write((byte) i);
                return;
            }
            write(-124);
            write((byte) (i >> 24));
            write((byte) (i >> 16));
            write((byte) (i >> 8));
            write((byte) i);
        }
    }

    public void putNull() throws IOException {
        write(5);
        putLength(0);
    }

    public void putOID(ObjectIdentifier objectIdentifier) throws IOException {
        objectIdentifier.encode(this);
    }

    public void putOctetString(byte[] bArr) throws IOException {
        write((byte) 4, bArr);
    }

    public void putOrderedSetOf(byte b, DerEncoder[] derEncoderArr) throws IOException {
        putOrderedSet(b, derEncoderArr, lexOrder);
    }

    public void putPrintableString(String str) throws IOException {
        writeString(str, DerValue.tag_PrintableString, "ASCII");
    }

    public void putSequence(DerValue[] derValueArr) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        for (DerValue derValue : derValueArr) {
            derValue.encode(derOutputStream);
        }
        write((byte) 48, derOutputStream);
    }

    public void putSet(DerValue[] derValueArr) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        for (DerValue derValue : derValueArr) {
            derValue.encode(derOutputStream);
        }
        write((byte) 49, derOutputStream);
    }

    public void putT61String(String str) throws IOException {
        writeString(str, DerValue.tag_T61String, "ISO-8859-1");
    }

    public void putTag(byte b, boolean z, byte b2) throws IOException {
        byte b3 = (byte) (b | b2);
        if (z) {
            b3 = (byte) (b3 | 32);
        }
        write(b3);
    }

    public void putTruncatedUnalignedBitString(BitArray bitArray) throws IOException {
        putUnalignedBitString(bitArray.truncate());
    }

    public void putUTCTime(Date date) throws IOException {
        putTime(date, DerValue.tag_UtcTime);
    }

    public void putUTF8String(String str) throws IOException {
        writeString(str, DerValue.tag_UTF8String, "UTF8");
    }

    public void putUnalignedBitString(BitArray bitArray) throws IOException {
        byte[] byteArray = bitArray.toByteArray();
        write(3);
        putLength(byteArray.length + 1);
        write((byteArray.length * 8) - bitArray.length());
        write(byteArray);
    }

    public void write(byte b, DerOutputStream derOutputStream) throws IOException {
        write(b);
        putLength(((ByteArrayOutputStream) derOutputStream).count);
        write(((ByteArrayOutputStream) derOutputStream).buf, 0, ((ByteArrayOutputStream) derOutputStream).count);
    }

    public void writeImplicit(byte b, DerOutputStream derOutputStream) throws IOException {
        write(b);
        write(((ByteArrayOutputStream) derOutputStream).buf, 1, ((ByteArrayOutputStream) derOutputStream).count - 1);
    }

    public DerOutputStream() {
    }

    public void write(byte b, byte[] bArr) throws IOException {
        write(b);
        putLength(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public void putInteger(Integer num) throws IOException {
        putInteger(num.intValue());
    }

    public void putInteger(int i) throws IOException {
        write(2);
        putIntegerContents(i);
    }

    public void putOrderedSet(byte b, DerEncoder[] derEncoderArr) throws IOException {
        putOrderedSet(b, derEncoderArr, tagOrder);
    }
}
