package p000;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: xf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1589xf implements PrivateKey {

    /* JADX INFO: renamed from: a */
    public transient kc2 f12594a;

    /* JADX INFO: renamed from: b */
    public transient C1351r f12595b;

    /* JADX INFO: renamed from: c */
    public transient AbstractC0001a0 f12596c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1589xf) {
            C1589xf c1589xf = (C1589xf) obj;
            if (this.f12595b.m6676p(c1589xf.f12595b) && Arrays.equals(this.f12594a.m3817a(), c1589xf.f12594a.m3817a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f12594a, this.f12596c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (sc2.m6079w(this.f12594a.m3817a()) * 37) + sc2.m6079w(this.f12595b.f9640a);
    }
}
