package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: qe */
/* JADX INFO: loaded from: classes3.dex */
public final class C1329qe implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient C1331qg f9487a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1329qe) {
            return Arrays.equals(sc2.m6061e(this.f9487a.f9496c), sc2.m6061e(((C1329qe) obj).f9487a.f9496c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((C1181og) this.f9487a.f7397b).f7788a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f9487a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f9487a.f9496c));
    }
}
