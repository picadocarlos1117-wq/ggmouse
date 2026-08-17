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
public final class g01 extends AbstractC0750ih {

    /* JADX INFO: renamed from: b */
    public static final HashSet f3938b;

    static {
        HashSet hashSet = new HashSet();
        f3938b = hashSet;
        hashSet.add(InterfaceC1106mf.f6889a2);
        hashSet.add(InterfaceC1106mf.f6893b2);
        hashSet.add(InterfaceC1106mf.f6897c2);
        hashSet.add(InterfaceC1106mf.f6901d2);
    }

    public g01() {
        super(f3938b);
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        C0675gf c0675gf = new C0675gf();
        c0675gf.f4171a = (j01) xh1.m6929a(ox1Var);
        return c0675gf;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        C0638ff c0638ff = new C0638ff();
        c0638ff.f3775b = hg1Var.f4563d;
        c0638ff.f3774a = (i01) sc2.m6070n(hg1Var);
        return c0638ff;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C0638ff) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C0638ff) key).getEncoded());
            }
        } else {
            if (!(key instanceof C0675gf)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C0675gf) key).getEncoded());
            }
        }
        ca0.m1177i(cls, "Unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C0638ff) || (key instanceof C0675gf)) {
            return key;
        }
        l41.m4039h("Unsupported key type");
        return null;
    }
}
