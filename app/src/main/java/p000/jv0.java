package p000;

import com.google.firebase.firestore.local.LocalStore;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LocalStore f5572b;

    public /* synthetic */ jv0(LocalStore localStore, int i) {
        this.f5571a = i;
        this.f5572b = localStore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5571a;
        LocalStore localStore = this.f5572b;
        switch (i) {
            case 0:
                localStore.lambda$startIndexManager$0();
                break;
            case 1:
                localStore.lambda$startMutationQueue$1();
                break;
            default:
                localStore.lambda$deleteAllFieldIndexes$16();
                break;
        }
    }
}
