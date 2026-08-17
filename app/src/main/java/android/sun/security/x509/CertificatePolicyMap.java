package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificatePolicyMap {
    private CertificatePolicyId issuerDomain;
    private CertificatePolicyId subjectDomain;

    public CertificatePolicyMap(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for CertificatePolicyMap");
            throw null;
        }
        this.issuerDomain = new CertificatePolicyId(derValue.data.getDerValue());
        this.subjectDomain = new CertificatePolicyId(derValue.data.getDerValue());
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.issuerDomain.encode(derOutputStream2);
        this.subjectDomain.encode(derOutputStream2);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public CertificatePolicyId getIssuerIdentifier() {
        return this.issuerDomain;
    }

    public CertificatePolicyId getSubjectIdentifier() {
        return this.subjectDomain;
    }

    public String toString() {
        return "CertificatePolicyMap: [\nIssuerDomain:" + this.issuerDomain.toString() + "SubjectDomain:" + this.subjectDomain.toString() + "]\n";
    }

    public CertificatePolicyMap(CertificatePolicyId certificatePolicyId, CertificatePolicyId certificatePolicyId2) {
        this.issuerDomain = certificatePolicyId;
        this.subjectDomain = certificatePolicyId2;
    }
}
