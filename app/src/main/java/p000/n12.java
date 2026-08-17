package p000;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n12 implements l12, g31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o12 f7172a;

    public /* synthetic */ n12(o12 o12Var) {
        this.f7172a = o12Var;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: d */
    public boolean mo768d(i31 i31Var, MenuItem menuItem) {
        return false;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: j */
    public void mo774j(i31 i31Var) {
        o12 o12Var = this.f7172a;
        boolean zM268p = o12Var.f7611a.f9293a.m268p();
        Window.Callback callback = o12Var.f7612b;
        if (zM268p) {
            callback.onPanelClosed(108, i31Var);
        } else if (callback.onPreparePanel(0, null, i31Var)) {
            callback.onMenuOpened(108, i31Var);
        }
    }
}
