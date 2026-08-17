package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qd1 extends AbstractC1279p1 {
    @Override // p000.ri1
    /* JADX INFO: renamed from: f */
    public final int mo5485f(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p000.AbstractC1279p1
    /* JADX INFO: renamed from: g */
    public final Random mo4778g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
