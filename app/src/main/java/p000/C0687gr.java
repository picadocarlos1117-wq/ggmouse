package p000;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: renamed from: gr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0687gr implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4300b;

    public /* synthetic */ C0687gr(Object obj, int i) {
        this.f4299a = i;
        this.f4300b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.f4299a;
        Object obj = this.f4300b;
        switch (i) {
            case 0:
                return ComponentDiscovery.instantiate((String) obj);
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) obj);
        }
    }
}
