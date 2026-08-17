package p000;

import com.google.firebase.firestore.local.LocalStore;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LocalStore f6524b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f6525c;

    public /* synthetic */ lv0(LocalStore localStore, List list, int i) {
        this.f6523a = i;
        this.f6524b = localStore;
        this.f6525c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6523a;
        List list = this.f6525c;
        LocalStore localStore = this.f6524b;
        switch (i) {
            case 0:
                localStore.lambda$notifyLocalViewChanges$7(list);
                break;
            default:
                localStore.lambda$configureFieldIndexes$15(list);
                break;
        }
    }
}
