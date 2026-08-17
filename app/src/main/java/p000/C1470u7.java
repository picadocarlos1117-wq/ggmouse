package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.sousasantoslogic.sspro.R;
import java.util.HashMap;

/* JADX INFO: renamed from: u7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1470u7 {

    /* JADX INFO: renamed from: a */
    public Object f11141a;

    /* JADX INFO: renamed from: b */
    public Object f11142b;

    /* JADX INFO: renamed from: c */
    public Object f11143c;

    /* JADX INFO: renamed from: d */
    public Object f11144d;

    /* JADX INFO: renamed from: e */
    public Object f11145e;

    /* JADX INFO: renamed from: f */
    public Object f11146f;

    public C1470u7(c11 c11Var, MediaFormat mediaFormat, be0 be0Var, Surface surface, MediaCrypto mediaCrypto, C1174o9 c1174o9) {
        this.f11141a = c11Var;
        this.f11142b = mediaFormat;
        this.f11143c = be0Var;
        this.f11144d = surface;
        this.f11145e = mediaCrypto;
        this.f11146f = c1174o9;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6393c(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m6394e(Context context, int i) {
        int iM3087c = h02.m3087c(context, R.attr.colorControlHighlight);
        int iM3086b = h02.m3086b(context, R.attr.colorButtonNormal);
        int[] iArr = h02.f4380b;
        int[] iArr2 = h02.f4382d;
        int iM2113b = AbstractC0539cq.m2113b(iM3087c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, h02.f4381c, h02.f4384f}, new int[]{iM3086b, iM2113b, AbstractC0539cq.m2113b(iM3087c, i), i});
    }

    /* JADX INFO: renamed from: f */
    public static q21 m6395f(ee1 ee1Var, qm0 qm0Var, q21 q21Var, r02 r02Var) {
        int iMo1054b;
        f80 f80Var = (f80) ee1Var;
        t02 t02VarM2763j = f80Var.m2763j();
        f80Var.m2753N();
        if (f80Var.f3697g0.f10371a.m6176p()) {
            iMo1054b = 0;
        } else {
            sd1 sd1Var = f80Var.f3697g0;
            iMo1054b = sd1Var.f10371a.mo1054b(sd1Var.f10372b.f9309a);
        }
        Object objMo1057l = t02VarM2763j.m6176p() ? null : t02VarM2763j.mo1057l(iMo1054b);
        int iM5645b = (f80Var.m2772t() || t02VarM2763j.m6176p()) ? -1 : t02VarM2763j.mo1055f(iMo1054b, r02Var, false).m5645b(z42.m7216D(f80Var.m2761h()) - r02Var.f9653e);
        for (int i = 0; i < qm0Var.size(); i++) {
            q21 q21Var2 = (q21) qm0Var.get(i);
            if (m6397i(q21Var2, objMo1057l, f80Var.m2772t(), f80Var.m2758e(), f80Var.m2759f(), iM5645b)) {
                return q21Var2;
            }
        }
        if (qm0Var.isEmpty() && q21Var != null && m6397i(q21Var, objMo1057l, f80Var.m2772t(), f80Var.m2758e(), f80Var.m2759f(), iM5645b)) {
            return q21Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static LayerDrawable m6396g(jl1 jl1Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM3662c = jl1Var.m3662c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM3662c2 = jl1Var.m3662c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM3662c instanceof BitmapDrawable) && drawableM3662c.getIntrinsicWidth() == dimensionPixelSize && drawableM3662c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM3662c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM3662c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM3662c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM3662c2 instanceof BitmapDrawable) && drawableM3662c2.getIntrinsicWidth() == dimensionPixelSize && drawableM3662c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM3662c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM3662c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM3662c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6397i(q21 q21Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = q21Var.f9309a;
        int i4 = q21Var.f9310b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && q21Var.f9311c == i2) {
            return true;
        }
        return !z && i4 == -1 && q21Var.f9313e == i3;
    }

    /* JADX INFO: renamed from: j */
    public static void m6398j(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = x30.f12436a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1507v7.f11569b;
        }
        drawableMutate.setColorFilter(C1507v7.m6593c(i, mode));
    }

    /* JADX INFO: renamed from: a */
    public void m6399a(String str, String str2) {
        HashMap map = (HashMap) this.f11146f;
        if (map != null) {
            map.put(str, str2);
        } else {
            f40.m2719o("Property \"autoMetadata\" has not been set");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6400b(C0082b0 c0082b0, q21 q21Var, t02 t02Var) {
        if (q21Var == null) {
            return;
        }
        if (t02Var.mo1054b(q21Var.f9309a) != -1) {
            c0082b0.m811n(q21Var, t02Var);
            return;
        }
        t02 t02Var2 = (t02) ((pk1) this.f11143c).get(q21Var);
        if (t02Var2 != null) {
            c0082b0.m811n(q21Var, t02Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public C1587xd m6401d() {
        String strConcat = ((String) this.f11141a) == null ? " transportName" : "";
        if (((s60) this.f11143c) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f11144d) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f11145e) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f11146f) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new C1587xd((String) this.f11141a, (Integer) this.f11142b, (s60) this.f11143c, ((Long) this.f11144d).longValue(), ((Long) this.f11145e).longValue(), (HashMap) this.f11146f);
        }
        f40.m2719o("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m6402h(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0075au.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0075au.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m6394e(context, h02.m3087c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m6394e(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m6394e(context, h02.m3087c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0075au.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (m6393c((int[]) this.f11142b, i)) {
                return h02.m3088d(context, R.attr.colorControlNormal);
            }
            if (m6393c((int[]) this.f11145e, i)) {
                return AbstractC0075au.getColorStateList(context, R.color.abc_tint_default);
            }
            if (m6393c((int[]) this.f11146f, i)) {
                return AbstractC0075au.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0075au.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM3088d = h02.m3088d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM3088d == null || !colorStateListM3088d.isStateful()) {
            iArr[0] = h02.f4380b;
            iArr2[0] = h02.m3086b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = h02.f4383e;
            iArr2[1] = h02.m3087c(context, R.attr.colorControlActivated);
            iArr[2] = h02.f4384f;
            iArr2[2] = h02.m3087c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = h02.f4380b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM3088d.getColorForState(iArr3, 0);
            iArr[1] = h02.f4383e;
            iArr2[1] = h02.m3087c(context, R.attr.colorControlActivated);
            iArr[2] = h02.f4384f;
            iArr2[2] = colorStateListM3088d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: k */
    public void m6403k(t02 t02Var) {
        qm0 qm0Var;
        C0082b0 c0082b0 = new C0082b0(4);
        if (((qm0) this.f11142b).isEmpty()) {
            m6400b(c0082b0, (q21) this.f11145e, t02Var);
            if (!hr1.m3275k((q21) this.f11146f, (q21) this.f11145e)) {
                m6400b(c0082b0, (q21) this.f11146f, t02Var);
            }
            if (!hr1.m3275k((q21) this.f11144d, (q21) this.f11145e) && !hr1.m3275k((q21) this.f11144d, (q21) this.f11146f)) {
                m6400b(c0082b0, (q21) this.f11144d, t02Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((qm0) this.f11142b).size();
                qm0Var = (qm0) this.f11142b;
                if (i >= size) {
                    break;
                }
                m6400b(c0082b0, (q21) qm0Var.get(i), t02Var);
                i++;
            }
            if (!qm0Var.contains((q21) this.f11144d)) {
                m6400b(c0082b0, (q21) this.f11144d, t02Var);
            }
        }
        this.f11143c = c0082b0.m803d();
    }
}
