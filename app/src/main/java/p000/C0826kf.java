package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: kf */
/* JADX INFO: loaded from: classes3.dex */
public final class C0826kf implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient j71 f5787a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f5788b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0826kf) {
            return Arrays.equals(sc2.m6061e(this.f5787a.f5314c), sc2.m6061e(((C0826kf) obj).f5787a.f5314c));
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
            return AbstractC1337qm.m5545k(this.f5787a, this.f5788b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f5787a.f5314c));
    }
}
