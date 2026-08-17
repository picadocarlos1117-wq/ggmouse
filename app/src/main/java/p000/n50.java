package p000;

import android.content.Context;
import android.util.TypedValue;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n50 {

    /* JADX INFO: renamed from: f */
    public static final int f7235f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f7236a;

    /* JADX INFO: renamed from: b */
    public final int f7237b;

    /* JADX INFO: renamed from: c */
    public final int f7238c;

    /* JADX INFO: renamed from: d */
    public final int f7239d;

    /* JADX INFO: renamed from: e */
    public final float f7240e;

    public n50(Context context) {
        int color;
        int color2;
        int color3 = 0;
        boolean zM3850U = ki0.m3850U(context, R.attr.elevationOverlayEnabled, false);
        TypedValue typedValueM3849T = ki0.m3849T(context, R.attr.elevationOverlayColor);
        if (typedValueM3849T != null) {
            int i = typedValueM3849T.resourceId;
            color = i != 0 ? AbstractC0075au.getColor(context, i) : typedValueM3849T.data;
        } else {
            color = 0;
        }
        TypedValue typedValueM3849T2 = ki0.m3849T(context, R.attr.elevationOverlayAccentColor);
        if (typedValueM3849T2 != null) {
            int i2 = typedValueM3849T2.resourceId;
            color2 = i2 != 0 ? AbstractC0075au.getColor(context, i2) : typedValueM3849T2.data;
        } else {
            color2 = 0;
        }
        TypedValue typedValueM3849T3 = ki0.m3849T(context, R.attr.colorSurface);
        if (typedValueM3849T3 != null) {
            int i3 = typedValueM3849T3.resourceId;
            color3 = i3 != 0 ? AbstractC0075au.getColor(context, i3) : typedValueM3849T3.data;
        }
        float f = context.getResources().getDisplayMetrics().density;
        this.f7236a = zM3850U;
        this.f7237b = color;
        this.f7238c = color2;
        this.f7239d = color3;
        this.f7240e = f;
    }
}
