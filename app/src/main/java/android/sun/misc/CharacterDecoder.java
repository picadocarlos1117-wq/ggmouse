package android.sun.misc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CharacterDecoder {
    public abstract int bytesPerAtom();

    public abstract int bytesPerLine();

    public void decodeAtom(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i) throws CEStreamExhausted {
        throw new CEStreamExhausted();
    }

    public void decodeBuffer(InputStream inputStream, OutputStream outputStream) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        decodeBufferPrefix(pushbackInputStream, outputStream);
        while (true) {
            try {
                int iDecodeLinePrefix = decodeLinePrefix(pushbackInputStream, outputStream);
                int iBytesPerAtom = 0;
                while (bytesPerAtom() + iBytesPerAtom < iDecodeLinePrefix) {
                    decodeAtom(pushbackInputStream, outputStream, bytesPerAtom());
                    bytesPerAtom();
                    iBytesPerAtom += bytesPerAtom();
                }
                if (bytesPerAtom() + iBytesPerAtom == iDecodeLinePrefix) {
                    decodeAtom(pushbackInputStream, outputStream, bytesPerAtom());
                    bytesPerAtom();
                } else {
                    decodeAtom(pushbackInputStream, outputStream, iDecodeLinePrefix - iBytesPerAtom);
                }
                decodeLineSuffix(pushbackInputStream, outputStream);
            } catch (CEStreamExhausted unused) {
                decodeBufferSuffix(pushbackInputStream, outputStream);
                return;
            }
        }
    }

    public ByteBuffer decodeBufferToByteBuffer(String str) {
        return ByteBuffer.wrap(decodeBuffer(str));
    }

    public int decodeLinePrefix(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
        return bytesPerLine();
    }

    public int readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) i4;
        }
        return i2;
    }

    public ByteBuffer decodeBufferToByteBuffer(InputStream inputStream) {
        return ByteBuffer.wrap(decodeBuffer(inputStream));
    }

    public void decodeBufferPrefix(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
    }

    public void decodeBufferSuffix(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
    }

    public void decodeLineSuffix(PushbackInputStream pushbackInputStream, OutputStream outputStream) {
    }

    public byte[] decodeBuffer(String str) {
        byte[] bArr = new byte[str.length()];
        str.getBytes(0, str.length(), bArr, 0);
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeBuffer(byteArrayInputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] decodeBuffer(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeBuffer(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
