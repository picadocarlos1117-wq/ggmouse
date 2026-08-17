package p000;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 {

    /* JADX INFO: renamed from: a */
    public final Runnable f7634a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f7635b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final HashMap f7636c = new HashMap();

    public o31(Runnable runnable) {
        this.f7634a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4706a(MenuItem menuItem) {
        Iterator it = this.f7635b.iterator();
        while (it.hasNext()) {
            if (((bf0) ((h41) it.next())).f1357a.m403o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4707b(h41 h41Var) {
        this.f7635b.remove(h41Var);
        n31 n31Var = (n31) this.f7636c.remove(h41Var);
        if (n31Var != null) {
            n31Var.f7184a.mo2849b(n31Var.f7185b);
            n31Var.f7185b = null;
        }
        this.f7634a.run();
    }
}
