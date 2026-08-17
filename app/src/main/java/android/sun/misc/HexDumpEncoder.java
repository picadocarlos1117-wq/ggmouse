package android.sun.misc;

import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class HexDumpEncoder extends CharacterEncoder {
    private int currentByte;
    private int offset;
    private byte[] thisLine = new byte[16];
    private int thisLineLength;

    public static void hexDigit(PrintStream printStream, byte b) {
        char c = (char) ((b >> 4) & 15);
        printStream.write((char) (c > '\t' ? c + '7' : c + '0'));
        char c2 = (char) (b & 15);
        printStream.write((char) (c2 > '\t' ? c2 + '7' : c2 + '0'));
    }

    @Override // android.sun.misc.CharacterEncoder
    public int bytesPerAtom() {
        return 1;
    }

    @Override // android.sun.misc.CharacterEncoder
    public int bytesPerLine() {
        return 16;
    }

    @Override // android.sun.misc.CharacterEncoder
    public void encodeAtom(OutputStream outputStream, byte[] bArr, int i, int i2) {
        this.thisLine[this.currentByte] = bArr[i];
        hexDigit(this.pStream, bArr[i]);
        this.pStream.print(" ");
        int i3 = this.currentByte + 1;
        this.currentByte = i3;
        if (i3 == 8) {
            this.pStream.print("  ");
        }
    }

    @Override // android.sun.misc.CharacterEncoder
    public void encodeBufferPrefix(OutputStream outputStream) {
        this.offset = 0;
        super.encodeBufferPrefix(outputStream);
    }

    @Override // android.sun.misc.CharacterEncoder
    public void encodeLinePrefix(OutputStream outputStream, int i) {
        hexDigit(this.pStream, (byte) ((this.offset >>> 8) & 255));
        hexDigit(this.pStream, (byte) (this.offset & 255));
        this.pStream.print(": ");
        this.currentByte = 0;
        this.thisLineLength = i;
    }

    @Override // android.sun.misc.CharacterEncoder
    public void encodeLineSuffix(OutputStream outputStream) {
        int i = this.thisLineLength;
        if (i < 16) {
            while (i < 16) {
                this.pStream.print("   ");
                if (i == 7) {
                    this.pStream.print("  ");
                }
                i++;
            }
        }
        this.pStream.print(" ");
        for (int i2 = 0; i2 < this.thisLineLength; i2++) {
            byte b = this.thisLine[i2];
            if (b < 32 || b > 122) {
                this.pStream.print(".");
            } else {
                this.pStream.write(b);
            }
        }
        this.pStream.println();
        this.offset += this.thisLineLength;
    }
}
