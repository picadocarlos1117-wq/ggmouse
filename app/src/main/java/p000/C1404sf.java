package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: sf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1404sf implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient yt1 f10397a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1404sf) {
            return Arrays.equals(sc2.m6061e(this.f10397a.f13145b), sc2.m6061e(((C1404sf) obj).f10397a.f13145b));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(this.f10397a.f13146c.f12336a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f10397a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f10397a.f13145b));
    }
}
