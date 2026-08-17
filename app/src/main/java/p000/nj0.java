package p000;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class nj0 extends AbstractC0750ih {

    /* JADX INFO: renamed from: b */
    public static final HashSet f7430b;

    static {
        HashSet hashSet = new HashSet();
        f7430b = hashSet;
        hashSet.add(InterfaceC1106mf.f6875W1);
        hashSet.add(InterfaceC1106mf.f6879X1);
        hashSet.add(InterfaceC1106mf.f6882Y1);
    }

    public nj0() {
        super(f7430b);
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        C1625ye c1625ye = new C1625ye();
        c1625ye.f12966a = (qj0) xh1.m6929a(ox1Var);
        return c1625ye;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        C1588xe c1588xe = new C1588xe();
        c1588xe.f12587b = hg1Var.f4563d;
        c1588xe.f12586a = (pj0) sc2.m6070n(hg1Var);
        return c1588xe;
    }

    @Override // p000.AbstractC0750ih, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                ca0.m1176h(e);
                return null;
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // p000.AbstractC0750ih, java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            ca0.m1177i(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e) {
            ca0.m1176h(e);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C1588xe) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C1588xe) key).getEncoded());
            }
        } else {
            if (!(key instanceof C1625ye)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C1625ye) key).getEncoded());
            }
        }
        ca0.m1177i(cls, "Unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C1588xe) || (key instanceof C1625ye)) {
            return key;
        }
        l41.m4039h("Unsupported key type");
        return null;
    }
}
