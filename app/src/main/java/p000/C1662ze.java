package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: ze */
/* JADX INFO: loaded from: classes3.dex */
public final class C1662ze implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient pw0 f13377a;

    /* JADX INFO: renamed from: b */
    public transient String f13378b;

    /* JADX INFO: renamed from: c */
    public transient AbstractC0001a0 f13379c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1662ze) {
            return Arrays.equals(getEncoded(), ((C1662ze) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f13378b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f13377a, this.f13379c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(getEncoded());
    }
}
