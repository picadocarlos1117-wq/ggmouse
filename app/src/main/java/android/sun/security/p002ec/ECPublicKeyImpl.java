package android.sun.security.p002ec;

import android.sun.security.x509.AlgorithmId;
import android.sun.security.x509.X509Key;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyRep;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ECPublicKeyImpl extends X509Key implements ECPublicKey {
    private static final long serialVersionUID = -2462037275160462289L;
    private ECParameterSpec params;

    /* JADX INFO: renamed from: w */
    private ECPoint f275w;

    public ECPublicKeyImpl(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        this.f275w = eCPoint;
        this.params = eCParameterSpec;
        this.algid = new AlgorithmId(AlgorithmId.EC_oid, ECParameters.getAlgorithmParameters(eCParameterSpec));
        this.key = ECParameters.encodePoint(eCPoint, eCParameterSpec.getCurve());
    }

    @Override // android.sun.security.x509.X509Key, java.security.Key
    public String getAlgorithm() {
        return "EC";
    }

    public byte[] getEncodedPublicValue() {
        return (byte[]) this.key.clone();
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.params;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return this.f275w;
    }

    @Override // android.sun.security.x509.X509Key
    public void parseKeyBits() throws InvalidKeyException {
        try {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) this.algid.getParameters().getParameterSpec(ECParameterSpec.class);
            this.params = eCParameterSpec;
            this.f275w = ECParameters.decodePoint(this.key, eCParameterSpec.getCurve());
        } catch (IOException e) {
            throw new InvalidKeyException("Invalid EC key", e);
        } catch (InvalidParameterSpecException e2) {
            throw new InvalidKeyException("Invalid EC key", e2);
        }
    }

    @Override // android.sun.security.x509.X509Key
    public String toString() {
        return "Sun EC public key, " + this.params.getCurve().getField().getFieldSize() + " bits\n  public x coord: " + this.f275w.getAffineX() + "\n  public y coord: " + this.f275w.getAffineY() + "\n  parameters: " + this.params;
    }

    public Object writeReplace() {
        return new KeyRep(KeyRep.Type.PUBLIC, getAlgorithm(), getFormat(), getEncoded());
    }

    public ECPublicKeyImpl(byte[] bArr) throws InvalidKeyException {
        decode(bArr);
    }
}
