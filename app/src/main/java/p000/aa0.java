package p000;

import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aa0 implements AppCheckTokenListener, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseAppCheckTokenProvider f106a;

    public /* synthetic */ aa0(FirebaseAppCheckTokenProvider firebaseAppCheckTokenProvider) {
        this.f106a = firebaseAppCheckTokenProvider;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        this.f106a.lambda$new$1(provider);
    }

    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
    public void onAppCheckTokenChanged(AppCheckTokenResult appCheckTokenResult) {
        this.f106a.lambda$new$0(appCheckTokenResult);
    }
}
