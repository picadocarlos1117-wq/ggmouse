package p000;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1136n8 {
    /* JADX INFO: renamed from: a */
    public static void m4506a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (i91.m3395a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
