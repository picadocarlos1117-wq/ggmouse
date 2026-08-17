package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificatePolicyId {

    /* JADX INFO: renamed from: id */
    private ObjectIdentifier f289id;

    public CertificatePolicyId(DerValue derValue) {
        this.f289id = derValue.getOID();
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOID(this.f289id);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePolicyId) {
            return this.f289id.equals(((CertificatePolicyId) obj).getIdentifier());
        }
        return false;
    }

    public ObjectIdentifier getIdentifier() {
        return this.f289id;
    }

    public int hashCode() {
        return this.f289id.hashCode();
    }

    public String toString() {
        return "CertificatePolicyId: [" + this.f289id.toString() + "]\n";
    }

    public CertificatePolicyId(ObjectIdentifier objectIdentifier) {
        this.f289id = objectIdentifier;
    }
}
