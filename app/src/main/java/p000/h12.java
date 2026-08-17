package p000;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h12 implements InterfaceC1651z3, g31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Toolbar f4391a;

    public /* synthetic */ h12(Toolbar toolbar) {
        this.f4391a = toolbar;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: d */
    public boolean mo768d(i31 i31Var, MenuItem menuItem) {
        return false;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: j */
    public void mo774j(i31 i31Var) {
        Toolbar toolbar = this.f4391a;
        C1540w3 c1540w3 = toolbar.f519a.f437y;
        if (c1540w3 == null || !c1540w3.m6696j()) {
            Iterator it = toolbar.f507L.f7635b.iterator();
            while (it.hasNext()) {
                ((bf0) ((h41) it.next())).f1357a.m407s(i31Var);
            }
        }
        n12 n12Var = toolbar.f515T;
        if (n12Var != null) {
            n12Var.mo774j(i31Var);
        }
    }
}
