package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: bf */
/* JADX INFO: loaded from: classes3.dex */
public final class C0097bf implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient fr0 f1355a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f1356b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0097bf) {
            try {
                return Arrays.equals(this.f1355a.getEncoded(), ((C0097bf) obj).f1355a.getEncoded());
            } catch (IOException unused) {
                f40.m2719o("unable to perform equals");
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
            return AbstractC1337qm.m5545k(this.f1355a, this.f1356b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        try {
            return sc2.m6079w(this.f1355a.getEncoded());
        } catch (IOException unused) {
            f40.m2719o("unable to calculate hashCode");
            return 0;
        }
    }
}
