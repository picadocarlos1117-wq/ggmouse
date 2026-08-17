package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: nf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1143nf implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient bd1 f7394a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f7395b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1143nf) {
            return Arrays.equals(sc2.m6061e(this.f7394a.f1313c), sc2.m6061e(((C1143nf) obj).f7394a.f1313c));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Picnic";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f7394a, this.f7395b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f7394a.f1313c));
    }
}
