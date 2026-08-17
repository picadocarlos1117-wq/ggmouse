package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: xe */
/* JADX INFO: loaded from: classes3.dex */
public final class C1588xe implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient pj0 f12586a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f12587b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1588xe) {
            return Arrays.equals(sc2.m6061e(this.f12586a.f8910c), sc2.m6061e(((C1588xe) obj).f12586a.f8910c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((oj0) this.f12586a.f7397b).f7826a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f12586a, this.f12587b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f12586a.f8910c));
    }
}
