package android.sun.security.x509;

import android.sun.security.util.Debug;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class SerialNumber {
    private BigInteger serialNum;

    public SerialNumber(InputStream inputStream) throws IOException {
        construct(new DerValue(inputStream));
    }

    private void construct(DerValue derValue) throws IOException {
        this.serialNum = derValue.getBigInteger();
        if (derValue.data.available() == 0) {
            return;
        }
        ca0.m1178j("Excess SerialNumber data");
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putInteger(this.serialNum);
    }

    public BigInteger getNumber() {
        return this.serialNum;
    }

    public String toString() {
        return "SerialNumber: [" + Debug.toHexString(this.serialNum) + "]";
    }

    public SerialNumber(int i) {
        this.serialNum = BigInteger.valueOf(i);
    }

    public SerialNumber(DerInputStream derInputStream) throws IOException {
        construct(derInputStream.getDerValue());
    }

    public SerialNumber(DerValue derValue) throws IOException {
        construct(derValue);
    }

    public SerialNumber(BigInteger bigInteger) {
        this.serialNum = bigInteger;
    }
}
