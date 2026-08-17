package p000;

import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: ve */
/* JADX INFO: loaded from: classes3.dex */
public final class C1514ve implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient k90 f11640a;

    /* JADX INFO: renamed from: b */
    public transient String f11641b;

    /* JADX INFO: renamed from: c */
    public transient byte[] f11642c;

    /* JADX INFO: renamed from: d */
    public transient AbstractC0001a0 f11643d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1514ve) {
            return Arrays.equals(getEncoded(), ((C1514ve) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f11641b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f11642c == null) {
            k90 k90Var = this.f11640a;
            AbstractC0001a0 abstractC0001a0 = this.f11643d;
            byte[] bArrM4629i = null;
            if (!k90Var.f10330a) {
                f40.m2713i("public key found");
                return null;
            }
            try {
                bArrM4629i = AbstractC1337qm.m5545k(k90Var, abstractC0001a0).m4629i();
            } catch (Exception unused) {
            }
            this.f11642c = bArrM4629i;
        }
        return sc2.m6061e(this.f11642c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(getEncoded());
    }
}
