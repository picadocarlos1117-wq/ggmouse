package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Supplier;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.HttpsCallOptions;
import java.io.Serializable;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na0 implements Continuation, Listener, Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7329a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7330b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7331c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7332d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Serializable f7333e;

    public /* synthetic */ na0(Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.f7329a = i;
        this.f7330b = obj;
        this.f7333e = serializable;
        this.f7331c = obj2;
        this.f7332d = obj3;
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public Object get() {
        return ((LocalStore) this.f7330b).lambda$writeLocally$2((HashSet) this.f7333e, (List) this.f7331c, (Timestamp) this.f7332d);
    }

    @Override // com.google.firebase.firestore.util.Listener
    public void onValue(Object obj) {
        ((FirestoreClient) this.f7330b).lambda$new$2((AtomicBoolean) this.f7333e, (TaskCompletionSource) this.f7331c, (AsyncQueue) this.f7332d, (User) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i = this.f7329a;
        Object obj = this.f7332d;
        Object obj2 = this.f7331c;
        Serializable serializable = this.f7333e;
        FirebaseFunctions firebaseFunctions = (FirebaseFunctions) this.f7330b;
        switch (i) {
            case 0:
                return FirebaseFunctions.call$lambda$1(firebaseFunctions, (String) serializable, obj2, (HttpsCallOptions) obj, task);
            default:
                return FirebaseFunctions.call$lambda$3(firebaseFunctions, (URL) serializable, obj2, (HttpsCallOptions) obj, task);
        }
    }
}
