package p000;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x31 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z31 f12438a;

    public x31(z31 z31Var) {
        this.f12438a = z31Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f12438a.mo5970c();
    }
}
