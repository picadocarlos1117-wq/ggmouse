package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.sousasantoslogic.sspro.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 {

    /* JADX INFO: renamed from: g */
    public static jl1 f5445g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f5447a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f5448b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f5449c;

    /* JADX INFO: renamed from: d */
    public boolean f5450d;

    /* JADX INFO: renamed from: e */
    public C1470u7 f5451e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f5444f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final il1 f5446h = new il1(6);

    /* JADX INFO: renamed from: b */
    public static synchronized jl1 m3659b() {
        try {
            if (f5445g == null) {
                f5445g = new jl1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5445g;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m3660e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        il1 il1Var = f5446h;
        il1Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) il1Var.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m3661a(Context context, int i) {
        LayerDrawable layerDrawableM6396g;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        if (this.f5449c == null) {
            this.f5449c = new TypedValue();
        }
        TypedValue typedValue = this.f5449c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            ew0 ew0Var = (ew0) this.f5448b.get(context);
            layerDrawableM6396g = null;
            if (ew0Var != null && (weakReference = (WeakReference) ew0Var.m2647c(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM5536f = AbstractC1337qm.m5536f(ew0Var.f3458d, j, ew0Var.f3456b);
                    if (iM5536f >= 0) {
                        Object[] objArr = ew0Var.f3457c;
                        Object obj = objArr[iM5536f];
                        Object obj2 = ew0.f3454e;
                        if (obj != obj2) {
                            objArr[iM5536f] = obj2;
                            ew0Var.f3455a = true;
                        }
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f5451e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM6396g = new LayerDrawable(new Drawable[]{m3662c(context, R.drawable.abc_cab_background_internal_bg), m3662c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM6396g = C1470u7.m6396g(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM6396g = C1470u7.m6396g(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM6396g = C1470u7.m6396g(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM6396g == null) {
            return layerDrawableM6396g;
        }
        layerDrawableM6396g.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM6396g.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableM6396g;
                }
                ew0 ew0Var2 = (ew0) this.f5448b.get(context);
                if (ew0Var2 == null) {
                    ew0Var2 = new ew0();
                    this.f5448b.put(context, ew0Var2);
                }
                ew0Var2.m2648d(j, new WeakReference(constantState2));
                return layerDrawableM6396g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m3662c(Context context, int i) {
        return m3663d(context, i, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m3663d(Context context, int i, boolean z) {
        Drawable drawableM3661a;
        try {
            if (!this.f5450d) {
                this.f5450d = true;
                Drawable drawableM3662c = m3662c(context, R.drawable.abc_vector_test);
                if (drawableM3662c == null || (!(drawableM3662c instanceof p52) && !"android.graphics.drawable.VectorDrawable".equals(drawableM3662c.getClass().getName()))) {
                    this.f5450d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM3661a = m3661a(context, i);
            if (drawableM3661a == null) {
                drawableM3661a = AbstractC0075au.getDrawable(context, i);
            }
            if (drawableM3661a != null) {
                drawableM3661a = m3665g(context, i, z, drawableM3661a);
            }
            if (drawableM3661a != null) {
                x30.m6864a(drawableM3661a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM3661a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m3664f(Context context, int i) {
        ColorStateList colorStateList;
        ju1 ju1Var;
        WeakHashMap weakHashMap = this.f5447a;
        ColorStateList colorStateListM6402h = null;
        colorStateList = (weakHashMap == null || (ju1Var = (ju1) weakHashMap.get(context)) == null) ? null : (ColorStateList) ju1Var.m3711b(i);
        if (colorStateList == null) {
            C1470u7 c1470u7 = this.f5451e;
            if (c1470u7 != null) {
                colorStateListM6402h = c1470u7.m6402h(context, i);
            }
            if (colorStateListM6402h != null) {
                if (this.f5447a == null) {
                    this.f5447a = new WeakHashMap();
                }
                ju1 ju1Var2 = (ju1) this.f5447a.get(context);
                if (ju1Var2 == null) {
                    ju1Var2 = new ju1();
                    this.f5447a.put(context, ju1Var2);
                }
                ju1Var2.m3710a(i, colorStateListM6402h);
            }
            colorStateList = colorStateListM6402h;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m3665g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        ColorStateList colorStateListM3664f = m3664f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM3664f != null) {
            int[] iArr = x30.f12436a;
            Drawable drawableMutate = drawable.mutate();
            v30.m6560h(drawableMutate, colorStateListM3664f);
            if (this.f5451e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                v30.m6561i(drawableMutate, mode);
            }
            return drawableMutate;
        }
        C1470u7 c1470u7 = this.f5451e;
        int i2 = R.attr.colorControlNormal;
        if (c1470u7 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM3087c = h02.m3087c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1507v7.f11569b;
                C1470u7.m6398j(drawableFindDrawableByLayerId, iM3087c, mode2);
                C1470u7.m6398j(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h02.m3087c(context, R.attr.colorControlNormal), mode2);
                C1470u7.m6398j(layerDrawable.findDrawableByLayerId(android.R.id.progress), h02.m3087c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM3086b = h02.m3086b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1507v7.f11569b;
                C1470u7.m6398j(drawableFindDrawableByLayerId2, iM3086b, mode3);
                C1470u7.m6398j(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h02.m3087c(context, R.attr.colorControlActivated), mode3);
                C1470u7.m6398j(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h02.m3087c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C1470u7 c1470u8 = this.f5451e;
        boolean z3 = false;
        if (c1470u8 != null) {
            PorterDuff.Mode mode4 = C1507v7.f11569b;
            if (C1470u7.m6393c((int[]) c1470u8.f11141a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (C1470u7.m6393c((int[]) c1470u8.f11143c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zM6393c = C1470u7.m6393c((int[]) c1470u8.f11144d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zM6393c) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                int[] iArr2 = x30.f12436a;
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(C1507v7.m6593c(h02.m3087c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
