package p000;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;

/* JADX INFO: renamed from: ih */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0750ih extends KeyFactorySpi implements InterfaceC1362ra {

    /* JADX INFO: renamed from: a */
    public final Set f5020a;

    public AbstractC0750ih(Set set) {
        this.f5020a = set;
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            hg1 hg1VarM3143j = hg1.m3143j(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            C1351r c1351r = hg1VarM3143j.f4561b.f10750a;
            if (this.f5020a.contains(c1351r)) {
                return mo1042b(hg1VarM3143j);
            }
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + c1351r);
        } catch (IllegalStateException e) {
            throw new InvalidKeySpecException(e.getMessage());
        } catch (InvalidKeySpecException e2) {
            throw e2;
        } catch (Exception e3) {
            ca0.m1176h(e3);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            ca0.m1177i(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            ox1 ox1VarM5086j = ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded());
            C1351r c1351r = ox1VarM5086j.f8571a.f10750a;
            if (this.f5020a.contains(c1351r)) {
                return mo1041a(ox1VarM5086j);
            }
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + c1351r);
        } catch (InvalidKeySpecException e) {
            throw e;
        } catch (Exception e2) {
            ca0.m1176h(e2);
            return null;
        }
    }
}
