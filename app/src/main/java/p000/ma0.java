package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.HttpsCallOptions;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma0 implements Continuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FirebaseFunctions f6727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ HttpsCallOptions f6728c;

    public /* synthetic */ ma0(FirebaseFunctions firebaseFunctions, HttpsCallOptions httpsCallOptions, int i) {
        this.f6726a = i;
        this.f6727b = firebaseFunctions;
        this.f6728c = httpsCallOptions;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.f6726a;
        HttpsCallOptions httpsCallOptions = this.f6728c;
        FirebaseFunctions firebaseFunctions = this.f6727b;
        switch (i) {
            case 0:
                return FirebaseFunctions.call$lambda$0(firebaseFunctions, httpsCallOptions, task);
            default:
                return FirebaseFunctions.call$lambda$2(firebaseFunctions, httpsCallOptions, task);
        }
    }
}
