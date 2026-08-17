package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class iz0 {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f5204a;

    /* JADX INFO: renamed from: b */
    public pr1 f5205b;

    /* JADX INFO: renamed from: c */
    public int f5206c;

    /* JADX INFO: renamed from: d */
    public int f5207d;

    /* JADX INFO: renamed from: e */
    public int f5208e;

    /* JADX INFO: renamed from: f */
    public int f5209f;

    /* JADX INFO: renamed from: g */
    public int f5210g;

    /* JADX INFO: renamed from: h */
    public int f5211h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f5212i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f5213j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f5214k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f5215l;

    /* JADX INFO: renamed from: m */
    public zz0 f5216m;

    /* JADX INFO: renamed from: q */
    public boolean f5220q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f5222s;

    /* JADX INFO: renamed from: t */
    public int f5223t;

    /* JADX INFO: renamed from: n */
    public boolean f5217n = false;

    /* JADX INFO: renamed from: o */
    public boolean f5218o = false;

    /* JADX INFO: renamed from: p */
    public boolean f5219p = false;

    /* JADX INFO: renamed from: r */
    public boolean f5221r = true;

    public iz0(MaterialButton materialButton, pr1 pr1Var) {
        this.f5204a = materialButton;
        this.f5205b = pr1Var;
    }

    /* JADX INFO: renamed from: a */
    public final zr1 m3511a() {
        RippleDrawable rippleDrawable = this.f5222s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.f5222s.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.f5222s;
        return numberOfLayers > 2 ? (zr1) rippleDrawable2.getDrawable(2) : (zr1) rippleDrawable2.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final zz0 m3512b(boolean z) {
        RippleDrawable rippleDrawable = this.f5222s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (zz0) ((LayerDrawable) ((InsetDrawable) this.f5222s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m3513c(pr1 pr1Var) {
        this.f5205b = pr1Var;
        if (m3512b(false) != null) {
            m3512b(false).setShapeAppearanceModel(pr1Var);
        }
        if (m3512b(true) != null) {
            m3512b(true).setShapeAppearanceModel(pr1Var);
        }
        if (m3511a() != null) {
            m3511a().setShapeAppearanceModel(pr1Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3514d(int i, int i2) {
        WeakHashMap weakHashMap = i72.f4849a;
        MaterialButton materialButton = this.f5204a;
        int iM6242f = t62.m6242f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iM6241e = t62.m6241e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f5208e;
        int i4 = this.f5209f;
        this.f5209f = i2;
        this.f5208e = i;
        if (!this.f5218o) {
            m3515e();
        }
        t62.m6247k(materialButton, iM6242f, (paddingTop + i) - i3, iM6241e, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: e */
    public final void m3515e() {
        zz0 zz0Var = new zz0(this.f5205b);
        MaterialButton materialButton = this.f5204a;
        zz0Var.m7397h(materialButton.getContext());
        v30.m6560h(zz0Var, this.f5213j);
        PorterDuff.Mode mode = this.f5212i;
        if (mode != null) {
            v30.m6561i(zz0Var, mode);
        }
        float f = this.f5211h;
        ColorStateList colorStateList = this.f5214k;
        zz0Var.f13626a.f13181j = f;
        zz0Var.invalidateSelf();
        yz0 yz0Var = zz0Var.f13626a;
        if (yz0Var.f13175d != colorStateList) {
            yz0Var.f13175d = colorStateList;
            zz0Var.onStateChange(zz0Var.getState());
        }
        zz0 zz0Var2 = new zz0(this.f5205b);
        zz0Var2.setTint(0);
        float f2 = this.f5211h;
        int iM3226v = this.f5217n ? hp0.m3226v(materialButton, R.attr.colorSurface) : 0;
        zz0Var2.f13626a.f13181j = f2;
        zz0Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM3226v);
        yz0 yz0Var2 = zz0Var2.f13626a;
        if (yz0Var2.f13175d != colorStateListValueOf) {
            yz0Var2.f13175d = colorStateListValueOf;
            zz0Var2.onStateChange(zz0Var2.getState());
        }
        zz0 zz0Var3 = new zz0(this.f5205b);
        this.f5216m = zz0Var3;
        v30.m6559g(zz0Var3, -1);
        ColorStateList colorStateListValueOf2 = this.f5215l;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{zz0Var2, zz0Var}), this.f5206c, this.f5208e, this.f5207d, this.f5209f), this.f5216m);
        this.f5222s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        zz0 zz0VarM3512b = m3512b(false);
        if (zz0VarM3512b != null) {
            zz0VarM3512b.m7398i(this.f5223t);
            zz0VarM3512b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3516f() {
        zz0 zz0VarM3512b = m3512b(false);
        zz0 zz0VarM3512b2 = m3512b(true);
        if (zz0VarM3512b != null) {
            float f = this.f5211h;
            ColorStateList colorStateList = this.f5214k;
            zz0VarM3512b.f13626a.f13181j = f;
            zz0VarM3512b.invalidateSelf();
            yz0 yz0Var = zz0VarM3512b.f13626a;
            if (yz0Var.f13175d != colorStateList) {
                yz0Var.f13175d = colorStateList;
                zz0VarM3512b.onStateChange(zz0VarM3512b.getState());
            }
            if (zz0VarM3512b2 != null) {
                float f2 = this.f5211h;
                int iM3226v = this.f5217n ? hp0.m3226v(this.f5204a, R.attr.colorSurface) : 0;
                zz0VarM3512b2.f13626a.f13181j = f2;
                zz0VarM3512b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM3226v);
                yz0 yz0Var2 = zz0VarM3512b2.f13626a;
                if (yz0Var2.f13175d != colorStateListValueOf) {
                    yz0Var2.f13175d = colorStateListValueOf;
                    zz0VarM3512b2.onStateChange(zz0VarM3512b2.getState());
                }
            }
        }
    }
}
