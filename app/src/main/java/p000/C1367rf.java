package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: rf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1367rf implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient xt1 f10009a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f10010b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1367rf) {
            return Arrays.equals(sc2.m6061e(this.f10009a.f12722b), sc2.m6061e(((C1367rf) obj).f10009a.f12722b));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(this.f10009a.f12723c.f12336a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f10009a, this.f10010b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f10009a.f12722b));
    }
}
