package android.sun.security.x509;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.BitArray;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class IPAddressName implements GeneralNameInterface {
    private static final int MASKSIZE = 16;
    private byte[] address;
    private boolean isIPv4;
    private String name;

    public IPAddressName(String str) throws IOException {
        if (str == null || str.length() == 0) {
            ca0.m1178j("IPAddress cannot be null or empty");
            throw null;
        }
        if (str.charAt(str.length() - 1) == '/') {
            ca0.m1178j("Invalid IPAddress: ".concat(str));
            throw null;
        }
        if (str.indexOf(58) >= 0) {
            parseIPv6(str);
            this.isIPv4 = false;
        } else {
            if (str.indexOf(46) < 0) {
                ca0.m1178j("Invalid IPAddress: ".concat(str));
                throw null;
            }
            parseIPv4(str);
            this.isIPv4 = true;
        }
    }

    private void parseIPv4(String str) {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf == -1) {
            this.address = InetAddress.getByName(str).getAddress();
            return;
        }
        this.address = new byte[8];
        byte[] address = InetAddress.getByName(str.substring(iIndexOf + 1)).getAddress();
        System.arraycopy(InetAddress.getByName(str.substring(0, iIndexOf)).getAddress(), 0, this.address, 0, 4);
        System.arraycopy(address, 0, this.address, 4, 4);
    }

    private void parseIPv6(String str) throws IOException {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf == -1) {
            this.address = InetAddress.getByName(str).getAddress();
            return;
        }
        this.address = new byte[32];
        System.arraycopy(InetAddress.getByName(str.substring(0, iIndexOf)).getAddress(), 0, this.address, 0, 16);
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        if (i > 128) {
            ca0.m1178j("IPv6Address prefix is longer than 128");
            return;
        }
        BitArray bitArray = new BitArray(128);
        for (int i2 = 0; i2 < i; i2++) {
            bitArray.set(i2, true);
        }
        byte[] byteArray = bitArray.toByteArray();
        for (int i3 = 0; i3 < 16; i3++) {
            this.address[i3 + 16] = byteArray[i3];
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        int i;
        if (generalNameInterface == null || generalNameInterface.getType() != 7) {
            return -1;
        }
        IPAddressName iPAddressName = (IPAddressName) generalNameInterface;
        int i2 = 0;
        if (iPAddressName.equals(this)) {
            return 0;
        }
        byte[] bytes = iPAddressName.getBytes();
        int i3 = 3;
        if (bytes.length == 4 && this.address.length == 4) {
            return 3;
        }
        if ((bytes.length != 8 || this.address.length != 8) && (bytes.length != 32 || this.address.length != 32)) {
            if (bytes.length == 8 || bytes.length == 32) {
                int length = bytes.length / 2;
                int i4 = 0;
                while (i4 < length && (this.address[i4] & bytes[i4 + length]) == bytes[i4]) {
                    i4++;
                }
                return i4 == length ? 2 : 3;
            }
            byte[] bArr = this.address;
            if (bArr.length != 8 && bArr.length != 32) {
                return 3;
            }
            int length2 = bArr.length / 2;
            int i5 = 0;
            while (i5 < length2) {
                byte b = bytes[i5];
                byte[] bArr2 = this.address;
                if ((b & bArr2[i5 + length2]) != bArr2[i5]) {
                    break;
                }
                i5++;
            }
            return i5 == length2 ? 1 : 3;
        }
        int length3 = this.address.length / 2;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        int i7 = 1;
        int i8 = 1;
        while (i6 < length3) {
            byte[] bArr3 = this.address;
            byte b2 = bArr3[i6];
            int i9 = i6 + length3;
            byte b3 = bArr3[i9];
            if (((byte) (b2 & b3)) != b2) {
                z = true;
            }
            byte b4 = bytes[i6];
            byte b5 = bytes[i9];
            int i10 = i2;
            if (((byte) (b4 & b5)) != b4) {
                z2 = true;
            }
            if (((byte) (b3 & b5)) == b3) {
                i = i3;
                if (((byte) (b2 & b3)) != ((byte) (b4 & b3))) {
                }
                if (((byte) (b5 & b3)) == b5 || ((byte) (b4 & b5)) != ((byte) (b2 & b5))) {
                    i8 = i10;
                }
                i6++;
                i2 = i10;
                i3 = i;
            } else {
                i = i3;
            }
            i7 = i10;
            if (((byte) (b5 & b3)) == b5) {
                i8 = i10;
            } else {
                i8 = i10;
            }
            i6++;
            i2 = i10;
            i3 = i;
        }
        int i11 = i2;
        int i12 = i3;
        if (z || z2) {
            if (z && z2) {
                return i11;
            }
            return z ? 2 : 1;
        }
        if (i7 != 0) {
            return 1;
        }
        if (i8 != 0) {
            return 2;
        }
        return i12;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOctetString(this.address);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IPAddressName)) {
            return false;
        }
        byte[] bytes = ((IPAddressName) obj).getBytes();
        int length = bytes.length;
        byte[] bArr = this.address;
        if (length != bArr.length) {
            return false;
        }
        if (bArr.length != 8 && bArr.length != 32) {
            return Arrays.equals(bytes, bArr);
        }
        int length2 = bArr.length / 2;
        byte[] bArr2 = new byte[length2];
        byte[] bArr3 = new byte[length2];
        for (int i = 0; i < length2; i++) {
            byte[] bArr4 = this.address;
            int i2 = i + length2;
            bArr2[i] = (byte) (bArr4[i2] & bArr4[i]);
            byte b = (byte) (bytes[i] & bytes[i2]);
            bArr3[i] = b;
            if (bArr2[i] != b) {
                return false;
            }
        }
        while (true) {
            byte[] bArr5 = this.address;
            if (length2 >= bArr5.length) {
                return true;
            }
            if (bArr5[length2] != bytes[length2]) {
                return false;
            }
            length2++;
        }
    }

    public byte[] getBytes() {
        return (byte[]) this.address.clone();
    }

    public String getName() throws IOException {
        String str = this.name;
        if (str != null) {
            return str;
        }
        boolean z = this.isIPv4;
        byte[] bArr = this.address;
        int i = 0;
        if (z) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            this.name = InetAddress.getByAddress(bArr2).getHostAddress();
            byte[] bArr3 = this.address;
            if (bArr3.length == 8) {
                byte[] bArr4 = new byte[4];
                System.arraycopy(bArr3, 4, bArr4, 0, 4);
                this.name += "/" + InetAddress.getByAddress(bArr4).getHostAddress();
            }
        } else {
            byte[] bArr5 = new byte[16];
            System.arraycopy(bArr, 0, bArr5, 0, 16);
            this.name = InetAddress.getByAddress(bArr5).getHostAddress();
            if (this.address.length == 32) {
                byte[] bArr6 = new byte[16];
                for (int i2 = 16; i2 < 32; i2++) {
                    bArr6[i2 - 16] = this.address[i2];
                }
                BitArray bitArray = new BitArray(128, bArr6);
                while (i < 128 && bitArray.get(i)) {
                    i++;
                }
                this.name += "/" + i;
                while (i < 128) {
                    if (bitArray.get(i)) {
                        ca0.m1178j(jd0.m3610h(i, "Invalid IPv6 subdomain - set bit ", " not contiguous"));
                        return null;
                    }
                    i++;
                }
            }
        }
        return this.name;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 7;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.address;
            if (i >= bArr.length) {
                return i2;
            }
            i2 += bArr[i] * i;
            i++;
        }
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        throw new UnsupportedOperationException("subtreeDepth() not defined for IPAddressName");
    }

    public String toString() {
        try {
            return "IPAddress: " + getName();
        } catch (IOException unused) {
            return "IPAddress: " + new HexDumpEncoder().encodeBuffer(this.address);
        }
    }

    public IPAddressName(byte[] bArr) throws IOException {
        if (bArr.length != 4 && bArr.length != 8) {
            if (bArr.length != 16 && bArr.length != 32) {
                ca0.m1178j("Invalid IPAddressName");
                throw null;
            }
            this.isIPv4 = false;
        } else {
            this.isIPv4 = true;
        }
        this.address = bArr;
    }

    public IPAddressName(DerValue derValue) {
        this(derValue.getOctetString());
    }
}
