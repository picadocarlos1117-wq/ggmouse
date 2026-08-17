package android.sun.security.x509;

import android.sun.security.util.Debug;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.math.BigInteger;
import java.security.ProviderException;
import java.security.interfaces.DSAParams;
import p000.ca0;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AlgIdDSA extends AlgorithmId implements DSAParams {
    private static final long serialVersionUID = 3437177836797504046L;

    /* JADX INFO: renamed from: g */
    private BigInteger f282g;

    /* JADX INFO: renamed from: p */
    private BigInteger f283p;

    /* JADX INFO: renamed from: q */
    private BigInteger f284q;

    public AlgIdDSA(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(AlgorithmId.DSA_oid);
        if (bigInteger == null && bigInteger2 == null && bigInteger3 == null) {
            return;
        }
        if (bigInteger == null || bigInteger2 == null || bigInteger3 == null) {
            throw new ProviderException("Invalid parameters for DSS/DSA Algorithm ID");
        }
        try {
            this.f283p = bigInteger;
            this.f284q = bigInteger2;
            this.f282g = bigInteger3;
            initializeParams();
        } catch (IOException unused) {
            throw new ProviderException("Construct DSS/DSA Algorithm ID");
        }
    }

    private void initializeParams() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putInteger(this.f283p);
        derOutputStream.putInteger(this.f284q);
        derOutputStream.putInteger(this.f282g);
        this.params = new DerValue((byte) 48, derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.AlgorithmId
    public void decodeParams() throws IOException {
        DerValue derValue = this.params;
        if (derValue == null) {
            ca0.m1178j("DSA alg params are null");
            return;
        }
        if (derValue.tag != 48) {
            ca0.m1178j("DSA alg parsing error");
            return;
        }
        derValue.data.reset();
        this.f283p = this.params.data.getBigInteger();
        this.f284q = this.params.data.getBigInteger();
        this.f282g = this.params.data.getBigInteger();
        if (this.params.data.available() == 0) {
            return;
        }
        f40.m2710f(this.params.data.available(), "AlgIdDSA params, extra=");
    }

    @Override // java.security.interfaces.DSAParams
    public BigInteger getG() {
        return this.f282g;
    }

    @Override // android.sun.security.x509.AlgorithmId
    public String getName() {
        return "DSA";
    }

    @Override // java.security.interfaces.DSAParams
    public BigInteger getP() {
        return this.f283p;
    }

    @Override // java.security.interfaces.DSAParams
    public BigInteger getQ() {
        return this.f284q;
    }

    @Override // android.sun.security.x509.AlgorithmId
    public String paramsToString() {
        if (this.params == null) {
            return " null\n";
        }
        return "\n    p:\n" + Debug.toHexString(this.f283p) + "\n    q:\n" + Debug.toHexString(this.f284q) + "\n    g:\n" + Debug.toHexString(this.f282g) + "\n";
    }

    @Override // android.sun.security.x509.AlgorithmId
    public String toString() {
        return paramsToString();
    }

    public AlgIdDSA(DerValue derValue) {
        super(derValue.getOID());
    }

    public AlgIdDSA(byte[] bArr) {
        super(new DerValue(bArr).getOID());
    }

    public AlgIdDSA(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(new BigInteger(1, bArr), new BigInteger(1, bArr2), new BigInteger(1, bArr3));
    }

    public AlgIdDSA() {
    }
}
