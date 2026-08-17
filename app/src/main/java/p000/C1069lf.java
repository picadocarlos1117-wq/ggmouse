package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1069lf implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient k71 f6342a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1069lf) {
            return Arrays.equals(sc2.m6061e(this.f6342a.f5692c), sc2.m6061e(((C1069lf) obj).f6342a.f5692c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NTRU";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f6342a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f6342a.f5692c));
    }
}
