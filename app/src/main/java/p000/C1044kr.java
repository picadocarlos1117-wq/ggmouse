package p000;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: kr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1044kr implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5986a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5988c;

    public /* synthetic */ C1044kr(int i, Object obj, Object obj2) {
        this.f5986a = i;
        this.f5987b = obj;
        this.f5988c = obj2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.f5986a;
        Object obj = this.f5988c;
        Object obj2 = this.f5987b;
        switch (i) {
            case 0:
                return ((ComponentRuntime) obj2).lambda$discoverComponents$0((Component) obj);
            case 1:
                return DefaultHeartBeatController.lambda$new$2((Context) obj2, (String) obj);
            default:
                return ((FirebaseApp) obj2).lambda$new$0((Context) obj);
        }
    }
}
