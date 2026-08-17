package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o50 extends p32 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ p50 f7664l;

    public o50(p50 p50Var) {
        this.f7664l = p50Var;
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: X */
    public final void mo4711X(Throwable th) {
        this.f7664l.f8725a.m6234d(th);
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: Y */
    public final void mo4712Y(C0599ed c0599ed) {
        p50 p50Var = this.f7664l;
        p50Var.f8727c = c0599ed;
        p50Var.f8726b = new C0558d8(p50Var.f8727c, new bz1(20), p50Var.f8725a.f10761h);
        t50 t50Var = p50Var.f8725a;
        ArrayList arrayList = new ArrayList();
        t50Var.f10754a.writeLock().lock();
        try {
            t50Var.f10756c = 1;
            arrayList.addAll(t50Var.f10755b);
            t50Var.f10755b.clear();
            t50Var.f10754a.writeLock().unlock();
            t50Var.f10757d.post(new RunnableC0120c2(arrayList, t50Var.f10756c, (Throwable) null));
        } catch (Throwable th) {
            t50Var.f10754a.writeLock().unlock();
            throw th;
        }
    }
}
