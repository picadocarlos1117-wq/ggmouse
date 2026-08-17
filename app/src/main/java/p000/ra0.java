package p000;

import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirestoreClient f9856b;

    public /* synthetic */ ra0(FirestoreClient firestoreClient, int i) {
        this.f9855a = i;
        this.f9856b = firestoreClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9855a;
        FirestoreClient firestoreClient = this.f9856b;
        switch (i) {
            case 0:
                firestoreClient.lambda$enableNetwork$5();
                break;
            case 1:
                firestoreClient.lambda$terminate$6();
                break;
            case 2:
                firestoreClient.lambda$disableNetwork$4();
                break;
            default:
                firestoreClient.lambda$deleteAllFieldIndexes$23();
                break;
        }
    }
}
