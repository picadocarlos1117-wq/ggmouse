package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s60 {

    /* JADX INFO: renamed from: a */
    public final t60 f10248a;

    /* JADX INFO: renamed from: b */
    public final byte[] f10249b;

    public s60(t60 t60Var, byte[] bArr) {
        if (t60Var == null) {
            l41.m4051t("encoding is null");
            throw null;
        }
        if (bArr == null) {
            l41.m4051t("bytes is null");
            throw null;
        }
        this.f10248a = t60Var;
        this.f10249b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s60)) {
            return false;
        }
        s60 s60Var = (s60) obj;
        if (this.f10248a.equals(s60Var.f10248a)) {
            return Arrays.equals(this.f10249b, s60Var.f10249b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10249b) ^ ((this.f10248a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f10248a + ", bytes=[...]}";
    }
}
