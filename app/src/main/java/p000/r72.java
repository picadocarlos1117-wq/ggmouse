package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r72 {

    /* JADX INFO: renamed from: a */
    public final s72 f9806a = new s72();

    /* JADX INFO: renamed from: a */
    public final void m5741a() {
        s72 s72Var = this.f9806a;
        if (s72Var != null && !s72Var.f10277d) {
            s72Var.f10277d = true;
            synchronized (s72Var.f10274a) {
                try {
                    Iterator it = s72Var.f10275b.values().iterator();
                    while (it.hasNext()) {
                        s72.m6002a((AutoCloseable) it.next());
                    }
                    Iterator it2 = s72Var.f10276c.iterator();
                    while (it2.hasNext()) {
                        s72.m6002a((AutoCloseable) it2.next());
                    }
                    s72Var.f10276c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo415b();
    }

    /* JADX INFO: renamed from: b */
    public void mo415b() {
    }
}
