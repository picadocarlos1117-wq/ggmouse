package p000;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xz0 extends C0594e8 {

    /* JADX INFO: renamed from: g */
    public static final int[][] f12784g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f12785e;

    /* JADX INFO: renamed from: f */
    public boolean f12786f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12785e == null) {
            int iM3226v = hp0.m3226v(this, com.sousasantoslogic.sspro.R.attr.colorControlActivated);
            int iM3226v2 = hp0.m3226v(this, com.sousasantoslogic.sspro.R.attr.colorOnSurface);
            int iM3226v3 = hp0.m3226v(this, com.sousasantoslogic.sspro.R.attr.colorSurface);
            this.f12785e = new ColorStateList(f12784g, new int[]{hp0.m3195D(1.0f, iM3226v3, iM3226v), hp0.m3195D(0.54f, iM3226v3, iM3226v2), hp0.m3195D(0.38f, iM3226v3, iM3226v2), hp0.m3195D(0.38f, iM3226v3, iM3226v2)});
        }
        return this.f12785e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12786f && AbstractC1490ur.m6523a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f12786f = z;
        if (z) {
            AbstractC1490ur.m6525c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC1490ur.m6525c(this, null);
        }
    }
}
