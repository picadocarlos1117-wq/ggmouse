package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: v7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1507v7 {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f11569b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C1507v7 f11570c;

    /* JADX INFO: renamed from: a */
    public jl1 f11571a;

    /* JADX INFO: renamed from: a */
    public static synchronized C1507v7 m6592a() {
        try {
            if (f11570c == null) {
                m6594d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11570c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m6593c(int i, PorterDuff.Mode mode) {
        return jl1.m3660e(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m6594d() {
        if (f11570c == null) {
            C1507v7 c1507v7 = new C1507v7();
            f11570c = c1507v7;
            c1507v7.f11571a = jl1.m3659b();
            jl1 jl1Var = f11570c.f11571a;
            C1470u7 c1470u7 = new C1470u7();
            c1470u7.f11141a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            c1470u7.f11142b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c1470u7.f11143c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            c1470u7.f11144d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            c1470u7.f11145e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            c1470u7.f11146f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (jl1Var) {
                jl1Var.f5451e = c1470u7;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m6595e(Drawable drawable, C0577ds c0577ds, int[] iArr) {
        PorterDuff.Mode mode = jl1.f5444f;
        int[] state = drawable.getState();
        int[] iArr2 = x30.f12436a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c0577ds.f3004b;
            if (!z && !c0577ds.f3003a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterM3660e = null;
            ColorStateList colorStateList = z ? (ColorStateList) c0577ds.f3005c : null;
            PorterDuff.Mode mode2 = c0577ds.f3003a ? (PorterDuff.Mode) c0577ds.f3006d : jl1.f5444f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM3660e = jl1.m3660e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM3660e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m6596b(Context context, int i) {
        return this.f11571a.m3662c(context, i);
    }
}
