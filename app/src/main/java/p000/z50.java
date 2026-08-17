package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z50 extends r50 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f13289a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f13290b;

    public z50(TextView textView, a60 a60Var) {
        this.f13289a = new WeakReference(textView);
        this.f13290b = new WeakReference(a60Var);
    }

    @Override // p000.r50
    /* JADX INFO: renamed from: a */
    public final void mo2938a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f13289a.get();
        InputFilter inputFilter = (InputFilter) this.f13290b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    t50 t50VarM6231a = t50.m6231a();
                    if (text == null) {
                        length = 0;
                    } else {
                        t50VarM6231a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM6235e = t50VarM6231a.m6235e(text, 0, length);
                    if (text == charSequenceM6235e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM6235e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM6235e);
                    textView.setText(charSequenceM6235e);
                    if (charSequenceM6235e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM6235e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
