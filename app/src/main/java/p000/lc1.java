package p000;

import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc1 implements InterfaceC0615et {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6313a;

    public /* synthetic */ lc1(int i) {
        this.f6313a = i;
    }

    @Override // p000.InterfaceC0615et
    public final void accept(Object obj) {
        FirestoreClient firestoreClient = (FirestoreClient) obj;
        switch (this.f6313a) {
            case 0:
                firestoreClient.setIndexAutoCreationEnabled(true);
                break;
            case 1:
                firestoreClient.setIndexAutoCreationEnabled(false);
                break;
            default:
                firestoreClient.deleteAllFieldIndexes();
                break;
        }
    }
}
