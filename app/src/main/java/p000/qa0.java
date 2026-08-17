package p000;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirestoreClient f9460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EventListener f9461c;

    public /* synthetic */ qa0(FirestoreClient firestoreClient, EventListener eventListener, int i) {
        this.f9459a = i;
        this.f9460b = firestoreClient;
        this.f9461c = eventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9459a;
        EventListener eventListener = this.f9461c;
        FirestoreClient firestoreClient = this.f9460b;
        switch (i) {
            case 0:
                firestoreClient.lambda$addSnapshotsInSyncListener$18(eventListener);
                break;
            default:
                firestoreClient.lambda$removeSnapshotsInSyncListener$24(eventListener);
                break;
        }
    }
}
