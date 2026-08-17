package p000;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sd2 extends qd2 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TaskCompletionSource f10391g;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ qd2 f10392m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ xc2 f10393n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(xc2 xc2Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, qd2 qd2Var) {
        super(taskCompletionSource);
        this.f10393n = xc2Var;
        this.f10391g = taskCompletionSource2;
        this.f10392m = qd2Var;
    }

    @Override // p000.qd2
    /* JADX INFO: renamed from: b */
    public final void mo1743b() {
        synchronized (this.f10393n.f12567f) {
            try {
                xc2 xc2Var = this.f10393n;
                TaskCompletionSource taskCompletionSource = this.f10391g;
                xc2Var.f12566e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new fa2(1, xc2Var, taskCompletionSource));
                if (this.f10393n.f12573l.getAndIncrement() > 0) {
                    this.f10393n.f12563b.m5254b("Already connected to the service.", new Object[0]);
                }
                xc2.m6912b(this.f10393n, this.f10392m);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
