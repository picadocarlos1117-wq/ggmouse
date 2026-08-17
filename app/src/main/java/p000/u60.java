package p000;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u60 extends g02 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w60 f11133a;

    public u60(w60 w60Var) {
        this.f11133a = w60Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f11133a.m6711b().mo1007a();
    }

    @Override // p000.g02, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f11133a.m6711b().mo2955b();
    }
}
