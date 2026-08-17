package p000;

import android.database.Cursor;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.local.SQLiteGlobalsCache;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3302a;

    public /* synthetic */ ea0(int i) {
        this.f3302a = i;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f3302a) {
            case 0:
                return ((FirestoreClient) obj).waitForPendingWrites();
            case 1:
                return ((FirestoreClient) obj).enableNetwork();
            case 2:
                return ((FirestoreClient) obj).disableNetwork();
            case 3:
                return ComponentProvider.defaultFactory((FirebaseFirestoreSettings) obj);
            case 4:
                return FirebaseFirestore.lambda$clearPersistence$4((Executor) obj);
            case 5:
                return SQLiteGlobalsCache.lambda$get$0((Cursor) obj);
            case 6:
                return SQLitePersistence.lambda$getPageCount$1((Cursor) obj);
            default:
                return SQLitePersistence.lambda$getPageSize$0((Cursor) obj);
        }
    }
}
