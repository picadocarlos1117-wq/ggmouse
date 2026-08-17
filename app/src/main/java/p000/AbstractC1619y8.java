package p000;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: renamed from: y8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1619y8 {
    /* JADX INFO: renamed from: a */
    public static Drawable[] m7037a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: b */
    public static void m7038b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: c */
    public static void m7039c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
