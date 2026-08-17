package android.sun.security.util;

import java.io.IOException;
import java.util.ArrayList;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class DerIndefLenConverter {
    private static final int CLASS_MASK = 192;
    private static final int FORM_MASK = 32;
    private static final int LEN_LONG = 128;
    private static final int LEN_MASK = 127;
    private static final int SKIP_EOC_BYTES = 2;
    private static final int TAG_MASK = 31;
    private byte[] data;
    private int dataPos;
    private int dataSize;
    private int index;
    private byte[] newData;
    private int newDataPos;
    private int unresolved = 0;
    private ArrayList<Object> ndefsList = new ArrayList<>();
    private int numOfTotalLenBytes = 0;

    private byte[] getLengthBytes(int i) {
        if (i < 128) {
            return new byte[]{(byte) i};
        }
        if (i < 256) {
            return new byte[]{-127, (byte) i};
        }
        if (i < 65536) {
            return new byte[]{-126, (byte) (i >> 8), (byte) i};
        }
        return i < 16777216 ? new byte[]{-125, (byte) (i >> 16), (byte) (i >> 8), (byte) i} : new byte[]{-124, (byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    private int getNumOfLenBytes(int i) {
        if (i < 128) {
            return 1;
        }
        if (i < 256) {
            return 2;
        }
        if (i < 65536) {
            return 3;
        }
        return i < 16777216 ? 4 : 5;
    }

    private boolean isEOC(int i) {
        return (i & 31) == 0 && (i & 32) == 0 && (i & CLASS_MASK) == 0;
    }

    public static boolean isIndefinite(int i) {
        return isLongForm(i) && (i & 127) == 0;
    }

    public static boolean isLongForm(int i) {
        return (i & 128) == 128;
    }

    private int parseLength() throws IOException {
        int i = this.dataPos;
        if (i == this.dataSize) {
            return 0;
        }
        byte[] bArr = this.data;
        this.dataPos = i + 1;
        byte b = bArr[i];
        int i2 = b & 255;
        if (isIndefinite(i2)) {
            this.ndefsList.add(new Integer(this.dataPos));
            this.unresolved++;
            return 0;
        }
        if (!isLongForm(i2)) {
            return b & 127;
        }
        int i3 = b & 127;
        if (i3 > 4) {
            ca0.m1178j("Too much data");
            return 0;
        }
        if (this.dataSize - this.dataPos < i3 + 1) {
            ca0.m1178j("Too little data");
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte[] bArr2 = this.data;
            int i6 = this.dataPos;
            this.dataPos = i6 + 1;
            i4 = (i4 << 8) + (bArr2[i6] & 255);
        }
        return i4;
    }

    private void parseTag() throws IOException {
        int i = this.dataPos;
        if (i == this.dataSize) {
            return;
        }
        if (isEOC(this.data[i]) && this.data[this.dataPos + 1] == 0) {
            int size = this.ndefsList.size() - 1;
            int length = 0;
            Object obj = null;
            while (size >= 0) {
                obj = this.ndefsList.get(size);
                if (obj instanceof Integer) {
                    break;
                }
                length += ((byte[]) obj).length - 3;
                size--;
            }
            if (size < 0) {
                ca0.m1178j("EOC does not have matching indefinite-length tag");
                return;
            }
            byte[] lengthBytes = getLengthBytes((this.dataPos - ((Integer) obj).intValue()) + length);
            this.ndefsList.set(size, lengthBytes);
            this.unresolved--;
            this.numOfTotalLenBytes = (lengthBytes.length - 3) + this.numOfTotalLenBytes;
        }
        this.dataPos++;
    }

    private void parseValue(int i) {
        this.dataPos += i;
    }

    private void writeLength(int i) {
        if (i < 128) {
            byte[] bArr = this.newData;
            int i2 = this.newDataPos;
            this.newDataPos = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        if (i < 256) {
            byte[] bArr2 = this.newData;
            int i3 = this.newDataPos;
            int i4 = i3 + 1;
            this.newDataPos = i4;
            bArr2[i3] = -127;
            this.newDataPos = i3 + 2;
            bArr2[i4] = (byte) i;
            return;
        }
        if (i < 65536) {
            byte[] bArr3 = this.newData;
            int i5 = this.newDataPos;
            int i6 = i5 + 1;
            this.newDataPos = i6;
            bArr3[i5] = -126;
            int i7 = i5 + 2;
            this.newDataPos = i7;
            bArr3[i6] = (byte) (i >> 8);
            this.newDataPos = i5 + 3;
            bArr3[i7] = (byte) i;
            return;
        }
        byte[] bArr4 = this.newData;
        if (i < 16777216) {
            int i8 = this.newDataPos;
            int i9 = i8 + 1;
            this.newDataPos = i9;
            bArr4[i8] = -125;
            int i10 = i8 + 2;
            this.newDataPos = i10;
            bArr4[i9] = (byte) (i >> 16);
            int i11 = i8 + 3;
            this.newDataPos = i11;
            bArr4[i10] = (byte) (i >> 8);
            this.newDataPos = i8 + 4;
            bArr4[i11] = (byte) i;
            return;
        }
        int i12 = this.newDataPos;
        int i13 = i12 + 1;
        this.newDataPos = i13;
        bArr4[i12] = -124;
        int i14 = i12 + 2;
        this.newDataPos = i14;
        bArr4[i13] = (byte) (i >> 24);
        int i15 = i12 + 3;
        this.newDataPos = i15;
        bArr4[i14] = (byte) (i >> 16);
        int i16 = i12 + 4;
        this.newDataPos = i16;
        bArr4[i15] = (byte) (i >> 8);
        this.newDataPos = i12 + 5;
        bArr4[i16] = (byte) i;
    }

    private void writeLengthAndValue() {
        int i;
        int i2 = this.dataPos;
        if (i2 == this.dataSize) {
            return;
        }
        byte[] bArr = this.data;
        this.dataPos = i2 + 1;
        byte b = bArr[i2];
        int i3 = b & 255;
        if (isIndefinite(i3)) {
            ArrayList<Object> arrayList = this.ndefsList;
            int i4 = this.index;
            this.index = i4 + 1;
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, this.newData, this.newDataPos, bArr2.length);
            this.newDataPos += bArr2.length;
            return;
        }
        if (isLongForm(i3)) {
            int i5 = b & 127;
            i = 0;
            for (int i6 = 0; i6 < i5; i6++) {
                byte[] bArr3 = this.data;
                int i7 = this.dataPos;
                this.dataPos = i7 + 1;
                i = (i << 8) + (bArr3[i7] & 255);
            }
        } else {
            i = b & 127;
        }
        writeLength(i);
        writeValue(i);
    }

    private void writeTag() {
        int i = this.dataPos;
        if (i == this.dataSize) {
            return;
        }
        byte[] bArr = this.data;
        this.dataPos = i + 1;
        byte b = bArr[i];
        if (isEOC(b)) {
            byte[] bArr2 = this.data;
            int i2 = this.dataPos;
            if (bArr2[i2] == 0) {
                this.dataPos = i2 + 1;
                writeTag();
                return;
            }
        }
        byte[] bArr3 = this.newData;
        int i3 = this.newDataPos;
        this.newDataPos = i3 + 1;
        bArr3[i3] = b;
    }

    private void writeValue(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = this.newData;
            int i3 = this.newDataPos;
            this.newDataPos = i3 + 1;
            byte[] bArr2 = this.data;
            int i4 = this.dataPos;
            this.dataPos = i4 + 1;
            bArr[i3] = bArr2[i4];
        }
    }

    public byte[] convert(byte[] bArr) throws IOException {
        int i;
        this.data = bArr;
        this.dataPos = 0;
        this.index = 0;
        this.dataSize = bArr.length;
        while (true) {
            if (this.dataPos >= this.dataSize) {
                i = 0;
                break;
            }
            parseTag();
            parseValue(parseLength());
            if (this.unresolved == 0) {
                int i2 = this.dataSize;
                int i3 = this.dataPos;
                i = i2 - i3;
                this.dataSize = i3;
                break;
            }
        }
        this.newData = new byte[this.dataSize + this.numOfTotalLenBytes + i];
        this.dataPos = 0;
        this.newDataPos = 0;
        this.index = 0;
        while (true) {
            int i4 = this.dataPos;
            int i5 = this.dataSize;
            if (i4 >= i5) {
                System.arraycopy(bArr, i5, this.newData, this.numOfTotalLenBytes + i5, i);
                return this.newData;
            }
            writeTag();
            writeLengthAndValue();
        }
    }
}
