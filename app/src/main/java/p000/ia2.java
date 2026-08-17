package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ia2 extends la2 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f4904e = new PathInterpolator(TouchPipeline.SIZE, 1.1f, TouchPipeline.SIZE, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final p90 f4905f = new p90(0);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f4906g = new DecelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public static void m3404e(View view) {
        lj0 lj0VarM3409j = m3409j(view);
        if (lj0VarM3409j != null) {
            ((View) lj0VarM3409j.f6365d).setTranslationY(TouchPipeline.SIZE);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3404e(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3405f(View view, WindowInsets windowInsets, boolean z) {
        lj0 lj0VarM3409j = m3409j(view);
        if (lj0VarM3409j != null) {
            lj0VarM3409j.f6364c = windowInsets;
            if (!z) {
                View view2 = (View) lj0VarM3409j.f6365d;
                int[] iArr = (int[]) lj0VarM3409j.f6366e;
                view2.getLocationOnScreen(iArr);
                z = true;
                lj0VarM3409j.f6362a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3405f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3406g(View view, bb2 bb2Var, List list) {
        lj0 lj0VarM3409j = m3409j(view);
        if (lj0VarM3409j != null) {
            lj0VarM3409j.m4222c(bb2Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3406g(viewGroup.getChildAt(i), bb2Var, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m3407h(View view, fa2 fa2Var) {
        lj0 lj0VarM3409j = m3409j(view);
        if (lj0VarM3409j != null) {
            View view2 = (View) lj0VarM3409j.f6365d;
            int[] iArr = (int[]) lj0VarM3409j.f6366e;
            view2.getLocationOnScreen(iArr);
            int i = lj0VarM3409j.f6362a - iArr[1];
            lj0VarM3409j.f6363b = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m3407h(viewGroup.getChildAt(i2), fa2Var);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m3408i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static lj0 m3409j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ha2) {
            return ((ha2) tag).f4494a;
        }
        return null;
    }
}
