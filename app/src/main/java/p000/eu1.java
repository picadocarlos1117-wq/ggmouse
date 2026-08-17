package p000;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class eu1 implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a */
    public final Object f3440a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f3441b = new AtomicInteger(0);

    public eu1(Object obj) {
        this.f3440a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f3440a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f3440a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f3441b.get() <= 0 || !(obj instanceof u32)) {
            ((SpanWatcher) this.f3440a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f3441b.get() <= 0 || !(obj instanceof u32)) {
            ((SpanWatcher) this.f3440a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f3441b.get() <= 0 || !(obj instanceof u32)) {
            ((SpanWatcher) this.f3440a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f3440a).onTextChanged(charSequence, i, i2, i3);
    }
}
