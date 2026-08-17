package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: kc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0823kc {

    /* JADX INFO: renamed from: e */
    public static final C0823kc f5741e = new C0823kc(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f5742a;

    /* JADX INFO: renamed from: b */
    public final int f5743b;

    /* JADX INFO: renamed from: c */
    public final int f5744c;

    /* JADX INFO: renamed from: d */
    public final int f5745d;

    public C0823kc(int i, int i2, int i3) {
        this.f5742a = i;
        this.f5743b = i2;
        this.f5744c = i3;
        this.f5745d = z42.m7213A(i3) ? z42.m7245s(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0823kc)) {
            return false;
        }
        C0823kc c0823kc = (C0823kc) obj;
        return this.f5742a == c0823kc.f5742a && this.f5743b == c0823kc.f5743b && this.f5744c == c0823kc.f5744c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5742a), Integer.valueOf(this.f5743b), Integer.valueOf(this.f5744c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f5742a + ", channelCount=" + this.f5743b + ", encoding=" + this.f5744c + ']';
    }
}
