package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 extends C1056l2 {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f11878d;

    public vz1(TextInputLayout textInputLayout) {
        this.f11878d = textInputLayout;
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: d */
    public final void mo161d(View view, C1539w2 c1539w2) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1539w2.f11909a;
        this.f6143a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f11878d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f2190y0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        hv1 hv1Var = textInputLayout.f2148b;
        C0595e9 c0595e9 = hv1Var.f4727b;
        if (c0595e9.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0595e9);
            accessibilityNodeInfo.setTraversalAfter(c0595e9);
        } else {
            accessibilityNodeInfo.setTraversalAfter(hv1Var.f4729d);
        }
        if (!zIsEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (!z && placeholderText != null) {
                accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0595e9 c0595e10 = textInputLayout.f2169o.f6478y;
        if (c0595e10 != null) {
            accessibilityNodeInfo.setLabelFor(c0595e10);
        }
        textInputLayout.f2150c.m6711b().mo5198m(c1539w2);
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: e */
    public final void mo162e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo162e(view, accessibilityEvent);
        this.f11878d.f2150c.m6711b().mo5199n(accessibilityEvent);
    }
}
