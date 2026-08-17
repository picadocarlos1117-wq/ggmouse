package android.sun.security.x509;

import android.sun.security.util.BitArray;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class UniqueIdentity {

    /* JADX INFO: renamed from: id */
    private BitArray f297id;

    public UniqueIdentity(DerInputStream derInputStream) {
        this.f297id = derInputStream.getDerValue().getUnalignedBitString(true);
    }

    public void encode(DerOutputStream derOutputStream, byte b) throws IOException {
        byte[] byteArray = this.f297id.toByteArray();
        int length = (byteArray.length * 8) - this.f297id.length();
        derOutputStream.write(b);
        derOutputStream.putLength(byteArray.length + 1);
        derOutputStream.write(length);
        derOutputStream.write(byteArray);
    }

    public boolean[] getId() {
        BitArray bitArray = this.f297id;
        if (bitArray == null) {
            return null;
        }
        return bitArray.toBooleanArray();
    }

    public String toString() {
        return "UniqueIdentity:" + this.f297id.toString() + "\n";
    }

    public UniqueIdentity(byte[] bArr) {
        this.f297id = new BitArray(bArr.length * 8, bArr);
    }

    public UniqueIdentity(BitArray bitArray) {
        this.f297id = bitArray;
    }

    public UniqueIdentity(DerValue derValue) {
        this.f297id = derValue.getUnalignedBitString(true);
    }
}
