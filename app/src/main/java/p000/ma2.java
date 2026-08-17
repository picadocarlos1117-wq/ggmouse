package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 {

    /* JADX INFO: renamed from: a */
    public la2 f6733a;

    public ma2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6733a = new ka2(AbstractC1317q2.m5422l(i, interpolator, j));
        } else {
            this.f6733a = new ia2(i, interpolator, j);
        }
    }
}
