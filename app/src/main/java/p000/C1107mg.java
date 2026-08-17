package p000;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: mg */
/* JADX INFO: loaded from: classes3.dex */
public final class C1107mg extends KeyFactorySpi implements InterfaceC1362ra {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6991a;

    public /* synthetic */ C1107mg(int i) {
        this.f6991a = i;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        switch (this.f6991a) {
            case 0:
                C1329qe c1329qe = new C1329qe();
                c1329qe.f9487a = (C1331qg) xh1.m6929a(ox1Var);
                return c1329qe;
            case 1:
                C1403se c1403se = new C1403se();
                c1403se.f10394a = (C1335qk) xh1.m6929a(ox1Var);
                return c1403se;
            case 2:
                C0133cf c0133cf = new C0133cf();
                c0133cf.f1779a = (fr0) xh1.m6929a(ox1Var);
                return c0133cf;
            case 3:
                C0788jf c0788jf = new C0788jf();
                c0788jf.f5378a = (d71) xh1.m6929a(ox1Var);
                return c0788jf;
            case 4:
                C1069lf c1069lf = new C1069lf();
                c1069lf.f6342a = (k71) xh1.m6929a(ox1Var);
                return c1069lf;
            case 5:
                C1180of c1180of = new C1180of();
                c1180of.f7771a = (cd1) xh1.m6929a(ox1Var);
                return c1180of;
            case 6:
                C1330qf c1330qf = new C1330qf();
                c1330qf.f9493a = (do1) xh1.m6929a(ox1Var);
                return c1330qf;
            case 7:
                C1478uf c1478uf = new C1478uf();
                c1478uf.f11280a = yn1.m7101j(ox1Var.f8571a.f10751b).f13035b.f10750a;
                c1478uf.f11281b = (fo1) xh1.m6929a(ox1Var);
                return c1478uf;
            case 8:
                C1626yf c1626yf = new C1626yf();
                mc2 mc2Var = (mc2) xh1.m6929a(ox1Var);
                c1626yf.f12972a = mc2Var;
                c1626yf.f12973b = AbstractC1337qm.m5558u(mc2Var.f5628b);
                return c1626yf;
            default:
                C1552wf c1552wf = new C1552wf();
                fc2 fc2Var = (fc2) xh1.m6929a(ox1Var);
                c1552wf.f12121b = fc2Var;
                c1552wf.f12120a = AbstractC1337qm.m5558u(fc2Var.f5628b);
                return c1552wf;
        }
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        switch (this.f6991a) {
            case 0:
                C1292pe c1292pe = new C1292pe();
                c1292pe.f8865b = hg1Var.f4563d;
                c1292pe.f8864a = (C1294pg) sc2.m6070n(hg1Var);
                return c1292pe;
            case 1:
                C1366re c1366re = new C1366re();
                c1366re.f9914b = hg1Var.f4563d;
                c1366re.f9913a = (C1185ok) sc2.m6070n(hg1Var);
                return c1366re;
            case 2:
                C0097bf c0097bf = new C0097bf();
                c0097bf.f1356b = hg1Var.f4563d;
                c0097bf.f1355a = (fr0) sc2.m6070n(hg1Var);
                return c0097bf;
            case 3:
                C0712hf c0712hf = new C0712hf();
                c0712hf.f4556b = hg1Var.f4563d;
                c0712hf.f4555a = (c71) sc2.m6070n(hg1Var);
                return c0712hf;
            case 4:
                C0826kf c0826kf = new C0826kf();
                c0826kf.f5788b = hg1Var.f4563d;
                c0826kf.f5787a = (j71) sc2.m6070n(hg1Var);
                return c0826kf;
            case 5:
                C1143nf c1143nf = new C1143nf();
                c1143nf.f7395b = hg1Var.f4563d;
                c1143nf.f7394a = (bd1) sc2.m6070n(hg1Var);
                return c1143nf;
            case 6:
                C1293pf c1293pf = new C1293pf();
                c1293pf.f8872b = hg1Var.f4563d;
                c1293pf.f8871a = (co1) sc2.m6070n(hg1Var);
                return c1293pf;
            case 7:
                C1441tf c1441tf = new C1441tf();
                c1441tf.f10856c = hg1Var.f4563d;
                c1441tf.f10854a = yn1.m7101j(hg1Var.f4561b.f10751b).f13035b.f10750a;
                c1441tf.f10855b = (eo1) sc2.m6070n(hg1Var);
                return c1441tf;
            case 8:
                C1589xf c1589xf = new C1589xf();
                c1589xf.f12596c = hg1Var.f4563d;
                c1589xf.f12595b = yb2.m7077j(hg1Var.f4561b.f10751b).f12934c.f10750a;
                c1589xf.f12594a = (kc2) sc2.m6070n(hg1Var);
                return c1589xf;
            default:
                C1515vf c1515vf = new C1515vf();
                c1515vf.f11649c = hg1Var.f4563d;
                c1515vf.f11647a = zb2.m7301j(hg1Var.f4561b.f10751b).f13339d.f10750a;
                c1515vf.f11648b = (dc2) sc2.m6070n(hg1Var);
                return c1515vf;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.f6991a) {
            case 0:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e) {
                        ca0.m1176h(e);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 1:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e2) {
                        ca0.m1176h(e2);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 2:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e3) {
                        throw new InvalidKeySpecException(e3.toString(), e3);
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            case 3:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e4) {
                        ca0.m1176h(e4);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 4:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e5) {
                        ca0.m1176h(e5);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 5:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e6) {
                        ca0.m1176h(e6);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 6:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e7) {
                        ca0.m1176h(e7);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 7:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e8) {
                        ca0.m1176h(e8);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 8:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e9) {
                        ca0.m1176h(e9);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            default:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return mo1042b(hg1.m3143j(AbstractC1536w.m6675q(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e10) {
                        ca0.m1176h(e10);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.f6991a) {
            case 0:
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
            case 1:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e2) {
                    ca0.m1176h(e2);
                    return null;
                }
            case 2:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e3) {
                    throw new InvalidKeySpecException(e3.toString(), e3);
                }
            case 3:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e4) {
                    ca0.m1176h(e4);
                    return null;
                }
            case 4:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e5) {
                    ca0.m1176h(e5);
                    return null;
                }
            case 5:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e6) {
                    ca0.m1176h(e6);
                    return null;
                }
            case 6:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e7) {
                    ca0.m1176h(e7);
                    return null;
                }
            case 7:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e8) {
                    ca0.m1176h(e8);
                    return null;
                }
            case 8:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e9) {
                    ca0.m1176h(e9);
                    return null;
                }
            default:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    ca0.m1177i(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return mo1041a(ox1.m5086j(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e10) {
                    ca0.m1176h(e10);
                    return null;
                }
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        switch (this.f6991a) {
            case 0:
                if (key instanceof C1292pe) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C1292pe) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1329qe)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1329qe) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "Unknown key specification: ");
                return null;
            case 1:
                if (key instanceof C1366re) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C1366re) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1403se)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1403se) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "Unknown key specification: ");
                return null;
            case 2:
                if (key instanceof C0097bf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C0097bf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C0133cf)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C0133cf) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "unknown key specification: ");
                return null;
            case 3:
                if (key instanceof C0712hf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C0712hf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C0788jf)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C0788jf) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "Unknown key specification: ");
                return null;
            case 4:
                if (key instanceof C0826kf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C0826kf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1069lf)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1069lf) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "Unknown key specification: ");
                return null;
            case 5:
                if (key instanceof C1143nf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C1143nf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1180of)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1180of) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "Unknown key specification: ");
                return null;
            case 6:
                if (key instanceof C1293pf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C1293pf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1330qf)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1330qf) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "Unknown key specification: ");
                return null;
            case 7:
                if (key instanceof C1441tf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C1441tf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1478uf)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1478uf) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "Unknown key specification: ");
                return null;
            case 8:
                if (key instanceof C1589xf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C1589xf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1626yf)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1626yf) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "unknown key specification: ");
                return null;
            default:
                if (key instanceof C1515vf) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((C1515vf) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof C1552wf)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((C1552wf) key).getEncoded());
                    }
                }
                ca0.m1177i(cls, "unknown key specification: ");
                return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        switch (this.f6991a) {
            case 0:
                if ((key instanceof C1292pe) || (key instanceof C1329qe)) {
                    return key;
                }
                l41.m4039h("Unsupported key type");
                return null;
            case 1:
                if ((key instanceof C1366re) || (key instanceof C1403se)) {
                    return key;
                }
                l41.m4039h("Unsupported key type");
                return null;
            case 2:
                if ((key instanceof C0097bf) || (key instanceof C0133cf)) {
                    return key;
                }
                l41.m4039h("unsupported key type");
                return null;
            case 3:
                if ((key instanceof C0712hf) || (key instanceof C0788jf)) {
                    return key;
                }
                l41.m4039h("Unsupported key type");
                return null;
            case 4:
                if ((key instanceof C0826kf) || (key instanceof C1069lf)) {
                    return key;
                }
                l41.m4039h("Unsupported key type");
                return null;
            case 5:
                if ((key instanceof C1143nf) || (key instanceof C1180of)) {
                    return key;
                }
                l41.m4039h("Unsupported key type");
                return null;
            case 6:
                if ((key instanceof C1293pf) || (key instanceof C1330qf)) {
                    return key;
                }
                l41.m4039h("Unsupported key type");
                return null;
            case 7:
                if ((key instanceof C1441tf) || (key instanceof C1478uf)) {
                    return key;
                }
                l41.m4039h("Unsupported key type");
                return null;
            case 8:
                if ((key instanceof C1589xf) || (key instanceof C1626yf)) {
                    return key;
                }
                l41.m4039h("unsupported key type");
                return null;
            default:
                if ((key instanceof C1515vf) || (key instanceof C1552wf)) {
                    return key;
                }
                l41.m4039h("unsupported key type");
                return null;
        }
    }
}
