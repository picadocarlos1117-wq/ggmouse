package p000;

import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: te */
/* JADX INFO: loaded from: classes3.dex */
public final class C1440te implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient o20 f10847a;

    /* JADX INFO: renamed from: b */
    public transient String f10848b;

    /* JADX INFO: renamed from: c */
    public transient byte[] f10849c;

    /* JADX INFO: renamed from: d */
    public transient AbstractC0001a0 f10850d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1440te) {
            return Arrays.equals(getEncoded(), ((C1440te) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f10848b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f10849c == null) {
            o20 o20Var = this.f10847a;
            AbstractC0001a0 abstractC0001a0 = this.f10850d;
            byte[] bArrM4629i = null;
            if (!o20Var.f10330a) {
                f40.m2713i("public key found");
                return null;
            }
            try {
                bArrM4629i = AbstractC1337qm.m5545k(o20Var, abstractC0001a0).m4629i();
            } catch (Exception unused) {
            }
            this.f10849c = bArrM4629i;
        }
        return sc2.m6061e(this.f10849c);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(getEncoded());
    }
}
