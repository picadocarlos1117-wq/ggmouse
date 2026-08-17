package p000;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 extends r50 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f4074a;

    public g60(EditText editText) {
        this.f4074a = new WeakReference(editText);
    }

    @Override // p000.r50
    /* JADX INFO: renamed from: a */
    public final void mo2938a() {
        h60.m3109a((EditText) this.f4074a.get(), 1);
    }
}
