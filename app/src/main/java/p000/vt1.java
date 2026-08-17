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
public final class vt1 extends AbstractC0750ih {

    /* JADX INFO: renamed from: b */
    public static final HashSet f11767b;

    static {
        HashSet hashSet = new HashSet();
        f11767b = hashSet;
        hashSet.add(InterfaceC1106mf.f6909f2);
        hashSet.add(InterfaceC1106mf.f6913g2);
        hashSet.add(InterfaceC1106mf.f6917h2);
        hashSet.add(InterfaceC1106mf.f6921i2);
        hashSet.add(InterfaceC1106mf.f6925j2);
        hashSet.add(InterfaceC1106mf.f6929k2);
        hashSet.add(InterfaceC1106mf.f6933l2);
        hashSet.add(InterfaceC1106mf.f6937m2);
        hashSet.add(InterfaceC1106mf.f6941n2);
        hashSet.add(InterfaceC1106mf.f6945o2);
        hashSet.add(InterfaceC1106mf.f6949p2);
        hashSet.add(InterfaceC1106mf.f6953q2);
        hashSet.add(InterfaceC1106mf.f6957r2);
        hashSet.add(InterfaceC1106mf.f6961s2);
        hashSet.add(InterfaceC1106mf.f6965t2);
        hashSet.add(InterfaceC1106mf.f6969u2);
        hashSet.add(InterfaceC1106mf.f6973v2);
        hashSet.add(InterfaceC1106mf.f6977w2);
        hashSet.add(InterfaceC1106mf.f6981x2);
        hashSet.add(InterfaceC1106mf.f6985y2);
        hashSet.add(InterfaceC1106mf.f6989z2);
        hashSet.add(InterfaceC1106mf.f6788A2);
        hashSet.add(InterfaceC1106mf.f6792B2);
        hashSet.add(InterfaceC1106mf.f6796C2);
        hashSet.add(InterfaceC1106mf.f6800D2);
        hashSet.add(InterfaceC1106mf.f6804E2);
        hashSet.add(InterfaceC1106mf.f6808F2);
        hashSet.add(InterfaceC1106mf.f6812G2);
        hashSet.add(InterfaceC1106mf.f6816H2);
        hashSet.add(InterfaceC1106mf.f6820I2);
        hashSet.add(InterfaceC1106mf.f6824J2);
        hashSet.add(InterfaceC1106mf.f6828K2);
        hashSet.add(InterfaceC1106mf.f6832L2);
        hashSet.add(InterfaceC1106mf.f6836M2);
        hashSet.add(InterfaceC1106mf.f6840N2);
        hashSet.add(InterfaceC1106mf.f6844O2);
        hashSet.add(InterfaceC1106mf.f6848P2);
        hashSet.add(InterfaceC1106mf.f6852Q2);
        hashSet.add(InterfaceC1106mf.f6856R2);
        hashSet.add(InterfaceC1106mf.f6860S2);
        hashSet.add(InterfaceC1106mf.f6864T2);
        hashSet.add(InterfaceC1106mf.f6868U2);
        hashSet.add(InterfaceC1106mf.f6872V2);
        hashSet.add(InterfaceC1106mf.f6876W2);
    }

    public vt1() {
        super(f11767b);
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        C1404sf c1404sf = new C1404sf();
        c1404sf.f10397a = (yt1) xh1.m6929a(ox1Var);
        return c1404sf;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        C1367rf c1367rf = new C1367rf();
        c1367rf.f10010b = hg1Var.f4563d;
        c1367rf.f10009a = (xt1) sc2.m6070n(hg1Var);
        return c1367rf;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C1367rf) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C1367rf) key).getEncoded());
            }
        } else {
            if (!(key instanceof C1404sf)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C1404sf) key).getEncoded());
            }
        }
        ca0.m1177i(cls, "Unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C1367rf) || (key instanceof C1404sf)) {
            return key;
        }
        l41.m4039h("Unsupported key type");
        return null;
    }
}
