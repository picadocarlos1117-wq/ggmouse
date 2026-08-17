package p000;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x50 extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f12454a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile x50 f12455b;

    /* JADX INFO: renamed from: c */
    public static Class f12456c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f12456c;
        return cls != null ? new fu1(cls, charSequence) : super.newEditable(charSequence);
    }
}
