package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h60 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f4455a;

    /* JADX INFO: renamed from: b */
    public g60 f4456b;

    /* JADX INFO: renamed from: c */
    public boolean f4457c = true;

    public h60(EditText editText) {
        this.f4455a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m3109a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            t50 t50VarM6231a = t50.m6231a();
            if (editableText == null) {
                length = 0;
            } else {
                t50VarM6231a.getClass();
                length = editableText.length();
            }
            t50VarM6231a.m6235e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f4455a;
        if (editText.isInEditMode() || !this.f4457c || t50.f10753j == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM6232b = t50.m6231a().m6232b();
        if (iM6232b != 0) {
            if (iM6232b == 1) {
                t50.m6231a().m6235e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM6232b != 3) {
                return;
            }
        }
        t50 t50VarM6231a = t50.m6231a();
        if (this.f4456b == null) {
            this.f4456b = new g60(editText);
        }
        t50VarM6231a.m6236f(this.f4456b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
