package android.sun.security.p002ec;

import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.AlgorithmParametersSpi;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidParameterSpecException;
import p000.AbstractC1308pu;
import p000.C0694gy;
import p000.ca0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ECParameters extends AlgorithmParametersSpi {
    private ECParameterSpec paramSpec;

    public static ECParameterSpec decodeParameters(byte[] bArr) throws IOException {
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 6) {
            ca0.m1178j("Only named ECParameters supported");
            return null;
        }
        ObjectIdentifier oid = derValue.getOID();
        ECParameterSpec eCParameterSpec = NamedCurve.getECParameterSpec(oid);
        if (eCParameterSpec != null) {
            return eCParameterSpec;
        }
        l41.m4047p(oid, "Unknown named curve: ");
        return null;
    }

    public static ECPoint decodePoint(byte[] bArr, EllipticCurve ellipticCurve) throws IOException {
        if (bArr.length == 0 || bArr[0] != 4) {
            ca0.m1178j("Only uncompressed point format supported");
            return null;
        }
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) >> 3;
        if (bArr.length != (fieldSize * 2) + 1) {
            ca0.m1178j("Point does not match field size");
            return null;
        }
        byte[] bArr2 = new byte[fieldSize];
        byte[] bArr3 = new byte[fieldSize];
        System.arraycopy(bArr, 1, bArr2, 0, fieldSize);
        System.arraycopy(bArr, fieldSize + 1, bArr3, 0, fieldSize);
        return new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3));
    }

    public static byte[] encodeParameters(ECParameterSpec eCParameterSpec) {
        NamedCurve namedCurve = getNamedCurve(eCParameterSpec);
        if (namedCurve != null) {
            return namedCurve.getEncoded();
        }
        throw new RuntimeException("Not a known named curve: " + eCParameterSpec);
    }

    public static byte[] encodePoint(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) >> 3;
        byte[] bArrTrimZeroes = trimZeroes(eCPoint.getAffineX().toByteArray());
        byte[] bArrTrimZeroes2 = trimZeroes(eCPoint.getAffineY().toByteArray());
        if (bArrTrimZeroes.length > fieldSize || bArrTrimZeroes2.length > fieldSize) {
            l41.m4048q("Point coordinates do not match field size");
            return null;
        }
        int i = (fieldSize << 1) + 1;
        byte[] bArr = new byte[i];
        bArr[0] = 4;
        System.arraycopy(bArrTrimZeroes, 0, bArr, (fieldSize - bArrTrimZeroes.length) + 1, bArrTrimZeroes.length);
        System.arraycopy(bArrTrimZeroes2, 0, bArr, i - bArrTrimZeroes2.length, bArrTrimZeroes2.length);
        return bArr;
    }

    public static AlgorithmParameters getAlgorithmParameters(ECParameterSpec eCParameterSpec) throws InvalidKeyException {
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC", ECKeyFactory.ecInternalProvider);
            algorithmParameters.init(eCParameterSpec);
            return algorithmParameters;
        } catch (GeneralSecurityException e) {
            throw new InvalidKeyException("EC parameters error", e);
        }
    }

    public static String getCurveName(ECParameterSpec eCParameterSpec) {
        NamedCurve namedCurve = getNamedCurve(eCParameterSpec);
        if (namedCurve == null) {
            return null;
        }
        return namedCurve.getObjectIdentifier().toString();
    }

    public static NamedCurve getNamedCurve(ECParameterSpec eCParameterSpec) {
        if ((eCParameterSpec instanceof NamedCurve) || eCParameterSpec == null) {
            return (NamedCurve) eCParameterSpec;
        }
        int fieldSize = eCParameterSpec.getCurve().getField().getFieldSize();
        for (ECParameterSpec eCParameterSpec2 : NamedCurve.knownECParameterSpecs()) {
            if (eCParameterSpec2.getCurve().getField().getFieldSize() == fieldSize && eCParameterSpec2.getCurve().equals(eCParameterSpec.getCurve()) && eCParameterSpec2.getGenerator().equals(eCParameterSpec.getGenerator()) && eCParameterSpec2.getOrder().equals(eCParameterSpec.getOrder()) && eCParameterSpec2.getCofactor() == eCParameterSpec.getCofactor()) {
                return (NamedCurve) eCParameterSpec2;
            }
        }
        return null;
    }

    public static byte[] trimZeroes(byte[] bArr) {
        int i = 0;
        while (i < bArr.length - 1 && bArr[i] == 0) {
            i++;
        }
        if (i == 0) {
            return bArr;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        return encodeParameters(this.paramSpec);
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls.isAssignableFrom(ECParameterSpec.class)) {
            return this.paramSpec;
        }
        if (cls.isAssignableFrom(ECGenParameterSpec.class)) {
            return new ECGenParameterSpec(getCurveName(this.paramSpec));
        }
        throw new InvalidParameterSpecException("Only ECParameterSpec and ECGenParameterSpec supported");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            NamedCurve namedCurve = getNamedCurve((ECParameterSpec) algorithmParameterSpec);
            this.paramSpec = namedCurve;
            if (namedCurve != null) {
                return;
            }
            C0694gy.m3078d(algorithmParameterSpec, "Not a supported named curve: ");
            return;
        }
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (algorithmParameterSpec != null) {
                throw new InvalidParameterSpecException("Only ECParameterSpec and ECGenParameterSpec supported");
            }
            throw new InvalidParameterSpecException("paramSpec must not be null");
        }
        String name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
        ECParameterSpec eCParameterSpec = NamedCurve.getECParameterSpec(name);
        if (eCParameterSpec == null) {
            throw new InvalidParameterSpecException(AbstractC1308pu.m5339f("Unknown curve: ", name));
        }
        this.paramSpec = eCParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return this.paramSpec.toString();
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) {
        this.paramSpec = decodeParameters(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) {
        engineInit(bArr);
    }
}
