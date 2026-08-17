package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p31 {
    /* JADX INFO: renamed from: a */
    public static int m5122a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m5123b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m5124c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m5125d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static int m5126e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m5127f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m5128g(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m5129h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m5130i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static MenuItem m5131j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m5132k(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: l */
    public static MenuItem m5133l(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static MenuItem m5134m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
