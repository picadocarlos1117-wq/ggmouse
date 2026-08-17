package p000;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j30 implements ListenerRegistration {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AsyncEventListener f5248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FirestoreClient f5249c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ QueryListener f5250d;

    public /* synthetic */ j30(AsyncEventListener asyncEventListener, FirestoreClient firestoreClient, QueryListener queryListener, int i) {
        this.f5247a = i;
        this.f5248b = asyncEventListener;
        this.f5249c = firestoreClient;
        this.f5250d = queryListener;
    }

    @Override // com.google.firebase.firestore.ListenerRegistration
    public final void remove() {
        int i = this.f5247a;
        QueryListener queryListener = this.f5250d;
        FirestoreClient firestoreClient = this.f5249c;
        AsyncEventListener asyncEventListener = this.f5248b;
        switch (i) {
            case 0:
                DocumentReference.lambda$addSnapshotListenerInternal$7(asyncEventListener, firestoreClient, queryListener);
                break;
            default:
                Query.lambda$addSnapshotListenerInternal$4(asyncEventListener, firestoreClient, queryListener);
                break;
        }
    }
}
