package p000;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5235a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kx0 f5236b;

    public /* synthetic */ j10(kx0 kx0Var, int i) {
        this.f5235a = i;
        this.f5236b = kx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5235a;
        kx0 kx0Var = this.f5236b;
        switch (i) {
            case 0:
                kx0Var.f6056f.halfClose();
                break;
            default:
                lx0 lx0Var = kx0Var.f6064n;
                lx0 lx0Var2 = kx0Var.f6064n;
                LinkedHashSet linkedHashSet = lx0Var.f6545l.f8525J;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(kx0Var);
                    if (lx0Var2.f6545l.f8525J.isEmpty()) {
                        ox0 ox0Var = lx0Var2.f6545l;
                        ox0Var.f8549h0.m2155h(ox0Var.f8526K, false);
                        ox0 ox0Var2 = lx0Var2.f6545l;
                        ox0Var2.f8525J = null;
                        if (ox0Var2.f8530O.get()) {
                            lx0Var2.f6545l.f8529N.m2572k(ox0.f8511o0);
                        }
                    }
                }
                break;
        }
    }
}
