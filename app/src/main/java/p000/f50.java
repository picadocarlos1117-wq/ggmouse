package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f50 {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m2721a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m2722b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return TouchPipeline.SIZE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m2723c(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return TouchPipeline.SIZE;
        }
    }
}
