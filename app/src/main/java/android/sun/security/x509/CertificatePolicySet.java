package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificatePolicySet {
    private final Vector<CertificatePolicyId> ids;

    public CertificatePolicySet(DerInputStream derInputStream) throws IOException {
        this.ids = new Vector<>();
        for (DerValue derValue : derInputStream.getSequence(5)) {
            this.ids.addElement(new CertificatePolicyId(derValue));
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        for (int i = 0; i < this.ids.size(); i++) {
            this.ids.elementAt(i).encode(derOutputStream2);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public List<CertificatePolicyId> getCertPolicyIds() {
        return Collections.unmodifiableList(this.ids);
    }

    public String toString() {
        return "CertificatePolicySet:[\n" + this.ids.toString() + "]\n";
    }

    public CertificatePolicySet(Vector<CertificatePolicyId> vector) {
        this.ids = vector;
    }
}
