package p000;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: we */
/* JADX INFO: loaded from: classes3.dex */
public final class C1551we implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient m90 f12087a;

    /* JADX INFO: renamed from: b */
    public transient String f12088b;

    /* JADX INFO: renamed from: c */
    public transient byte[] f12089c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1551we) {
            return Arrays.equals(getEncoded(), ((C1551we) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f12088b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f12089c == null) {
            this.f12089c = ki0.m3873u(this.f12087a);
        }
        return sc2.m6061e(this.f12089c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(getEncoded());
    }
}
