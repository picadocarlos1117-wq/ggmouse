package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: pf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1293pf implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient co1 f8871a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f8872b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1293pf) {
            return Arrays.equals(this.f8871a.getEncoded(), ((C1293pf) obj).f8871a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f8871a, this.f8872b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(this.f8871a.getEncoded());
    }
}
