package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: jf */
/* JADX INFO: loaded from: classes3.dex */
public final class C0788jf implements Key, PublicKey {

    /* JADX INFO: renamed from: a */
    public transient d71 f5378a;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0788jf)) {
            return false;
        }
        return Arrays.equals(sc2.m6061e(this.f5378a.f2817b), sc2.m6061e(((C0788jf) obj).f5378a.f2817b));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f5378a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f5378a.f2817b));
    }
}
