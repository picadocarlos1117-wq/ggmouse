package p000;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Source;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i30 implements EventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TaskCompletionSource f4783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TaskCompletionSource f4784c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Source f4785d;

    public /* synthetic */ i30(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Source source, int i) {
        this.f4782a = i;
        this.f4783b = taskCompletionSource;
        this.f4784c = taskCompletionSource2;
        this.f4785d = source;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        int i = this.f4782a;
        Source source = this.f4785d;
        TaskCompletionSource taskCompletionSource = this.f4784c;
        TaskCompletionSource taskCompletionSource2 = this.f4783b;
        switch (i) {
            case 0:
                DocumentReference.lambda$getViaSnapshotListener$5(taskCompletionSource2, taskCompletionSource, source, (DocumentSnapshot) obj, firebaseFirestoreException);
                break;
            default:
                Query.lambda$getViaSnapshotListener$2(taskCompletionSource2, taskCompletionSource, source, (QuerySnapshot) obj, firebaseFirestoreException);
                break;
        }
    }
}
