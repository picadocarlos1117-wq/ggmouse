package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c02 {
    /* JADX INFO: renamed from: a */
    public static Drawable[] m1096a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: b */
    public static int m1097b(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: c */
    public static int m1098c(View view) {
        return view.getTextDirection();
    }

    /* JADX INFO: renamed from: d */
    public static Locale m1099d(TextView textView) {
        return textView.getTextLocale();
    }

    /* JADX INFO: renamed from: e */
    public static void m1100e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: f */
    public static void m1101f(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static void m1102g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: h */
    public static void m1103h(View view, int i) {
        view.setTextDirection(i);
    }
}
