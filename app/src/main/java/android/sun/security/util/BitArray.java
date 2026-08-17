package android.sun.security.util;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class BitArray {
    private static final int BITS_PER_UNIT = 8;
    private static final int BYTES_PER_LINE = 8;
    private static final byte[][] NYBBLE = {new byte[]{48, 48, 48, 48}, new byte[]{48, 48, 48, 49}, new byte[]{48, 48, 49, 48}, new byte[]{48, 48, 49, 49}, new byte[]{48, 49, 48, 48}, new byte[]{48, 49, 48, 49}, new byte[]{48, 49, 49, 48}, new byte[]{48, 49, 49, 49}, new byte[]{49, 48, 48, 48}, new byte[]{49, 48, 48, 49}, new byte[]{49, 48, 49, 48}, new byte[]{49, 48, 49, 49}, new byte[]{49, 49, 48, 48}, new byte[]{49, 49, 48, 49}, new byte[]{49, 49, 49, 48}, new byte[]{49, 49, 49, 49}};
    private int length;
    private byte[] repn;

    public BitArray(int i, byte[] bArr) {
        if (i < 0) {
            f40.m2713i("Negative length for BitArray");
            throw null;
        }
        if (bArr.length * 8 < i) {
            f40.m2713i("Byte array too short to represent bit array of given length");
            throw null;
        }
        this.length = i;
        int i2 = (i + 7) / 8;
        byte b = (byte) (255 << ((i2 * 8) - i));
        byte[] bArr2 = new byte[i2];
        this.repn = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        if (i2 > 0) {
            byte[] bArr3 = this.repn;
            int i3 = i2 - 1;
            bArr3[i3] = (byte) (b & bArr3[i3]);
        }
    }

    private static int position(int i) {
        return 1 << (7 - (i % 8));
    }

    private static int subscript(int i) {
        return i / 8;
    }

    public Object clone() {
        return new BitArray(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        if (bitArray.length != this.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.repn;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != bitArray.repn[i]) {
                return false;
            }
            i++;
        }
    }

    public boolean get(int i) {
        if (i < 0 || i >= this.length) {
            throw new ArrayIndexOutOfBoundsException(Integer.toString(i));
        }
        return (this.repn[subscript(i)] & position(i)) != 0;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.repn;
            if (i >= bArr.length) {
                return this.length ^ i2;
            }
            i2 = (i2 * 31) + bArr[i];
            i++;
        }
    }

    public int length() {
        return this.length;
    }

    public void set(int i, boolean z) {
        if (i < 0 || i >= this.length) {
            throw new ArrayIndexOutOfBoundsException(Integer.toString(i));
        }
        int iSubscript = subscript(i);
        int iPosition = position(i);
        byte[] bArr = this.repn;
        if (z) {
            bArr[iSubscript] = (byte) (iPosition | bArr[iSubscript]);
        } else {
            bArr[iSubscript] = (byte) ((~iPosition) & bArr[iSubscript]);
        }
    }

    public boolean[] toBooleanArray() {
        boolean[] zArr = new boolean[this.length];
        for (int i = 0; i < this.length; i++) {
            zArr[i] = get(i);
        }
        return zArr;
    }

    public byte[] toByteArray() {
        return (byte[]) this.repn.clone();
    }

    public String toString() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            bArr = this.repn;
            if (i >= bArr.length - 1) {
                break;
            }
            byte[][] bArr2 = NYBBLE;
            byteArrayOutputStream.write(bArr2[(bArr[i] >> 4) & 15], 0, 4);
            byteArrayOutputStream.write(bArr2[this.repn[i] & 15], 0, 4);
            if (i % 8 == 7) {
                byteArrayOutputStream.write(10);
            } else {
                byteArrayOutputStream.write(32);
            }
            i++;
        }
        for (int length = (bArr.length - 1) * 8; length < this.length; length++) {
            byteArrayOutputStream.write(get(length) ? 49 : 48);
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public BitArray truncate() {
        for (int i = this.length - 1; i >= 0; i--) {
            if (get(i)) {
                return new BitArray(i + 1, Arrays.copyOf(this.repn, (i + 8) / 8));
            }
        }
        return new BitArray(1);
    }

    public BitArray(int i) {
        if (i >= 0) {
            this.length = i;
            this.repn = new byte[(i + 7) / 8];
        } else {
            f40.m2713i("Negative length for BitArray");
            throw null;
        }
    }

    public BitArray(boolean[] zArr) {
        int length = zArr.length;
        this.length = length;
        this.repn = new byte[(length + 7) / 8];
        for (int i = 0; i < this.length; i++) {
            set(i, zArr[i]);
        }
    }

    private BitArray(BitArray bitArray) {
        this.length = bitArray.length;
        this.repn = (byte[]) bitArray.repn.clone();
    }
}
