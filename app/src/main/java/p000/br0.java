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
public final class br0 extends AbstractC0750ih {

    /* JADX INFO: renamed from: b */
    public static final HashSet f1509b;

    static {
        HashSet hashSet = new HashSet();
        f1509b = hashSet;
        hashSet.add(e71.f3249N);
        hashSet.add(e71.f3250O);
        hashSet.add(e71.f3251P);
        hashSet.add(InterfaceC1106mf.f6787A1);
        hashSet.add(InterfaceC1106mf.f6791B1);
        hashSet.add(InterfaceC1106mf.f6795C1);
    }

    public br0() {
        super(f1509b);
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        C0016af c0016af = new C0016af();
        rw0 rw0Var = (rw0) xh1.m6929a(ox1Var);
        c0016af.f212a = rw0Var;
        c0016af.f213b = yv1.m7155c(((ow0) rw0Var.f7397b).f8501a);
        return c0016af;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        C1662ze c1662ze = new C1662ze();
        c1662ze.f13379c = hg1Var.f4563d;
        pw0 pw0Var = (pw0) sc2.m6070n(hg1Var);
        c1662ze.f13377a = pw0Var;
        c1662ze.f13378b = yv1.m7155c(((ow0) pw0Var.f7397b).f8501a);
        return c1662ze;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C1662ze) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C1662ze) key).getEncoded());
            }
        } else {
            if (!(key instanceof C0016af)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C0016af) key).getEncoded());
            }
        }
        ca0.m1177i(cls, "Unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C1662ze) || (key instanceof C0016af)) {
            return key;
        }
        l41.m4039h("Unsupported key type");
        return null;
    }
}
