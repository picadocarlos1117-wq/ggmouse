package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: cz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0548cz {

    /* JADX INFO: renamed from: a */
    public final byte[] f2681a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f2682b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final l91 f2683c = new l91(1);

    /* JADX INFO: renamed from: d */
    public pn0 f2684d;

    /* JADX INFO: renamed from: e */
    public int f2685e;

    /* JADX INFO: renamed from: f */
    public int f2686f;

    /* JADX INFO: renamed from: g */
    public long f2687g;

    /* JADX INFO: renamed from: a */
    public final long m2147a(y80 y80Var, int i) {
        byte[] bArr = this.f2681a;
        y80Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
