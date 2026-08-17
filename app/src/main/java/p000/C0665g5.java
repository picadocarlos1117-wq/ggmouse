package p000;

import android.database.Cursor;
import com.google.firebase.firestore.AggregateQuery;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.WriteBatch;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.local.SQLiteDocumentOverlayCache;
import com.google.firebase.firestore.util.Function;
import java.util.ArrayList;

/* JADX INFO: renamed from: g5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0665g5 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4062b;

    public /* synthetic */ C0665g5(Object obj, int i) {
        this.f4061a = i;
        this.f4062b = obj;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        int i = this.f4061a;
        Object obj2 = this.f4062b;
        switch (i) {
            case 0:
                return ((AggregateQuery) obj2).lambda$get$0((FirestoreClient) obj);
            case 1:
                return ((DocumentReference) obj2).lambda$get$3((FirestoreClient) obj);
            case 2:
                return FirebaseFirestore.lambda$getNamedQuery$7((String) obj2, (FirestoreClient) obj);
            case 3:
                return FirebaseFirestore.lambda$setIndexConfiguration$0((ArrayList) obj2, (FirestoreClient) obj);
            case 4:
                return ((Query) obj2).lambda$get$0((FirestoreClient) obj);
            case 5:
                return ((SQLiteDocumentOverlayCache) obj2).lambda$getOverlay$0((Cursor) obj);
            default:
                return ((WriteBatch) obj2).lambda$commit$0((FirestoreClient) obj);
        }
    }
}
