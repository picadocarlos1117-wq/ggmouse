package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0644fl implements vt0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f3844a;

    /* JADX INFO: renamed from: b */
    public final C0607el f3845b = new C0607el(this);

    public C0644fl(C0571dl c0571dl) {
        this.f3844a = new WeakReference(c0571dl);
    }

    @Override // p000.vt0
    public final void addListener(Runnable runnable, Executor executor) {
        this.f3845b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0571dl c0571dl = (C0571dl) this.f3844a.get();
        boolean zCancel = this.f3845b.cancel(z);
        if (zCancel && c0571dl != null) {
            c0571dl.f2959a = null;
            c0571dl.f2960b = null;
            c0571dl.f2961c.set(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3845b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3845b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3845b.isDone();
    }

    public final String toString() {
        return this.f3845b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f3845b.get(j, timeUnit);
    }
}
