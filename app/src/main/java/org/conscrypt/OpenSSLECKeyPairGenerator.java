package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC1308pu;
import p000.jd0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenSSLECKeyPairGenerator extends KeyPairGenerator {
    private static final String ALGORITHM = "EC";
    private static final int DEFAULT_KEY_SIZE = 256;
    private static final Map<Integer, String> SIZE_TO_CURVE_NAME;
    private OpenSSLECGroupContext group;

    static {
        HashMap map = new HashMap();
        SIZE_TO_CURVE_NAME = map;
        map.put(224, "secp224r1");
        map.put(256, "prime256v1");
        map.put(384, "secp384r1");
        map.put(521, "secp521r1");
    }

    public OpenSSLECKeyPairGenerator() {
        super(ALGORITHM);
    }

    public static void assertCurvesAreValid() {
        ArrayList arrayList = new ArrayList();
        for (String str : SIZE_TO_CURVE_NAME.values()) {
            if (OpenSSLECGroupContext.getCurveByName(str) == null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        throw new AssertionError("Invalid curve names: " + Arrays.toString(arrayList.toArray()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.group == null) {
            String str = SIZE_TO_CURVE_NAME.get(256);
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(str);
            this.group = curveByName;
            if (curveByName == null) {
                l41.m4048q(AbstractC1308pu.m5339f("Curve not recognized: ", str));
                return null;
            }
        }
        OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.EC_KEY_generate_key(this.group.getNativeRef()));
        return new KeyPair(new OpenSSLECPublicKey(this.group, openSSLKey), new OpenSSLECPrivateKey(this.group, openSSLKey));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.group = OpenSSLECGroupContext.getInstance((ECParameterSpec) algorithmParameterSpec);
            return;
        }
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter must be ECParameterSpec or ECGenParameterSpec");
        }
        String name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
        OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(name);
        if (curveByName == null) {
            throw new InvalidAlgorithmParameterException(AbstractC1308pu.m5339f("unknown curve name: ", name));
        }
        this.group = curveByName;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        String str = SIZE_TO_CURVE_NAME.get(Integer.valueOf(i));
        if (str != null) {
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(str);
            if (curveByName != null) {
                this.group = curveByName;
                return;
            }
            throw new InvalidParameterException("unknown curve ".concat(str));
        }
        throw new InvalidParameterException(jd0.m3609g(i, "unknown key size "));
    }
}
