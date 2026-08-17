package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w60 f11566a;

    public v60(w60 w60Var) {
        this.f11566a = w60Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6584a(TextInputLayout textInputLayout) {
        w60 w60Var = this.f11566a;
        u60 u60Var = w60Var.f11990A;
        if (w60Var.f12009x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = w60Var.f12009x;
        if (editText != null) {
            editText.removeTextChangedListener(u60Var);
            if (w60Var.f12009x.getOnFocusChangeListener() == w60Var.m6711b().mo1010e()) {
                w60Var.f12009x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        w60Var.f12009x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(u60Var);
        }
        w60Var.m6711b().mo1013l(w60Var.f12009x);
        w60Var.m6719j(w60Var.m6711b());
    }
}
