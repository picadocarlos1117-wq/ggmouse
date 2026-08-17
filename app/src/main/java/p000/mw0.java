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
public final class mw0 extends AbstractC0750ih {

    /* JADX INFO: renamed from: b */
    public static final HashSet f7128b;

    static {
        HashSet hashSet = new HashSet();
        f7128b = hashSet;
        hashSet.add(e71.f3249N);
        hashSet.add(e71.f3250O);
        hashSet.add(e71.f3251P);
    }

    public mw0() {
        super(f7128b);
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: a */
    public final PublicKey mo1041a(ox1 ox1Var) {
        C0601ef c0601ef = new C0601ef();
        rw0 rw0Var = (rw0) xh1.m6929a(ox1Var);
        c0601ef.f3326a = rw0Var;
        c0601ef.f3327b = yv1.m7155c(nw0.m4619a(((ow0) rw0Var.f7397b).f8501a).f7566a);
        return c0601ef;
    }

    @Override // p000.InterfaceC1362ra
    /* JADX INFO: renamed from: b */
    public final PrivateKey mo1042b(hg1 hg1Var) {
        C0565df c0565df = new C0565df();
        c0565df.f2918c = hg1Var.f4563d;
        c0565df.f2919d = hg1Var.getEncoded();
        pw0 pw0Var = (pw0) sc2.m6070n(hg1Var);
        c0565df.f2916a = pw0Var;
        c0565df.f2917b = yv1.m7155c(nw0.m4619a(((ow0) pw0Var.f7397b).f8501a).f7566a);
        return c0565df;
    }

    @Override // p000.AbstractC0750ih, java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        pw0 pw0Var;
        if (!(keySpec instanceof qw0)) {
            return super.engineGeneratePrivate(keySpec);
        }
        qw0 qw0Var = (qw0) keySpec;
        byte[] bArr = qw0Var.f9592a;
        boolean z = qw0Var.f9595d;
        ow0 ow0Var = (ow0) a52.f62a.get(qw0Var.f9594c.f7566a);
        if (z) {
            if (!z) {
                f40.m2719o("KeySpec represents long form");
                return null;
            }
            pw0Var = new pw0(ow0Var, sc2.m6061e(bArr), null);
        } else {
            if (z) {
                f40.m2719o("KeySpec represents seed");
                return null;
            }
            pw0 pw0Var2 = new pw0(ow0Var, sc2.m6061e(bArr), null);
            if (z) {
                f40.m2719o("KeySpec represents long form");
                return null;
            }
            byte[] bArrM6061e = sc2.m6061e(qw0Var.f9593b);
            if (bArrM6061e != null && !sc2.m6066j(bArrM6061e, sc2.m6064h(pw0Var2.f9186f, pw0Var2.f9187g))) {
                throw new InvalidKeySpecException("public key data does not match private key data");
            }
            pw0Var = pw0Var2;
        }
        C0565df c0565df = new C0565df();
        c0565df.f2916a = pw0Var;
        c0565df.f2917b = yv1.m7155c(((ow0) pw0Var.f7397b).f8501a);
        return c0565df;
    }

    @Override // p000.AbstractC0750ih, java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof sw0)) {
            return super.engineGeneratePublic(keySpec);
        }
        sw0 sw0Var = (sw0) keySpec;
        rw0 rw0Var = new rw0((ow0) a52.f62a.get(sw0Var.f10568a.f7566a), sc2.m6061e(sw0Var.f10569b));
        C0601ef c0601ef = new C0601ef();
        c0601ef.f3326a = rw0Var;
        c0601ef.f3327b = yv1.m7155c(nw0.m4619a(((ow0) rw0Var.f7397b).f8501a).f7566a);
        return c0601ef;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C0565df) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((C0565df) key).getEncoded());
            }
            if (qw0.class.isAssignableFrom(cls)) {
                C0565df c0565df = (C0565df) key;
                byte[] bArrM6061e = sc2.m6061e(c0565df.f2916a.f9188m);
                pw0 pw0Var = c0565df.f2916a;
                if (bArrM6061e != null) {
                    return new qw0(nw0.m4619a(((ow0) pw0Var.f7397b).f8501a), bArrM6061e);
                }
                nw0 nw0VarM4619a = nw0.m4619a(((ow0) pw0Var.f7397b).f8501a);
                byte[] encoded = c0565df.f2916a.getEncoded();
                pw0 pw0Var2 = c0565df.f2916a;
                ow0 ow0Var = (ow0) pw0Var2.f7397b;
                byte[] bArr = pw0Var2.f9186f;
                byte[] bArr2 = pw0Var2.f9187g;
                byte[] bArrM6061e2 = sc2.m6061e(bArr);
                byte[] bArrM6061e3 = sc2.m6061e(bArr2);
                yv1.m7155c(nw0.m4619a(ow0Var.f8501a).f7566a);
                return new qw0(nw0VarM4619a, encoded, sc2.m6064h(bArrM6061e2, bArrM6061e3));
            }
            if (sw0.class.isAssignableFrom(cls)) {
                C0565df c0565df2 = (C0565df) key;
                nw0 nw0VarM4619a2 = nw0.m4619a(((ow0) c0565df2.f2916a.f7397b).f8501a);
                pw0 pw0Var3 = c0565df2.f2916a;
                ow0 ow0Var2 = (ow0) pw0Var3.f7397b;
                byte[] bArr3 = pw0Var3.f9186f;
                byte[] bArr4 = pw0Var3.f9187g;
                byte[] bArrM6061e4 = sc2.m6061e(bArr3);
                byte[] bArrM6061e5 = sc2.m6061e(bArr4);
                yv1.m7155c(nw0.m4619a(ow0Var2.f8501a).f7566a);
                return new sw0(nw0VarM4619a2, sc2.m6064h(bArrM6061e4, bArrM6061e5));
            }
        } else {
            if (!(key instanceof C0601ef)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((C0601ef) key).getEncoded());
            }
            if (sw0.class.isAssignableFrom(cls)) {
                C0601ef c0601ef = (C0601ef) key;
                return new sw0(nw0.m4619a(((ow0) c0601ef.f3326a.f7397b).f8501a), c0601ef.f3326a.getEncoded());
            }
        }
        ca0.m1177i(cls, "unknown key specification: ");
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C0565df) || (key instanceof C0601ef)) {
            return key;
        }
        l41.m4039h("unsupported key type");
        return null;
    }
}
