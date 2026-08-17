package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lx0 f5587b;

    public /* synthetic */ jx0(lx0 lx0Var, int i) {
        this.f5586a = i;
        this.f5587b = lx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.f5586a) {
            case 0:
                lx0 lx0Var = this.f5587b;
                ox0 ox0Var = lx0Var.f6545l;
                AtomicReference atomicReference = lx0Var.f6542i;
                if (ox0Var.f8525J == null) {
                    if (atomicReference.get() == ox0.f8514r0) {
                        atomicReference.set(null);
                    }
                    lx0Var.f6545l.f8529N.m2572k(ox0.f8511o0);
                    return;
                }
                return;
            case 1:
                if (this.f5587b.f6542i.get() == ox0.f8514r0) {
                    this.f5587b.f6542i.set(null);
                }
                LinkedHashSet linkedHashSet = this.f5587b.f6545l.f8525J;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((kx0) it.next()).cancel("Channel is forcefully shutdown", null);
                    }
                }
                C0599ed c0599ed = this.f5587b.f6545l.f8529N;
                nv1 nv1Var = ox0.f8510n0;
                c0599ed.m2572k(nv1Var);
                synchronized (c0599ed.f3313a) {
                    arrayList = new ArrayList((HashSet) c0599ed.f3314b);
                    break;
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((InterfaceC1339qo) obj).mo1030f(nv1Var);
                }
                ((ox0) c0599ed.f3316d).f8528M.mo2577b(nv1Var);
                return;
            default:
                this.f5587b.f6545l.m5082M0();
                return;
        }
    }
}
