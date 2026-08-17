package p000;

import java.util.Random;

/* JADX INFO: renamed from: p1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1279p1 extends ri1 {
    @Override // p000.ri1
    /* JADX INFO: renamed from: a */
    public final int mo5097a(int i) {
        return (mo4778g().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // p000.ri1
    /* JADX INFO: renamed from: b */
    public final double mo5098b() {
        return mo4778g().nextDouble();
    }

    @Override // p000.ri1
    /* JADX INFO: renamed from: d */
    public final int mo5099d() {
        return mo4778g().nextInt();
    }

    @Override // p000.ri1
    /* JADX INFO: renamed from: e */
    public final int mo5100e(int i) {
        return mo4778g().nextInt(i);
    }

    /* JADX INFO: renamed from: g */
    public abstract Random mo4778g();
}
