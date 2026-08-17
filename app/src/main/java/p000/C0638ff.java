package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: ff */
/* JADX INFO: loaded from: classes3.dex */
public final class C0638ff implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient i01 f3774a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f3775b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0638ff) {
            return Arrays.equals(sc2.m6061e(this.f3774a.f4762c), sc2.m6061e(((C0638ff) obj).f3774a.f4762c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((h01) this.f3774a.f7397b).f4378a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f3774a, this.f3775b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f3774a.f4762c));
    }
}
