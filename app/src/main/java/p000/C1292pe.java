package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: pe */
/* JADX INFO: loaded from: classes3.dex */
public final class C1292pe implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient C1294pg f8864a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f8865b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1292pe) {
            return Arrays.equals(this.f8864a.getEncoded(), ((C1292pe) obj).f8864a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return yv1.m7155c(((C1181og) this.f8864a.f7397b).f7788a);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f8864a, this.f8865b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(this.f8864a.getEncoded());
    }
}
