package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 {

    /* JADX INFO: renamed from: a */
    public final int f8404a;

    /* JADX INFO: renamed from: b */
    public final int f8405b;

    /* JADX INFO: renamed from: c */
    public final int f8406c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f8407d;

    public om1(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f8407d = atomicInteger;
        this.f8406c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.f8404a = i;
        this.f8405b = i / 2;
        atomicInteger.set(i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5042a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f8407d;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.f8405b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om1)) {
            return false;
        }
        om1 om1Var = (om1) obj;
        return this.f8404a == om1Var.f8404a && this.f8406c == om1Var.f8406c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8404a), Integer.valueOf(this.f8406c)});
    }
}
