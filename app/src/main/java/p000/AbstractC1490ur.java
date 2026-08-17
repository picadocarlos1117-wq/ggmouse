package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: ur */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1490ur {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m6523a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m6524b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m6525c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m6526d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
