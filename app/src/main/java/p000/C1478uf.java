package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: uf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1478uf implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient C1351r f11280a;

    /* JADX INFO: renamed from: b */
    public transient fo1 f11281b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1478uf) {
            C1478uf c1478uf = (C1478uf) obj;
            if (this.f11280a.m6676p(c1478uf.f11280a) && Arrays.equals(sc2.m6061e(this.f11281b.f3866c), sc2.m6061e(c1478uf.f11281b.f3866c))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            fo1 fo1Var = this.f11281b;
            String str = fo1Var.f5628b;
            return sc2.m6071o(fo1Var).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (sc2.m6079w(sc2.m6061e(this.f11281b.f3866c)) * 37) + sc2.m6079w(this.f11280a.f9640a);
    }
}
