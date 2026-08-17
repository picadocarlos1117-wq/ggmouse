package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: cf */
/* JADX INFO: loaded from: classes3.dex */
public final class C0133cf implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient fr0 f1779a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0133cf) {
            try {
                return Arrays.equals(this.f1779a.getEncoded(), ((C0133cf) obj).f1779a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f1779a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return sc2.m6079w(this.f1779a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
