package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import p000.C0694gy;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class OIDName implements GeneralNameInterface {
    private ObjectIdentifier oid;

    public OIDName(String str) throws IOException {
        try {
            this.oid = new ObjectIdentifier(str);
        } catch (Exception e) {
            l41.m4047p(e, "Unable to create OIDName: ");
            throw null;
        }
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 8) {
            return -1;
        }
        if (equals((OIDName) generalNameInterface)) {
            return 0;
        }
        C0694gy.m3079e("Narrowing and widening are not supported for OIDNames");
        return 0;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOID(this.oid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OIDName) {
            return this.oid.equals(((OIDName) obj).oid);
        }
        return false;
    }

    public ObjectIdentifier getOID() {
        return this.oid;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 8;
    }

    public int hashCode() {
        return this.oid.hashCode();
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        throw new UnsupportedOperationException("subtreeDepth() not supported for OIDName.");
    }

    public String toString() {
        return "OIDName: " + this.oid.toString();
    }

    public OIDName(ObjectIdentifier objectIdentifier) {
        this.oid = objectIdentifier;
    }

    public OIDName(DerValue derValue) {
        this.oid = derValue.getOID();
    }
}
