package p000;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: af */
/* JADX INFO: loaded from: classes3.dex */
public final class C0016af implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient rw0 f212a;

    /* JADX INFO: renamed from: b */
    public transient String f213b;

    /* JADX INFO: renamed from: c */
    public transient byte[] f214c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0016af) {
            return Arrays.equals(getEncoded(), ((C0016af) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f213b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f214c == null) {
            this.f214c = ki0.m3873u(this.f212a);
        }
        return sc2.m6061e(this.f214c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(getEncoded());
    }
}
