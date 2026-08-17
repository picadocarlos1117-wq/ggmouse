package android.sun.security.p002ec;

import android.sun.security.pkcs.PKCS8Key;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.x509.AlgorithmId;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ECPrivateKeyImpl extends PKCS8Key implements ECPrivateKey {
    private static final long serialVersionUID = 88695385615075129L;
    private ECParameterSpec params;

    /* JADX INFO: renamed from: s */
    private BigInteger f274s;

    public ECPrivateKeyImpl(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws InvalidKeyException {
        this.f274s = bigInteger;
        this.params = eCParameterSpec;
        this.algid = new AlgorithmId(AlgorithmId.EC_oid, ECParameters.getAlgorithmParameters(eCParameterSpec));
        try {
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStream.putInteger(1);
            derOutputStream.putOctetString(ECParameters.trimZeroes(bigInteger.toByteArray()));
            this.key = new DerValue((byte) 48, derOutputStream.toByteArray()).toByteArray();
        } catch (IOException e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // android.sun.security.pkcs.PKCS8Key, java.security.Key
    public String getAlgorithm() {
        return "EC";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.params;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f274s;
    }

    @Override // android.sun.security.pkcs.PKCS8Key
    public void parseKeyBits() throws InvalidKeyException {
        try {
            DerValue derValue = new DerInputStream(this.key).getDerValue();
            if (derValue.tag != 48) {
                throw new IOException("Not a SEQUENCE");
            }
            DerInputStream derInputStream = derValue.data;
            if (derInputStream.getInteger() != 1) {
                throw new IOException("Version must be 1");
            }
            this.f274s = new BigInteger(1, derInputStream.getOctetString());
            while (derInputStream.available() != 0) {
                DerValue derValue2 = derInputStream.getDerValue();
                if (!derValue2.isContextSpecific((byte) 0) && !derValue2.isContextSpecific((byte) 1)) {
                    throw new InvalidKeyException("Unexpected value: " + derValue2);
                }
            }
            AlgorithmParameters parameters = this.algid.getParameters();
            if (parameters == null) {
                throw new InvalidKeyException("EC domain parameters must be encoded in the algorithm identifier");
            }
            this.params = (ECParameterSpec) parameters.getParameterSpec(ECParameterSpec.class);
        } catch (IOException e) {
            throw new InvalidKeyException("Invalid EC private key", e);
        } catch (InvalidParameterSpecException e2) {
            throw new InvalidKeyException("Invalid EC private key", e2);
        }
    }

    @Override // android.sun.security.pkcs.PKCS8Key
    public String toString() {
        return "Sun EC private key, " + this.params.getCurve().getField().getFieldSize() + " bits\n  private value:  " + this.f274s + "\n  parameters: " + this.params;
    }

    public ECPrivateKeyImpl(byte[] bArr) throws InvalidKeyException {
        decode(bArr);
    }
}
