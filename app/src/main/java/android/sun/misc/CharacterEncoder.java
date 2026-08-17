package android.sun.misc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CharacterEncoder {
    protected PrintStream pStream;

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    private byte[] getBytes(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            if (bArrArray.length == byteBuffer.capacity() && bArrArray.length == byteBuffer.remaining()) {
                byteBuffer.position(byteBuffer.limit());
            } else {
                bArrArray = null;
            }
        } else {
            bArrArray = null;
        }
        if (bArrArray != null) {
            return bArrArray;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public abstract int bytesPerAtom();

    public abstract int bytesPerLine();

    public void encode(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[bytesPerLine()];
        encodeBufferPrefix(outputStream);
        while (true) {
            int fully = readFully(inputStream, bArr);
            if (fully == 0) {
                break;
            }
            encodeLinePrefix(outputStream, fully);
            int iBytesPerAtom = 0;
            while (iBytesPerAtom < fully) {
                if (bytesPerAtom() + iBytesPerAtom <= fully) {
                    encodeAtom(outputStream, bArr, iBytesPerAtom, bytesPerAtom());
                } else {
                    encodeAtom(outputStream, bArr, iBytesPerAtom, fully - iBytesPerAtom);
                }
                iBytesPerAtom += bytesPerAtom();
            }
            if (fully < bytesPerLine()) {
                break;
            } else {
                encodeLineSuffix(outputStream);
            }
        }
        encodeBufferSuffix(outputStream);
    }

    public abstract void encodeAtom(OutputStream outputStream, byte[] bArr, int i, int i2);

    public void encodeBuffer(InputStream inputStream, OutputStream outputStream) throws IOException {
        int fully;
        byte[] bArr = new byte[bytesPerLine()];
        encodeBufferPrefix(outputStream);
        do {
            fully = readFully(inputStream, bArr);
            if (fully == 0) {
                break;
            }
            encodeLinePrefix(outputStream, fully);
            int iBytesPerAtom = 0;
            while (iBytesPerAtom < fully) {
                if (bytesPerAtom() + iBytesPerAtom <= fully) {
                    encodeAtom(outputStream, bArr, iBytesPerAtom, bytesPerAtom());
                } else {
                    encodeAtom(outputStream, bArr, iBytesPerAtom, fully - iBytesPerAtom);
                }
                iBytesPerAtom += bytesPerAtom();
            }
            encodeLineSuffix(outputStream);
        } while (fully >= bytesPerLine());
        encodeBufferSuffix(outputStream);
    }

    public void encodeBufferPrefix(OutputStream outputStream) {
        this.pStream = new PrintStream(outputStream);
    }

    public void encodeLineSuffix(OutputStream outputStream) {
        this.pStream.println();
    }

    public int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return i;
            }
            bArr[i] = (byte) i2;
        }
        return bArr.length;
    }

    public void encodeBufferSuffix(OutputStream outputStream) {
    }

    public void encodeLinePrefix(OutputStream outputStream, int i) {
    }

    public void encodeBuffer(byte[] bArr, OutputStream outputStream) throws IOException {
        encodeBuffer(new ByteArrayInputStream(bArr), outputStream);
    }

    public void encode(byte[] bArr, OutputStream outputStream) throws IOException {
        encode(new ByteArrayInputStream(bArr), outputStream);
    }

    public String encodeBuffer(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encodeBuffer(new ByteArrayInputStream(bArr), byteArrayOutputStream);
            return byteArrayOutputStream.toString();
        } catch (Exception unused) {
            throw new Error("CharacterEncoder.encodeBuffer internal error");
        }
    }

    public String encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(new ByteArrayInputStream(bArr), byteArrayOutputStream);
            return byteArrayOutputStream.toString("8859_1");
        } catch (Exception unused) {
            throw new Error("CharacterEncoder.encode internal error");
        }
    }

    public void encodeBuffer(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        encodeBuffer(getBytes(byteBuffer), outputStream);
    }

    public void encode(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        encode(getBytes(byteBuffer), outputStream);
    }

    public String encodeBuffer(ByteBuffer byteBuffer) {
        return encodeBuffer(getBytes(byteBuffer));
    }

    public String encode(ByteBuffer byteBuffer) {
        return encode(getBytes(byteBuffer));
    }
}
