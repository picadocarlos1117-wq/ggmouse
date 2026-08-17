package p000;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f42 implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f3615a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f3616b;

    public f42(CharSequence charSequence) {
        this.f3616b = new SpannableString(charSequence);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f3616b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f3616b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f3616b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f3616b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f3616b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f3616b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f3616b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3616b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3616b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f3616b;
        if (!this.f3615a && (spannable instanceof PrecomputedText)) {
            this.f3616b = new SpannableString(spannable);
        }
        this.f3615a = true;
        this.f3616b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f3616b;
        if (!this.f3615a && (spannable instanceof PrecomputedText)) {
            this.f3616b = new SpannableString(spannable);
        }
        this.f3615a = true;
        this.f3616b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f3616b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3616b.toString();
    }

    public f42(Spannable spannable) {
        this.f3616b = spannable;
    }
}
