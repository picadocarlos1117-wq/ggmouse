package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: re */
/* JADX INFO: loaded from: classes3.dex */
public final class C1366re implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient C1185ok f9913a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f9914b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1366re) {
            return Arrays.equals(sc2.m6061e(this.f9913a.f7827c), sc2.m6061e(((C1366re) obj).f9913a.f7827c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((C1111mk) this.f9913a.f7397b).f7024a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f9913a, this.f9914b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f9913a.f7827c));
    }
}
