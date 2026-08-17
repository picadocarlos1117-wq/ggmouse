package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends zy0 {

    /* JADX INFO: renamed from: g */
    public final float f3929g;

    /* JADX INFO: renamed from: h */
    public final float f3930h;

    public fz0(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f3929g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f3930h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m2872a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f13609b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new p90(1));
        return animatorSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m2873b(float f) {
        float interpolation = this.f13608a.getInterpolation(f);
        View view = this.f13609b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= TouchPipeline.SIZE || height <= TouchPipeline.SIZE) {
            return;
        }
        float f2 = this.f3929g / width;
        float f3 = this.f3930h / height;
        float fM3568a = 1.0f - AbstractC0779j6.m3568a(TouchPipeline.SIZE, f2, interpolation);
        float fM3568a2 = 1.0f - AbstractC0779j6.m3568a(TouchPipeline.SIZE, f3, interpolation);
        view.setScaleX(fM3568a);
        view.setPivotY(height);
        view.setScaleY(fM3568a2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM3568a2 != TouchPipeline.SIZE ? fM3568a / fM3568a2 : 1.0f);
            }
        }
    }
}
