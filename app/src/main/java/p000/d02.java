package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d02 {
    /* JADX INFO: renamed from: a */
    public static int m2159a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2160b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m2161c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* JADX INFO: renamed from: d */
    public static int m2162d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: e */
    public static void m2163e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m2164f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX INFO: renamed from: g */
    public static void m2165g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* JADX INFO: renamed from: h */
    public static void m2166h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
