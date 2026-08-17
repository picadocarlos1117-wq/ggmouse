package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: ye */
/* JADX INFO: loaded from: classes3.dex */
public final class C1625ye implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient qj0 f12966a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1625ye) {
            return Arrays.equals(sc2.m6061e(this.f12966a.f9514c), sc2.m6061e(((C1625ye) obj).f12966a.f9514c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((oj0) this.f12966a.f7397b).f7826a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f12966a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f12966a.f9514c));
    }
}
