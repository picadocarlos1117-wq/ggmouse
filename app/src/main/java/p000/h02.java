package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h02 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4379a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f4380b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f4381c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f4382d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f4383e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f4384f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f4385g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m3085a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ki1.f5855j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3086b(Context context, int i) {
        ColorStateList colorStateListM3088d = m3088d(context, i);
        if (colorStateListM3088d != null && colorStateListM3088d.isStateful()) {
            return colorStateListM3088d.getColorForState(f4380b, colorStateListM3088d.getDefaultColor());
        }
        ThreadLocal threadLocal = f4379a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM3087c = m3087c(context, i);
        return AbstractC0539cq.m2115d(iM3087c, Math.round(Color.alpha(iM3087c) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m3087c(Context context, int i) {
        int[] iArr = f4385g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m3088d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f4385g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0075au.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
