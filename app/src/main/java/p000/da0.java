package p000;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.functions.FirebaseContextProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da0 implements Deferred.DeferredHandler, SuccessContinuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseContextProvider f2832a;

    public /* synthetic */ da0(FirebaseContextProvider firebaseContextProvider) {
        this.f2832a = firebaseContextProvider;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        FirebaseContextProvider._init_$lambda$1(this.f2832a, provider);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return FirebaseContextProvider.getAppCheckToken$lambda$4(this.f2832a, (AppCheckTokenResult) obj);
    }
}
