package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0779j6 {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f5284a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final p90 f5285b = new p90(1);

    /* JADX INFO: renamed from: c */
    public static final p90 f5286c = new p90(0);

    /* JADX INFO: renamed from: d */
    public static final p90 f5287d = new p90(p90.f8814e);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m3568a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m3569b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : m3568a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: c */
    public static int m3570c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
