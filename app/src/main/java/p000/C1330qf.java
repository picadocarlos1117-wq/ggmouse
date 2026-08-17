package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: qf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1330qf implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient do1 f9493a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1330qf)) {
            return false;
        }
        kk0 kk0Var = this.f9493a.f2985c;
        byte[] bArrM6064h = sc2.m6064h(kk0Var.f5894a, kk0Var.f5895b);
        kk0 kk0Var2 = ((C1330qf) obj).f9493a.f2985c;
        return Arrays.equals(bArrM6064h, sc2.m6064h(kk0Var2.f5894a, kk0Var2.f5895b));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+-".concat(yv1.m7155c(((bo1) this.f9493a.f7397b).f1496b));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f9493a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        kk0 kk0Var = this.f9493a.f2985c;
        return sc2.m6079w(sc2.m6064h(kk0Var.f5894a, kk0Var.f5895b));
    }
}
