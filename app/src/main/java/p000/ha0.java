package p000;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseFirestore f4493b;

    public /* synthetic */ ha0(FirebaseFirestore firebaseFirestore, int i) {
        this.f4492a = i;
        this.f4493b = firebaseFirestore;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        int i = this.f4492a;
        FirebaseFirestore firebaseFirestore = this.f4493b;
        switch (i) {
            case 0:
                return firebaseFirestore.newClient((AsyncQueue) obj);
            default:
                return firebaseFirestore.clearPersistence((Executor) obj);
        }
    }
}
