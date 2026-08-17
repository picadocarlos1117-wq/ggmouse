package android.sun.security.x509;

import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class FreshestCRLExtension extends CRLDistributionPointsExtension {
    public static final String NAME = "FreshestCRL";

    /* JADX WARN: Illegal instructions before constructor call */
    public FreshestCRLExtension(Boolean bool, Object obj) {
        ObjectIdentifier objectIdentifier = PKIXExtensions.FreshestCRL_Id;
        bool.booleanValue();
        super(objectIdentifier, bool, obj, NAME);
    }

    @Override // android.sun.security.x509.CRLDistributionPointsExtension, android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        super.encode(outputStream, PKIXExtensions.FreshestCRL_Id, false);
    }

    public FreshestCRLExtension(List<DistributionPoint> list) {
        super(PKIXExtensions.FreshestCRL_Id, false, list, NAME);
    }
}
