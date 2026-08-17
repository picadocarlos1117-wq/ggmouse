package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: hf */
/* JADX INFO: loaded from: classes3.dex */
public final class C0712hf implements Key, PrivateKey {

    /* JADX INFO: renamed from: a */
    public transient c71 f4555a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC0001a0 f4556b;

    public final boolean equals(Object obj) {
        if (obj instanceof C0712hf) {
            return Arrays.equals(sc2.m6062f(this.f4555a.f1698b), sc2.m6062f(((C0712hf) obj).f4555a.f1698b));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f4555a, this.f4556b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        short[] sArrM6062f = sc2.m6062f(this.f4555a.f1698b);
        if (sArrM6062f == null) {
            return 0;
        }
        int length = sArrM6062f.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArrM6062f[length] & 255);
        }
    }
}
