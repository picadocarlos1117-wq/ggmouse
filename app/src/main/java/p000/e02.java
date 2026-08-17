package p000;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e02 {
    /* JADX INFO: renamed from: a */
    public static String[] m2443a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: b */
    public static PrecomputedText.Params m2444b(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: c */
    public static void m2445c(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
