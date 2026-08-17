package p000;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: vf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1515vf implements PrivateKey {

    /* JADX INFO: renamed from: a */
    public transient C1351r f11647a;

    /* JADX INFO: renamed from: b */
    public transient dc2 f11648b;

    /* JADX INFO: renamed from: c */
    public transient AbstractC0001a0 f11649c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1515vf) {
            C1515vf c1515vf = (C1515vf) obj;
            if (this.f11647a.m6676p(c1515vf.f11647a) && Arrays.equals(this.f11648b.m2344a(), c1515vf.f11648b.m2344a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1337qm.m5545k(this.f11648b, this.f11649c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (sc2.m6079w(this.f11648b.m2344a()) * 37) + sc2.m6079w(this.f11647a.f9640a);
    }
}
