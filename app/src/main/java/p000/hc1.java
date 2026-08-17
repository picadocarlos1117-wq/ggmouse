package p000;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hc1 {
    /* JADX INFO: renamed from: a */
    public static PathInterpolator m3126a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static PathInterpolator m3127b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public static PathInterpolator m3128c(Path path) {
        return new PathInterpolator(path);
    }
}
