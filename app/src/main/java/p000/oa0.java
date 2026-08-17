package p000;

import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseInstallations f7711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f7712c;

    public /* synthetic */ oa0(FirebaseInstallations firebaseInstallations, boolean z, int i) {
        this.f7710a = i;
        this.f7711b = firebaseInstallations;
        this.f7712c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7710a;
        boolean z = this.f7712c;
        FirebaseInstallations firebaseInstallations = this.f7711b;
        switch (i) {
            case 0:
                firebaseInstallations.lambda$doRegistrationOrRefresh$3(z);
                break;
            default:
                firebaseInstallations.lambda$getToken$2(z);
                break;
        }
    }
}
