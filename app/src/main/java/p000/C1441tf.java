package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: tf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1441tf implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient C1351r f10854a;

    /* JADX INFO: renamed from: b */
    public transient eo1 f10855b;

    /* JADX INFO: renamed from: c */
    public transient AbstractC0001a0 f10856c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1441tf) {
            C1441tf c1441tf = (C1441tf) obj;
            if (this.f10854a.m6676p(c1441tf.f10854a) && Arrays.equals(sc2.m6061e(this.f10855b.f3400c), sc2.m6061e(c1441tf.f10855b.f3400c))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            eo1 eo1Var = this.f10855b;
            String str = eo1Var.f5628b;
            return AbstractC1337qm.m5545k(eo1Var, this.f10856c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (sc2.m6079w(sc2.m6061e(this.f10855b.f3400c)) * 37) + sc2.m6079w(this.f10854a.f9640a);
    }
}
