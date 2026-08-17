package android.sun.security.p002ec;

import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyFactorySpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p000.ca0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ECKeyFactory extends KeyFactorySpi {
    public static final KeyFactory INSTANCE;
    public static final Provider ecInternalProvider;

    static {
        final Provider provider = new Provider("SunEC-Internal", 1.0d, null) { // from class: android.sun.security.ec.ECKeyFactory.1
        };
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: android.sun.security.ec.ECKeyFactory.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                provider.put("KeyFactory.EC", "sun.security.ec.ECKeyFactory");
                provider.put("AlgorithmParameters.EC", "sun.security.ec.ECParameters");
                provider.put("Alg.Alias.AlgorithmParameters.1.2.840.10045.2.1", "EC");
                return null;
            }
        });
        try {
            INSTANCE = KeyFactory.getInstance("EC", provider);
            ecInternalProvider = provider;
        } catch (NoSuchAlgorithmException e) {
            ca0.m1184p(e);
        }
    }

    private static void checkKey(ECKey eCKey) throws InvalidKeyException {
        if (eCKey instanceof ECPublicKey) {
            if (eCKey instanceof ECPublicKeyImpl) {
                return;
            }
        } else if (!(eCKey instanceof ECPrivateKey)) {
            l41.m4039h("Neither a public nor a private key");
            return;
        } else if (eCKey instanceof ECPrivateKeyImpl) {
            return;
        }
        String algorithm = ((Key) eCKey).getAlgorithm();
        if (!algorithm.equals("EC")) {
            throw new InvalidKeyException("Not an EC key: ".concat(algorithm));
        }
    }

    private PrivateKey implGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            return new ECPrivateKeyImpl(((PKCS8EncodedKeySpec) keySpec).getEncoded());
        }
        if (!(keySpec instanceof ECPrivateKeySpec)) {
            throw new InvalidKeySpecException("Only ECPrivateKeySpec and PKCS8EncodedKeySpec supported for EC private keys");
        }
        ECPrivateKeySpec eCPrivateKeySpec = (ECPrivateKeySpec) keySpec;
        return new ECPrivateKeyImpl(eCPrivateKeySpec.getS(), eCPrivateKeySpec.getParams());
    }

    private PublicKey implGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            return new ECPublicKeyImpl(((X509EncodedKeySpec) keySpec).getEncoded());
        }
        if (!(keySpec instanceof ECPublicKeySpec)) {
            throw new InvalidKeySpecException("Only ECPublicKeySpec and X509EncodedKeySpec supported for EC public keys");
        }
        ECPublicKeySpec eCPublicKeySpec = (ECPublicKeySpec) keySpec;
        return new ECPublicKeyImpl(eCPublicKeySpec.getW(), eCPublicKeySpec.getParams());
    }

    private PrivateKey implTranslatePrivateKey(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ECPrivateKey) {
            if (privateKey instanceof ECPrivateKeyImpl) {
                return privateKey;
            }
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            return new ECPrivateKeyImpl(eCPrivateKey.getS(), eCPrivateKey.getParams());
        }
        if ("PKCS#8".equals(privateKey.getFormat())) {
            return new ECPrivateKeyImpl(privateKey.getEncoded());
        }
        l41.m4039h("Private keys must be instance of ECPrivateKey or have PKCS#8 encoding");
        return null;
    }

    private PublicKey implTranslatePublicKey(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ECPublicKey) {
            if (publicKey instanceof ECPublicKeyImpl) {
                return publicKey;
            }
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            return new ECPublicKeyImpl(eCPublicKey.getW(), eCPublicKey.getParams());
        }
        if ("X.509".equals(publicKey.getFormat())) {
            return new ECPublicKeyImpl(publicKey.getEncoded());
        }
        l41.m4039h("Public keys must be instance of ECPublicKey or have X.509 encoding");
        return null;
    }

    public static ECKey toECKey(Key key) throws InvalidKeyException {
        if (!(key instanceof ECKey)) {
            return (ECKey) INSTANCE.translateKey(key);
        }
        ECKey eCKey = (ECKey) key;
        checkKey(eCKey);
        return eCKey;
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            return implGeneratePrivate(keySpec);
        } catch (InvalidKeySpecException e) {
            throw e;
        } catch (GeneralSecurityException e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            return implGeneratePublic(keySpec);
        } catch (InvalidKeySpecException e) {
            throw e;
        } catch (GeneralSecurityException e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    @Override // java.security.KeyFactorySpi
    public <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) throws InvalidKeySpecException {
        try {
            Key keyEngineTranslateKey = engineTranslateKey(key);
            if (keyEngineTranslateKey instanceof ECPublicKey) {
                ECPublicKey eCPublicKey = (ECPublicKey) keyEngineTranslateKey;
                if (ECPublicKeySpec.class.isAssignableFrom(cls)) {
                    return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
                }
                if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new X509EncodedKeySpec(keyEngineTranslateKey.getEncoded());
                }
                throw new InvalidKeySpecException("KeySpec must be ECPublicKeySpec or X509EncodedKeySpec for EC public keys");
            }
            if (!(keyEngineTranslateKey instanceof ECPrivateKey)) {
                throw new InvalidKeySpecException("Neither public nor private key");
            }
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(keyEngineTranslateKey.getEncoded());
            }
            if (!ECPrivateKeySpec.class.isAssignableFrom(cls)) {
                throw new InvalidKeySpecException("KeySpec must be ECPrivateKeySpec or PKCS8EncodedKeySpec for EC private keys");
            }
            ECPrivateKey eCPrivateKey = (ECPrivateKey) keyEngineTranslateKey;
            return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
        } catch (InvalidKeyException e) {
            throw new InvalidKeySpecException(e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key == null) {
            l41.m4039h("Key must not be null");
            return null;
        }
        String algorithm = key.getAlgorithm();
        if (!algorithm.equals("EC")) {
            throw new InvalidKeyException("Not an EC key: ".concat(algorithm));
        }
        if (key instanceof PublicKey) {
            return implTranslatePublicKey((PublicKey) key);
        }
        if (key instanceof PrivateKey) {
            return implTranslatePrivateKey((PrivateKey) key);
        }
        l41.m4039h("Neither a public nor a private key");
        return null;
    }
}
