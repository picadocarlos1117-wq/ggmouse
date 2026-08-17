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
public final class m20 extends AbstractC0750ih {

    /* JADX INFO: renamed from: b */
    public static final HashSet f6593b;

    static {
        HashSet hashSet = new HashSet();
        f6593b = hashSet;
        hashSet.add(InterfaceC1106mf.f6967u0);
        hashSet.add(InterfaceC1106mf.f6971v0);
        hashSet.add(InterfaceC1106mf.f6975w0);
        hashSet.add(InterfaceC1106mf.f6979x0);
        hashSet.add(InterfaceC1106mf.f6983y0);
        hashSet.add(InterfaceC1106mf.f6987z0);
    }

    public m20() {
        super(f6593b);
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        C1477ue c1477ue = new C1477ue();
        p20 p20Var = (p20) xh1.m6929a(ox1Var);
        c1477ue.f11270a = p20Var;
        c1477ue.f11271b = yv1.m7155c(((n20) p20Var.f7397b).f7177b);
        return c1477ue;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        C1440te c1440te = new C1440te();
        o20 o20Var = (o20) sc2.m6070n(hg1Var);
        c1440te.f10850d = hg1Var.f4563d;
        c1440te.f10847a = o20Var;
        c1440te.f10848b = yv1.m7155c(((n20) o20Var.f7397b).f7177b);
        return c1440te;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C1440te) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C1440te) key).getEncoded());
            }
        } else {
            if (!(key instanceof C1477ue)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C1477ue) key).getEncoded());
            }
        }
        ca0.m1177i(cls, "Unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C1440te) || (key instanceof C1477ue)) {
            return key;
        }
        l41.m4039h("Unsupported key type");
        return null;
    }
}
