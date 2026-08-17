package p000;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirestoreClient f10813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ QueryListener f10814c;

    public /* synthetic */ ta0(FirestoreClient firestoreClient, QueryListener queryListener, int i) {
        this.f10812a = i;
        this.f10813b = firestoreClient;
        this.f10814c = queryListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10812a;
        QueryListener queryListener = this.f10814c;
        FirestoreClient firestoreClient = this.f10813b;
        switch (i) {
            case 0:
                firestoreClient.lambda$listen$7(queryListener);
                break;
            default:
                firestoreClient.lambda$stopListening$8(queryListener);
                break;
        }
    }
}
