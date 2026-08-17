package p000;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: yf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1626yf implements PublicKey {

    /* JADX INFO: renamed from: a */
    public transient mc2 f12972a;

    /* JADX INFO: renamed from: b */
    public transient C1351r f12973b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1626yf) {
            C1626yf c1626yf = (C1626yf) obj;
            try {
                if (this.f12973b.m6676p(c1626yf.f12973b) && Arrays.equals(this.f12972a.getEncoded(), c1626yf.f12972a.getEncoded())) {
                    return true;
                }
            } catch (IOException unused) {
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
            return sc2.m6071o(this.f12972a).getEncoded();
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
            return (sc2.m6079w(this.f12972a.getEncoded()) * 37) + sc2.m6079w(this.f12973b.f9640a);
        } catch (IOException unused) {
            return sc2.m6079w(this.f12973b.f9640a);
        }
    }
}
