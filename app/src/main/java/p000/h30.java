package p000;

import android.app.Activity;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h30 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventManager.ListenOptions f4442b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AsyncEventListener f4443c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f4444d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4445e;

    public /* synthetic */ h30(Object obj, EventManager.ListenOptions listenOptions, AsyncEventListener asyncEventListener, Activity activity, int i) {
        this.f4441a = i;
        this.f4445e = obj;
        this.f4442b = listenOptions;
        this.f4443c = asyncEventListener;
        this.f4444d = activity;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        int i = this.f4441a;
        Activity activity = this.f4444d;
        AsyncEventListener asyncEventListener = this.f4443c;
        EventManager.ListenOptions listenOptions = this.f4442b;
        Object obj2 = this.f4445e;
        switch (i) {
            case 0:
                return DocumentReference.lambda$addSnapshotListenerInternal$8((Query) obj2, listenOptions, asyncEventListener, activity, (FirestoreClient) obj);
            default:
                return ((com.google.firebase.firestore.Query) obj2).lambda$addSnapshotListenerInternal$5(listenOptions, asyncEventListener, activity, (FirestoreClient) obj);
        }
    }
}
