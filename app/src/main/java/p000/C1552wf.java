package p000;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: wf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1552wf implements PublicKey {

    /* JADX INFO: renamed from: a */
    public transient C1351r f12120a;

    /* JADX INFO: renamed from: b */
    public transient fc2 f12121b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1552wf) {
            C1552wf c1552wf = (C1552wf) obj;
            if (this.f12120a.m6676p(c1552wf.f12120a) && Arrays.equals(this.f12121b.m2801a(), c1552wf.f12121b.m2801a())) {
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
            return sc2.m6071o(this.f12121b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (sc2.m6079w(this.f12121b.m2801a()) * 37) + sc2.m6079w(this.f12120a.f9640a);
    }
}
