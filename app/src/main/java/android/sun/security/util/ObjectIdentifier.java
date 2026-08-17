package android.sun.security.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectIdentifier implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 8697030238860181294L;
    private int componentLen;
    private Object components;
    private transient boolean componentsCalculated;
    private byte[] encoding;
    private volatile transient String stringForm;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class HugeOidNotSupportedByOldJDK implements Serializable {
        private static final long serialVersionUID = 1;
        static HugeOidNotSupportedByOldJDK theOne = new HugeOidNotSupportedByOldJDK();
    }

    public ObjectIdentifier(String str) throws IOException {
        int iIndexOf;
        String strSubstring;
        int length;
        int iPack7Oid;
        this.encoding = null;
        this.components = null;
        this.componentLen = -1;
        this.componentsCalculated = false;
        byte[] bArr = new byte[str.length()];
        int i = 0;
        int i2 = 0;
        int iIntValue = 0;
        int i3 = 0;
        do {
            try {
                iIndexOf = str.indexOf(46, i);
                if (iIndexOf == -1) {
                    strSubstring = str.substring(i);
                    length = str.length() - i;
                } else {
                    strSubstring = str.substring(i, iIndexOf);
                    length = iIndexOf - i;
                }
                if (length > 9) {
                    BigInteger bigInteger = new BigInteger(strSubstring);
                    if (i2 == 0) {
                        checkFirstComponent(bigInteger);
                        iIntValue = bigInteger.intValue();
                    } else {
                        if (i2 == 1) {
                            checkSecondComponent(iIntValue, bigInteger);
                            bigInteger = bigInteger.add(BigInteger.valueOf(iIntValue * 40));
                        } else {
                            checkOtherComponent(i2, bigInteger);
                        }
                        iPack7Oid = pack7Oid(bigInteger, bArr, i3);
                        i3 += iPack7Oid;
                    }
                } else {
                    int i4 = Integer.parseInt(strSubstring);
                    if (i2 == 0) {
                        checkFirstComponent(i4);
                        iIntValue = i4;
                    } else {
                        if (i2 == 1) {
                            checkSecondComponent(iIntValue, i4);
                            i4 += iIntValue * 40;
                        } else {
                            checkOtherComponent(i2, i4);
                        }
                        iPack7Oid = pack7Oid(i4, bArr, i3);
                        i3 += iPack7Oid;
                    }
                }
                i = iIndexOf + 1;
                i2++;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException("ObjectIdentifier() -- Invalid format: " + e2.toString(), e2);
            }
        } while (iIndexOf != -1);
        checkCount(i2);
        byte[] bArr2 = new byte[i3];
        this.encoding = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        this.stringForm = str;
    }

    private static void check(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (length < 1 || (bArr[length - 1] & DerValue.TAG_CONTEXT) != 0) {
            ca0.m1178j("ObjectIdentifier() -- Invalid DER encoding, not ended");
            return;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] == -128 && (i == 0 || (bArr[i - 1] & DerValue.TAG_CONTEXT) == 0)) {
                ca0.m1178j("ObjectIdentifier() -- Invalid DER encoding, useless extra octet detected");
                return;
            }
        }
    }

    private static void checkCount(int i) throws IOException {
        if (i >= 2) {
            return;
        }
        ca0.m1178j("ObjectIdentifier() -- Must be at least two oid components ");
    }

    private static void checkFirstComponent(BigInteger bigInteger) throws IOException {
        if (bigInteger.signum() == -1 || bigInteger.compareTo(BigInteger.valueOf(2L)) == 1) {
            ca0.m1178j("ObjectIdentifier() -- First oid component is invalid ");
        }
    }

    private static void checkOtherComponent(int i, BigInteger bigInteger) throws IOException {
        if (bigInteger.signum() != -1) {
            return;
        }
        throw new IOException("ObjectIdentifier() -- oid component #" + (i + 1) + " must be non-negative ");
    }

    private static void checkSecondComponent(int i, BigInteger bigInteger) throws IOException {
        if (bigInteger.signum() == -1 || (i != 2 && bigInteger.compareTo(BigInteger.valueOf(39L)) == 1)) {
            ca0.m1178j("ObjectIdentifier() -- Second oid component is invalid ");
        }
    }

    private void init(int[] iArr, int i) {
        byte[] bArr = new byte[(i * 5) + 1];
        int i2 = iArr[1];
        int i3 = iArr[0];
        int iPack7Oid = i2 < Integer.MAX_VALUE - (i3 * 40) ? pack7Oid((i3 * 40) + i2, bArr, 0) : pack7Oid(BigInteger.valueOf(i2).add(BigInteger.valueOf(iArr[0] * 40)), bArr, 0);
        for (int i4 = 2; i4 < i; i4++) {
            iPack7Oid += pack7Oid(iArr[i4], bArr, iPack7Oid);
        }
        byte[] bArr2 = new byte[iPack7Oid];
        this.encoding = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, iPack7Oid);
    }

    public static ObjectIdentifier newInternal(int[] iArr) {
        try {
            return new ObjectIdentifier(iArr);
        } catch (IOException e) {
            ca0.m1184p(e);
            return null;
        }
    }

    private static byte[] pack(byte[] bArr, int i, int i2, int i3, int i4) {
        if (i3 == i4) {
            return (byte[]) bArr.clone();
        }
        int i5 = i2 * i3;
        int i6 = ((i5 + i4) - 1) / i4;
        byte[] bArr2 = new byte[i6];
        int i7 = (i6 * i4) - i5;
        int i8 = 0;
        while (i8 < i5) {
            int i9 = i3 - (i8 % i3);
            int i10 = i4 - (i7 % i4);
            int i11 = i9 > i10 ? i10 : i9;
            int i12 = i7 / i4;
            bArr2[i12] = (byte) (((((bArr[(i8 / i3) + i] + 256) >> (i9 - i11)) & ((1 << i11) - 1)) << (i10 - i11)) | bArr2[i12]);
            i8 += i11;
            i7 += i11;
        }
        return bArr2;
    }

    private static int pack7Oid(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArrPack = pack(bArr, i, i2, 8, 7);
        int length = bArrPack.length - 1;
        for (int length2 = bArrPack.length - 2; length2 >= 0; length2--) {
            byte b = bArrPack[length2];
            if (b != 0) {
                length = length2;
            }
            bArrPack[length2] = (byte) (b | DerValue.TAG_CONTEXT);
        }
        System.arraycopy(bArrPack, length, bArr2, i3, bArrPack.length - length);
        return bArrPack.length - length;
    }

    private static int pack8(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArrPack = pack(bArr, i, i2, 7, 8);
        int length = bArrPack.length - 1;
        for (int length2 = bArrPack.length - 2; length2 >= 0; length2--) {
            if (bArrPack[length2] != 0) {
                length = length2;
            }
        }
        System.arraycopy(bArrPack, length, bArr2, i3, bArrPack.length - length);
        return bArrPack.length - length;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.encoding == null) {
            init((int[]) this.components, this.componentLen);
        }
    }

    private int[] toIntArray() {
        int i;
        int length = this.encoding.length;
        int[] iArrCopyOf = new int[20];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if ((this.encoding[i4] & DerValue.TAG_CONTEXT) == 0) {
                int i5 = (i4 - i3) + 1;
                if (i5 > 4) {
                    BigInteger bigInteger = new BigInteger(pack(this.encoding, i3, i5, 7, 8));
                    if (i3 == 0) {
                        int i6 = i2 + 1;
                        iArrCopyOf[i2] = 2;
                        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.valueOf(80L));
                        if (bigIntegerSubtract.compareTo(BigInteger.valueOf(2147483647L)) == 1) {
                            return null;
                        }
                        i2 += 2;
                        iArrCopyOf[i6] = bigIntegerSubtract.intValue();
                    } else {
                        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) == 1) {
                            return null;
                        }
                        i = i2 + 1;
                        iArrCopyOf[i2] = bigInteger.intValue();
                        i2 = i;
                    }
                } else {
                    int i7 = 0;
                    for (int i8 = i3; i8 <= i4; i8++) {
                        i7 = (i7 << 7) | (this.encoding[i8] & 127);
                    }
                    if (i3 != 0) {
                        i = i2 + 1;
                        iArrCopyOf[i2] = i7;
                        i2 = i;
                    } else if (i7 < 80) {
                        int i9 = i2 + 1;
                        iArrCopyOf[i2] = i7 / 40;
                        i2 += 2;
                        iArrCopyOf[i9] = i7 % 40;
                    } else {
                        int i10 = i2 + 1;
                        iArrCopyOf[i2] = 2;
                        i2 += 2;
                        iArrCopyOf[i10] = i7 - 80;
                    }
                }
                i3 = i4 + 1;
            }
            if (i2 >= iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2 + 10);
            }
        }
        return Arrays.copyOf(iArrCopyOf, i2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (!this.componentsCalculated) {
            int[] intArray = toIntArray();
            if (intArray != null) {
                this.components = intArray;
                this.componentLen = intArray.length;
            } else {
                this.components = HugeOidNotSupportedByOldJDK.theOne;
            }
            this.componentsCalculated = true;
        }
        objectOutputStream.defaultWriteObject();
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.write((byte) 6, this.encoding);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectIdentifier) {
            return Arrays.equals(this.encoding, ((ObjectIdentifier) obj).encoding);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.encoding);
    }

    public String toString() {
        String str = this.stringForm;
        if (str != null) {
            return str;
        }
        int length = this.encoding.length;
        StringBuffer stringBuffer = new StringBuffer(length * 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if ((this.encoding[i2] & DerValue.TAG_CONTEXT) == 0) {
                if (i != 0) {
                    stringBuffer.append('.');
                }
                int i3 = (i2 - i) + 1;
                if (i3 > 4) {
                    BigInteger bigInteger = new BigInteger(pack(this.encoding, i, i3, 7, 8));
                    if (i == 0) {
                        stringBuffer.append("2.");
                        stringBuffer.append(bigInteger.subtract(BigInteger.valueOf(80L)));
                    } else {
                        stringBuffer.append(bigInteger);
                    }
                } else {
                    int i4 = 0;
                    for (int i5 = i; i5 <= i2; i5++) {
                        i4 = (i4 << 7) | (this.encoding[i5] & 127);
                    }
                    if (i != 0) {
                        stringBuffer.append(i4);
                    } else if (i4 < 80) {
                        stringBuffer.append(i4 / 40);
                        stringBuffer.append('.');
                        stringBuffer.append(i4 % 40);
                    } else {
                        stringBuffer.append("2.");
                        stringBuffer.append(i4 - 80);
                    }
                }
                i = i2 + 1;
            }
        }
        String string = stringBuffer.toString();
        this.stringForm = string;
        return string;
    }

    @Deprecated
    public boolean equals(ObjectIdentifier objectIdentifier) {
        return equals((Object) objectIdentifier);
    }

    private static void checkFirstComponent(int i) throws IOException {
        if (i < 0 || i > 2) {
            ca0.m1178j("ObjectIdentifier() -- First oid component is invalid ");
        }
    }

    private static void checkSecondComponent(int i, int i2) throws IOException {
        if (i2 < 0 || (i != 2 && i2 > 39)) {
            ca0.m1178j("ObjectIdentifier() -- Second oid component is invalid ");
        }
    }

    private static void checkOtherComponent(int i, int i2) throws IOException {
        if (i2 >= 0) {
            return;
        }
        throw new IOException("ObjectIdentifier() -- oid component #" + (i + 1) + " must be non-negative ");
    }

    private static int pack7Oid(int i, byte[] bArr, int i2) {
        return pack7Oid(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, 0, 4, bArr, i2);
    }

    private static int pack7Oid(BigInteger bigInteger, byte[] bArr, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        return pack7Oid(byteArray, 0, byteArray.length, bArr, i);
    }

    public ObjectIdentifier(int[] iArr) throws IOException {
        this.encoding = null;
        this.components = null;
        this.componentLen = -1;
        this.componentsCalculated = false;
        checkCount(iArr.length);
        checkFirstComponent(iArr[0]);
        checkSecondComponent(iArr[0], iArr[1]);
        for (int i = 2; i < iArr.length; i++) {
            checkOtherComponent(i, iArr[i]);
        }
        init(iArr, iArr.length);
    }

    public ObjectIdentifier(DerInputStream derInputStream) throws IOException {
        this.encoding = null;
        this.components = null;
        this.componentLen = -1;
        this.componentsCalculated = false;
        byte b = (byte) derInputStream.getByte();
        if (b == 6) {
            byte[] bArr = new byte[derInputStream.getLength()];
            this.encoding = bArr;
            derInputStream.getBytes(bArr);
            check(this.encoding);
            return;
        }
        ca0.m1178j(jd0.m3610h(b, "ObjectIdentifier() -- data isn't an object ID (tag = ", ")"));
        throw null;
    }

    public ObjectIdentifier(DerInputBuffer derInputBuffer) throws IOException {
        this.encoding = null;
        this.components = null;
        this.componentLen = -1;
        this.componentsCalculated = false;
        DerInputStream derInputStream = new DerInputStream(derInputBuffer);
        byte[] bArr = new byte[derInputStream.available()];
        this.encoding = bArr;
        derInputStream.getBytes(bArr);
        check(this.encoding);
    }
}
