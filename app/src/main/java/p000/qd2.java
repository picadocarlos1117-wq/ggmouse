package p000;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qd2 implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TaskCompletionSource f9486a;

    public qd2() {
        this.f9486a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo1742a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f9486a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1743b();

    /* JADX INFO: renamed from: c */
    public final TaskCompletionSource m5486c() {
        return this.f9486a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo1743b();
        } catch (Exception e) {
            mo1742a(e);
        }
    }

    public qd2(TaskCompletionSource taskCompletionSource) {
        this.f9486a = taskCompletionSource;
    }
}
