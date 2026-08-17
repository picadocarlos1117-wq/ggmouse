package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: pl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1299pl extends ws0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f8931q = 1;

    public /* synthetic */ C1299pl(Context context) {
        super(context);
    }

    @Override // p000.ws0
    /* JADX INFO: renamed from: b */
    public int mo5276b(View view, int i) {
        switch (this.f8931q) {
            case 0:
                return 0;
            default:
                return super.mo5276b(view, i);
        }
    }

    @Override // p000.ws0
    /* JADX INFO: renamed from: c */
    public int mo5277c(View view, int i) {
        switch (this.f8931q) {
            case 0:
                return 0;
            default:
                return super.mo5277c(view, i);
        }
    }

    @Override // p000.ws0
    /* JADX INFO: renamed from: d */
    public float mo5278d(DisplayMetrics displayMetrics) {
        switch (this.f8931q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo5278d(displayMetrics);
        }
    }

    @Override // p000.ws0
    /* JADX INFO: renamed from: f */
    public PointF mo5279f(int i) {
        switch (this.f8931q) {
            case 0:
                return null;
            default:
                return super.mo5279f(i);
        }
    }

    public C1299pl(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
