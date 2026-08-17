package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: of */
/* JADX INFO: loaded from: classes3.dex */
public final class C1180of implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient cd1 f7771a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1180of) {
            return Arrays.equals(sc2.m6061e(this.f7771a.f1776c), sc2.m6061e(((C1180of) obj).f7771a.f1776c));
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
            return sc2.m6071o(this.f7771a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(sc2.m6061e(this.f7771a.f1776c));
    }
}
