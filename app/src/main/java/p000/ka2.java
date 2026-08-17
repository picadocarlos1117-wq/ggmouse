package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ka2 extends la2 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f5729e;

    public ka2(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f5729e = windowInsetsAnimation;
    }

    @Override // p000.la2
    /* JADX INFO: renamed from: a */
    public final long mo3813a() {
        return this.f5729e.getDurationMillis();
    }

    @Override // p000.la2
    /* JADX INFO: renamed from: b */
    public final float mo3814b() {
        return this.f5729e.getInterpolatedFraction();
    }

    @Override // p000.la2
    /* JADX INFO: renamed from: c */
    public final int mo3815c() {
        return this.f5729e.getTypeMask();
    }

    @Override // p000.la2
    /* JADX INFO: renamed from: d */
    public final void mo3816d(float f) {
        this.f5729e.setFraction(f);
    }
}
