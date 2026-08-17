package p000;

import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 extends ve0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ve0 f4778a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043g f4779b;

    public i20(DialogInterfaceOnCancelListenerC0043g dialogInterfaceOnCancelListenerC0043g, ve0 ve0Var) {
        this.f4779b = dialogInterfaceOnCancelListenerC0043g;
        this.f4778a = ve0Var;
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: b */
    public final View mo352b(int i) {
        ve0 ve0Var = this.f4778a;
        return ve0Var.mo353c() ? ve0Var.mo352b(i) : this.f4779b.onFindViewById(i);
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: c */
    public final boolean mo353c() {
        return this.f4778a.mo353c() || this.f4779b.onHasView();
    }
}
