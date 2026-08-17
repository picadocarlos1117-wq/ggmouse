package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: cx */
/* JADX INFO: loaded from: classes3.dex */
public final class C0546cx {

    /* JADX INFO: renamed from: a */
    public final byte[] f2652a;

    /* JADX INFO: renamed from: b */
    public final int f2653b;

    public C0546cx(byte[] bArr, int i) {
        this.f2652a = sc2.m6061e(bArr);
        this.f2653b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0546cx)) {
            return false;
        }
        C0546cx c0546cx = (C0546cx) obj;
        if (c0546cx.f2653b != this.f2653b) {
            return false;
        }
        return Arrays.equals(this.f2652a, c0546cx.f2652a);
    }

    public final int hashCode() {
        return this.f2653b ^ sc2.m6079w(this.f2652a);
    }
}
