package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: gf */
/* JADX INFO: loaded from: classes3.dex */
public final class C0675gf implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient j01 f4171a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0675gf) {
            return Arrays.equals(sc2.m6061e(this.f4171a.f5232c), sc2.m6061e(((C0675gf) obj).f4171a.f5232c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((h01) this.f4171a.f7397b).f4378a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f4171a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f4171a.f5232c));
    }
}
