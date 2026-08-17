package p000;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Transaction;
import com.google.firebase.firestore.TransactionOptions;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ga0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4118b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4119c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f4120d;

    public /* synthetic */ ga0(Object obj, Object obj2, Object obj3, int i) {
        this.f4117a = i;
        this.f4118b = obj;
        this.f4119c = obj2;
        this.f4120d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f4117a;
        Object obj = this.f4120d;
        Object obj2 = this.f4119c;
        Object obj3 = this.f4118b;
        switch (i) {
            case 0:
                return ((FirebaseFirestore) obj3).lambda$runTransaction$1((Transaction.Function) obj2, (com.google.firebase.firestore.core.Transaction) obj);
            default:
                return ((FirestoreClient) obj3).lambda$transaction$13((TransactionOptions) obj2, (Function) obj);
        }
    }
}
