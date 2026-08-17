package p000;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirestoreClient f8820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8821c;

    public /* synthetic */ pa0(FirestoreClient firestoreClient, Object obj, int i) {
        this.f8819a = i;
        this.f8820b = firestoreClient;
        this.f8821c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f8819a;
        Object obj = this.f8821c;
        FirestoreClient firestoreClient = this.f8820b;
        switch (i) {
            case 0:
                return firestoreClient.lambda$getDocumentsFromLocalCache$11((Query) obj);
            default:
                return firestoreClient.lambda$getDocumentFromLocalCache$9((DocumentKey) obj);
        }
    }
}
