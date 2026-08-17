package p000;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.core.ViewSnapshot;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g30 implements EventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventListener f4041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4042c;

    public /* synthetic */ g30(Object obj, EventListener eventListener, int i) {
        this.f4040a = i;
        this.f4042c = obj;
        this.f4041b = eventListener;
    }

    @Override // com.google.firebase.firestore.EventListener
    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        int i = this.f4040a;
        EventListener eventListener = this.f4041b;
        Object obj2 = this.f4042c;
        switch (i) {
            case 0:
                ((DocumentReference) obj2).lambda$addSnapshotListenerInternal$6(eventListener, (ViewSnapshot) obj, firebaseFirestoreException);
                break;
            default:
                ((Query) obj2).lambda$addSnapshotListenerInternal$3(eventListener, (ViewSnapshot) obj, firebaseFirestoreException);
                break;
        }
    }
}
