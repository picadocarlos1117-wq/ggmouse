package p000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 implements OnCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3736a;

    /* JADX INFO: renamed from: b */
    public final Object f3737b;

    /* JADX INFO: renamed from: c */
    public final Object f3738c;

    public /* synthetic */ fa2(int i, Object obj, Object obj2) {
        this.f3736a = i;
        this.f3737b = obj;
        this.f3738c = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        xc2 xc2Var = (xc2) this.f3737b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3738c;
        synchronized (xc2Var.f12567f) {
            xc2Var.f12566e.remove(taskCompletionSource);
        }
    }

    public String toString() {
        switch (this.f3736a) {
            case 0:
                return "Bounds{lower=" + ((un0) this.f3737b) + " upper=" + ((un0) this.f3738c) + "}";
            default:
                return super.toString();
        }
    }
}
