package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Map;

/* JADX INFO: renamed from: va */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1510va implements Continuation, OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f11598a;

    public /* synthetic */ C1510va(TaskCompletionSource taskCompletionSource) {
        this.f11598a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f11598a.setException(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f11598a.setResult((Map) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return AsyncQueue.lambda$callTask$0(this.f11598a, task);
    }
}
