package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zl1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collection f13481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nm1 f13482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Future f13483c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Future f13484d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dx0 f13485e;

    public zl1(dx0 dx0Var, Collection collection, nm1 nm1Var, Future future, Future future2) {
        this.f13485e = dx0Var;
        this.f13481a = collection;
        this.f13482b = nm1Var;
        this.f13483c = future;
        this.f13484d = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nv1 nv1Var;
        for (nm1 nm1Var : this.f13481a) {
            if (nm1Var != this.f13482b) {
                nm1Var.f7450a.mo1030f(dx0.f3040G);
            }
        }
        Future future = this.f13483c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f13484d;
        if (future2 != null) {
            future2.cancel(false);
        }
        dx0 dx0Var = this.f13485e;
        C0599ed c0599ed = ((ox0) dx0Var.f3045D.f5143b).f8529N;
        synchronized (c0599ed.f3313a) {
            try {
                ((HashSet) c0599ed.f3314b).remove(dx0Var);
                if (((HashSet) c0599ed.f3314b).isEmpty()) {
                    nv1Var = (nv1) c0599ed.f3315c;
                    c0599ed.f3314b = new HashSet();
                } else {
                    nv1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nv1Var != null) {
            ((ox0) c0599ed.f3316d).f8528M.mo2580h(nv1Var);
        }
    }
}
