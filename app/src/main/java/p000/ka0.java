package p000;

import android.app.Activity;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.TransactionOptions;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5726c;

    public /* synthetic */ ka0(int i, Object obj, Object obj2) {
        this.f5724a = i;
        this.f5725b = obj;
        this.f5726c = obj2;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        int i = this.f5724a;
        Object obj2 = this.f5726c;
        Object obj3 = this.f5725b;
        switch (i) {
            case 0:
                return FirebaseFirestore.lambda$runTransaction$3((TransactionOptions) obj3, (ja0) obj2, (FirestoreClient) obj);
            default:
                return FirebaseFirestore.lambda$addSnapshotsInSyncListener$11((AsyncEventListener) obj3, (Activity) obj2, (FirestoreClient) obj);
        }
    }
}
