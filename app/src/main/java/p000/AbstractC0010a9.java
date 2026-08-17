package p000;

import android.widget.TextView;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010a9 {
    /* JADX INFO: renamed from: a */
    public static int m116a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m117b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m118c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m119d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
