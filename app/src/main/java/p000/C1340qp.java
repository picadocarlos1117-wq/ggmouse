package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;

/* JADX INFO: renamed from: qp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1340qp implements Continuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9554a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DocumentReference f9555b;

    public /* synthetic */ C1340qp(DocumentReference documentReference, int i) {
        this.f9554a = i;
        this.f9555b = documentReference;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.f9554a;
        DocumentReference documentReference = this.f9555b;
        switch (i) {
            case 0:
                return CollectionReference.lambda$add$0(documentReference, task);
            default:
                return documentReference.lambda$get$4(task);
        }
    }
}
