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
public final class h90 extends AbstractC0750ih {

    /* JADX INFO: renamed from: b */
    public static final HashSet f4475b;

    static {
        HashSet hashSet = new HashSet();
        f4475b = hashSet;
        hashSet.add(InterfaceC1106mf.f6959s0);
        hashSet.add(InterfaceC1106mf.f6963t0);
    }

    public h90() {
        super(f4475b);
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        C1551we c1551we = new C1551we();
        m90 m90Var = (m90) xh1.m6929a(ox1Var);
        c1551we.f12087a = m90Var;
        c1551we.f12088b = yv1.m7155c(((i90) m90Var.f7397b).f4883a);
        return c1551we;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        C1514ve c1514ve = new C1514ve();
        k90 k90Var = (k90) sc2.m6070n(hg1Var);
        c1514ve.f11643d = hg1Var.f4563d;
        c1514ve.f11640a = k90Var;
        c1514ve.f11641b = yv1.m7155c(((i90) k90Var.f7397b).f4883a);
        return c1514ve;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C1514ve) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C1514ve) key).getEncoded());
            }
        } else {
            if (!(key instanceof C1551we)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C1551we) key).getEncoded());
            }
        }
        ca0.m1177i(cls, "Unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C1514ve) || (key instanceof C1551we)) {
            return key;
        }
        l41.m4039h("Unsupported key type");
        return null;
    }
}
