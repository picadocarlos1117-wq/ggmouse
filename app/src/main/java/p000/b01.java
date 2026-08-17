package p000;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b01 extends zy0 {

    /* JADX INFO: renamed from: g */
    public final float f1118g;

    /* JADX INFO: renamed from: h */
    public final float f1119h;

    /* JADX INFO: renamed from: i */
    public final float f1120i;

    public b01(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1118g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f1119h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f1120i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    /* JADX INFO: renamed from: a */
    public final void m818a(float f, boolean z, int i) {
        float interpolation = this.f13608a.getInterpolation(f);
        WeakHashMap weakHashMap = i72.f4849a;
        View view = this.f13609b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, t62.m6240d(view)) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > TouchPipeline.SIZE) {
            float f3 = height;
            if (f3 <= TouchPipeline.SIZE) {
                return;
            }
            float f4 = this.f1118g / f2;
            float f5 = this.f1119h / f2;
            float f6 = this.f1120i / f3;
            if (z2) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float fM3568a = AbstractC0779j6.m3568a(TouchPipeline.SIZE, f5, interpolation);
            float f7 = fM3568a + 1.0f;
            view.setScaleX(f7);
            float fM3568a2 = 1.0f - AbstractC0779j6.m3568a(TouchPipeline.SIZE, f6, interpolation);
            view.setScaleY(fM3568a2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - fM3568a : 1.0f;
                    float f9 = fM3568a2 != TouchPipeline.SIZE ? (f7 / fM3568a2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
