package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DeltaCRLIndicatorExtension extends CRLNumberExtension {
    private static final String LABEL = "Base CRL Number";
    public static final String NAME = "DeltaCRLIndicator";

    public DeltaCRLIndicatorExtension(int i) {
        super(PKIXExtensions.DeltaCRLIndicator_Id, true, BigInteger.valueOf(i), NAME, LABEL);
    }

    @Override // android.sun.security.x509.CRLNumberExtension, android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        new DerOutputStream();
        super.encode(outputStream, PKIXExtensions.DeltaCRLIndicator_Id, true);
    }

    public DeltaCRLIndicatorExtension(BigInteger bigInteger) {
        super(PKIXExtensions.DeltaCRLIndicator_Id, true, bigInteger, NAME, LABEL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeltaCRLIndicatorExtension(Boolean bool, Object obj) {
        ObjectIdentifier objectIdentifier = PKIXExtensions.DeltaCRLIndicator_Id;
        bool.booleanValue();
        super(objectIdentifier, bool, obj, NAME, LABEL);
    }
}
