package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d72 {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m2247a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static List<Rect> m2248b(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: c */
    public static void m2249c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public static void m2250d(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
