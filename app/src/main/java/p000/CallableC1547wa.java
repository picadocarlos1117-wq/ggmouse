package p000;

import com.google.firebase.firestore.remote.GrpcCallProvider;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: wa */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1547wa implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12033b;

    public /* synthetic */ CallableC1547wa(Object obj, int i) {
        this.f12032a = i;
        this.f12033b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f12032a;
        Object obj = this.f12033b;
        switch (i) {
            case 0:
                return AsyncQueue.lambda$enqueue$2((Runnable) obj);
            case 1:
                return ((FirebaseInstallations) obj).deleteFirebaseInstallationId();
            default:
                return ((GrpcCallProvider) obj).lambda$initChannelTask$6();
        }
    }
}
