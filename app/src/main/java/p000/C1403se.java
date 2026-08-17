package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: se */
/* JADX INFO: loaded from: classes3.dex */
public final class C1403se implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient C1335qk f10394a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1403se) {
            return Arrays.equals(sc2.m6061e(this.f10394a.f9518c), sc2.m6061e(((C1403se) obj).f10394a.f9518c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((C1111mk) this.f10394a.f7397b).f7024a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f10394a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f10394a.f9518c));
    }
}
