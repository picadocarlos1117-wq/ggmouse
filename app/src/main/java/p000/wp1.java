package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wp1 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f12248b;

    public /* synthetic */ wp1(ViewGroup viewGroup, int i) {
        this.f12247a = i;
        this.f12248b = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f12247a) {
            case 0:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f12248b;
                textInputLayout.m1720u(!textInputLayout.f2127E0, false);
                if (textInputLayout.f2171p) {
                    textInputLayout.m1713n(editable);
                }
                if (textInputLayout.f2187x) {
                    textInputLayout.m1721v(editable);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f12247a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f12247a) {
            case 0:
                SearchView searchView = (SearchView) this.f12248b;
                Editable text = searchView.f486u.getText();
                searchView.f478d0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.m250v(!zIsEmpty);
                int i4 = 8;
                if (searchView.f477c0 && !searchView.f470S && zIsEmpty) {
                    searchView.f491z.setVisibility(8);
                    i4 = 0;
                }
                searchView.f453B.setVisibility(i4);
                searchView.m246r();
                searchView.m249u();
                charSequence.toString();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m6816a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    private final void m6817b(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m6818c(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m6819d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
