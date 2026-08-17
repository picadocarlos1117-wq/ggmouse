package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class k70 extends InputStream implements DataInput {

    /* JADX INFO: renamed from: e */
    public static final ByteOrder f5686e = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: f */
    public static final ByteOrder f5687f = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: a */
    public final DataInputStream f5688a;

    /* JADX INFO: renamed from: b */
    public ByteOrder f5689b;

    /* JADX INFO: renamed from: c */
    public int f5690c;

    /* JADX INFO: renamed from: d */
    public byte[] f5691d;

    public k70(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f5689b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f5688a = dataInputStream;
        dataInputStream.mark(0);
        this.f5690c = 0;
        this.f5689b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f5688a.available();
    }

    /* JADX INFO: renamed from: c */
    public final void m3809c(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f5688a;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f5691d == null) {
                    this.f5691d = new byte[PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE];
                }
                iSkip = dataInputStream.read(this.f5691d, 0, Math.min(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE, i3));
                if (iSkip == -1) {
                    throw new EOFException(jd0.m3610h(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f5690c += i2;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f5690c++;
        return this.f5688a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f5690c++;
        return this.f5688a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f5690c++;
        int i = this.f5688a.read();
        if (i >= 0) {
            return (byte) i;
        }
        f40.m2708d();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f5690c += 2;
        return this.f5688a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f5690c += bArr.length;
        this.f5688a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f5690c += 4;
        DataInputStream dataInputStream = this.f5688a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            f40.m2708d();
            return 0;
        }
        ByteOrder byteOrder = this.f5689b;
        if (byteOrder == f5686e) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f5687f) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        lv1.m4305q(this.f5689b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f5690c += 8;
        DataInputStream dataInputStream = this.f5688a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            f40.m2708d();
            return 0L;
        }
        ByteOrder byteOrder = this.f5689b;
        if (byteOrder == f5686e) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == f5687f) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        lv1.m4305q(this.f5689b, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f5690c += 2;
        DataInputStream dataInputStream = this.f5688a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            f40.m2708d();
            return (short) 0;
        }
        ByteOrder byteOrder = this.f5689b;
        if (byteOrder == f5686e) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == f5687f) {
            return (short) ((i << 8) + i2);
        }
        lv1.m4305q(this.f5689b, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f5690c += 2;
        return this.f5688a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f5690c++;
        return this.f5688a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f5690c += 2;
        DataInputStream dataInputStream = this.f5688a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            f40.m2708d();
            return 0;
        }
        ByteOrder byteOrder = this.f5689b;
        if (byteOrder == f5686e) {
            return (i2 << 8) + i;
        }
        if (byteOrder == f5687f) {
            return (i << 8) + i2;
        }
        lv1.m4305q(this.f5689b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f5690c += i2;
        this.f5688a.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f5688a.read(bArr, i, i2);
        this.f5690c += i3;
        return i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k70(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public k70(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }
}
