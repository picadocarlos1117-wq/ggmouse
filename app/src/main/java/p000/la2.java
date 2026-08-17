package p000;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class la2 {

    /* JADX INFO: renamed from: a */
    public final int f6287a;

    /* JADX INFO: renamed from: b */
    public float f6288b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f6289c;

    /* JADX INFO: renamed from: d */
    public final long f6290d;

    public la2(int i, Interpolator interpolator, long j) {
        this.f6287a = i;
        this.f6289c = interpolator;
        this.f6290d = j;
    }

    /* JADX INFO: renamed from: a */
    public long mo3813a() {
        return this.f6290d;
    }

    /* JADX INFO: renamed from: b */
    public float mo3814b() {
        float f = this.f6288b;
        Interpolator interpolator = this.f6289c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* JADX INFO: renamed from: c */
    public int mo3815c() {
        return this.f6287a;
    }

    /* JADX INFO: renamed from: d */
    public void mo3816d(float f) {
        this.f6288b = f;
    }
}
