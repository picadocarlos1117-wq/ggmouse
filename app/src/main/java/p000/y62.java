package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y62 {
    /* JADX INFO: renamed from: a */
    public static void m7000a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static bb2 m7001b(View view, bb2 bb2Var, Rect rect) {
        WindowInsets windowInsetsM965f = bb2Var.m965f();
        if (windowInsetsM965f != null) {
            return bb2.m960g(view, view.computeSystemWindowInsets(windowInsetsM965f, rect));
        }
        rect.setEmpty();
        return bb2Var;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7002c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7003d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7004e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7005f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: g */
    public static ColorStateList m7006g(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m7007h(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: i */
    public static float m7008i(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: j */
    public static bb2 m7009j(View view) {
        ra2 pa2Var;
        if (na2.f7338d && view.isAttachedToWindow()) {
            try {
                Object obj = na2.f7335a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) na2.f7336b.get(obj);
                    Rect rect2 = (Rect) na2.f7337c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30) {
                            pa2Var = new qa2();
                        } else {
                            pa2Var = i >= 29 ? new pa2() : new oa2();
                        }
                        pa2Var.mo4788e(un0.m6514b(rect.left, rect.top, rect.right, rect.bottom));
                        pa2Var.mo4789g(un0.m6514b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        bb2 bb2VarMo4787b = pa2Var.mo4787b();
                        bb2VarMo4787b.f1285a.mo6023p(bb2VarMo4787b);
                        bb2VarMo4787b.f1285a.mo6017d(view.getRootView());
                        return bb2VarMo4787b;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static String m7010k(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: l */
    public static float m7011l(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: m */
    public static float m7012m(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7013n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m7014o(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m7015p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: q */
    public static void m7016q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: r */
    public static void m7017r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: s */
    public static void m7018s(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: t */
    public static void m7019t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: u */
    public static void m7020u(View view, ha1 ha1Var) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, ha1Var);
        }
        if (ha1Var == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new x62(view, ha1Var));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m7021v(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m7022w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: x */
    public static void m7023x(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m7024y(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* JADX INFO: renamed from: z */
    public static void m7025z(View view) {
        view.stopNestedScroll();
    }
}
