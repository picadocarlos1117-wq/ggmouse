package p000;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f30 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f3597b;

    public /* synthetic */ f30(List list, int i) {
        this.f3596a = i;
        this.f3597b = list;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        int i = this.f3596a;
        List list = this.f3597b;
        FirestoreClient firestoreClient = (FirestoreClient) obj;
        switch (i) {
            case 0:
                return DocumentReference.lambda$delete$2(list, firestoreClient);
            case 1:
                return DocumentReference.lambda$set$0(list, firestoreClient);
            default:
                return DocumentReference.lambda$update$1(list, firestoreClient);
        }
    }
}
