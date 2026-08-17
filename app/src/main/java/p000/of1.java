package p000;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class of1 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f7781a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f7782b;

    /* JADX INFO: renamed from: c */
    public final int f7783c;

    /* JADX INFO: renamed from: d */
    public final int f7784d;

    public of1(PrecomputedText.Params params) {
        this.f7781a = params.getTextPaint();
        this.f7782b = params.getTextDirection();
        this.f7783c = params.getBreakStrategy();
        this.f7784d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof of1)) {
            return false;
        }
        of1 of1Var = (of1) obj;
        int i = of1Var.f7783c;
        TextPaint textPaint = of1Var.f7781a;
        if (this.f7783c != i || this.f7784d != of1Var.f7784d) {
            return false;
        }
        TextPaint textPaint2 = this.f7781a;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.f7782b == of1Var.f7782b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f7781a;
        return i91.m3396b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f7782b, Integer.valueOf(this.f7783c), Integer.valueOf(this.f7784d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f7781a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f7782b);
        sb.append(", breakStrategy=" + this.f7783c);
        sb.append(", hyphenationFrequency=" + this.f7784d);
        sb.append("}");
        return sb.toString();
    }
}
