package android.sun.security.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import p000.ca0;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class DerInputBuffer extends ByteArrayInputStream implements Cloneable {
    public DerInputBuffer(byte[] bArr) {
        super(bArr);
    }

    private Date getTime(int i, boolean z) throws IOException {
        String str;
        int iDigit;
        int i2;
        int i3;
        int i4;
        int iDigit2;
        byte[] bArr;
        int iDigit3;
        byte[] bArr2 = ((ByteArrayInputStream) this).buf;
        if (z) {
            int i5 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i5 + 1;
            int iDigit4 = Character.digit((char) bArr2[i5], 10) * 1000;
            byte[] bArr3 = ((ByteArrayInputStream) this).buf;
            int i6 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i6 + 1;
            int iDigit5 = (Character.digit((char) bArr3[i6], 10) * 100) + iDigit4;
            byte[] bArr4 = ((ByteArrayInputStream) this).buf;
            int i7 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i7 + 1;
            int iDigit6 = (Character.digit((char) bArr4[i7], 10) * 10) + iDigit5;
            byte[] bArr5 = ((ByteArrayInputStream) this).buf;
            int i8 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i8 + 1;
            iDigit = Character.digit((char) bArr5[i8], 10) + iDigit6;
            i2 = i - 2;
            str = "Generalized";
        } else {
            int i9 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i9 + 1;
            int iDigit7 = Character.digit((char) bArr2[i9], 10) * 10;
            byte[] bArr6 = ((ByteArrayInputStream) this).buf;
            int i10 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i10 + 1;
            int iDigit8 = Character.digit((char) bArr6[i10], 10) + iDigit7;
            str = "UTC";
            iDigit = iDigit8 < 50 ? iDigit8 + 2000 : iDigit8 + 1900;
            i2 = i;
        }
        String str2 = str;
        int i11 = iDigit;
        byte[] bArr7 = ((ByteArrayInputStream) this).buf;
        int i12 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i12 + 1;
        int iDigit9 = Character.digit((char) bArr7[i12], 10) * 10;
        byte[] bArr8 = ((ByteArrayInputStream) this).buf;
        int i13 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i13 + 1;
        int iDigit10 = Character.digit((char) bArr8[i13], 10) + iDigit9;
        byte[] bArr9 = ((ByteArrayInputStream) this).buf;
        int i14 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i14 + 1;
        int iDigit11 = Character.digit((char) bArr9[i14], 10) * 10;
        byte[] bArr10 = ((ByteArrayInputStream) this).buf;
        int i15 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i15 + 1;
        int iDigit12 = Character.digit((char) bArr10[i15], 10) + iDigit11;
        byte[] bArr11 = ((ByteArrayInputStream) this).buf;
        int i16 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i16 + 1;
        int iDigit13 = Character.digit((char) bArr11[i16], 10) * 10;
        byte[] bArr12 = ((ByteArrayInputStream) this).buf;
        int i17 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i17 + 1;
        int iDigit14 = Character.digit((char) bArr12[i17], 10) + iDigit13;
        byte[] bArr13 = ((ByteArrayInputStream) this).buf;
        int i18 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i18 + 1;
        int iDigit15 = Character.digit((char) bArr13[i18], 10) * 10;
        byte[] bArr14 = ((ByteArrayInputStream) this).buf;
        int i19 = ((ByteArrayInputStream) this).pos;
        ((ByteArrayInputStream) this).pos = i19 + 1;
        int iDigit16 = Character.digit((char) bArr14[i19], 10) + iDigit15;
        int i20 = i2 - 10;
        byte b = 90;
        if (i20 <= 2 || i20 >= 12) {
            i3 = i20;
            i4 = 0;
            iDigit2 = 0;
        } else {
            byte[] bArr15 = ((ByteArrayInputStream) this).buf;
            int i21 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i21 + 1;
            int iDigit17 = Character.digit((char) bArr15[i21], 10) * 10;
            byte[] bArr16 = ((ByteArrayInputStream) this).buf;
            int i22 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i22 + 1;
            iDigit2 = Character.digit((char) bArr16[i22], 10) + iDigit17;
            int i23 = i2 - 12;
            byte[] bArr17 = ((ByteArrayInputStream) this).buf;
            int i24 = ((ByteArrayInputStream) this).pos;
            byte b2 = bArr17[i24];
            if (b2 == 46 || b2 == 44) {
                int i25 = i2 - 13;
                int i26 = i24 + 1;
                ((ByteArrayInputStream) this).pos = i26;
                int i27 = 0;
                while (true) {
                    bArr = ((ByteArrayInputStream) this).buf;
                    byte b3 = bArr[i26];
                    if (b3 == b || b3 == 43 || b3 == 45) {
                        break;
                    }
                    i26++;
                    i27++;
                    b = 90;
                }
                if (i27 == 1) {
                    int i28 = ((ByteArrayInputStream) this).pos;
                    ((ByteArrayInputStream) this).pos = i28 + 1;
                    iDigit3 = Character.digit((char) bArr[i28], 10) * 100;
                } else if (i27 == 2) {
                    int i29 = ((ByteArrayInputStream) this).pos;
                    ((ByteArrayInputStream) this).pos = i29 + 1;
                    int iDigit18 = Character.digit((char) bArr[i29], 10) * 100;
                    byte[] bArr18 = ((ByteArrayInputStream) this).buf;
                    int i30 = ((ByteArrayInputStream) this).pos;
                    ((ByteArrayInputStream) this).pos = i30 + 1;
                    iDigit3 = (Character.digit((char) bArr18[i30], 10) * 10) + iDigit18;
                } else {
                    if (i27 != 3) {
                        ca0.m1178j(jd0.m3615m("Parse ", str2, " time, unsupported precision for seconds value"));
                        return null;
                    }
                    int i31 = ((ByteArrayInputStream) this).pos;
                    ((ByteArrayInputStream) this).pos = i31 + 1;
                    int iDigit19 = Character.digit((char) bArr[i31], 10) * 100;
                    byte[] bArr19 = ((ByteArrayInputStream) this).buf;
                    int i32 = ((ByteArrayInputStream) this).pos;
                    ((ByteArrayInputStream) this).pos = i32 + 1;
                    int iDigit20 = (Character.digit((char) bArr19[i32], 10) * 10) + iDigit19;
                    byte[] bArr20 = ((ByteArrayInputStream) this).buf;
                    int i33 = ((ByteArrayInputStream) this).pos;
                    ((ByteArrayInputStream) this).pos = i33 + 1;
                    iDigit3 = Character.digit((char) bArr20[i33], 10) + iDigit20;
                }
                i3 = i25 - i27;
                i4 = iDigit3;
            } else {
                i3 = i23;
                i4 = 0;
            }
        }
        if (iDigit10 == 0 || iDigit12 == 0 || iDigit10 > 12 || iDigit12 > 31 || iDigit14 >= 24 || iDigit16 >= 60 || iDigit2 >= 60) {
            ca0.m1178j(jd0.m3615m("Parse ", str2, " time, invalid format"));
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i11, iDigit10, iDigit12, iDigit14, iDigit16, iDigit2);
        calendar.setTimeInMillis(i4);
        long timeInMillis = calendar.getTimeInMillis();
        if (i3 != 1 && i3 != 5) {
            ca0.m1178j(jd0.m3615m("Parse ", str2, " time, invalid offset"));
            return null;
        }
        byte[] bArr21 = ((ByteArrayInputStream) this).buf;
        int i34 = ((ByteArrayInputStream) this).pos;
        int i35 = i34 + 1;
        ((ByteArrayInputStream) this).pos = i35;
        byte b4 = bArr21[i34];
        if (b4 == 43) {
            ((ByteArrayInputStream) this).pos = i34 + 2;
            int iDigit21 = Character.digit((char) bArr21[i35], 10) * 10;
            byte[] bArr22 = ((ByteArrayInputStream) this).buf;
            int i36 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i36 + 1;
            int iDigit22 = Character.digit((char) bArr22[i36], 10) + iDigit21;
            byte[] bArr23 = ((ByteArrayInputStream) this).buf;
            int i37 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i37 + 1;
            int iDigit23 = Character.digit((char) bArr23[i37], 10) * 10;
            byte[] bArr24 = ((ByteArrayInputStream) this).buf;
            int i38 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i38 + 1;
            int iDigit24 = Character.digit((char) bArr24[i38], 10) + iDigit23;
            if (iDigit22 >= 24 || iDigit24 >= 60) {
                ca0.m1178j(jd0.m3615m("Parse ", str2, " time, +hhmm"));
                return null;
            }
            timeInMillis -= ((((long) iDigit22) * 60) + ((long) iDigit24)) * 60000;
        } else if (b4 == 45) {
            ((ByteArrayInputStream) this).pos = i34 + 2;
            int iDigit25 = Character.digit((char) bArr21[i35], 10) * 10;
            byte[] bArr25 = ((ByteArrayInputStream) this).buf;
            int i39 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i39 + 1;
            int iDigit26 = Character.digit((char) bArr25[i39], 10) + iDigit25;
            byte[] bArr26 = ((ByteArrayInputStream) this).buf;
            int i40 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i40 + 1;
            int iDigit27 = Character.digit((char) bArr26[i40], 10) * 10;
            byte[] bArr27 = ((ByteArrayInputStream) this).buf;
            int i41 = ((ByteArrayInputStream) this).pos;
            ((ByteArrayInputStream) this).pos = i41 + 1;
            int iDigit28 = Character.digit((char) bArr27[i41], 10) + iDigit27;
            if (iDigit26 >= 24 || iDigit28 >= 60) {
                ca0.m1178j(jd0.m3615m("Parse ", str2, " time, -hhmm"));
                return null;
            }
            timeInMillis += ((((long) iDigit26) * 60) + ((long) iDigit28)) * 60000;
        } else if (b4 != 90) {
            ca0.m1178j(jd0.m3615m("Parse ", str2, " time, garbage offset"));
            return null;
        }
        return new Date(timeInMillis);
    }

    public DerInputBuffer dup() {
        try {
            DerInputBuffer derInputBuffer = (DerInputBuffer) clone();
            derInputBuffer.mark(Integer.MAX_VALUE);
            return derInputBuffer;
        } catch (CloneNotSupportedException e) {
            f40.m2716l(e);
            return null;
        }
    }

    public boolean equals(DerInputBuffer derInputBuffer) throws IOException {
        if (this == derInputBuffer) {
            return true;
        }
        int iAvailable = available();
        if (derInputBuffer.available() != iAvailable) {
            return false;
        }
        for (int i = 0; i < iAvailable; i++) {
            if (((ByteArrayInputStream) this).buf[((ByteArrayInputStream) this).pos + i] != ((ByteArrayInputStream) derInputBuffer).buf[((ByteArrayInputStream) derInputBuffer).pos + i]) {
                return false;
            }
        }
        return true;
    }

    public BigInteger getBigInteger(int i, boolean z) throws IOException {
        if (i > available()) {
            ca0.m1178j("short read of integer");
            return null;
        }
        if (i == 0) {
            ca0.m1178j("Invalid encoding: zero length Int value");
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(((ByteArrayInputStream) this).buf, ((ByteArrayInputStream) this).pos, bArr, 0, i);
        skip(i);
        return z ? new BigInteger(1, bArr) : new BigInteger(bArr);
    }

    public byte[] getBitString(int i) throws IOException {
        if (i > available()) {
            ca0.m1178j("short read of bit string");
            return null;
        }
        if (i == 0) {
            ca0.m1178j("Invalid encoding: zero length bit string");
            return null;
        }
        byte[] bArr = ((ByteArrayInputStream) this).buf;
        int i2 = ((ByteArrayInputStream) this).pos;
        byte b = bArr[i2];
        if (b < 0 || b > 7) {
            ca0.m1178j("Invalid number of padding bits");
            return null;
        }
        int i3 = i - 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2 + 1, bArr2, 0, i3);
        if (b != 0) {
            int i4 = i - 2;
            bArr2[i4] = (byte) (bArr2[i4] & (255 << b));
        }
        skip(i);
        return bArr2;
    }

    public Date getGeneralizedTime(int i) throws IOException {
        if (i > available()) {
            ca0.m1178j("short read of DER Generalized Time");
            return null;
        }
        if (i >= 13 && i <= 23) {
            return getTime(i, true);
        }
        ca0.m1178j("DER Generalized Time length error");
        return null;
    }

    public int getInteger(int i) throws IOException {
        BigInteger bigInteger = getBigInteger(i, false);
        if (bigInteger.compareTo(BigInteger.valueOf(-2147483648L)) < 0) {
            ca0.m1178j("Integer below minimum valid value");
            return 0;
        }
        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) <= 0) {
            return bigInteger.intValue();
        }
        ca0.m1178j("Integer exceeds maximum valid value");
        return 0;
    }

    public Date getUTCTime(int i) throws IOException {
        if (i > available()) {
            ca0.m1178j("short read of DER UTC Time");
            return null;
        }
        if (i >= 11 && i <= 17) {
            return getTime(i, false);
        }
        ca0.m1178j("DER UTC Time length error");
        return null;
    }

    public BitArray getUnalignedBitString() throws IOException {
        if (((ByteArrayInputStream) this).pos >= ((ByteArrayInputStream) this).count) {
            return null;
        }
        int iAvailable = available();
        byte[] bArr = ((ByteArrayInputStream) this).buf;
        int i = ((ByteArrayInputStream) this).pos;
        int i2 = bArr[i] & 255;
        if (i2 > 7) {
            ca0.m1178j(jd0.m3609g(i2, "Invalid value for unused bits: "));
            return null;
        }
        int i3 = iAvailable - 1;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 == 0 ? 0 : (i3 * 8) - i2;
        System.arraycopy(bArr, i + 1, bArr2, 0, i3);
        BitArray bitArray = new BitArray(i4, bArr2);
        ((ByteArrayInputStream) this).pos = ((ByteArrayInputStream) this).count;
        return bitArray;
    }

    public int hashCode() throws IOException {
        int iAvailable = available();
        int i = ((ByteArrayInputStream) this).pos;
        int i2 = 0;
        for (int i3 = 0; i3 < iAvailable; i3++) {
            i2 += ((ByteArrayInputStream) this).buf[i + i3] * i3;
        }
        return i2;
    }

    public int peek() throws IOException {
        int i = ((ByteArrayInputStream) this).pos;
        if (i < ((ByteArrayInputStream) this).count) {
            return ((ByteArrayInputStream) this).buf[i];
        }
        ca0.m1178j("out of data");
        return 0;
    }

    public byte[] toByteArray() throws IOException {
        int iAvailable = available();
        if (iAvailable <= 0) {
            return null;
        }
        byte[] bArr = new byte[iAvailable];
        System.arraycopy(((ByteArrayInputStream) this).buf, ((ByteArrayInputStream) this).pos, bArr, 0, iAvailable);
        return bArr;
    }

    public void truncate(int i) throws IOException {
        if (i <= available()) {
            ((ByteArrayInputStream) this).count = ((ByteArrayInputStream) this).pos + i;
        } else {
            ca0.m1178j("insufficient data");
        }
    }

    public DerInputBuffer(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DerInputBuffer) {
            return equals((DerInputBuffer) obj);
        }
        return false;
    }

    public byte[] getBitString() {
        return getBitString(available());
    }
}
