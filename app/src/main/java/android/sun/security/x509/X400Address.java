package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import p000.C0694gy;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X400Address implements GeneralNameInterface {
    byte[] nameValue;

    public X400Address(DerValue derValue) {
        this.nameValue = null;
        this.nameValue = derValue.toByteArray();
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 3) {
            return -1;
        }
        C0694gy.m3079e("Narrowing, widening, and match are not supported for X400Address.");
        return 0;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putDerValue(new DerValue(this.nameValue));
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 3;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        throw new UnsupportedOperationException("subtreeDepth not supported for X400Address");
    }

    public String toString() {
        return "X400Address: <DER-encoded value>";
    }

    public X400Address(byte[] bArr) {
        this.nameValue = bArr;
    }
}
