package p000;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: renamed from: df */
/* JADX INFO: loaded from: classes3.dex */
public final class C0565df implements PrivateKey, Key {

    /* JADX INFO: renamed from: a */
    public transient pw0 f2916a;

    /* JADX INFO: renamed from: b */
    public transient String f2917b;

    /* JADX INFO: renamed from: c */
    public transient AbstractC0001a0 f2918c;

    /* JADX INFO: renamed from: d */
    public transient byte[] f2919d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0565df) {
            return Arrays.equals(this.f2916a.getEncoded(), ((C0565df) obj).f2916a.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f2917b;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            byte[] bArr = this.f2919d;
            return bArr != null ? bArr : AbstractC1337qm.m5545k(this.f2916a, this.f2918c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return sc2.m6079w(this.f2916a.getEncoded());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = yv1.f13156a;
        pw0 pw0Var = this.f2916a;
        byte[] bArrM6064h = sc2.m6064h(pw0Var.f9186f, pw0Var.f9187g);
        sb.append(this.f2917b);
        sb.append(" Private Key [");
        rn1 rn1Var = new rn1(256);
        rn1Var.mo729e(0, bArrM6064h.length, bArrM6064h);
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
        sb.append(yv1.m7153a(jk0.m3657b(bArrM6064h.length, bArrM6064h)));
        sb.append(str);
        return sb.toString();
    }
}
