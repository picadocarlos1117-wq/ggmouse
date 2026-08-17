package p000;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: ue */
/* JADX INFO: loaded from: classes3.dex */
public final class C1477ue implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient p20 f11270a;

    /* JADX INFO: renamed from: b */
    public transient String f11271b;

    /* JADX INFO: renamed from: c */
    public transient byte[] f11272c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1477ue) {
            return Arrays.equals(getEncoded(), ((C1477ue) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f11271b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f11272c == null) {
            this.f11272c = ki0.m3873u(this.f11270a);
        }
        return sc2.m6061e(this.f11272c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(getEncoded());
    }
}
