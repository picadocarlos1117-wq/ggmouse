package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: ef */
/* JADX INFO: loaded from: classes3.dex */
public final class C0601ef implements PublicKey, Key {

    /* JADX INFO: renamed from: a */
    public transient rw0 f3326a;

    /* JADX INFO: renamed from: b */
    public transient String f3327b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0601ef) {
            return Arrays.equals(getEncoded(), ((C0601ef) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f3327b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return sc2.m6071o(this.f3326a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return sc2.m6079w(getEncoded());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = yv1.f13156a;
        byte[] encoded = this.f3326a.getEncoded();
        sb.append(this.f3327b);
        sb.append(" Public Key [");
        rn1 rn1Var = new rn1(256);
        rn1Var.mo729e(0, encoded.length, encoded);
        byte[] bArr = new byte[20];
        rn1Var.m5864m(0, 20, bArr);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != 20; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            char[] cArr = hr1.f4688g;
            stringBuffer.append(cArr[(bArr[i] >>> 4) & 15]);
            stringBuffer.append(cArr[bArr[i] & 15]);
        }
        sb.append(stringBuffer.toString());
        sb.append("]");
        sb.append(str);
        sb.append("    public data: ");
        sb.append(yv1.m7153a(jk0.m3657b(encoded.length, encoded)));
        sb.append(str);
        return sb.toString();
    }
}
