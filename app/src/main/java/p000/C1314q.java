package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes3.dex */
public final class C1314q {

    /* JADX INFO: renamed from: a */
    public final int f9245a;

    /* JADX INFO: renamed from: b */
    public final byte[] f9246b;

    public C1314q(byte[] bArr) {
        this.f9245a = sc2.m6079w(bArr);
        this.f9246b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1314q)) {
            return false;
        }
        return Arrays.equals(this.f9246b, ((C1314q) obj).f9246b);
    }

    public final int hashCode() {
        return this.f9245a;
    }
}
